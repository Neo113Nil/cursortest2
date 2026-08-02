package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class vmt extends cg6 {
    public wmt j;
    public syc k;
    public Function0 l;
    public float m;
    public /* synthetic */ Object n;
    public final /* synthetic */ wmt o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmt(wmt wmtVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = wmtVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, null, this);
    }
}
