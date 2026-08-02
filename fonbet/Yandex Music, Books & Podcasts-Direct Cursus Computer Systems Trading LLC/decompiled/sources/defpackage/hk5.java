package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class hk5 extends cg6 {
    public Map j;
    public Map k;
    public Iterator l;
    public String m;
    public Iterator n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ jk5 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk5(jk5 jk5Var, cg6 cg6Var) {
        super(cg6Var);
        this.w = jk5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return jk5.a(this.w, null, this);
    }
}
