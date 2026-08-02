package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zgm extends cg6 {
    public String j;
    public Function1 k;
    public t66 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ahm n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgm(ahm ahmVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = ahmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, null, this);
    }
}
