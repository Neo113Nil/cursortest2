package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class dr9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ er9 s;
    public final /* synthetic */ d89 t;
    public final /* synthetic */ e23 u;
    public final /* synthetic */ xq9 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr9(er9 er9Var, d89 d89Var, e23 e23Var, xq9 xq9Var, int i) {
        super(1);
        this.r = i;
        this.s = er9Var;
        this.t = d89Var;
        this.u = e23Var;
        this.v = xq9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.N(this.t, this.u, this.v);
                break;
            case 1:
                e23 e23Var = this.u;
                xq9 xq9Var = this.v;
                er9 er9Var = this.s;
                d89 d89Var = this.t;
                er9Var.O(d89Var, e23Var, xq9Var);
                er9Var.I(d89Var, (String) obj);
                break;
            default:
                this.s.O(this.t, this.u, this.v);
                break;
        }
        return Unit.a;
    }
}
