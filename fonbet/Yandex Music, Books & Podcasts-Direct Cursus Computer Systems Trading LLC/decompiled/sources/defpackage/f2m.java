package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class f2m extends cg6 {
    public ArrayList j;
    public ArrayList k;
    public /* synthetic */ Object l;
    public final /* synthetic */ i2m m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2m(i2m i2mVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = i2mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(null, null, null, this);
    }
}
