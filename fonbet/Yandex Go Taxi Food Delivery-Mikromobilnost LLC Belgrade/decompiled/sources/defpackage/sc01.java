package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsc01;", "", "Companion", "qc01", "rc01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class sc01 {
    public static final rc01 Companion = new rc01();
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;

    public /* synthetic */ sc01(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc01)) {
            return false;
        }
        sc01 sc01Var = (sc01) obj;
        return jl40.l(this.a, sc01Var.a) && jl40.l(this.b, sc01Var.b) && jl40.l(this.c, sc01Var.c) && jl40.l(this.d, sc01Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
        FormattedText formattedText = this.d;
        return c + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("TrainStationSuggestDto(id=", this.a, ", icon=", this.b, ", title=");
        v.append(this.c);
        v.append(", description=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public sc01() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = "";
        this.c = formattedText;
        this.d = null;
    }
}
