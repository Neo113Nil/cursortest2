package androidx.camera.camera2.pipe.core;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.camera2.adapter.PhysicalCameraInfoAdapter;
import androidx.camera.camera2.adapter.ZslControlImpl;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk;
import androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.UseCaseCameraState;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda1;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.camera.viewfinder.core.impl.RefCounted;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.selection.ToggleableNode;
import androidx.compose.foundation.text.HeightInLinesNode;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import retrofit2.RequestFactory;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Threads$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Threads$$ExternalSyntheticLambda1(CameraMetadata cameraMetadata, AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        this.$r8$classId = 3;
        this.f$0 = cameraMetadata;
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x04dd, code lost:
    
        if (r6.equalsIgnoreCase("Motorola") != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04ef, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04f1, code lost:
    
        r1 = android.os.Build.BRAND;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04fa, code lost:
    
        if (r1.equalsIgnoreCase("Samsung") == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x050c, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x050e, code lost:
    
        r1 = android.os.Build.BRAND;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0517, code lost:
    
        if (r1.equalsIgnoreCase("Samsung") == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0528, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x052a, code lost:
    
        r1 = android.os.Build.BRAND;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0533, code lost:
    
        if (r1.equalsIgnoreCase("Samsung") == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0544, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0546, code lost:
    
        r1 = android.os.Build.BRAND;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x054f, code lost:
    
        if (r1.equalsIgnoreCase("Samsung") == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0562, code lost:
    
        if (r11.equalsIgnoreCase("Xiaomi") != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0564, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x056d, code lost:
    
        if (r6.equalsIgnoreCase("Xiaomi") == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x057b, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0582, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk.class, r1) == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0584, code lost:
    
        r3.add(new androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0592, code lost:
    
        if (r11.equalsIgnoreCase("Huawei") != false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0594, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x059d, code lost:
    
        if (r6.equalsIgnoreCase("Huawei") == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x05af, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") != false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05b1, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05ba, code lost:
    
        if (r6.equalsIgnoreCase("Samsung") == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05cd, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05cf, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05d8, code lost:
    
        if (r6.equalsIgnoreCase("Samsung") == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05ea, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") != false) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05ec, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05f5, code lost:
    
        if (r6.equalsIgnoreCase("Samsung") == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0609, code lost:
    
        if (r11.equalsIgnoreCase("Oppo") != false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x060b, code lost:
    
        r7 = android.os.Build.BRAND;
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0614, code lost:
    
        if (r7.equalsIgnoreCase("Oppo") == false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0625, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0627, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0630, code lost:
    
        if (r6.equalsIgnoreCase("Samsung") == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x063f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0646, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class, r6) == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0648, code lost:
    
        r3.add(new androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0654, code lost:
    
        if (r11.equalsIgnoreCase("Huawei") != false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0656, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x065f, code lost:
    
        if (r6.equalsIgnoreCase("Huawei") == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0662, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x066b, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class, r6) == false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x066d, code lost:
    
        r3.add(new androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0679, code lost:
    
        if (r11.equalsIgnoreCase("Samsung") != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x067b, code lost:
    
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0684, code lost:
    
        if (r6.equalsIgnoreCase("Samsung") == false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0693, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x069a, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class, r5) == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x069c, code lost:
    
        r3.add(new androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x06a8, code lost:
    
        if (squareup.cash.earnings.EarningTool.Tool.isBluStudioX10() != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x06ae, code lost:
    
        if (squareup.cash.earnings.EarningTool.Tool.isItelW6004() != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x06b4, code lost:
    
        if (squareup.cash.earnings.EarningTool.Tool.isVivo1805() != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x06ba, code lost:
    
        if (squareup.cash.earnings.EarningTool.Tool.isPositivoTwist2Pro() != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x06c5, code lost:
    
        if ("pixel 4 xl".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x06cb, code lost:
    
        if (android.os.Build.VERSION.SDK_INT != 29) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x06d2, code lost:
    
        if (squareup.cash.earnings.EarningTool.Tool.isMotoE13() != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06d8, code lost:
    
        if (squareup.cash.earnings.EarningTool.Tool.isSamsungTabA8() != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06de, code lost:
    
        if (squareup.cash.earnings.EarningTool.Tool.isSamsungA53() != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x06e4, code lost:
    
        if (androidx.core.view.DisplayCompat.isUniSocChipsetDevice() == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x06e7, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x06f0, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, r5) == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06f2, code lost:
    
        r3.add(new androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x06fa, code lost:
    
        r5 = android.os.Build.MODEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0702, code lost:
    
        if ("Pixel 8".equalsIgnoreCase(r5) == false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0704, code lost:
    
        r6 = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
        r6.getClass();
        r6 = (java.lang.Integer) ((androidx.camera.camera2.pipe.compat.Camera2CameraMetadata) r4).get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0712, code lost:
    
        if (r6 != null) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0719, code lost:
    
        if (r6.intValue() != 0) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x071b, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0724, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk.class, r6) == false) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0726, code lost:
    
        r3.add(new androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x072e, code lost:
    
        r6 = androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.PROBLEMATIC_UNI_SOC_MODELS;
        r5.getClass();
        r7 = r5.toLowerCase(java.util.Locale.ROOT);
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0740, code lost:
    
        if (r6.contains(r7) != false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0746, code lost:
    
        if (androidx.core.view.DisplayCompat.isUniSocChipsetDevice() != false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x074c, code lost:
    
        if (r11.equalsIgnoreCase("Huawei") != false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x074e, code lost:
    
        r11 = android.os.Build.BRAND;
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0757, code lost:
    
        if (r11.equalsIgnoreCase("Huawei") == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0762, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x076b, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class, r11) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x076d, code lost:
    
        r3.add(new androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x077f, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, retrofit2.DefaultMethodSupport.isSamsungM55()) == false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0781, code lost:
    
        r3.add(new androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0789, code lost:
    
        r11 = androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.BUILD_MODEL_PREFIXES;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x078f, code lost:
    
        if ((r11 instanceof java.util.Collection) == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0798, code lost:
    
        if (r11.isEmpty() == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x07d6, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x07db, code lost:
    
        if (r0.shouldEnableQuirk(androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.class, r8) == false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x07dd, code lost:
    
        r3.add(new androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk());
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x07e5, code lost:
    
        r11 = new androidx.camera.core.impl.Quirks(r3);
        utils.StringUtilsKt.d("CameraQuirks", "camera2 CameraQuirks = " + androidx.camera.core.impl.Quirks.toString(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0801, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x079b, code lost:
    
        r11 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x07a3, code lost:
    
        if (r11.hasNext() == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x07a5, code lost:
    
        r1 = (java.lang.String) r11.next();
        r5 = android.os.Build.MODEL;
        r5.getClass();
        r5 = r5.toLowerCase(java.util.Locale.ROOT);
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x07bd, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r5, r1, false) == false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07bf, code lost:
    
        r11 = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
        r11.getClass();
        r11 = (java.lang.Integer) ((androidx.camera.camera2.pipe.compat.Camera2CameraMetadata) r4).get(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07cc, code lost:
    
        if (r11 != null) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x07d3, code lost:
    
        if (r11.intValue() != 1) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x075f, code lost:
    
        if ("FIG-LX1".equalsIgnoreCase(r5) == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0764, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x071d, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x06e9, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0686, code lost:
    
        androidx.camera.camera2.pipe.CameraMetadata.Companion.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x068f, code lost:
    
        if (androidx.camera.camera2.pipe.CameraMetadata.Companion.isHardwareLevelLegacy(r4) == false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0691, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0664, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x063b, code lost:
    
        if ("sm-j510fn".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x063d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x061e, code lost:
    
        if ("A37F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0600, code lost:
    
        if ("sm-j111f".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x05e3, code lost:
    
        if ("sm-j700f".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x05c5, code lost:
    
        if ("sm-j320f".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x05a7, code lost:
    
        if ("HUAWEI ALE-L04".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0577, code lost:
    
        if ("Mi A1".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0579, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0559, code lost:
    
        if ("SM-J415F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x053d, code lost:
    
        if ("SM-A920F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0521, code lost:
    
        if ("SM-J700F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0504, code lost:
    
        if ("SM-G532F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x04e7, code lost:
    
        if ("MotoG3".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c7, code lost:
    
        if (r1.equalsIgnoreCase("Samsung") != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x02e5 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        boolean z;
        List list;
        String upperCase;
        boolean z2;
        Iterator it;
        boolean z3;
        List list2;
        String lowerCase;
        boolean z4;
        List list3;
        String lowerCase2;
        boolean z5;
        List list4;
        String lowerCase3;
        List list5;
        String upperCase2;
        boolean z6;
        List list6;
        String lowerCase4;
        boolean z7;
        List list7;
        String lowerCase5;
        Set set;
        String lowerCase6;
        boolean z8;
        Iterator it2;
        boolean z9;
        String str;
        int i = this.$r8$classId;
        int i2 = 3;
        Range range = null;
        boolean z10 = true;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return (Executor) ((ThreadConfigModule$$ExternalSyntheticLambda1) obj2).invoke();
            case 1:
                return new Camera2CameraInfo(((PhysicalCameraInfoAdapter) obj2).cameraProperties);
            case 2:
                CameraMetadata cameraMetadata = ((ZslControlImpl) obj2).cameraMetadata;
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                key.getClass();
                Object obj3 = ((Camera2CameraMetadata) cameraMetadata).get(key);
                if (obj3 != null) {
                    return (StreamConfigurationMap) obj3;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return null;
            case 3:
                CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                key2.getClass();
                Range[] rangeArr = (Range[]) ((Camera2CameraMetadata) ((CameraMetadata) obj2)).get(key2);
                if (rangeArr != null && rangeArr.length != 0) {
                    for (Range range2 : rangeArr) {
                        Integer num = (Integer) range2.getUpper();
                        Integer num2 = (Integer) range2.getLower();
                        if (((Number) range2.getUpper()).intValue() >= 1000) {
                            num = Integer.valueOf(((Number) range2.getUpper()).intValue() / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                        }
                        if (((Number) range2.getLower()).intValue() >= 1000) {
                            num2 = Integer.valueOf(((Number) range2.getLower()).intValue() / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                        }
                        Range range3 = new Range(num2, num);
                        Integer num3 = (Integer) range3.getUpper();
                        if (num3 != null && num3.intValue() == 30 && (range == null || ((Number) range3.getLower()).intValue() < ((Number) range.getLower()).intValue())) {
                            range = range3;
                        }
                    }
                }
                return range;
            case 4:
                Size[] outputSizes = ((CamcorderProfileResolutionQuirk) obj2).streamConfigurationMapCompat.getOutputSizes(34);
                if (outputSizes != null) {
                    obj = Arrays.asList(outputSizes);
                    obj.getClass();
                } else {
                    obj = EmptyList.INSTANCE;
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "supportedResolutions = " + obj);
                }
                return obj;
            case 5:
                CameraQuirks cameraQuirks = (CameraQuirks) obj2;
                QuirkSettingsHolder quirkSettingsHolder = QuirkSettingsHolder.sInstance;
                quirkSettingsHolder.getClass();
                try {
                    QuirkSettings quirkSettings = (QuirkSettings) quirkSettingsHolder.mObservable.fetchData().get();
                    quirkSettings.getClass();
                    ArrayList arrayList = new ArrayList();
                    CameraMetadata cameraMetadata2 = cameraQuirks.cameraMetadata;
                    if (cameraMetadata2 == null) {
                        if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                            Log.e("CXCP", "Failed to enable quirks: camera metadata injection failed");
                        }
                        return new Quirks(arrayList);
                    }
                    CameraMetadata.Companion.getClass();
                    if (quirkSettings.shouldEnableQuirk(AeFpsRangeLegacyQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                        arrayList.add(new AeFpsRangeLegacyQuirk(cameraMetadata2));
                    }
                    String str2 = Build.MANUFACTURER;
                    str2.getClass();
                    if (!str2.equalsIgnoreCase("Samsung")) {
                        String str3 = Build.BRAND;
                        str3.getClass();
                        break;
                    }
                    if (Build.VERSION.SDK_INT < 33) {
                        CameraCharacteristics.Key key3 = CameraCharacteristics.LENS_FACING;
                        key3.getClass();
                        Integer num4 = (Integer) ((Camera2CameraMetadata) cameraMetadata2).get(key3);
                        if (num4 != null && num4.intValue() == 0) {
                            z = true;
                            if (quirkSettings.shouldEnableQuirk(AfRegionFlipHorizontallyQuirk.class, z)) {
                                arrayList.add(new AfRegionFlipHorizontallyQuirk());
                            }
                            CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2);
                            if (quirkSettings.shouldEnableQuirk(AspectRatioLegacyApi21Quirk.class, false)) {
                                arrayList.add(new AspectRatioLegacyApi21Quirk());
                            }
                            if (quirkSettings.shouldEnableQuirk(CamcorderProfileResolutionQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                                arrayList.add(new CamcorderProfileResolutionQuirk(cameraQuirks.streamConfigurationMapCompat));
                            }
                            list = CameraNoResponseWhenEnablingFlashQuirk.AFFECTED_MODELS;
                            String str4 = Build.MODEL;
                            str4.getClass();
                            upperCase = str4.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            if (list.contains(upperCase)) {
                                CameraCharacteristics.Key key4 = CameraCharacteristics.LENS_FACING;
                                key4.getClass();
                                Integer num5 = (Integer) ((Camera2CameraMetadata) cameraMetadata2).get(key4);
                                if (num5 != null && num5.intValue() == 1) {
                                    z2 = true;
                                    if (quirkSettings.shouldEnableQuirk(CameraNoResponseWhenEnablingFlashQuirk.class, z2)) {
                                        arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
                                    }
                                    if (quirkSettings.shouldEnableQuirk(CaptureSessionStuckQuirk.class, false)) {
                                        arrayList.add(new CaptureSessionStuckQuirk());
                                    }
                                    if (quirkSettings.shouldEnableQuirk(CloseCaptureSessionOnVideoQuirk.class, true)) {
                                        arrayList.add(new CloseCaptureSessionOnVideoQuirk());
                                    }
                                    if (quirkSettings.shouldEnableQuirk(ConfigureSurfaceToSecondarySessionFailQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                                        arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
                                    }
                                    if (quirkSettings.shouldEnableQuirk(FinalizeSessionOnCloseQuirk.class, true)) {
                                        arrayList.add(new FinalizeSessionOnCloseQuirk());
                                    }
                                    it = FlashTooSlowQuirk.AFFECTED_MODEL_PREFIXES.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            String str5 = (String) it.next();
                                            String str6 = Build.MODEL;
                                            str6.getClass();
                                            String upperCase3 = str6.toUpperCase(Locale.ROOT);
                                            upperCase3.getClass();
                                            if (StringsKt__StringsJVMKt.startsWith(upperCase3, str5, false)) {
                                                CameraCharacteristics.Key key5 = CameraCharacteristics.LENS_FACING;
                                                key5.getClass();
                                                Integer num6 = (Integer) ((Camera2CameraMetadata) cameraMetadata2).get(key5);
                                                z3 = num6 != null && num6.intValue() == 1;
                                            }
                                        }
                                    }
                                    if (quirkSettings.shouldEnableQuirk(FlashTooSlowQuirk.class, z3)) {
                                        arrayList.add(new FlashTooSlowQuirk());
                                    }
                                    list2 = ImageCaptureFailWithAutoFlashQuirk.BUILD_MODELS_FRONT_CAMERA;
                                    String str7 = Build.MODEL;
                                    str7.getClass();
                                    Locale locale = Locale.ROOT;
                                    lowerCase = str7.toLowerCase(locale);
                                    lowerCase.getClass();
                                    if (list2.contains(lowerCase)) {
                                        CameraCharacteristics.Key key6 = CameraCharacteristics.LENS_FACING;
                                        key6.getClass();
                                        Integer num7 = (Integer) ((Camera2CameraMetadata) cameraMetadata2).get(key6);
                                        if (num7 != null && num7.intValue() == 0) {
                                            z4 = true;
                                            if (quirkSettings.shouldEnableQuirk(ImageCaptureFailWithAutoFlashQuirk.class, z4)) {
                                                arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
                                            }
                                            list3 = ImageCaptureFlashNotFireQuirk.BUILD_MODELS_FRONT_CAMERA;
                                            lowerCase2 = str7.toLowerCase(locale);
                                            lowerCase2.getClass();
                                            if (list3.contains(lowerCase2)) {
                                                CameraCharacteristics.Key key7 = CameraCharacteristics.LENS_FACING;
                                                key7.getClass();
                                                Integer num8 = (Integer) ((Camera2CameraMetadata) cameraMetadata2).get(key7);
                                                if (num8 != null && num8.intValue() == 0) {
                                                    z5 = true;
                                                    list4 = ImageCaptureFlashNotFireQuirk.BUILD_MODELS;
                                                    lowerCase3 = str7.toLowerCase(locale);
                                                    lowerCase3.getClass();
                                                    if (quirkSettings.shouldEnableQuirk(ImageCaptureFlashNotFireQuirk.class, !z5 || list4.contains(lowerCase3))) {
                                                        arrayList.add(new ImageCaptureFlashNotFireQuirk());
                                                    }
                                                    list5 = ImageCaptureWashedOutImageQuirk.BUILD_MODELS;
                                                    upperCase2 = str7.toUpperCase(locale);
                                                    upperCase2.getClass();
                                                    if (list5.contains(upperCase2)) {
                                                        CameraCharacteristics.Key key8 = CameraCharacteristics.LENS_FACING;
                                                        key8.getClass();
                                                        Integer num9 = (Integer) ((Camera2CameraMetadata) cameraMetadata2).get(key8);
                                                        if (num9 != null && num9.intValue() == 1) {
                                                            z6 = true;
                                                            if (quirkSettings.shouldEnableQuirk(ImageCaptureWashedOutImageQuirk.class, z6)) {
                                                                arrayList.add(new ImageCaptureWashedOutImageQuirk());
                                                            }
                                                            list6 = ImageCaptureWithFlashUnderexposureQuirk.BUILD_MODELS;
                                                            lowerCase4 = str7.toLowerCase(locale);
                                                            lowerCase4.getClass();
                                                            if (list6.contains(lowerCase4)) {
                                                                CameraCharacteristics.Key key9 = CameraCharacteristics.LENS_FACING;
                                                                key9.getClass();
                                                                Integer num10 = (Integer) ((Camera2CameraMetadata) cameraMetadata2).get(key9);
                                                                if (num10 != null && num10.intValue() == 1) {
                                                                    z7 = true;
                                                                    if (quirkSettings.shouldEnableQuirk(ImageCaptureWithFlashUnderexposureQuirk.class, z7)) {
                                                                        arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
                                                                    }
                                                                    list7 = JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES;
                                                                    String str8 = Build.DEVICE;
                                                                    str8.getClass();
                                                                    lowerCase5 = str8.toLowerCase(locale);
                                                                    lowerCase5.getClass();
                                                                    if (quirkSettings.shouldEnableQuirk(JpegHalCorruptImageQuirk.class, list7.contains(lowerCase5))) {
                                                                        arrayList.add(new JpegHalCorruptImageQuirk());
                                                                    }
                                                                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = JpegCaptureDownsizingQuirk.INSTANCE;
                                                                    set = JpegCaptureDownsizingQuirk.KNOWN_AFFECTED_FRONT_CAMERA_DEVICES;
                                                                    lowerCase6 = str7.toLowerCase(locale);
                                                                    lowerCase6.getClass();
                                                                    if (set.contains(lowerCase6)) {
                                                                        CameraCharacteristics.Key key10 = CameraCharacteristics.LENS_FACING;
                                                                        key10.getClass();
                                                                        Integer num11 = (Integer) ((Camera2CameraMetadata) cameraMetadata2).get(key10);
                                                                        if (num11 != null && num11.intValue() == 0) {
                                                                            z8 = true;
                                                                            if (quirkSettings.shouldEnableQuirk(JpegCaptureDownsizingQuirk.class, z8)) {
                                                                                arrayList.add(jpegCaptureDownsizingQuirk);
                                                                            }
                                                                            CameraMetadata.Companion.getClass();
                                                                            if (quirkSettings.shouldEnableQuirk(PreviewOrientationIncorrectQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                                                                                arrayList.add(new PreviewOrientationIncorrectQuirk());
                                                                            }
                                                                            if (quirkSettings.shouldEnableQuirk(TextureViewIsClosedQuirk.class, false)) {
                                                                                arrayList.add(new TextureViewIsClosedQuirk());
                                                                            }
                                                                            it2 = TorchFlashRequiredFor3aUpdateQuirk.AFFECTED_PIXEL_MODELS.iterator();
                                                                            while (true) {
                                                                                if (!it2.hasNext()) {
                                                                                    String str9 = (String) it2.next();
                                                                                    String str10 = Build.MODEL;
                                                                                    str10.getClass();
                                                                                    String upperCase4 = str10.toUpperCase(Locale.ROOT);
                                                                                    upperCase4.getClass();
                                                                                    if (upperCase4.equals(str9)) {
                                                                                        CameraCharacteristics.Key key11 = CameraCharacteristics.LENS_FACING;
                                                                                        key11.getClass();
                                                                                        Integer num12 = (Integer) ((Camera2CameraMetadata) cameraMetadata2).get(key11);
                                                                                        z9 = num12 != null && num12.intValue() == 0;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (quirkSettings.shouldEnableQuirk(TorchFlashRequiredFor3aUpdateQuirk.class, z9)) {
                                                                                arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk());
                                                                            }
                                                                            str = Build.MANUFACTURER;
                                                                            str.getClass();
                                                                            if (!str.equalsIgnoreCase("Motorola")) {
                                                                                String str11 = Build.BRAND;
                                                                                str11.getClass();
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    z8 = false;
                                                                    if (quirkSettings.shouldEnableQuirk(JpegCaptureDownsizingQuirk.class, z8)) {
                                                                    }
                                                                    CameraMetadata.Companion.getClass();
                                                                    if (quirkSettings.shouldEnableQuirk(PreviewOrientationIncorrectQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                                                                    }
                                                                    if (quirkSettings.shouldEnableQuirk(TextureViewIsClosedQuirk.class, false)) {
                                                                    }
                                                                    it2 = TorchFlashRequiredFor3aUpdateQuirk.AFFECTED_PIXEL_MODELS.iterator();
                                                                    while (true) {
                                                                        if (!it2.hasNext()) {
                                                                        }
                                                                    }
                                                                    if (quirkSettings.shouldEnableQuirk(TorchFlashRequiredFor3aUpdateQuirk.class, z9)) {
                                                                    }
                                                                    str = Build.MANUFACTURER;
                                                                    str.getClass();
                                                                    if (!str.equalsIgnoreCase("Motorola")) {
                                                                    }
                                                                }
                                                            }
                                                            z7 = false;
                                                            if (quirkSettings.shouldEnableQuirk(ImageCaptureWithFlashUnderexposureQuirk.class, z7)) {
                                                            }
                                                            list7 = JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES;
                                                            String str82 = Build.DEVICE;
                                                            str82.getClass();
                                                            lowerCase5 = str82.toLowerCase(locale);
                                                            lowerCase5.getClass();
                                                            if (quirkSettings.shouldEnableQuirk(JpegHalCorruptImageQuirk.class, list7.contains(lowerCase5))) {
                                                            }
                                                            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = JpegCaptureDownsizingQuirk.INSTANCE;
                                                            set = JpegCaptureDownsizingQuirk.KNOWN_AFFECTED_FRONT_CAMERA_DEVICES;
                                                            lowerCase6 = str7.toLowerCase(locale);
                                                            lowerCase6.getClass();
                                                            if (set.contains(lowerCase6)) {
                                                            }
                                                            z8 = false;
                                                            if (quirkSettings.shouldEnableQuirk(JpegCaptureDownsizingQuirk.class, z8)) {
                                                            }
                                                            CameraMetadata.Companion.getClass();
                                                            if (quirkSettings.shouldEnableQuirk(PreviewOrientationIncorrectQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                                                            }
                                                            if (quirkSettings.shouldEnableQuirk(TextureViewIsClosedQuirk.class, false)) {
                                                            }
                                                            it2 = TorchFlashRequiredFor3aUpdateQuirk.AFFECTED_PIXEL_MODELS.iterator();
                                                            while (true) {
                                                                if (!it2.hasNext()) {
                                                                }
                                                            }
                                                            if (quirkSettings.shouldEnableQuirk(TorchFlashRequiredFor3aUpdateQuirk.class, z9)) {
                                                            }
                                                            str = Build.MANUFACTURER;
                                                            str.getClass();
                                                            if (!str.equalsIgnoreCase("Motorola")) {
                                                            }
                                                        }
                                                    }
                                                    z6 = false;
                                                    if (quirkSettings.shouldEnableQuirk(ImageCaptureWashedOutImageQuirk.class, z6)) {
                                                    }
                                                    list6 = ImageCaptureWithFlashUnderexposureQuirk.BUILD_MODELS;
                                                    lowerCase4 = str7.toLowerCase(locale);
                                                    lowerCase4.getClass();
                                                    if (list6.contains(lowerCase4)) {
                                                    }
                                                    z7 = false;
                                                    if (quirkSettings.shouldEnableQuirk(ImageCaptureWithFlashUnderexposureQuirk.class, z7)) {
                                                    }
                                                    list7 = JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES;
                                                    String str822 = Build.DEVICE;
                                                    str822.getClass();
                                                    lowerCase5 = str822.toLowerCase(locale);
                                                    lowerCase5.getClass();
                                                    if (quirkSettings.shouldEnableQuirk(JpegHalCorruptImageQuirk.class, list7.contains(lowerCase5))) {
                                                    }
                                                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk22 = JpegCaptureDownsizingQuirk.INSTANCE;
                                                    set = JpegCaptureDownsizingQuirk.KNOWN_AFFECTED_FRONT_CAMERA_DEVICES;
                                                    lowerCase6 = str7.toLowerCase(locale);
                                                    lowerCase6.getClass();
                                                    if (set.contains(lowerCase6)) {
                                                    }
                                                    z8 = false;
                                                    if (quirkSettings.shouldEnableQuirk(JpegCaptureDownsizingQuirk.class, z8)) {
                                                    }
                                                    CameraMetadata.Companion.getClass();
                                                    if (quirkSettings.shouldEnableQuirk(PreviewOrientationIncorrectQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                                                    }
                                                    if (quirkSettings.shouldEnableQuirk(TextureViewIsClosedQuirk.class, false)) {
                                                    }
                                                    it2 = TorchFlashRequiredFor3aUpdateQuirk.AFFECTED_PIXEL_MODELS.iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                        }
                                                    }
                                                    if (quirkSettings.shouldEnableQuirk(TorchFlashRequiredFor3aUpdateQuirk.class, z9)) {
                                                    }
                                                    str = Build.MANUFACTURER;
                                                    str.getClass();
                                                    if (!str.equalsIgnoreCase("Motorola")) {
                                                    }
                                                }
                                            }
                                            z5 = false;
                                            list4 = ImageCaptureFlashNotFireQuirk.BUILD_MODELS;
                                            lowerCase3 = str7.toLowerCase(locale);
                                            lowerCase3.getClass();
                                            if (quirkSettings.shouldEnableQuirk(ImageCaptureFlashNotFireQuirk.class, !z5 || list4.contains(lowerCase3))) {
                                            }
                                            list5 = ImageCaptureWashedOutImageQuirk.BUILD_MODELS;
                                            upperCase2 = str7.toUpperCase(locale);
                                            upperCase2.getClass();
                                            if (list5.contains(upperCase2)) {
                                            }
                                            z6 = false;
                                            if (quirkSettings.shouldEnableQuirk(ImageCaptureWashedOutImageQuirk.class, z6)) {
                                            }
                                            list6 = ImageCaptureWithFlashUnderexposureQuirk.BUILD_MODELS;
                                            lowerCase4 = str7.toLowerCase(locale);
                                            lowerCase4.getClass();
                                            if (list6.contains(lowerCase4)) {
                                            }
                                            z7 = false;
                                            if (quirkSettings.shouldEnableQuirk(ImageCaptureWithFlashUnderexposureQuirk.class, z7)) {
                                            }
                                            list7 = JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES;
                                            String str8222 = Build.DEVICE;
                                            str8222.getClass();
                                            lowerCase5 = str8222.toLowerCase(locale);
                                            lowerCase5.getClass();
                                            if (quirkSettings.shouldEnableQuirk(JpegHalCorruptImageQuirk.class, list7.contains(lowerCase5))) {
                                            }
                                            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk222 = JpegCaptureDownsizingQuirk.INSTANCE;
                                            set = JpegCaptureDownsizingQuirk.KNOWN_AFFECTED_FRONT_CAMERA_DEVICES;
                                            lowerCase6 = str7.toLowerCase(locale);
                                            lowerCase6.getClass();
                                            if (set.contains(lowerCase6)) {
                                            }
                                            z8 = false;
                                            if (quirkSettings.shouldEnableQuirk(JpegCaptureDownsizingQuirk.class, z8)) {
                                            }
                                            CameraMetadata.Companion.getClass();
                                            if (quirkSettings.shouldEnableQuirk(PreviewOrientationIncorrectQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                                            }
                                            if (quirkSettings.shouldEnableQuirk(TextureViewIsClosedQuirk.class, false)) {
                                            }
                                            it2 = TorchFlashRequiredFor3aUpdateQuirk.AFFECTED_PIXEL_MODELS.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                }
                                            }
                                            if (quirkSettings.shouldEnableQuirk(TorchFlashRequiredFor3aUpdateQuirk.class, z9)) {
                                            }
                                            str = Build.MANUFACTURER;
                                            str.getClass();
                                            if (!str.equalsIgnoreCase("Motorola")) {
                                            }
                                        }
                                    }
                                    z4 = false;
                                    if (quirkSettings.shouldEnableQuirk(ImageCaptureFailWithAutoFlashQuirk.class, z4)) {
                                    }
                                    list3 = ImageCaptureFlashNotFireQuirk.BUILD_MODELS_FRONT_CAMERA;
                                    lowerCase2 = str7.toLowerCase(locale);
                                    lowerCase2.getClass();
                                    if (list3.contains(lowerCase2)) {
                                    }
                                    z5 = false;
                                    list4 = ImageCaptureFlashNotFireQuirk.BUILD_MODELS;
                                    lowerCase3 = str7.toLowerCase(locale);
                                    lowerCase3.getClass();
                                    if (quirkSettings.shouldEnableQuirk(ImageCaptureFlashNotFireQuirk.class, !z5 || list4.contains(lowerCase3))) {
                                    }
                                    list5 = ImageCaptureWashedOutImageQuirk.BUILD_MODELS;
                                    upperCase2 = str7.toUpperCase(locale);
                                    upperCase2.getClass();
                                    if (list5.contains(upperCase2)) {
                                    }
                                    z6 = false;
                                    if (quirkSettings.shouldEnableQuirk(ImageCaptureWashedOutImageQuirk.class, z6)) {
                                    }
                                    list6 = ImageCaptureWithFlashUnderexposureQuirk.BUILD_MODELS;
                                    lowerCase4 = str7.toLowerCase(locale);
                                    lowerCase4.getClass();
                                    if (list6.contains(lowerCase4)) {
                                    }
                                    z7 = false;
                                    if (quirkSettings.shouldEnableQuirk(ImageCaptureWithFlashUnderexposureQuirk.class, z7)) {
                                    }
                                    list7 = JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES;
                                    String str82222 = Build.DEVICE;
                                    str82222.getClass();
                                    lowerCase5 = str82222.toLowerCase(locale);
                                    lowerCase5.getClass();
                                    if (quirkSettings.shouldEnableQuirk(JpegHalCorruptImageQuirk.class, list7.contains(lowerCase5))) {
                                    }
                                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2222 = JpegCaptureDownsizingQuirk.INSTANCE;
                                    set = JpegCaptureDownsizingQuirk.KNOWN_AFFECTED_FRONT_CAMERA_DEVICES;
                                    lowerCase6 = str7.toLowerCase(locale);
                                    lowerCase6.getClass();
                                    if (set.contains(lowerCase6)) {
                                    }
                                    z8 = false;
                                    if (quirkSettings.shouldEnableQuirk(JpegCaptureDownsizingQuirk.class, z8)) {
                                    }
                                    CameraMetadata.Companion.getClass();
                                    if (quirkSettings.shouldEnableQuirk(PreviewOrientationIncorrectQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                                    }
                                    if (quirkSettings.shouldEnableQuirk(TextureViewIsClosedQuirk.class, false)) {
                                    }
                                    it2 = TorchFlashRequiredFor3aUpdateQuirk.AFFECTED_PIXEL_MODELS.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                        }
                                    }
                                    if (quirkSettings.shouldEnableQuirk(TorchFlashRequiredFor3aUpdateQuirk.class, z9)) {
                                    }
                                    str = Build.MANUFACTURER;
                                    str.getClass();
                                    if (!str.equalsIgnoreCase("Motorola")) {
                                    }
                                }
                            }
                            z2 = false;
                            if (quirkSettings.shouldEnableQuirk(CameraNoResponseWhenEnablingFlashQuirk.class, z2)) {
                            }
                            if (quirkSettings.shouldEnableQuirk(CaptureSessionStuckQuirk.class, false)) {
                            }
                            if (quirkSettings.shouldEnableQuirk(CloseCaptureSessionOnVideoQuirk.class, true)) {
                            }
                            if (quirkSettings.shouldEnableQuirk(ConfigureSurfaceToSecondarySessionFailQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                            }
                            if (quirkSettings.shouldEnableQuirk(FinalizeSessionOnCloseQuirk.class, true)) {
                            }
                            it = FlashTooSlowQuirk.AFFECTED_MODEL_PREFIXES.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            if (quirkSettings.shouldEnableQuirk(FlashTooSlowQuirk.class, z3)) {
                            }
                            list2 = ImageCaptureFailWithAutoFlashQuirk.BUILD_MODELS_FRONT_CAMERA;
                            String str72 = Build.MODEL;
                            str72.getClass();
                            Locale locale2 = Locale.ROOT;
                            lowerCase = str72.toLowerCase(locale2);
                            lowerCase.getClass();
                            if (list2.contains(lowerCase)) {
                            }
                            z4 = false;
                            if (quirkSettings.shouldEnableQuirk(ImageCaptureFailWithAutoFlashQuirk.class, z4)) {
                            }
                            list3 = ImageCaptureFlashNotFireQuirk.BUILD_MODELS_FRONT_CAMERA;
                            lowerCase2 = str72.toLowerCase(locale2);
                            lowerCase2.getClass();
                            if (list3.contains(lowerCase2)) {
                            }
                            z5 = false;
                            list4 = ImageCaptureFlashNotFireQuirk.BUILD_MODELS;
                            lowerCase3 = str72.toLowerCase(locale2);
                            lowerCase3.getClass();
                            if (quirkSettings.shouldEnableQuirk(ImageCaptureFlashNotFireQuirk.class, !z5 || list4.contains(lowerCase3))) {
                            }
                            list5 = ImageCaptureWashedOutImageQuirk.BUILD_MODELS;
                            upperCase2 = str72.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (list5.contains(upperCase2)) {
                            }
                            z6 = false;
                            if (quirkSettings.shouldEnableQuirk(ImageCaptureWashedOutImageQuirk.class, z6)) {
                            }
                            list6 = ImageCaptureWithFlashUnderexposureQuirk.BUILD_MODELS;
                            lowerCase4 = str72.toLowerCase(locale2);
                            lowerCase4.getClass();
                            if (list6.contains(lowerCase4)) {
                            }
                            z7 = false;
                            if (quirkSettings.shouldEnableQuirk(ImageCaptureWithFlashUnderexposureQuirk.class, z7)) {
                            }
                            list7 = JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES;
                            String str822222 = Build.DEVICE;
                            str822222.getClass();
                            lowerCase5 = str822222.toLowerCase(locale2);
                            lowerCase5.getClass();
                            if (quirkSettings.shouldEnableQuirk(JpegHalCorruptImageQuirk.class, list7.contains(lowerCase5))) {
                            }
                            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk22222 = JpegCaptureDownsizingQuirk.INSTANCE;
                            set = JpegCaptureDownsizingQuirk.KNOWN_AFFECTED_FRONT_CAMERA_DEVICES;
                            lowerCase6 = str72.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (set.contains(lowerCase6)) {
                            }
                            z8 = false;
                            if (quirkSettings.shouldEnableQuirk(JpegCaptureDownsizingQuirk.class, z8)) {
                            }
                            CameraMetadata.Companion.getClass();
                            if (quirkSettings.shouldEnableQuirk(PreviewOrientationIncorrectQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                            }
                            if (quirkSettings.shouldEnableQuirk(TextureViewIsClosedQuirk.class, false)) {
                            }
                            it2 = TorchFlashRequiredFor3aUpdateQuirk.AFFECTED_PIXEL_MODELS.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                }
                            }
                            if (quirkSettings.shouldEnableQuirk(TorchFlashRequiredFor3aUpdateQuirk.class, z9)) {
                            }
                            str = Build.MANUFACTURER;
                            str.getClass();
                            if (!str.equalsIgnoreCase("Motorola")) {
                            }
                        }
                    }
                    z = false;
                    if (quirkSettings.shouldEnableQuirk(AfRegionFlipHorizontallyQuirk.class, z)) {
                    }
                    CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2);
                    if (quirkSettings.shouldEnableQuirk(AspectRatioLegacyApi21Quirk.class, false)) {
                    }
                    if (quirkSettings.shouldEnableQuirk(CamcorderProfileResolutionQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                    }
                    list = CameraNoResponseWhenEnablingFlashQuirk.AFFECTED_MODELS;
                    String str42 = Build.MODEL;
                    str42.getClass();
                    upperCase = str42.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    if (list.contains(upperCase)) {
                    }
                    z2 = false;
                    if (quirkSettings.shouldEnableQuirk(CameraNoResponseWhenEnablingFlashQuirk.class, z2)) {
                    }
                    if (quirkSettings.shouldEnableQuirk(CaptureSessionStuckQuirk.class, false)) {
                    }
                    if (quirkSettings.shouldEnableQuirk(CloseCaptureSessionOnVideoQuirk.class, true)) {
                    }
                    if (quirkSettings.shouldEnableQuirk(ConfigureSurfaceToSecondarySessionFailQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                    }
                    if (quirkSettings.shouldEnableQuirk(FinalizeSessionOnCloseQuirk.class, true)) {
                    }
                    it = FlashTooSlowQuirk.AFFECTED_MODEL_PREFIXES.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    if (quirkSettings.shouldEnableQuirk(FlashTooSlowQuirk.class, z3)) {
                    }
                    list2 = ImageCaptureFailWithAutoFlashQuirk.BUILD_MODELS_FRONT_CAMERA;
                    String str722 = Build.MODEL;
                    str722.getClass();
                    Locale locale22 = Locale.ROOT;
                    lowerCase = str722.toLowerCase(locale22);
                    lowerCase.getClass();
                    if (list2.contains(lowerCase)) {
                    }
                    z4 = false;
                    if (quirkSettings.shouldEnableQuirk(ImageCaptureFailWithAutoFlashQuirk.class, z4)) {
                    }
                    list3 = ImageCaptureFlashNotFireQuirk.BUILD_MODELS_FRONT_CAMERA;
                    lowerCase2 = str722.toLowerCase(locale22);
                    lowerCase2.getClass();
                    if (list3.contains(lowerCase2)) {
                    }
                    z5 = false;
                    list4 = ImageCaptureFlashNotFireQuirk.BUILD_MODELS;
                    lowerCase3 = str722.toLowerCase(locale22);
                    lowerCase3.getClass();
                    if (quirkSettings.shouldEnableQuirk(ImageCaptureFlashNotFireQuirk.class, !z5 || list4.contains(lowerCase3))) {
                    }
                    list5 = ImageCaptureWashedOutImageQuirk.BUILD_MODELS;
                    upperCase2 = str722.toUpperCase(locale22);
                    upperCase2.getClass();
                    if (list5.contains(upperCase2)) {
                    }
                    z6 = false;
                    if (quirkSettings.shouldEnableQuirk(ImageCaptureWashedOutImageQuirk.class, z6)) {
                    }
                    list6 = ImageCaptureWithFlashUnderexposureQuirk.BUILD_MODELS;
                    lowerCase4 = str722.toLowerCase(locale22);
                    lowerCase4.getClass();
                    if (list6.contains(lowerCase4)) {
                    }
                    z7 = false;
                    if (quirkSettings.shouldEnableQuirk(ImageCaptureWithFlashUnderexposureQuirk.class, z7)) {
                    }
                    list7 = JpegHalCorruptImageQuirk.KNOWN_AFFECTED_DEVICES;
                    String str8222222 = Build.DEVICE;
                    str8222222.getClass();
                    lowerCase5 = str8222222.toLowerCase(locale22);
                    lowerCase5.getClass();
                    if (quirkSettings.shouldEnableQuirk(JpegHalCorruptImageQuirk.class, list7.contains(lowerCase5))) {
                    }
                    JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk222222 = JpegCaptureDownsizingQuirk.INSTANCE;
                    set = JpegCaptureDownsizingQuirk.KNOWN_AFFECTED_FRONT_CAMERA_DEVICES;
                    lowerCase6 = str722.toLowerCase(locale22);
                    lowerCase6.getClass();
                    if (set.contains(lowerCase6)) {
                    }
                    z8 = false;
                    if (quirkSettings.shouldEnableQuirk(JpegCaptureDownsizingQuirk.class, z8)) {
                    }
                    CameraMetadata.Companion.getClass();
                    if (quirkSettings.shouldEnableQuirk(PreviewOrientationIncorrectQuirk.class, CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2))) {
                    }
                    if (quirkSettings.shouldEnableQuirk(TextureViewIsClosedQuirk.class, false)) {
                    }
                    it2 = TorchFlashRequiredFor3aUpdateQuirk.AFFECTED_PIXEL_MODELS.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                        }
                    }
                    if (quirkSettings.shouldEnableQuirk(TorchFlashRequiredFor3aUpdateQuirk.class, z9)) {
                    }
                    str = Build.MANUFACTURER;
                    str.getClass();
                    if (!str.equalsIgnoreCase("Motorola")) {
                    }
                } catch (InterruptedException | ExecutionException e) {
                    throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
                }
                break;
            case 6:
                return (CapturePipelineImpl) ((CapturePipelineTorchCorrection) obj2).capturePipelineImplProvider.get();
            case 7:
                return Boolean.valueOf(((CameraQuirks) ((MetadataRepo) obj2).mMetadataList).getQuirks().contains(UltraWideFlashCaptureUnderexposureQuirk.class));
            case 8:
                return (UseCaseCameraState) ((CapturePipelineImpl) obj2).useCaseCameraStateProvider.get();
            case 9:
                return (CameraDeviceSetupCompatFactory) ((Camera2DeviceCache) obj2).cameraDeviceSetupCompatFactoryProvider.get();
            case 10:
                int ordinal = ((GroupableFeature) obj2).getFeatureTypeInternal().ordinal();
                if (ordinal == 0) {
                    i2 = 0;
                } else if (ordinal == 1) {
                    i2 = 1;
                } else if (ordinal == 2) {
                    i2 = 2;
                } else if (ordinal != 3) {
                    i2 = 4;
                    if (ordinal != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Integer.valueOf(i2);
            case 11:
                return ((DefaultEncoderProfilesProvider) obj2).cameraInfo.getSupportedResolutions(34);
            case 12:
                ((RefCounted) obj2).release();
                return Unit.INSTANCE;
            case 13:
                return Float.valueOf(AnimatableKt.getDurationScale(((CoroutineScope) obj2).getCoroutineContext()));
            case 14:
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj2;
                Transition transition = seekableTransitionState.transition;
                seekableTransitionState.totalDurationNanos = transition != null ? ((Number) transition.totalDurationNanos$delegate.getValue()).longValue() : 0L;
                return Unit.INSTANCE;
            case 15:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((MagnifierNode) obj2).layoutCoordinates$delegate.getValue();
                return new Offset(layoutCoordinates != null ? layoutCoordinates.mo841localToRootMKHz9U(0L) : 9205357640488583168L);
            case 16:
                LazyLayoutItemAnimator.DisplayingDisappearingItemsNode displayingDisappearingItemsNode = ((LazyLayoutItemAnimator) obj2).displayingNode;
                if (displayingDisappearingItemsNode != null) {
                    DepthSortedSetKt.invalidateDraw(displayingDisappearingItemsNode);
                }
                return Unit.INSTANCE;
            case 17:
                ((ToggleableNode) obj2).onValueChange.invoke(Boolean.valueOf(!r11.value));
                return Unit.INSTANCE;
            case 18:
                return Long.valueOf(((SelectionRegistrarImpl) ((SelectionRegistrar) obj2)).nextSelectableId());
            case 19:
                return (AnnotatedString) obj2;
            case 20:
                return ((LegacyTextFieldState) obj2).getLayoutResult();
            case 21:
                return new TextFieldScrollerPosition((Orientation) obj2, RecyclerView.DECELERATION_RATE);
            case 22:
                TypefaceResult typefaceResult = ((HeightInLinesNode) obj2).fontResolutionState;
                if (typefaceResult == null) {
                    throw Recorder$$ExternalSyntheticOutline2.m("Font resolution state is not set.");
                }
                typefaceResult.getValue();
                return Unit.INSTANCE;
            case 23:
                return new IntOffset(((IntRect) obj2).m1052getTopLeftnOccac());
            case 24:
                return ((TextContextMenuDataProvider) obj2).data();
            case 25:
                ((TextContextMenuSession) obj2).close();
                return Unit.INSTANCE;
            case 26:
                PendingIntent actionIntent = ((RemoteAction) obj2).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    PlayerView.Api34.sendIntentAllowBackgroundActivityStart(actionIntent);
                } else {
                    actionIntent.send();
                }
                return Unit.INSTANCE;
            case 27:
                return ((RequestFactory) obj2).calculateCursorAnchorInfo();
            case 28:
                Object systemService = ((View) ((Recorder.AnonymousClass1) obj2).val$videoEncoderSession).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            default:
                return new BaseInputConnection(((LegacyTextInputMethodRequest) obj2).view, false);
        }
    }

    public /* synthetic */ Threads$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
