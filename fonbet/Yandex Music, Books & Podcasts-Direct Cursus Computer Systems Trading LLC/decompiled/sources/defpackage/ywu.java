package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class ywu extends cg6 {
    public eu7 j;
    public s4q k;
    public pfn l;
    public gxc m;
    public List n;
    public a5v o;
    public /* synthetic */ Object p;
    public final /* synthetic */ hxu q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywu(hxu hxuVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = hxuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.j(null, null, this);
    }
}
