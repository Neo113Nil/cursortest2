package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class twr {
    public final String a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public twr(int i, long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twr)) {
            return false;
        }
        twr twrVar = (twr) obj;
        return jl40.l(this.a, twrVar.a) && jl40.l(this.b, twrVar.b) && this.c == twrVar.c && this.d == twrVar.d && this.e == twrVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + oyr.b(this.d, qv10.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("FolderItem(id=", this.a, ", name=", this.b, ", organizationId=");
        vfc.y(v, this.c, ", sortOrder=", this.d);
        return xra1.a(v, ", isSelected=", this.e, Extension.C_BRAKE);
    }
}
