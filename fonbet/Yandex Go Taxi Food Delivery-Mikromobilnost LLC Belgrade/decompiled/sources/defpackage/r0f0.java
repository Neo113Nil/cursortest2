package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class r0f0 extends t0f0 {
    public final FormattedText a;
    public final String b;
    public final boolean c;

    public r0f0(String str, FormattedText formattedText) {
        boolean d = formattedText.d();
        this.a = formattedText;
        this.b = str;
        this.c = d;
    }

    @Override // defpackage.t0f0
    public final String a() {
        return this.b;
    }

    @Override // defpackage.t0f0
    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0f0)) {
            return false;
        }
        r0f0 r0f0Var = (r0f0) obj;
        return jl40.l(this.a, r0f0Var.a) && jl40.l(this.b, r0f0Var.b) && this.c == r0f0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullBackend(value=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", hasPrice=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
