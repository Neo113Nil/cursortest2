package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m1 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1 f7846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f7847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc.c f7848i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, float f10, oc.c cVar) {
        super(1);
        this.f7846g = n1Var;
        this.f7847h = f10;
        this.f7848i = cVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        long round;
        long longValue = ((Number) obj).longValue();
        n1 n1Var = this.f7846g;
        if (n1Var.f7856b == Long.MIN_VALUE) {
            n1Var.f7856b = longValue;
        }
        float f10 = n1Var.f7859e;
        v.j jVar = new v.j(f10);
        float f11 = this.f7847h;
        v.j jVar2 = n1.f7854f;
        if (f11 == 0.0f) {
            round = n1Var.f7855a.b(new v.j(f10), jVar2, n1Var.f7857c);
        } else {
            double d10 = (longValue - n1Var.f7856b) / f11;
            if (Double.isNaN(d10)) {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
            round = Math.round(d10);
        }
        long j3 = round;
        float f12 = ((v.j) n1Var.f7855a.k(j3, jVar, jVar2, n1Var.f7857c)).f6872a;
        n1Var.f7857c = (v.j) n1Var.f7855a.p(j3, jVar, jVar2, n1Var.f7857c);
        n1Var.f7856b = longValue;
        float f13 = n1Var.f7859e - f12;
        n1Var.f7859e = f12;
        this.f7848i.invoke(Float.valueOf(f13));
        return ac.o.f277a;
    }
}
