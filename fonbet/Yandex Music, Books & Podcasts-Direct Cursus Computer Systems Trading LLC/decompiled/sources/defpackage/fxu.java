package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class fxu extends cg6 {
    public u4q j;
    public List k;
    public uxu l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hxu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxu(hxu hxuVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = hxuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return hxu.g(this.n, null, this);
    }
}
