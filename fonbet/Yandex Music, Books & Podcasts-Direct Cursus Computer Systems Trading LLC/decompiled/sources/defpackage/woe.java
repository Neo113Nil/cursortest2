package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Iterator;
import java.util.function.DoubleUnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class woe {
    public static Context a;
    public static Boolean b;

    public static final void a(TextView textView, szb szbVar, szb szbVar2, szb szbVar3, xzb xzbVar) {
        Integer num;
        String str = null;
        e09 e09Var = szbVar != null ? (e09) szbVar.a(xzbVar) : null;
        if (szbVar2 != null) {
            long longValue = ((Number) szbVar2.a(xzbVar)).longValue();
            long j = longValue >> 31;
            num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        } else {
            num = null;
        }
        JSONObject jSONObject = szbVar3 != null ? (JSONObject) szbVar3.a(xzbVar) : null;
        boolean z = (e09Var == null && num == null) ? false : true;
        int I = tt0.I(e09Var, num);
        if (jSONObject != null && jSONObject.length() != 0) {
            if (z && !jSONObject.has("wght")) {
                jSONObject.put("wght", I);
            }
            n8g b2 = t75.b();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Number) {
                    b2.add("'" + next + "' " + ((Number) obj));
                }
            }
            str = CollectionsKt.X(t75.a(b2), ", ", null, null, null, 62);
        } else if (z) {
            str = "'wght' " + Integer.valueOf(I);
        }
        textView.setFontVariationSettings(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(TextView textView, szb szbVar, szb szbVar2, xzb xzbVar) {
        ((agc) textView).setFixedLineHeight(szbVar != null ? bg3.m0(Long.valueOf(((Number) szbVar.a(xzbVar)).longValue()), textView.getResources().getDisplayMetrics(), (jk9) szbVar2.a(xzbVar)) : -1);
    }

    public static final void c(TextView textView, szb szbVar, szb szbVar2, szb szbVar3, ly9 ly9Var, xzb xzbVar) {
        Integer num = null;
        ky9 a2 = ly9Var.a(szbVar != null ? (String) szbVar.a(xzbVar) : null);
        e09 e09Var = szbVar2 != null ? (e09) szbVar2.a(xzbVar) : null;
        if (szbVar3 != null) {
            long longValue = ((Number) szbVar3.a(xzbVar)).longValue();
            long j = longValue >> 31;
            num = Integer.valueOf((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
        Typeface e = a2.e(tt0.I(e09Var, num));
        if (e == null) {
            e = Typeface.DEFAULT;
        }
        textView.setTypeface(e);
    }

    public static final boolean d(Context context) {
        ApplicationInfo applicationInfo;
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage != null && (applicationInfo = currentWebViewPackage.applicationInfo) != null) {
                    z = applicationInfo.enabled;
                }
            } else {
                ApplicationInfo applicationInfo2 = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).applicationInfo;
                if (applicationInfo2 != null && applicationInfo2.enabled) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        return z;
    }

    public static boolean e(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean f(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean g(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static boolean h(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean i(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static final Bitmap j(int i, int i2, int i3, l95 l95Var) {
        Bitmap.Config config;
        ColorSpace colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace p;
        ColorSpace colorSpace2;
        Bitmap.Config p2 = fx1.p(i3);
        if (Intrinsics.d(l95Var, n95.e)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (Intrinsics.d(l95Var, n95.q)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (Intrinsics.d(l95Var, n95.r)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (Intrinsics.d(l95Var, n95.o)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (Intrinsics.d(l95Var, n95.j)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (Intrinsics.d(l95Var, n95.i)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (Intrinsics.d(l95Var, n95.t)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (Intrinsics.d(l95Var, n95.s)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (Intrinsics.d(l95Var, n95.k)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (Intrinsics.d(l95Var, n95.l)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (Intrinsics.d(l95Var, n95.g)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (Intrinsics.d(l95Var, n95.h)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (Intrinsics.d(l95Var, n95.f)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (Intrinsics.d(l95Var, n95.m)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (Intrinsics.d(l95Var, n95.p)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!Intrinsics.d(l95Var, n95.n)) {
                if (Build.VERSION.SDK_INT >= 34 && (p = sb.p(l95Var)) != null) {
                    colorSpace = p;
                    config = p2;
                    return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace);
                }
                if (l95Var instanceof rdo) {
                    String str = l95Var.a;
                    rdo rdoVar = (rdo) l95Var;
                    float[] a2 = rdoVar.d.a();
                    u6t u6tVar = rdoVar.g;
                    if (u6tVar != null) {
                        config = p2;
                        transferParameters = new ColorSpace.Rgb.TransferParameters(u6tVar.b, u6tVar.c, u6tVar.d, u6tVar.e, u6tVar.f, u6tVar.g, u6tVar.a);
                    } else {
                        config = p2;
                        transferParameters = null;
                    }
                    if (transferParameters != null) {
                        colorSpace = new ColorSpace.Rgb(str, rdoVar.h, a2, transferParameters);
                    } else {
                        float[] fArr = rdoVar.h;
                        final qdo qdoVar = rdoVar.l;
                        final int i4 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: m95
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i4) {
                                }
                                return ((Number) qdoVar.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final qdo qdoVar2 = rdoVar.o;
                        final int i5 = 1;
                        colorSpace = new ColorSpace.Rgb(str, fArr, a2, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: m95
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                switch (i5) {
                                }
                                return ((Number) qdoVar2.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, rdoVar.e, rdoVar.f);
                    }
                } else {
                    config = p2;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace);
            }
            colorSpace2 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = colorSpace2;
        config = p2;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace);
    }

    public static boolean k(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static float l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static final boolean m() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static float n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static final boolean o(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }

    public static synchronized boolean p(Context context) {
        Boolean bool;
        synchronized (woe.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            if (fxf.F()) {
                b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    b = Boolean.FALSE;
                }
            }
            a = applicationContext;
            return b.booleanValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(TextView textView, szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, szb szbVar5, szb szbVar6, szb szbVar7, szb szbVar8, szb szbVar9, szb szbVar10, szb szbVar11, szb szbVar12, szb szbVar13, szb szbVar14, szb szbVar15, szb szbVar16, szb szbVar17, szb szbVar18, dp8 dp8Var, ly9 ly9Var, xzb xzbVar) {
        a0c a0cVar = (a0c) textView;
        r(textView, szbVar, szbVar2, szbVar10, szbVar11, xzbVar, a0cVar);
        s(textView, szbVar3, szbVar, szbVar12, szbVar10, xzbVar, a0cVar);
        if (!xp3.B(szbVar4, szbVar13)) {
            textView.setTextColor(((Number) szbVar4.a(xzbVar)).intValue());
            if (!(szbVar4 instanceof ozb)) {
                ((a0c) textView).i(szbVar4.c(xzbVar, new ar9(textView, 1)));
            }
        }
        t(textView, szbVar5, szbVar2, szbVar14, szbVar11, xzbVar, a0cVar);
        u(textView, szbVar6, szbVar7, szbVar8, szbVar9, szbVar15, szbVar16, szbVar17, szbVar18, dp8Var, ly9Var, xzbVar);
    }

    public static final void r(TextView textView, szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, xzb xzbVar, a0c a0cVar) {
        if (xp3.B(szbVar, szbVar3) && xp3.B(szbVar2, szbVar4)) {
            return;
        }
        int ordinal = ((jk9) szbVar2.a(xzbVar)).ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 2;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                i = 0;
            }
        }
        textView.setTextSize(i, ((Number) szbVar.a(xzbVar)).longValue());
        if ((szbVar instanceof ozb) && (szbVar2 instanceof ozb)) {
            return;
        }
        oes oesVar = new oes(textView, szbVar, szbVar2, xzbVar, 0);
        a0cVar.i(szbVar.c(xzbVar, oesVar));
        a0cVar.i(szbVar2.c(xzbVar, oesVar));
    }

    public static final void s(TextView textView, szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, xzb xzbVar, a0c a0cVar) {
        if (xp3.B(szbVar, szbVar3) && xp3.B(szbVar2, szbVar4)) {
            return;
        }
        textView.setLetterSpacing(((float) ((Number) szbVar.a(xzbVar)).doubleValue()) / ((Number) szbVar2.a(xzbVar)).floatValue());
        if ((szbVar instanceof ozb) && (szbVar2 instanceof ozb)) {
            return;
        }
        oes oesVar = new oes(textView, szbVar, szbVar2, xzbVar, 1);
        a0cVar.i(szbVar2.c(xzbVar, oesVar));
        a0cVar.i(szbVar.c(xzbVar, oesVar));
    }

    public static final void t(TextView textView, szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, xzb xzbVar, a0c a0cVar) {
        if (xp3.B(szbVar, szbVar3) && xp3.B(szbVar2, szbVar4)) {
            return;
        }
        b(textView, szbVar, szbVar2, xzbVar);
        if (szbVar != null) {
            if ((szbVar instanceof ozb) && (szbVar2 instanceof ozb)) {
                return;
            }
            oes oesVar = new oes(textView, szbVar, szbVar2, xzbVar, 2);
            a0cVar.i(szbVar.c(xzbVar, oesVar));
            a0cVar.i(szbVar2.c(xzbVar, oesVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(TextView textView, szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, szb szbVar5, szb szbVar6, szb szbVar7, szb szbVar8, dp8 dp8Var, ly9 ly9Var, xzb xzbVar) {
        xzb xzbVar2;
        if (dp8Var != null && xp3.B(szbVar, szbVar5) && xp3.B(szbVar2, szbVar6) && xp3.B(szbVar3, szbVar7) && (!m() || xp3.B(szbVar4, szbVar8))) {
            return;
        }
        c(textView, szbVar, szbVar2, szbVar3, ly9Var, xzbVar);
        if (xp3.V(szbVar) && xp3.V(szbVar2) && xp3.V(szbVar3)) {
            xzbVar2 = xzbVar;
        } else {
            a03 a03Var = new a03(textView, szbVar, szbVar2, szbVar3, szbVar4, ly9Var, xzbVar);
            xzbVar2 = xzbVar;
            if (szbVar != null) {
                ((a0c) textView).i(szbVar.c(xzbVar2, a03Var));
            }
            if (szbVar2 != null) {
                ((a0c) textView).i(szbVar2.c(xzbVar2, a03Var));
            }
            if (szbVar3 != null) {
                ((a0c) textView).i(szbVar3.c(xzbVar2, a03Var));
            }
        }
        if (!m() || xp3.V(szbVar4)) {
            return;
        }
        ((a0c) textView).i(szbVar4 != null ? szbVar4.c(xzbVar2, new qas(textView, szbVar2, szbVar3, szbVar4, xzbVar2, 1)) : null);
    }

    public static void v(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    public static Intent w(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }

    public static final int x(x97 x97Var, nso nsoVar) {
        if (x97Var instanceof q38) {
            return ((q38) x97Var).n;
        }
        int ordinal = nsoVar.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Integer.MAX_VALUE;
        }
        b6e.s();
        return 0;
    }
}
