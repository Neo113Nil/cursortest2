package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class bhf extends cg6 {
    public List j;
    public ogf k;
    public khf l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ghf n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhf(ghf ghfVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = ghfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.G(null, null, this);
    }
}
