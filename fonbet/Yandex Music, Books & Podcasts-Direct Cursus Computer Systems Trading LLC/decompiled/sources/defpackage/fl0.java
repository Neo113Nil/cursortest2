package defpackage;

import androidx.compose.animation.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fl0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gl0 s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl0(gl0 gl0Var, long j, int i) {
        super(1);
        this.r = i;
        this.s = gl0Var;
        this.t = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        wdc wdcVar;
        long j2;
        switch (this.r) {
            case 0:
                x7t x7tVar = (x7t) obj;
                Object b = x7tVar.b();
                gl0 gl0Var = this.s;
                if (Intrinsics.d(b, gl0Var.r.b())) {
                    j = hqe.a(gl0Var.s, a.a) ? this.t : gl0Var.s;
                } else {
                    sdr sdrVar = (sdr) gl0Var.r.d.g(x7tVar.b());
                    j = sdrVar != null ? ((hqe) sdrVar.getValue()).a : 0L;
                }
                sdr sdrVar2 = (sdr) gl0Var.r.d.g(x7tVar.a());
                long j3 = sdrVar2 != null ? ((hqe) sdrVar2.getValue()).a : 0L;
                dnq dnqVar = (dnq) gl0Var.q.getValue();
                return (dnqVar == null || (wdcVar = (wdc) dnqVar.b.invoke(new hqe(j), new hqe(j3))) == null) ? weo.Q(0.0f, 400.0f, null, 5) : wdcVar;
            default:
                gl0 gl0Var2 = this.s;
                if (Intrinsics.d(obj, gl0Var2.r.b())) {
                    j2 = hqe.a(gl0Var2.s, a.a) ? this.t : gl0Var2.s;
                } else {
                    sdr sdrVar3 = (sdr) gl0Var2.r.d.g(obj);
                    j2 = sdrVar3 != null ? ((hqe) sdrVar3.getValue()).a : 0L;
                }
                return new hqe(j2);
        }
    }
}
