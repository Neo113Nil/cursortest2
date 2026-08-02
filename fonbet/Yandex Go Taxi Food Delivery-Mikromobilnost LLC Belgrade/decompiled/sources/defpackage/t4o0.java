package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class t4o0 implements w4o0 {
    public final CharSequence a;
    public final boolean b;
    public final List c;

    public t4o0(CharSequence charSequence, boolean z, List list) {
        this.a = charSequence;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4o0)) {
            return false;
        }
        t4o0 t4o0Var = (t4o0) obj;
        return jl40.l(this.a, t4o0Var.a) && this.b == t4o0Var.b && jl40.l(this.c, t4o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FewScooters(title=");
        sb.append((Object) this.a);
        sb.append(", withParkingAbout=");
        sb.append(this.b);
        sb.append(", scooters=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
