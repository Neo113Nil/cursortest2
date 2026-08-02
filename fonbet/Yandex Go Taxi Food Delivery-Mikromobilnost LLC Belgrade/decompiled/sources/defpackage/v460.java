package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v460 {
    public final ArrayList a;
    public final FormattedText b;
    public final String c;

    public v460(ArrayList arrayList, FormattedText formattedText, String str) {
        this.a = arrayList;
        this.b = formattedText;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v460)) {
            return false;
        }
        v460 v460Var = (v460) obj;
        return this.a.equals(v460Var.a) && jl40.l(this.b, v460Var.b) && jl40.l(this.c, v460Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroTextInputStopWordsItem(stopWords=");
        sb.append(this.a);
        sb.append(", errorText=");
        sb.append(this.b);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
