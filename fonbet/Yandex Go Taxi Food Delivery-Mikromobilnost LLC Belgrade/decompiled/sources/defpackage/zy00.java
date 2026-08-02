package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zy00 {
    public final String a;
    public final String b;

    public zy00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy00)) {
            return false;
        }
        zy00 zy00Var = (zy00) obj;
        return jl40.l(this.a, zy00Var.a) && jl40.l(this.b, zy00Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("MassTransitDeeplink(utmSource=", this.a, ", utmMedium=", this.b, Extension.C_BRAKE);
    }

    public zy00() {
        this(null, null);
    }
}
