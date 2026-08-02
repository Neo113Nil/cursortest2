package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s2v0 {
    public final String a;
    public final ky b;

    public s2v0(String str, ky kyVar) {
        this.a = str;
        this.b = kyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2v0)) {
            return false;
        }
        s2v0 s2v0Var = (s2v0) obj;
        return this.a.equals(s2v0Var.a) && this.b.equals(s2v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubtitleState(text=" + this.a + ", actionState=" + this.b + Extension.C_BRAKE;
    }
}
