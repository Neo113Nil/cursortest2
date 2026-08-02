package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class cqk extends cg6 {
    public yqk j;
    public g43 k;
    public List l;
    public Integer m;
    public /* synthetic */ Object n;
    public final /* synthetic */ t1f o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqk(t1f t1fVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = t1fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.I(null, null, null, this);
    }
}
