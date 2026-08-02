package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class rou extends cg6 {
    public List j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uou n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rou(uou uouVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = uouVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
