package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class v9k extends cg6 {
    public String j;
    public Function1 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ w9k m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9k(w9k w9kVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = w9kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, null, this);
    }
}
