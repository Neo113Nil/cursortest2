package defpackage;

import java.util.Map;

/* loaded from: classes4.dex */
public final class okj extends cg6 {
    public String j;
    public Map k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qkj m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okj(qkj qkjVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = qkjVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
