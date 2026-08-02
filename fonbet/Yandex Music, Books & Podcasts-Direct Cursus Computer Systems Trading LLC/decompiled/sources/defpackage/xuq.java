package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class xuq extends cg6 {
    public ptq j;
    public Iterator k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ atn n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuq(atn atnVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = atnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.P(null, this);
    }
}
