package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class axp extends cg6 {
    public fyp j;
    public zwp k;
    public Context l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ cxp o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axp(cxp cxpVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = cxpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, null, null, false, this);
    }
}
