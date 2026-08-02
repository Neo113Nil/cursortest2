package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class lsl extends cg6 {
    public List j;
    public Set k;
    public Set l;
    public List m;
    public boolean n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ nsl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsl(nsl nslVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = nslVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(null, false, this);
    }
}
