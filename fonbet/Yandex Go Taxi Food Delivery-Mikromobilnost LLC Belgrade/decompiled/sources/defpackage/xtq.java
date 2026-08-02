package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xtq {
    public static final xtq f = new xtq(24, "", "", (List) EmptyList.a, false);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final boolean e;

    public /* synthetic */ xtq(int i, String str, String str2, List list, boolean z) {
        this(list, str, str2, (String) null, (i & 16) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtq)) {
            return false;
        }
        xtq xtqVar = (xtq) obj;
        return jl40.l(this.a, xtqVar.a) && jl40.l(this.b, xtqVar.b) && jl40.l(this.c, xtqVar.c) && jl40.l(this.d, xtqVar.d) && this.e == xtqVar.e;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("FeedbackQuestionUiState(id=", this.a, ", text=", this.b, ", answers=");
        oyr.D(", selectedAnswerId=", this.d, ", isNewSurvey=", v, this.c);
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }

    public xtq(List list, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = z;
    }
}
