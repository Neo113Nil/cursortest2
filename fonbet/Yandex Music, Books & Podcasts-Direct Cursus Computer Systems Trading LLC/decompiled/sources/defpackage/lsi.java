package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class lsi extends cg6 {
    public Collection j;
    public Iterator k;
    public String l;
    public Collection m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ iwe q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsi(iwe iweVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = iweVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.k(null, this);
    }
}
