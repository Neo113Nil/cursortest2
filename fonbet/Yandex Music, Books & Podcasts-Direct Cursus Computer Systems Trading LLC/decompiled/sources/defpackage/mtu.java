package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class mtu implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ltu b;

    public /* synthetic */ mtu(ltu ltuVar, int i) {
        this.a = i;
        this.b = ltuVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        spd spdVar;
        spd spdVar2;
        dh3 dh3Var = (dh3) obj;
        switch (this.a) {
            case 0:
                ihv ihvVar = (ihv) obj2;
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                dh3Var.getClass();
                ihvVar.getClass();
                if ((intValue & 48) == 0) {
                    intValue |= ((oq5) hq5Var).d(ihvVar.ordinal()) ? 32 : 16;
                }
                if ((intValue & 145) == 144) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                rzf.p(this.b.i, null, ihvVar, false, hq5Var, (intValue << 3) & 896, 10);
            case 1:
                ihv ihvVar2 = (ihv) obj2;
                hq5 hq5Var2 = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                dh3Var.getClass();
                ihvVar2.getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((oq5) hq5Var2).d(ihvVar2.ordinal()) ? 32 : 16;
                }
                if ((intValue2 & 145) == 144) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                rzf.p(this.b.i, d.c(vci.a, 1.0f), ihvVar2, false, hq5Var2, ((intValue2 << 3) & 896) | 3120, 0);
            case 2:
                ihv ihvVar3 = (ihv) obj2;
                hq5 hq5Var3 = (hq5) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                dh3Var.getClass();
                ihvVar3.getClass();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((oq5) hq5Var3).d(ihvVar3.ordinal()) ? 32 : 16;
                }
                if ((intValue3 & 145) == 144) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                int ordinal = ihvVar3.ordinal();
                if (ordinal == 0) {
                    spdVar = new spd(0, 2, 2);
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    spdVar = new spd(1, 0, 1);
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                ltu ltuVar = this.b;
                boolean f = oq5Var4.f(ltuVar);
                Object K = oq5Var4.K();
                if (f || K == gq5.a) {
                    K = ltuVar.b(spdVar);
                    oq5Var4.k0(K);
                }
                rzf.q((xjv) K, ltuVar.i, ltuVar.k, null, ihvVar3, oq5Var4, (intValue3 << 9) & 57344);
                break;
            default:
                ihv ihvVar4 = (ihv) obj2;
                hq5 hq5Var4 = (hq5) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                dh3Var.getClass();
                ihvVar4.getClass();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((oq5) hq5Var4).d(ihvVar4.ordinal()) ? 32 : 16;
                }
                if ((intValue4 & 145) == 144) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                int ordinal2 = ihvVar4.ordinal();
                if (ordinal2 == 0) {
                    spdVar2 = new spd(0, 2, 2);
                } else if (ordinal2 != 1) {
                    b6e.s();
                    break;
                } else {
                    spdVar2 = new spd(1, 0, 1);
                }
                oq5 oq5Var6 = (oq5) hq5Var4;
                ltu ltuVar2 = this.b;
                boolean f2 = oq5Var6.f(ltuVar2);
                Object K2 = oq5Var6.K();
                if (f2 || K2 == gq5.a) {
                    K2 = ltuVar2.b(spdVar2);
                    oq5Var6.k0(K2);
                }
                rzf.q((xjv) K2, ltuVar2.i, ltuVar2.k, null, ihvVar4, oq5Var6, (intValue4 << 9) & 57344);
                break;
        }
        return Unit.a;
    }
}
