package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class hx4 extends cg6 {
    public vhn j;
    public Boolean k;
    public Integer l;
    public Map m;
    public Map n;
    public Set o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ yx4 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx4(yx4 yx4Var, cg6 cg6Var) {
        super(cg6Var);
        this.r = yx4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.l(null, null, null, null, false, this);
    }
}
