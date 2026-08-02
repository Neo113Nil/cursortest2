package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.compat.workaround.PreviewPixelHDRnetKt;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Preview$$ExternalSyntheticLambda2;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.streamsharing.StreamSharingBuilder;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.media3.extractor.VorbisUtil$Mode;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.nimbusds.jose.JWECryptoParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.overdraft.OverdraftStatus;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class SessionConfig {
    public static final List SUPPORTED_TEMPLATE_PRIORITY = Arrays.asList(1, 5, 3);
    public final List mDeviceStateCallbacks;
    public final ErrorListener mErrorListener;
    public final InputConfiguration mInputConfiguration;
    public final ArrayList mOutputConfigs;
    public final AutoValue_SessionConfig_OutputConfig mPostviewOutputConfig;
    public final CaptureConfig mRepeatingCaptureConfig;
    public final List mSessionStateCallbacks;
    public final int mSessionType;
    public final List mSingleCameraCaptureCallbacks;

    public abstract class BaseBuilder {
        public CloseableErrorListener mErrorListener;
        public InputConfiguration mInputConfiguration;
        public AutoValue_SessionConfig_OutputConfig mPostviewOutputConfig;
        public final LinkedHashSet mOutputConfigs = new LinkedHashSet();
        public final TraceParser mCaptureConfigBuilder = new TraceParser();
        public final ArrayList mDeviceStateCallbacks = new ArrayList();
        public final ArrayList mSessionStateCallbacks = new ArrayList();
        public final ArrayList mSingleCameraCaptureCallbacks = new ArrayList();
        public int mSessionType = 0;
    }

    public final class Builder extends BaseBuilder {
        public static Builder createFrom(UseCaseConfig useCaseConfig, Size size) {
            if (((CameraUseCaseAdapter.DefaultSessionOptionsUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, null)) == null) {
                a$$ExternalSyntheticBUOutline0.m$2((String) useCaseConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME, useCaseConfig.toString()), "Implementation is missing option unpacker for ");
                return null;
            }
            Builder builder = new Builder();
            size.getClass();
            SessionConfig sessionConfig = (SessionConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, null);
            OptionsBundle optionsBundle = OptionsBundle.EMPTY_BUNDLE;
            optionsBundle.getClass();
            int i = SessionConfig.defaultEmptySessionConfig().mRepeatingCaptureConfig.mTemplateType;
            ArrayList arrayList = builder.mSessionStateCallbacks;
            ArrayList arrayList2 = builder.mDeviceStateCallbacks;
            TraceParser traceParser = builder.mCaptureConfigBuilder;
            if (sessionConfig != null) {
                CaptureConfig captureConfig = sessionConfig.mRepeatingCaptureConfig;
                i = captureConfig.mTemplateType;
                for (CameraDevice.StateCallback stateCallback : sessionConfig.mDeviceStateCallbacks) {
                    if (!arrayList2.contains(stateCallback)) {
                        arrayList2.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : sessionConfig.mSessionStateCallbacks) {
                    if (!arrayList.contains(stateCallback2)) {
                        arrayList.add(stateCallback2);
                    }
                }
                traceParser.addAllCameraCaptureCallbacks(captureConfig.mCameraCaptureCallbacks);
                optionsBundle = captureConfig.mImplementationOptions;
            }
            traceParser.getClass();
            traceParser.projectPackages = MutableOptionsBundle.from((Config) optionsBundle);
            if (useCaseConfig instanceof PreviewConfig) {
                Rational rational = PreviewPixelHDRnetKt.ASPECT_RATIO_16_9;
                if (((PreviewPixelHDRnetQuirk) DeviceQuirks.getAll().get(PreviewPixelHDRnetQuirk.class)) != null && !Intrinsics.areEqual(PreviewPixelHDRnetKt.ASPECT_RATIO_16_9, new Rational(size.getWidth(), size.getHeight()))) {
                    MutableOptionsBundle create = MutableOptionsBundle.create();
                    CaptureRequest.Key key = CaptureRequest.TONEMAP_MODE;
                    key.getClass();
                    create.insertOption(OverdraftStatus.State_.createCaptureRequestOption(key), 2);
                    traceParser.addImplementationOptions(new Camera2ImplConfig(OptionsBundle.from(create)));
                }
            }
            new Camera2ImplConfig(useCaseConfig);
            Object retrieveOption = useCaseConfig.retrieveOption(Camera2ImplConfig.TEMPLATE_TYPE_OPTION, Integer.valueOf(i));
            retrieveOption.getClass();
            traceParser.state = ((Number) retrieveOption).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) useCaseConfig.retrieveOption(Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION, null);
            if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
                arrayList2.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) useCaseConfig.retrieveOption(Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION, null);
            if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
                arrayList.add(stateCallback4);
            }
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) useCaseConfig.retrieveOption(Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, null);
            if (captureCallback != null) {
                CameraUseCaseAdapter.CaptureCallbackContainer captureCallbackContainer = new CameraUseCaseAdapter.CaptureCallbackContainer(captureCallback);
                traceParser.addCameraCaptureCallback(captureCallbackContainer);
                ArrayList arrayList3 = builder.mSingleCameraCaptureCallbacks;
                if (!arrayList3.contains(captureCallbackContainer)) {
                    arrayList3.add(captureCallbackContainer);
                }
            }
            int previewStabilizationMode = useCaseConfig.getPreviewStabilizationMode();
            if (previewStabilizationMode != 0) {
                traceParser.getClass();
                if (previewStabilizationMode != 0) {
                    ((MutableOptionsBundle) traceParser.projectPackages).insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, Integer.valueOf(previewStabilizationMode));
                }
            }
            int videoStabilizationMode = useCaseConfig.getVideoStabilizationMode();
            if (videoStabilizationMode != 0) {
                traceParser.getClass();
                if (videoStabilizationMode != 0) {
                    ((MutableOptionsBundle) traceParser.projectPackages).insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, Integer.valueOf(videoStabilizationMode));
                }
            }
            MutableOptionsBundle create2 = MutableOptionsBundle.create();
            AutoValue_Config_Option autoValue_Config_Option = Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION;
            String str = (String) useCaseConfig.retrieveOption(autoValue_Config_Option, null);
            if (str != null) {
                create2.insertOption(autoValue_Config_Option, str);
            }
            AutoValue_Config_Option autoValue_Config_Option2 = Camera2ImplConfig.STREAM_USE_CASE_OPTION;
            Long l = (Long) useCaseConfig.retrieveOption(autoValue_Config_Option2, null);
            if (l != null) {
                create2.insertOption(autoValue_Config_Option2, Long.valueOf(l.longValue()));
            }
            traceParser.addImplementationOptions(create2);
            StreamSharingBuilder streamSharingBuilder = new StreamSharingBuilder();
            useCaseConfig.findOptions(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(0, streamSharingBuilder, useCaseConfig));
            traceParser.addImplementationOptions(new BiometricPrompt(OptionsBundle.from(streamSharingBuilder.mMutableConfig)));
            return builder;
        }

        public final void addImplementationOptions(Config config) {
            this.mCaptureConfigBuilder.addImplementationOptions(config);
        }

        public final void addSurface(DeferrableSurface deferrableSurface, DynamicRange dynamicRange, int i) {
            JWECryptoParts builder = AutoValue_SessionConfig_OutputConfig.builder(deferrableSurface);
            if (dynamicRange == null) {
                a$$ExternalSyntheticBUOutline0.m$2("Null dynamicRange");
                return;
            }
            builder.authenticationTag = dynamicRange;
            builder.iv = Integer.valueOf(i);
            this.mOutputConfigs.add(builder.build());
            ((HashSet) this.mCaptureConfigBuilder.logger).add(deferrableSurface);
        }

        public final SessionConfig build() {
            return new SessionConfig(new ArrayList(this.mOutputConfigs), new ArrayList(this.mDeviceStateCallbacks), new ArrayList(this.mSessionStateCallbacks), new ArrayList(this.mSingleCameraCaptureCallbacks), this.mCaptureConfigBuilder.build(), this.mErrorListener, this.mInputConfiguration, this.mSessionType, this.mPostviewOutputConfig);
        }
    }

    public final class CloseableErrorListener implements ErrorListener {
        public final ErrorListener mErrorListener;
        public final AtomicBoolean mIsClosed = new AtomicBoolean(false);

        public CloseableErrorListener(ErrorListener errorListener) {
            this.mErrorListener = errorListener;
        }

        public final void close() {
            this.mIsClosed.set(true);
        }

        @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
        public final void onError(SessionConfig sessionConfig) {
            if (this.mIsClosed.get()) {
                return;
            }
            this.mErrorListener.onError(sessionConfig);
        }
    }

    public interface ErrorListener {
        void onError(SessionConfig sessionConfig);
    }

    public final class ValidatingBuilder extends BaseBuilder {
        public final VorbisUtil$Mode mSurfaceSorter = new VorbisUtil$Mode(1);
        public boolean mValid = true;
        public final StringBuilder mInvalidReason = new StringBuilder();
        public boolean mTemplateSet = false;
        public final ArrayList mErrorListeners = new ArrayList();

        public final void add(SessionConfig sessionConfig) {
            CaptureConfig captureConfig = sessionConfig.mRepeatingCaptureConfig;
            int i = captureConfig.mTemplateType;
            OptionsBundle optionsBundle = captureConfig.mImplementationOptions;
            TraceParser traceParser = this.mCaptureConfigBuilder;
            if (i != -1) {
                this.mTemplateSet = true;
                int i2 = traceParser.state;
                List list = SessionConfig.SUPPORTED_TEMPLATE_PRIORITY;
                if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                    i = i2;
                }
                traceParser.state = i;
            }
            Range expectedFrameRateRange = captureConfig.getExpectedFrameRateRange();
            Range range = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            boolean equals = expectedFrameRateRange.equals(range);
            StringBuilder sb = this.mInvalidReason;
            if (!equals) {
                MutableOptionsBundle mutableOptionsBundle = (MutableOptionsBundle) traceParser.projectPackages;
                AutoValue_Config_Option autoValue_Config_Option = CaptureConfig.OPTION_RESOLVED_FRAME_RATE;
                boolean equals2 = ((Range) mutableOptionsBundle.retrieveOption(autoValue_Config_Option, range)).equals(range);
                MutableOptionsBundle mutableOptionsBundle2 = (MutableOptionsBundle) traceParser.projectPackages;
                if (equals2) {
                    mutableOptionsBundle2.insertOption(autoValue_Config_Option, expectedFrameRateRange);
                } else if (!((Range) mutableOptionsBundle2.retrieveOption(autoValue_Config_Option, range)).equals(expectedFrameRateRange)) {
                    this.mValid = false;
                    String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((MutableOptionsBundle) traceParser.projectPackages).retrieveOption(autoValue_Config_Option, range)) + ", new = " + expectedFrameRateRange;
                    StringUtilsKt.e("ValidatingBuilder", str);
                    sb.append(str);
                }
            }
            AutoValue_Config_Option autoValue_Config_Option2 = UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE;
            Integer num = (Integer) optionsBundle.retrieveOption(autoValue_Config_Option2, 0);
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            if (intValue != 0) {
                traceParser.getClass();
                if (intValue != 0) {
                    ((MutableOptionsBundle) traceParser.projectPackages).insertOption(autoValue_Config_Option2, num);
                }
            }
            AutoValue_Config_Option autoValue_Config_Option3 = UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE;
            Integer num2 = (Integer) optionsBundle.retrieveOption(autoValue_Config_Option3, 0);
            Objects.requireNonNull(num2);
            int intValue2 = num2.intValue();
            if (intValue2 != 0) {
                traceParser.getClass();
                if (intValue2 != 0) {
                    ((MutableOptionsBundle) traceParser.projectPackages).insertOption(autoValue_Config_Option3, num2);
                }
            }
            TagBundle tagBundle = captureConfig.mTagBundle;
            MutableTagBundle mutableTagBundle = (MutableTagBundle) traceParser.threadAttrs;
            HashSet hashSet = (HashSet) traceParser.logger;
            mutableTagBundle.mTagMap.putAll((Map) tagBundle.mTagMap);
            this.mDeviceStateCallbacks.addAll(sessionConfig.mDeviceStateCallbacks);
            this.mSessionStateCallbacks.addAll(sessionConfig.mSessionStateCallbacks);
            traceParser.addAllCameraCaptureCallbacks(captureConfig.mCameraCaptureCallbacks);
            this.mSingleCameraCaptureCallbacks.addAll(sessionConfig.mSingleCameraCaptureCallbacks);
            ErrorListener errorListener = sessionConfig.mErrorListener;
            if (errorListener != null) {
                this.mErrorListeners.add(errorListener);
            }
            InputConfiguration inputConfiguration = sessionConfig.mInputConfiguration;
            if (inputConfiguration != null) {
                this.mInputConfiguration = inputConfiguration;
            }
            ArrayList arrayList = sessionConfig.mOutputConfigs;
            LinkedHashSet<AutoValue_SessionConfig_OutputConfig> linkedHashSet = this.mOutputConfigs;
            linkedHashSet.addAll(arrayList);
            hashSet.addAll(Collections.unmodifiableList(captureConfig.mSurfaces));
            ArrayList arrayList2 = new ArrayList();
            for (AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig : linkedHashSet) {
                arrayList2.add(autoValue_SessionConfig_OutputConfig.surface);
                Iterator it = autoValue_SessionConfig_OutputConfig.sharedSurfaces.iterator();
                while (it.hasNext()) {
                    arrayList2.add((DeferrableSurface) it.next());
                }
            }
            if (!arrayList2.containsAll(hashSet)) {
                StringUtilsKt.d("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.mValid = false;
                sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            int i3 = sessionConfig.mSessionType;
            int i4 = this.mSessionType;
            if (i3 != i4 && i3 != 0 && i4 != 0) {
                StringUtilsKt.d("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.mValid = false;
                sb.append("Invalid configuration due to that two non-default session types are set");
            } else if (i3 != 0) {
                this.mSessionType = i3;
            }
            AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig2 = sessionConfig.mPostviewOutputConfig;
            if (autoValue_SessionConfig_OutputConfig2 != null) {
                AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig3 = this.mPostviewOutputConfig;
                if (autoValue_SessionConfig_OutputConfig3 == autoValue_SessionConfig_OutputConfig2 || autoValue_SessionConfig_OutputConfig3 == null) {
                    this.mPostviewOutputConfig = autoValue_SessionConfig_OutputConfig2;
                } else {
                    StringUtilsKt.d("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.mValid = false;
                    sb.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            traceParser.addImplementationOptions(optionsBundle);
        }

        public final SessionConfig build() {
            if (!this.mValid) {
                a$$ExternalSyntheticBUOutline0.m$3("Unsupported session configuration combination");
                return null;
            }
            ArrayList arrayList = new ArrayList(this.mOutputConfigs);
            VorbisUtil$Mode vorbisUtil$Mode = this.mSurfaceSorter;
            int i = 1;
            if (vorbisUtil$Mode.blockFlag) {
                Collections.sort(arrayList, new VideoCapture$$ExternalSyntheticLambda6(vorbisUtil$Mode, i));
            }
            int i2 = this.mSessionType;
            int i3 = 2;
            TraceParser traceParser = this.mCaptureConfigBuilder;
            if (i2 == 1) {
                traceParser.getClass();
                if (arrayList.size() == 2 && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        DeferrableSurface deferrableSurface = ((AutoValue_SessionConfig_OutputConfig) it.next()).surface;
                        deferrableSurface.getClass();
                        if (Intrinsics.areEqual(deferrableSurface.mContainerClass, MediaCodec.class)) {
                            HashSet hashSet = (HashSet) traceParser.logger;
                            hashSet.getClass();
                            if (!hashSet.isEmpty()) {
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    DeferrableSurface deferrableSurface2 = (DeferrableSurface) it2.next();
                                    deferrableSurface2.getClass();
                                    if (Intrinsics.areEqual(deferrableSurface2.mContainerClass, MediaCodec.class)) {
                                        break;
                                    }
                                }
                            }
                            MutableOptionsBundle mutableOptionsBundle = (MutableOptionsBundle) traceParser.projectPackages;
                            AutoValue_Config_Option autoValue_Config_Option = CaptureConfig.OPTION_RESOLVED_FRAME_RATE;
                            Range range = (Range) mutableOptionsBundle.retrieveOption(autoValue_Config_Option, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
                            if (range != null) {
                                if (((Number) range.getUpper()).intValue() < 120 || !Intrinsics.areEqual(range.getLower(), range.getUpper())) {
                                    range = null;
                                }
                                if (range != null) {
                                    Range range2 = new Range(30, range.getUpper());
                                    StringUtilsKt.d("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
                                    ((MutableOptionsBundle) traceParser.projectPackages).insertOption(autoValue_Config_Option, range2);
                                }
                            }
                        }
                    }
                }
            }
            return new SessionConfig(arrayList, new ArrayList(this.mDeviceStateCallbacks), new ArrayList(this.mSessionStateCallbacks), new ArrayList(this.mSingleCameraCaptureCallbacks), traceParser.build(), this.mErrorListeners.isEmpty() ? null : new Preview$$ExternalSyntheticLambda2(this, i3), this.mInputConfiguration, this.mSessionType, this.mPostviewOutputConfig);
        }

        public final boolean isValid() {
            return this.mTemplateSet && this.mValid;
        }
    }

    public SessionConfig(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, CaptureConfig captureConfig, ErrorListener errorListener, InputConfiguration inputConfiguration, int i, AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig) {
        this.mOutputConfigs = arrayList;
        this.mDeviceStateCallbacks = Collections.unmodifiableList(arrayList2);
        this.mSessionStateCallbacks = Collections.unmodifiableList(arrayList3);
        this.mSingleCameraCaptureCallbacks = Collections.unmodifiableList(arrayList4);
        this.mErrorListener = errorListener;
        this.mRepeatingCaptureConfig = captureConfig;
        this.mInputConfiguration = inputConfiguration;
        this.mSessionType = i;
        this.mPostviewOutputConfig = autoValue_SessionConfig_OutputConfig;
    }

    public static SessionConfig defaultEmptySessionConfig() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        MutableOptionsBundle create = MutableOptionsBundle.create();
        ArrayList arrayList5 = new ArrayList();
        MutableTagBundle create2 = MutableTagBundle.create();
        ArrayList arrayList6 = new ArrayList(hashSet);
        OptionsBundle from = OptionsBundle.from(create);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        TagBundle tagBundle = TagBundle.EMPTY_TAGBUNDLE;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = create2.mTagMap;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new SessionConfig(arrayList, arrayList2, arrayList3, arrayList4, new CaptureConfig(arrayList6, from, -1, arrayList7, new TagBundle(arrayMap)), null, null, 0, null);
    }

    public final List getSurfaces() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.mOutputConfigs.iterator();
        while (it.hasNext()) {
            AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig = (AutoValue_SessionConfig_OutputConfig) it.next();
            arrayList.add(autoValue_SessionConfig_OutputConfig.surface);
            Iterator it2 = autoValue_SessionConfig_OutputConfig.sharedSurfaces.iterator();
            while (it2.hasNext()) {
                arrayList.add((DeferrableSurface) it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
