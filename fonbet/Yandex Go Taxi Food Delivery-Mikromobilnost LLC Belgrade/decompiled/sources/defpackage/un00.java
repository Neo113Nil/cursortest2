package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class un00 implements fo00 {
    public final ixy0 a;
    public final o52 b;
    public final kdc c;

    public un00(ixy0 ixy0Var, o52 o52Var, kdc kdcVar) {
        this.a = ixy0Var;
        this.b = o52Var;
        this.c = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un00)) {
            return false;
        }
        un00 un00Var = (un00) obj;
        return this.a.equals(un00Var.a) && jl40.l(this.b, un00Var.b) && jl40.l(this.c, un00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o52 o52Var = this.b;
        int hashCode2 = (hashCode + (o52Var == null ? 0 : o52Var.hashCode())) * 31;
        kdc kdcVar = this.c;
        return hashCode2 + (kdcVar != null ? kdcVar.hashCode() : 0);
    }

    public final String toString() {
        return "PinWarDefaultSelectedPinStyle(image=" + this.a + ", anchor=" + this.b + ", backgroundColor=" + this.c + Extension.C_BRAKE;
    }
}
