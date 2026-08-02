package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.PartnerSelectionSavingState;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sst0 {
    public final PartnerSelectionSavingState a;
    public final rst0 b;
    public final ThemedImageUrlEntity c;
    public final List d;
    public final boolean e;

    public sst0(PartnerSelectionSavingState partnerSelectionSavingState, rst0 rst0Var, ThemedImageUrlEntity themedImageUrlEntity, List list, boolean z) {
        this.a = partnerSelectionSavingState;
        this.b = rst0Var;
        this.c = themedImageUrlEntity;
        this.d = list;
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    public static sst0 a(sst0 sst0Var, PartnerSelectionSavingState partnerSelectionSavingState, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            partnerSelectionSavingState = sst0Var.a;
        }
        PartnerSelectionSavingState partnerSelectionSavingState2 = partnerSelectionSavingState;
        rst0 rst0Var = sst0Var.b;
        ThemedImageUrlEntity themedImageUrlEntity = sst0Var.c;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = sst0Var.d;
        }
        ArrayList arrayList3 = arrayList2;
        boolean z = (i & 16) != 0 ? sst0Var.e : false;
        sst0Var.getClass();
        return new sst0(partnerSelectionSavingState2, rst0Var, themedImageUrlEntity, arrayList3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sst0)) {
            return false;
        }
        sst0 sst0Var = (sst0) obj;
        return this.a == sst0Var.a && jl40.l(this.b, sst0Var.b) && jl40.l(this.c, sst0Var.c) && this.d.equals(sst0Var.d) && this.e == sst0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rst0 rst0Var = this.b;
        return Boolean.hashCode(this.e) + unr0.c(xvz.c(this.c, (hashCode + (rst0Var == null ? 0 : rst0Var.hashCode())) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitDepositAutoTopupStatusState(partnerSelectionSavingState=");
        sb.append(this.a);
        sb.append(", statusScreen=");
        sb.append(this.b);
        sb.append(", selectedPaymentMethodLogo=");
        sb.append(this.c);
        sb.append(", divkitLocalVariables=");
        sb.append(this.d);
        sb.append(", shouldAnimateStatusIcon=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
