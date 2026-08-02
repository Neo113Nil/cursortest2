package defpackage;

/* loaded from: classes8.dex */
public final class vf20 implements tf20 {
    public final String a;
    public final eic0 b;
    public final pfe c;
    public final p151 d;

    public vf20(String str, eic0 eic0Var, pfe pfeVar, p151 p151Var) {
        this.a = str;
        this.b = eic0Var;
        this.c = pfeVar;
        this.d = p151Var;
    }

    @Override // defpackage.eg20
    public final boolean a(eg20 eg20Var) {
        if (eg20Var instanceof vf20) {
            return this.d.equals(((vf20) eg20Var).d);
        }
        return false;
    }

    @Override // defpackage.eg20
    public final p151 c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf20)) {
            return false;
        }
        vf20 vf20Var = (vf20) obj;
        return jl40.l(this.a, vf20Var.a) && jl40.l(this.b, vf20Var.b) && this.c.equals(vf20Var.c) && this.d.equals(vf20Var.d);
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
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (eic0Var == null ? 0 : eic0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SpacerMicroWidgetModel(id=" + this.a + ", action=" + this.b + ", contentDescription=" + this.c + ", widgetDisplaySettings=" + this.d + ')';
    }
}
