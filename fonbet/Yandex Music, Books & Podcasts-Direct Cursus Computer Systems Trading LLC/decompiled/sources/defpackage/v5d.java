package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class v5d implements Function1 {
    public final /* synthetic */ w4k a;
    public final /* synthetic */ long b;

    public v5d(w4k w4kVar, long j) {
        this.a = w4kVar;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jpa jpaVar = (jpa) obj;
        jpaVar.getClass();
        mu3 s = jpaVar.q0().s();
        s.m(ywf.d(0L, jpaVar.e()), hld.p());
        w4k.h(this.a, jpaVar, jpaVar.e(), new d43(this.b, 5), 2);
        s.k();
        return Unit.a;
    }
}
