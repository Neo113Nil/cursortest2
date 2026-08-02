package defpackage;

/* loaded from: classes.dex */
public final class lbs {
    public static final apo g = dag.B(epo.z0, rvr.D);
    public final t6k a;
    public final t6k b = new t6k(0.0f);
    public final u6k c = new u6k(0);
    public ynn d = ynn.e;
    public long e = rds.b;
    public final x6k f;

    public lbs(bxj bxjVar, float f) {
        this.a = new t6k(f);
        this.f = new x6k(bxjVar, ehv.h);
    }

    public final void a(bxj bxjVar, ynn ynnVar, int i, int i2) {
        float f = i2 - i;
        this.b.h(f);
        float f2 = ynnVar.a;
        float f3 = ynnVar.b;
        ynn ynnVar2 = this.d;
        float f4 = ynnVar2.a;
        t6k t6kVar = this.a;
        if (f2 != f4 || f3 != ynnVar2.b) {
            boolean z = bxjVar == bxj.a;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? ynnVar.d : ynnVar.c;
            float e = t6kVar.e();
            float f6 = i;
            float f7 = e + f6;
            t6kVar.h(t6kVar.e() + ((f5 <= f7 && (f2 >= e || f5 - f2 <= f6)) ? (f2 >= e || f5 - f2 > f6) ? 0.0f : f2 - e : f5 - f7));
            this.d = ynnVar;
        }
        t6kVar.h(yhn.c(t6kVar.e(), 0.0f, f));
        this.c.i(i);
    }
}
