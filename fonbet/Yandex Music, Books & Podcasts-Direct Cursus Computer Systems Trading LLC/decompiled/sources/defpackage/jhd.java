package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class jhd extends cg6 {
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ohd l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhd(ohd ohdVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = ohdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return ohd.a(this.l, null, null, this);
    }
}
