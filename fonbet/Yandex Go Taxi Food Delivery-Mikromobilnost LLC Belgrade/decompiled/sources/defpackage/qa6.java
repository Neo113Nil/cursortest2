package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qa6 {
    public final String a;
    public final double b;

    public qa6(String str, double d) {
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa6)) {
            return false;
        }
        qa6 qa6Var = (qa6) obj;
        return jl40.l(this.a, qa6Var.a) && Double.compare(this.b, qa6Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BorderModel(color=" + this.a + ", width=" + this.b + Extension.C_BRAKE;
    }
}
