package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class nzu extends cg6 {
    public List j;
    public c5b k;
    public ssu l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ rzu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzu(rzu rzuVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = rzuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, null, this);
    }
}
