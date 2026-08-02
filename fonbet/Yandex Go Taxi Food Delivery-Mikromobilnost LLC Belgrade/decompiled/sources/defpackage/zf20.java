package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zf20 extends sf20 {
    public final String b;
    public final q0d0 c;
    public final o151 d;
    public final ofe e;
    public final bg20 f;

    public zf20(String str, q0d0 q0d0Var, o151 o151Var, ofe ofeVar, bg20 bg20Var) {
        super(q0d0Var);
        this.b = str;
        this.c = q0d0Var;
        this.d = o151Var;
        this.e = ofeVar;
        this.f = bg20Var;
    }

    @Override // defpackage.sf20, defpackage.dg20
    public final q0d0 a() {
        return this.c;
    }

    @Override // defpackage.dg20
    public final String b() {
        return this.b;
    }

    @Override // defpackage.sf20
    public final o151 c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf20)) {
            return false;
        }
        zf20 zf20Var = (zf20) obj;
        return jl40.l(this.b, zf20Var.b) && jl40.l(this.c, zf20Var.c) && jl40.l(this.d, zf20Var.d) && jl40.l(this.e, zf20Var.e) && this.f.equals(zf20Var.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        q0d0 q0d0Var = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (q0d0Var == null ? 0 : q0d0Var.hashCode())) * 31)) * 31;
        ofe ofeVar = this.e;
        return this.f.hashCode() + ((hashCode2 + (ofeVar != null ? ofeVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TextMicroWidgetModel(id=" + this.b + ", action=" + this.c + ", widgetDisplaySettings=" + this.d + ", contentDescription=" + this.e + ", text=" + this.f + Extension.C_BRAKE;
    }
}
