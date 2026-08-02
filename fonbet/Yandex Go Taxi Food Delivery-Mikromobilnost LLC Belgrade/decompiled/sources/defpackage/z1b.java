package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z1b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public z1b(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1b)) {
            return false;
        }
        z1b z1bVar = (z1b) obj;
        return jl40.l(this.a, z1bVar.a) && jl40.l(this.b, z1bVar.b) && jl40.l(this.c, z1bVar.c) && jl40.l(this.d, z1bVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("ChatDeeplink(service=", this.a, ", orderId=", this.b, ", botGuid="), this.c, ", sourceId=", this.d, Extension.C_BRAKE);
    }

    public z1b() {
        this(null, null, null, null);
    }
}
