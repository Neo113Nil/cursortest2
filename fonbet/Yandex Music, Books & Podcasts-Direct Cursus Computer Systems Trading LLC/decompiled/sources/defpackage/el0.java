package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class el0 extends uif implements Function1 {
    public final /* synthetic */ gl0 r;
    public final /* synthetic */ ksk s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(gl0 gl0Var, ksk kskVar, long j) {
        super(1);
        this.r = gl0Var;
        this.s = kskVar;
        this.t = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g40 g40Var = this.r.r.b;
        jsk.f((jsk) obj, this.s, g40Var.a((r0.b & 4294967295L) | (r0.a << 32), this.t, xof.a));
        return Unit.a;
    }
}
