package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class xpq0 {
    public static final wpq0 Companion = new wpq0();
    public final String a;
    public final String b;

    public /* synthetic */ xpq0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, vpq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpq0)) {
            return false;
        }
        xpq0 xpq0Var = (xpq0) obj;
        return jl40.l(this.a, xpq0Var.a) && jl40.l(this.b, xpq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("SendToBackendConfig(stateName=", this.a, ", stateKey=", this.b, Extension.C_BRAKE);
    }
}
