package defpackage;

import com.yandex.passport.api.z1;

/* loaded from: classes3.dex */
public final class stg extends cg6 {
    public boolean j;
    public z1 k;
    public Object l;
    public yxc m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ hgp p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stg(hgp hgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = hgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return hgp.a(this.p, false, null, this);
    }
}
