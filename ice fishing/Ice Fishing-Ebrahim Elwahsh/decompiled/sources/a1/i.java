package a1;

import k1.C4628a;

/* loaded from: classes.dex */
public final class i extends k {
    @Override // a1.AbstractC0421e
    public final Object f(C4628a c4628a, float f6) {
        return Float.valueOf(m(c4628a, f6));
    }

    public final float l() {
        return m(this.f4304c.h(), c());
    }

    public final float m(C4628a c4628a, float f6) {
        float f9;
        if (c4628a.f38672b == null || c4628a.f38673c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        S0.s sVar = this.f4306e;
        Object obj = c4628a.f38672b;
        if (sVar != null) {
            Float f10 = (Float) c4628a.f38673c;
            float d2 = d();
            float f11 = this.f4305d;
            f9 = f6;
            Float f12 = (Float) sVar.h(c4628a.f38677g, c4628a.f38678h.floatValue(), (Float) obj, f10, f9, d2, f11);
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f9 = f6;
        }
        if (c4628a.i == -3987645.8f) {
            c4628a.i = ((Float) obj).floatValue();
        }
        float f13 = c4628a.i;
        if (c4628a.f38679j == -3987645.8f) {
            c4628a.f38679j = ((Float) c4628a.f38673c).floatValue();
        }
        return j1.h.f(f13, c4628a.f38679j, f9);
    }
}
