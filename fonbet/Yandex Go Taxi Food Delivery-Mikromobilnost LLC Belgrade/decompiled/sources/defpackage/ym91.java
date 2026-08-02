package defpackage;

import android.animation.ValueAnimator;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;

/* loaded from: classes6.dex */
public abstract class ym91 {
    public static final a1o a = new a1o("update_status");

    public static final void a(f4c0 f4c0Var, float f) {
        Float scale;
        Object obj = f4c0Var.d;
        if (!(obj instanceof pp60)) {
            obj = null;
        }
        pp60 pp60Var = (pp60) obj;
        if (pp60Var == null) {
            pp60Var = oyr.c(f4c0Var);
        }
        ValueAnimator valueAnimator = pp60Var.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Object obj2 = f4c0Var.d;
        pp60 pp60Var2 = (pp60) (obj2 instanceof pp60 ? obj2 : null);
        if (pp60Var2 == null) {
            pp60Var2 = oyr.c(f4c0Var);
        }
        IconStyle iconStyle = f4c0Var.m;
        float floatValue = (iconStyle == null || (scale = iconStyle.getScale()) == null) ? 1.0f : scale.floatValue();
        IconStyle iconStyle2 = f4c0Var.m;
        if (iconStyle2 == null) {
            iconStyle2 = new IconStyle();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, f);
        ofFloat.addUpdateListener(new vf2(10, iconStyle2, f4c0Var));
        ofFloat.addListener(new AnimUtils$AnimationEndListener(new wnb0(3, f4c0Var)));
        ofFloat.start();
        pp60Var2.b = ofFloat;
    }

    public static final void b(f4c0 f4c0Var, wls wlsVar) {
        Object obj = f4c0Var.d;
        if (!(obj instanceof pp60)) {
            obj = null;
        }
        pp60 pp60Var = (pp60) obj;
        if (pp60Var == null) {
            pp60Var = oyr.c(f4c0Var);
        }
        pp60Var.d = wlsVar;
    }

    public static final shf c(lqn lqnVar) {
        if (lqnVar instanceof hqn) {
            return ((hqn) lqnVar).a;
        }
        if (lqnVar instanceof jqn) {
            return ((jqn) lqnVar).a;
        }
        w511.b();
        return null;
    }

    public static oz40 d() {
        return l651.c;
    }

    public static final int e(f4c0 f4c0Var) {
        return (int) (f4c0Var.q() * 0.2f);
    }

    public static final void f(f4c0 f4c0Var, lz2 lz2Var, boolean z, cn00 cn00Var) {
        IconStyle iconStyle = f4c0Var.m;
        if (iconStyle == null) {
            iconStyle = new IconStyle();
        }
        iconStyle.setAnchor(z ? lz2Var.j : lz2Var.h);
        iconStyle.setZIndex(Float.valueOf(lz2Var.b));
        ImageProvider imageProvider = lz2Var.i;
        if (!z || imageProvider == null) {
            imageProvider = lz2Var.a;
        }
        y2b1 y2b1Var = lz2Var.c;
        if (y2b1Var instanceof ec4) {
            iconStyle.setRotationType(RotationType.ROTATE);
            f4c0Var.v(((ec4) y2b1Var).a);
        } else {
            if (!jl40.l(y2b1Var, fc4.a)) {
                w511.b();
                return;
            }
            iconStyle.setRotationType(RotationType.NO_ROTATION);
        }
        if (z) {
            Object obj = f4c0Var.d;
            if (!(obj instanceof pp60)) {
                obj = null;
            }
            pp60 pp60Var = (pp60) obj;
            if (pp60Var == null) {
                pp60Var = oyr.c(f4c0Var);
            }
            ValueAnimator valueAnimator = pp60Var.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            iconStyle.setScale(Float.valueOf(lz2Var.d));
        }
        f4c0Var.n = new t26(17, lz2Var, f4c0Var, cn00Var);
        f4c0Var.z(imageProvider, iconStyle);
        Object obj2 = f4c0Var.d;
        pp60 pp60Var2 = (pp60) (obj2 instanceof pp60 ? obj2 : null);
        if (pp60Var2 == null) {
            pp60Var2 = oyr.c(f4c0Var);
        }
        pp60Var2.e = lz2Var.g;
    }
}
