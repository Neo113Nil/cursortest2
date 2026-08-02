package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zyr0 {
    public final String a;
    public final Map b;

    public zyr0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyr0)) {
            return false;
        }
        zyr0 zyr0Var = (zyr0) obj;
        return jl40.l(this.a, zyr0Var.a) && jl40.l(this.b, zyr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("ShortcutCommunicationAnalyticsData(creativeId=", this.a, ", analyticsPayload=", Extension.C_BRAKE, this.b);
    }
}
