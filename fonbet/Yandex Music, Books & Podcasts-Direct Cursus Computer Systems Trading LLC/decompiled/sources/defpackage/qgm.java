package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class qgm extends cg6 {
    public long j;
    public Function0 k;
    public xqn l;
    public /* synthetic */ Object m;
    public final /* synthetic */ rgm n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgm(rgm rgmVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = rgmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(0L, null, this);
    }
}
