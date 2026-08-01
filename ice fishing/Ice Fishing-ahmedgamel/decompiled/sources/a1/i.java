package a1;

import com.google.android.gms.internal.ads.C2991bm;
import j1.AbstractC4603g;
import k1.C4629a;

/* loaded from: classes.dex */
public final class i extends k {
    @Override // a1.AbstractC0428e
    public final Object f(C4629a c4629a, float f3) {
        return Float.valueOf(m(c4629a, f3));
    }

    public final float l() {
        return m(this.f4255c.i(), c());
    }

    public final float m(C4629a c4629a, float f3) {
        float f9;
        if (c4629a.f38552b == null || c4629a.f38553c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C2991bm c2991bm = this.f4257e;
        Object obj = c4629a.f38552b;
        if (c2991bm != null) {
            Float f10 = (Float) c4629a.f38553c;
            float d2 = d();
            float f11 = this.f4256d;
            f9 = f3;
            Float f12 = (Float) c2991bm.R(c4629a.f38557g, c4629a.f38558h.floatValue(), (Float) obj, f10, f9, d2, f11);
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f9 = f3;
        }
        if (c4629a.i == -3987645.8f) {
            c4629a.i = ((Float) obj).floatValue();
        }
        float f13 = c4629a.i;
        if (c4629a.f38559j == -3987645.8f) {
            c4629a.f38559j = ((Float) c4629a.f38553c).floatValue();
        }
        return AbstractC4603g.f(f13, c4629a.f38559j, f9);
    }
}
