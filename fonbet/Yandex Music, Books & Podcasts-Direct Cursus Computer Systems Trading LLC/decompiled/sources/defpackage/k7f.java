package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class k7f extends cg6 {
    public kh7 j;
    public e0 k;
    public LinkedHashMap l;
    public String m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ e0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7f(e0 e0Var, kq2 kq2Var) {
        super(kq2Var);
        this.p = e0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return e0.d(this.p, null, this);
    }
}
