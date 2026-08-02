package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wpc {
    public static final wpc c = new wpc((fqc) null, 3);
    public final fqc a;
    public final String b;

    public /* synthetic */ wpc(fqc fqcVar, int i) {
        this((i & 1) != 0 ? bqc.e : fqcVar, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpc)) {
            return false;
        }
        wpc wpcVar = (wpc) obj;
        return jl40.l(this.a, wpcVar.a) && jl40.l(this.b, wpcVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Payload(source=" + this.a + ", botGuid=" + this.b + Extension.C_BRAKE;
    }

    public wpc(fqc fqcVar, String str) {
        this.a = fqcVar;
        this.b = str;
    }

    public wpc() {
        this((fqc) null, 3);
    }
}
