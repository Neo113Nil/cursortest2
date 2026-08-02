package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sl70 implements tl70 {
    public final String a;

    public sl70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl70) && jl40.l(this.a, ((sl70) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Loading(caption=", this.a, Extension.C_BRAKE);
    }

    public sl70() {
        this(null);
    }
}
