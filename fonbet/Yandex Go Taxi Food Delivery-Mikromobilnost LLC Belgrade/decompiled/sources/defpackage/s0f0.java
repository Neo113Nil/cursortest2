package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class s0f0 extends t0f0 {
    public final FormattedText a;
    public final String b;
    public final String c;
    public final boolean d;

    public s0f0(String str, String str2, FormattedText formattedText) {
        boolean d = formattedText.d();
        this.a = formattedText;
        this.b = str;
        this.c = str2;
        this.d = d;
    }

    @Override // defpackage.t0f0
    public final String a() {
        return this.c;
    }

    @Override // defpackage.t0f0
    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0f0)) {
            return false;
        }
        s0f0 s0f0Var = (s0f0) obj;
        return jl40.l(this.a, s0f0Var.a) && jl40.l(this.b, s0f0Var.b) && jl40.l(this.c, s0f0Var.c) && this.d == s0f0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(this.a.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceHighlight(value=");
        sb.append(this.a);
        sb.append(", originalPrice=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        return nnm.i(this.c, ", hasPrice=", Extension.C_BRAKE, sb, this.d);
    }
}
