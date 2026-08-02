package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y09 extends n351 {
    public final String c;
    public final t09 d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final jvs0 h;
    public final b151 i;

    public y09(String str, t09 t09Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, jvs0 jvs0Var, b151 b151Var) {
        super("cart", false, 14);
        this.c = str;
        this.d = t09Var;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = charSequence3;
        this.h = jvs0Var;
        this.i = b151Var;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y09)) {
            return false;
        }
        y09 y09Var = (y09) obj;
        return jl40.l(this.c, y09Var.c) && jl40.l(this.d, y09Var.d) && jl40.l(this.e, y09Var.e) && jl40.l(this.f, y09Var.f) && jl40.l(this.g, y09Var.g) && jl40.l(this.h, y09Var.h) && jl40.l(this.i, y09Var.i);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        t09 t09Var = this.d;
        int b = smw0.b((hashCode + (t09Var == null ? 0 : t09Var.hashCode())) * 31, 31, this.e);
        CharSequence charSequence = this.f;
        int hashCode2 = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.g;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        jvs0 jvs0Var = this.h;
        int hashCode4 = (hashCode3 + (jvs0Var == null ? 0 : jvs0Var.hashCode())) * 31;
        b151 b151Var = this.i;
        return hashCode4 + (b151Var != null ? b151Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CartWidgetModel(id=");
        sb.append(this.c);
        sb.append(", lead=");
        sb.append(this.d);
        sb.append(", title=");
        vfc.A(sb, this.e, ", subtitle=", this.f, ", description=");
        sb.append((Object) this.g);
        sb.append(", trail=");
        sb.append(this.h);
        sb.append(", widgetAction=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
