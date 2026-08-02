package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class im0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ im0(Function2 function2, int i) {
        this.a = i;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit unit;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                this.b.invoke(hq5Var, 0);
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                Function2 function2 = this.b;
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (function2 == null) {
                    oq5Var3.Z(-1282821471);
                } else {
                    oq5Var3.Z(1898281312);
                    function2.invoke(oq5Var3, 0);
                }
                oq5Var3.p(false);
                return Unit.a;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                u1g.l(hq5Var3, d.e(vci.a, 16));
                this.b.invoke(hq5Var3, 0);
                return Unit.a;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                this.b.invoke(hq5Var4, 0);
                return Unit.a;
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                this.b.invoke(hq5Var5, 0);
                return Unit.a;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                String str = (String) obj2;
                str.getClass();
                this.b.invoke(bool, str);
                return Unit.a;
            case 6:
                hq5 hq5Var6 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (oq5Var7.P(intValue & 1, (intValue & 3) != 2)) {
                    this.b.invoke(oq5Var7, 0);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 7:
                hq5 hq5Var7 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var7;
                if (oq5Var8.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    this.b.invoke(oq5Var8, 0);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 8:
                File file = (File) obj;
                IOException iOException = (IOException) obj2;
                file.getClass();
                iOException.getClass();
                if (this.b.invoke(file, iOException) != xpj.a) {
                    return Unit.a;
                }
                throw new a9s(file, null, null, 6, null);
            case 9:
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var8;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                this.b.invoke(hq5Var8, 0);
                return Unit.a;
            case 10:
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var9;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var11 = (oq5) hq5Var9;
                int i = oq5Var11.P;
                a l = oq5Var11.l();
                yci H = vnj.H(hq5Var9, vci.a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var11.d0();
                if (oq5Var11.O) {
                    oq5Var11.k(grbVar);
                } else {
                    oq5Var11.n0();
                }
                g0g.U(hq5Var9, d, wp5.f);
                g0g.U(hq5Var9, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var11.O || !Intrinsics.d(oq5Var11.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var11, i, kb5Var);
                }
                g0g.U(hq5Var9, H, wp5.d);
                this.b.invoke(hq5Var9, 0);
                oq5Var11.p(true);
                return Unit.a;
            case 11:
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var10;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                Function2 function22 = this.b;
                if (function22 == null) {
                    oq5 oq5Var13 = (oq5) hq5Var10;
                    oq5Var13.Z(-864485174);
                    oq5Var13.p(false);
                    unit = null;
                } else {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    oq5Var14.Z(1634681367);
                    function22.invoke(oq5Var14, 0);
                    oq5Var14.p(false);
                    unit = Unit.a;
                }
                oq5 oq5Var15 = (oq5) hq5Var10;
                if (unit == null) {
                    oq5Var15.Z(1634681783);
                    vz1.B(vci.a, 12, oq5Var15, false);
                } else {
                    oq5Var15.Z(1634681039);
                    oq5Var15.p(false);
                }
                return Unit.a;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                this.b.invoke(bool2, str2);
                return Unit.a;
        }
    }
}
