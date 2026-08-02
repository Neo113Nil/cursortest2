package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class yte {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    public yte(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yte)) {
            return false;
        }
        yte yteVar = (yte) obj;
        if (!jl40.l(this.a, yteVar.a) || !jl40.l(this.b, yteVar.b) || !jl40.l(this.c, yteVar.c) || !jl40.l(this.d, yteVar.d) || !jl40.l(this.e, yteVar.e)) {
            return false;
        }
        xte xteVar = xte.a;
        return xteVar.equals(xteVar) && xteVar.equals(xteVar);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int c = unr0.c((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + 255038) * 31, 31, this.c);
        String str3 = this.d;
        int hashCode2 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return ((((hashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31) + 1255828566) * 31) + 1255828566;
    }

    public final String toString() {
        StringBuilder v = b64.v("CorpAccountEmployeeAccessInfoUiState(title=", this.a, ", firstParagraph=", this.b, ", listItemMarker=• , listItems=");
        oyr.D(", lastParagraph=", this.d, ", doneButtonText=", v, this.c);
        v.append(this.e);
        v.append(", doneButtonAction=");
        xte xteVar = xte.a;
        v.append(xteVar);
        v.append(", closeClickAction=");
        v.append(xteVar);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
