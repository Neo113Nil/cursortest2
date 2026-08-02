package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class utl extends cg6 {
    public String j;
    public List k;
    public List l;
    public List m;
    public Collection n;
    public Iterator o;
    public cvl p;
    public Collection q;
    public HashSet r;
    public int s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ xtl w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utl(xtl xtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.w = xtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.b(this, null, null);
    }
}
