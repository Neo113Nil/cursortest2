package defpackage;

import java.util.Collection;

/* loaded from: classes5.dex */
public final class xc0 extends cg6 {
    public String j;
    public Collection k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ yc0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(yc0 yc0Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = yc0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
