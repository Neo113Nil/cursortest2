package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class svh {
    public final String a;
    public final String b;

    public svh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svh)) {
            return false;
        }
        svh svhVar = (svh) obj;
        return jl40.l(this.a, svhVar.a) && jl40.l(this.b, svhVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("FieldData(label=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
