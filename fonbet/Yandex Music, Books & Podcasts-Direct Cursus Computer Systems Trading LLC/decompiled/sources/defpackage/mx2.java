package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class mx2 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mx2(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                rx2 rx2Var = (rx2) this.c;
                hq5 hq5Var = (hq5) obj3;
                int d = eta.d((Integer) obj4, (ua5) obj, (sai) obj2);
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(d & 1, (d & 129) != 128)) {
                    Unit unit = Unit.a;
                    boolean h = oq5Var.h(rx2Var);
                    Object K = oq5Var.K();
                    if (h || K == gq5.a) {
                        K = new ox2(rx2Var, null, 0);
                        oq5Var.k0(K);
                    }
                    gld.w(oq5Var, unit, (Function2) K);
                    up6.e(rx2Var, this.b, false, oq5Var, 384);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ltu ltuVar = (ltu) this.c;
                onu onuVar = (onu) obj2;
                hq5 hq5Var2 = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((dh3) obj).getClass();
                onuVar.getClass();
                if ((intValue & 48) == 0) {
                    intValue |= ((oq5) hq5Var2).d(onuVar.ordinal()) ? 32 : 16;
                }
                int i = intValue;
                if ((i & 145) == 144) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean h2 = oq5Var3.h(ltuVar);
                Object K2 = oq5Var3.K();
                if (h2 || K2 == gq5.a) {
                    K2 = new j6u(0, ltuVar, ltu.class, "launchFallbackWave", "launchFallbackWave()V", 0, 24);
                    oq5Var3.k0(K2);
                }
                u1g.p((Function0) ((h9f) K2), this.b, onuVar, d.c(vci.a, 1.0f), null, null, oq5Var3, ((i << 3) & 896) | 3072, 48);
                break;
        }
        return Unit.a;
    }
}
