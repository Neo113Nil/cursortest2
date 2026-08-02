package defpackage;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class lc1 extends cg6 {
    public HashMap j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mc1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc1(mc1 mc1Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = mc1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(null, null, this);
    }
}
