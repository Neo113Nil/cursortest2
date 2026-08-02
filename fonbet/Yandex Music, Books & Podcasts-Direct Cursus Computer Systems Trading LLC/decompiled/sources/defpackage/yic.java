package defpackage;

/* loaded from: classes.dex */
public final class yic extends bcf {
    @Override // defpackage.cs2
    public final Object f(acf acfVar, float f) {
        return Float.valueOf(m(acfVar, f));
    }

    public final float l() {
        return m(this.c.e(), c());
    }

    public final float m(acf acfVar, float f) {
        float f2;
        Object obj = acfVar.b;
        Object obj2 = acfVar.b;
        if (obj == null || acfVar.c == null) {
            xq0.q("Missing values for keyframe.");
            return 0.0f;
        }
        szg szgVar = this.e;
        if (szgVar != null) {
            f2 = f;
            Float f3 = (Float) szgVar.b(acfVar.g, acfVar.h.floatValue(), (Float) obj2, (Float) acfVar.c, f2, d(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        if (acfVar.i == -3987645.8f) {
            acfVar.i = ((Float) obj2).floatValue();
        }
        float f4 = acfVar.i;
        if (acfVar.j == -3987645.8f) {
            acfVar.j = ((Float) acfVar.c).floatValue();
        }
        return y5i.f(f4, acfVar.j, f2);
    }
}
