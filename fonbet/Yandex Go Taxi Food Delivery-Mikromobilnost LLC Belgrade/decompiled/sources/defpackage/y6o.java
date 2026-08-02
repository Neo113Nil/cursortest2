package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y6o {
    public final String a;
    public final String b;
    public final String c;

    public y6o(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6o)) {
            return false;
        }
        y6o y6oVar = (y6o) obj;
        return jl40.l(this.a, y6oVar.a) && jl40.l(this.b, y6oVar.b) && jl40.l(this.c, y6oVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("ErrorDialog(text=", this.a, ", title=", this.b, ", buttonText="), this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ y6o(String str) {
        this(str, null, null);
    }
}
