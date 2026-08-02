package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class wwu extends cg6 {
    public eu7 j;
    public v4v k;
    public pfn l;
    public gxc m;
    public List n;
    public a5v o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ hxu r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwu(hxu hxuVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = hxuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.k(null, null, null, null, false, this);
    }
}
