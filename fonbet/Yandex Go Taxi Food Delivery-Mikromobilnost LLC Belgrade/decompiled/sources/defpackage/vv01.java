package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vv01 {
    public final List a;
    public final ue6 b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public vv01(List list, ue6 ue6Var, Integer num, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = ue6Var;
        this.c = num;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static vv01 a(vv01 vv01Var, ue6 ue6Var, Integer num, boolean z, boolean z2, boolean z3, int i) {
        ue6 ue6Var2 = ue6Var;
        List list = vv01Var.a;
        if ((i & 2) != 0) {
            ue6Var2 = vv01Var.b;
        }
        if ((i & 4) != 0) {
            num = vv01Var.c;
        }
        if ((i & 8) != 0) {
            z = vv01Var.d;
        }
        if ((i & 16) != 0) {
            z2 = vv01Var.e;
        }
        if ((i & 32) != 0) {
            z3 = vv01Var.f;
        }
        boolean z4 = z3;
        vv01Var.getClass();
        boolean z5 = z2;
        boolean z6 = z;
        return new vv01(list, ue6Var2, num, z6, z5, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv01)) {
            return false;
        }
        vv01 vv01Var = (vv01) obj;
        return this.a.equals(vv01Var.a) && this.b.equals(vv01Var.b) && jl40.l(this.c, vv01Var.c) && this.d == vv01Var.d && this.e == vv01Var.e && this.f == vv01Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return Boolean.hashCode(this.f) + unr0.e(unr0.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransfersDashboardState(bottomBarItems=");
        sb.append(this.a);
        sb.append(", bottomSheet=");
        sb.append(this.b);
        sb.append(", bottomSheetState=");
        sb.append(this.c);
        sb.append(", isNfcPaymentAvailable=");
        sb.append(this.d);
        sb.append(", showNfcInQrContainerUntokenizedProducts=");
        return smw0.k(", isGuidelineWidgetFit=", Extension.C_BRAKE, sb, this.e, this.f);
    }
}
