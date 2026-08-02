package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zsq {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public zsq(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsq)) {
            return false;
        }
        zsq zsqVar = (zsq) obj;
        return jl40.l(this.a, zsqVar.a) && jl40.l(this.b, zsqVar.b) && jl40.l(this.c, zsqVar.c) && this.d.equals(zsqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("FeedbackItem(id=", this.a, ", iconTagSelected=", this.b, ", iconTagUnselected=");
        v.append(this.c);
        v.append(", options=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
