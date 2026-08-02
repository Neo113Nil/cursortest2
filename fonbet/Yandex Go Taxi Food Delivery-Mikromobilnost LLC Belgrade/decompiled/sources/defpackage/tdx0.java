package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tdx0 implements bex0 {
    public final edu a;

    public tdx0(edu eduVar) {
        this.a = eduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdx0) && jl40.l(this.a, ((tdx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeaderAction(headerUiAction=" + this.a + Extension.C_BRAKE;
    }
}
