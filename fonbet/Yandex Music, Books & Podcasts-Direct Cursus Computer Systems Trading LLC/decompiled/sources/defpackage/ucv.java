package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ucv extends cg6 {
    public tyi j;
    public mm6 k;
    public xqn l;
    public xqn m;
    public xqn n;
    public Map o;
    public ezh p;
    public xzi q;
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ tyi t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucv(tyi tyiVar, cg6 cg6Var) {
        super(cg6Var);
        this.t = tyiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return tyi.c(this.t, null, this);
    }
}
