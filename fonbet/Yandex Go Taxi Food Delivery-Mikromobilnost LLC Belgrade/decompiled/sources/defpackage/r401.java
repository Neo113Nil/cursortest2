package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r401 {
    public final String a;
    public final c501 b;

    public r401(String str, c501 c501Var) {
        this.a = str;
        this.b = c501Var;
    }

    public final c501 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r401)) {
            return false;
        }
        r401 r401Var = (r401) obj;
        return jl40.l(this.a, r401Var.a) && jl40.l(this.b, r401Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c501 c501Var = this.b;
        return hashCode + (c501Var == null ? 0 : c501Var.hashCode());
    }

    public final String toString() {
        return "CurrentStatus(imageUrl=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
