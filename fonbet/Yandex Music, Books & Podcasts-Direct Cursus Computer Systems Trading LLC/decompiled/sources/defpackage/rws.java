package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class rws extends cg6 {
    public Collection j;
    public nnk k;
    public List l;
    public Map m;
    public Map n;
    public Collection o;
    public Iterator p;
    public int q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ uws u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rws(uws uwsVar, cg6 cg6Var) {
        super(cg6Var);
        this.u = uwsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return uws.a(this.u, null, this);
    }
}
