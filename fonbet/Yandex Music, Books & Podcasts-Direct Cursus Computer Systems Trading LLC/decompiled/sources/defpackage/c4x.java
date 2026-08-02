package defpackage;

/* loaded from: classes.dex */
public final class c4x extends x3x {
    public final l0n a;

    public c4x(l0n l0nVar) {
        this.a = l0nVar;
    }

    @Override // defpackage.x3x
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.x3x
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c4x) {
            return this.a.equals(((c4x) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return hrg.q("Optional.of(", this.a.toString(), ")");
    }
}
