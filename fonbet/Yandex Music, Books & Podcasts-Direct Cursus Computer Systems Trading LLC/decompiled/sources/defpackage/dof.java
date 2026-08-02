package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class dof extends cg6 {
    public oq j;
    public List k;
    public mqs l;
    public /* synthetic */ Object m;
    public final /* synthetic */ mvn n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dof(mvn mvnVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = mvnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.j(null, this, null);
    }
}
