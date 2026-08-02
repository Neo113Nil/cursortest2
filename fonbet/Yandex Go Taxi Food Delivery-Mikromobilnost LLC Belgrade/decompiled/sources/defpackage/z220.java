package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z220 {
    public final v120 a;
    public final rkb1 b;
    public final String c;

    public z220(v120 v120Var, rkb1 rkb1Var, String str) {
        this.a = v120Var;
        this.b = rkb1Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z220)) {
            return false;
        }
        z220 z220Var = (z220) obj;
        return this.a.equals(z220Var.a) && this.b.equals(z220Var.b) && jl40.l(this.c, z220Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessengerParams(messengerHeader=");
        sb.append(this.a);
        sb.append(", chatRequest=");
        sb.append(this.b);
        sb.append(", chatMeta=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
