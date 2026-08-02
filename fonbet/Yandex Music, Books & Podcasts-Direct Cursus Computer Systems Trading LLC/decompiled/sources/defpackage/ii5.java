package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ii5 extends cg6 {
    public List j;
    public String k;
    public oi5 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ oi5 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii5(oi5 oi5Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = oi5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, null, null, this);
    }
}
