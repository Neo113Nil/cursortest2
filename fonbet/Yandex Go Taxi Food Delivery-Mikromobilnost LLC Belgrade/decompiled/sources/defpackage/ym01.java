package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ym01 {
    public final String a;
    public final int b;

    public ym01(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym01)) {
            return false;
        }
        ym01 ym01Var = (ym01) obj;
        return this.a.equals(ym01Var.a) && this.b == ym01Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "StateAnalyticsData(suggestedReceivers=", this.a, ", totalContacts=", Extension.C_BRAKE);
    }
}
