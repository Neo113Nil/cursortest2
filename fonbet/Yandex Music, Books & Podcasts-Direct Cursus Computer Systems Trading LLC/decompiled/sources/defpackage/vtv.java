package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class vtv extends cg6 {
    public LinkedHashMap j;
    public /* synthetic */ Object k;
    public final /* synthetic */ auv l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtv(auv auvVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = auvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, this);
    }
}
