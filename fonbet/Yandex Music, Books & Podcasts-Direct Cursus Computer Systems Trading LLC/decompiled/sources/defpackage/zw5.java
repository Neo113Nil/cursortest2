package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class zw5 implements Function2 {
    public final /* synthetic */ ww5 a;
    public final /* synthetic */ kx5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ lx5 d;

    public zw5(ww5 ww5Var, kx5 kx5Var, int i, lx5 lx5Var) {
        this.a = ww5Var;
        this.b = kx5Var;
        this.c = i;
        this.d = lx5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        str.getClass();
        int size = ((gx5) this.d).a.size();
        ww5 ww5Var = this.a;
        ww5Var.getClass();
        kx5 kx5Var = this.b;
        kx5Var.getClass();
        weo.H(ww5Var.d.a(new jab(qkb.LocationList, 1, 2, size), null), y2x.l(kx5Var, this.c + 1), booleanValue, str, null);
        return Unit.a;
    }
}
