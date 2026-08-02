package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class o48 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o48(int i, int i2, Function0 function0, boolean z) {
        this.a = 1;
        this.b = i;
        this.c = z;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                wn5 wn5Var = (wn5) this.d;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                int i = this.b;
                o9s o9sVar = new o9s(i);
                if (i == Integer.MIN_VALUE) {
                    o9sVar = null;
                }
                wn5Var.invoke(new o9s(o9sVar != null ? o9sVar.a : this.c ? 5 : 6), hq5Var, 0);
            case 1:
                Function0 function0 = (Function0) this.d;
                ((Integer) obj2).getClass();
                a0g.j(this.b, rvf.R(385), (hq5) obj, function0, this.c);
                break;
            case 2:
                fvf fvfVar = (fvf) this.d;
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    nx0 g = qx0.g(16);
                    int i2 = this.b;
                    boolean d = oq5Var2.d(i2);
                    Object K = oq5Var2.K();
                    if (d || K == gq5.a) {
                        K = new cv0(i2, 4);
                        oq5Var2.k0(K);
                    }
                    weo.i(null, fvfVar, null, this.c, g, null, null, false, null, (Function1) K, oq5Var2, 12607488, 357);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((qbt) this.d).e(this.c, (hq5) obj, rvf.R(this.b | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o48(wn5 wn5Var, int i, boolean z) {
        this.a = 0;
        this.d = wn5Var;
        this.b = i;
        this.c = z;
    }

    public /* synthetic */ o48(Object obj, boolean z, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = z;
        this.b = i;
    }
}
