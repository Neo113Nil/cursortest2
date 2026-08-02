package defpackage;

/* loaded from: classes.dex */
public final class z7m implements yre {
    public final float a;

    public z7m(float f) {
        this.a = f;
    }

    @Override // defpackage.yre
    public final float e(long j, fwi fwiVar) {
        return fwiVar.w0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7m) && y7m.b(this.a, ((z7m) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return uw51.i(new StringBuilder("CornerSize(size = "), this.a, ".dp)");
    }
}
