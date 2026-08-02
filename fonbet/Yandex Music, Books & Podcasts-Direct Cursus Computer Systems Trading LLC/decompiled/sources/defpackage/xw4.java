package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class xw4 extends cg6 {
    public Integer j;
    public lja k;
    public Set l;
    public atn m;
    public /* synthetic */ Object n;
    public final /* synthetic */ yx4 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw4(yx4 yx4Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = yx4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
