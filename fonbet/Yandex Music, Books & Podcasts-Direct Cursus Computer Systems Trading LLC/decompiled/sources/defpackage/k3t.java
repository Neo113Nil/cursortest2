package defpackage;

/* loaded from: classes3.dex */
public final class k3t extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ tf7 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3t(tf7 tf7Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = tf7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return tf7.h(this.k, null, this);
    }
}
