package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rf7 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ sf7 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf7(sf7 sf7Var, int i) {
        super(1);
        this.r = i;
        this.s = sf7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                i4e i4eVar = (i4e) obj;
                d51 d51Var = d51.l;
                sf7 sf7Var = this.s;
                synchronized (d51Var) {
                }
                qht qhtVar = qht.a;
                if (!qhtVar.a()) {
                    qhtVar.b(new x8x(18, sf7Var, i4eVar));
                } else if (!Intrinsics.d(sf7Var.m.c, i4eVar)) {
                    sf7Var.c(pdr.a(sf7Var.m, false, false, i4eVar, null, null, 27));
                }
                sf7 sf7Var2 = this.s;
                sf7Var2.b.postDelayed(new jt6(14, sf7Var2, i4eVar), 5000L);
                break;
            default:
                this.s.e.c = (String) obj;
                break;
        }
        return Unit.a;
    }
}
