package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o1r extends cg6 {
    public Function1 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ s1r l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1r(s1r s1rVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = s1rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, 0.0f, null, this);
    }
}
