package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u62 implements y62 {
    public final fdu a;

    public u62(fdu fduVar) {
        this.a = fduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u62) && jl40.l(this.a, ((u62) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeaderAction(headerUiAction=" + this.a + Extension.C_BRAKE;
    }
}
