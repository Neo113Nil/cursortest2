package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class ysl extends cg6 {
    public String j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ btl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysl(btl btlVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = btlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return btl.c(this.m, null, null, this);
    }
}
