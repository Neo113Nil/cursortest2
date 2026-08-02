package defpackage;

/* loaded from: classes2.dex */
public final class wrc0 {
    public final String a;
    public final zmc0 b;

    public wrc0(String str, zmc0 zmc0Var) {
        this.a = str;
        this.b = zmc0Var;
    }

    public final zmc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrc0)) {
            return false;
        }
        wrc0 wrc0Var = (wrc0) obj;
        return this.a.equals(wrc0Var.a) && this.b.equals(wrc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTaxiATImageProperty(__typename=" + this.a + ", plaqueImageProperty=" + this.b + ')';
    }
}
