package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class aqk extends cg6 {
    public String j;
    public yqk k;
    public Collection l;
    public Iterator m;
    public Collection n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ t1f r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqk(t1f t1fVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = t1fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.G(null, null, this);
    }
}
