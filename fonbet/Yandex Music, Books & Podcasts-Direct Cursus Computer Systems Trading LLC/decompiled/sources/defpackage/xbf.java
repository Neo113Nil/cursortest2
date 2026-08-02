package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class xbf extends cg6 {
    public String j;
    public Function1 k;
    public qqi l;
    public Object m;
    public qqi n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ t1f q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbf(t1f t1fVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = t1fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.Z(null, null, this);
    }
}
