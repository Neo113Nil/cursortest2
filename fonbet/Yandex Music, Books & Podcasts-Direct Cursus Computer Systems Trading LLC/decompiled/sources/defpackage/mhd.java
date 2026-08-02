package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class mhd extends cg6 {
    public lc4 j;
    public Function2 k;
    public si3 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ohd n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhd(ohd ohdVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = ohdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return ohd.b(this.n, null, null, this);
    }
}
