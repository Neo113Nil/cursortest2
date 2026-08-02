package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class yrn extends cg6 {
    public Iterator j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bsn m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrn(bsn bsnVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bsnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, this);
    }
}
