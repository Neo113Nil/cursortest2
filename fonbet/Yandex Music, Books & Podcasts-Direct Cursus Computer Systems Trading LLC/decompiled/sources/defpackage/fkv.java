package defpackage;

/* loaded from: classes4.dex */
public final class fkv {
    public final ges a;
    public final ges b;

    public fkv(ges gesVar, ges gesVar2) {
        this.a = gesVar;
        this.b = gesVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkv)) {
            return false;
        }
        fkv fkvVar = (fkv) obj;
        return this.a.equals(fkvVar.a) && this.b.equals(fkvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WheelTypography(description=" + this.a + ", title=" + this.b + ")";
    }
}
