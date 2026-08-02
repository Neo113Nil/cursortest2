package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class eof extends cg6 {
    public se5 j;
    public List k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ mvn o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eof(mvn mvnVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = mvnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.z(null, null, this);
    }
}
