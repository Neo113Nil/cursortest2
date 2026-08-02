package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class wv0 extends cg6 {
    public Object j;
    public Context k;
    public n3b l;
    public /* synthetic */ Object m;
    public final /* synthetic */ aw0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv0(aw0 aw0Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = aw0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, null, this);
    }
}
