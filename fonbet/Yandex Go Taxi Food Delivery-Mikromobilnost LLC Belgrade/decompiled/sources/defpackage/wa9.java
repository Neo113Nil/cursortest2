package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wa9 implements xa9 {
    public final String a;
    public final String b;

    public wa9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa9)) {
            return false;
        }
        wa9 wa9Var = (wa9) obj;
        return jl40.l(this.a, wa9Var.a) && this.b.equals(wa9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Success(orderId=", this.a, ", changeId=", this.b, Extension.C_BRAKE);
    }
}
