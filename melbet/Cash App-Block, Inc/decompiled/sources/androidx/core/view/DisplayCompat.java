package androidx.core.view;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.location.Location;
import android.media.AudioDescriptor;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.Surface;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontVariation$Settings;
import androidx.compose.ui.unit.DensityWithConverter;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.math.MathUtils;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.Id3Peeker$$ExternalSyntheticBUOutline0;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.background.systemjob.SystemJobService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.protobuf.GeneratedMessageLite;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.GLThread;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.function.Consumer;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.internal.d4$$ExternalSyntheticLambda0;
import net.idrnd.face.iad.capture.internal.s0;
import net.idrnd.face.iad.capture.internal.t0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import timber.log.Timber;

/* loaded from: classes3.dex */
public abstract class DisplayCompat {
    public static t0 a() {
        String str;
        String str2;
        String str3;
        s0 d = t0.d();
        String str4 = Build.MANUFACTURER;
        d.j();
        String str5 = Build.MODEL;
        d.k();
        String str6 = Build.ID;
        d.i();
        String str7 = Build.DEVICE;
        d.d();
        String str8 = Build.BRAND;
        d.c$1();
        String str9 = Build.BOARD;
        d.a$5();
        String str10 = Build.BOOTLOADER;
        d.b$3();
        String str11 = Build.DISPLAY;
        d.e();
        String str12 = Build.FINGERPRINT;
        d.f();
        String str13 = Build.HARDWARE;
        d.g();
        String str14 = Build.HOST;
        d.h();
        String str15 = Build.PRODUCT;
        d.m();
        String str16 = Build.TAGS;
        d.q();
        long j = Build.TIME;
        d.a$6();
        String str17 = Build.TYPE;
        d.r();
        String str18 = Build.USER;
        d.s();
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        strArr.getClass();
        d.a$2(ArraysKt___ArraysKt.toList(strArr));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        strArr2.getClass();
        d.b(ArraysKt___ArraysKt.toList(strArr2));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        strArr3.getClass();
        d.c(ArraysKt___ArraysKt.toList(strArr3));
        if (Build.VERSION.SDK_INT >= 31) {
            d.l(Build.ODM_SKU);
            str = Build.SKU;
            d.n(str);
            str2 = Build.SOC_MANUFACTURER;
            d.o(str2);
            str3 = Build.SOC_MODEL;
            d.p(str3);
        }
        GeneratedMessageLite build = d.build();
        build.getClass();
        return (t0) build;
    }

    public static EGLSurface createAndConfigure(Engine engine, Object obj, float f) {
        EGLContext eGLContext;
        engine.getClass();
        obj.getClass();
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(engine.eglDisplay, engine.eglConfig, obj, new int[]{12344}, 0);
        if (Intrinsics.areEqual(eglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("EglSurfaceSetup");
            forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("eglCreateWindowSurface failed (eglError=0x", Integer.toHexString(EGL14.eglGetError()), ")"), new Object[0]);
            return null;
        }
        if (obj instanceof Surface) {
            Surface surface = (Surface) obj;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                try {
                    surface.setFrameRate(f, 1, 1);
                } catch (Exception e) {
                    Timber.Forest forest2 = Timber.Forest;
                    forest2.tag("EglSurfaceSetup");
                    forest2.w("Failed to set frame rate", new Object[0], e);
                }
            } else if (i >= 30) {
                try {
                    surface.setFrameRate(f, 1);
                } catch (Exception e2) {
                    Timber.Forest forest3 = Timber.Forest;
                    forest3.tag("EglSurfaceSetup");
                    forest3.w("Failed to set frame rate", new Object[0], e2);
                }
            }
        }
        EGLDisplay eGLDisplay = engine.eglDisplay;
        GLThread gLThread = engine.glThread;
        if (gLThread == null || (eGLContext = gLThread.eglContext) == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
            eGLContext.getClass();
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eGLContext)) {
            EGL14.eglSwapInterval(engine.eglDisplay, 0);
            engine.restoreSurfacelessCurrent();
        } else {
            Timber.Forest forest4 = Timber.Forest;
            forest4.tag("EglSurfaceSetup");
            forest4.w(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("eglMakeCurrent failed (eglError=0x", Integer.toHexString(EGL14.eglGetError()), ")"), new Object[0]);
        }
        return eglCreateWindowSurface;
    }

    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public static RenderEffect m1103createBlurEffect8A3gB4(float f, float f2, int i) {
        return (f == RecyclerView.DECELERATION_RATE && f2 == RecyclerView.DECELERATION_RATE) ? RenderEffect.createOffsetEffect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) : RenderEffect.createBlurEffect(f, f2, AndroidTileMode_androidKt.m668toAndroidTileMode0vamqd0(i));
    }

    public static void doTranslation(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        SemanticsNode semanticsNode;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(keyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.getCurrentSemanticsNodes$ui().get((int) keyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.semanticsNode) != null) {
                Object obj = semanticsNode.unmergedConfig.props.get(SemanticsActions.SetTextSubstitution);
                if (obj == null) {
                    obj = null;
                }
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                if (accessibilityAction != null && (function1 = (Function1) accessibilityAction.action) != null) {
                }
            }
        }
    }

    public static void drawGlyphs(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void drawPatch(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy from(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new AutoValue_EncoderProfilesProxy_AudioProfileProxy(audioProfile.getMediaType(), audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new AutoValue_EncoderProfilesProxy_VideoProfileProxy(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.create(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static EncoderProfiles getAll(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    public static ImmutableList getAllLpcmChannelMasksFromPcmSads(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            return RegularImmutableList.EMPTY;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new d4$$ExternalSyntheticLambda0(1)).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor m = Id3Peeker$$ExternalSyntheticBUOutline0.m(it.next());
            if (m.getStandard() == 1) {
                byte[] descriptor = m.getDescriptor();
                if (descriptor.length != 3) {
                    Log.w("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(Util.getAudioTrackChannelConfig(i)));
                    }
                }
            }
        }
        return ImmutableList.copyOf((Collection) treeSet);
    }

    public static Path getCutoutPath(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static Shader.TileMode getFrameworkTileModeDecal() {
        return Shader.TileMode.DECAL;
    }

    public static RoundedCornerCompat getRoundedCorner(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new RoundedCornerCompat(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int getStopReason(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.TAG;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static boolean isDeviceFrom(String str) {
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        String str3 = Build.BRAND;
        str3.getClass();
        return str3.equalsIgnoreCase(str);
    }

    public static boolean isMock(Location location) {
        return location.isMock();
    }

    public static boolean isUniSocChipsetDevice() {
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str = Build.HARDWARE;
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (StringsKt__StringsJVMKt.startsWith(lowerCase, "ums", false)) {
            return true;
        }
        if (isDeviceFrom("Itel")) {
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            if (StringsKt__StringsJVMKt.startsWith(lowerCase2, "sp", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = r2.fontWeightAdjustment;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface maybeCopyWithFontWeightAdjustment(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || i == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        int weight = typeface.getWeight();
        i2 = configuration.fontWeightAdjustment;
        return Typeface.create(typeface, MathUtils.clamp(weight + i2, 1, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO), typeface.isItalic());
    }

    public static void onCreateVirtualViewTranslationRequests(AndroidContentCaptureManager androidContentCaptureManager, long[] jArr, Consumer consumer) {
        SemanticsNode semanticsNode;
        for (long j : jArr) {
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.getCurrentSemanticsNodes$ui().get((int) j);
            if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.semanticsNode) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidContentCaptureManager.view.getAutofillId(), semanticsNode.id);
                Object obj = semanticsNode.unmergedConfig.props.get(SemanticsProperties.Text);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(ListUtilsKt.fastJoinToString$default(62, "\n", list, null))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static void onVirtualViewTranslationResponses(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            doTranslation(androidContentCaptureManager, longSparseArray);
        } else {
            androidContentCaptureManager.view.post(new Recorder$$ExternalSyntheticLambda15(26, androidContentCaptureManager, longSparseArray));
        }
    }

    public static void setAuthenticationRequired(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void setContext(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }

    public static void setLogSessionIdToMediaCodecFormat(e0 e0Var, PlayerId playerId) {
        LogSessionId logSessionId;
        LogSessionId logSessionId2 = playerId.getLogSessionId();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionId2.equals(logSessionId)) {
            return;
        }
        ((MediaFormat) e0Var.b).setString("log-session-id", logSessionId2.getStringId());
    }

    public static void setRenderEffect(RenderNode renderNode, androidx.compose.ui.graphics.RenderEffect renderEffect) {
        RenderEffect renderEffect2;
        if (renderEffect != null) {
            renderEffect2 = renderEffect.internalRenderEffect;
            if (renderEffect2 == null) {
                renderEffect2 = renderEffect.createRenderEffect();
                renderEffect.internalRenderEffect = renderEffect2;
            }
        } else {
            renderEffect2 = null;
        }
        renderNode.setRenderEffect(renderEffect2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String toAndroidString(FontVariation$Settings fontVariation$Settings, Context context) {
        int i;
        int i2;
        List list = fontVariation$Settings.settings;
        DensityWithConverter Density = Strings.Density(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = context.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 != Integer.MAX_VALUE) {
                i = context.getResources().getConfiguration().fontWeightAdjustment;
                if (i != 0) {
                    return ListUtilsKt.fastJoinToString$default(31, null, list, new Navigation$$ExternalSyntheticLambda1(Density));
                }
                if (list.size() > 0) {
                    list.get(0).getClass();
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                float coerceIn = RangesKt___RangesKt.coerceIn(i + 400.0f, 1.0f, 1000.0f);
                return (list.isEmpty() ? "" : "".concat(",")) + "'wght' " + coerceIn;
            }
        }
        i = 0;
        if (i != 0) {
        }
    }

    public static void drawPatch(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
