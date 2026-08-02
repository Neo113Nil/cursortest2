package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class el7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gl7 s;
    public final /* synthetic */ so3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el7(gl7 gl7Var, liq liqVar, int i) {
        super(0);
        this.r = i;
        this.s = gl7Var;
        this.t = liqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                n9c n9cVar = new n9c(false);
                return this.s.a.a ? new cl7(this.t, n9cVar) : n9cVar;
            default:
                so3 so3Var = this.t;
                so3Var.getClass();
                hp3 hp3Var = new hp3(so3Var, 5242880L);
                return this.s.a.a ? new bl7(hp3Var) : hp3Var;
        }
    }
}
