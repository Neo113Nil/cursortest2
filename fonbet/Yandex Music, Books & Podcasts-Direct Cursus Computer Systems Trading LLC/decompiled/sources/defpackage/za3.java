package defpackage;

/* loaded from: classes3.dex */
public final class za3 implements ya3 {
    public final boolean a;
    public final boolean b;
    public final mt c;

    public za3(boolean z, boolean z2, mt mtVar) {
        this.a = z;
        this.b = z2;
        this.c = mtVar;
    }

    @Override // defpackage.ya3
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za3)) {
            return false;
        }
        za3 za3Var = (za3) obj;
        return this.a == za3Var.a && this.b == za3Var.b && this.c.equals(za3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder j = eta.j("ModalDisclaimer(showLoadingScreen=", this.a, ", hasYandexBooksBadge=", this.b, ", albumFull=");
        j.append(this.c);
        j.append(")");
        return j.toString();
    }
}
