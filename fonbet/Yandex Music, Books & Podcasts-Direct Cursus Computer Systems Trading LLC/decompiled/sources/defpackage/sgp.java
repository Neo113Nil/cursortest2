package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class sgp extends cg6 {
    public tgp j;
    public f1k k;
    public List l;
    public Object m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ tgp q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgp(tgp tgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = tgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, this);
    }
}
