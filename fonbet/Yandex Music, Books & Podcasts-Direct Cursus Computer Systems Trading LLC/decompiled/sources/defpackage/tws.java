package defpackage;

import java.util.Collection;

/* loaded from: classes5.dex */
public final class tws extends cg6 {
    public Collection j;
    public String k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ uws o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tws(uws uwsVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = uwsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, null, this);
    }
}
