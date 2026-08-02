package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class cw0 extends cg6 {
    public Function2 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dw0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw0(dw0 dw0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = dw0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        this.l.c(null, this);
        return nm6.a;
    }
}
