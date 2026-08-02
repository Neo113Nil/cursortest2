package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class yw5 implements Function0 {
    public final /* synthetic */ ww5 a;
    public final /* synthetic */ kx5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ lx5 d;

    public yw5(ww5 ww5Var, kx5 kx5Var, int i, lx5 lx5Var) {
        this.a = ww5Var;
        this.b = kx5Var;
        this.c = i;
        this.d = lx5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int size = ((gx5) this.d).a.size();
        ww5 ww5Var = this.a;
        nx5 nx5Var = ww5Var.b;
        kx5 kx5Var = this.b;
        kx5Var.getClass();
        rmb.a(ww5Var.d.a(new jab(qkb.LocationList, 1, 2, size), null), sjb.SearchItemSelected, y2x.l(kx5Var, this.c + 1), null, 10);
        if (kx5Var instanceof ix5) {
            nx5Var.k.b(px5.a);
            nx5Var.r.a(Unit.a);
        } else {
            if (!(kx5Var instanceof jx5)) {
                b6e.s();
                return null;
            }
            nx5Var.getClass();
            nx5Var.k.b(new ox5(((jx5) kx5Var).a));
            nx5Var.r.a(Unit.a);
        }
        return Unit.a;
    }
}
