package androidx.camera.camera2.adapter;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.camera2.internal.HighSpeedResolver;
import androidx.camera.camera2.internal.StreamUseCaseUtil;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature;
import androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceStreamSpecQueryResult;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.streamsharing.StreamSharingConfig;
import androidx.camera.video.VideoCapture;
import androidx.room.TransactorKt;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda3;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class SupportedSurfaceCombination {
    public final String cameraId;
    public final CameraMetadata cameraMetadata;
    public final ArrayList concurrentSurfaceCombinations;
    public final DisplayInfoManager displayInfoManager;
    public final VideoCapture.AnonymousClass3 dynamicRangeResolver;
    public final EncoderProfilesProvider encoderProfilesProvider;
    public final FeatureCombinationQuery featureCombinationQuery;
    public final LinkedHashMap featureSettingsToSupportedCombinationsMap;
    public final int hardwareLevel;
    public final HighSpeedResolver highSpeedResolver;
    public final ArrayList highSpeedSurfaceCombinations;
    public final boolean isBurstCaptureSupported;
    public final boolean isConcurrentCameraModeSupported;
    public final boolean isManualSensorSupported;
    public final boolean isPreviewStabilizationSupported;
    public final boolean isRawSupported;
    public final boolean isStreamUseCaseSupported;
    public final boolean isUltraHighResolutionSensorSupported;
    public final ArrayList previewStabilizationSurfaceCombinations;
    public final BiometricPrompt resolutionCorrector;
    public final StreamConfigurationMapCompat streamConfigurationMapCompat;
    public final ArrayList surfaceCombinations;
    public final ArrayList surfaceCombinations10Bit;
    public final ArrayList surfaceCombinationsStreamUseCase;
    public final ArrayList surfaceCombinationsUltraHdr;
    public AutoValue_SurfaceSizeDefinition surfaceSizeDefinition;
    public final ArrayList surfaceSizeDefinitionFormats;
    public final TargetAspectRatio targetAspectRatio;
    public final ArrayList ultraHighSurfaceCombinations;

    public final class BestSizesAndMaxFpsForConfigs {
        public final List bestSizes;
        public final List bestSizesForStreamUseCase;
        public final int maxFpsForAllSizes;
        public final int maxFpsForBestSizes;
        public final int maxFpsForStreamUseCase;

        public BestSizesAndMaxFpsForConfigs(List list, List list2, int i, int i2, int i3) {
            this.bestSizes = list;
            this.bestSizesForStreamUseCase = list2;
            this.maxFpsForBestSizes = i;
            this.maxFpsForStreamUseCase = i2;
            this.maxFpsForAllSizes = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BestSizesAndMaxFpsForConfigs)) {
                return false;
            }
            BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs = (BestSizesAndMaxFpsForConfigs) obj;
            return this.bestSizes.equals(bestSizesAndMaxFpsForConfigs.bestSizes) && Intrinsics.areEqual(this.bestSizesForStreamUseCase, bestSizesAndMaxFpsForConfigs.bestSizesForStreamUseCase) && this.maxFpsForBestSizes == bestSizesAndMaxFpsForConfigs.maxFpsForBestSizes && this.maxFpsForStreamUseCase == bestSizesAndMaxFpsForConfigs.maxFpsForStreamUseCase && this.maxFpsForAllSizes == bestSizesAndMaxFpsForConfigs.maxFpsForAllSizes;
        }

        public final int hashCode() {
            int hashCode = this.bestSizes.hashCode() * 31;
            List list = this.bestSizesForStreamUseCase;
            return Integer.hashCode(this.maxFpsForAllSizes) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxFpsForStreamUseCase, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxFpsForBestSizes, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
            sb.append(this.bestSizes);
            sb.append(", bestSizesForStreamUseCase=");
            sb.append(this.bestSizesForStreamUseCase);
            sb.append(", maxFpsForBestSizes=");
            sb.append(this.maxFpsForBestSizes);
            sb.append(", maxFpsForStreamUseCase=");
            sb.append(this.maxFpsForStreamUseCase);
            sb.append(", maxFpsForAllSizes=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.maxFpsForAllSizes, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CheckingMethod {
        public static final /* synthetic */ CheckingMethod[] $VALUES;
        public static final CheckingMethod WITHOUT_FEATURE_COMBO;
        public static final CheckingMethod WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT;
        public static final CheckingMethod WITH_FEATURE_COMBO;

        static {
            CheckingMethod checkingMethod = new CheckingMethod("WITHOUT_FEATURE_COMBO", 0);
            WITHOUT_FEATURE_COMBO = checkingMethod;
            CheckingMethod checkingMethod2 = new CheckingMethod("WITH_FEATURE_COMBO", 1);
            WITH_FEATURE_COMBO = checkingMethod2;
            CheckingMethod checkingMethod3 = new CheckingMethod("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
            WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = checkingMethod3;
            $VALUES = new CheckingMethod[]{checkingMethod, checkingMethod2, checkingMethod3};
        }

        public static CheckingMethod valueOf(String str) {
            return (CheckingMethod) Enum.valueOf(CheckingMethod.class, str);
        }

        public static CheckingMethod[] values() {
            return (CheckingMethod[]) $VALUES.clone();
        }
    }

    public final class FeatureSettings {
        public final int cameraMode;
        public final boolean hasVideoCapture;
        public final boolean isFeatureComboInvocation;
        public final boolean isHighSpeedOn;
        public final boolean isStrictFpsRequired;
        public final boolean isUltraHdrOn;
        public final int requiredMaxBitDepth;
        public final boolean requiresFeatureComboQuery;
        public final Range targetFpsRange;
        public final VideoStabilization videoStabilization;

        public FeatureSettings(int i, int i2, boolean z, VideoStabilization videoStabilization, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
            videoStabilization.getClass();
            range.getClass();
            this.cameraMode = i;
            this.requiredMaxBitDepth = i2;
            this.hasVideoCapture = z;
            this.videoStabilization = videoStabilization;
            this.isUltraHdrOn = z2;
            this.isHighSpeedOn = z3;
            this.isFeatureComboInvocation = z4;
            this.requiresFeatureComboQuery = z5;
            this.targetFpsRange = range;
            this.isStrictFpsRequired = z6;
        }

        public static FeatureSettings copy$default(FeatureSettings featureSettings, boolean z, Range range, int i) {
            int i2 = featureSettings.cameraMode;
            int i3 = featureSettings.requiredMaxBitDepth;
            boolean z2 = featureSettings.hasVideoCapture;
            VideoStabilization videoStabilization = featureSettings.videoStabilization;
            boolean z3 = featureSettings.isUltraHdrOn;
            boolean z4 = featureSettings.isHighSpeedOn;
            boolean z5 = featureSettings.isFeatureComboInvocation;
            if ((i & 256) != 0) {
                range = featureSettings.targetFpsRange;
            }
            Range range2 = range;
            boolean z6 = featureSettings.isStrictFpsRequired;
            videoStabilization.getClass();
            range2.getClass();
            return new FeatureSettings(i2, i3, z2, videoStabilization, z3, z4, z5, z, range2, z6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeatureSettings)) {
                return false;
            }
            FeatureSettings featureSettings = (FeatureSettings) obj;
            return this.cameraMode == featureSettings.cameraMode && this.requiredMaxBitDepth == featureSettings.requiredMaxBitDepth && this.hasVideoCapture == featureSettings.hasVideoCapture && this.videoStabilization == featureSettings.videoStabilization && this.isUltraHdrOn == featureSettings.isUltraHdrOn && this.isHighSpeedOn == featureSettings.isHighSpeedOn && this.isFeatureComboInvocation == featureSettings.isFeatureComboInvocation && this.requiresFeatureComboQuery == featureSettings.requiresFeatureComboQuery && Intrinsics.areEqual(this.targetFpsRange, featureSettings.targetFpsRange) && this.isStrictFpsRequired == featureSettings.isStrictFpsRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isStrictFpsRequired) + ((this.targetFpsRange.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.videoStabilization.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.requiredMaxBitDepth, Integer.hashCode(this.cameraMode) * 31, 31), 31, this.hasVideoCapture)) * 31, 31, this.isUltraHdrOn), 31, this.isHighSpeedOn), 31, this.isFeatureComboInvocation), 31, this.requiresFeatureComboQuery)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeatureSettings(cameraMode=");
            sb.append(this.cameraMode);
            sb.append(", requiredMaxBitDepth=");
            sb.append(this.requiredMaxBitDepth);
            sb.append(", hasVideoCapture=");
            sb.append(this.hasVideoCapture);
            sb.append(", videoStabilization=");
            sb.append(this.videoStabilization);
            sb.append(", isUltraHdrOn=");
            sb.append(this.isUltraHdrOn);
            sb.append(", isHighSpeedOn=");
            sb.append(this.isHighSpeedOn);
            sb.append(", isFeatureComboInvocation=");
            sb.append(this.isFeatureComboInvocation);
            sb.append(", requiresFeatureComboQuery=");
            sb.append(this.requiresFeatureComboQuery);
            sb.append(", targetFpsRange=");
            sb.append(this.targetFpsRange);
            sb.append(", isStrictFpsRequired=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isStrictFpsRequired, ')');
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x03dc, code lost:
    
        if (r1 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SupportedSurfaceCombination(Context context, CameraMetadata cameraMetadata, EncoderProfilesProvider encoderProfilesProvider, FeatureCombinationQuery featureCombinationQuery) {
        ArrayList arrayList;
        Collection collection;
        SurfaceConfig create;
        SurfaceConfig create2;
        SurfaceConfig create3;
        SurfaceConfig create4;
        SurfaceConfig create5;
        SurfaceConfig create6;
        SurfaceConfig create7;
        SurfaceConfig create8;
        SurfaceConfig create9;
        SurfaceConfig create10;
        SurfaceConfig create11;
        SurfaceConfig create12;
        SurfaceConfig create13;
        SurfaceConfig create14;
        SurfaceConfig create15;
        SurfaceConfig create16;
        SurfaceConfig create17;
        SurfaceConfig create18;
        SurfaceConfig create19;
        SurfaceConfig create20;
        SurfaceConfig create21;
        SurfaceConfig create22;
        SurfaceConfig create23;
        SurfaceConfig create24;
        SurfaceConfig create25;
        SurfaceConfig create26;
        SurfaceConfig create27;
        SurfaceConfig create28;
        SurfaceConfig create29;
        SurfaceConfig create30;
        SurfaceConfig create31;
        SurfaceConfig create32;
        context.getClass();
        cameraMetadata.getClass();
        encoderProfilesProvider.getClass();
        this.cameraMetadata = cameraMetadata;
        this.encoderProfilesProvider = encoderProfilesProvider;
        this.featureCombinationQuery = featureCombinationQuery;
        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
        String str = camera2CameraMetadata.camera;
        this.cameraId = str;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) camera2CameraMetadata.get(key);
        int intValue = num != null ? num.intValue() : 2;
        this.hardwareLevel = intValue;
        ArrayList arrayList2 = new ArrayList();
        this.concurrentSurfaceCombinations = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.surfaceCombinations = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.surfaceCombinationsStreamUseCase = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.ultraHighSurfaceCombinations = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        this.previewStabilizationSurfaceCombinations = arrayList6;
        this.highSpeedSurfaceCombinations = new ArrayList();
        this.featureSettingsToSupportedCombinationsMap = new LinkedHashMap();
        ArrayList arrayList7 = new ArrayList();
        this.surfaceCombinations10Bit = arrayList7;
        this.surfaceCombinationsUltraHdr = new ArrayList();
        CameraMetadata.Companion.getClass();
        boolean supportsPreviewStabilization = CameraMetadata.Companion.getSupportsPreviewStabilization(cameraMetadata);
        this.isPreviewStabilizationSupported = supportsPreviewStabilization;
        this.surfaceSizeDefinitionFormats = new ArrayList();
        this.streamConfigurationMapCompat = getStreamConfigurationMapCompat();
        Quirks quirks = DeviceQuirks.all;
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = (ExtraSupportedSurfaceCombinationsQuirk) DeviceQuirks.getAll().get(ExtraSupportedSurfaceCombinationsQuirk.class);
        this.displayInfoManager = DisplayInfoManager.Companion.getInstance(context);
        this.resolutionCorrector = new BiometricPrompt(6);
        this.targetAspectRatio = new TargetAspectRatio(0);
        VideoCapture.AnonymousClass3 anonymousClass3 = new VideoCapture.AnonymousClass3(cameraMetadata);
        this.dynamicRangeResolver = anonymousClass3;
        this.highSpeedResolver = new HighSpeedResolver(cameraMetadata);
        CameraCharacteristics.Key key2 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key2.getClass();
        int[] iArr = (int[]) camera2CameraMetadata.get(key2);
        if (iArr != null) {
            this.isRawSupported = ArraysKt___ArraysKt.contains(iArr, 3);
            this.isBurstCaptureSupported = ArraysKt___ArraysKt.contains(iArr, 6);
            this.isUltraHighResolutionSensorSupported = ArraysKt___ArraysKt.contains(iArr, 16);
            this.isManualSensorSupported = ArraysKt___ArraysKt.contains(iArr, 1);
        }
        boolean z = this.isRawSupported;
        boolean z2 = this.isBurstCaptureSupported;
        Lazy lazy = GuaranteedConfigurationsUtil.QUERYABLE_VIC_FCQ_COMBINATIONS$delegate;
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        StreamUseCase streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        StreamUseCase streamUseCase2 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
        surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize, streamUseCase2));
        arrayList9.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
        surfaceCombination2.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize, streamUseCase2));
        arrayList9.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination3.addSurfaceConfig(Transition.AnonymousClass1.create(configType3, configSize, streamUseCase2));
        arrayList9.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination4, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType2, configSize, streamUseCase2);
        SurfaceCombination m = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList9, surfaceCombination4);
        CameraState$Type$EnumUnboxingLocalUtility.m(m, Transition.AnonymousClass1.create(configType3, configSize2, streamUseCase2), configType2, configSize, streamUseCase2);
        SurfaceCombination m2 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList9, m);
        CameraState$Type$EnumUnboxingLocalUtility.m(m2, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType, configSize2, streamUseCase2);
        SurfaceCombination m3 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList9, m2);
        CameraState$Type$EnumUnboxingLocalUtility.m(m3, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType3, configSize2, streamUseCase2);
        SurfaceCombination m4 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList9, m3);
        CameraState$Type$EnumUnboxingLocalUtility.m(m4, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType3, configSize2, streamUseCase2);
        m4.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize, streamUseCase2));
        arrayList9.add(m4);
        arrayList8.addAll(arrayList9);
        if (intValue == 0 || intValue == 1 || intValue == 3 || intValue == 4) {
            ArrayList arrayList10 = new ArrayList();
            SurfaceCombination surfaceCombination5 = new SurfaceCombination();
            surfaceCombination5.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2));
            SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
            arrayList = arrayList2;
            surfaceCombination5.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize3, streamUseCase2));
            arrayList10.add(surfaceCombination5);
            SurfaceCombination surfaceCombination6 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination6, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType3, configSize3, streamUseCase2);
            SurfaceCombination m5 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList10, surfaceCombination6);
            CameraState$Type$EnumUnboxingLocalUtility.m(m5, Transition.AnonymousClass1.create(configType3, configSize2, streamUseCase2), configType3, configSize3, streamUseCase2);
            SurfaceCombination m6 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList10, m5);
            CameraState$Type$EnumUnboxingLocalUtility.m(m6, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType, configSize3, streamUseCase2);
            m6.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize3, streamUseCase2));
            arrayList10.add(m6);
            SurfaceCombination surfaceCombination7 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination7, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType3, configSize3, streamUseCase2);
            surfaceCombination7.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize3, streamUseCase2));
            arrayList10.add(surfaceCombination7);
            SurfaceCombination surfaceCombination8 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination8, Transition.AnonymousClass1.create(configType3, configSize2, streamUseCase2), configType3, configSize2, streamUseCase2);
            surfaceCombination8.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize, streamUseCase2));
            arrayList10.add(surfaceCombination8);
            arrayList8.addAll(arrayList10);
        } else {
            arrayList = arrayList2;
        }
        if (intValue == 1 || intValue == 3) {
            ArrayList arrayList11 = new ArrayList();
            SurfaceCombination surfaceCombination9 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination9, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType, configSize, streamUseCase2);
            SurfaceCombination m7 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList11, surfaceCombination9);
            CameraState$Type$EnumUnboxingLocalUtility.m(m7, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType3, configSize, streamUseCase2);
            SurfaceCombination m8 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList11, m7);
            CameraState$Type$EnumUnboxingLocalUtility.m(m8, Transition.AnonymousClass1.create(configType3, configSize2, streamUseCase2), configType3, configSize, streamUseCase2);
            SurfaceCombination m9 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList11, m8);
            CameraState$Type$EnumUnboxingLocalUtility.m(m9, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType, configSize2, streamUseCase2);
            m9.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize, streamUseCase2));
            arrayList11.add(m9);
            SurfaceCombination surfaceCombination10 = new SurfaceCombination();
            SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.VGA;
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination10, Transition.AnonymousClass1.create(configType3, configSize4, streamUseCase2), configType, configSize2, streamUseCase2);
            surfaceCombination10.addSurfaceConfig(Transition.AnonymousClass1.create(configType3, configSize, streamUseCase2));
            arrayList11.add(surfaceCombination10);
            SurfaceCombination surfaceCombination11 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination11, Transition.AnonymousClass1.create(configType3, configSize4, streamUseCase2), configType3, configSize2, streamUseCase2);
            surfaceCombination11.addSurfaceConfig(Transition.AnonymousClass1.create(configType3, configSize, streamUseCase2));
            arrayList11.add(surfaceCombination11);
            arrayList8.addAll(arrayList11);
        }
        if (z) {
            ArrayList arrayList12 = new ArrayList();
            SurfaceCombination surfaceCombination12 = new SurfaceCombination();
            SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.RAW;
            surfaceCombination12.addSurfaceConfig(Transition.AnonymousClass1.create(configType4, configSize, streamUseCase2));
            arrayList12.add(surfaceCombination12);
            SurfaceCombination surfaceCombination13 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination13, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType4, configSize, streamUseCase2);
            SurfaceCombination m10 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList12, surfaceCombination13);
            CameraState$Type$EnumUnboxingLocalUtility.m(m10, Transition.AnonymousClass1.create(configType3, configSize2, streamUseCase2), configType4, configSize, streamUseCase2);
            SurfaceCombination m11 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList12, m10);
            CameraState$Type$EnumUnboxingLocalUtility.m(m11, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType, configSize2, streamUseCase2);
            m11.addSurfaceConfig(Transition.AnonymousClass1.create(configType4, configSize, streamUseCase2));
            arrayList12.add(m11);
            SurfaceCombination surfaceCombination14 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination14, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType3, configSize2, streamUseCase2);
            surfaceCombination14.addSurfaceConfig(Transition.AnonymousClass1.create(configType4, configSize, streamUseCase2));
            arrayList12.add(surfaceCombination14);
            SurfaceCombination surfaceCombination15 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination15, Transition.AnonymousClass1.create(configType3, configSize2, streamUseCase2), configType3, configSize2, streamUseCase2);
            surfaceCombination15.addSurfaceConfig(Transition.AnonymousClass1.create(configType4, configSize, streamUseCase2));
            arrayList12.add(surfaceCombination15);
            SurfaceCombination surfaceCombination16 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination16, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType2, configSize, streamUseCase2);
            surfaceCombination16.addSurfaceConfig(Transition.AnonymousClass1.create(configType4, configSize, streamUseCase2));
            arrayList12.add(surfaceCombination16);
            SurfaceCombination surfaceCombination17 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination17, Transition.AnonymousClass1.create(configType3, configSize2, streamUseCase2), configType2, configSize, streamUseCase2);
            surfaceCombination17.addSurfaceConfig(Transition.AnonymousClass1.create(configType4, configSize, streamUseCase2));
            arrayList12.add(surfaceCombination17);
            arrayList8.addAll(arrayList12);
        }
        if (z2 && intValue == 0) {
            ArrayList arrayList13 = new ArrayList();
            SurfaceCombination surfaceCombination18 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination18, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2), configType, configSize, streamUseCase2);
            SurfaceCombination m12 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList13, surfaceCombination18);
            m12.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2));
            create32 = Transition.AnonymousClass1.create(configType3, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            m12.addSurfaceConfig(create32);
            SurfaceCombination m13 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList13, m12);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize2, m13, configType3, configSize);
            arrayList13.add(m13);
            arrayList8.addAll(arrayList13);
        }
        if (intValue == 3) {
            ArrayList arrayList14 = new ArrayList();
            SurfaceCombination surfaceCombination19 = new SurfaceCombination();
            create30 = Transition.AnonymousClass1.create(configType, configSize2, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination19.addSurfaceConfig(create30);
            SurfaceConfig.ConfigSize configSize5 = SurfaceConfig.ConfigSize.VGA;
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize5, surfaceCombination19, configType3, configSize);
            SurfaceConfig.ConfigType configType5 = SurfaceConfig.ConfigType.RAW;
            create31 = Transition.AnonymousClass1.create(configType5, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination19.addSurfaceConfig(create31);
            arrayList14.add(surfaceCombination19);
            SurfaceCombination surfaceCombination20 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize2, surfaceCombination20, configType, configSize5);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType2, configSize, surfaceCombination20, configType5, configSize);
            arrayList14.add(surfaceCombination20);
            arrayList8.addAll(arrayList14);
        }
        arrayList3.addAll(arrayList8);
        str.getClass();
        if (extraSupportedSurfaceCombinationsQuirk != null) {
            SurfaceCombination surfaceCombination21 = ExtraSupportedSurfaceCombinationsQuirk.FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION;
            String str2 = Build.DEVICE;
            if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                ArrayList arrayList15 = new ArrayList();
                collection = arrayList15;
                if (Intrinsics.areEqual(str, "1")) {
                    arrayList15.add(ExtraSupportedSurfaceCombinationsQuirk.FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION);
                    collection = arrayList15;
                }
            } else {
                collection = (HeaderSectionKt.supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2() || HeaderSectionKt.supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2()) ? CollectionsKt__CollectionsJVMKt.listOf(ExtraSupportedSurfaceCombinationsQuirk.LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION) : EmptyList.INSTANCE;
            }
        }
        collection = EmptyList.INSTANCE;
        arrayList3.addAll(collection);
        if (this.isUltraHighResolutionSensorSupported) {
            ArrayList arrayList16 = new ArrayList();
            SurfaceCombination surfaceCombination22 = new SurfaceCombination();
            SurfaceConfig.ConfigSize configSize6 = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize6, surfaceCombination22, configType, configSize2);
            SurfaceConfig.ConfigSize configSize7 = SurfaceConfig.ConfigSize.RECORD;
            create18 = Transition.AnonymousClass1.create(configType, configSize7, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination22.addSurfaceConfig(create18);
            arrayList16.add(surfaceCombination22);
            SurfaceCombination surfaceCombination23 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType2, configSize6, surfaceCombination23, configType, configSize2);
            create19 = Transition.AnonymousClass1.create(configType, configSize7, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination23.addSurfaceConfig(create19);
            arrayList16.add(surfaceCombination23);
            SurfaceCombination surfaceCombination24 = new SurfaceCombination();
            SurfaceConfig.ConfigType configType6 = SurfaceConfig.ConfigType.RAW;
            CameraState$Type$EnumUnboxingLocalUtility.m(configType6, configSize6, surfaceCombination24, configType, configSize2);
            create20 = Transition.AnonymousClass1.create(configType, configSize7, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination24.addSurfaceConfig(create20);
            arrayList16.add(surfaceCombination24);
            SurfaceCombination surfaceCombination25 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize6, surfaceCombination25, configType, configSize2);
            create21 = Transition.AnonymousClass1.create(configType2, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination25.addSurfaceConfig(create21);
            arrayList16.add(surfaceCombination25);
            SurfaceCombination surfaceCombination26 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType2, configSize6, surfaceCombination26, configType, configSize2);
            create22 = Transition.AnonymousClass1.create(configType2, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination26.addSurfaceConfig(create22);
            arrayList16.add(surfaceCombination26);
            SurfaceCombination surfaceCombination27 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType6, configSize6, surfaceCombination27, configType, configSize2);
            create23 = Transition.AnonymousClass1.create(configType2, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination27.addSurfaceConfig(create23);
            arrayList16.add(surfaceCombination27);
            SurfaceCombination surfaceCombination28 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize6, surfaceCombination28, configType, configSize2);
            create24 = Transition.AnonymousClass1.create(configType3, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination28.addSurfaceConfig(create24);
            arrayList16.add(surfaceCombination28);
            SurfaceCombination surfaceCombination29 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType2, configSize6, surfaceCombination29, configType, configSize2);
            create25 = Transition.AnonymousClass1.create(configType3, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination29.addSurfaceConfig(create25);
            arrayList16.add(surfaceCombination29);
            SurfaceCombination surfaceCombination30 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType6, configSize6, surfaceCombination30, configType, configSize2);
            create26 = Transition.AnonymousClass1.create(configType3, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination30.addSurfaceConfig(create26);
            arrayList16.add(surfaceCombination30);
            SurfaceCombination surfaceCombination31 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize6, surfaceCombination31, configType, configSize2);
            create27 = Transition.AnonymousClass1.create(configType6, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination31.addSurfaceConfig(create27);
            arrayList16.add(surfaceCombination31);
            SurfaceCombination surfaceCombination32 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType2, configSize6, surfaceCombination32, configType, configSize2);
            create28 = Transition.AnonymousClass1.create(configType6, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination32.addSurfaceConfig(create28);
            arrayList16.add(surfaceCombination32);
            SurfaceCombination surfaceCombination33 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType6, configSize6, surfaceCombination33, configType, configSize2);
            create29 = Transition.AnonymousClass1.create(configType6, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination33.addSurfaceConfig(create29);
            arrayList16.add(surfaceCombination33);
            arrayList5.addAll(arrayList16);
        }
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.isConcurrentCameraModeSupported = hasSystemFeature;
        if (hasSystemFeature) {
            ArrayList arrayList17 = new ArrayList();
            SurfaceCombination surfaceCombination34 = new SurfaceCombination();
            SurfaceConfig.ConfigSize configSize8 = SurfaceConfig.ConfigSize.S1440P_4_3;
            create15 = Transition.AnonymousClass1.create(configType3, configSize8, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination34.addSurfaceConfig(create15);
            arrayList17.add(surfaceCombination34);
            SurfaceCombination surfaceCombination35 = new SurfaceCombination();
            create16 = Transition.AnonymousClass1.create(configType, configSize8, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination35.addSurfaceConfig(create16);
            arrayList17.add(surfaceCombination35);
            SurfaceCombination surfaceCombination36 = new SurfaceCombination();
            create17 = Transition.AnonymousClass1.create(configType2, configSize8, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination36.addSurfaceConfig(create17);
            arrayList17.add(surfaceCombination36);
            SurfaceCombination surfaceCombination37 = new SurfaceCombination();
            SurfaceConfig.ConfigSize configSize9 = SurfaceConfig.ConfigSize.S720P_16_9;
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize9, surfaceCombination37, configType2, configSize8);
            SurfaceCombination m14 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList17, surfaceCombination37);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize9, m14, configType2, configSize8);
            SurfaceCombination m15 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList17, m14);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize9, m15, configType3, configSize8);
            SurfaceCombination m16 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList17, m15);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize9, m16, configType, configSize8);
            SurfaceCombination m17 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList17, m16);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize9, m17, configType3, configSize8);
            SurfaceCombination m18 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList17, m17);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize9, m18, configType, configSize8);
            arrayList17.add(m18);
            arrayList.addAll(arrayList17);
        }
        if (anonymousClass3.val$isStreamActive) {
            SurfaceCombination surfaceCombination38 = new SurfaceCombination();
            create3 = Transition.AnonymousClass1.create(configType, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination38.addSurfaceConfig(create3);
            SurfaceCombination surfaceCombination39 = new SurfaceCombination();
            create4 = Transition.AnonymousClass1.create(configType3, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination39.addSurfaceConfig(create4);
            SurfaceCombination surfaceCombination40 = new SurfaceCombination();
            create5 = Transition.AnonymousClass1.create(configType, configSize2, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination40.addSurfaceConfig(create5);
            create6 = Transition.AnonymousClass1.create(configType2, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination40.addSurfaceConfig(create6);
            SurfaceCombination surfaceCombination41 = new SurfaceCombination();
            create7 = Transition.AnonymousClass1.create(configType, configSize2, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination41.addSurfaceConfig(create7);
            create8 = Transition.AnonymousClass1.create(configType3, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination41.addSurfaceConfig(create8);
            SurfaceCombination surfaceCombination42 = new SurfaceCombination();
            create9 = Transition.AnonymousClass1.create(configType3, configSize2, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination42.addSurfaceConfig(create9);
            create10 = Transition.AnonymousClass1.create(configType3, configSize, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination42.addSurfaceConfig(create10);
            SurfaceCombination surfaceCombination43 = new SurfaceCombination();
            create11 = Transition.AnonymousClass1.create(configType, configSize2, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination43.addSurfaceConfig(create11);
            SurfaceConfig.ConfigSize configSize10 = SurfaceConfig.ConfigSize.RECORD;
            create12 = Transition.AnonymousClass1.create(configType, configSize10, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination43.addSurfaceConfig(create12);
            SurfaceCombination surfaceCombination44 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize2, surfaceCombination44, configType, configSize10);
            create13 = Transition.AnonymousClass1.create(configType3, configSize10, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination44.addSurfaceConfig(create13);
            SurfaceCombination surfaceCombination45 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize2, surfaceCombination45, configType, configSize10);
            create14 = Transition.AnonymousClass1.create(configType2, configSize10, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination45.addSurfaceConfig(create14);
            arrayList7.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new SurfaceCombination[]{surfaceCombination38, surfaceCombination39, surfaceCombination40, surfaceCombination41, surfaceCombination42, surfaceCombination43, surfaceCombination44, surfaceCombination45}));
        }
        if (supportsPreviewStabilization) {
            ArrayList arrayList18 = new ArrayList();
            SurfaceCombination surfaceCombination46 = new SurfaceCombination();
            SurfaceConfig.ConfigSize configSize11 = SurfaceConfig.ConfigSize.S1440P_4_3;
            create = Transition.AnonymousClass1.create(configType, configSize11, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination46.addSurfaceConfig(create);
            arrayList18.add(surfaceCombination46);
            SurfaceCombination surfaceCombination47 = new SurfaceCombination();
            create2 = Transition.AnonymousClass1.create(configType3, configSize11, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
            surfaceCombination47.addSurfaceConfig(create2);
            arrayList18.add(surfaceCombination47);
            SurfaceCombination surfaceCombination48 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize11, surfaceCombination48, configType2, configSize);
            SurfaceCombination m19 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList18, surfaceCombination48);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize11, m19, configType2, configSize);
            SurfaceCombination m20 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList18, m19);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize11, m20, configType3, configSize);
            SurfaceCombination m21 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList18, m20);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize11, m21, configType3, configSize);
            SurfaceCombination m22 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList18, m21);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize2, m22, configType, configSize11);
            SurfaceCombination m23 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList18, m22);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize2, m23, configType, configSize11);
            SurfaceCombination m24 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList18, m23);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType, configSize2, m24, configType3, configSize11);
            SurfaceCombination m25 = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList18, m24);
            CameraState$Type$EnumUnboxingLocalUtility.m(configType3, configSize2, m25, configType3, configSize11);
            arrayList18.add(m25);
            arrayList6.addAll(arrayList18);
        }
        boolean isStreamUseCaseSupported = StreamUseCaseUtil.isStreamUseCaseSupported(cameraMetadata);
        this.isStreamUseCaseSupported = isStreamUseCaseSupported;
        if (isStreamUseCaseSupported && Build.VERSION.SDK_INT >= 33) {
            SurfaceCombination surfaceCombination49 = new SurfaceCombination();
            SurfaceConfig.ConfigSize configSize12 = SurfaceConfig.ConfigSize.S1440P_4_3;
            StreamUseCase streamUseCase3 = StreamUseCase.PREVIEW_VIDEO_STILL;
            surfaceCombination49.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize12, streamUseCase3));
            SurfaceCombination surfaceCombination50 = new SurfaceCombination();
            surfaceCombination50.addSurfaceConfig(Transition.AnonymousClass1.create(configType3, configSize12, streamUseCase3));
            SurfaceCombination surfaceCombination51 = new SurfaceCombination();
            SurfaceConfig.ConfigSize configSize13 = SurfaceConfig.ConfigSize.RECORD;
            StreamUseCase streamUseCase4 = StreamUseCase.VIDEO_RECORD;
            surfaceCombination51.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize13, streamUseCase4));
            SurfaceCombination surfaceCombination52 = new SurfaceCombination();
            surfaceCombination52.addSurfaceConfig(Transition.AnonymousClass1.create(configType3, configSize13, streamUseCase4));
            SurfaceCombination surfaceCombination53 = new SurfaceCombination();
            StreamUseCase streamUseCase5 = StreamUseCase.STILL_CAPTURE;
            surfaceCombination53.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize, streamUseCase5));
            SurfaceCombination surfaceCombination54 = new SurfaceCombination();
            surfaceCombination54.addSurfaceConfig(Transition.AnonymousClass1.create(configType3, configSize, streamUseCase5));
            SurfaceCombination surfaceCombination55 = new SurfaceCombination();
            StreamUseCase streamUseCase6 = StreamUseCase.PREVIEW;
            surfaceCombination55.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize2, streamUseCase6));
            surfaceCombination55.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize, streamUseCase5));
            SurfaceCombination surfaceCombination56 = new SurfaceCombination();
            surfaceCombination56.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize2, streamUseCase6));
            surfaceCombination56.addSurfaceConfig(Transition.AnonymousClass1.create(configType3, configSize, streamUseCase5));
            SurfaceCombination surfaceCombination57 = new SurfaceCombination();
            surfaceCombination57.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize2, streamUseCase6));
            surfaceCombination57.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize13, streamUseCase4));
            SurfaceCombination surfaceCombination58 = new SurfaceCombination();
            surfaceCombination58.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize2, streamUseCase6));
            surfaceCombination58.addSurfaceConfig(Transition.AnonymousClass1.create(configType3, configSize13, streamUseCase4));
            SurfaceCombination surfaceCombination59 = new SurfaceCombination();
            surfaceCombination59.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize2, streamUseCase6));
            surfaceCombination59.addSurfaceConfig(Transition.AnonymousClass1.create(configType3, configSize2, streamUseCase6));
            SurfaceCombination surfaceCombination60 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination60, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase6), configType, configSize13, streamUseCase4);
            surfaceCombination60.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize13, streamUseCase5));
            SurfaceCombination surfaceCombination61 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination61, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase6), configType3, configSize13, streamUseCase4);
            surfaceCombination61.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize13, streamUseCase5));
            SurfaceCombination surfaceCombination62 = new SurfaceCombination();
            CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination62, Transition.AnonymousClass1.create(configType, configSize2, streamUseCase6), configType3, configSize2, streamUseCase6);
            surfaceCombination62.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize, streamUseCase5));
            arrayList4.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new SurfaceCombination[]{surfaceCombination49, surfaceCombination50, surfaceCombination51, surfaceCombination52, surfaceCombination53, surfaceCombination54, surfaceCombination55, surfaceCombination56, surfaceCombination57, surfaceCombination58, surfaceCombination59, surfaceCombination60, surfaceCombination61, surfaceCombination62}));
        }
        generateSurfaceSizeDefinition();
    }

    public static boolean checkSupported$default(SupportedSurfaceCombination supportedSurfaceCombination, FeatureSettings featureSettings, ArrayList arrayList) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        return supportedSurfaceCombination.checkSupported(featureSettings, arrayList, emptyMap, emptyList, emptyList);
    }

    public static Range getClosestSupportedDeviceFrameRate(Range range, int i, Range[] rangeArr) {
        Range range2 = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (Intrinsics.areEqual(range, range2)) {
            range2.getClass();
            return range2;
        }
        if (rangeArr == null) {
            range2.getClass();
            return range2;
        }
        Object lower = range.getLower();
        lower.getClass();
        Integer valueOf = Integer.valueOf(Math.min(((Number) lower).intValue(), i));
        Object upper = range.getUpper();
        upper.getClass();
        Range range3 = new Range(valueOf, Integer.valueOf(Math.min(((Number) upper).intValue(), i)));
        int length = rangeArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Range range4 = rangeArr[i2];
            if (i >= ((Number) range4.getLower()).intValue()) {
                if (Intrinsics.areEqual(range2, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    range2 = range4;
                    break;
                }
                try {
                    Range intersect = range4.intersect(range3);
                    intersect.getClass();
                    int rangeLength = getRangeLength(intersect);
                    if (i3 == 0) {
                        range2 = range4;
                        i3 = rangeLength;
                    } else if (rangeLength >= i3) {
                        range2.getClass();
                        Range intersect2 = range2.intersect(range3);
                        intersect2.getClass();
                        double rangeLength2 = getRangeLength(intersect2);
                        Range intersect3 = range4.intersect(range3);
                        intersect3.getClass();
                        double rangeLength3 = getRangeLength(intersect3);
                        double rangeLength4 = rangeLength3 / getRangeLength(range4);
                        double rangeLength5 = rangeLength2 / getRangeLength(range2);
                        if (rangeLength3 <= rangeLength2) {
                        }
                        Range intersect4 = range3.intersect(range2);
                        intersect4.getClass();
                        i3 = getRangeLength(intersect4);
                    }
                } catch (IllegalArgumentException unused) {
                    if (i3 == 0) {
                        int rangeDistance = getRangeDistance(range4, range3);
                        range2.getClass();
                        if (rangeDistance < getRangeDistance(range2, range3) || (getRangeDistance(range4, range3) == getRangeDistance(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || getRangeLength(range4) < getRangeLength(range2)))) {
                            range2 = range4;
                        }
                    }
                }
            }
            i2++;
        }
        range2.getClass();
        return range2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Size getMaxOutputSizeByFormat$camera_camera2(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Object failure;
        Size[] sizeArr;
        try {
            Result.Companion companion = Result.Companion;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (i != 34) {
            if (streamConfigurationMap != null) {
                failure = streamConfigurationMap.getOutputSizes(i);
                if (failure instanceof Result.Failure) {
                }
                sizeArr = (Size[]) failure;
                if (sizeArr != null) {
                }
                if (sizeArr != null) {
                }
                return null;
            }
            failure = null;
            if (failure instanceof Result.Failure) {
            }
            sizeArr = (Size[]) failure;
            if (sizeArr != null) {
            }
            if (sizeArr != null) {
            }
            return null;
        }
        if (streamConfigurationMap != null) {
            failure = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            sizeArr = (Size[]) failure;
            if (sizeArr != null) {
                sizeArr = null;
            } else if (rational != null) {
                ArrayList arrayList = new ArrayList();
                for (Size size : sizeArr) {
                    Rational rational2 = AspectRatioUtil.ASPECT_RATIO_4_3;
                    if (AspectRatioUtil.hasMatchingAspectRatio(size, rational, SizeUtil.RESOLUTION_VGA)) {
                        arrayList.add(size);
                    }
                }
                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
            }
            if (sizeArr != null || sizeArr.length == 0) {
                return null;
            }
            CompareSizesByArea compareSizesByArea = new CompareSizesByArea(false);
            List asList = Arrays.asList(sizeArr);
            asList.getClass();
            Size size2 = (Size) Collections.max(asList, compareSizesByArea);
            Size size3 = SizeUtil.RESOLUTION_ZERO;
            if (z) {
                Size[] highResolutionOutputSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(i) : null;
                if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                    List asList2 = Arrays.asList(highResolutionOutputSizes);
                    asList2.getClass();
                    size3 = (Size) Collections.max(asList2, compareSizesByArea);
                }
            }
            return (Size) Collections.max(CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{size2, size3}), compareSizesByArea);
        }
        failure = null;
        if (failure instanceof Result.Failure) {
        }
        sizeArr = (Size[]) failure;
        if (sizeArr != null) {
        }
        if (sizeArr != null) {
        }
        return null;
    }

    public static int getRangeDistance(Range range, Range range2) {
        if (range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) {
            a$$ExternalSyntheticBUOutline0.m$3("Ranges must not intersect");
            return 0;
        }
        if (((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue()) {
            int intValue = ((Number) range.getLower()).intValue();
            Object upper = range2.getUpper();
            upper.getClass();
            return intValue - ((Number) upper).intValue();
        }
        int intValue2 = ((Number) range2.getLower()).intValue();
        Object upper2 = range.getUpper();
        upper2.getClass();
        return intValue2 - ((Number) upper2).intValue();
    }

    public static int getRangeLength(Range range) {
        int intValue = ((Number) range.getUpper()).intValue();
        Object lower = range.getLower();
        lower.getClass();
        return (intValue - ((Number) lower).intValue()) + 1;
    }

    public static Range getUpdatedTargetFrameRate(Range range, Range range2, boolean z) {
        Range range3 = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (Intrinsics.areEqual(range2, range3) && Intrinsics.areEqual(range, range3)) {
            range3.getClass();
            return range3;
        }
        if (Intrinsics.areEqual(range2, range3)) {
            return range;
        }
        if (!Intrinsics.areEqual(range, range3)) {
            if (z) {
                TransactorKt.checkState("All targetFrameRate should be the same if strict fps is required", Intrinsics.areEqual(range, range2));
                return range;
            }
            try {
                Range intersect = range2.intersect(range);
                intersect.getClass();
                return intersect;
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    public final boolean checkSupported(FeatureSettings featureSettings, ArrayList arrayList, Map map, List list, List list2) {
        boolean z;
        Integer num;
        ArrayList arrayList2;
        List list3;
        boolean z2;
        Size size;
        Iterator it;
        UseCaseType useCaseType;
        Integer num2;
        VideoStabilization videoStabilization = featureSettings.videoStabilization;
        boolean z3 = featureSettings.requiresFeatureComboQuery;
        map.getClass();
        list.getClass();
        list2.getClass();
        LinkedHashMap linkedHashMap = this.featureSettingsToSupportedCombinationsMap;
        if (linkedHashMap.containsKey(featureSettings)) {
            Object obj = linkedHashMap.get(featureSettings);
            obj.getClass();
            list3 = (List) obj;
            z = z3;
            num = 2;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i = featureSettings.cameraMode;
            if (z3) {
                Lazy lazy = GuaranteedConfigurationsUtil.QUERYABLE_VIC_FCQ_COMBINATIONS$delegate;
                arrayList3.addAll(GuaranteedConfigurationsUtil.getQueryableFcqCombinations$camera_camera2(this.cameraMetadata, videoStabilization));
                z = z3;
                num = 2;
            } else if (featureSettings.isUltraHdrOn) {
                ArrayList arrayList4 = this.surfaceCombinationsUltraHdr;
                if (arrayList4.isEmpty()) {
                    Lazy lazy2 = GuaranteedConfigurationsUtil.QUERYABLE_VIC_FCQ_COMBINATIONS$delegate;
                    ArrayList arrayList5 = new ArrayList();
                    SurfaceCombination surfaceCombination = new SurfaceCombination();
                    StreamUseCase streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
                    SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.JPEG_R;
                    SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
                    StreamUseCase streamUseCase2 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
                    z = z3;
                    surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize, streamUseCase2));
                    arrayList5.add(surfaceCombination);
                    SurfaceCombination surfaceCombination2 = new SurfaceCombination();
                    num = 2;
                    CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination2, Transition.AnonymousClass1.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, streamUseCase2), configType, configSize, streamUseCase2);
                    arrayList5.add(surfaceCombination2);
                    arrayList4.addAll(arrayList5);
                } else {
                    z = z3;
                    num = 2;
                }
                if (i == 0) {
                    arrayList3.addAll(arrayList4);
                }
            } else {
                z = z3;
                num = 2;
                if (featureSettings.isHighSpeedOn) {
                    ArrayList arrayList6 = this.highSpeedSurfaceCombinations;
                    if (arrayList6.isEmpty()) {
                        HighSpeedResolver highSpeedResolver = this.highSpeedResolver;
                        if (((Boolean) highSpeedResolver.isHighSpeedSupported$delegate.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size2 = (Size) highSpeedResolver.maxSize$delegate.getValue();
                            if (size2 != null) {
                                AutoValue_SurfaceSizeDefinition updatedSurfaceSizeDefinitionByFormat = getUpdatedSurfaceSizeDefinitionByFormat(34);
                                Lazy lazy3 = GuaranteedConfigurationsUtil.QUERYABLE_VIC_FCQ_COMBINATIONS$delegate;
                                ArrayList arrayList7 = new ArrayList();
                                StreamUseCase streamUseCase3 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
                                SurfaceConfig transformSurfaceConfig = Transition.AnonymousClass1.transformSurfaceConfig(34, size2, updatedSurfaceSizeDefinitionByFormat, 0, SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, SurfaceConfig.DEFAULT_STREAM_USE_CASE);
                                SurfaceCombination surfaceCombination3 = new SurfaceCombination();
                                surfaceCombination3.addSurfaceConfig(transformSurfaceConfig);
                                arrayList7.add(surfaceCombination3);
                                SurfaceCombination surfaceCombination4 = new SurfaceCombination();
                                surfaceCombination4.addSurfaceConfig(transformSurfaceConfig);
                                surfaceCombination4.addSurfaceConfig(transformSurfaceConfig);
                                arrayList7.add(surfaceCombination4);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList3.addAll(arrayList6);
                } else {
                    int i2 = featureSettings.requiredMaxBitDepth;
                    if (i2 == 8) {
                        if (i != 1) {
                            ArrayList arrayList8 = this.surfaceCombinations;
                            if (i != 2) {
                                if (videoStabilization == VideoStabilization.PREVIEW) {
                                    arrayList8 = this.previewStabilizationSurfaceCombinations;
                                }
                                arrayList3.addAll(arrayList8);
                            } else {
                                arrayList3.addAll(this.ultraHighSurfaceCombinations);
                                arrayList3.addAll(arrayList8);
                            }
                        } else {
                            arrayList2 = this.concurrentSurfaceCombinations;
                            linkedHashMap.put(featureSettings, arrayList2);
                            list3 = arrayList2;
                        }
                    } else if (i2 == 10 && i == 0) {
                        arrayList3.addAll(this.surfaceCombinations10Bit);
                    }
                }
            }
            arrayList2 = arrayList3;
            linkedHashMap.put(featureSettings, arrayList2);
            list3 = arrayList2;
        }
        List list4 = list3;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((SurfaceCombination) it2.next()).getOrderedSupportedSurfaceConfigList(arrayList) != null) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z2 || !z) {
            return z2;
        }
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        Iterator it3 = arrayList.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            SurfaceConfig surfaceConfig = (SurfaceConfig) next;
            AutoValue_SurfaceSizeDefinition updatedSurfaceSizeDefinitionByFormat2 = getUpdatedSurfaceSizeDefinitionByFormat(surfaceConfig.imageFormat);
            LinkedHashMap linkedHashMap2 = updatedSurfaceSizeDefinitionByFormat2.maximumSizeMap;
            int i5 = surfaceConfig.imageFormat;
            SurfaceConfig.ConfigSize configSize2 = surfaceConfig.configSize;
            int ordinal = configSize2.ordinal();
            if (ordinal != 3) {
                switch (ordinal) {
                    case 9:
                        size = updatedSurfaceSizeDefinitionByFormat2.recordSize;
                        break;
                    case 10:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case 11:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case 12:
                        size = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case 13:
                        size = (Size) updatedSurfaceSizeDefinitionByFormat2.ultraMaximumSizeMap.get(Integer.valueOf(i5));
                        break;
                    case 14:
                        a$$ExternalSyntheticBUOutline0.m$1("Not supported config size");
                        return false;
                    default:
                        size = configSize2.relatedFixedSize;
                        break;
                }
            } else {
                size = updatedSurfaceSizeDefinitionByFormat2.previewSize;
            }
            size.getClass();
            UseCaseConfig useCaseConfig = (UseCaseConfig) list.get(((Number) list2.get(i3)).intValue());
            Object obj2 = map.get(surfaceConfig);
            if (obj2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return false;
            }
            DynamicRange dynamicRange = (DynamicRange) obj2;
            useCaseConfig.getClass();
            FeatureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1 featureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1 = new FeatureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1(useCaseConfig.getInputFormat(), size);
            UseCaseType.Companion.getClass();
            int ordinal2 = useCaseConfig.getCaptureType().ordinal();
            if (ordinal2 != 0) {
                it = it3;
                useCaseType = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? UseCaseType.UNDEFINED : UseCaseType.STREAM_SHARING : UseCaseType.VIDEO_CAPTURE : UseCaseType.IMAGE_ANALYSIS : UseCaseType.PREVIEW;
            } else {
                it = it3;
                useCaseType = UseCaseType.IMAGE_CAPTURE;
            }
            Class cls = useCaseType.surfaceClass;
            if (cls != null) {
                featureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1.mContainerClass = cls;
            }
            SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(useCaseConfig, size);
            TraceParser traceParser = createFrom.mCaptureConfigBuilder;
            createFrom.addSurface(featureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1, dynamicRange, -1);
            Range range = featureSettings.targetFpsRange;
            if (Intrinsics.areEqual(range, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                range = null;
            }
            if (range == null) {
                range = FpsRangeFeature.DEFAULT_FPS_RANGE;
            }
            traceParser.getClass();
            ((MutableOptionsBundle) traceParser.projectPackages).insertOption(CaptureConfig.OPTION_RESOLVED_FRAME_RATE, range);
            if (videoStabilization == VideoStabilization.PREVIEW) {
                traceParser.getClass();
                num2 = num;
                ((MutableOptionsBundle) traceParser.projectPackages).insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, num2);
            } else {
                num2 = num;
                if (videoStabilization == VideoStabilization.ON) {
                    traceParser.getClass();
                    ((MutableOptionsBundle) traceParser.projectPackages).insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, num2);
                }
            }
            validatingBuilder.add(createFrom.build());
            boolean isValid = validatingBuilder.isValid();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(useCaseConfig);
            sb.append(" with ");
            sb.append(surfaceConfig);
            sb.append(" due to [");
            sb.append(!validatingBuilder.mTemplateSet ? "Template is not set" : validatingBuilder.mInvalidReason.toString());
            sb.append("]; surfaceConfigList = ");
            sb.append(arrayList);
            sb.append(", featureSettings = ");
            sb.append(featureSettings);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list);
            TransactorKt.checkState(sb.toString(), isValid);
            i3 = i4;
            num = num2;
            it3 = it;
        }
        SessionConfig build = validatingBuilder.build();
        boolean isSupported = this.featureCombinationQuery.isSupported(build);
        List surfaces = build.getSurfaces();
        surfaces.getClass();
        Iterator it4 = surfaces.iterator();
        while (it4.hasNext()) {
            ((DeferrableSurface) it4.next()).close();
        }
        return isSupported;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0 != null) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void generateSurfaceSizeDefinition() {
        Object failure;
        Size[] sizeArr;
        Size size;
        Size previewSize = this.displayInfoManager.getPreviewSize();
        try {
            Integer.parseInt(this.cameraId);
            size = getRecordSizeFromCamcorderProfile();
        } catch (NumberFormatException unused) {
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.streamConfigurationMapCompat.impl.mClientFragmentManager;
        try {
            Result.Companion companion = Result.Companion;
            failure = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(MediaRecorder.class) : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        sizeArr = (Size[]) failure;
        if (sizeArr != null) {
            Arrays.sort(sizeArr, new CompareSizesByArea(true));
            for (Size size2 : sizeArr) {
                int width = size2.getWidth();
                Size size3 = SizeUtil.RESOLUTION_1080P;
                if (width <= size3.getWidth() && size2.getHeight() <= size3.getHeight()) {
                    size = size2;
                    break;
                }
            }
        }
        size = null;
        if (size == null) {
            size = SizeUtil.RESOLUTION_480P;
            size.getClass();
        }
        this.surfaceSizeDefinition = new AutoValue_SurfaceSizeDefinition(SizeUtil.RESOLUTION_VGA, new LinkedHashMap(), previewSize, new LinkedHashMap(), size, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
        if (failure instanceof Result.Failure) {
        }
        sizeArr = (Size[]) failure;
        if (sizeArr != null) {
        }
        size = null;
        if (size == null) {
        }
        this.surfaceSizeDefinition = new AutoValue_SurfaceSizeDefinition(SizeUtil.RESOLUTION_VGA, new LinkedHashMap(), previewSize, new LinkedHashMap(), size, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }

    public final int getMaxFrameRate(int i, Size size, boolean z, int i2) {
        long j;
        int i3 = 0;
        if (!z) {
            StreamConfigurationMapCompat streamConfigurationMapCompat = getStreamConfigurationMapCompat();
            size.getClass();
            try {
                j = streamConfigurationMapCompat.impl.getOutputMinFrameDuration(i, size);
            } catch (RuntimeException e) {
                if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                    Log.w("CXCP", "Unable to get min frame duration for format = " + i + " and size = " + size, e);
                }
                j = 0;
            }
            if (j > 0) {
                i3 = (int) (1.0E9d / j);
            } else if (!this.isManualSensorSupported) {
                i3 = Integer.MAX_VALUE;
            } else if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "minFrameDuration: " + j + " is invalid for imageFormat = " + i + ", size = " + size);
            }
        } else {
            if (i != 34) {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return 0;
            }
            HighSpeedResolver highSpeedResolver = this.highSpeedResolver;
            highSpeedResolver.getClass();
            size.getClass();
            List highSpeedVideoFpsRangesFor = highSpeedResolver.getHighSpeedVideoFpsRangesFor(size);
            if (highSpeedVideoFpsRangesFor.isEmpty()) {
                highSpeedVideoFpsRangesFor = null;
            }
            if (highSpeedVideoFpsRangesFor == null) {
                StringUtilsKt.w("HighSpeedResolver", "No supported high speed  fps for " + size);
            } else {
                Iterator it = highSpeedVideoFpsRangesFor.iterator();
                if (!it.hasNext()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return 0;
                }
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                num.getClass();
                i3 = num.intValue();
            }
        }
        return Math.min(i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        r2 = kotlin.LazyKt.lazy(new androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0(2, r11, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        if (r3 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ce, code lost:
    
        if (((java.lang.Boolean) r2.getValue()).booleanValue() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List getOrderedSupportedStreamUseCaseSurfaceConfigList(FeatureSettings featureSettings, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        List list;
        AutoValue_Config_Option autoValue_Config_Option = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
        if (featureSettings.cameraMode == 0 && featureSettings.requiredMaxBitDepth == 8 && !featureSettings.isHighSpeedOn) {
            Iterator it = this.surfaceCombinationsStreamUseCase.iterator();
            while (it.hasNext()) {
                List orderedSupportedSurfaceConfigList = ((SurfaceCombination) it.next()).getOrderedSupportedSurfaceConfigList(arrayList);
                if (orderedSupportedSurfaceConfigList != null) {
                    AutoValue_Config_Option autoValue_Config_Option2 = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
                    int size = orderedSupportedSurfaceConfigList.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        long j = ((SurfaceConfig) orderedSupportedSurfaceConfigList.get(i)).streamUseCase.value;
                        boolean containsKey = linkedHashMap.containsKey(Integer.valueOf(i));
                        UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.STREAM_SHARING;
                        if (containsKey) {
                            AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo = (AutoValue_AttachedSurfaceInfo) linkedHashMap.get(Integer.valueOf(i));
                            autoValue_AttachedSurfaceInfo.getClass();
                            List list2 = autoValue_AttachedSurfaceInfo.captureTypes;
                            if (list2.size() == 1) {
                                captureType = (UseCaseConfigFactory.CaptureType) list2.get(0);
                            }
                            captureType.getClass();
                            if (!StreamUseCaseUtil.isEligibleCaptureType(captureType, j, list2)) {
                                break;
                            }
                            i++;
                        } else {
                            if (!linkedHashMap2.containsKey(Integer.valueOf(i))) {
                                a$$ExternalSyntheticBUOutline0.m$1((Object) "SurfaceConfig does not map to any use case");
                                return null;
                            }
                            Object obj = linkedHashMap2.get(Integer.valueOf(i));
                            obj.getClass();
                            UseCaseConfig useCaseConfig = (UseCaseConfig) obj;
                            UseCaseConfigFactory.CaptureType captureType2 = useCaseConfig.getCaptureType();
                            captureType2.getClass();
                            if (useCaseConfig.getCaptureType() == captureType) {
                                list = (List) ((StreamSharingConfig) useCaseConfig).retrieveOption(StreamSharingConfig.OPTION_CAPTURE_TYPES);
                                list.getClass();
                            } else {
                                list = EmptyList.INSTANCE;
                            }
                            if (!StreamUseCaseUtil.isEligibleCaptureType(captureType2, j, list)) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final Size getRecordSizeFromCamcorderProfile() {
        EncoderProfilesProxy all;
        Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 13, 10, 8, 12, 6, 5, 4}).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            EncoderProfilesProvider encoderProfilesProvider = this.encoderProfilesProvider;
            if (encoderProfilesProvider.hasProfile(intValue) && (all = encoderProfilesProvider.getAll(intValue)) != null) {
                List videoProfiles = all.getVideoProfiles();
                videoProfiles.getClass();
                if (!videoProfiles.isEmpty()) {
                    Object obj = all.getVideoProfiles().get(0);
                    obj.getClass();
                    return ((AutoValue_EncoderProfilesProxy_VideoProfileProxy) obj).getResolution();
                }
            }
        }
        return null;
    }

    public final StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        CameraMetadata cameraMetadata = this.cameraMetadata;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((Camera2CameraMetadata) cameraMetadata).get(key);
        if (streamConfigurationMap != null) {
            return new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(cameraMetadata));
        }
        a$$ExternalSyntheticBUOutline0.m$3("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final ArrayList getSurfaceConfigList(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo = (AutoValue_AttachedSurfaceInfo) it.next();
            arrayList3.add(autoValue_AttachedSurfaceInfo.surfaceConfig);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), autoValue_AttachedSurfaceInfo);
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            Size size = (Size) it2.next();
            UseCaseConfig useCaseConfig = (UseCaseConfig) list2.get(((Number) arrayList2.get(i2)).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
            StreamUseCase streamUseCase2 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
            arrayList3.add(Transition.AnonymousClass1.transformSurfaceConfig(inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat), i, z ? SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE : SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), useCaseConfig);
            i2 = i3;
        }
        return arrayList3;
    }

    public final AutoValue_SurfaceSizeDefinition getSurfaceSizeDefinition$camera_camera2() {
        AutoValue_SurfaceSizeDefinition autoValue_SurfaceSizeDefinition = this.surfaceSizeDefinition;
        if (autoValue_SurfaceSizeDefinition != null) {
            return autoValue_SurfaceSizeDefinition;
        }
        Intrinsics.throwUninitializedPropertyAccessException("surfaceSizeDefinition");
        throw null;
    }

    public final AutoValue_SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int i) {
        Size maxOutputSizeByFormat$camera_camera2;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.surfaceSizeDefinitionFormats;
        if (!arrayList.contains(valueOf)) {
            LinkedHashMap linkedHashMap = getSurfaceSizeDefinition$camera_camera2().s720pSizeMap;
            Size size = SizeUtil.RESOLUTION_720P;
            size.getClass();
            updateS720pOrS1440pSizeByFormat(linkedHashMap, size, i);
            LinkedHashMap linkedHashMap2 = getSurfaceSizeDefinition$camera_camera2().s1440pSizeMap;
            Size size2 = SizeUtil.RESOLUTION_1440P;
            size2.getClass();
            updateS720pOrS1440pSizeByFormat(linkedHashMap2, size2, i);
            updateMaximumSizeByFormat(getSurfaceSizeDefinition$camera_camera2().maximumSizeMap, i, null);
            updateMaximumSizeByFormat(getSurfaceSizeDefinition$camera_camera2().maximum4x3SizeMap, i, AspectRatioUtil.ASPECT_RATIO_4_3);
            updateMaximumSizeByFormat(getSurfaceSizeDefinition$camera_camera2().maximum16x9SizeMap, i, AspectRatioUtil.ASPECT_RATIO_16_9);
            LinkedHashMap linkedHashMap3 = getSurfaceSizeDefinition$camera_camera2().ultraMaximumSizeMap;
            if (Build.VERSION.SDK_INT >= 31 && this.isUltraHighResolutionSensorSupported) {
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                key.getClass();
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((Camera2CameraMetadata) this.cameraMetadata).get(key);
                if (streamConfigurationMap != null && (maxOutputSizeByFormat$camera_camera2 = getMaxOutputSizeByFormat$camera_camera2(streamConfigurationMap, i, true, null)) != null) {
                    linkedHashMap3.put(Integer.valueOf(i), maxOutputSizeByFormat$camera_camera2);
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        return getSurfaceSizeDefinition$camera_camera2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0412, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r52v0, types: [java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SurfaceStreamSpecQueryResult resolveSpecsBySettings(FeatureSettings featureSettings, ArrayList arrayList, Map map, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        boolean z;
        CameraMetadata cameraMetadata;
        List list2;
        int i;
        boolean z2;
        int i2;
        LinkedHashMap linkedHashMap2;
        CameraMetadata cameraMetadata2;
        String str;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap3;
        List list3;
        ArrayList arrayList3;
        List list4;
        LinkedHashMap linkedHashMap4;
        LinkedHashMap linkedHashMap5;
        int i3;
        FeatureSettings featureSettings2;
        ?? r38;
        String str4;
        HighSpeedResolver highSpeedResolver;
        List<UseCaseConfig> list5;
        int i4;
        List list6;
        List list7;
        LinkedHashMap linkedHashMap6;
        Range[] rangeArr;
        DynamicRange dynamicRange;
        List list8;
        Size size;
        Iterator it;
        ArrayList<Size> arrayList4;
        Size verifiedResolution;
        SupportedSurfaceCombination supportedSurfaceCombination = this;
        FeatureSettings featureSettings3 = featureSettings;
        Map map2 = map;
        boolean z3 = featureSettings3.isHighSpeedOn;
        String str5 = "CXCP";
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: featureSettings = " + featureSettings3);
        }
        boolean z4 = featureSettings3.isFeatureComboInvocation;
        Range range = featureSettings3.targetFpsRange;
        String str6 = ". New configs: ";
        String str7 = supportedSurfaceCombination.cameraId;
        String str8 = "No supported surface combination is found for camera device - Id : ";
        if (z4) {
            z = z4;
        } else {
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((AutoValue_AttachedSurfaceInfo) it2.next()).surfaceConfig);
            }
            CompareSizesByArea compareSizesByArea = new CompareSizesByArea(false);
            for (UseCaseConfig useCaseConfig : map2.keySet()) {
                boolean z5 = z4;
                List list9 = (List) map2.get(useCaseConfig);
                if (list9 == null || list9.isEmpty()) {
                    Path$$ExternalSyntheticBUOutline0.m$1("No available output size is found for ", 46, useCaseConfig);
                    return null;
                }
                Size size2 = (Size) Collections.min(list9, compareSizesByArea);
                int inputFormat = useCaseConfig.getInputFormat();
                StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
                StreamUseCase streamUseCase2 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
                size2.getClass();
                arrayList5.add(Transition.AnonymousClass1.transformSurfaceConfig(inputFormat, size2, supportedSurfaceCombination.getUpdatedSurfaceSizeDefinitionByFormat(inputFormat), featureSettings3.cameraMode, SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase));
                z4 = z5;
            }
            z = z4;
            if (!checkSupported$default(supportedSurfaceCombination, featureSettings3, arrayList5)) {
                StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(arrayList, "No supported surface combination is found for camera device - Id : ", str7, ". May be attempting to bind too many use cases. Existing surfaces: ", ". New configs: ");
                m.append(list);
                m.append(". GroupableFeature settings: ");
                m.append(featureSettings3);
                m.append('.');
                throw new IllegalArgumentException(m.toString().toString());
            }
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        Iterator it3 = map2.keySet().iterator();
        Map map3 = map2;
        while (true) {
            Iterator it4 = it3;
            if (!it3.hasNext()) {
                break;
            }
            UseCaseConfig useCaseConfig2 = (UseCaseConfig) it4.next();
            ArrayList arrayList6 = new ArrayList();
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            Object obj = map3.get(useCaseConfig2);
            obj.getClass();
            for (Size size3 : (List) obj) {
                int inputFormat2 = useCaseConfig2.getInputFormat();
                String str9 = str6;
                int customMaxFrameRate = useCaseConfig2.getCustomMaxFrameRate(size3);
                StreamUseCase streamUseCase3 = useCaseConfig2.getStreamUseCase();
                StreamUseCase streamUseCase4 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
                String str10 = str7;
                SurfaceConfig.ConfigSize configSize = Transition.AnonymousClass1.transformSurfaceConfig(inputFormat2, size3, supportedSurfaceCombination.getUpdatedSurfaceSizeDefinitionByFormat(inputFormat2), featureSettings3.cameraMode, featureSettings3.requiresFeatureComboQuery ? SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE : SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase3).configSize;
                String str11 = str8;
                Range range2 = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                int maxFrameRate = Intrinsics.areEqual(range, range2) ? Integer.MAX_VALUE : supportedSurfaceCombination.getMaxFrameRate(inputFormat2, size3, z3, customMaxFrameRate);
                if (!z || (configSize != SurfaceConfig.ConfigSize.NOT_SUPPORT && (Intrinsics.areEqual(range, range2) || maxFrameRate >= ((Number) range.getUpper()).intValue()))) {
                    Set set = (Set) linkedHashMap8.get(configSize);
                    if (set == null) {
                        set = new LinkedHashSet();
                        linkedHashMap8.put(configSize, set);
                    }
                    if (!set.contains(Integer.valueOf(maxFrameRate))) {
                        arrayList6.add(size3);
                        set.add(Integer.valueOf(maxFrameRate));
                    }
                }
                str6 = str9;
                str7 = str10;
                str8 = str11;
            }
            linkedHashMap7.put(useCaseConfig2, arrayList6);
            map3 = map;
            it3 = it4;
        }
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        ArrayList arrayList7 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it5.hasNext();
            cameraMetadata = supportedSurfaceCombination.cameraMetadata;
            if (!hasNext) {
                break;
            }
            int intValue = ((Number) it5.next()).intValue();
            Object obj2 = linkedHashMap7.get(list.get(intValue));
            obj2.getClass();
            List<Size> list10 = (List) obj2;
            int inputFormat3 = ((UseCaseConfig) list.get(intValue)).getInputFormat();
            supportedSurfaceCombination.targetAspectRatio.getClass();
            cameraMetadata.getClass();
            StreamConfigurationMapCompat streamConfigurationMapCompat = supportedSurfaceCombination.streamConfigurationMapCompat;
            streamConfigurationMapCompat.getClass();
            Rational rational = ((((Nexus4AndroidLTargetAspectRatioQuirk) DeviceQuirks.getAll().get(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) new CameraQuirks(cameraMetadata, streamConfigurationMapCompat).getQuirks().get(AspectRatioLegacyApi21Quirk.class)) == null) || (size = (Size) supportedSurfaceCombination.getUpdatedSurfaceSizeDefinitionByFormat(256).maximumSizeMap.get(256)) == null) ? null : new Rational(size.getWidth(), size.getHeight());
            if (rational == null) {
                arrayList4 = new ArrayList(list10);
                it = it5;
            } else {
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                for (Size size4 : list10) {
                    Rational rational2 = AspectRatioUtil.ASPECT_RATIO_4_3;
                    Iterator it6 = it5;
                    if (AspectRatioUtil.hasMatchingAspectRatio(size4, rational, SizeUtil.RESOLUTION_VGA)) {
                        arrayList8.add(size4);
                    } else {
                        arrayList9.add(size4);
                    }
                    it5 = it6;
                }
                it = it5;
                arrayList9.addAll(0, arrayList8);
                arrayList4 = arrayList9;
            }
            StreamUseCase streamUseCase5 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
            SurfaceConfig.ConfigType configType = (SurfaceConfig.ConfigType) SurfaceConfig.CONFIG_TYPES_BY_IMAGE_FORMAT.get(Integer.valueOf(inputFormat3));
            if (configType == null) {
                configType = SurfaceConfig.ConfigType.PRIV;
            }
            BiometricPrompt biometricPrompt = supportedSurfaceCombination.resolutionCorrector;
            biometricPrompt.getClass();
            if (((ExtraCroppingQuirk) biometricPrompt.mClientFragmentManager) != null && (verifiedResolution = ExtraCroppingQuirk.getVerifiedResolution(configType)) != null) {
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(verifiedResolution);
                for (Size size5 : arrayList4) {
                    if (!Intrinsics.areEqual(size5, verifiedResolution)) {
                        arrayList10.add(size5);
                    }
                }
                arrayList4 = arrayList10;
            }
            arrayList7.add(arrayList4);
            it5 = it;
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        HighSpeedResolver highSpeedResolver2 = supportedSurfaceCombination.highSpeedResolver;
        if (z3) {
            highSpeedResolver2.getClass();
            if (arrayList7.isEmpty()) {
                list8 = EmptyList.INSTANCE;
            } else {
                List findCommonElements = HighSpeedResolver.findCommonElements(arrayList7);
                ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(findCommonElements, 10));
                Iterator it7 = findCommonElements.iterator();
                while (it7.hasNext()) {
                    Size size6 = (Size) it7.next();
                    int size7 = arrayList7.size();
                    Iterator it8 = it7;
                    ArrayList arrayList12 = new ArrayList(size7);
                    for (int i5 = 0; i5 < size7; i5++) {
                        arrayList12.add(size6);
                    }
                    arrayList11.add(arrayList12);
                    it7 = it8;
                }
                list8 = arrayList11;
            }
            list2 = list8;
        } else {
            Iterator it9 = arrayList7.iterator();
            int i6 = 1;
            while (it9.hasNext()) {
                i6 *= ((List) it9.next()).size();
            }
            if (i6 == 0) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed to find supported resolutions.");
                return null;
            }
            ArrayList arrayList13 = new ArrayList();
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList13.add(new ArrayList());
            }
            int size8 = i6 / ((List) arrayList7.get(0)).size();
            int size9 = arrayList7.size();
            int i8 = i6;
            int i9 = size8;
            int i10 = 0;
            while (i10 < size9) {
                int i11 = size9;
                List list11 = (List) arrayList7.get(i10);
                LinkedHashMap linkedHashMap11 = linkedHashMap9;
                int i12 = 0;
                while (i12 < i6) {
                    ((List) arrayList13.get(i12)).add(list11.get((i12 % i8) / i9));
                    i12++;
                    arrayList13 = arrayList13;
                    i6 = i6;
                }
                ArrayList arrayList14 = arrayList13;
                int i13 = i6;
                if (i10 < arrayList7.size() - 1) {
                    i8 = i9;
                    i9 /= ((List) arrayList7.get(i10 + 1)).size();
                }
                i10++;
                size9 = i11;
                linkedHashMap9 = linkedHashMap11;
                arrayList13 = arrayList14;
                i6 = i13;
            }
            list2 = arrayList13;
        }
        LinkedHashMap linkedHashMap12 = linkedHashMap9;
        AutoValue_Config_Option autoValue_Config_Option = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
        Iterator it10 = arrayList.iterator();
        while (true) {
            if (it10.hasNext()) {
                AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo = (AutoValue_AttachedSurfaceInfo) it10.next();
                List list12 = autoValue_AttachedSurfaceInfo.captureTypes;
                list12.getClass();
                i = 0;
                UseCaseConfigFactory.CaptureType captureType = (UseCaseConfigFactory.CaptureType) list12.get(0);
                Config config = autoValue_AttachedSurfaceInfo.implementationOptions;
                config.getClass();
                captureType.getClass();
                if (StreamUseCaseUtil.isZslUseCase(config, captureType)) {
                    break;
                }
            } else {
                i = 0;
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    UseCaseConfig useCaseConfig3 = (UseCaseConfig) it11.next();
                    UseCaseConfigFactory.CaptureType captureType2 = useCaseConfig3.getCaptureType();
                    captureType2.getClass();
                    if (StreamUseCaseUtil.isZslUseCase(useCaseConfig3, captureType2)) {
                    }
                }
                z2 = false;
            }
        }
        if (!supportedSurfaceCombination.isStreamUseCaseSupported || z2) {
            i2 = i;
            linkedHashMap2 = linkedHashMap10;
            cameraMetadata2 = cameraMetadata;
            str = str12;
            str2 = str13;
            str3 = str14;
            linkedHashMap3 = linkedHashMap12;
            list3 = null;
        } else {
            Iterator it12 = list2.iterator();
            list3 = null;
            while (true) {
                if (!it12.hasNext()) {
                    i2 = i;
                    linkedHashMap2 = linkedHashMap10;
                    cameraMetadata2 = cameraMetadata;
                    str = str12;
                    str2 = str13;
                    str3 = str14;
                    linkedHashMap3 = linkedHashMap12;
                    break;
                }
                i2 = i;
                cameraMetadata2 = cameraMetadata;
                str = str12;
                str2 = str13;
                str3 = str14;
                LinkedHashMap linkedHashMap13 = linkedHashMap12;
                linkedHashMap3 = linkedHashMap13;
                linkedHashMap2 = linkedHashMap10;
                list3 = supportedSurfaceCombination.getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettings3, supportedSurfaceCombination.getSurfaceConfigList(featureSettings3.cameraMode, arrayList, (List) it12.next(), list, arrayList2, linkedHashMap13, linkedHashMap10, false), linkedHashMap3, linkedHashMap2);
                if (list3 != null) {
                    break;
                }
                linkedHashMap3.clear();
                linkedHashMap2.clear();
                linkedHashMap12 = linkedHashMap3;
                linkedHashMap10 = linkedHashMap2;
                i = i2;
                cameraMetadata = cameraMetadata2;
                str12 = str;
                str13 = str2;
                str14 = str3;
            }
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "orderedSurfaceConfigListForStreamUseCase = " + list3);
            }
        }
        Iterator it13 = arrayList.iterator();
        int i14 = Integer.MAX_VALUE;
        while (it13.hasNext()) {
            AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo2 = (AutoValue_AttachedSurfaceInfo) it13.next();
            i14 = Math.min(i14, supportedSurfaceCombination.getMaxFrameRate(autoValue_AttachedSurfaceInfo2.imageFormat, autoValue_AttachedSurfaceInfo2.size, z3, autoValue_AttachedSurfaceInfo2.customMaxFrameRate));
        }
        Iterator it14 = list2.iterator();
        List list13 = null;
        List list14 = null;
        int i15 = i2;
        int i16 = i15;
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MAX_VALUE;
        while (true) {
            if (!it14.hasNext()) {
                arrayList3 = arrayList2;
                list4 = list3;
                linkedHashMap4 = linkedHashMap3;
                linkedHashMap5 = linkedHashMap2;
                i3 = i17;
                featureSettings2 = featureSettings3;
                r38 = z3;
                str4 = str5;
                highSpeedResolver = highSpeedResolver2;
                list5 = list;
                i4 = i18;
                list6 = list13;
                list7 = list14;
                break;
            }
            List list15 = (List) it14.next();
            int i19 = i18;
            LinkedHashMap linkedHashMap14 = new LinkedHashMap();
            LinkedHashMap linkedHashMap15 = new LinkedHashMap();
            List list16 = list3;
            int i20 = featureSettings3.cameraMode;
            boolean z6 = featureSettings3.requiresFeatureComboQuery;
            str4 = str5;
            linkedHashMap4 = linkedHashMap3;
            i3 = i17;
            int i21 = i14;
            linkedHashMap5 = linkedHashMap2;
            List list17 = list;
            highSpeedResolver = highSpeedResolver2;
            ArrayList surfaceConfigList = supportedSurfaceCombination.getSurfaceConfigList(i20, arrayList, list15, list17, arrayList2, linkedHashMap14, linkedHashMap15, z6);
            Iterator it15 = list15.iterator();
            int i22 = i21;
            int i23 = i2;
            while (it15.hasNext()) {
                int i24 = i23 + 1;
                Iterator it16 = it15;
                Size size10 = (Size) it15.next();
                UseCaseConfig useCaseConfig4 = (UseCaseConfig) list17.get(((Number) arrayList2.get(i23)).intValue());
                i22 = Math.min(i22, supportedSurfaceCombination.getMaxFrameRate(useCaseConfig4.getInputFormat(), size10, z3, useCaseConfig4.getCustomMaxFrameRate(size10)));
                list17 = list;
                i23 = i24;
                it15 = it16;
            }
            int i25 = (Intrinsics.areEqual(range, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) || i22 >= i21 || i22 >= ((Number) range.getUpper()).intValue()) ? 1 : i2;
            LinkedHashMap linkedHashMap16 = new LinkedHashMap();
            Iterator it17 = surfaceConfigList.iterator();
            int i26 = i2;
            while (it17.hasNext()) {
                Object next = it17.next();
                int i27 = i26 + 1;
                if (i26 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                SurfaceConfig surfaceConfig = (SurfaceConfig) next;
                Iterator it18 = it17;
                AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo3 = (AutoValue_AttachedSurfaceInfo) linkedHashMap14.get(Integer.valueOf(i26));
                if (autoValue_AttachedSurfaceInfo3 == null || (dynamicRange = autoValue_AttachedSurfaceInfo3.dynamicRange) == null) {
                    Object obj3 = linkedHashMap.get(linkedHashMap15.get(Integer.valueOf(i26)));
                    if (obj3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    dynamicRange = (DynamicRange) obj3;
                }
                linkedHashMap16.put(surfaceConfig, dynamicRange);
                it17 = it18;
                i26 = i27;
            }
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            int i28 = i22;
            boolean z7 = z3;
            list4 = list16;
            featureSettings2 = featureSettings;
            StateFlowKt$$ExternalSyntheticLambda3 stateFlowKt$$ExternalSyntheticLambda3 = new StateFlowKt$$ExternalSyntheticLambda3(this, featureSettings2, surfaceConfigList, linkedHashMap16, list, arrayList2, 1);
            supportedSurfaceCombination = this;
            list5 = list;
            arrayList3 = arrayList2;
            Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) stateFlowKt$$ExternalSyntheticLambda3);
            if (i15 == 0 && ((Boolean) lazy.getValue()).booleanValue()) {
                if (i3 == Integer.MAX_VALUE || i3 < i28) {
                    i3 = i28;
                    list13 = list15;
                }
                if (i25 != 0) {
                    if (i16 != 0) {
                        i3 = i28;
                        i4 = i19;
                        list7 = list14;
                        list6 = list15;
                        r38 = z7;
                        break;
                    }
                    i3 = i28;
                    i15 = 1;
                    list13 = list15;
                }
            }
            if (list4 == null || i16 != 0 || supportedSurfaceCombination.getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettings2, surfaceConfigList, linkedHashMap14, linkedHashMap15) == null) {
                featureSettings3 = featureSettings2;
                i17 = i3;
                i18 = i19;
            } else {
                if (i19 != Integer.MAX_VALUE && i19 >= i28) {
                    i18 = i19;
                } else {
                    i18 = i28;
                    list14 = list15;
                }
                if (i25 == 0) {
                    featureSettings3 = featureSettings2;
                    i17 = i3;
                } else {
                    if (i15 != 0) {
                        i4 = i28;
                        list6 = list13;
                        list7 = list15;
                        r38 = z7;
                        break;
                    }
                    featureSettings3 = featureSettings2;
                    i17 = i3;
                    i18 = i28;
                    i16 = 1;
                    highSpeedResolver2 = highSpeedResolver;
                    str5 = str4;
                    i14 = i21;
                    linkedHashMap3 = linkedHashMap4;
                    linkedHashMap2 = linkedHashMap5;
                    list14 = list15;
                    z3 = z7 ? 1 : 0;
                    list3 = list4;
                }
            }
            highSpeedResolver2 = highSpeedResolver;
            str5 = str4;
            i14 = i21;
            linkedHashMap3 = linkedHashMap4;
            linkedHashMap2 = linkedHashMap5;
            z3 = z7 ? 1 : 0;
            list3 = list4;
        }
        BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs = (list6 != null && (!z || Intrinsics.areEqual(range, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) || (i3 != Integer.MAX_VALUE && i3 >= ((Number) range.getUpper()).intValue()))) ? new BestSizesAndMaxFpsForConfigs(list6, list7, i3, i4, Integer.MAX_VALUE) : null;
        if (bestSizesAndMaxFpsForConfigs == null) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m(str3, str2, " and Hardware level: ");
            m3m.append(supportedSurfaceCombination.hardwareLevel);
            m3m.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            m3m.append(arrayList);
            m3m.append(str);
            Path$$ExternalSyntheticBUOutline0.m$1((Object) CameraState$Type$EnumUnboxingLocalUtility.m(m3m, list5, '.'));
            return null;
        }
        int i29 = bestSizesAndMaxFpsForConfigs.maxFpsForBestSizes;
        List list18 = bestSizesAndMaxFpsForConfigs.bestSizes;
        String str15 = str4;
        if (StringUtilsKt.isLogLevelEnabled(3, str15)) {
            Log.d(str15, "resolveSpecsBySettings: bestSizesAndFps = " + bestSizesAndMaxFpsForConfigs);
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        Range range3 = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (Intrinsics.areEqual(range, range3)) {
            HighSpeedResolver highSpeedResolver3 = highSpeedResolver;
            if (r38 != 0) {
                range3 = getClosestSupportedDeviceFrameRate(HighSpeedResolver.DEFAULT_FPS, i29, highSpeedResolver3.getFrameRateRangesFor(list18));
            }
        } else {
            if (r38 != 0) {
                rangeArr = highSpeedResolver.getFrameRateRangesFor(list18);
            } else {
                CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                key.getClass();
                rangeArr = (Range[]) ((Camera2CameraMetadata) cameraMetadata2).get(key);
            }
            Range closestSupportedDeviceFrameRate = getClosestSupportedDeviceFrameRate(range, i29, rangeArr);
            if ((z || featureSettings2.isStrictFpsRequired) && !closestSupportedDeviceFrameRate.equals(range)) {
                StringBuilder sb = new StringBuilder("Target FPS range ");
                sb.append(range);
                sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb.append(i29);
                sb.append(". Calculated best FPS range for device: ");
                sb.append(closestSupportedDeviceFrameRate);
                String arrays = Arrays.toString(rangeArr);
                arrays.getClass();
                sb.append(". Device supported FPS ranges: ");
                sb.append(arrays);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            range3 = closestSupportedDeviceFrameRate;
        }
        int i30 = i2;
        for (UseCaseConfig useCaseConfig5 : list5) {
            int i31 = i30 + 1;
            SubtreeManager builder = AutoValue_StreamSpec.builder((Size) list18.get(arrayList3.indexOf(Integer.valueOf(i30))));
            builder.workflowSession = Integer.valueOf((int) r38);
            Object obj4 = linkedHashMap.get(useCaseConfig5);
            if (obj4 == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return null;
            }
            builder.emitActionToParent = (DynamicRange) obj4;
            AutoValue_Config_Option autoValue_Config_Option2 = StreamUseCaseUtil.STREAM_USE_CASE_STREAM_SPEC_OPTION;
            useCaseConfig5.getClass();
            MutableOptionsBundle create = MutableOptionsBundle.create();
            AutoValue_Config_Option autoValue_Config_Option3 = Camera2ImplConfig.STREAM_USE_CASE_OPTION;
            if (useCaseConfig5.containsOption(autoValue_Config_Option3)) {
                create.insertOption(autoValue_Config_Option3, useCaseConfig5.retrieveOption(autoValue_Config_Option3));
            }
            AutoValue_Config_Option autoValue_Config_Option4 = UseCaseConfig.OPTION_ZSL_DISABLED;
            if (useCaseConfig5.containsOption(autoValue_Config_Option4)) {
                create.insertOption(autoValue_Config_Option4, useCaseConfig5.retrieveOption(autoValue_Config_Option4));
            }
            AutoValue_Config_Option autoValue_Config_Option5 = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
            if (useCaseConfig5.containsOption(autoValue_Config_Option5)) {
                create.insertOption(autoValue_Config_Option5, useCaseConfig5.retrieveOption(autoValue_Config_Option5));
            }
            AutoValue_Config_Option autoValue_Config_Option6 = ImageInputConfig.OPTION_INPUT_FORMAT;
            if (useCaseConfig5.containsOption(autoValue_Config_Option6)) {
                create.insertOption(autoValue_Config_Option6, useCaseConfig5.retrieveOption(autoValue_Config_Option6));
            }
            builder.idCounter = new Camera2ImplConfig(create);
            builder.children = Boolean.valueOf(featureSettings2.hasVideoCapture);
            if (!Intrinsics.areEqual(range3, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                if (range3 == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null expectedFrameRateRange");
                    return null;
                }
                builder.interceptor = range3;
            }
            linkedHashMap17.put(useCaseConfig5, builder.build());
            i30 = i31;
        }
        LinkedHashMap linkedHashMap18 = new LinkedHashMap();
        if (list4 != null) {
            List list19 = bestSizesAndMaxFpsForConfigs.bestSizesForStreamUseCase;
            if (i29 == bestSizesAndMaxFpsForConfigs.maxFpsForStreamUseCase) {
                int size11 = list18.size();
                list19.getClass();
                if (size11 == list19.size()) {
                    ArrayList zip = CollectionsKt.zip(list18, list19);
                    if (!zip.isEmpty()) {
                        Iterator it19 = zip.iterator();
                        while (it19.hasNext()) {
                            Pair pair = (Pair) it19.next();
                            if (!Intrinsics.areEqual(pair.first, pair.second)) {
                                break;
                            }
                        }
                    }
                    if (!StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithInteropOverride(cameraMetadata2, arrayList, linkedHashMap17, linkedHashMap18)) {
                        int size12 = list4.size();
                        int i32 = i2;
                        while (i32 < size12) {
                            List list20 = list4;
                            long j = ((SurfaceConfig) list20.get(i32)).streamUseCase.value;
                            LinkedHashMap linkedHashMap19 = linkedHashMap4;
                            if (linkedHashMap19.containsKey(Integer.valueOf(i32))) {
                                AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo4 = (AutoValue_AttachedSurfaceInfo) linkedHashMap19.get(Integer.valueOf(i32));
                                autoValue_AttachedSurfaceInfo4.getClass();
                                Config config2 = autoValue_AttachedSurfaceInfo4.implementationOptions;
                                config2.getClass();
                                Camera2ImplConfig updatedImplementationOptionsWithUseCaseStreamSpecOption = StreamUseCaseUtil.getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(config2, Long.valueOf(j));
                                if (updatedImplementationOptionsWithUseCaseStreamSpecOption != null) {
                                    SubtreeManager builder2 = AutoValue_StreamSpec.builder(autoValue_AttachedSurfaceInfo4.size);
                                    builder2.workflowSession = Integer.valueOf(autoValue_AttachedSurfaceInfo4.sessionType);
                                    Range range4 = autoValue_AttachedSurfaceInfo4.targetFrameRate;
                                    if (range4 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$2("Null expectedFrameRateRange");
                                        return null;
                                    }
                                    builder2.interceptor = range4;
                                    DynamicRange dynamicRange2 = autoValue_AttachedSurfaceInfo4.dynamicRange;
                                    if (dynamicRange2 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$2("Null dynamicRange");
                                        return null;
                                    }
                                    builder2.emitActionToParent = dynamicRange2;
                                    builder2.idCounter = updatedImplementationOptionsWithUseCaseStreamSpecOption;
                                    linkedHashMap18.put(autoValue_AttachedSurfaceInfo4, builder2.build());
                                }
                                linkedHashMap6 = linkedHashMap5;
                            } else {
                                linkedHashMap6 = linkedHashMap5;
                                if (!linkedHashMap6.containsKey(Integer.valueOf(i32))) {
                                    a$$ExternalSyntheticBUOutline0.m$1((Object) "SurfaceConfig does not map to any use case");
                                    return null;
                                }
                                Object obj5 = linkedHashMap6.get(Integer.valueOf(i32));
                                obj5.getClass();
                                UseCaseConfig useCaseConfig6 = (UseCaseConfig) obj5;
                                AutoValue_StreamSpec autoValue_StreamSpec = (AutoValue_StreamSpec) linkedHashMap17.get(useCaseConfig6);
                                autoValue_StreamSpec.getClass();
                                Config config3 = autoValue_StreamSpec.implementationOptions;
                                config3.getClass();
                                Camera2ImplConfig updatedImplementationOptionsWithUseCaseStreamSpecOption2 = StreamUseCaseUtil.getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(config3, Long.valueOf(j));
                                if (updatedImplementationOptionsWithUseCaseStreamSpecOption2 != null) {
                                    SubtreeManager builder3 = autoValue_StreamSpec.toBuilder();
                                    builder3.idCounter = updatedImplementationOptionsWithUseCaseStreamSpecOption2;
                                    linkedHashMap17.put(useCaseConfig6, builder3.build());
                                }
                            }
                            i32++;
                            linkedHashMap4 = linkedHashMap19;
                            linkedHashMap5 = linkedHashMap6;
                            list4 = list20;
                        }
                    }
                }
            }
        }
        return new SurfaceStreamSpecQueryResult(linkedHashMap17, linkedHashMap18, bestSizesAndMaxFpsForConfigs.maxFpsForAllSizes);
    }

    public final SurfaceConfig transformSurfaceConfig(int i, int i2, Size size, StreamUseCase streamUseCase) {
        size.getClass();
        StreamUseCase streamUseCase2 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
        return Transition.AnonymousClass1.transformSurfaceConfig(i2, size, getUpdatedSurfaceSizeDefinitionByFormat(i2), i, SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase);
    }

    public final void updateMaximumSizeByFormat(LinkedHashMap linkedHashMap, int i, Rational rational) {
        Size maxOutputSizeByFormat$camera_camera2 = getMaxOutputSizeByFormat$camera_camera2((StreamConfigurationMap) this.streamConfigurationMapCompat.impl.mClientFragmentManager, i, true, rational);
        if (maxOutputSizeByFormat$camera_camera2 != null) {
            linkedHashMap.put(Integer.valueOf(i), maxOutputSizeByFormat$camera_camera2);
        }
    }

    public final void updateS720pOrS1440pSizeByFormat(LinkedHashMap linkedHashMap, Size size, int i) {
        if (this.isConcurrentCameraModeSupported) {
            Size maxOutputSizeByFormat$camera_camera2 = getMaxOutputSizeByFormat$camera_camera2((StreamConfigurationMap) this.streamConfigurationMapCompat.impl.mClientFragmentManager, i, false, null);
            Integer valueOf = Integer.valueOf(i);
            if (maxOutputSizeByFormat$camera_camera2 != null) {
                size = (Size) Collections.min(CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{size, maxOutputSizeByFormat$camera_camera2}), new CompareSizesByArea(false));
            }
            linkedHashMap.put(valueOf, size);
        }
    }

    public final void validateSelf(FeatureSettings featureSettings) {
        int i = featureSettings.cameraMode;
        boolean z = featureSettings.isFeatureComboInvocation;
        String str = this.cameraId;
        if (i != 0 && featureSettings.isUltraHdrOn) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Camera device Id is ", str, ". Ultra HDR is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
            return;
        }
        if (i != 0 && featureSettings.requiredMaxBitDepth == 10) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Camera device Id is ", str, ". 10 bit dynamic range is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
            return;
        }
        if (i != 0 && z) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Camera device Id is ", str, ". feature combination is not currently supported in "), i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
            return;
        }
        boolean z2 = featureSettings.isHighSpeedOn;
        if (z2 && z) {
            a$$ExternalSyntheticBUOutline0.m$3("High-speed session is not supported with feature combination");
        } else {
            if (!z2 || ((Boolean) this.highSpeedResolver.isHighSpeedSupported$delegate.getValue()).booleanValue()) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("High-speed session is not supported on this device.");
        }
    }
}
