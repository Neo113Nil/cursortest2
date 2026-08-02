package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class gok extends cg6 {
    public String j;
    public p73 k;
    public yqk l;
    public cok m;
    public Iterator n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ nnd q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gok(nnd nndVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = nndVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.V(null, null, this);
    }
}
