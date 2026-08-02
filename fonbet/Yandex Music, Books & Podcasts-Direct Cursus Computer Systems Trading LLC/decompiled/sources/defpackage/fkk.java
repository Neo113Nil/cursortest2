package defpackage;

/* loaded from: classes.dex */
public final class fkk implements am6 {
    public final float a;

    public fkk(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            vme.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.am6
    public final float a(long j, jx7 jx7Var) {
        return (this.a / 100.0f) * nmq.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fkk) && Float.compare(this.a, ((fkk) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return su4.m(this.a, "%)", new StringBuilder("CornerSize(size = "));
    }
}
