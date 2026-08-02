package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u7q0 {
    public final String a;
    public final ArrayList b;

    public u7q0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public static u7q0 a(u7q0 u7q0Var, ArrayList arrayList) {
        String str = u7q0Var.a;
        u7q0Var.getClass();
        return new u7q0(str, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7q0)) {
            return false;
        }
        u7q0 u7q0Var = (u7q0) obj;
        return jl40.l(this.a, u7q0Var.a) && this.b.equals(u7q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("Segment(title=", this.a, ", items=", Extension.C_BRAKE, this.b);
    }
}
