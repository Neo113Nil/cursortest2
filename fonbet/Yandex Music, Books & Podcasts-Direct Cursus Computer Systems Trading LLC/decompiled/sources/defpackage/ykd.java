package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class ykd extends cg6 {
    public Object j;
    public Object k;
    public Serializable l;
    public qqi m;
    public /* synthetic */ Object n;
    public final /* synthetic */ bld o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykd(bld bldVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = bldVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, null, null, this);
    }
}
