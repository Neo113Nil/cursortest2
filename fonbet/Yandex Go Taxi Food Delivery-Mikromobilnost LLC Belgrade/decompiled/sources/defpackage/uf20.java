package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class uf20 extends sf20 {
    public final String b;
    public final o151 c;

    public uf20(String str, o151 o151Var) {
        super(null);
        this.b = str;
        this.c = o151Var;
    }

    @Override // defpackage.dg20
    public final String b() {
        return this.b;
    }

    @Override // defpackage.sf20
    public final o151 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf20)) {
            return false;
        }
        uf20 uf20Var = (uf20) obj;
        return jl40.l(this.b, uf20Var.b) && this.c.equals(uf20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SpacerMicroWidgetModel(id=" + this.b + ", widgetDisplaySettings=" + this.c + Extension.C_BRAKE;
    }
}
