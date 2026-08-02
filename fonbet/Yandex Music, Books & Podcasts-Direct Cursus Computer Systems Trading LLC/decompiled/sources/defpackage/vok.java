package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class vok extends cg6 {
    public String j;
    public rrl k;
    public Set l;
    public /* synthetic */ Object m;
    public final /* synthetic */ epk n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vok(epk epkVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = epkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, null, this);
    }
}
