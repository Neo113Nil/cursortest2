package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y611 implements z611 {
    public final String a;
    public final String b;

    public y611(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y611)) {
            return false;
        }
        y611 y611Var = (y611) obj;
        return jl40.l(this.a, y611Var.a) && jl40.l(this.b, y611Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ZeroValueTipsChoice(tipsType=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
