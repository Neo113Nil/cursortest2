package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class lvr extends cg6 {
    public nvr j;
    public Map k;
    public float l;
    public /* synthetic */ Object m;
    public final /* synthetic */ nvr n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvr(nvr nvrVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = nvrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, null, this);
    }
}
