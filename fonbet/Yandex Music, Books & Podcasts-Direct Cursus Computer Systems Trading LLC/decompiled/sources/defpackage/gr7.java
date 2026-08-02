package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class gr7 extends cg6 {
    public boolean j;
    public gxj k;
    public List l;
    public oqi m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ kr7 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr7(kr7 kr7Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = kr7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.r(false, null, null, this);
    }
}
