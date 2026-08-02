package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class znb {
    public final int a;
    public final String b;
    public final wib c;
    public final wib d;

    public znb(int i, String str, wib wibVar, wib wibVar2) {
        this.a = i;
        this.b = str;
        this.c = wibVar;
        this.d = wibVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znb)) {
            return false;
        }
        znb znbVar = (znb) obj;
        return this.a == znbVar.a && jl40.l(this.b, znbVar.b) && this.c.equals(znbVar.c) && this.d.equals(znbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "CurrentRequiredInfo(fillOrder=", ", text=", this.b, ", autoOpenAction=");
        v.append(this.c);
        v.append(", userTapAction=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
