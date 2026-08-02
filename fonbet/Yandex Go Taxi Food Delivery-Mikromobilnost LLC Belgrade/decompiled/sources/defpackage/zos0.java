package defpackage;

/* loaded from: classes5.dex */
public final class zos0 implements pre {
    public final String a;
    public final boolean b;
    public final vos0 c;
    public final vos0 d;
    public final r9x0 e;

    public zos0(String str, boolean z, vos0 vos0Var, vos0 vos0Var2, r9x0 r9x0Var) {
        this.a = str;
        this.b = z;
        this.c = vos0Var;
        this.d = vos0Var2;
        this.e = r9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zos0)) {
            return false;
        }
        zos0 zos0Var = (zos0) obj;
        return jl40.l(this.a, zos0Var.a) && this.b == zos0Var.b && this.c.equals(zos0Var.c) && jl40.l(this.d, zos0Var.d) && this.e.equals(zos0Var.e);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "slider-button";
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31;
        vos0 vos0Var = this.d;
        return (this.e.hashCode() + ((hashCode + (vos0Var == null ? 0 : vos0Var.hashCode())) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder l = oo31.l("SliderButtonRemoteCoreWidget(id=", this.a, ", isEnabled=", ", normalContent=", this.b);
        l.append(this.c);
        l.append(", loadingContent=");
        l.append(this.d);
        l.append(", action=");
        l.append(this.e);
        l.append(", metricaLabel=null)");
        return l.toString();
    }
}
