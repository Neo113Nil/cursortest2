package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class xst extends cg6 {
    public Iterator j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dtt m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xst(dtt dttVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = dttVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return dtt.a(this.m, this);
    }
}
