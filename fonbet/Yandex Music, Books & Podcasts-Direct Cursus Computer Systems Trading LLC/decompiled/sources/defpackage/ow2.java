package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ow2 extends cg6 {
    public Context j;
    public gw2 k;
    public String l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ rw2 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow2(rw2 rw2Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = rw2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(null, this);
    }
}
