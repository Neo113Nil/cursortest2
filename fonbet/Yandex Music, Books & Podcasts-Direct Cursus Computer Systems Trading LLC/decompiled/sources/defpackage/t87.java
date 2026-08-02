package defpackage;

import java.io.File;

/* loaded from: classes5.dex */
public final class t87 extends cg6 {
    public boolean j;
    public File k;
    public qqi l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ju0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t87(ju0 ju0Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = ju0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return ju0.c(this.n, false, this);
    }
}
