package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class kx4 extends cg6 {
    public LinkedHashMap j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yx4 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx4(yx4 yx4Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = yx4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.p(null, false, this);
    }
}
