package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class u0h implements wu1 {
    public final String a;
    public final String b;

    public u0h(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.wu1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0h)) {
            return false;
        }
        u0h u0hVar = (u0h) obj;
        return jl40.l(this.a, u0hVar.a) && this.b.equals(u0hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DeeplinkGroup(alternativeType=", this.a, ", deeplink=", this.b, Extension.C_BRAKE);
    }
}
