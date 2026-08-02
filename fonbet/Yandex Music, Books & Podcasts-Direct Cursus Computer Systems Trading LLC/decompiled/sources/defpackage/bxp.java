package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public final class bxp extends cg6 {
    public Context j;
    public String k;
    public Intent l;
    public /* synthetic */ Object m;
    public final /* synthetic */ cxp n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxp(cxp cxpVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = cxpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, null, null, null, this);
    }
}
