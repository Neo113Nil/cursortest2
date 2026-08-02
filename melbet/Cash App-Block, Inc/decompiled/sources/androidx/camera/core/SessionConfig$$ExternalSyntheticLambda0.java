package androidx.camera.core;

import android.os.Build;
import android.util.Pair;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.compat.quirk.VideoInterlacingQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.core.backported.fixes.BackportedFixManager;
import androidx.core.backported.fixes.KnownIssue;
import androidx.core.backported.fixes.KnownIssues;
import androidx.core.backported.fixes.Status;
import androidx.core.util.Consumer;
import androidx.core.view.DisplayCompat;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class SessionConfig$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SessionConfig$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0492, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r3, "zeroflte", true) != false) goto L294;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void accept$androidx$camera$video$internal$compat$quirk$DeviceQuirks$$ExternalSyntheticLambda0(Object obj) {
        boolean z;
        QuirkSettings quirkSettings = (QuirkSettings) obj;
        ArrayList arrayList = new ArrayList();
        List list = MediaCodecInfoReportIncorrectInfoQuirk.INCORRECT_FHD_PROFILE_MODEL_LIST;
        String str = Build.BRAND;
        if (quirkSettings.shouldEnableQuirk(MediaCodecInfoReportIncorrectInfoQuirk.class, ("Nokia".equalsIgnoreCase(str) && "Nokia 1".equalsIgnoreCase(Build.MODEL)) || ("motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("infinix".equalsIgnoreCase(str) && "infinix x650".equalsIgnoreCase(Build.MODEL)) || (("LGE".equalsIgnoreCase(str) && "LG-X230".equalsIgnoreCase(Build.MODEL)) || (("Huawei".equalsIgnoreCase(str) && "mha-l29".equalsIgnoreCase(Build.MODEL)) || (("Redmi".equalsIgnoreCase(str) && "Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL)) || (("positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || MediaCodecInfoReportIncorrectInfoQuirk.INCORRECT_FHD_PROFILE_MODEL_LIST.contains(Build.MODEL.toLowerCase(Locale.US))))))))) {
            arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(CameraUseInconsistentTimebaseQuirk.class, CameraUseInconsistentTimebaseQuirk.load())) {
            arrayList.add(new CameraUseInconsistentTimebaseQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ReportedVideoQualityNotSupportedQuirk.class, ReportedVideoQualityNotSupportedQuirk.isHuaweiMate20() || ReportedVideoQualityNotSupportedQuirk.isHuaweiMate20Pro() || ("Vivo".equalsIgnoreCase(str) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ReportedVideoQualityNotSupportedQuirk.isHuaweiP40Lite() || ReportedVideoQualityNotSupportedQuirk.isOppoPht110())) {
            arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(VideoEncoderCrashQuirk.class, "positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new VideoEncoderCrashQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ExcludeStretchedVideoQualityQuirk.class, ("Samsung".equalsIgnoreCase(str) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-G610M".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str) && "SM-J710MN".equalsIgnoreCase(Build.MODEL)))))))) {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(MediaStoreVideoCannotWrite.class, ("positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) || ("itel".equalsIgnoreCase(str) && "itel w6004".equalsIgnoreCase(Build.MODEL)))) {
            arrayList.add(new MediaStoreVideoCannotWrite());
        }
        if (quirkSettings.shouldEnableQuirk(AudioEncoderIgnoresInputTimestampQuirk.class, "Sony".equalsIgnoreCase(str) && "G3125".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        "Samsung".equalsIgnoreCase(str);
        if (quirkSettings.shouldEnableQuirk(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, false)) {
            arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(NegativeLatLongSavesIncorrectlyQuirk.class, Build.VERSION.SDK_INT < 34)) {
            arrayList.add(new NegativeLatLongSavesIncorrectlyQuirk());
        }
        List list2 = AudioTimestampFramePositionIncorrectQuirk.AFFECTED_OPPO_MODELS;
        if (quirkSettings.shouldEnableQuirk(AudioTimestampFramePositionIncorrectQuirk.class, ("oppo".equalsIgnoreCase(str) && AudioTimestampFramePositionIncorrectQuirk.AFFECTED_OPPO_MODELS.contains(Build.MODEL.toLowerCase(Locale.ROOT))) || ("lge".equalsIgnoreCase(str) && "lg-m250".equalsIgnoreCase(Build.MODEL)) || (("motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL)) || (("realme".equalsIgnoreCase(str) && "rmx1941".equalsIgnoreCase(Build.MODEL)) || (("Xiaomi".equalsIgnoreCase(str) && "Redmi 6A".equalsIgnoreCase(Build.MODEL)) || (("vivo".equalsIgnoreCase(str) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) || ("vivo".equalsIgnoreCase(str) && "VIVO Y17".equalsIgnoreCase(Build.MODEL)))))))) {
            arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ExtraSupportedResolutionQuirk.class, "motorola".equalsIgnoreCase(str) && "moto e5 play".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new ExtraSupportedResolutionQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(StretchedVideoResolutionQuirk.class, "motorola".equalsIgnoreCase(str) && "moto e5 play".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new StretchedVideoResolutionQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(CodecStuckOnFlushQuirk.class, "Nokia".equalsIgnoreCase(str) && "Nokia 1".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new CodecStuckOnFlushQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, "motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ExtraSupportedQualityQuirk.class, "motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new ExtraSupportedQualityQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(SignalEosOutputBufferNotComeQuirk.class, "Nokia".equalsIgnoreCase(str) && "Nokia 1".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new SignalEosOutputBufferNotComeQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(SizeCannotEncodeVideoQuirk.class, "motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new SizeCannotEncodeVideoQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(PreviewBlackScreenQuirk.class, PreviewBlackScreenQuirk.isMotorolaEdge20Fusion || PreviewBlackScreenQuirk.isSamsungSmT580)) {
            arrayList.add(new PreviewBlackScreenQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.isCph1931)) {
            arrayList.add(PrematureEndOfStreamVideoQuirk.INSTANCE);
        }
        if (quirkSettings.shouldEnableQuirk(MediaCodecDefaultDataSpaceQuirk.class, true)) {
            arrayList.add(new MediaCodecDefaultDataSpaceQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(HdrRepeatingRequestFailureQuirk.class, "samsung".equalsIgnoreCase(str) && "pa3q".equalsIgnoreCase(Build.DEVICE))) {
            arrayList.add(new HdrRepeatingRequestFailureQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.isPixelPhone)) {
            arrayList.add(PreviewFreezeAfterHighSpeedRecordingQuirk.INSTANCE);
        }
        if (quirkSettings.shouldEnableQuirk(GLProcessingStuckOnCodecFlushQuirk.class, "positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(GLProcessingStuckOnCodecFlushQuirk.INSTANCE);
        }
        List listOf = CollectionsKt__CollectionsJVMKt.listOf("SM-N9208");
        String str2 = Build.MODEL;
        str2.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = str2.toUpperCase(locale);
        upperCase.getClass();
        if (!listOf.contains(upperCase)) {
            if (StringsKt__StringsJVMKt.equals(str, "Samsung", true)) {
                String str3 = Build.PRODUCT;
                str3.getClass();
            }
            z = false;
            if (quirkSettings.shouldEnableQuirk(VideoInterlacingQuirk.class, z)) {
                arrayList.add(VideoInterlacingQuirk.INSTANCE);
            }
            DeviceQuirks.sQuirks = new Quirks(arrayList);
            StringUtilsKt.d("DeviceQuirks", "video DeviceQuirks = " + Quirks.toString(DeviceQuirks.sQuirks));
        }
        z = true;
        if (quirkSettings.shouldEnableQuirk(VideoInterlacingQuirk.class, z)) {
        }
        DeviceQuirks.sQuirks = new Quirks(arrayList);
        StringUtilsKt.d("DeviceQuirks", "video DeviceQuirks = " + Quirks.toString(DeviceQuirks.sQuirks));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if ("Q2Q".equalsIgnoreCase(r7) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x034a, code lost:
    
        if (r14.equalsIgnoreCase("Jio") != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0359, code lost:
    
        if (r9.equalsIgnoreCase("Samsung") != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x035b, code lost:
    
        r13 = android.os.Build.BRAND;
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0364, code lost:
    
        if (r13.equalsIgnoreCase("Samsung") == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x037b, code lost:
    
        if (r9.equalsIgnoreCase("Vivo") != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x037d, code lost:
    
        r13 = android.os.Build.BRAND;
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0386, code lost:
    
        if (r13.equalsIgnoreCase("Vivo") == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0391, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x039a, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk.class, r11) == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x039c, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03a4, code lost:
    
        r11 = androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.isSamsungNote10PlusDevice;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03ac, code lost:
    
        if (r9.equalsIgnoreCase("Tecno") != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03ae, code lost:
    
        r13 = android.os.Build.BRAND;
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03b7, code lost:
    
        if (r13.equalsIgnoreCase("Tecno") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03c0, code lost:
    
        if (r9.equalsIgnoreCase("Tecno-mobile") != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03c6, code lost:
    
        if (r13.equalsIgnoreCase("Tecno-mobile") == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03cb, code lost:
    
        if (androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.isSamsungNote10PlusDevice != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03cf, code lost:
    
        if (androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.isPocoX3ProDevice == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03d2, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03db, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.class, r11) == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03dd, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03eb, code lost:
    
        if (r9.equalsIgnoreCase("Samsung") != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ed, code lost:
    
        r11 = android.os.Build.BRAND;
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03f6, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03fd, code lost:
    
        if (r9.equalsIgnoreCase("Xiaomi") != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0403, code lost:
    
        if (r11.equalsIgnoreCase("Xiaomi") == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0406, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x040f, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, r11) == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0411, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0419, code lost:
    
        r11 = androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.KNOWN_AFFECTED_MODELS;
        r15 = java.util.Locale.US;
        r6 = defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0.m(r15, r9, r15);
        r15 = r10.toLowerCase(r15);
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0437, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class, r11.contains(new androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.DeviceInfo(r6, r15))) == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0439, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0449, code lost:
    
        if (androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.BUILD_MODELS.contains(r10) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x044f, code lost:
    
        if (r9.equalsIgnoreCase("Google") != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0451, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x045a, code lost:
    
        if (r6.equalsIgnoreCase("Google") == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x045c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0465, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.class, r6) == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0467, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x046f, code lost:
    
        r6 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.AFFECTED_PIXEL_MODELS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0477, code lost:
    
        if (r9.equalsIgnoreCase("Samsung") != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0479, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0482, code lost:
    
        if (r6.equalsIgnoreCase("Samsung") == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0491, code lost:
    
        r6 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.AFFECTED_PIXEL_MODELS;
        r15 = r10.toLowerCase(r12);
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x049e, code lost:
    
        if (r6.contains(r15) == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04a0, code lost:
    
        r6 = android.os.Build.ID;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04a9, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r6, "TP1A", true) != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04ab, code lost:
    
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04b4, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r6, "TD1A", true) == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0521, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x052a, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.class, r3) == false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x052c, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0538, code lost:
    
        if (com.squareup.cash.advertising.views.FullscreenAdViewKt.isOnePlus6$camera_camera2() != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x053e, code lost:
    
        if (com.squareup.cash.advertising.views.FullscreenAdViewKt.isOnePlus6T$camera_camera2() != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0544, code lost:
    
        if (com.squareup.cash.advertising.views.FullscreenAdViewKt.isHuaweiP20Lite$camera_camera2() != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x054a, code lost:
    
        if (com.squareup.cash.advertising.views.FullscreenAdViewKt.isSamsungJ7PrimeApi27Above$camera_camera2() != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0550, code lost:
    
        if (com.squareup.cash.advertising.views.FullscreenAdViewKt.isSamsungJ7Api27Above$camera_camera2() != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0556, code lost:
    
        if (com.squareup.cash.advertising.views.FullscreenAdViewKt.isRedmiNote9Pro$camera_camera2() != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x055c, code lost:
    
        if (com.squareup.cash.advertising.views.FullscreenAdViewKt.isSamsungA05s$camera_camera2() != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0562, code lost:
    
        if (com.squareup.cash.advertising.views.FullscreenAdViewKt.isNokia7Plus$camera_camera2() != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0568, code lost:
    
        if (com.squareup.cash.advertising.views.FullscreenAdViewKt.isSamsungZFold4$camera_camera2() == false) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x056b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0574, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.class, r3) == false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0576, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x057e, code lost:
    
        r3 = androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x058a, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.class, com.squareup.cash.money.booklet.DisclosureSectionKt.isSamsungDistortion$camera_camera2()) == false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x058c, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x059a, code lost:
    
        if (r9.equalsIgnoreCase("Motorola") != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x059c, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05a5, code lost:
    
        if (r6.equalsIgnoreCase("Motorola") == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x05b2, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x05b9, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk.class, r3) == false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05bb, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05c3, code lost:
    
        r3 = androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION;
        r3 = android.os.Build.DEVICE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05ce, code lost:
    
        if ("heroqltevzw".equalsIgnoreCase(r3) != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05d7, code lost:
    
        if ("heroqltetmo".equalsIgnoreCase(r3) == false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05de, code lost:
    
        if (com.squareup.cash.money.booklet.HeaderSectionKt.supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2() != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05e4, code lost:
    
        if (com.squareup.cash.money.booklet.HeaderSectionKt.supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2() == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05e7, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x05f0, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class, r6) == false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x05f2, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x05fa, code lost:
    
        r6 = androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.DEVICE_MODELS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0600, code lost:
    
        if (r9.equalsIgnoreCase("Google") != false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0602, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
        r6.equalsIgnoreCase("Google");
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0611, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class, false) == false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0613, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x061b, code lost:
    
        r6 = androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.SUPPORTED_DEVICES;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0621, code lost:
    
        if (r9.equalsIgnoreCase("Google") != false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0623, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x062c, code lost:
    
        if (r6.equalsIgnoreCase("Google") == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0649, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0650, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.class, r3) == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0652, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0660, code lost:
    
        if (r9.equalsIgnoreCase("Huawei") != false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0662, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x066b, code lost:
    
        if (r6.equalsIgnoreCase("Huawei") == false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0678, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x067f, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class, r3) == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0681, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x068d, code lost:
    
        if (r9.equalsIgnoreCase("Samsung") != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x068f, code lost:
    
        r3 = android.os.Build.BRAND;
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0698, code lost:
    
        if (r3.equalsIgnoreCase("Samsung") == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x06ac, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x06b3, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class, r8) == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x06b5, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x06bd, code lost:
    
        r3 = androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.BUILD_MODELS;
        r6 = r10.toLowerCase(r12);
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x06d0, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.class, r3.contains(r6)) == false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x06d2, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x06da, code lost:
    
        r3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.BUILD_HARDWARE_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x06e0, code lost:
    
        if (r9.equalsIgnoreCase("Samsung") != false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x06e2, code lost:
    
        r3 = android.os.Build.BRAND;
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x06eb, code lost:
    
        if (r3.equalsIgnoreCase("Samsung") == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x070a, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0711, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, r8) == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0713, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0722, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class, false) == false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0724, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x072c, code lost:
    
        r3 = androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.AFFECTED_SAMSUNG_MODEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0732, code lost:
    
        if (r9.equalsIgnoreCase("Samsung") != false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0734, code lost:
    
        r3 = android.os.Build.BRAND;
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x073d, code lost:
    
        if (r3.equalsIgnoreCase("Samsung") == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x074c, code lost:
    
        if (r9.equalsIgnoreCase("Xiaomi") != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if ("OP4E75L1".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x074e, code lost:
    
        r2 = android.os.Build.BRAND;
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0757, code lost:
    
        if (r2.equalsIgnoreCase("Xiaomi") == false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0762, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0769, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.class, r5) == false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x076b, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.ZslDisablerQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0773, code lost:
    
        r2 = androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.MODEL_TO_DISPLAY_SIZE_MAP;
        r3 = r10.toUpperCase(r12);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0786, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.class, r2.containsKey(r3)) == false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0788, code lost:
    
        r7.add(new androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0798, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.class, androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.isTclDevice) == false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x079a, code lost:
    
        r7.add(androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x079f, code lost:
    
        androidx.camera.camera2.compat.quirk.DeviceQuirks.all = new androidx.camera.core.impl.Quirks(r7);
        utils.StringUtilsKt.d("DeviceQuirks", "camera2 DeviceQuirks = " + androidx.camera.core.impl.Quirks.toString(androidx.camera.camera2.compat.quirk.DeviceQuirks.getAll()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x075f, code lost:
    
        if (squareup.cash.earnings.EarningsHomeUi.Section.AbstractC0087Section.isAffectedModel(androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.AFFECTED_XIAOMI_MODEL) == false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0745, code lost:
    
        if (squareup.cash.earnings.EarningsHomeUi.Section.AbstractC0087Section.isAffectedModel(androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.AFFECTED_SAMSUNG_MODEL) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06ed, code lost:
    
        r3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.BUILD_HARDWARE_SET;
        r6 = android.os.Build.HARDWARE;
        r6.getClass();
        r8 = java.util.Locale.getDefault();
        r8.getClass();
        r6 = r6.toLowerCase(r8);
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0706, code lost:
    
        if (r3.contains(r6) == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0708, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x069a, code lost:
    
        r3 = r10.toUpperCase(r12);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x06a8, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r3, "SM-A716", false) == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x06aa, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0674, code lost:
    
        if ("mha-l29".equalsIgnoreCase(r10) == false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0676, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x062e, code lost:
    
        r6 = androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.SUPPORTED_DEVICES;
        r3.getClass();
        r8 = java.util.Locale.getDefault();
        r8.getClass();
        r3 = r3.toLowerCase(r8);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0645, code lost:
    
        if (r6.contains(r3) == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0647, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x05e9, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x05ae, code lost:
    
        if ("moto e5 play".equalsIgnoreCase(r10) == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x05b0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x056d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x04be, code lost:
    
        if (r9.equalsIgnoreCase("Redmi") != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x04c0, code lost:
    
        r15 = android.os.Build.BRAND;
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04c9, code lost:
    
        if (r15.equalsIgnoreCase("Redmi") == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x04cc, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if ("Q706F".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x04d3, code lost:
    
        if (r9.equalsIgnoreCase("Xiaomi") != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x04d5, code lost:
    
        r15 = android.os.Build.BRAND;
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x04de, code lost:
    
        if (r15.equalsIgnoreCase("Xiaomi") == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x04e1, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x04e5, code lost:
    
        if ((r6 | r15) == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x04e7, code lost:
    
        r6 = android.os.Build.ID;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x04f2, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r6, "TKQ1", true) != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04f4, code lost:
    
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04fb, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r6, "TP1A", true) == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04fe, code lost:
    
        r6 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.AFFECTED_OPPO_MODELS;
        r14 = r10.toLowerCase(r12);
        r14.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x050b, code lost:
    
        if (r6.contains(r14) == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x050d, code lost:
    
        if (r8 != 33) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0510, code lost:
    
        r6 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.AFFECTED_ONE_PLUS_MODELS;
        r14 = r10.toLowerCase(r12);
        r14.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x051d, code lost:
    
        if (r6.contains(r14) == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x051f, code lost:
    
        if (r8 != 33) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0523, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x04e3, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x04ce, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0484, code lost:
    
        r6 = android.os.Build.ID;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x048d, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r6, "TP1A", true) == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x045e, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0408, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x03d4, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x038e, code lost:
    
        if (r10.equalsIgnoreCase("VIVO 2039") == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0393, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x036c, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r10, "SM-A025", true) != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0374, code lost:
    
        if (r10.equalsIgnoreCase("SM-S124DL") == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0352, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r10, "LS1542QW", true) != false) goto L197;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    @Override // androidx.core.util.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        List list;
        String upperCase;
        String str;
        String str2;
        Status status;
        boolean z3;
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                QuirkSettings quirkSettings = (QuirkSettings) obj;
                quirkSettings.getClass();
                ArrayList arrayList = new ArrayList();
                int i = PixelJpegRSupportedQuirk.$r8$clinit;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    BackportedFixManager backportedFixManager = (BackportedFixManager) BackportedFixQuirk.backportedFixManager$delegate.getValue();
                    KnownIssue knownIssue = KnownIssues.KI_398591036;
                    backportedFixManager.getClass();
                    knownIssue.getClass();
                    if (!((Boolean) knownIssue.precondition.invoke()).booleanValue()) {
                        status = Status.NotApplicable;
                    } else if (knownIssue.manuallyTestedFingerprints.contains(Build.FINGERPRINT)) {
                        status = Status.Fixed;
                    } else {
                        Toolbar.AnonymousClass1 anonymousClass1 = backportedFixManager.resolver;
                        anonymousClass1.getClass();
                        status = ((Set) ((Lazy) anonymousClass1.this$0).getValue()).contains(5) ? Status.Fixed : Status.NotFixed;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1 && ordinal != 2) {
                            if (ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        }
                    }
                    z = true;
                    if (quirkSettings.shouldEnableQuirk(PixelJpegRSupportedQuirk.class, z)) {
                        arrayList.add(new PixelJpegRSupportedQuirk());
                    }
                    if (!CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7570Device && !CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7870Device && (30 > i2 || i2 >= 34 || (!DisplayCompat.isDeviceFrom("Oppo") && !DisplayCompat.isDeviceFrom("OnePlus") && !DisplayCompat.isDeviceFrom("Realme")))) {
                        str2 = Build.MANUFACTURER;
                        str2.getClass();
                        if (!str2.equalsIgnoreCase("Vivo")) {
                            String str3 = Build.BRAND;
                            str3.getClass();
                            if (!str3.equalsIgnoreCase("Vivo") && !CloseCameraDeviceOnCameraGraphCloseQuirk.isXiaomiProblematicDevice && !CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungProblematicDevice && !CloseCameraDeviceOnCameraGraphCloseQuirk.isSonyProblematicDevice) {
                                z2 = false;
                                if (quirkSettings.shouldEnableQuirk(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z2)) {
                                    arrayList.add(new CloseCameraDeviceOnCameraGraphCloseQuirk());
                                }
                                list = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.AFFECTED_MODELS;
                                String str4 = Build.MODEL;
                                str4.getClass();
                                Locale locale = Locale.ROOT;
                                upperCase = str4.toUpperCase(locale);
                                upperCase.getClass();
                                if (quirkSettings.shouldEnableQuirk(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list.contains(upperCase))) {
                                    arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
                                }
                                str = Build.MANUFACTURER;
                                str.getClass();
                                if (!str.equalsIgnoreCase("Jio")) {
                                    String str5 = Build.BRAND;
                                    str5.getClass();
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (quirkSettings.shouldEnableQuirk(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z2)) {
                    }
                    list = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.AFFECTED_MODELS;
                    String str42 = Build.MODEL;
                    str42.getClass();
                    Locale locale2 = Locale.ROOT;
                    upperCase = str42.toUpperCase(locale2);
                    upperCase.getClass();
                    if (quirkSettings.shouldEnableQuirk(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list.contains(upperCase))) {
                    }
                    str = Build.MANUFACTURER;
                    str.getClass();
                    if (!str.equalsIgnoreCase("Jio")) {
                    }
                }
                z = false;
                if (quirkSettings.shouldEnableQuirk(PixelJpegRSupportedQuirk.class, z)) {
                }
                if (!CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7570Device) {
                    str2 = Build.MANUFACTURER;
                    str2.getClass();
                    if (!str2.equalsIgnoreCase("Vivo")) {
                    }
                }
                z2 = true;
                if (quirkSettings.shouldEnableQuirk(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z2)) {
                }
                list = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.AFFECTED_MODELS;
                String str422 = Build.MODEL;
                str422.getClass();
                Locale locale22 = Locale.ROOT;
                upperCase = str422.toUpperCase(locale22);
                upperCase.getClass();
                if (quirkSettings.shouldEnableQuirk(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list.contains(upperCase))) {
                }
                str = Build.MANUFACTURER;
                str.getClass();
                if (!str.equalsIgnoreCase("Jio")) {
                }
                break;
            case 2:
                QuirkSettings quirkSettings2 = (QuirkSettings) obj;
                ArrayList arrayList2 = new ArrayList();
                String str6 = Build.BRAND;
                if (quirkSettings2.shouldEnableQuirk(ImageCaptureRotationOptionQuirk.class, ("HUAWEI".equalsIgnoreCase(str6) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str6) && "STK-LX1".equalsIgnoreCase(Build.MODEL)))) {
                    arrayList2.add(new ImageCaptureRotationOptionQuirk());
                }
                if (quirkSettings2.shouldEnableQuirk(SurfaceOrderQuirk.class, true)) {
                    arrayList2.add(new SurfaceOrderQuirk());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.FAILED_RETRY_ALLOW_LIST;
                Locale locale3 = Locale.US;
                String upperCase2 = str6.toUpperCase(locale3);
                String str7 = Build.MODEL;
                if (quirkSettings2.shouldEnableQuirk(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.FAILED_RETRY_ALLOW_LIST.contains(Pair.create(upperCase2, str7.toUpperCase(locale3))))) {
                    arrayList2.add(new CaptureFailedRetryQuirk());
                }
                if (quirkSettings2.shouldEnableQuirk(LowMemoryQuirk.class, LowMemoryQuirk.DEVICE_MODELS.contains(str7.toUpperCase(locale3)))) {
                    arrayList2.add(new LowMemoryQuirk());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.SAMSUNG_DEVICE_MODELS;
                if (quirkSettings2.shouldEnableQuirk(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str6) || LargeJpegImageQuirk.isVivoProblematicDevice())) {
                    arrayList2.add(new LargeJpegImageQuirk());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.SAMSUNG_DEVICES;
                if (quirkSettings2.shouldEnableQuirk(IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str6) && IncorrectJpegMetadataQuirk.SAMSUNG_DEVICES.contains(Build.DEVICE.toUpperCase(locale3)))) {
                    arrayList2.add(new IncorrectJpegMetadataQuirk());
                }
                HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.PIXEL_MODELS;
                if (quirkSettings2.shouldEnableQuirk(ImageCaptureFailedForSpecificCombinationQuirk.class, ("oneplus".equalsIgnoreCase(str6) && "cph2583".equalsIgnoreCase(str7)) || ("google".equalsIgnoreCase(str6) && ImageCaptureFailedForSpecificCombinationQuirk.PIXEL_MODELS.contains(str7.toLowerCase())))) {
                    arrayList2.add(new ImageCaptureFailedForSpecificCombinationQuirk());
                }
                PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.INSTANCE;
                if (quirkSettings2.shouldEnableQuirk(PreviewGreenTintQuirk.class, "motorola".equalsIgnoreCase(str6) && "moto e20".equalsIgnoreCase(str7))) {
                    arrayList2.add(previewGreenTintQuirk);
                }
                androidx.camera.core.internal.compat.quirk.DeviceQuirks.sQuirks = new Quirks(arrayList2);
                StringUtilsKt.d("DeviceQuirks", "core DeviceQuirks = " + Quirks.toString(androidx.camera.core.internal.compat.quirk.DeviceQuirks.sQuirks));
                break;
            case 3:
                break;
            case 4:
                accept$androidx$camera$video$internal$compat$quirk$DeviceQuirks$$ExternalSyntheticLambda0(obj);
                break;
            case 5:
                QuirkSettings quirkSettings3 = (QuirkSettings) obj;
                ArrayList arrayList3 = new ArrayList();
                if (Build.VERSION.SDK_INT < 33) {
                    String str8 = Build.MANUFACTURER;
                    if ("SAMSUNG".equalsIgnoreCase(str8)) {
                        String str9 = Build.DEVICE;
                        if (!"F2Q".equalsIgnoreCase(str9)) {
                            break;
                        }
                        z3 = true;
                        if (quirkSettings3.shouldEnableQuirk(SurfaceViewStretchedQuirk.class, z3)) {
                            arrayList3.add(new SurfaceViewStretchedQuirk());
                        }
                        if (quirkSettings3.shouldEnableQuirk(SurfaceViewNotCroppedByParentQuirk.class, !"XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                            arrayList3.add(new SurfaceViewNotCroppedByParentQuirk());
                        }
                        androidx.camera.view.internal.compat.quirk.DeviceQuirks.sQuirks = new Quirks(arrayList3);
                        StringUtilsKt.d("DeviceQuirks", "view DeviceQuirks = " + Quirks.toString(androidx.camera.view.internal.compat.quirk.DeviceQuirks.sQuirks));
                        break;
                    }
                    if ("OPPO".equalsIgnoreCase(str8)) {
                        break;
                    }
                    if ("LENOVO".equalsIgnoreCase(str8)) {
                        break;
                    }
                }
                z3 = false;
                if (quirkSettings3.shouldEnableQuirk(SurfaceViewStretchedQuirk.class, z3)) {
                }
                if (quirkSettings3.shouldEnableQuirk(SurfaceViewNotCroppedByParentQuirk.class, !"XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                }
                androidx.camera.view.internal.compat.quirk.DeviceQuirks.sQuirks = new Quirks(arrayList3);
                StringUtilsKt.d("DeviceQuirks", "view DeviceQuirks = " + Quirks.toString(androidx.camera.view.internal.compat.quirk.DeviceQuirks.sQuirks));
            default:
                int i3 = ((AutoValue_SurfaceRequest_Result) obj).resultCode;
                break;
        }
    }
}
