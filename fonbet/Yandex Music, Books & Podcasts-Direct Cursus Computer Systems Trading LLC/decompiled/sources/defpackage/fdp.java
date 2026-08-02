package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fdp extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gdp s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fdp(gdp gdpVar, int i) {
        super(1);
        this.r = i;
        this.s = gdpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                rfk rfkVar = (rfk) obj;
                rfkVar.getClass();
                this.s.H(rfkVar, true);
                return Unit.a;
            default:
                sdk sdkVar = (sdk) obj;
                sdkVar.getClass();
                rn5 rn5Var = this.s.y;
                if (rn5Var == null) {
                    Intrinsics.j("mediator");
                    throw null;
                }
                ly6 ly6Var = (ly6) rn5Var.e;
                if (ly6Var != null) {
                    ly6Var.setPaymentApi(sdkVar);
                    ly6Var.a();
                }
                return Unit.a;
        }
    }
}
