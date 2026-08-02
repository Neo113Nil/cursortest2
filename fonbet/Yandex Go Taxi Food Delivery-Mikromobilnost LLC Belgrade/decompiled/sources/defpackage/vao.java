package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class vao extends xao {
    public final String a;
    public final String b;

    public vao(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vao)) {
            return false;
        }
        vao vaoVar = (vao) obj;
        return this.a.equals(vaoVar.a) && this.b.equals(vaoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ChangeUrlByRedirect(redirectFrom=", this.a, ", redirectTo=", this.b, Extension.C_BRAKE);
    }
}
