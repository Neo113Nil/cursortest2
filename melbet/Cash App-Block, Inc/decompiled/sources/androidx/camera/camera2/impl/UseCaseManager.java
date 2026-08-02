package androidx.camera.camera2.impl;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraAppComponentImpl;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraComponentImpl;
import androidx.camera.camera2.config.UseCaseCameraConfig;
import androidx.camera.camera2.impl.MeteringRepeating;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipeImpl;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.StreamSharingConfig;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.ThumbNode$onAttach$1;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.zipline.loader.ZiplineLoader;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaad;
import dagger.internal.DelegateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class UseCaseManager {
    public volatile ZiplineLoader _activeComponent;
    public boolean activeResumeEnabled;
    public final LinkedHashSet activeUseCases;
    public final LinkedHashSet allControls;
    public final LinkedHashSet attachedUseCases;
    public final Recorder.AnonymousClass1 builder;
    public final CameraCoordinatorAdapter cameraCoordinator;
    public final CameraGraphConfigProvider cameraGraphConfigProvider;
    public final Provider cameraInfoInternal;
    public final Provider cameraInternal;
    public final CameraPipeImpl cameraPipe;
    public final CameraStateAdapter cameraStateAdapter;
    public final CameraXConfig cameraXConfig;
    public final ArrayList closingCameraJobs;
    public final ObjectList$$ExternalSyntheticLambda0 defaultCameraGraphFactory;
    public final VideoCapture.AnonymousClass3 dynamicRangeResolver;
    public boolean isPrimary;
    public final Object lock;
    public final LowLightBoostControl lowLightBoostControl;
    public final MeteringRepeating meteringRepeating;
    public final LinkedHashSet pendingUseCasesToNotifyCameraControlReady;
    public boolean shouldCreateCameraGraphImmediately;
    public final SupportedSurfaceCombination supportedSurfaceCombination;
    public final ZslControl zslControl;

    public interface RunningUseCasesChangeListener {
        void onRunningUseCasesChanged(LinkedHashSet linkedHashSet);
    }

    public UseCaseManager(CameraPipeImpl cameraPipeImpl, CameraCoordinatorAdapter cameraCoordinatorAdapter, Recorder.AnonymousClass1 anonymousClass1, ZslControl zslControl, LowLightBoostControl lowLightBoostControl, Set set, Camera2CameraControl camera2CameraControl, CameraStateAdapter cameraStateAdapter, DelegateFactory delegateFactory, Provider provider, Provider provider2, EncoderProfilesProvider encoderProfilesProvider, CameraPipeCameraProperties cameraPipeCameraProperties, CameraXConfig cameraXConfig, CameraGraphConfigProvider cameraGraphConfigProvider, Context context, DisplayInfoManager displayInfoManager) {
        cameraCoordinatorAdapter.getClass();
        zslControl.getClass();
        lowLightBoostControl.getClass();
        set.getClass();
        camera2CameraControl.getClass();
        cameraStateAdapter.getClass();
        delegateFactory.getClass();
        provider.getClass();
        provider2.getClass();
        encoderProfilesProvider.getClass();
        cameraPipeCameraProperties.getClass();
        cameraGraphConfigProvider.getClass();
        context.getClass();
        this.cameraPipe = cameraPipeImpl;
        this.cameraCoordinator = cameraCoordinatorAdapter;
        this.builder = anonymousClass1;
        this.zslControl = zslControl;
        this.lowLightBoostControl = lowLightBoostControl;
        this.cameraStateAdapter = cameraStateAdapter;
        this.cameraInternal = delegateFactory;
        this.cameraInfoInternal = provider2;
        this.cameraXConfig = cameraXConfig;
        this.cameraGraphConfigProvider = cameraGraphConfigProvider;
        this.lock = new Object();
        this.attachedUseCases = new LinkedHashSet();
        this.activeUseCases = new LinkedHashSet();
        this.shouldCreateCameraGraphImmediately = true;
        this.isPrimary = true;
        this.pendingUseCasesToNotifyCameraControlReady = new LinkedHashSet();
        this.meteringRepeating = new MeteringRepeating(cameraPipeCameraProperties, new MeteringRepeating.MeteringRepeatingConfig(), displayInfoManager);
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        this.supportedSurfaceCombination = new SupportedSurfaceCombination(context, cameraMetadata, encoderProfilesProvider, FeatureCombinationQuery.NO_OP_FEATURE_COMBINATION_QUERY);
        this.dynamicRangeResolver = new VideoCapture.AnonymousClass3(cameraMetadata);
        this.defaultCameraGraphFactory = new ObjectList$$ExternalSyntheticLambda0(this, 3);
        this.closingCameraJobs = new ArrayList();
        LinkedHashSet mutableSet = CollectionsKt.toMutableSet(set);
        mutableSet.add(camera2CameraControl);
        this.allControls = mutableSet;
    }

    public final void activate(UseCase useCase) {
        useCase.getClass();
        synchronized (this.lock) {
            if (this.activeUseCases.add(useCase)) {
                refreshRunningUseCases();
            }
        }
    }

    public final boolean addOrRemoveRepeatingUseCase(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.cameraXConfig.mConfig.retrieveOption(CameraXConfig.OPTION_REPEATING_STREAM_FORCED, Boolean.TRUE)).booleanValue() && !this.attachedUseCases.contains(this.meteringRepeating) && isMeteringRepeatingRequired(linkedHashSet)) {
            addRepeatingUseCase();
            return true;
        }
        if (!linkedHashSet.contains(this.meteringRepeating) || isMeteringRepeatingRequired(linkedHashSet)) {
            return false;
        }
        MeteringRepeating meteringRepeating = this.meteringRepeating;
        meteringRepeating.getClass();
        synchronized (this.lock) {
            if (this.activeUseCases.remove(meteringRepeating)) {
                refreshRunningUseCases();
            }
        }
        detach(CollectionsKt__CollectionsJVMKt.listOf(meteringRepeating));
        meteringRepeating.unbindFromCamera((CameraInternal) this.cameraInternal.get());
        return true;
    }

    public final void addRepeatingUseCase() {
        CameraInternal cameraInternal = (CameraInternal) this.cameraInternal.get();
        MeteringRepeating meteringRepeating = this.meteringRepeating;
        meteringRepeating.bindToCamera(cameraInternal, null, null, null);
        meteringRepeating.updateSuggestedStreamSpec(AutoValue_StreamSpec.builder(MeteringRepeatingKt.DEFAULT_PREVIEW_SIZE).build(), null);
        attach(CollectionsKt__CollectionsJVMKt.listOf(meteringRepeating));
        activate(meteringRepeating);
    }

    public final void attach(List list) {
        list.getClass();
        synchronized (this.lock) {
            if (list.isEmpty()) {
                if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                    Log.w("CXCP", "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "Attaching " + list + " from " + this);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.attachedUseCases.contains((UseCase) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((UseCase) it.next()).onSessionStart();
            }
            if (this.attachedUseCases.addAll(list) && !addOrRemoveRepeatingUseCase(CollectionsKt.intersect(this.attachedUseCases, this.activeUseCases))) {
                updateZslDisabledByUseCaseConfigStatus();
                this.lowLightBoostControl.onSessionConfigChanged(CollectionsKt.toList(this.attachedUseCases));
                refreshAttachedUseCases(this.attachedUseCases);
            }
            if (this.shouldCreateCameraGraphImmediately) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((UseCase) it2.next()).onCameraControlReady();
                }
            } else {
                this.pendingUseCasesToNotifyCameraControlReady.addAll(arrayList);
            }
        }
    }

    public final Object close(SuspendLambda suspendLambda) {
        List list;
        synchronized (this.lock) {
            closeCurrentUseCases();
            this.meteringRepeating.onUnbind();
            list = CollectionsKt.toList(this.closingCameraJobs);
        }
        Object joinAll = AwaitKt.joinAll(list, suspendLambda);
        return joinAll == CoroutineSingletons.COROUTINE_SUSPENDED ? joinAll : Unit.INSTANCE;
    }

    public final void closeCurrentUseCases() {
        Job CompletableDeferred;
        UseCaseCameraImpl camera = getCamera();
        this._activeComponent = null;
        CameraCoordinatorAdapter cameraCoordinatorAdapter = this.cameraCoordinator;
        CameraInfo cameraInfo = (CameraInfo) this.cameraInfoInternal.get();
        cameraCoordinatorAdapter.getClass();
        cameraInfo.getClass();
        synchronized (cameraCoordinatorAdapter.lock) {
            try {
                if (cameraCoordinatorAdapter.concurrentModeOn) {
                    ArrayList arrayList = cameraCoordinatorAdapter.pendingCameraIds;
                    CameraMetadata cameraMetadata = (CameraMetadata) zzaad.unwrapAs(cameraInfo, Reflection.factory.getOrCreateKotlinClass(CameraMetadata.class));
                    String str = cameraMetadata != null ? ((Camera2CameraMetadata) cameraMetadata).camera : null;
                    CameraId cameraId = str != null ? new CameraId(str) : null;
                    if (cameraId == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList.remove(cameraId.value);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (camera != null) {
            if (camera.closed.compareAndSet()) {
                camera.requestControl.close();
                CompletableDeferred = JobKt.launch$default(camera.threads.sequentialScope, null, null, new ThumbNode$onAttach$1(null, camera), 3);
            } else {
                CompletableDeferred = JobKt.CompletableDeferred(Unit.INSTANCE);
            }
            this.closingCameraJobs.add(CompletableDeferred);
            CompletableDeferred.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(6, this, CompletableDeferred));
        }
        synchronized (this.lock) {
        }
    }

    public final void detach(List list) {
        list.getClass();
        synchronized (this.lock) {
            if (list.isEmpty()) {
                if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                    Log.w("CXCP", "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "Detaching " + list + " from " + this);
            }
            this.activeUseCases.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                if (this.attachedUseCases.contains(useCase)) {
                    useCase.onSessionStop();
                }
            }
            if (this.attachedUseCases.removeAll(list)) {
                if (addOrRemoveRepeatingUseCase(CollectionsKt.intersect(this.attachedUseCases, this.activeUseCases))) {
                    return;
                }
                if (this.attachedUseCases.isEmpty()) {
                    this.zslControl.setZslDisabledByUserCaseConfig(false);
                    this.lowLightBoostControl.onSessionConfigChanged(EmptyList.INSTANCE);
                } else {
                    updateZslDisabledByUseCaseConfigStatus();
                    this.lowLightBoostControl.onSessionConfigChanged(CollectionsKt.toList(this.attachedUseCases));
                }
                refreshAttachedUseCases(this.attachedUseCases);
            }
            this.pendingUseCasesToNotifyCameraControlReady.removeAll(list);
        }
    }

    public final UseCaseCameraImpl getCamera() {
        ZiplineLoader ziplineLoader = this._activeComponent;
        if (ziplineLoader != null) {
            return (UseCaseCameraImpl) ((dagger.internal.Provider) ziplineLoader.moduleFetchers).get();
        }
        return null;
    }

    public final int getCameraMode() {
        int i;
        synchronized (this.lock) {
            CameraCoordinatorAdapter cameraCoordinatorAdapter = this.cameraCoordinator;
            synchronized (cameraCoordinatorAdapter.lock) {
                i = cameraCoordinatorAdapter.concurrentMode;
            }
            return i == 2 ? 1 : 0;
        }
    }

    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r21v3 */
    public final boolean isMeteringRepeatingRequired(LinkedHashSet linkedHashSet) {
        boolean z;
        SupportedSurfaceCombination supportedSurfaceCombination;
        boolean z2;
        ?? r21;
        int i;
        boolean checkSupported$default;
        UseCaseConfig useCaseConfig;
        List listOf;
        if (((Boolean) this.cameraXConfig.mConfig.retrieveOption(CameraXConfig.OPTION_REPEATING_STREAM_FORCED, Boolean.TRUE)).booleanValue() && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UseCase useCase = (UseCase) it.next();
                MeteringRepeating meteringRepeating = this.meteringRepeating;
                if (!Intrinsics.areEqual(useCase, meteringRepeating)) {
                    List surfaces = useCase.mAttachedSessionConfig.getSurfaces();
                    surfaces.getClass();
                    if (!surfaces.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : this.attachedUseCases) {
                            if (!Intrinsics.areEqual((UseCase) obj, meteringRepeating)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                            SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                validatingBuilder.add(((UseCase) it2.next()).mAttachedSessionConfig);
                            }
                            SessionConfig build = validatingBuilder.build();
                            List unmodifiableList = Collections.unmodifiableList(build.mRepeatingCaptureConfig.mSurfaces);
                            unmodifiableList.getClass();
                            List surfaces2 = build.getSurfaces();
                            surfaces2.getClass();
                            if (!surfaces2.isEmpty()) {
                                List list = surfaces2;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (!Intrinsics.areEqual(((DeferrableSurface) it3.next()).mContainerClass, MediaCodec.class)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                                z = true;
                                boolean isEmpty = unmodifiableList.isEmpty();
                                if (z || isEmpty) {
                                    if (meteringRepeating.getAttachedSurfaceResolution() == null) {
                                        meteringRepeating.updateSuggestedStreamSpec(AutoValue_StreamSpec.builder(MeteringRepeatingKt.DEFAULT_PREVIEW_SIZE).build(), null);
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it4 = arrayList.iterator();
                                    while (true) {
                                        boolean hasNext = it4.hasNext();
                                        supportedSurfaceCombination = this.supportedSurfaceCombination;
                                        if (!hasNext) {
                                            z2 = true;
                                            r21 = 0;
                                            break;
                                        }
                                        UseCase useCase2 = (UseCase) it4.next();
                                        Size attachedSurfaceResolution = useCase2.getAttachedSurfaceResolution();
                                        AutoValue_StreamSpec autoValue_StreamSpec = useCase2.mAttachedStreamSpec;
                                        if (attachedSurfaceResolution == null || autoValue_StreamSpec == null) {
                                            break;
                                        }
                                        SurfaceConfig transformSurfaceConfig = supportedSurfaceCombination.transformSurfaceConfig(getCameraMode(), useCase2.mCurrentConfig.getInputFormat(), attachedSurfaceResolution, useCase2.mCurrentConfig.getStreamUseCase());
                                        int inputFormat = useCase2.mCurrentConfig.getInputFormat();
                                        DynamicRange dynamicRange = autoValue_StreamSpec.dynamicRange;
                                        if (useCase2 instanceof StreamSharing) {
                                            UseCaseConfig useCaseConfig2 = ((StreamSharing) useCase2).mCurrentConfig;
                                            useCaseConfig2.getClass();
                                            listOf = (List) ((StreamSharingConfig) useCaseConfig2).retrieveOption(StreamSharingConfig.OPTION_CAPTURE_TYPES);
                                            listOf.getClass();
                                        } else {
                                            listOf = CollectionsKt__CollectionsJVMKt.listOf(useCase2.mCurrentConfig.getCaptureType());
                                        }
                                        List list2 = listOf;
                                        Config config = autoValue_StreamSpec.implementationOptions;
                                        if (config == null) {
                                            config = MutableOptionsBundle.create();
                                        }
                                        Config config2 = config;
                                        int i2 = autoValue_StreamSpec.sessionType;
                                        Range range = autoValue_StreamSpec.expectedFrameRateRange;
                                        Boolean bool = (Boolean) useCase2.mCurrentConfig.retrieveOption(UseCaseConfig.OPTION_IS_STRICT_FRAME_RATE_REQUIRED, Boolean.FALSE);
                                        Objects.requireNonNull(bool);
                                        arrayList2.add(new AutoValue_AttachedSurfaceInfo(transformSurfaceConfig, inputFormat, attachedSurfaceResolution, dynamicRange, list2, config2, i2, range, bool.booleanValue(), useCase2.mCurrentConfig.getCustomMaxFrameRate(attachedSurfaceResolution)));
                                    }
                                    z2 = true;
                                    r21 = 0;
                                    if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                                        Log.w("CXCP", "Invalid surface resolution or stream spec is found.");
                                    }
                                    arrayList2.clear();
                                    if (arrayList2.isEmpty()) {
                                        checkSupported$default = r21;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it5 = arrayList.iterator();
                                        while (it5.hasNext()) {
                                            UseCase useCase3 = (UseCase) it5.next();
                                            List<DeferrableSurface> surfaces3 = useCase3.mAttachedSessionConfig.getSurfaces();
                                            surfaces3.getClass();
                                            for (DeferrableSurface deferrableSurface : surfaces3) {
                                                int cameraMode = getCameraMode();
                                                int inputFormat2 = useCase3.mCurrentConfig.getInputFormat();
                                                Size size = deferrableSurface.mPrescribedSize;
                                                size.getClass();
                                                arrayList3.add(supportedSurfaceCombination.transformSurfaceConfig(cameraMode, inputFormat2, size, useCase3.mCurrentConfig.getStreamUseCase()));
                                            }
                                        }
                                        int cameraMode2 = getCameraMode();
                                        Iterator it6 = this.dynamicRangeResolver.resolveAndValidateDynamicRanges(arrayList2, CollectionsKt__CollectionsJVMKt.listOf(meteringRepeating.mCurrentConfig), CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf((int) r21))).entrySet().iterator();
                                        while (true) {
                                            if (!it6.hasNext()) {
                                                i = 8;
                                                break;
                                            }
                                            if (((DynamicRange) ((Map.Entry) it6.next()).getValue()).mBitDepth == 10) {
                                                i = 10;
                                                break;
                                            }
                                        }
                                        boolean containsVideoCapture = UseCaseUtil.containsVideoCapture(arrayList);
                                        VideoStabilization videoStabilization = UseCaseUtil.getVideoStabilization(arrayList, new BorderKt$$ExternalSyntheticLambda1(10));
                                        ArrayList arrayList4 = new ArrayList();
                                        Iterator it7 = arrayList.iterator();
                                        while (it7.hasNext()) {
                                            Object next = it7.next();
                                            if (next instanceof ImageCapture) {
                                                arrayList4.add(next);
                                            }
                                        }
                                        ImageCapture imageCapture = (ImageCapture) CollectionsKt.firstOrNull((List) arrayList4);
                                        boolean z3 = (imageCapture == null || (useCaseConfig = imageCapture.mCurrentConfig) == null || useCaseConfig.getInputFormat() != 4101) ? r21 : z2;
                                        Range range2 = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                                        range2.getClass();
                                        SupportedSurfaceCombination.FeatureSettings featureSettings = new SupportedSurfaceCombination.FeatureSettings(cameraMode2, i, containsVideoCapture, videoStabilization, z3, false, false, false, range2, false);
                                        ArrayList arrayList5 = new ArrayList();
                                        arrayList5.addAll(arrayList3);
                                        int cameraMode3 = getCameraMode();
                                        int inputFormat3 = meteringRepeating.mCurrentConfig.getInputFormat();
                                        Size attachedSurfaceResolution2 = meteringRepeating.getAttachedSurfaceResolution();
                                        attachedSurfaceResolution2.getClass();
                                        arrayList5.add(supportedSurfaceCombination.transformSurfaceConfig(cameraMode3, inputFormat3, attachedSurfaceResolution2, meteringRepeating.mCurrentConfig.getStreamUseCase()));
                                        checkSupported$default = SupportedSurfaceCombination.checkSupported$default(supportedSurfaceCombination, featureSettings, arrayList5);
                                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                            Log.d("CXCP", "Combination of " + arrayList3 + " + " + meteringRepeating + " is supported: " + checkSupported$default);
                                        }
                                    }
                                    return checkSupported$default ? z2 : r21;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshAttachedUseCases(LinkedHashSet linkedHashSet) {
        closeCurrentUseCases();
        List list = CollectionsKt.toList(linkedHashSet);
        Object[] objArr = 0;
        if (list.isEmpty()) {
            for (UseCaseCameraControl useCaseCameraControl : this.allControls) {
                useCaseCameraControl.setRequestControl(null);
                useCaseCameraControl.reset();
            }
            return;
        }
        if (!this.shouldCreateCameraGraphImmediately) {
            Iterator it = this.allControls.iterator();
            while (it.hasNext()) {
                ((UseCaseCameraControl) it.next()).setRequestControl(null);
            }
        }
        GraphStateToCameraStateAdapter graphStateToCameraStateAdapter = new GraphStateToCameraStateAdapter(this.cameraStateAdapter);
        synchronized (this.lock) {
        }
        SessionConfigAdapter sessionConfigAdapter = new SessionConfigAdapter(list, this.isPrimary);
        CameraGraphConfigProvider cameraGraphConfigProvider = this.cameraGraphConfigProvider;
        ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda0 = this.defaultCameraGraphFactory;
        synchronized (this.lock) {
        }
        cameraGraphConfigProvider.getClass();
        objectList$$ExternalSyntheticLambda0.getClass();
        UseCaseCameraConfig useCaseCameraConfig = new UseCaseCameraConfig(objectList$$ExternalSyntheticLambda0, graphStateToCameraStateAdapter, sessionConfigAdapter, LazyKt.lazy(new n$$ExternalSyntheticLambda1(1, sessionConfigAdapter, cameraGraphConfigProvider, graphStateToCameraStateAdapter)));
        if (!this.shouldCreateCameraGraphImmediately) {
            CameraCoordinatorAdapter cameraCoordinatorAdapter = this.cameraCoordinator;
            CameraInfo cameraInfo = (CameraInfo) this.cameraInfoInternal.get();
            cameraCoordinatorAdapter.getClass();
            cameraInfo.getClass();
            synchronized (cameraCoordinatorAdapter.lock) {
                try {
                    if (cameraCoordinatorAdapter.concurrentModeOn) {
                        ArrayList arrayList = cameraCoordinatorAdapter.pendingCameraIds;
                        CameraMetadata cameraMetadata = (CameraMetadata) zzaad.unwrapAs(cameraInfo, Reflection.factory.getOrCreateKotlinClass(CameraMetadata.class));
                        String str = cameraMetadata != null ? ((Camera2CameraMetadata) cameraMetadata).camera : null;
                        CameraId cameraId = str != null ? new CameraId(str) : null;
                        if (cameraId == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(cameraId.value);
                        synchronized (cameraCoordinatorAdapter.lock) {
                            cameraCoordinatorAdapter.activeConcurrentCameraInfosList.getClass();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        Recorder.AnonymousClass1 anonymousClass1 = this.builder;
        this._activeComponent = new ZiplineLoader((DaggerCameraAppComponent$CameraAppComponentImpl) anonymousClass1.val$videoEncoderSession, (DaggerCameraAppComponent$CameraComponentImpl) anonymousClass1.this$0, useCaseCameraConfig);
        UseCaseCameraImpl camera = getCamera();
        if (camera == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        JobKt.launch$default(camera.threads.sequentialScope, null, null, new DiskLruCache$launchCleanup$1((Continuation) (objArr == true ? 1 : 0), (Object) camera, 4), 3);
        Iterator it2 = this.allControls.iterator();
        while (it2.hasNext()) {
            ((UseCaseCameraControl) it2.next()).setRequestControl(camera.requestControl);
        }
        JobKt.launch$default(camera.threads.sequentialScope, null, null, new RealBadger2$scheduleBadgeClearingWork$3((Continuation) null, camera, this.activeResumeEnabled), 3);
        updateRunningUseCases(CollectionsKt.intersect(this.attachedUseCases, this.activeUseCases));
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Notifying " + this.pendingUseCasesToNotifyCameraControlReady + " camera control ready");
        }
        Iterator it3 = this.pendingUseCasesToNotifyCameraControlReady.iterator();
        while (it3.hasNext()) {
            ((UseCase) it3.next()).onCameraControlReady();
        }
        this.pendingUseCasesToNotifyCameraControlReady.clear();
    }

    public final void refreshRunningUseCases() {
        if (this.attachedUseCases.isEmpty()) {
            return;
        }
        LinkedHashSet intersect = CollectionsKt.intersect(this.attachedUseCases, this.activeUseCases);
        if (((Boolean) this.cameraXConfig.mConfig.retrieveOption(CameraXConfig.OPTION_REPEATING_STREAM_FORCED, Boolean.TRUE)).booleanValue() && !this.attachedUseCases.contains(this.meteringRepeating) && isMeteringRepeatingRequired(intersect)) {
            addRepeatingUseCase();
            return;
        }
        if (!intersect.contains(this.meteringRepeating) || isMeteringRepeatingRequired(intersect)) {
            updateRunningUseCases(intersect);
            return;
        }
        MeteringRepeating meteringRepeating = this.meteringRepeating;
        meteringRepeating.getClass();
        synchronized (this.lock) {
            if (this.activeUseCases.remove(meteringRepeating)) {
                refreshRunningUseCases();
            }
        }
        detach(CollectionsKt__CollectionsJVMKt.listOf(meteringRepeating));
        meteringRepeating.unbindFromCamera((CameraInternal) this.cameraInternal.get());
    }

    public final String toString() {
        return "UseCaseManager<" + this.cameraGraphConfigProvider + '>';
    }

    public final void updateRunningUseCases(LinkedHashSet linkedHashSet) {
        UseCaseCameraImpl camera = getCamera();
        if (camera != null) {
            camera.requestControl.updateRepeatingRequestAsync(linkedHashSet, this.isPrimary);
            for (UseCaseCameraControl useCaseCameraControl : this.allControls) {
                if (useCaseCameraControl instanceof RunningUseCasesChangeListener) {
                    ((RunningUseCasesChangeListener) useCaseCameraControl).onRunningUseCasesChanged(linkedHashSet);
                }
            }
        }
    }

    public final void updateZslDisabledByUseCaseConfigStatus() {
        boolean z = false;
        LinkedHashSet linkedHashSet = this.attachedUseCases;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Boolean) ((UseCase) it.next()).mCurrentConfig.retrieveOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.FALSE)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        this.zslControl.setZslDisabledByUserCaseConfig(z);
    }
}
