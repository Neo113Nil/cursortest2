package defpackage;

import java.io.File;

/* loaded from: classes5.dex */
public final class lg0 extends cg6 {
    public yfx j;
    public File k;
    public File l;
    public win m;
    public /* synthetic */ Object n;
    public final /* synthetic */ yfx o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg0(yfx yfxVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = yfxVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.M(this);
    }
}
