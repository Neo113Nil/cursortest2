package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraPipe$CameraInteropConfig;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.stripe.hcaptcha.HCaptcha;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.Cache;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RetryingCameraStateOpenerImpl {
    public static final CaptureSessionFactory.Result.Failed Companion = new CaptureSessionFactory.Result.Failed();
    public final AudioRestrictionControllerImpl audioRestrictionController;
    public final UnleashContext cameraAvailabilityMonitor;
    public final Camera2ErrorProcessor cameraErrorListener;
    public final CameraPipe$CameraInteropConfig cameraInteropConfig;
    public final HCaptcha cameraStateOpener;
    public final AndroidDevicePolicyManagerWrapper devicePolicyManager;
    public final SystemTimeSource timeSource;

    public RetryingCameraStateOpenerImpl(HCaptcha hCaptcha, Camera2ErrorProcessor camera2ErrorProcessor, UnleashContext unleashContext, SystemTimeSource systemTimeSource, AndroidDevicePolicyManagerWrapper androidDevicePolicyManagerWrapper, AudioRestrictionControllerImpl audioRestrictionControllerImpl, CameraPipe$CameraInteropConfig cameraPipe$CameraInteropConfig, Threads threads) {
        camera2ErrorProcessor.getClass();
        systemTimeSource.getClass();
        androidDevicePolicyManagerWrapper.getClass();
        audioRestrictionControllerImpl.getClass();
        threads.getClass();
        this.cameraStateOpener = hCaptcha;
        this.cameraErrorListener = camera2ErrorProcessor;
        this.cameraAvailabilityMonitor = unleashContext;
        this.timeSource = systemTimeSource;
        this.devicePolicyManager = androidDevicePolicyManagerWrapper;
        this.audioRestrictionController = audioRestrictionControllerImpl;
        this.cameraInteropConfig = cameraPipe$CameraInteropConfig;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:(2:3|(11:5|6|7|(1:(1:(1:(11:12|13|14|15|16|(1:18)|19|20|(4:22|23|24|(2:26|27)(2:29|(3:31|32|33)(10:34|35|36|37|(2:39|(7:41|(2:144|(1:147)(1:146))(1:43)|44|(1:46)|(10:138|(1:140)(1:142)|141|52|(5:(2:96|(3:98|(2:93|94)(1:58)|(8:63|(1:92)(8:67|(2:86|(1:89)(1:88))(1:69)|70|71|(2:78|(1:80)(5:81|(1:83)(1:85)|84|74|(1:77)(1:76)))|73|74|(0)(0))|91|71|(0)|73|74|(0)(0))(3:60|61|62)))(6:99|(2:105|(3:110|(2:122|(2:127|(2:130|(1:134)(1:(1:133)))(1:129))(2:124|(1:126)))|109)(2:(0)|109))|(1:56)|93|94|(0)(0))|15|16|(0)|19)|54|(0)|93|94|(0)(0))(10:48|(1:50)(1:135)|51|52|(0)|54|(0)|93|94|(0)(0))|20|(0)))(1:150)|149|(0)|(0)(0)|20|(0))))|155|156)(2:166|167))(6:168|169|170|23|24|(0)(0)))(1:171))(4:175|(1:177)|155|156)|172|173|174|20|(0)|155|156))|173|174|20|(0)|155|156)|180|6|7|(0)(0)|172|(2:(0)|(1:162))) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e5, code lost:
    
        if (r4 > 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01a6, code lost:
    
        if (androidx.camera.camera2.pipe.core.DurationNs.m81compareTozYRVrok(10000000000L, r0) == (-1)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ae, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01c2, code lost:
    
        if (androidx.camera.camera2.pipe.core.DurationNs.m81compareTozYRVrok(1800000000000L, r0) == (-1)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0180, code lost:
    
        if (r2 == 6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0055, code lost:
    
        r1 = r0;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02be, code lost:
    
        if (r2 == 6) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x031e A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:13:0x0043, B:16:0x0316, B:18:0x031e, B:23:0x010c, B:31:0x0130, B:34:0x0139, B:37:0x0162, B:39:0x016f, B:46:0x018a, B:52:0x01c9, B:56:0x0222, B:60:0x0234, B:65:0x02ae, B:74:0x02ef, B:78:0x02cd, B:81:0x02dc, B:94:0x022d, B:134:0x020e, B:135:0x019d, B:142:0x01bb, B:153:0x0346, B:154:0x0349, B:169:0x0070, B:36:0x0158), top: B:7:0x002b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:13:0x0043, B:16:0x0316, B:18:0x031e, B:23:0x010c, B:31:0x0130, B:34:0x0139, B:37:0x0162, B:39:0x016f, B:46:0x018a, B:52:0x01c9, B:56:0x0222, B:60:0x0234, B:65:0x02ae, B:74:0x02ef, B:78:0x02cd, B:81:0x02dc, B:94:0x022d, B:134:0x020e, B:135:0x019d, B:142:0x01bb, B:153:0x0346, B:154:0x0349, B:169:0x0070, B:36:0x0158), top: B:7:0x002b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0222 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:13:0x0043, B:16:0x0316, B:18:0x031e, B:23:0x010c, B:31:0x0130, B:34:0x0139, B:37:0x0162, B:39:0x016f, B:46:0x018a, B:52:0x01c9, B:56:0x0222, B:60:0x0234, B:65:0x02ae, B:74:0x02ef, B:78:0x02cd, B:81:0x02dc, B:94:0x022d, B:134:0x020e, B:135:0x019d, B:142:0x01bb, B:153:0x0346, B:154:0x0349, B:169:0x0070, B:36:0x0158), top: B:7:0x002b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0234 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:13:0x0043, B:16:0x0316, B:18:0x031e, B:23:0x010c, B:31:0x0130, B:34:0x0139, B:37:0x0162, B:39:0x016f, B:46:0x018a, B:52:0x01c9, B:56:0x0222, B:60:0x0234, B:65:0x02ae, B:74:0x02ef, B:78:0x02cd, B:81:0x02dc, B:94:0x022d, B:134:0x020e, B:135:0x019d, B:142:0x01bb, B:153:0x0346, B:154:0x0349, B:169:0x0070, B:36:0x0158), top: B:7:0x002b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cd A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:13:0x0043, B:16:0x0316, B:18:0x031e, B:23:0x010c, B:31:0x0130, B:34:0x0139, B:37:0x0162, B:39:0x016f, B:46:0x018a, B:52:0x01c9, B:56:0x0222, B:60:0x0234, B:65:0x02ae, B:74:0x02ef, B:78:0x02cd, B:81:0x02dc, B:94:0x022d, B:134:0x020e, B:135:0x019d, B:142:0x01bb, B:153:0x0346, B:154:0x0349, B:169:0x0070, B:36:0x0158), top: B:7:0x002b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0310 -> B:15:0x004f). Please report as a decompilation issue!!! */
    /* renamed from: openCameraWithRetry-aeCOTgg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m79openCameraWithRetryaeCOTgg(String str, Camera2DeviceCloserImpl camera2DeviceCloserImpl, Function1 function1, ContinuationImpl continuationImpl) {
        RetryingCameraStateOpenerImpl$openCameraWithRetry$1 retryingCameraStateOpenerImpl$openCameraWithRetry$1;
        CoroutineSingletons coroutineSingletons;
        ?? r5;
        Throwable th;
        long elapsedRealtimeNanos;
        Camera2DeviceCloserImpl camera2DeviceCloserImpl2;
        Function1 function12;
        String str2;
        Ref$IntRef ref$IntRef;
        AutoCloseable autoCloseable;
        Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2;
        Function1 function13;
        Ref$IntRef ref$IntRef2;
        long j;
        String str3;
        Camera2DeviceCloserImpl camera2DeviceCloserImpl3;
        Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$22;
        SystemTimeSource systemTimeSource;
        AndroidCameraState androidCameraState;
        Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$23;
        boolean z;
        Function1 function14;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        long j4;
        Object m4081tryOpenCamera7pD7j80$camera_camera2_pipe;
        RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl = this;
        try {
            if (continuationImpl instanceof RetryingCameraStateOpenerImpl$openCameraWithRetry$1) {
                retryingCameraStateOpenerImpl$openCameraWithRetry$1 = (RetryingCameraStateOpenerImpl$openCameraWithRetry$1) continuationImpl;
                int i = retryingCameraStateOpenerImpl$openCameraWithRetry$1.label;
                if ((i & PKIFailureInfo.systemUnavail) != 0) {
                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = i - PKIFailureInfo.systemUnavail;
                    Object obj = retryingCameraStateOpenerImpl$openCameraWithRetry$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r5 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.label;
                    SystemTimeSource systemTimeSource2 = retryingCameraStateOpenerImpl.timeSource;
                    int i2 = 1;
                    if (r5 != 0) {
                        th = null;
                        SafeTrace.throwOnFailure(obj);
                        systemTimeSource2.getClass();
                        elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0 = str;
                        camera2DeviceCloserImpl2 = camera2DeviceCloserImpl;
                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1 = camera2DeviceCloserImpl2;
                        function12 = function1;
                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2 = function12;
                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3 = ref$IntRef3;
                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0 = elapsedRealtimeNanos;
                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = 1;
                        Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$24 = new Camera2CameraAvailabilityMonitor$startMonitoring$2(retryingCameraStateOpenerImpl.cameraAvailabilityMonitor, str);
                        if (camera2CameraAvailabilityMonitor$startMonitoring$24 != coroutineSingletons) {
                            str2 = str;
                            ref$IntRef = ref$IntRef3;
                            obj = camera2CameraAvailabilityMonitor$startMonitoring$24;
                        }
                        return coroutineSingletons;
                    }
                    if (r5 == 1) {
                        th = null;
                        elapsedRealtimeNanos = retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0;
                        ref$IntRef = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3;
                        Function1 function15 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2;
                        Camera2DeviceCloserImpl camera2DeviceCloserImpl4 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1;
                        str2 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        function12 = function15;
                        camera2DeviceCloserImpl2 = camera2DeviceCloserImpl4;
                    } else {
                        if (r5 != 2) {
                            if (r5 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            long j5 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0;
                            Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$25 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5;
                            AutoCloseable autoCloseable2 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4;
                            Ref$IntRef ref$IntRef4 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3;
                            Function1 function16 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2;
                            camera2DeviceCloserImpl3 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1;
                            str3 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            long j6 = j5;
                            systemTimeSource = systemTimeSource2;
                            int i3 = 1;
                            Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$26 = camera2CameraAvailabilityMonitor$startMonitoring$25;
                            CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                            AutoCloseable autoCloseable3 = autoCloseable2;
                            str2 = str3;
                            elapsedRealtimeNanos = j6;
                            if (!((Boolean) obj).booleanValue()) {
                                Log.d("CXCP", "Timeout expired, retrying camera open for camera " + ((Object) CameraId.m46toStringimpl(str2)));
                            }
                            coroutineSingletons = coroutineSingletons2;
                            autoCloseable = autoCloseable3;
                            camera2DeviceCloserImpl2 = camera2DeviceCloserImpl3;
                            ref$IntRef = ref$IntRef4;
                            function12 = function16;
                            i2 = i3;
                            th = null;
                            camera2CameraAvailabilityMonitor$startMonitoring$2 = camera2CameraAvailabilityMonitor$startMonitoring$26;
                            systemTimeSource2 = systemTimeSource;
                            int i4 = ref$IntRef.element + i2;
                            ref$IntRef.element = i4;
                            HCaptcha hCaptcha = retryingCameraStateOpenerImpl.cameraStateOpener;
                            AudioRestrictionControllerImpl audioRestrictionControllerImpl = retryingCameraStateOpenerImpl.audioRestrictionController;
                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0 = str2;
                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1 = camera2DeviceCloserImpl2;
                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2 = function12;
                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3 = ref$IntRef;
                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4 = autoCloseable;
                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5 = camera2CameraAvailabilityMonitor$startMonitoring$2;
                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0 = elapsedRealtimeNanos;
                            Ref$IntRef ref$IntRef5 = ref$IntRef;
                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = 2;
                            RetryingCameraStateOpenerImpl$openCameraWithRetry$1 retryingCameraStateOpenerImpl$openCameraWithRetry$12 = retryingCameraStateOpenerImpl$openCameraWithRetry$1;
                            Camera2DeviceCloserImpl camera2DeviceCloserImpl5 = camera2DeviceCloserImpl2;
                            long j7 = elapsedRealtimeNanos;
                            String str4 = str2;
                            m4081tryOpenCamera7pD7j80$camera_camera2_pipe = hCaptcha.m4081tryOpenCamera7pD7j80$camera_camera2_pipe(str4, i4, j7, camera2DeviceCloserImpl5, audioRestrictionControllerImpl, retryingCameraStateOpenerImpl$openCameraWithRetry$12);
                            if (m4081tryOpenCamera7pD7j80$camera_camera2_pipe != coroutineSingletons) {
                                r5 = autoCloseable;
                                function13 = function12;
                                str3 = str4;
                                j = j7;
                                camera2DeviceCloserImpl3 = camera2DeviceCloserImpl5;
                                retryingCameraStateOpenerImpl$openCameraWithRetry$1 = retryingCameraStateOpenerImpl$openCameraWithRetry$12;
                                obj = m4081tryOpenCamera7pD7j80$camera_camera2_pipe;
                                camera2CameraAvailabilityMonitor$startMonitoring$22 = camera2CameraAvailabilityMonitor$startMonitoring$2;
                                ref$IntRef2 = ref$IntRef5;
                                OpenCameraResult openCameraResult = (OpenCameraResult) obj;
                                systemTimeSource2.getClass();
                                SystemTimeSource systemTimeSource3 = systemTimeSource2;
                                long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - j;
                                systemTimeSource = systemTimeSource3;
                                androidCameraState = openCameraResult.cameraState;
                                CameraError cameraError = openCameraResult.errorCode;
                                if (androidCameraState == null) {
                                    Cache.Companion.closeFinally(r5, th);
                                    return openCameraResult;
                                }
                                Throwable th2 = th;
                                if (cameraError == null) {
                                    Log.w("CXCP", "Camera open failed without an error. The CameraGraph may have been stopped or closed. Abandoning the camera open attempt.");
                                    Cache.Companion.closeFinally(r5, th2);
                                    return openCameraResult;
                                }
                                int i5 = cameraError.value;
                                boolean booleanValue = ((Boolean) function13.invoke(Unit.INSTANCE)).booleanValue();
                                CaptureSessionFactory.Result.Failed failed = Companion;
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                int i6 = ref$IntRef2.element;
                                long j8 = j;
                                AndroidDevicePolicyManagerWrapper androidDevicePolicyManagerWrapper = retryingCameraStateOpenerImpl.devicePolicyManager;
                                androidDevicePolicyManagerWrapper.getClass();
                                try {
                                    Trace.beginSection("DevicePolicyManager#getCameraDisabled");
                                    boolean cameraDisabled = androidDevicePolicyManagerWrapper.devicePolicyManager.getCameraDisabled(null);
                                    Trace.endSection();
                                    DurationNs durationNs = retryingCameraStateOpenerImpl.cameraInteropConfig.cameraOpenRetryMaxTimeoutNs;
                                    if (booleanValue) {
                                        camera2CameraAvailabilityMonitor$startMonitoring$23 = camera2CameraAvailabilityMonitor$startMonitoring$22;
                                        if (Build.VERSION.SDK_INT < 33) {
                                            if (i5 != 1) {
                                                if (i5 != 2) {
                                                }
                                            }
                                            z = true;
                                            if (z) {
                                                Log.d("CXCP", "shouldRetry: Active resume mode is activated");
                                            }
                                            if (z) {
                                                function14 = function13;
                                                if (durationNs != null) {
                                                    j2 = durationNs.value;
                                                }
                                                j3 = 1800000000000L;
                                                if (DurationNs.m81compareTozYRVrok(elapsedRealtimeNanos2, j3) <= 0) {
                                                    if (i5 == 0) {
                                                        z2 = true;
                                                        if (i6 <= 1) {
                                                            if (z2 || ref$IntRef2.element > 1) {
                                                                retryingCameraStateOpenerImpl = this;
                                                                retryingCameraStateOpenerImpl.cameraErrorListener.m69onCameraError3M5Xam4(str3, i5, z2);
                                                            } else {
                                                                retryingCameraStateOpenerImpl = this;
                                                            }
                                                            if (!z2) {
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append("Failed to open camera ");
                                                                sb.append((Object) CameraId.m46toStringimpl(str3));
                                                                sb.append(" after ");
                                                                sb.append(ref$IntRef2.element);
                                                                sb.append(" attempts and ");
                                                                sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{new Double((SystemClock.elapsedRealtimeNanos() - j8) / 1000000.0d)}, 1)));
                                                                sb.append(". Last error was ");
                                                                sb.append((Object) CameraError.m43toStringimpl(i5));
                                                                sb.append('.');
                                                                Log.e("CXCP", sb.toString());
                                                                Cache.Companion.closeFinally(r5, null);
                                                                return openCameraResult;
                                                            }
                                                            if (booleanValue && Build.VERSION.SDK_INT < 33) {
                                                                if (i5 != 1) {
                                                                    if (i5 != 2) {
                                                                    }
                                                                }
                                                                z3 = true;
                                                                if (z3) {
                                                                    DurationNs[] durationNsArr = CaptureSessionFactoryKt.activeResumeCameraRetryThresholds;
                                                                    if (DurationNs.m81compareTozYRVrok(elapsedRealtimeNanos2, durationNsArr[0].value) >= 0) {
                                                                        i3 = 1;
                                                                        j4 = DurationNs.m81compareTozYRVrok(elapsedRealtimeNanos2, durationNsArr[1].value) < 0 ? 2000L : 4000L;
                                                                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0 = str3;
                                                                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1 = camera2DeviceCloserImpl3;
                                                                        Function1 function17 = function14;
                                                                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2 = function17;
                                                                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3 = ref$IntRef2;
                                                                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4 = r5;
                                                                        camera2CameraAvailabilityMonitor$startMonitoring$26 = camera2CameraAvailabilityMonitor$startMonitoring$23;
                                                                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5 = camera2CameraAvailabilityMonitor$startMonitoring$26;
                                                                        Ref$IntRef ref$IntRef6 = ref$IntRef2;
                                                                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0 = j8;
                                                                        retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = 3;
                                                                        obj = camera2CameraAvailabilityMonitor$startMonitoring$26.awaitAvailableCamera(j4, retryingCameraStateOpenerImpl$openCameraWithRetry$1);
                                                                        coroutineSingletons2 = coroutineSingletons3;
                                                                        if (obj == coroutineSingletons2) {
                                                                            return coroutineSingletons2;
                                                                        }
                                                                        j6 = j8;
                                                                        function16 = function17;
                                                                        ref$IntRef4 = ref$IntRef6;
                                                                        autoCloseable3 = r5;
                                                                    }
                                                                }
                                                                j4 = 500;
                                                                i3 = 1;
                                                                retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0 = str3;
                                                                retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1 = camera2DeviceCloserImpl3;
                                                                Function1 function172 = function14;
                                                                retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2 = function172;
                                                                retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3 = ref$IntRef2;
                                                                retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4 = r5;
                                                                camera2CameraAvailabilityMonitor$startMonitoring$26 = camera2CameraAvailabilityMonitor$startMonitoring$23;
                                                                retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5 = camera2CameraAvailabilityMonitor$startMonitoring$26;
                                                                Ref$IntRef ref$IntRef62 = ref$IntRef2;
                                                                retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0 = j8;
                                                                retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = 3;
                                                                obj = camera2CameraAvailabilityMonitor$startMonitoring$26.awaitAvailableCamera(j4, retryingCameraStateOpenerImpl$openCameraWithRetry$1);
                                                                coroutineSingletons2 = coroutineSingletons3;
                                                                if (obj == coroutineSingletons2) {
                                                                }
                                                            }
                                                            z3 = false;
                                                            if (z3) {
                                                            }
                                                            j4 = 500;
                                                            i3 = 1;
                                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0 = str3;
                                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1 = camera2DeviceCloserImpl3;
                                                            Function1 function1722 = function14;
                                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2 = function1722;
                                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3 = ref$IntRef2;
                                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4 = r5;
                                                            camera2CameraAvailabilityMonitor$startMonitoring$26 = camera2CameraAvailabilityMonitor$startMonitoring$23;
                                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5 = camera2CameraAvailabilityMonitor$startMonitoring$26;
                                                            Ref$IntRef ref$IntRef622 = ref$IntRef2;
                                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0 = j8;
                                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = 3;
                                                            obj = camera2CameraAvailabilityMonitor$startMonitoring$26.awaitAvailableCamera(j4, retryingCameraStateOpenerImpl$openCameraWithRetry$1);
                                                            coroutineSingletons2 = coroutineSingletons3;
                                                            if (obj == coroutineSingletons2) {
                                                            }
                                                        }
                                                    } else {
                                                        z2 = true;
                                                        if (i5 != 1 && i5 != 2) {
                                                            if (i5 != 3) {
                                                                if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
                                                                    if (i5 == 8) {
                                                                        z2 = true;
                                                                        if (i6 <= 1) {
                                                                        }
                                                                    } else if (i5 != 10) {
                                                                        if (i5 != 11) {
                                                                            Log.e("CXCP", "Unexpected CameraError: " + failed);
                                                                        } else if (i6 <= 1) {
                                                                        }
                                                                    }
                                                                }
                                                                z2 = true;
                                                            } else {
                                                                if (cameraDisabled) {
                                                                }
                                                                z2 = true;
                                                            }
                                                        }
                                                        if (z2) {
                                                        }
                                                        retryingCameraStateOpenerImpl = this;
                                                        retryingCameraStateOpenerImpl.cameraErrorListener.m69onCameraError3M5Xam4(str3, i5, z2);
                                                        if (!z2) {
                                                        }
                                                    }
                                                    str2 = str3;
                                                    elapsedRealtimeNanos = j6;
                                                    if (!((Boolean) obj).booleanValue()) {
                                                    }
                                                    coroutineSingletons = coroutineSingletons2;
                                                    autoCloseable = autoCloseable3;
                                                    camera2DeviceCloserImpl2 = camera2DeviceCloserImpl3;
                                                    ref$IntRef = ref$IntRef4;
                                                    function12 = function16;
                                                    i2 = i3;
                                                    th = null;
                                                    camera2CameraAvailabilityMonitor$startMonitoring$2 = camera2CameraAvailabilityMonitor$startMonitoring$26;
                                                    systemTimeSource2 = systemTimeSource;
                                                }
                                                z2 = false;
                                                if (z2) {
                                                }
                                                retryingCameraStateOpenerImpl = this;
                                                retryingCameraStateOpenerImpl.cameraErrorListener.m69onCameraError3M5Xam4(str3, i5, z2);
                                                if (!z2) {
                                                }
                                            } else {
                                                if (durationNs == null) {
                                                    function14 = function13;
                                                } else {
                                                    j2 = durationNs.value;
                                                    function14 = function13;
                                                }
                                                j3 = 10000000000L;
                                                if (DurationNs.m81compareTozYRVrok(elapsedRealtimeNanos2, j3) <= 0) {
                                                }
                                                z2 = false;
                                                if (z2) {
                                                }
                                                retryingCameraStateOpenerImpl = this;
                                                retryingCameraStateOpenerImpl.cameraErrorListener.m69onCameraError3M5Xam4(str3, i5, z2);
                                                if (!z2) {
                                                }
                                            }
                                            int i42 = ref$IntRef.element + i2;
                                            ref$IntRef.element = i42;
                                            HCaptcha hCaptcha2 = retryingCameraStateOpenerImpl.cameraStateOpener;
                                            AudioRestrictionControllerImpl audioRestrictionControllerImpl2 = retryingCameraStateOpenerImpl.audioRestrictionController;
                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0 = str2;
                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1 = camera2DeviceCloserImpl2;
                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2 = function12;
                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3 = ref$IntRef;
                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4 = autoCloseable;
                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5 = camera2CameraAvailabilityMonitor$startMonitoring$2;
                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0 = elapsedRealtimeNanos;
                                            Ref$IntRef ref$IntRef52 = ref$IntRef;
                                            retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = 2;
                                            RetryingCameraStateOpenerImpl$openCameraWithRetry$1 retryingCameraStateOpenerImpl$openCameraWithRetry$122 = retryingCameraStateOpenerImpl$openCameraWithRetry$1;
                                            Camera2DeviceCloserImpl camera2DeviceCloserImpl52 = camera2DeviceCloserImpl2;
                                            long j72 = elapsedRealtimeNanos;
                                            String str42 = str2;
                                            m4081tryOpenCamera7pD7j80$camera_camera2_pipe = hCaptcha2.m4081tryOpenCamera7pD7j80$camera_camera2_pipe(str42, i42, j72, camera2DeviceCloserImpl52, audioRestrictionControllerImpl2, retryingCameraStateOpenerImpl$openCameraWithRetry$122);
                                            if (m4081tryOpenCamera7pD7j80$camera_camera2_pipe != coroutineSingletons) {
                                            }
                                        }
                                    } else {
                                        camera2CameraAvailabilityMonitor$startMonitoring$23 = camera2CameraAvailabilityMonitor$startMonitoring$22;
                                    }
                                    z = false;
                                    if (z) {
                                    }
                                    if (z) {
                                    }
                                    int i422 = ref$IntRef.element + i2;
                                    ref$IntRef.element = i422;
                                    HCaptcha hCaptcha22 = retryingCameraStateOpenerImpl.cameraStateOpener;
                                    AudioRestrictionControllerImpl audioRestrictionControllerImpl22 = retryingCameraStateOpenerImpl.audioRestrictionController;
                                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0 = str2;
                                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1 = camera2DeviceCloserImpl2;
                                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2 = function12;
                                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3 = ref$IntRef;
                                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4 = autoCloseable;
                                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5 = camera2CameraAvailabilityMonitor$startMonitoring$2;
                                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0 = elapsedRealtimeNanos;
                                    Ref$IntRef ref$IntRef522 = ref$IntRef;
                                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = 2;
                                    RetryingCameraStateOpenerImpl$openCameraWithRetry$1 retryingCameraStateOpenerImpl$openCameraWithRetry$1222 = retryingCameraStateOpenerImpl$openCameraWithRetry$1;
                                    Camera2DeviceCloserImpl camera2DeviceCloserImpl522 = camera2DeviceCloserImpl2;
                                    long j722 = elapsedRealtimeNanos;
                                    String str422 = str2;
                                    m4081tryOpenCamera7pD7j80$camera_camera2_pipe = hCaptcha22.m4081tryOpenCamera7pD7j80$camera_camera2_pipe(str422, i422, j722, camera2DeviceCloserImpl522, audioRestrictionControllerImpl22, retryingCameraStateOpenerImpl$openCameraWithRetry$1222);
                                    if (m4081tryOpenCamera7pD7j80$camera_camera2_pipe != coroutineSingletons) {
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                            return coroutineSingletons;
                        }
                        th = null;
                        long j9 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0;
                        camera2CameraAvailabilityMonitor$startMonitoring$22 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5;
                        AutoCloseable autoCloseable4 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4;
                        Ref$IntRef ref$IntRef7 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3;
                        Function1 function18 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2;
                        Camera2DeviceCloserImpl camera2DeviceCloserImpl6 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1;
                        String str5 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        ref$IntRef2 = ref$IntRef7;
                        camera2DeviceCloserImpl3 = camera2DeviceCloserImpl6;
                        function13 = function18;
                        j = j9;
                        str3 = str5;
                        r5 = autoCloseable4;
                        OpenCameraResult openCameraResult2 = (OpenCameraResult) obj;
                        systemTimeSource2.getClass();
                        SystemTimeSource systemTimeSource32 = systemTimeSource2;
                        long elapsedRealtimeNanos22 = SystemClock.elapsedRealtimeNanos() - j;
                        systemTimeSource = systemTimeSource32;
                        androidCameraState = openCameraResult2.cameraState;
                        CameraError cameraError2 = openCameraResult2.errorCode;
                        if (androidCameraState == null) {
                        }
                    }
                    autoCloseable = (AutoCloseable) obj;
                    camera2CameraAvailabilityMonitor$startMonitoring$2 = (Camera2CameraAvailabilityMonitor$startMonitoring$2) autoCloseable;
                    int i4222 = ref$IntRef.element + i2;
                    ref$IntRef.element = i4222;
                    HCaptcha hCaptcha222 = retryingCameraStateOpenerImpl.cameraStateOpener;
                    AudioRestrictionControllerImpl audioRestrictionControllerImpl222 = retryingCameraStateOpenerImpl.audioRestrictionController;
                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0 = str2;
                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1 = camera2DeviceCloserImpl2;
                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2 = function12;
                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3 = ref$IntRef;
                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4 = autoCloseable;
                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5 = camera2CameraAvailabilityMonitor$startMonitoring$2;
                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0 = elapsedRealtimeNanos;
                    Ref$IntRef ref$IntRef5222 = ref$IntRef;
                    retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = 2;
                    RetryingCameraStateOpenerImpl$openCameraWithRetry$1 retryingCameraStateOpenerImpl$openCameraWithRetry$12222 = retryingCameraStateOpenerImpl$openCameraWithRetry$1;
                    Camera2DeviceCloserImpl camera2DeviceCloserImpl5222 = camera2DeviceCloserImpl2;
                    long j7222 = elapsedRealtimeNanos;
                    String str4222 = str2;
                    m4081tryOpenCamera7pD7j80$camera_camera2_pipe = hCaptcha222.m4081tryOpenCamera7pD7j80$camera_camera2_pipe(str4222, i4222, j7222, camera2DeviceCloserImpl5222, audioRestrictionControllerImpl222, retryingCameraStateOpenerImpl$openCameraWithRetry$12222);
                    if (m4081tryOpenCamera7pD7j80$camera_camera2_pipe != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            camera2CameraAvailabilityMonitor$startMonitoring$2 = (Camera2CameraAvailabilityMonitor$startMonitoring$2) autoCloseable;
            int i42222 = ref$IntRef.element + i2;
            ref$IntRef.element = i42222;
            HCaptcha hCaptcha2222 = retryingCameraStateOpenerImpl.cameraStateOpener;
            AudioRestrictionControllerImpl audioRestrictionControllerImpl2222 = retryingCameraStateOpenerImpl.audioRestrictionController;
            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$0 = str2;
            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$1 = camera2DeviceCloserImpl2;
            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$2 = function12;
            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$3 = ref$IntRef;
            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$4 = autoCloseable;
            retryingCameraStateOpenerImpl$openCameraWithRetry$1.L$5 = camera2CameraAvailabilityMonitor$startMonitoring$2;
            retryingCameraStateOpenerImpl$openCameraWithRetry$1.J$0 = elapsedRealtimeNanos;
            Ref$IntRef ref$IntRef52222 = ref$IntRef;
            retryingCameraStateOpenerImpl$openCameraWithRetry$1.label = 2;
            RetryingCameraStateOpenerImpl$openCameraWithRetry$1 retryingCameraStateOpenerImpl$openCameraWithRetry$122222 = retryingCameraStateOpenerImpl$openCameraWithRetry$1;
            Camera2DeviceCloserImpl camera2DeviceCloserImpl52222 = camera2DeviceCloserImpl2;
            long j72222 = elapsedRealtimeNanos;
            String str42222 = str2;
            m4081tryOpenCamera7pD7j80$camera_camera2_pipe = hCaptcha2222.m4081tryOpenCamera7pD7j80$camera_camera2_pipe(str42222, i42222, j72222, camera2DeviceCloserImpl52222, audioRestrictionControllerImpl2222, retryingCameraStateOpenerImpl$openCameraWithRetry$122222);
            if (m4081tryOpenCamera7pD7j80$camera_camera2_pipe != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            Throwable th5 = th4;
            AutoCloseable autoCloseable5 = autoCloseable;
            try {
                throw th5;
            } catch (Throwable th6) {
                Cache.Companion.closeFinally(autoCloseable5, th5);
                throw th6;
            }
        }
        retryingCameraStateOpenerImpl$openCameraWithRetry$1 = new RetryingCameraStateOpenerImpl$openCameraWithRetry$1(retryingCameraStateOpenerImpl, continuationImpl);
        Object obj2 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r5 = retryingCameraStateOpenerImpl$openCameraWithRetry$1.label;
        SystemTimeSource systemTimeSource22 = retryingCameraStateOpenerImpl.timeSource;
        int i22 = 1;
        if (r5 != 0) {
        }
        autoCloseable = (AutoCloseable) obj2;
    }
}
