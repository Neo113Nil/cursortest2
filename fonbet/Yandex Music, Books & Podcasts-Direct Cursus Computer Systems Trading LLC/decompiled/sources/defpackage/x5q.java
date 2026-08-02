package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class x5q extends cg6 {
    public Set j;
    public Set k;
    public Map l;
    public /* synthetic */ Object m;
    public final /* synthetic */ y5q n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5q(y5q y5qVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = y5qVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return y5q.b(this.n, null, null, null, this);
    }
}
