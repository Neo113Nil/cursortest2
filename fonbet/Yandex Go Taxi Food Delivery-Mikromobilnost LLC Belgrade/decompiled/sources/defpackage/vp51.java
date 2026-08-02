package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vp51 {
    public final String a;
    public final String b;

    public vp51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp51)) {
            return false;
        }
        vp51 vp51Var = (vp51) obj;
        return jl40.l(this.a, vp51Var.a) && jl40.l(this.b, vp51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("YbCardButtonEntity(title=", this.a, ", action=", this.b, Extension.C_BRAKE);
    }
}
