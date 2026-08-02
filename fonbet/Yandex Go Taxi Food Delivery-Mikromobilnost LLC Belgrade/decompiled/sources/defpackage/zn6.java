package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zn6 {
    public final boolean a;
    public final float b;
    public final String c;
    public final dty0 d;
    public final v4v e;
    public final x2s f;
    public final io6 g;

    public zn6(boolean z, float f, String str, dty0 dty0Var, lvi0 lvi0Var, x2s x2sVar, io6 io6Var) {
        this.a = z;
        this.b = f;
        this.c = str;
        this.d = dty0Var;
        this.e = lvi0Var;
        this.f = x2sVar;
        this.g = io6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn6)) {
            return false;
        }
        zn6 zn6Var = (zn6) obj;
        return this.a == zn6Var.a && y7m.b(this.b, zn6Var.b) && jl40.l(this.c, zn6Var.c) && jl40.l(this.d, zn6Var.d) && jl40.l(this.e, zn6Var.e) && this.f.equals(zn6Var.f) && this.g.equals(zn6Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(g8e.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
        dty0 dty0Var = this.d;
        int hashCode = (b + (dty0Var == null ? 0 : dty0Var.hashCode())) * 31;
        v4v v4vVar = this.e;
        return this.g.hashCode() + tse0.a(this.f, (hashCode + (v4vVar != null ? v4vVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("BubbleToggle(isSelected=", ", size=", y7m.c(this.b), ", text=", this.a);
        v.append(this.c);
        v.append(", textStyle=");
        v.append(this.d);
        v.append(", icon=");
        v.append(this.e);
        v.append(", onShownAnalyticsData=");
        v.append(this.f);
        v.append(", widgetAction=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
