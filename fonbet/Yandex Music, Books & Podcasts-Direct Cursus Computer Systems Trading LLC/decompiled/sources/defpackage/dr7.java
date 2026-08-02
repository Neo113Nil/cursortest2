package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class dr7 extends cg6 {
    public List j;
    public fyu k;
    public List l;
    public oqi m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ kr7 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr7(kr7 kr7Var, cg6 cg6Var) {
        super(cg6Var);
        this.r = kr7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.o(null, null, null, 0, 0, this);
    }
}
