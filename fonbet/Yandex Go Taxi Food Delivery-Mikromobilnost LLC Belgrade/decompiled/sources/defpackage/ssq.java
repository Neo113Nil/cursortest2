package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ssq {
    public final String a;
    public final String b;
    public final List c;

    public ssq(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssq)) {
            return false;
        }
        ssq ssqVar = (ssq) obj;
        return jl40.l(this.a, ssqVar.a) && jl40.l(this.b, ssqVar.b) && jl40.l(this.c, ssqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("FeedbackHint(id=", this.a, ", hint=", this.b, ", visibleOnRatings="), this.c, Extension.C_BRAKE);
    }
}
