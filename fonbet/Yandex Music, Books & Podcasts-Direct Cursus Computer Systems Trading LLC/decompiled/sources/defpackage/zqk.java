package defpackage;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class zqk extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ g8c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqk(g8c g8cVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = g8cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Serializable s = this.k.s(null, this);
        return s == nm6.a ? s : new z7o(s);
    }
}
