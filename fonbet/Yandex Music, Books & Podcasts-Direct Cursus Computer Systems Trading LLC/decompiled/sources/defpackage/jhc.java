package defpackage;

import kotlin.collections.IndexedValue;

/* loaded from: classes.dex */
public final class jhc extends cg6 {
    public x0 j;
    public IndexedValue k;
    public qqi l;
    public /* synthetic */ Object m;
    public final /* synthetic */ x0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhc(x0 x0Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = x0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.Y(null, this);
    }
}
