package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qj6 extends dbb1 {
    public static final qj6 f = new qj6(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public qj6(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj6)) {
            return false;
        }
        qj6 qj6Var = (qj6) obj;
        return jl40.l(this.a, qj6Var.a) && jl40.l(this.b, qj6Var.b) && jl40.l(this.c, qj6Var.c) && jl40.l(this.d, qj6Var.d) && jl40.l(this.e, qj6Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DestinationPin(text=", this.a, ", hint=", this.b, ", iconTag=");
        g8e.D(v, this.c, ", iconForegroundColor=", this.d, ", iconBackgroundColor=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public qj6() {
        this(0);
    }

    public /* synthetic */ qj6(int i) {
        this("", "", "", null, null);
    }
}
