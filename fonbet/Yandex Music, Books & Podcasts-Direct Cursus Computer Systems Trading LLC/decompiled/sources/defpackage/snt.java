package defpackage;

import java.io.File;

/* loaded from: classes4.dex */
public final class snt extends cg6 {
    public File j;
    public tnt k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tnt m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snt(tnt tntVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = tntVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object e = this.m.e(null, null, null, this);
        return e == nm6.a ? e : new z7o(e);
    }
}
