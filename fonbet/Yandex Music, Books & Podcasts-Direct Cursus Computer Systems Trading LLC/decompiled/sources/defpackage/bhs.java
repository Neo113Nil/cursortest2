package defpackage;

/* loaded from: classes3.dex */
public final class bhs {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final float d;

    public bhs(float f, boolean z, boolean z2, float f2) {
        this.a = f;
        this.b = z;
        this.c = z2;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhs)) {
            return false;
        }
        bhs bhsVar = (bhs) obj;
        return cma.a(this.a, bhsVar.a) && this.b == bhsVar.b && this.c == bhsVar.c && cma.a(this.d, bhsVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k5r.e(k5r.e(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String b = cma.b(this.a);
        String b2 = cma.b(this.d);
        StringBuilder h = v3w.h("TileUiSpec(cardContentHeight=", b, ", gridDisplayedAsList=", ", adaptForScaledScreen=", this.b);
        h.append(this.c);
        h.append(", adaptForScaledScreenWidthThreshold=");
        h.append(b2);
        h.append(")");
        return h.toString();
    }
}
