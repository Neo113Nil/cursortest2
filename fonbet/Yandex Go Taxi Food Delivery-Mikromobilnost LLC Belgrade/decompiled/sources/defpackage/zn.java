package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zn extends nr implements tv7 {
    public final String a;
    public final psc b;
    public final String c;

    public zn(String str, psc pscVar, String str2) {
        this.a = str;
        this.b = pscVar;
        this.c = str2;
    }

    @Override // defpackage.nr
    public final String b() {
        return this.c;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final psc d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        return jl40.l(this.a, znVar.a) && this.b.equals(znVar.b) && jl40.l(this.c, znVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionPerformerCall(title=");
        sb.append(this.a);
        sb.append(", communicationMethod=");
        sb.append(this.b);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
