package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u8i0 {
    public final String a;
    public final String b;
    public final List c;

    public u8i0(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8i0)) {
            return false;
        }
        u8i0 u8i0Var = (u8i0) obj;
        return jl40.l(this.a, u8i0Var.a) && jl40.l(this.b, u8i0Var.b) && jl40.l(this.c, u8i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("RatingSelector(id=", this.a, ", analyticsId=", this.b, ", hints="), this.c, Extension.C_BRAKE);
    }
}
