package defpackage;

/* loaded from: classes3.dex */
public final class fuw {
    public final float a = 5.0f;
    public long b = 0;
    public final uf7 c;
    public final fk0 d;
    public final fk0 e;
    public final fk0 f;
    public long g;
    public final x6k h;
    public long i;
    public Boolean j;
    public final x8a k;

    public fuw(uf7 uf7Var) {
        this.c = uf7Var;
        fk0 a = vq2.a(1.0f);
        a.h(Float.valueOf(0.9f), Float.valueOf(5.0f));
        this.d = a;
        this.e = vq2.a(0.0f);
        this.f = vq2.a(0.0f);
        this.g = 0L;
        this.h = szf.g0(true);
        this.i = 0L;
        this.k = new x8a();
    }

    public static final ynn a(fuw fuwVar, float f) {
        long f2 = nmq.f(f, fuwVar.i);
        float max = Float.max(nmq.d(f2) - nmq.d(fuwVar.g), 0.0f) * 0.5f;
        float max2 = Float.max(nmq.b(f2) - nmq.b(fuwVar.g), 0.0f) * 0.5f;
        return new ynn(-max, -max2, max, max2);
    }

    public static final long b(fuw fuwVar, float f, long j, long j2) {
        long f2 = nmq.f(fuwVar.c(), fuwVar.i);
        long f3 = nmq.f(f, fuwVar.i);
        float d = nmq.d(f3) - nmq.d(f2);
        float b = nmq.b(f3) - nmq.b(f2);
        float e = enj.e(j);
        fk0 fk0Var = fuwVar.e;
        float d2 = ((nmq.d(f2) - nmq.d(fuwVar.g)) * 0.5f) + (e - ((Number) fk0Var.e()).floatValue());
        float f4 = enj.f(j);
        fk0 fk0Var2 = fuwVar.f;
        float b2 = ((nmq.b(f2) - nmq.b(fuwVar.g)) * 0.5f) + (f4 - ((Number) fk0Var2.e()).floatValue());
        float d3 = (d * 0.5f) - ((d * d2) / nmq.d(f2));
        float b3 = (0.5f * b) - ((b * b2) / nmq.b(f2));
        return swf.i(enj.e(j2) + ((Number) fk0Var.e()).floatValue() + d3, enj.f(j2) + ((Number) fk0Var2.e()).floatValue() + b3);
    }

    public final float c() {
        return ((Number) this.d.e()).floatValue();
    }

    public final void d() {
        if (nmq.a(this.g, 0L)) {
            this.i = 0L;
            return;
        }
        if (nmq.a(this.b, 0L)) {
            this.i = this.g;
            return;
        }
        float d = nmq.d(this.b) / nmq.b(this.b);
        float d2 = nmq.d(this.g) / nmq.b(this.g);
        long j = this.b;
        long j2 = this.g;
        this.i = d > d2 ? nmq.f(nmq.d(j2) / nmq.d(this.b), j) : nmq.f(nmq.b(j2) / nmq.b(this.b), j);
    }
}
