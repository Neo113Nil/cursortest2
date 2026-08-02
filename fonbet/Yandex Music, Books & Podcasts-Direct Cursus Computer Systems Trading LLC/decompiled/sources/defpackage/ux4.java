package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ux4 extends cg6 {
    public String j;
    public String k;
    public Boolean l;
    public Integer m;
    public Map n;
    public /* synthetic */ Object o;
    public final /* synthetic */ yx4 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux4(yx4 yx4Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = yx4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.z(null, null, null, null, this);
    }
}
