package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s9e {
    public final String a;
    public final String b;

    public s9e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9e)) {
            return false;
        }
        s9e s9eVar = (s9e) obj;
        return jl40.l(this.a, s9eVar.a) && jl40.l(this.b, s9eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Contact(name=", this.a, ", phone=", this.b, Extension.C_BRAKE);
    }

    public /* synthetic */ s9e(int i) {
        this("", "");
    }

    public s9e() {
        this(0);
    }
}
