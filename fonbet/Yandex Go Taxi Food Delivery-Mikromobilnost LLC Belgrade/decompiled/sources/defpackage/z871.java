package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.hm2;

/* loaded from: classes7.dex */
public final class z871 {
    public final hm2 a;
    public final hm2 b;
    public final hm2 c;
    public final hm2 d;

    public z871(hm2 hm2Var, hm2 hm2Var2, hm2 hm2Var3, hm2 hm2Var4) {
        this.a = hm2Var;
        this.b = hm2Var2;
        this.c = hm2Var3;
        this.d = hm2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z871)) {
            return false;
        }
        z871 z871Var = (z871) obj;
        return this.a == z871Var.a && this.b == z871Var.b && this.c == z871Var.c && this.d == z871Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.a + ", impressionTrackingStartReportType=" + this.b + ", impressionTrackingFailureReportType=" + this.c + ", forcedImpressionTrackingFailureReportType=" + this.d + Extension.C_BRAKE;
    }
}
