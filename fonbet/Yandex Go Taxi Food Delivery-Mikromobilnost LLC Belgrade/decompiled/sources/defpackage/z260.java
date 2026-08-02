package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.delivery.state.NeuroPostcardButton$Size;
import ru.yandex.taxi.logistics.sdk.delivery.state.NeuroPostcardButton$Style;

/* loaded from: classes5.dex */
public final class z260 {
    public final FormattedText a;
    public final FormattedText b;
    public final NeuroPostcardButton$Style c;
    public final NeuroPostcardButton$Size d;
    public final s260 e;
    public final String f;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public z260(FormattedText formattedText, FormattedText formattedText2, NeuroPostcardButton$Style neuroPostcardButton$Style, NeuroPostcardButton$Size neuroPostcardButton$Size, s260 s260Var, String str) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = neuroPostcardButton$Style;
        this.d = neuroPostcardButton$Size;
        this.e = s260Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z260)) {
            return false;
        }
        z260 z260Var = (z260) obj;
        return this.a.equals(z260Var.a) && jl40.l(this.b, z260Var.b) && this.c == z260Var.c && this.d == z260Var.d && this.e.equals(z260Var.e) && jl40.l(this.f, z260Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "NeuroPostcardButton(title=" + this.a + ", subtitle=" + this.b + ", style=" + this.c + ", size=" + this.d + ", action=" + this.e + ", metricaLabel=" + this.f + Extension.C_BRAKE;
    }
}
