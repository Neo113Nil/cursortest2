package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class e2m extends cg6 {
    public ArrayList j;
    public i2m k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ i2m n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2m(i2m i2mVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = i2mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.j(null, 0L, null, this);
    }
}
