package defpackage;

/* loaded from: classes3.dex */
public final class l46 implements n46 {
    public final float a;

    public l46(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l46) && Float.compare(this.a, ((l46) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.m("Circle(radius=", this.a, ")");
    }
}
