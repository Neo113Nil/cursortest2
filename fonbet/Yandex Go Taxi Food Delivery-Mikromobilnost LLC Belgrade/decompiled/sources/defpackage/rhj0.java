package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rhj0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public rhj0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhj0)) {
            return false;
        }
        rhj0 rhj0Var = (rhj0) obj;
        return jl40.l(this.a, rhj0Var.a) && jl40.l(this.b, rhj0Var.b) && jl40.l(this.c, rhj0Var.c) && jl40.l(this.d, rhj0Var.d) && this.e.equals(rhj0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RequirementInfoPopup(iconTag=", this.a, ", title=", this.b, ", description=");
        g8e.D(v, this.c, ", popupTitle=", this.d, ", infoScreenTexts=");
        return b64.n(Extension.C_BRAKE, v, this.e);
    }
}
