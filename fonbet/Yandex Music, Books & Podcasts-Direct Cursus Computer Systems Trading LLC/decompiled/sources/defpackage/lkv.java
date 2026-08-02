package defpackage;

/* loaded from: classes4.dex */
public final class lkv {
    public final boolean a;
    public final boolean b;

    public lkv(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final float a() {
        return this.a ? 24 : 48;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkv)) {
            return false;
        }
        lkv lkvVar = (lkv) obj;
        return this.a == lkvVar.a && this.b == lkvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("WidePlayerPaddings(isCompactHorizontal=", this.a, ", isCompactVertical=", this.b, ")");
    }
}
