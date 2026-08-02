package defpackage;

/* loaded from: classes4.dex */
public final class xj2 implements ak2 {
    public final String a;
    public final boolean b;

    public xj2(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.ak2
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj2)) {
            return false;
        }
        xj2 xj2Var = (xj2) obj;
        return this.a.equals(xj2Var.a) && this.b == xj2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("Image(url=", this.a, ", withPersonalColor=", ")", this.b);
    }
}
