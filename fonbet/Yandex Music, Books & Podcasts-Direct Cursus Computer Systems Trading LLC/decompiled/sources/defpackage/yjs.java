package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class yjs extends cg6 {
    public mqs j;
    public List k;
    public mqs l;
    public /* synthetic */ Object m;
    public final /* synthetic */ aks n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjs(aks aksVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = aksVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, null, null, this);
    }
}
