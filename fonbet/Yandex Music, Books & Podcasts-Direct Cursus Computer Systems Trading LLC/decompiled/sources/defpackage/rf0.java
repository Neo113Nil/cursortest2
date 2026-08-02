package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class rf0 {
    public static void A(rdk rdkVar, ndl ndlVar) {
        LogSessionId logSessionId;
        LogSessionId a = ndlVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a.equals(logSessionId)) {
            return;
        }
        ((MediaFormat) rdkVar.c).setString("log-session-id", a.getStringId());
    }

    public static void B(nsh nshVar, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((dsh) nshVar.b).a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            vq1.L("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }

    public static void C(xeu xeuVar, qwn qwnVar) {
        xeuVar.setRenderEffect(qwnVar != null ? qwnVar.a() : null);
    }

    public static void D(RenderNode renderNode, qwn qwnVar) {
        renderNode.setRenderEffect(qwnVar != null ? qwnVar.a() : null);
    }

    public static void E(View view, qwn qwnVar) {
        view.setRenderEffect(qwnVar != null ? qwnVar.a() : null);
    }

    public static void F(RenderNode renderNode, qwn qwnVar) {
        renderNode.setRenderEffect(qwnVar != null ? qwnVar.a() : null);
    }

    public static int[] G(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] transportTypes = networkRequest.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }

    public static Unit a(JobInfo.Builder builder) {
        builder.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            builder.setExpedited(true);
        } else if (i >= 28) {
            builder.setImportantWhileForeground(true);
            builder.setOverrideDeadline(0L);
        } else {
            builder.setOverrideDeadline(0L);
        }
        return Unit.a;
    }

    public static Unit b(Vibrator vibrator) {
        if (vibrator != null && vibrator.hasVibrator() && Build.VERSION.SDK_INT >= 29) {
            vibrator.vibrate(VibrationEffect.createPredefined(2));
        }
        return Unit.a;
    }

    public static int[] c(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] capabilities = networkRequest.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    public static ForegroundServiceStartNotAllowedException d(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static EdgeEffect e(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static RenderEffect f(float f, float f2, int i) {
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, saf.l0(i));
    }

    public static void g(Context context, j2j j2jVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            h2j h2jVar = new h2j(j2jVar);
            telephonyManager.registerTelephonyCallback((Executor) j2jVar.c, h2jVar);
            telephonyManager.unregisterTelephonyCallback(h2jVar);
        } catch (RuntimeException unused) {
            j2jVar.e(5);
        }
    }

    public static void h(tf0 tf0Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        sfp sfpVar;
        qfp qfpVar;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(keyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (sfpVar = (sfp) tf0Var.e().b((int) keyAt)) != null && (qfpVar = sfpVar.a) != null) {
                Object g = qfpVar.d.a.g(hfp.k);
                if (g == null) {
                    g = null;
                }
                sa saVar = (sa) g;
                if (saVar != null && (function1 = (Function1) saVar.b) != null) {
                }
            }
        }
    }

    public static void i(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void j(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void k(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static float l(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static Shader.TileMode m() {
        return Shader.TileMode.DECAL;
    }

    public static ix1 n(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return ix1.d;
        }
        hx1 hx1Var = new hx1();
        boolean z2 = dvt.a > 32 && playbackOffloadSupport == 2;
        hx1Var.a = true;
        hx1Var.b = z2;
        hx1Var.c = z;
        return hx1Var.a();
    }

    public static int o(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.e;
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

    public static boolean p(IllegalStateException illegalStateException) {
        return b6e.r(illegalStateException);
    }

    public static boolean q(IllegalStateException illegalStateException) {
        return b6e.r(illegalStateException);
    }

    public static boolean r(PendingIntent pendingIntent) {
        return pendingIntent.isActivity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = r2.fontWeightAdjustment;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface s(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || i == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        int weight = typeface.getWeight();
        i2 = configuration.fontWeightAdjustment;
        return Typeface.create(typeface, hyf.y(weight + i2, 1, 1000), typeface.isItalic());
    }

    public static void t(tf0 tf0Var, long[] jArr, Consumer consumer) {
        qfp qfpVar;
        for (long j : jArr) {
            sfp sfpVar = (sfp) tf0Var.e().b((int) j);
            if (sfpVar != null && (qfpVar = sfpVar.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(tf0Var.a.getAutofillId(), qfpVar.g);
                Object g = qfpVar.d.a.g(ufp.z);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new mn0(lag.b(list, StringUtil.LF, null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float u(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static final Function0 v(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        boolean f = oq5Var.f(context);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            K = new jvu(5, Build.VERSION.SDK_INT >= 31 ? ((VibratorManager) context.getSystemService(VibratorManager.class)).getDefaultVibrator() : (Vibrator) context.getSystemService(Vibrator.class));
            oq5Var.k0(K);
        }
        return (Function0) K;
    }

    public static boolean w(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    public static void x(AudioTrack audioTrack, ndl ndlVar) {
        LogSessionId logSessionId;
        LogSessionId a = ndlVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a.equals(logSessionId)) {
            return;
        }
        audioTrack.setLogSessionId(a);
    }

    public static void y(MediaDrm mediaDrm, byte[] bArr, ndl ndlVar) {
        LogSessionId logSessionId;
        LogSessionId a = ndlVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a.equals(logSessionId)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(a);
    }

    public static void z(rdk rdkVar, ndl ndlVar) {
        LogSessionId logSessionId;
        LogSessionId a = ndlVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a.equals(logSessionId)) {
            return;
        }
        ((MediaFormat) rdkVar.c).setString("log-session-id", a.getStringId());
    }
}
