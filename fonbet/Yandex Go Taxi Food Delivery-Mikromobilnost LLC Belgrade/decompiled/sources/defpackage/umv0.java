package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes10.dex */
public final class umv0 {
    public final SummaryPromotionsResponse a;
    public final boolean b;

    public umv0(SummaryPromotionsResponse summaryPromotionsResponse, boolean z) {
        this.a = summaryPromotionsResponse;
        this.b = z;
    }

    public static umv0 a(umv0 umv0Var, SummaryPromotionsResponse summaryPromotionsResponse, int i) {
        if ((i & 1) != 0) {
            summaryPromotionsResponse = umv0Var.a;
        }
        return new umv0(summaryPromotionsResponse, (i & 2) != 0 ? umv0Var.b : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umv0)) {
            return false;
        }
        umv0 umv0Var = (umv0) obj;
        return jl40.l(this.a, umv0Var.a) && this.b == umv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SummaryPromotionsInfoDto(response=" + this.a + ", isDataLoading=" + this.b + Extension.C_BRAKE;
    }
}
