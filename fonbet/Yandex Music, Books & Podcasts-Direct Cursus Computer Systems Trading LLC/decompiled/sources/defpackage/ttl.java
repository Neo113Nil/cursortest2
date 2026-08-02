package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class ttl extends cg6 {
    public String j;
    public nvl k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ xtl n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttl(xtl xtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = xtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, this);
    }
}
