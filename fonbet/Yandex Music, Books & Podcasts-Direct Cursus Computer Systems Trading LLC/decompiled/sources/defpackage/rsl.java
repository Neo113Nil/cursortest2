package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class rsl extends cg6 {
    public String j;
    public Integer k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ btl n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsl(btl btlVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = btlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return btl.b(this.n, null, null, null, null, this);
    }
}
