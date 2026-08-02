package defpackage;

/* loaded from: classes3.dex */
public final class lje extends weo {
    public final float i;

    public lje(float f) {
        this.i = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lje) && Float.compare(this.i, ((lje) obj).i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("Circle(radius="), this.i, ')');
    }
}
