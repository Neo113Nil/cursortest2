package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class prt extends cg6 {
    public cv0 j;
    public Function1 k;
    public yxc l;
    public qqi m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ urt p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prt(urt urtVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = urtVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.h(null, false, this);
    }
}
