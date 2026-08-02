package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class l3t extends cg6 {
    public Collection j;
    public String k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tf7 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3t(tf7 tf7Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = tf7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.i(null, this);
    }
}
