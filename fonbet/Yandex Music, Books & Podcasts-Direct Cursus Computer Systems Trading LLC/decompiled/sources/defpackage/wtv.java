package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class wtv extends cg6 {
    public s2w j;
    public uwv k;
    public List l;
    public String m;
    public /* synthetic */ Object n;
    public final /* synthetic */ auv o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtv(auv auvVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = auvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return auv.a(this.o, null, null, this);
    }
}
