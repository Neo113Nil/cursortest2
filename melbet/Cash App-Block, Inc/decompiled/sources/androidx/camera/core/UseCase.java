package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.Preview;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.feature.DynamicRangeFeature;
import androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature;
import androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class UseCase {
    public SessionConfig mAttachedSecondarySessionConfig;
    public SessionConfig mAttachedSessionConfig;
    public AutoValue_StreamSpec mAttachedStreamSpec;
    public CameraInternal mCamera;
    public UseCaseConfig mCameraConfig;
    public UseCaseConfig mCurrentConfig;
    public UseCaseConfig mExtendedConfig;
    public HashSet mFeatureGroup;
    public CameraInternal mSecondaryCamera;
    public UseCaseConfig mUseCaseConfig;
    public Rect mViewPortCropRect;
    public boolean mInSession = false;
    public final HashSet mStateChangeCallbacks = new HashSet();
    public final Object mCameraLock = new Object();
    public final Object mRotationProviderLock = new Object();
    public int mState = 2;
    public Matrix mSensorToBufferTransformMatrix = new Matrix();

    public interface StateChangeCallback {
        void onUseCaseActive(UseCase useCase);

        void onUseCaseInactive(UseCase useCase);

        void onUseCaseReset(UseCase useCase);

        void onUseCaseUpdated(UseCase useCase);
    }

    public UseCase(UseCaseConfig useCaseConfig) {
        new ZslControlImpl$$ExternalSyntheticLambda1(this, 20);
        this.mAttachedSessionConfig = SessionConfig.defaultEmptySessionConfig();
        this.mAttachedSecondarySessionConfig = SessionConfig.defaultEmptySessionConfig();
        this.mUseCaseConfig = useCaseConfig;
        this.mCurrentConfig = useCaseConfig;
    }

    public final void applyExpectedFrameRateRange(SessionConfig.Builder builder, AutoValue_StreamSpec autoValue_StreamSpec) {
        Range range = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (!range.equals(autoValue_StreamSpec.expectedFrameRateRange)) {
            Range range2 = autoValue_StreamSpec.expectedFrameRateRange;
            TraceParser traceParser = builder.mCaptureConfigBuilder;
            traceParser.getClass();
            ((MutableOptionsBundle) traceParser.projectPackages).insertOption(CaptureConfig.OPTION_RESOLVED_FRAME_RATE, range2);
            return;
        }
        synchronized (this.mCameraLock) {
            try {
                CameraInternal cameraInternal = this.mCamera;
                cameraInternal.getClass();
                ArrayList all = cameraInternal.getCameraInfoInternal().getCameraQuirks().getAll(AeFpsRangeQuirk.class);
                boolean z = true;
                if (all.size() > 1) {
                    z = false;
                }
                TransactorKt.checkArgument("There should not have more than one AeFpsRangeQuirk.", z);
                if (!all.isEmpty()) {
                    Range range3 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) all.get(0))).range$delegate.getValue();
                    if (range3 != null) {
                        range = range3;
                    }
                    TraceParser traceParser2 = builder.mCaptureConfigBuilder;
                    traceParser2.getClass();
                    ((MutableOptionsBundle) traceParser2.projectPackages).insertOption(CaptureConfig.OPTION_RESOLVED_FRAME_RATE, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void bindToCamera(CameraInternal cameraInternal, CameraInternal cameraInternal2, UseCaseConfig useCaseConfig, UseCaseConfig useCaseConfig2) {
        synchronized (this.mCameraLock) {
            this.mCamera = cameraInternal;
            this.mSecondaryCamera = cameraInternal2;
            this.mStateChangeCallbacks.add(cameraInternal);
            if (cameraInternal2 != null) {
                this.mStateChangeCallbacks.add(cameraInternal2);
            }
        }
        this.mExtendedConfig = useCaseConfig;
        this.mCameraConfig = useCaseConfig2;
        this.mCurrentConfig = mergeConfigs(cameraInternal.getCameraInfoInternal(), this.mExtendedConfig, this.mCameraConfig);
        synchronized (this.mRotationProviderLock) {
        }
        onBind();
    }

    public final int getAppTargetRotation() {
        return ((Integer) ((ImageOutputConfig) this.mCurrentConfig).retrieveOption(ImageOutputConfig.OPTION_APP_TARGET_ROTATION, -1)).intValue();
    }

    public final Size getAttachedSurfaceResolution() {
        AutoValue_StreamSpec autoValue_StreamSpec = this.mAttachedStreamSpec;
        if (autoValue_StreamSpec != null) {
            return autoValue_StreamSpec.resolution;
        }
        return null;
    }

    public final CameraInternal getCamera() {
        CameraInternal cameraInternal;
        synchronized (this.mCameraLock) {
            cameraInternal = this.mCamera;
        }
        return cameraInternal;
    }

    public final CameraControlInternal getCameraControl$1() {
        synchronized (this.mCameraLock) {
            try {
                CameraInternal cameraInternal = this.mCamera;
                if (cameraInternal == null) {
                    return CameraControlInternal.DEFAULT_EMPTY_INSTANCE;
                }
                return cameraInternal.getCameraControlInternal();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String getCameraId() {
        CameraInternal camera = getCamera();
        TransactorKt.checkNotNull(camera, "No camera attached to use case: " + this);
        return camera.getCameraInfoInternal().getCameraId();
    }

    public abstract UseCaseConfig getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory);

    public final String getName() {
        String str = (String) this.mCurrentConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int getRelativeRotation(CameraInternal cameraInternal, boolean z) {
        int sensorRotationDegrees = cameraInternal.getCameraInfoInternal().getSensorRotationDegrees(((ImageOutputConfig) this.mCurrentConfig).getTargetRotation(0));
        return (cameraInternal.getHasTransform() || !z) ? sensorRotationDegrees : TransformUtils.within360(-sensorRotationDegrees);
    }

    public final CameraInternal getSecondaryCamera() {
        CameraInternal cameraInternal;
        synchronized (this.mCameraLock) {
            cameraInternal = this.mSecondaryCamera;
        }
        return cameraInternal;
    }

    public Set getSupportedDynamicRanges(CameraInfoInternal cameraInfoInternal) {
        return null;
    }

    public Set getSupportedEffectTargets() {
        return Collections.EMPTY_SET;
    }

    public abstract UseCaseConfig.Builder getUseCaseConfigBuilder(Config config);

    public boolean isAutoRotationSupported() {
        return this instanceof ImageAnalysis;
    }

    public final boolean isMirroringRequired(CameraInternal cameraInternal) {
        int intValue = ((Integer) ((ImageOutputConfig) this.mCurrentConfig).retrieveOption(ImageOutputConfig.OPTION_MIRROR_MODE, -1)).intValue();
        if (intValue == -1 || intValue == 0) {
            return false;
        }
        if (intValue == 1) {
            return true;
        }
        if (intValue == 2) {
            return cameraInternal.isFrontFacing();
        }
        a$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "Unknown mirrorMode: "));
        return false;
    }

    public final UseCaseConfig mergeConfigs(CameraInfoInternal cameraInfoInternal, UseCaseConfig useCaseConfig, UseCaseConfig useCaseConfig2) {
        MutableOptionsBundle create;
        if (useCaseConfig2 != null) {
            create = MutableOptionsBundle.from((Config) useCaseConfig2);
            create.removeOption(TargetConfig.OPTION_TARGET_NAME);
        } else {
            create = MutableOptionsBundle.create();
        }
        TreeMap treeMap = create.mOptions;
        if (this.mUseCaseConfig.containsOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO) || this.mUseCaseConfig.containsOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION)) {
            AutoValue_Config_Option autoValue_Config_Option = ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
            if (treeMap.containsKey(autoValue_Config_Option)) {
                create.removeOption(autoValue_Config_Option);
            }
        }
        UseCaseConfig useCaseConfig3 = this.mUseCaseConfig;
        AutoValue_Config_Option autoValue_Config_Option2 = ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
        if (useCaseConfig3.containsOption(autoValue_Config_Option2)) {
            AutoValue_Config_Option autoValue_Config_Option3 = ImageOutputConfig.OPTION_MAX_RESOLUTION;
            if (treeMap.containsKey(autoValue_Config_Option3) && ((ResolutionSelector) this.mUseCaseConfig.retrieveOption(autoValue_Config_Option2)).mResolutionStrategy != null) {
                create.removeOption(autoValue_Config_Option3);
            }
        }
        Iterator it = this.mUseCaseConfig.listOptions().iterator();
        while (it.hasNext()) {
            Config.mergeOptionValue(create, create, this.mUseCaseConfig, (AutoValue_Config_Option) it.next());
        }
        if (useCaseConfig != null) {
            for (AutoValue_Config_Option autoValue_Config_Option4 : useCaseConfig.listOptions()) {
                if (!autoValue_Config_Option4.id.equals(TargetConfig.OPTION_TARGET_NAME.id)) {
                    Config.mergeOptionValue(create, create, useCaseConfig, autoValue_Config_Option4);
                }
            }
        }
        if (treeMap.containsKey(ImageOutputConfig.OPTION_TARGET_RESOLUTION)) {
            AutoValue_Config_Option autoValue_Config_Option5 = ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO;
            if (treeMap.containsKey(autoValue_Config_Option5)) {
                create.removeOption(autoValue_Config_Option5);
            }
        }
        AutoValue_Config_Option autoValue_Config_Option6 = ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
        if (treeMap.containsKey(autoValue_Config_Option6)) {
            ((ResolutionSelector) create.retrieveOption(autoValue_Config_Option6)).getClass();
        }
        StringUtilsKt.d("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.mFeatureGroup + ", this = " + this);
        HashSet<GroupableFeature> hashSet = this.mFeatureGroup;
        if (hashSet != null) {
            int i = DynamicRangeFeature.$r8$clinit;
            Range range = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            VideoStabilization videoStabilization = VideoStabilizationFeature.DEFAULT_STABILIZATION;
            DynamicRange dynamicRange = DynamicRange.SDR;
            for (GroupableFeature groupableFeature : hashSet) {
                if (groupableFeature instanceof DynamicRangeFeature) {
                    dynamicRange = ((DynamicRangeFeature) groupableFeature).dynamicRange;
                } else if (groupableFeature instanceof FpsRangeFeature) {
                    FpsRangeFeature fpsRangeFeature = (FpsRangeFeature) groupableFeature;
                    range = new Range(Integer.valueOf(fpsRangeFeature.minFps), Integer.valueOf(fpsRangeFeature.maxFps));
                } else if (groupableFeature instanceof VideoStabilizationFeature) {
                    videoStabilization = ((VideoStabilizationFeature) groupableFeature).videoStabilization;
                }
            }
            if ((this instanceof Preview) || UseCaseUtil.isVideoCapture(this)) {
                create.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            }
            create.insertOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            int ordinal = videoStabilization.ordinal();
            if (ordinal == 0) {
                create.insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 0);
                create.insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 0);
            } else if (ordinal == 1) {
                create.insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 1);
                create.insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 1);
            } else if (ordinal == 2) {
                create.insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 0);
                create.insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 2);
            } else if (ordinal == 3) {
                create.insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 2);
                create.insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 0);
            }
        }
        return onMergeConfig(cameraInfoInternal, getUseCaseConfigBuilder(create));
    }

    public final void notifyReset() {
        Iterator it = this.mStateChangeCallbacks.iterator();
        while (it.hasNext()) {
            ((StateChangeCallback) it.next()).onUseCaseReset(this);
        }
    }

    public final void notifyState() {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mState);
        HashSet hashSet = this.mStateChangeCallbacks;
        if (ordinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((StateChangeCallback) it.next()).onUseCaseActive(this);
            }
        } else {
            if (ordinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((StateChangeCallback) it2.next()).onUseCaseInactive(this);
            }
        }
    }

    public void onBind() {
    }

    public void onCameraControlReady() {
    }

    public UseCaseConfig onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        return builder.getUseCaseConfig();
    }

    public void onSessionStart() {
        this.mInSession = true;
    }

    public void onSessionStop() {
        this.mInSession = false;
    }

    public AutoValue_StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        AutoValue_StreamSpec autoValue_StreamSpec = this.mAttachedStreamSpec;
        if (autoValue_StreamSpec == null) {
            a$$ExternalSyntheticBUOutline0.m("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        SubtreeManager builder = autoValue_StreamSpec.toBuilder();
        builder.idCounter = config;
        return builder.build();
    }

    public abstract AutoValue_StreamSpec onSuggestedStreamSpecUpdated(AutoValue_StreamSpec autoValue_StreamSpec, AutoValue_StreamSpec autoValue_StreamSpec2);

    public void onUnbind() {
    }

    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        this.mSensorToBufferTransformMatrix = new Matrix(matrix);
    }

    public final boolean setTargetRotationInternal(int i) {
        Size size;
        int targetRotation = ((ImageOutputConfig) this.mCurrentConfig).getTargetRotation(-1);
        if (targetRotation != -1 && targetRotation == i) {
            return false;
        }
        UseCaseConfig.Builder useCaseConfigBuilder = getUseCaseConfigBuilder(this.mUseCaseConfig);
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfigBuilder.getUseCaseConfig();
        int targetRotation2 = imageOutputConfig.getTargetRotation(-1);
        if (targetRotation2 == -1 || targetRotation2 != i) {
            Preview.Builder builder = (Preview.Builder) useCaseConfigBuilder;
            switch (builder.$r8$classId) {
                case 0:
                    builder.setTargetRotation$2(i);
                    break;
                case 1:
                    builder.mMutableConfig.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
                    break;
                case 2:
                    builder.mMutableConfig.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
                    break;
                default:
                    builder.mMutableConfig.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
                    break;
            }
        }
        if (targetRotation2 != -1 && i != -1 && targetRotation2 != i) {
            if (Math.abs(GenieForEachViewKt.surfaceRotationToDegrees(i) - GenieForEachViewKt.surfaceRotationToDegrees(targetRotation2)) % EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE == 90 && (size = (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null)) != null) {
                Preview.Builder builder2 = (Preview.Builder) useCaseConfigBuilder;
                Size size2 = new Size(size.getHeight(), size.getWidth());
                switch (builder2.$r8$classId) {
                    case 0:
                        builder2.mMutableConfig.insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size2);
                        break;
                    case 1:
                        builder2.mMutableConfig.insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size2);
                        break;
                    case 2:
                        builder2.mMutableConfig.insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size2);
                        break;
                    default:
                        throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
            }
        }
        this.mUseCaseConfig = useCaseConfigBuilder.getUseCaseConfig();
        CameraInternal camera = getCamera();
        if (camera == null) {
            this.mCurrentConfig = this.mUseCaseConfig;
            return true;
        }
        this.mCurrentConfig = mergeConfigs(camera.getCameraInfoInternal(), this.mExtendedConfig, this.mCameraConfig);
        return true;
    }

    public void setViewPortCropRect(Rect rect) {
        this.mViewPortCropRect = rect;
    }

    public final void unbindFromCamera(CameraInternal cameraInternal) {
        onUnbind();
        synchronized (this.mCameraLock) {
            try {
                CameraInternal cameraInternal2 = this.mCamera;
                if (cameraInternal == cameraInternal2) {
                    this.mStateChangeCallbacks.remove(cameraInternal2);
                    this.mCamera = null;
                }
                CameraInternal cameraInternal3 = this.mSecondaryCamera;
                if (cameraInternal == cameraInternal3) {
                    this.mStateChangeCallbacks.remove(cameraInternal3);
                    this.mSecondaryCamera = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.mRotationProviderLock) {
        }
        this.mAttachedStreamSpec = null;
        this.mViewPortCropRect = null;
        this.mCurrentConfig = this.mUseCaseConfig;
        this.mExtendedConfig = null;
        this.mCameraConfig = null;
    }

    public final void updateSessionConfig(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.mAttachedSessionConfig = (SessionConfig) list.get(0);
        if (list.size() > 1) {
            this.mAttachedSecondarySessionConfig = (SessionConfig) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (DeferrableSurface deferrableSurface : ((SessionConfig) it.next()).getSurfaces()) {
                if (deferrableSurface.mContainerClass == null) {
                    deferrableSurface.mContainerClass = getClass();
                }
            }
        }
    }

    public final void updateSuggestedStreamSpec(AutoValue_StreamSpec autoValue_StreamSpec, AutoValue_StreamSpec autoValue_StreamSpec2) {
        this.mAttachedStreamSpec = onSuggestedStreamSpecUpdated(autoValue_StreamSpec, autoValue_StreamSpec2);
    }
}
