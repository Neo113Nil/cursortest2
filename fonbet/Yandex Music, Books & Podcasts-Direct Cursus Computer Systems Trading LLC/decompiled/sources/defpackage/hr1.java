package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class hr1 extends cg6 {
    public ir1 j;
    public List k;
    public t2o l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ir1 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr1(ir1 ir1Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = ir1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(this);
    }
}
