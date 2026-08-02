package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vo70 implements xo70 {
    public final gjz0 a;
    public final gjz0 b;
    public final String c;

    public vo70(gjz0 gjz0Var, gjz0 gjz0Var2, String str) {
        this.a = gjz0Var;
        this.b = gjz0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo70)) {
            return false;
        }
        vo70 vo70Var = (vo70) obj;
        return jl40.l(this.a, vo70Var.a) && jl40.l(this.b, vo70Var.b) && this.c.equals(vo70Var.c);
    }

    public final int hashCode() {
        gjz0 gjz0Var = this.a;
        int hashCode = (gjz0Var == null ? 0 : gjz0Var.hashCode()) * 31;
        gjz0 gjz0Var2 = this.b;
        return this.c.hashCode() + ((hashCode + (gjz0Var2 != null ? gjz0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Active(contactButton=");
        sb.append(this.a);
        sb.append(", shareButton=");
        sb.append(this.b);
        sb.append(", addressTitle=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
