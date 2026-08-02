package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class tz4 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz4 b;

    public /* synthetic */ tz4(yz4 yz4Var, int i) {
        this.a = i;
        this.b = yz4Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                xdr xdrVar = this.b.t;
                qz4 qz4Var = new qz4((List) obj);
                xdrVar.getClass();
                xdrVar.m(null, qz4Var);
                break;
            case 1:
                yz4 yz4Var = this.b;
                rhp rhpVar = yz4Var.q;
                xdr xdrVar2 = yz4Var.w;
                int ordinal = ((u0j) obj).ordinal();
                Continuation continuation2 = null;
                if (ordinal == 0) {
                    Boolean bool = Boolean.FALSE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool);
                    rar y = x97.y(ot0.F(yz4Var), null, null, new vz4(yz4Var, continuation2, 2), 3);
                    rhpVar.getClass();
                    rhpVar.c(y);
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool2);
                    rar y2 = x97.y(ot0.F(yz4Var), null, null, new vz4(yz4Var, continuation2, 3), 3);
                    rhpVar.getClass();
                    rhpVar.c(y2);
                }
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                xdr xdrVar3 = this.b.z;
                xdrVar3.getClass();
                xdrVar3.m(null, bool3);
                break;
        }
        return Unit.a;
    }
}
