package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class qyn extends cg6 {
    public Function1 j;
    public Function1 k;
    public Function2 l;
    public Function2 m;
    public Function2 n;
    public vqn o;
    public Object p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ryn s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyn(ryn rynVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = rynVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return ryn.a(this.s, null, null, null, null, null, this);
    }
}
