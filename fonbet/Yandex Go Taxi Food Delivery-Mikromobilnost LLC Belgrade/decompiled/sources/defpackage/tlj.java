package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltlj;", "", "Companion", "slj", "rlj", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class tlj {
    public static final slj Companion = new slj();
    public final String a;
    public final FormattedText b;

    static {
        new tlj(0);
    }

    public /* synthetic */ tlj(int i, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlj)) {
            return false;
        }
        tlj tljVar = (tlj) obj;
        return jl40.l(this.a, tljVar.a) && jl40.l(this.b, tljVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DirectionSelectorItem(directionId=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
    }

    public tlj() {
        this(0);
    }

    public tlj(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
    }
}
