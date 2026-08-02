package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ekd extends cg6 {
    public Object j;
    public Context k;
    public rv0 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ pv0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekd(pv0 pv0Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = pv0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e(null, 0, this);
    }
}
