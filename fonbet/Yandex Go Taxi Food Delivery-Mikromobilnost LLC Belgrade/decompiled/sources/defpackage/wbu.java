package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wbu {
    public final String a;
    public final String b;
    public final v4v c;
    public final String d;

    public wbu(String str, String str2, lvi0 lvi0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = lvi0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbu)) {
            return false;
        }
        wbu wbuVar = (wbu) obj;
        return this.a.equals(wbuVar.a) && jl40.l(this.b, wbuVar.b) && jl40.l(this.c, wbuVar.c) && jl40.l(this.d, wbuVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        v4v v4vVar = this.c;
        int hashCode3 = (hashCode2 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("HeaderState(title=", this.a, ", subtitle=", this.b, ", iconModel=");
        v.append(this.c);
        v.append(", trailButtonText=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
