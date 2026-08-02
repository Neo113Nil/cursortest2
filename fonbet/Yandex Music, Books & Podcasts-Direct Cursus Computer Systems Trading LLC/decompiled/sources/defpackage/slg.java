package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class slg extends cg6 {
    public long j;
    public String k;
    public List l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ xlg p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slg(xlg xlgVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = xlgVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return xlg.d(this.p, 0L, null, this);
    }
}
