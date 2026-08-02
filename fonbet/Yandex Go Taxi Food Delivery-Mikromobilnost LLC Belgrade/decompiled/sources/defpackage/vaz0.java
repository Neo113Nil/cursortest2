package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vaz0 extends xaz0 {
    public final String a;
    public final String b;

    public vaz0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaz0)) {
            return false;
        }
        vaz0 vaz0Var = (vaz0) obj;
        return jl40.l(this.a, vaz0Var.a) && jl40.l(this.b, vaz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ShareTimelineDetailsShareButtonActionState(title=", this.a, ", sharingUrl=", this.b, Extension.C_BRAKE);
    }
}
