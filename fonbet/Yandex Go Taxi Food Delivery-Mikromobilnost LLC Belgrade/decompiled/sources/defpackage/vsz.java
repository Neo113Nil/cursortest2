package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class vsz implements btz {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof vsz) {
            return this.a.equals(((vsz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Asset(assetName=", this.a, Extension.C_BRAKE);
    }
}
