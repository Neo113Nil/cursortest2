package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w460 {
    public final List a;
    public final CharSequence b;
    public final String c;

    public w460(CharSequence charSequence, String str, List list) {
        this.a = list;
        this.b = charSequence;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w460)) {
            return false;
        }
        w460 w460Var = (w460) obj;
        return jl40.l(this.a, w460Var.a) && jl40.l(this.b, w460Var.b) && jl40.l(this.c, w460Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroTextInputStopWordsItemModel(stopWords=");
        sb.append(this.a);
        sb.append(", errorText=");
        sb.append((Object) this.b);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
