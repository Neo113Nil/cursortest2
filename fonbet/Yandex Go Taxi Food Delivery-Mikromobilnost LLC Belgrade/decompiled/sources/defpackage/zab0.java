package defpackage;

import com.ybsdk.core.analytics.generated.PfmAnalyticsItemStatePfm;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class zab0 {
    public final String a;
    public final PfmAnalyticsItemStatePfm b;

    public zab0(String str, PfmAnalyticsItemStatePfm pfmAnalyticsItemStatePfm) {
        this.a = str;
        this.b = pfmAnalyticsItemStatePfm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zab0)) {
            return false;
        }
        zab0 zab0Var = (zab0) obj;
        return this.a.equals(zab0Var.a) && this.b == zab0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PfmFilterOptionPfm(id=" + this.a + ", state=" + this.b + Extension.C_BRAKE;
    }
}
