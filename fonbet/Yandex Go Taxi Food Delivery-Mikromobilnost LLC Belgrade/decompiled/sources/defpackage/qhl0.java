package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class qhl0 {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;

    public qhl0(String str, String str2, String str3, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhl0)) {
            return false;
        }
        qhl0 qhl0Var = (qhl0) obj;
        return jl40.l(this.a, qhl0Var.a) && jl40.l(this.b, qhl0Var.b) && jl40.l(this.c, qhl0Var.c) && jl40.l(this.d, qhl0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("RtmCommonInfo(hostApp=", this.a, ", metricaUuid=", this.b, ", deviceId=");
        v.append(this.c);
        v.append(", passportUid=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
