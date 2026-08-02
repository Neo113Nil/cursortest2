package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class p0m extends cg6 {
    public n8g j;
    public n8g k;
    public ArrayList l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ r0m o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0m(r0m r0mVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = r0mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(this);
    }
}
