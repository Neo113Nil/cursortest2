package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class u3r0 extends kr {
    public static final t3r0 Companion = new t3r0();
    public final String a;
    public final boolean b;

    public /* synthetic */ u3r0(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, s3r0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u3r0.class != obj.getClass()) {
            return false;
        }
        u3r0 u3r0Var = (u3r0) obj;
        return jl40.l(this.a, u3r0Var.a) && this.b == u3r0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("SetPaginationStatusAction(id=", this.a, ", isEnabled=", this.b, Extension.C_BRAKE);
    }
}
