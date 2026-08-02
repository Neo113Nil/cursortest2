package defpackage;

/* loaded from: classes3.dex */
public final class kz6 {
    public final m5n a;
    public final boolean b;

    public kz6(m5n m5nVar, boolean z) {
        this.a = m5nVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kz6) {
            kz6 kz6Var = (kz6) obj;
            if (kz6Var.a.equals(this.a) && kz6Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
