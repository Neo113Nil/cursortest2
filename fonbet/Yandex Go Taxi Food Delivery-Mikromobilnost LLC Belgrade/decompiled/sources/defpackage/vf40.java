package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvf40;", "", "Companion", "uf40", "tf40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class vf40 {
    public static final uf40 Companion = new uf40();
    public static final vf40 c = new vf40(0);
    public final FormattedText a;
    public final String b;

    public /* synthetic */ vf40(int i, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf40)) {
            return false;
        }
        vf40 vf40Var = (vf40) obj;
        return jl40.l(this.a, vf40Var.a) && jl40.l(this.b, vf40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtTrainNotification(title=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }

    public vf40() {
        this(0);
    }

    public vf40(int i) {
        this.a = FormattedText.c;
        this.b = "";
    }
}
