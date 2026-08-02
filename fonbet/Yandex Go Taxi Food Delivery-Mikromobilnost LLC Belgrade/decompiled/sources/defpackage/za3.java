package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class za3 {
    public static final za3 c = new za3("", "");
    public final String a;
    public final String b;

    public za3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za3)) {
            return false;
        }
        za3 za3Var = (za3) obj;
        return jl40.l(this.a, za3Var.a) && jl40.l(this.b, za3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Key(text=", this.a, ", sessionId=", this.b, Extension.C_BRAKE);
    }
}
