package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowMetrics;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class irv {
    public static final qs5 a = new qs5(new h8v(21));

    public static final void a(float f, float f2, float f3, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        final float f4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-163232184);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (oq5Var.c(f) ? 4 : 2);
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (oq5Var.c(f2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i5 = i4 | 384;
        } else {
            i5 = i4 | (oq5Var.c(f3) ? 256 : 128);
        }
        if ((i5 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            f4 = f3;
        } else {
            if (i6 != 0) {
                f = 0.0f;
            }
            if (i7 != 0) {
                f2 = 0.0f;
            }
            float f5 = i8 == 0 ? f3 : 0.0f;
            etn.l(a.a(b(f, f2, f5, oq5Var, 0)), ild.C(133446024, new lqr(wn5Var, 16), oq5Var), oq5Var, 56);
            f4 = f5;
        }
        final float f6 = f;
        final float f7 = f2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(f6, f7, f4, wn5Var, i, i2) { // from class: hrv
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ wn5 d;
                public final /* synthetic */ int e;

                {
                    this.e = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(3073);
                    irv.a(this.a, this.b, this.c, this.d, (hq5) obj, R, this.e);
                    return Unit.a;
                }
            };
        }
    }

    public static final ynn b(float f, float f2, float f3, hq5 hq5Var, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        oq5 oq5Var = (oq5) hq5Var;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        boolean f4 = oq5Var.f((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a));
        Object K = oq5Var.K();
        if (f4 || K == gq5.a) {
            K = c(context, f, f2, f3);
            oq5Var.k0(K);
        }
        return (ynn) K;
    }

    public static final ynn c(Context context, float f, float f2, float f3) {
        int i;
        int i2;
        int i3;
        int i4;
        context.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            ynn ynnVar = new ynn(f3 + 0.0f, f2 + 0.0f, displayMetrics.widthPixels - f3, displayMetrics.heightPixels - f);
            if (ynnVar.g() >= 0.0f || ynnVar.d() >= 0.0f) {
                return ynnVar;
            }
            dfi.r("screenRect is not correct, check insets in parameters", "WindowUtils");
            return new ynn(0.0f, 0.0f, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        WindowMetrics currentWindowMetrics = l1b.j(context).getCurrentWindowMetrics();
        currentWindowMetrics.getClass();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(2);
        insets.getClass();
        Rect bounds = currentWindowMetrics.getBounds();
        bounds.getClass();
        i = insets.left;
        float f4 = i + 0.0f + f3;
        i2 = insets.top;
        float f5 = i2 + 0.0f + f2;
        float width = bounds.width();
        i3 = insets.right;
        float f6 = (width - i3) - f3;
        float height = bounds.height();
        i4 = insets.bottom;
        ynn ynnVar2 = new ynn(f4, f5, f6, (height - i4) - f);
        if (ynnVar2.g() >= 0.0f || ynnVar2.d() >= 0.0f) {
            return ynnVar2;
        }
        Assertions.throwOrSkip("WindowUtils", new FailedAssertionException("screenRect is not correct, check insets in parameters"));
        return new ynn(0.0f, 0.0f, bounds.width(), bounds.height());
    }

    public static final float d(hq5 hq5Var) {
        ((Context) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.b)).getClass();
        return eeh.b(qdq.l(r1) / r1.getResources().getDisplayMetrics().density);
    }

    public static final float e(hq5 hq5Var) {
        ((Context) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.b)).getClass();
        return eeh.b(qdq.n(r1) / r1.getResources().getDisplayMetrics().density);
    }

    public static final float f(hq5 hq5Var) {
        return qdq.s((Context) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.b));
    }

    public static final boolean g(hq5 hq5Var) {
        return ((Configuration) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.a)).screenHeightDp < 480;
    }

    public static final boolean h(hq5 hq5Var) {
        return ((Configuration) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 600;
    }

    public static final ynn i(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        ynn ynnVar = (ynn) oq5Var.j(a);
        if (ynnVar == null) {
            oq5Var.Z(1814031979);
            ynnVar = b(0.0f, 0.0f, 0.0f, oq5Var, 7);
        } else {
            oq5Var.Z(1814031080);
        }
        oq5Var.p(false);
        return ynnVar;
    }
}
