package defpackage;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class nul extends cg6 {
    public cvl j;
    public Iterator k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ oul o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nul(oul oulVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = oulVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, null, this);
    }
}
