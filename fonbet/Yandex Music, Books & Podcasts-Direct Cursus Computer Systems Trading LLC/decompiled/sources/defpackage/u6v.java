package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u6v extends cg6 {
    public vbn j;
    public Map k;
    public List l;
    public List m;
    public List n;
    public qj6 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ z6v q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6v(z6v z6vVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = z6vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return z6v.b(this.q, null, null, this);
    }
}
