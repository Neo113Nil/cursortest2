package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class sq7 extends cg6 {
    public List j;
    public oqi k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ kr7 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq7(kr7 kr7Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = kr7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
