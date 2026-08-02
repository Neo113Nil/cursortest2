package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zq implements br {
    public final String a;
    public final String b;
    public final String c;

    public zq(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.br
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq)) {
            return false;
        }
        zq zqVar = (zq) obj;
        return jl40.l(this.a, zqVar.a) && jl40.l(this.b, zqVar.b) && jl40.l(this.c, zqVar.c);
    }

    @Override // defpackage.br
    public final String getUrl() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("ShowTrackingLinkAction(url=", this.a, ", title=", this.b, ", icookie="), this.c, Extension.C_BRAKE);
    }
}
