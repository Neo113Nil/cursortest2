package defpackage;

import java.util.HashSet;
import java.util.List;

/* loaded from: classes4.dex */
public final class vtl extends cg6 {
    public String j;
    public nvl k;
    public Integer l;
    public List m;
    public cvl n;
    public List o;
    public HashSet p;
    public /* synthetic */ Object q;
    public final /* synthetic */ xtl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtl(xtl xtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = xtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.c(null, null, null, null, this);
    }
}
