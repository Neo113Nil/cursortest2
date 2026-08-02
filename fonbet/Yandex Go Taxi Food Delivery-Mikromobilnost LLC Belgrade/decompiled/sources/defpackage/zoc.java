package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class zoc {
    public final String a;
    public final String b;
    public final String c;
    public final et1 d;
    public final raj e;
    public final qc20 f;

    public zoc(String str, String str2, String str3, et1 et1Var, raj rajVar, qc20 qc20Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = et1Var;
        this.e = rajVar;
        this.f = qc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoc)) {
            return false;
        }
        zoc zocVar = (zoc) obj;
        return jl40.l(this.a, zocVar.a) && jl40.l(this.b, zocVar.b) && jl40.l(this.c, zocVar.c) && this.d.equals(zocVar.d) && jl40.l(this.e, zocVar.e) && jl40.l(this.f, zocVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31) + 1901857200) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CommonQuarkConfig(appId=", this.a, ", platform=", this.b, ", appVersion=");
        v.append(this.c);
        v.append(", quarkVersion=1.160.0, uuid=");
        v.append(this.d);
        v.append(", deviceId=");
        v.append(this.e);
        v.append(", quarkDirs=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
