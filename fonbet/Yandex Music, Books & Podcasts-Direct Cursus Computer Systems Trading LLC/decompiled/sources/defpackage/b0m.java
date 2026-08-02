package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b0m implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0m b;

    public /* synthetic */ b0m(n0m n0mVar, int i) {
        this.a = i;
        this.b = n0mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (ncc) ((xul) this.b.w.getValue()).a.getValue();
            case 1:
                return (pzk) ((xul) this.b.w.getValue()).c.getValue();
            case 2:
                n0m n0mVar = this.b;
                return new dzl(ot0.F(n0mVar), (oyl) n0mVar.y.getValue(), new b0m(n0mVar, 4));
            case 3:
                l13 l13Var = this.b.o.a;
                return (s14) l13Var.a.D(hag.I(s14.class), l13Var, l13Var.b);
            default:
                return (a1m) this.b.X.getValue();
        }
    }
}
