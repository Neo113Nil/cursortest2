package defpackage;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class th31 implements di31 {
    public final SummaryExpandReason a;
    public final boolean b;

    public th31(SummaryExpandReason summaryExpandReason, boolean z) {
        this.a = summaryExpandReason;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th31)) {
            return false;
        }
        th31 th31Var = (th31) obj;
        return this.a == th31Var.a && this.b == th31Var.b;
    }

    public final int hashCode() {
        SummaryExpandReason summaryExpandReason = this.a;
        return Boolean.hashCode(this.b) + ((summaryExpandReason == null ? 0 : summaryExpandReason.hashCode()) * 31);
    }

    public final String toString() {
        return "ExpandCardByDeeplink(reason=" + this.a + ", animate=" + this.b + Extension.C_BRAKE;
    }
}
