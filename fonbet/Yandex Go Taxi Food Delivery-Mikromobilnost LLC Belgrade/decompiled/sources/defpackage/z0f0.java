package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class z0f0 implements c1f0 {
    public final FormattedText a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final String e;

    public z0f0(FormattedText formattedText, boolean z, int i, boolean z2, String str) {
        this.a = formattedText;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0f0)) {
            return false;
        }
        z0f0 z0f0Var = (z0f0) obj;
        return jl40.l(this.a, z0f0Var.a) && this.b == z0f0Var.b && this.c == z0f0Var.c && this.d == z0f0Var.d && jl40.l(this.e, z0f0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(oyr.b(this.c, unr0.e(this.a.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullBackend(value=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", color=");
        tse0.z(sb, this.c, ", hasSurge=", this.d, ", contentDescription=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
