package defpackage;

/* loaded from: classes.dex */
public final class j2k implements sh3 {
    public final o3k b;
    public final sh3 c;

    public j2k(o3k o3kVar, sh3 sh3Var) {
        this.b = o3kVar;
        this.c = sh3Var;
    }

    @Override // defpackage.sh3
    public final float a(float f, float f2, float f3) {
        float a = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f ? f + f2 <= 0.0f : f + f2 > f3) {
            z = true;
        }
        float abs = Math.abs(a);
        o3k o3kVar = this.b;
        if (abs == 0.0f || !z) {
            if (Math.abs(o3kVar.f) < 1.0E-6d) {
                return 0.0f;
            }
            float f4 = o3kVar.f * (-1.0f);
            if (((Boolean) o3kVar.H.getValue()).booleanValue()) {
                f4 += o3kVar.p();
            }
            return yhn.c(f4, -f3, f3);
        }
        float f5 = o3kVar.f * (-1);
        while (a > 0.0f && f5 < a) {
            f5 += o3kVar.p();
        }
        while (a < 0.0f && f5 > a) {
            f5 -= o3kVar.p();
        }
        return f5;
    }
}
