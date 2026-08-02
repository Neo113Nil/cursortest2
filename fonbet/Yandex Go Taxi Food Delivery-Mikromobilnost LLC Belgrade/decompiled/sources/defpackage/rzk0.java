package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rzk0 {
    public final rr51 a;
    public final List b;

    public rzk0(rr51 rr51Var, List list) {
        this.a = rr51Var;
        this.b = list;
    }

    public final rr51 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzk0)) {
            return false;
        }
        rzk0 rzk0Var = (rzk0) obj;
        return jl40.l(this.a, rzk0Var.a) && this.b.equals(rzk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DivData(div=" + this.a + ", localVariables=" + this.b + Extension.C_BRAKE;
    }
}
