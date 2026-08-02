package defpackage;

import java.io.File;

/* loaded from: classes6.dex */
public final class gwp extends cg6 {
    public File j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ owp n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwp(owp owpVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = owpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, null, null, this);
    }
}
