package defpackage;

/* loaded from: classes3.dex */
public final class kke {
    public final int a;
    public final float b;

    public kke(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kke)) {
            return false;
        }
        kke kkeVar = (kke) obj;
        return this.a == kkeVar.a && cma.a(this.b, kkeVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InformerGlowState(colorInt=" + this.a + ", heightDp=" + cma.b(this.b) + ")";
    }
}
