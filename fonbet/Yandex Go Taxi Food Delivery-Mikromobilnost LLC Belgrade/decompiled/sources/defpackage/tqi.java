package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tqi {
    public final uqi a;
    public final String b;
    public final String c;
    public final String d;

    public tqi(uqi uqiVar, String str, String str2, String str3) {
        this.a = uqiVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqi)) {
            return false;
        }
        tqi tqiVar = (tqi) obj;
        return this.a.equals(tqiVar.a) && jl40.l(this.b, tqiVar.b) && jl40.l(this.c, tqiVar.c) && jl40.l(this.d, tqiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Postcard(content=");
        sb.append(this.a);
        sb.append(", cellTitle=");
        sb.append(this.b);
        sb.append(", text=");
        return g8e.r(sb, this.c, ", status=", this.d, Extension.C_BRAKE);
    }
}
