package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class taj {
    public final Long a;
    public final String b;
    public final String c;

    public taj(String str, String str2, Long l) {
        this.a = l;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taj)) {
            return false;
        }
        taj tajVar = (taj) obj;
        return jl40.l(this.a, tajVar.a) && jl40.l(this.b, tajVar.b) && jl40.l(this.c, tajVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceIdData(uid=");
        sb.append(this.a);
        sb.append(", metricaDeviceId=");
        sb.append(this.b);
        sb.append(", ownDeviceId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
