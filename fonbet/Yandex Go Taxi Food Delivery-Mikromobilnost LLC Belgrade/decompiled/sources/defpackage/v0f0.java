package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes8.dex */
public final class v0f0 {
    public final FormattedText a;
    public final String b;

    public v0f0(String str, FormattedText formattedText) {
        this.a = formattedText;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0f0)) {
            return false;
        }
        v0f0 v0f0Var = (v0f0) obj;
        return jl40.l(this.a, v0f0Var.a) && jl40.l(this.b, v0f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "PriceUiElement(text=" + this.a + ", accessibility=" + this.b + Extension.C_BRAKE;
    }
}
