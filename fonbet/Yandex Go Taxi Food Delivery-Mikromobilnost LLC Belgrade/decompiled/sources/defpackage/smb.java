package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class smb implements cnb {
    public final String a;
    public final String b;
    public final akb c;

    public smb(String str, String str2, akb akbVar) {
        this.a = str;
        this.b = str2;
        this.c = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smb)) {
            return false;
        }
        smb smbVar = (smb) obj;
        return jl40.l(this.a, smbVar.a) && jl40.l(this.b, smbVar.b) && this.c.equals(smbVar.c);
    }

    @Override // defpackage.cnb
    public final snb getAnalytics() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MosmetroAuthRequired(tripId=", this.a, ", requestId=", this.b, ", analytics=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
