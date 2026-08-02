package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sf9 extends vf9 {
    public final String a;
    public final String b;

    public sf9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf9)) {
            return false;
        }
        sf9 sf9Var = (sf9) obj;
        return jl40.l(this.a, sf9Var.a) && jl40.l(this.b, sf9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Error(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }

    public sf9() {
        this(0);
    }

    public /* synthetic */ sf9(int i) {
        this("", "");
    }
}
