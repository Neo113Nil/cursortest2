package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class o47 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ e57 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o47(e57 e57Var, int i) {
        super(1);
        this.r = i;
        this.s = e57Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ly6 ly6Var;
        switch (this.r) {
            case 0:
                wle wleVar = (wle) obj;
                wleVar.getClass();
                e57 e57Var = this.s;
                g0c g0cVar = e57Var.l;
                qne A = gut.S0().A(null);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(A);
                x97.y(ot0.F(e57Var), null, null, new bv6(e57Var, wleVar, null, 10), 3);
                break;
            case 1:
                sdk sdkVar = (sdk) obj;
                sdkVar.getClass();
                rn5 rn5Var = this.s.x;
                if (rn5Var != null && (ly6Var = (ly6) rn5Var.e) != null) {
                    ly6Var.setPaymentApi(sdkVar);
                    ly6Var.a();
                }
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                xdr xdrVar = this.s.F;
                ycp ycpVar = new ycp(intValue);
                xdrVar.getClass();
                xdrVar.m(null, ycpVar);
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                e57 e57Var2 = this.s;
                x97.y(ot0.F(e57Var2), null, null, new bv6(e57Var2, str, null, 12), 3);
                break;
            case 4:
                kpo kpoVar = (kpo) obj;
                kpoVar.getClass();
                e57 e57Var3 = this.s;
                mfk mfkVar = e57Var3.B;
                if (mfkVar != null) {
                    x97.y(ot0.F(e57Var3), null, null, new rc4(e57Var3, kpoVar, mfkVar, null, 29), 3);
                }
                break;
            default:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                xdr xdrVar2 = this.s.F;
                tcp tcpVar = new tcp(bfkVar);
                xdrVar2.getClass();
                xdrVar2.m(null, tcpVar);
                break;
        }
        return Unit.a;
    }
}
