package defpackage;

/* loaded from: classes3.dex */
public final class u7p extends y7p {
    public final float a;
    public final e4p b;

    public u7p(float f, e4p e4pVar) {
        e4pVar.getClass();
        this.a = f;
        this.b = e4pVar;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7p)) {
            return false;
        }
        u7p u7pVar = (u7p) obj;
        return cma.a(this.a, u7pVar.a) && this.b == u7pVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Spacer(height=" + cma.b(this.a) + ", source=" + this.b + ")";
    }
}
