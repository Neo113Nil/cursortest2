package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class shg {
    public final List a;
    public final int b;
    public final long c;
    public final boolean d;

    public shg(int i, long j, List list, boolean z) {
        this.a = list;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shg)) {
            return false;
        }
        shg shgVar = (shg) obj;
        return jl40.l(this.a, shgVar.a) && this.b == shgVar.b && this.c == shgVar.c && this.d == shgVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qv10.c(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "DashboardCacheConfig(enabledFor=" + this.a + ", version=" + this.b + ", slowUpdateNoticeDelayMs=" + this.c + ", postponeScreenAnimationEnabled=" + this.d + Extension.C_BRAKE;
    }
}
