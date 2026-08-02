package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class cy4 extends cg6 {
    public int j;
    public int k;
    public int l;
    public ArrayList m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ey4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy4(ey4 ey4Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = ey4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(0, this);
    }
}
