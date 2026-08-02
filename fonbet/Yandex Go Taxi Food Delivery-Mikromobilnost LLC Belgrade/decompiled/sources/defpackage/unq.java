package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class unq {
    public final String a;
    public final String b;

    public unq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unq)) {
            return false;
        }
        unq unqVar = (unq) obj;
        return jl40.l(this.a, unqVar.a) && jl40.l(this.b, unqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("FeeEntity(title=", this.a, ", action=", this.b, Extension.C_BRAKE);
    }
}
