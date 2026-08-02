package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class kiv implements pyc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xjv b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ihv e;

    public /* synthetic */ kiv(xjv xjvVar, boolean z, boolean z2, ihv ihvVar) {
        this.b = xjvVar;
        this.c = z;
        this.d = z2;
        this.e = ihvVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ikv ikvVar = (ikv) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ikvVar.getClass();
                boolean z = ikvVar instanceof gkv;
                vci vciVar = vci.a;
                boolean z2 = this.c;
                ihv ihvVar = this.e;
                if (z) {
                    oq5 oq5Var = (oq5) hq5Var;
                    oq5Var.Z(-587611521);
                    rzf.p(z2, d.c(vciVar, 1.0f), ihvVar, false, oq5Var, 48, 8);
                    oq5Var.p(false);
                } else {
                    if (!(ikvVar instanceof hkv)) {
                        throw vz1.i((oq5) hq5Var, 1505063497, false);
                    }
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-587331126);
                    oq5Var2.W(1505075152, ikvVar);
                    wiv.a((hkv) ikvVar, this.b, z2, this.d, d.c(vciVar, 1.0f), ihvVar, oq5Var2, (intValue & 14) | 24576);
                    oq5Var2.p(false);
                    oq5Var2.p(false);
                }
                return Unit.a;
            default:
                sdr sdrVar = (sdr) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                sdrVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(sdrVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                wiv.d(this.b, sdrVar, this.c, this.d, vci.a, this.e, hq5Var2, ((intValue2 << 3) & 112) | 24576);
                return Unit.a;
        }
    }

    public /* synthetic */ kiv(boolean z, ihv ihvVar, xjv xjvVar, boolean z2) {
        this.c = z;
        this.e = ihvVar;
        this.b = xjvVar;
        this.d = z2;
    }
}
