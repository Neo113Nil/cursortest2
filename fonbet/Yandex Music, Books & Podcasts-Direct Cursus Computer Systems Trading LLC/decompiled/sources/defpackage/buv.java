package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class buv extends cg6 {
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dxr l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buv(dxr dxrVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = dxrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
