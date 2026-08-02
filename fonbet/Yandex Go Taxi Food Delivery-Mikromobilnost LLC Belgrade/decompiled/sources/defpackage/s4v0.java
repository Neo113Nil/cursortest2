package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class s4v0 implements b8v0 {
    public final String a;

    public s4v0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4v0) && jl40.l(this.a, ((s4v0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SuggestCategoryModel(title=", this.a, Extension.C_BRAKE);
    }
}
