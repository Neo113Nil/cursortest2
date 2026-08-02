package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class q690 {
    public final String a;

    public /* synthetic */ q690(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q690) {
            return jl40.l(this.a, ((q690) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Page(page=", this.a, Extension.C_BRAKE);
    }
}
