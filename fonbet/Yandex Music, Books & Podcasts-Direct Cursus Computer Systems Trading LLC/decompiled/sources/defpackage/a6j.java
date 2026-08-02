package defpackage;

import java.io.Closeable;

/* loaded from: classes4.dex */
public final class a6j extends cg6 {
    public Object j;
    public Closeable k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b6j m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6j(b6j b6jVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = b6jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return b6j.a(this.m, null, this);
    }
}
