package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class xkd extends cg6 {
    public Context j;
    public uqf k;
    public String l;
    public qqi m;
    public /* synthetic */ Object n;
    public final /* synthetic */ bld o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkd(bld bldVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = bldVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, null, null, this);
    }
}
