package defpackage;

import com.yandex.passport.internal.impl.q0;
import com.yandex.passport.internal.properties.m;

/* loaded from: classes3.dex */
public final class zdq extends cg6 {
    public m j;
    public m k;
    public m l;
    public q0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ lum o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdq(lum lumVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = lumVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.S(this);
    }
}
