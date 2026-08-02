package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class d7u extends cg6 {
    public ybu j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kpm m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7u(kpm kpmVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = kpmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.C(null, this);
    }
}
