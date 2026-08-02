package defpackage;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class viv implements ttf {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn5 b;
    public final /* synthetic */ d24 c;
    public final /* synthetic */ fk0 d;

    public viv(int i, wn5 wn5Var, d24 d24Var, fk0 fk0Var) {
        this.a = i;
        this.b = wn5Var;
        this.c = d24Var;
        this.d = fk0Var;
    }

    @Override // defpackage.ttf
    public final int a() {
        return 100000;
    }

    @Override // defpackage.ttf
    public final void b(int i, Object obj, hq5 hq5Var, int i2) {
        obj.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1509062242);
        int i3 = i % this.a;
        boolean d = oq5Var.d(i);
        Object K = oq5Var.K();
        d24 d24Var = this.c;
        if (d || K == gq5.a) {
            K = szf.U(new hsl(this.d, d24Var, i, 11));
            oq5Var.k0(K);
        }
        Integer valueOf = Integer.valueOf(i3);
        fma fmaVar = new fma(d24Var.a);
        Boolean bool = (Boolean) ((sdr) K).getValue();
        bool.getClass();
        this.b.f(valueOf, vci.a, fmaVar, bool, Integer.valueOf(i), oq5Var, 48);
        oq5Var.p(false);
    }

    @Override // defpackage.ttf
    public final Object c(int i) {
        return Unit.a;
    }

    @Override // defpackage.ttf
    public final int d(Object obj) {
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    @Override // defpackage.ttf
    public final Object e(int i) {
        return Integer.valueOf(i);
    }
}
