package defpackage;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class z3u extends cg6 {
    public String j;
    public Collection k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b4u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3u(b4u b4uVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = b4uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(null, null, null, this);
    }
}
