package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.pulse.metrics.o;
import defpackage.btm;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public abstract class mi {
    public static Object A(int i) {
        switch (ouj.D(i)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets B(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void C(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void D(Activity activity, btm.a aVar) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void E(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }

    public static void F(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void G(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public static void H(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            wpa.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                vpa.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            vpa.a(outline, path);
        }
    }

    public static void I(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public static void J(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void K(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            jsg j = jsg.j();
            String str = SystemForegroundService.e;
            if (j.b <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            jsg j2 = jsg.j();
            String str2 = SystemForegroundService.e;
            if (j2.b <= 5) {
                Log.w(str2, "Unable to start foreground service", e2);
            }
        }
    }

    public static void L(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    public static final BlendMode M(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        if (i == 0) {
            blendMode28 = BlendMode.CLEAR;
            return blendMode28;
        }
        if (i == 1) {
            blendMode27 = BlendMode.SRC;
            return blendMode27;
        }
        if (i == 2) {
            blendMode26 = BlendMode.DST;
            return blendMode26;
        }
        if (i == 3) {
            blendMode25 = BlendMode.SRC_OVER;
            return blendMode25;
        }
        if (i == 4) {
            blendMode24 = BlendMode.DST_OVER;
            return blendMode24;
        }
        if (i == 5) {
            blendMode23 = BlendMode.SRC_IN;
            return blendMode23;
        }
        if (i == 6) {
            blendMode22 = BlendMode.DST_IN;
            return blendMode22;
        }
        if (i == 7) {
            blendMode21 = BlendMode.SRC_OUT;
            return blendMode21;
        }
        if (i == 8) {
            blendMode20 = BlendMode.DST_OUT;
            return blendMode20;
        }
        if (i == 9) {
            blendMode19 = BlendMode.SRC_ATOP;
            return blendMode19;
        }
        if (i == 10) {
            blendMode18 = BlendMode.DST_ATOP;
            return blendMode18;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final BlendMode N(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        if (i == 0) {
            blendMode28 = BlendMode.CLEAR;
            return blendMode28;
        }
        if (i == 27) {
            blendMode27 = BlendMode.COLOR;
            return blendMode27;
        }
        if (i == 19) {
            blendMode26 = BlendMode.COLOR_BURN;
            return blendMode26;
        }
        if (i == 18) {
            blendMode25 = BlendMode.COLOR_DODGE;
            return blendMode25;
        }
        if (i == 16) {
            blendMode24 = BlendMode.DARKEN;
            return blendMode24;
        }
        if (i == 22) {
            blendMode23 = BlendMode.DIFFERENCE;
            return blendMode23;
        }
        if (i == 2) {
            blendMode22 = BlendMode.DST;
            return blendMode22;
        }
        if (i == 10) {
            blendMode21 = BlendMode.DST_ATOP;
            return blendMode21;
        }
        if (i == 6) {
            blendMode20 = BlendMode.DST_IN;
            return blendMode20;
        }
        if (i == 8) {
            blendMode19 = BlendMode.DST_OUT;
            return blendMode19;
        }
        if (i == 4) {
            blendMode18 = BlendMode.DST_OVER;
            return blendMode18;
        }
        if (i == 23) {
            blendMode17 = BlendMode.EXCLUSION;
            return blendMode17;
        }
        if (i == 20) {
            blendMode16 = BlendMode.HARD_LIGHT;
            return blendMode16;
        }
        if (i == 25) {
            blendMode15 = BlendMode.HUE;
            return blendMode15;
        }
        if (i == 17) {
            blendMode14 = BlendMode.LIGHTEN;
            return blendMode14;
        }
        if (i == 28) {
            blendMode13 = BlendMode.LUMINOSITY;
            return blendMode13;
        }
        if (i == 13) {
            blendMode12 = BlendMode.MODULATE;
            return blendMode12;
        }
        if (i == 24) {
            blendMode11 = BlendMode.MULTIPLY;
            return blendMode11;
        }
        if (i == 15) {
            blendMode10 = BlendMode.OVERLAY;
            return blendMode10;
        }
        if (i == 26) {
            blendMode9 = BlendMode.SATURATION;
            return blendMode9;
        }
        if (i == 14) {
            blendMode8 = BlendMode.SCREEN;
            return blendMode8;
        }
        if (i == 21) {
            blendMode7 = BlendMode.SOFT_LIGHT;
            return blendMode7;
        }
        if (i == 1) {
            blendMode6 = BlendMode.SRC;
            return blendMode6;
        }
        if (i == 9) {
            blendMode5 = BlendMode.SRC_ATOP;
            return blendMode5;
        }
        if (i == 5) {
            blendMode4 = BlendMode.SRC_IN;
            return blendMode4;
        }
        if (i == 7) {
            blendMode3 = BlendMode.SRC_OUT;
            return blendMode3;
        }
        if (i == 3) {
            blendMode2 = BlendMode.SRC_OVER;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_IN;
        return blendMode;
    }

    public static final PorterDuff.Mode O(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static long P(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        float rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }

    public static void Q(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void R(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (b6e.f(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && cb0.a == null) {
                if (dvt.a < 35) {
                    int l = l(false);
                    int l2 = l(true);
                    if (l != 0) {
                        if (l2 == 0) {
                        }
                    }
                    cb0.a = Boolean.valueOf(z);
                    if (!z) {
                    }
                }
                z = false;
                cb0.a = Boolean.valueOf(z);
                if (!z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static void b(Canvas canvas) {
        canvas.disableZ();
    }

    public static void c(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void d(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void e(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void f(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void g(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void h(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void i(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void j(Canvas canvas) {
        canvas.enableZ();
    }

    public static void k(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static int l(boolean z) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            bsc bscVar = new bsc();
            bscVar.m = l5i.p("video/avc");
            dsc dscVar = new dsc(bscVar);
            String str = dscVar.n;
            if (str != null) {
                List e = zjh.e(str, z, false);
                String b = zjh.b(dscVar);
                Iterable e2 = b == null ? qsn.e : zjh.e(b, z, false);
                tde u = yde.u();
                u.c(e);
                u.c(e2);
                qsn f = u.f();
                for (int i = 0; i < f.d; i++) {
                    if (((mih) f.get(i)).d != null && ((mih) f.get(i)).d.getVideoCapabilities() != null && (supportedPerformancePoints = ((mih) f.get(i)).d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (b6e.f(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (wjh unused) {
        }
        return 0;
    }

    public static final int m(Context context) {
        ActivityManager.RecentTaskInfo taskInfo;
        int i;
        ActivityManager b = l1b.b(context);
        if (b == null) {
            return 0;
        }
        List<ActivityManager.AppTask> appTasks = b.getAppTasks();
        appTasks.getClass();
        ActivityManager.AppTask appTask = (ActivityManager.AppTask) CollectionsKt.firstOrNull(appTasks);
        if (appTask == null || (taskInfo = appTask.getTaskInfo()) == null) {
            return 0;
        }
        i = taskInfo.numActivities;
        return i;
    }

    public static ColorStateList n(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static ContentCaptureSession o(View view) {
        return view.getContentCaptureSession();
    }

    public static qsn p(dv1 dv1Var) {
        tde u = yde.u();
        xkt it = yv1.e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (dvt.a >= dvt.s(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(ScreenMirroringConfig.Audio.SAMPLING_RATE).build(), (AudioAttributes) dv1Var.b().a)) {
                u.a(num);
            }
        }
        u.a(2);
        return u.f();
    }

    public static int q(int i, int i2, dv1 dv1Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int u = dvt.u(i3);
            if (u != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(u).build(), (AudioAttributes) dv1Var.b().a)) {
                return i3;
            }
        }
        return 0;
    }

    public static ix1 r(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return ix1.d;
        }
        hx1 hx1Var = new hx1();
        hx1Var.a = true;
        hx1Var.c = z;
        return hx1Var.a();
    }

    public static int s(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static final void t(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static float u(View view) {
        return view.getTransitionAlpha();
    }

    public static final long v(View view) {
        return view.getUniqueDrawingId();
    }

    public static final long w(AndroidComposeView androidComposeView) {
        return androidComposeView.getUniqueDrawingId();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void x(Context context) {
        boolean z;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (tyf.x(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                ywf.w(null);
                return;
            }
            onx onxVar = new onx();
            try {
                if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                    SharedPreferences.Editor edit = tyf.x(context).edit();
                    edit.putBoolean("proxy_notification_initialized", true);
                    edit.apply();
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (z) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } else {
                    Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                }
                onxVar.s(null);
                return;
            } catch (Throwable th) {
                onxVar.s(null);
                throw th;
            }
        }
        z = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    public static boolean y() {
        return Trace.isEnabled();
    }

    public static boolean z(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return true;
                }
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }
}
