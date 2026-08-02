package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qq extends lr {
    public final hki a;

    public qq(hki hkiVar) {
        this.a = hkiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq) && jl40.l(this.a, ((qq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PhotocommentGalleryChosen(pointType=" + this.a + Extension.C_BRAKE;
    }
}
