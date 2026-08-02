package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.impl.AdapterCameraControl;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.AdapterCameraInternal;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.StreamSharingBuilder;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import com.squareup.cash.api.Aliases;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraUseCaseAdapter implements Camera {
    public final CameraConfig mCameraConfig;
    public final CameraCoordinatorAdapter mCameraCoordinator;
    public final CameraIdentifier mCameraIdentifier;
    public final AdapterCameraInternal mCameraInternal;
    public final UseCaseGroup mCompositionSettings;
    public UseCase mPlaceholderForExtensions;
    public final AdapterCameraInternal mSecondaryCameraInternal;
    public final UseCaseGroup mSecondaryCompositionSettings;
    public StreamSharing mStreamSharing;
    public final Recorder.AnonymousClass1 mStreamSpecsCalculator;
    public final UseCaseConfigFactory mUseCaseConfigFactory;
    public final ArrayList mAppUseCases = new ArrayList();
    public final ArrayList mCameraUseCases = new ArrayList();
    public List mEffects = Collections.EMPTY_LIST;
    public Range mFrameRate = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    public final Object mLock = new Object();
    public boolean mAttached = true;
    public Config mInteropConfig = null;
    public final Recorder.AnonymousClass4 mStreamSharingForceEnabler = new Recorder.AnonymousClass4(9);

    public final class CameraException extends Exception {
    }

    public final class ConfigPair {
        public UseCaseConfig mCameraConfig;
        public UseCaseConfig mExtendedConfig;
    }

    public CameraUseCaseAdapter(CameraInternal cameraInternal, CameraInternal cameraInternal2, AdapterCameraInfo adapterCameraInfo, AdapterCameraInfo adapterCameraInfo2, UseCaseGroup useCaseGroup, UseCaseGroup useCaseGroup2, CameraCoordinatorAdapter cameraCoordinatorAdapter, Recorder.AnonymousClass1 anonymousClass1, UseCaseConfigFactory useCaseConfigFactory) {
        this.mCameraConfig = adapterCameraInfo.mCameraConfig;
        this.mCameraInternal = new AdapterCameraInternal(cameraInternal, adapterCameraInfo);
        if (cameraInternal2 == null || adapterCameraInfo2 == null) {
            this.mSecondaryCameraInternal = null;
        } else {
            this.mSecondaryCameraInternal = new AdapterCameraInternal(cameraInternal2, adapterCameraInfo2);
        }
        this.mCompositionSettings = useCaseGroup;
        this.mSecondaryCompositionSettings = useCaseGroup2;
        this.mCameraCoordinator = cameraCoordinatorAdapter;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
        this.mCameraIdentifier = Aliases.fromAdapterInfos(adapterCameraInfo, adapterCameraInfo2);
        this.mStreamSpecsCalculator = anonymousClass1;
    }

    public static HashMap applyFeatureGroup(LinkedHashSet linkedHashSet, ResolvedFeatureGroup resolvedFeatureGroup) {
        HashMap hashMap = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            hashMap.put(useCase, useCase.mFeatureGroup);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = resolvedFeatureGroup != null ? resolvedFeatureGroup.features : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            useCase.mFeatureGroup = hashSet;
        }
        return hashMap;
    }

    public static Matrix calculateSensorToBufferTransformMatrix(Rect rect, Size size) {
        TransactorKt.checkArgument("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap getConfigs(ArrayList arrayList, UseCaseConfigFactory useCaseConfigFactory, UseCaseConfigFactory useCaseConfigFactory2, Range range) {
        UseCaseConfig defaultConfig;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase instanceof StreamSharing) {
                StreamSharing streamSharing = (StreamSharing) useCase;
                UseCaseConfig defaultConfig2 = new Preview.Builder(0).m102build().getDefaultConfig(false, useCaseConfigFactory);
                if (defaultConfig2 == null) {
                    defaultConfig = null;
                } else {
                    MutableOptionsBundle from = MutableOptionsBundle.from((Config) defaultConfig2);
                    from.removeOption(TargetConfig.OPTION_TARGET_CLASS);
                    defaultConfig = ((StreamSharingBuilder) streamSharing.getUseCaseConfigBuilder(from)).getUseCaseConfig();
                }
            } else {
                defaultConfig = useCase.getDefaultConfig(false, useCaseConfigFactory);
            }
            UseCaseConfig defaultConfig3 = useCase.getDefaultConfig(true, useCaseConfigFactory2);
            MutableOptionsBundle from2 = defaultConfig3 != null ? MutableOptionsBundle.from((Config) defaultConfig3) : MutableOptionsBundle.create();
            from2.insertOption(UseCaseConfig.OPTION_SESSION_TYPE, 0);
            if (!AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(range)) {
                from2.insertOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, Config.OptionPriority.HIGH_PRIORITY_REQUIRED, range);
                from2.insertOption(UseCaseConfig.OPTION_IS_STRICT_FRAME_RATE_REQUIRED, Boolean.TRUE);
            }
            UseCaseConfig useCaseConfig = useCase.getUseCaseConfigBuilder(from2).getUseCaseConfig();
            ConfigPair configPair = new ConfigPair();
            configPair.mExtendedConfig = defaultConfig;
            configPair.mCameraConfig = useCaseConfig;
            hashMap.put(useCase, configPair);
        }
        return hashMap;
    }

    public static void restoreFeatureGroup(HashMap hashMap) {
        HashSet hashSet;
        for (Map.Entry entry : hashMap.entrySet()) {
            UseCase useCase = (UseCase) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                useCase.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            useCase.mFeatureGroup = hashSet;
        }
    }

    public static ArrayList setEffectsOnUseCases(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m(it2);
            }
        }
        return arrayList2;
    }

    public final void addUseCases(Collection collection, ResolvedFeatureGroup resolvedFeatureGroup) {
        StringUtilsKt.d("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (this.mLock) {
            try {
                AdapterCameraInternal adapterCameraInternal = this.mCameraInternal;
                CameraConfig cameraConfig = this.mCameraConfig;
                adapterCameraInternal.setExtendedConfig(cameraConfig);
                AdapterCameraInternal adapterCameraInternal2 = this.mSecondaryCameraInternal;
                if (adapterCameraInternal2 != null) {
                    adapterCameraInternal2.setExtendedConfig(cameraConfig);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.mAppUseCases);
                linkedHashSet.addAll(collection);
                HashMap applyFeatureGroup = applyFeatureGroup(linkedHashSet, resolvedFeatureGroup);
                try {
                    applyCalculatedUseCaseChanges(calculateAndValidateUseCases(linkedHashSet, this.mSecondaryCameraInternal != null));
                } catch (IllegalArgumentException e) {
                    restoreFeatureGroup(applyFeatureGroup);
                    throw new CameraException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void applyCalculatedUseCaseChanges(CalculatedUseCaseInfo calculatedUseCaseInfo) {
        Map map = calculatedUseCaseInfo.primaryStreamSpecResult.streamSpecs;
        ArrayList arrayList = calculatedUseCaseInfo.cameraUseCases;
        synchronized (this.mLock) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    UseCase useCase = (UseCase) it.next();
                    Rect sensorRect = this.mCameraInternal.mAdapterCameraInfo.mCameraInfoInternal.getSensorRect();
                    AutoValue_StreamSpec autoValue_StreamSpec = (AutoValue_StreamSpec) map.get(useCase);
                    autoValue_StreamSpec.getClass();
                    useCase.setSensorToBufferTransformMatrix(calculateSensorToBufferTransformMatrix(sensorRect, autoValue_StreamSpec.resolution));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.mEffects;
        ArrayList arrayList2 = calculatedUseCaseInfo.cameraUseCases;
        LinkedHashSet linkedHashSet = calculatedUseCaseInfo.appUseCases;
        ArrayList effectsOnUseCases = setEffectsOnUseCases(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList effectsOnUseCases2 = setEffectsOnUseCases(arrayList3, effectsOnUseCases);
        if (!effectsOnUseCases2.isEmpty()) {
            StringUtilsKt.w("CameraUseCaseAdapter", "Unused effects: " + effectsOnUseCases2);
        }
        Iterator it2 = calculatedUseCaseInfo.cameraUseCasesToDetach.iterator();
        while (it2.hasNext()) {
            ((UseCase) it2.next()).unbindFromCamera(this.mCameraInternal);
        }
        this.mCameraInternal.detachUseCases(calculatedUseCaseInfo.cameraUseCasesToDetach);
        if (this.mSecondaryCameraInternal != null) {
            Iterator it3 = calculatedUseCaseInfo.cameraUseCasesToDetach.iterator();
            while (it3.hasNext()) {
                UseCase useCase2 = (UseCase) it3.next();
                AdapterCameraInternal adapterCameraInternal = this.mSecondaryCameraInternal;
                Objects.requireNonNull(adapterCameraInternal);
                useCase2.unbindFromCamera(adapterCameraInternal);
            }
            AdapterCameraInternal adapterCameraInternal2 = this.mSecondaryCameraInternal;
            Objects.requireNonNull(adapterCameraInternal2);
            adapterCameraInternal2.detachUseCases(calculatedUseCaseInfo.cameraUseCasesToDetach);
        }
        if (calculatedUseCaseInfo.cameraUseCasesToDetach.isEmpty()) {
            Iterator it4 = calculatedUseCaseInfo.cameraUseCasesToKeep.iterator();
            while (it4.hasNext()) {
                UseCase useCase3 = (UseCase) it4.next();
                Map map2 = calculatedUseCaseInfo.primaryStreamSpecResult.streamSpecs;
                if (map2.containsKey(useCase3)) {
                    AutoValue_StreamSpec autoValue_StreamSpec2 = (AutoValue_StreamSpec) map2.get(useCase3);
                    Objects.requireNonNull(autoValue_StreamSpec2);
                    Config config = autoValue_StreamSpec2.implementationOptions;
                    if (config != null) {
                        SessionConfig sessionConfig = useCase3.mAttachedSessionConfig;
                        OptionsBundle optionsBundle = sessionConfig.mRepeatingCaptureConfig.mImplementationOptions;
                        Objects.requireNonNull(config);
                        if (config.listOptions().size() == sessionConfig.mRepeatingCaptureConfig.mImplementationOptions.listOptions().size()) {
                            for (AutoValue_Config_Option autoValue_Config_Option : config.listOptions()) {
                                if (optionsBundle.mOptions.containsKey(autoValue_Config_Option) && Objects.equals(optionsBundle.retrieveOption(autoValue_Config_Option), config.retrieveOption(autoValue_Config_Option))) {
                                }
                            }
                        }
                        useCase3.mAttachedStreamSpec = useCase3.onSuggestedStreamSpecImplementationOptionsUpdated(config);
                        if (this.mAttached) {
                            this.mCameraInternal.onUseCaseUpdated(useCase3);
                            AdapterCameraInternal adapterCameraInternal3 = this.mSecondaryCameraInternal;
                            if (adapterCameraInternal3 != null) {
                                adapterCameraInternal3.onUseCaseUpdated(useCase3);
                            }
                        }
                    }
                }
            }
        }
        Iterator it5 = calculatedUseCaseInfo.cameraUseCasesToAttach.iterator();
        while (it5.hasNext()) {
            UseCase useCase4 = (UseCase) it5.next();
            ConfigPair configPair = (ConfigPair) calculatedUseCaseInfo.useCaseConfigs.get(useCase4);
            Objects.requireNonNull(configPair);
            AdapterCameraInternal adapterCameraInternal4 = this.mSecondaryCameraInternal;
            AdapterCameraInternal adapterCameraInternal5 = this.mCameraInternal;
            UseCaseConfig useCaseConfig = configPair.mExtendedConfig;
            if (adapterCameraInternal4 != null) {
                useCase4.bindToCamera(adapterCameraInternal5, adapterCameraInternal4, useCaseConfig, configPair.mCameraConfig);
                AutoValue_StreamSpec autoValue_StreamSpec3 = (AutoValue_StreamSpec) calculatedUseCaseInfo.primaryStreamSpecResult.streamSpecs.get(useCase4);
                autoValue_StreamSpec3.getClass();
                StreamSpecQueryResult streamSpecQueryResult = calculatedUseCaseInfo.secondaryStreamSpecResult;
                streamSpecQueryResult.getClass();
                useCase4.updateSuggestedStreamSpec(autoValue_StreamSpec3, (AutoValue_StreamSpec) streamSpecQueryResult.streamSpecs.get(useCase4));
            } else {
                useCase4.bindToCamera(adapterCameraInternal5, null, useCaseConfig, configPair.mCameraConfig);
                AutoValue_StreamSpec autoValue_StreamSpec4 = (AutoValue_StreamSpec) calculatedUseCaseInfo.primaryStreamSpecResult.streamSpecs.get(useCase4);
                autoValue_StreamSpec4.getClass();
                useCase4.updateSuggestedStreamSpec(autoValue_StreamSpec4, null);
            }
        }
        if (this.mAttached) {
            this.mCameraInternal.attachUseCases(calculatedUseCaseInfo.cameraUseCasesToAttach);
            AdapterCameraInternal adapterCameraInternal6 = this.mSecondaryCameraInternal;
            if (adapterCameraInternal6 != null) {
                adapterCameraInternal6.attachUseCases(calculatedUseCaseInfo.cameraUseCasesToAttach);
            }
        }
        Iterator it6 = calculatedUseCaseInfo.cameraUseCasesToAttach.iterator();
        while (it6.hasNext()) {
            ((UseCase) it6.next()).notifyState();
        }
        this.mAppUseCases.clear();
        this.mAppUseCases.addAll(calculatedUseCaseInfo.appUseCases);
        this.mCameraUseCases.clear();
        this.mCameraUseCases.addAll(calculatedUseCaseInfo.cameraUseCases);
        this.mPlaceholderForExtensions = calculatedUseCaseInfo.placeholderForExtensions;
        this.mStreamSharing = calculatedUseCaseInfo.streamSharing;
    }

    public final void attachUseCases() {
        synchronized (this.mLock) {
            try {
                if (!this.mAttached) {
                    if (!this.mCameraUseCases.isEmpty()) {
                        this.mCameraInternal.setExtendedConfig(this.mCameraConfig);
                        AdapterCameraInternal adapterCameraInternal = this.mSecondaryCameraInternal;
                        if (adapterCameraInternal != null) {
                            adapterCameraInternal.setExtendedConfig(this.mCameraConfig);
                        }
                    }
                    this.mCameraInternal.attachUseCases(this.mCameraUseCases);
                    AdapterCameraInternal adapterCameraInternal2 = this.mSecondaryCameraInternal;
                    if (adapterCameraInternal2 != null) {
                        adapterCameraInternal2.attachUseCases(this.mCameraUseCases);
                    }
                    synchronized (this.mLock) {
                        try {
                            Config config = this.mInteropConfig;
                            if (config != null) {
                                this.mCameraInternal.mAdapterCameraControl.addInteropConfig(config);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.mCameraUseCases.iterator();
                    while (it.hasNext()) {
                        ((UseCase) it.next()).notifyState();
                    }
                    this.mAttached = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        throw new java.lang.IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0167, code lost:
    
        return calculateAndValidateUseCases(r25, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
    
        if (r3 != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CalculatedUseCaseInfo calculateAndValidateUseCases(LinkedHashSet linkedHashSet, boolean z) {
        StreamSharing streamSharing;
        boolean z2;
        boolean z3;
        UseCase useCase;
        StreamSpecQueryResult streamSpecQueryResult;
        boolean z4;
        boolean z5;
        boolean z6;
        hasExtension();
        synchronized (this.mLock) {
            try {
                if (!this.mEffects.isEmpty()) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            UseCase useCase2 = (UseCase) it.next();
                            if (useCase2 instanceof ImageCapture) {
                                UseCaseConfig useCaseConfig = useCase2.mCurrentConfig;
                                AutoValue_Config_Option autoValue_Config_Option = ImageCaptureConfig.OPTION_OUTPUT_FORMAT;
                                if (useCaseConfig.containsOption(autoValue_Config_Option)) {
                                    Integer num = (Integer) useCaseConfig.retrieveOption(autoValue_Config_Option);
                                    num.getClass();
                                    if (num.intValue() == 1) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            Iterator it2 = linkedHashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z6 = false;
                                    break;
                                }
                                UseCase useCase3 = (UseCase) it2.next();
                                if (useCase3 instanceof ImageCapture) {
                                    UseCaseConfig useCaseConfig2 = useCase3.mCurrentConfig;
                                    AutoValue_Config_Option autoValue_Config_Option2 = ImageCaptureConfig.OPTION_OUTPUT_FORMAT;
                                    if (useCaseConfig2.containsOption(autoValue_Config_Option2)) {
                                        Integer num2 = (Integer) useCaseConfig2.retrieveOption(autoValue_Config_Option2);
                                        num2.getClass();
                                        if (num2.intValue() == 2) {
                                            z6 = true;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (!z6) {
                            }
                        }
                    }
                }
            } finally {
            }
        }
        if (!z) {
            hasExtension();
            Recorder.AnonymousClass4 anonymousClass4 = this.mStreamSharingForceEnabler;
            String cameraId = this.mCameraInternal.mAdapterCameraInfo.mCameraInfoInternal.getCameraId();
            if (((ImageCaptureFailedForSpecificCombinationQuirk) anonymousClass4.val$audioErrorConsumer) != null) {
                HashSet hashSet = ImageCaptureFailedForSpecificCombinationQuirk.PIXEL_MODELS;
                String str = Build.BRAND;
                if ("oneplus".equalsIgnoreCase(str)) {
                }
            } else if (((PreviewGreenTintQuirk) anonymousClass4.this$0) != null) {
                cameraId.getClass();
                if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && cameraId.equals("0") && linkedHashSet.size() == 2) {
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            if (((UseCase) it3.next()) instanceof Preview) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it4 = linkedHashSet.iterator();
                        while (it4.hasNext()) {
                            UseCase useCase4 = (UseCase) it4.next();
                            if (useCase4.mCurrentConfig.containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase4.mCurrentConfig.getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                    z5 = false;
                    if (z4) {
                    }
                }
            }
        }
        synchronized (this.mLock) {
            try {
                HashSet streamSharingChildren = getStreamSharingChildren(linkedHashSet, z);
                if (streamSharingChildren.size() < 2) {
                    hasExtension();
                } else {
                    StreamSharing streamSharing2 = this.mStreamSharing;
                    if (streamSharing2 == null || !streamSharing2.mVirtualCameraAdapter.mChildren.equals(streamSharingChildren)) {
                        int[] iArr = {1, 2, 4};
                        HashSet hashSet2 = new HashSet();
                        Iterator it5 = streamSharingChildren.iterator();
                        loop8: while (it5.hasNext()) {
                            UseCase useCase5 = (UseCase) it5.next();
                            for (int i = 0; i < 3; i++) {
                                int i2 = iArr[i];
                                Iterator it6 = useCase5.getSupportedEffectTargets().iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        z2 = false;
                                        break;
                                    }
                                    int intValue = ((Integer) it6.next()).intValue();
                                    if ((i2 & intValue) == intValue) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                if (z2) {
                                    if (!hashSet2.contains(Integer.valueOf(i2))) {
                                        hashSet2.add(Integer.valueOf(i2));
                                    }
                                }
                            }
                        }
                        streamSharing = new StreamSharing(this.mCameraInternal, this.mSecondaryCameraInternal, this.mCompositionSettings, this.mSecondaryCompositionSettings, streamSharingChildren, this.mUseCaseConfigFactory);
                    } else {
                        StreamSharing streamSharing3 = this.mStreamSharing;
                        streamSharing3.getClass();
                        HashSet hashSet3 = ((UseCase) streamSharingChildren.iterator().next()).mFeatureGroup;
                        streamSharing3.mFeatureGroup = hashSet3 != null ? new HashSet(hashSet3) : null;
                        streamSharing = this.mStreamSharing;
                        Objects.requireNonNull(streamSharing);
                    }
                }
                streamSharing = null;
                break loop8;
            } finally {
            }
        }
        synchronized (this.mLock) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (streamSharing != null) {
                    arrayList.add(streamSharing);
                    arrayList.removeAll(streamSharing.mVirtualCameraAdapter.mChildren);
                }
                synchronized (this.mLock) {
                    z3 = ((Integer) this.mCameraConfig.retrieveOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 0)).intValue() == 1;
                }
                if (z3) {
                    Iterator it7 = arrayList.iterator();
                    boolean z7 = false;
                    boolean z8 = false;
                    while (it7.hasNext()) {
                        UseCase useCase6 = (UseCase) it7.next();
                        if (!(useCase6 instanceof Preview) && !(useCase6 instanceof StreamSharing)) {
                            if (useCase6 instanceof ImageCapture) {
                                z7 = true;
                            }
                        }
                        z8 = true;
                    }
                    if (!z7 || z8) {
                        Iterator it8 = arrayList.iterator();
                        boolean z9 = false;
                        boolean z10 = false;
                        while (it8.hasNext()) {
                            UseCase useCase7 = (UseCase) it8.next();
                            if (!(useCase7 instanceof Preview) && !(useCase7 instanceof StreamSharing)) {
                                if (useCase7 instanceof ImageCapture) {
                                    z10 = true;
                                }
                            }
                            z9 = true;
                        }
                        if (z9 && !z10) {
                            UseCase useCase8 = this.mPlaceholderForExtensions;
                            if (!(useCase8 instanceof ImageCapture)) {
                                Preview.Builder builder = new Preview.Builder(2);
                                builder.mMutableConfig.insertOption(TargetConfig.OPTION_TARGET_NAME, "ImageCapture-Extra");
                                useCase = builder.m101build();
                            }
                        }
                    } else {
                        UseCase useCase9 = this.mPlaceholderForExtensions;
                        if (!(useCase9 instanceof Preview)) {
                            Preview.Builder builder2 = new Preview.Builder(0);
                            builder2.mMutableConfig.insertOption(TargetConfig.OPTION_TARGET_NAME, "Preview-Extra");
                            Preview m102build = builder2.m102build();
                            m102build.setSurfaceProvider(new ZslControlImpl$$ExternalSyntheticLambda1(21));
                            useCase = m102build;
                        }
                    }
                }
                useCase = null;
            } finally {
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashSet);
        if (useCase != null) {
            arrayList2.add(useCase);
        }
        if (streamSharing != null) {
            arrayList2.add(streamSharing);
            arrayList2.removeAll(streamSharing.mVirtualCameraAdapter.mChildren);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.removeAll(this.mCameraUseCases);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        arrayList4.retainAll(this.mCameraUseCases);
        ArrayList arrayList5 = new ArrayList(this.mCameraUseCases);
        arrayList5.removeAll(arrayList2);
        HashMap configs = getConfigs(arrayList3, (UseCaseConfigFactory) this.mCameraConfig.retrieveOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE), this.mUseCaseConfigFactory, this.mFrameRate);
        List[] listArr = {arrayList3, arrayList4};
        boolean z11 = false;
        for (int i3 = 0; i3 < 2; i3++) {
            Iterator it9 = listArr[i3].iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                if (((UseCase) it9.next()).mFeatureGroup != null) {
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                break;
            }
        }
        boolean z12 = z11;
        try {
            StreamSpecQueryResult calculateSuggestedStreamSpecs = this.mStreamSpecsCalculator.calculateSuggestedStreamSpecs(getCameraMode(), this.mCameraInternal.mAdapterCameraInfo, arrayList3, arrayList4, this.mCameraConfig, this.mFrameRate, z12);
            if (this.mSecondaryCameraInternal != null) {
                Recorder.AnonymousClass1 anonymousClass1 = this.mStreamSpecsCalculator;
                int cameraMode = getCameraMode();
                AdapterCameraInternal adapterCameraInternal = this.mSecondaryCameraInternal;
                Objects.requireNonNull(adapterCameraInternal);
                streamSpecQueryResult = anonymousClass1.calculateSuggestedStreamSpecs(cameraMode, adapterCameraInternal.mAdapterCameraInfo, arrayList3, arrayList4, this.mCameraConfig, this.mFrameRate, z12);
            } else {
                streamSpecQueryResult = null;
            }
            return new CalculatedUseCaseInfo(linkedHashSet, arrayList2, arrayList3, arrayList4, arrayList5, streamSharing, useCase, configs, calculateSuggestedStreamSpecs, streamSpecQueryResult);
        } catch (IllegalArgumentException e) {
            if (!z) {
                hasExtension();
                if (this.mSecondaryCameraInternal == null) {
                    return calculateAndValidateUseCases(linkedHashSet, true);
                }
            }
            throw e;
        }
    }

    public final void detachUseCases() {
        synchronized (this.mLock) {
            try {
                if (this.mAttached) {
                    this.mCameraInternal.detachUseCases(new ArrayList(this.mCameraUseCases));
                    AdapterCameraInternal adapterCameraInternal = this.mSecondaryCameraInternal;
                    if (adapterCameraInternal != null) {
                        adapterCameraInternal.detachUseCases(new ArrayList(this.mCameraUseCases));
                    }
                    synchronized (this.mLock) {
                        AdapterCameraControl adapterCameraControl = this.mCameraInternal.mAdapterCameraControl;
                        this.mInteropConfig = adapterCameraControl.mCameraControlInternal.getInteropConfig();
                        adapterCameraControl.clearInteropConfig();
                    }
                    this.mAttached = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public final CameraControlInternal getCameraControl() {
        return this.mCameraInternal.mAdapterCameraControl;
    }

    @Override // androidx.camera.core.Camera
    public final CameraInfo getCameraInfo() {
        return this.mCameraInternal.mAdapterCameraInfo;
    }

    public final int getCameraMode() {
        int i;
        synchronized (this.mLock) {
            try {
                CameraCoordinatorAdapter cameraCoordinatorAdapter = this.mCameraCoordinator;
                synchronized (cameraCoordinatorAdapter.lock) {
                    i = cameraCoordinatorAdapter.concurrentMode;
                }
                return i == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet getStreamSharingChildren(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.mLock) {
            Iterator it = this.mEffects.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            UseCase useCase = (UseCase) it2.next();
            TransactorKt.checkArgument("Only support one level of sharing for now.", !(useCase instanceof StreamSharing));
            Iterator it3 = useCase.getSupportedEffectTargets().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((i & intValue) == intValue) {
                        hashSet.add(useCase);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List getUseCases() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mAppUseCases);
        }
        return arrayList;
    }

    public final void hasExtension() {
        synchronized (this.mLock) {
            this.mCameraConfig.getSessionProcessor();
        }
    }

    public final void removeUseCases(ArrayList arrayList) {
        synchronized (this.mLock) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((UseCase) it.next()).mFeatureGroup = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.mAppUseCases);
            linkedHashSet.removeAll(arrayList);
            applyCalculatedUseCaseChanges(calculateAndValidateUseCases(linkedHashSet, this.mSecondaryCameraInternal != null));
        }
    }
}
