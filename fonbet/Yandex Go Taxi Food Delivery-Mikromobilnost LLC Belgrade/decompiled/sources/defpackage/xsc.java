package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xsc {
    public final String a;
    public final String b;
    public final esc c;

    public xsc(String str, String str2, esc escVar) {
        this.a = str;
        this.b = str2;
        this.c = escVar;
    }

    public final String a() {
        return this.a;
    }

    public final esc b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsc)) {
            return false;
        }
        xsc xscVar = (xsc) obj;
        return jl40.l(this.a, xscVar.a) && jl40.l(this.b, xscVar.b) && jl40.l(this.c, xscVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        esc escVar = this.c;
        return hashCode2 + (escVar != null ? Boolean.hashCode(escVar.a) : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CommunicationPriorityInfo(communicationId=", this.a, ", ownerScreen=", this.b, ", interactionInfo=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
