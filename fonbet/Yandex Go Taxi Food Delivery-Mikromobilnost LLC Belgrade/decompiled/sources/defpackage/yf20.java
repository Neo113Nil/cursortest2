package defpackage;

/* loaded from: classes2.dex */
public final class yf20 implements tf20 {
    public final String a;
    public final eic0 b;
    public final pfe c;
    public final p151 d;
    public final cg20 e;
    public final boolean f;

    public yf20(String str, eic0 eic0Var, pfe pfeVar, p151 p151Var, cg20 cg20Var, boolean z) {
        this.a = str;
        this.b = eic0Var;
        this.c = pfeVar;
        this.d = p151Var;
        this.e = cg20Var;
        this.f = z;
    }

    public static yf20 d(yf20 yf20Var, boolean z) {
        String str = yf20Var.a;
        eic0 eic0Var = yf20Var.b;
        pfe pfeVar = yf20Var.c;
        p151 p151Var = yf20Var.d;
        cg20 cg20Var = yf20Var.e;
        yf20Var.getClass();
        return new yf20(str, eic0Var, pfeVar, p151Var, cg20Var, z);
    }

    @Override // defpackage.eg20
    public final boolean a(eg20 eg20Var) {
        if (!(eg20Var instanceof yf20)) {
            return false;
        }
        yf20 yf20Var = (yf20) eg20Var;
        return jl40.l(this.d, yf20Var.d) && jl40.l(this.e, yf20Var.e);
    }

    @Override // defpackage.eg20
    public final p151 c() {
        return this.d;
    }

    public final cg20 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf20)) {
            return false;
        }
        yf20 yf20Var = (yf20) obj;
        return jl40.l(this.a, yf20Var.a) && jl40.l(this.b, yf20Var.b) && jl40.l(this.c, yf20Var.c) && jl40.l(this.d, yf20Var.d) && jl40.l(this.e, yf20Var.e) && this.f == yf20Var.f;
    }

    @Override // defpackage.eg20
    public final eic0 getAction() {
        return this.b;
    }

    @Override // defpackage.eg20
    public final pfe getContentDescription() {
        return this.c;
    }

    @Override // defpackage.eg20
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eic0 eic0Var = this.b;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (eic0Var == null ? 0 : eic0Var.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchMicroWidgetModel(id=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", widgetDisplaySettings=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", switchState=");
        return unr0.u(sb, this.f, ')');
    }
}
