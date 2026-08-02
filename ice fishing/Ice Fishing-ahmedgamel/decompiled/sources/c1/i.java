package c1;

import com.google.android.gms.internal.ads.LP;
import l1.AbstractC4672g;
import m1.C4739a;

/* loaded from: classes.dex */
public final class i extends k {
    @Override // c1.AbstractC0545e
    public final Object f(C4739a c4739a, float f2) {
        return Float.valueOf(m(c4739a, f2));
    }

    public final float l() {
        return m(this.f5650c.f(), c());
    }

    public final float m(C4739a c4739a, float f2) {
        float f9;
        if (c4739a.f39341b == null || c4739a.f39342c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LP lp = this.f5652e;
        Object obj = c4739a.f39341b;
        if (lp != null) {
            Float f10 = (Float) c4739a.f39342c;
            float d9 = d();
            float f11 = this.f5651d;
            f9 = f2;
            Float f12 = (Float) lp.d(c4739a.f39346g, c4739a.f39347h.floatValue(), (Float) obj, f10, f9, d9, f11);
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f9 = f2;
        }
        if (c4739a.i == -3987645.8f) {
            c4739a.i = ((Float) obj).floatValue();
        }
        float f13 = c4739a.i;
        if (c4739a.f39348j == -3987645.8f) {
            c4739a.f39348j = ((Float) c4739a.f39342c).floatValue();
        }
        return AbstractC4672g.f(f13, c4739a.f39348j, f9);
    }
}
