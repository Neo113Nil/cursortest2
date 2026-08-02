package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class enl extends cg6 {
    public String j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public xqn n;
    public xqn o;
    public long p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ jnl s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enl(jnl jnlVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = jnlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(this, null, null);
    }
}
