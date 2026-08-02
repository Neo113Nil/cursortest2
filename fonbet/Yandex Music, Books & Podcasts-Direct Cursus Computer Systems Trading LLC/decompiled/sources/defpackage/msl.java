package defpackage;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class msl extends cg6 {
    public Iterable j;
    public Iterator k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ nsl o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msl(nsl nslVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = nslVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e(null, this);
    }
}
