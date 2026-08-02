package defpackage;

/* loaded from: classes3.dex */
public final class p1s {
    public final float a;
    public final float b;

    public p1s(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1s)) {
            return false;
        }
        p1s p1sVar = (p1s) obj;
        return cma.a(this.a, p1sVar.a) && cma.a(this.b, p1sVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        float f = this.a;
        String b = cma.b(f);
        float f2 = this.b;
        String b2 = cma.b(f + f2);
        return su4.o(f1d.m("TabPosition(left=", b, ", right=", b2, ", width="), cma.b(f2), ")");
    }
}
