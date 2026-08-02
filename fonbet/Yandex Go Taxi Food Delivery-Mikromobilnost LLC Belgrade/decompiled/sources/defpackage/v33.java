package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class v33 {
    public final String a;

    public v33(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v33) && jl40.l(this.a, ((v33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ArTextsConfig(scanSurfaceScreenTitle=", this.a, Extension.C_BRAKE);
    }
}
