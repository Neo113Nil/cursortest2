package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class afl extends cg6 {
    public vbn j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ efl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afl(efl eflVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = eflVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return efl.a(this.m, null, null, this);
    }
}
