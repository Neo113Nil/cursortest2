package defpackage;

/* loaded from: classes3.dex */
public final class mqd {
    public final float a;
    public final float b;

    public mqd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqd)) {
            return false;
        }
        mqd mqdVar = (mqd) obj;
        return cma.a(this.a, mqdVar.a) && cma.a(this.b, mqdVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("GridVerticalSpaceBetween(horizontal=", cma.b(this.a), ", vertical=", cma.b(this.b), ")");
    }
}
