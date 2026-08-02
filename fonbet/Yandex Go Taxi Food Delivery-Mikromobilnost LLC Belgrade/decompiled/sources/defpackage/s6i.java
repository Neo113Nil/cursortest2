package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s6i {
    public final String a;
    public final pw21 b;

    public s6i(String str, pw21 pw21Var) {
        this.a = str;
        this.b = pw21Var;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6i)) {
            return false;
        }
        s6i s6iVar = (s6i) obj;
        return jl40.l(this.a, s6iVar.a) && this.b.equals(s6iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryEditInfo(deliveryId=" + this.a + ", editPayload=" + this.b + Extension.C_BRAKE;
    }
}
