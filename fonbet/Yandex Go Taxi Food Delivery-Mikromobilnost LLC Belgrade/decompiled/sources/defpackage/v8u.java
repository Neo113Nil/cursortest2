package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v8u {
    public final String a;
    public final String b;
    public final wp2 c;

    public v8u(String str, String str2, wp2 wp2Var) {
        this.a = str;
        this.b = str2;
        this.c = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8u)) {
            return false;
        }
        v8u v8uVar = (v8u) obj;
        return jl40.l(this.a, v8uVar.a) && jl40.l(this.b, v8uVar.b) && jl40.l(this.c, v8uVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        wp2 wp2Var = this.c;
        return hashCode2 + (wp2Var != null ? wp2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Header(title=", this.a, ", subtitle=", this.b, ", textColor=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public v8u() {
        this(null, null, null);
    }
}
