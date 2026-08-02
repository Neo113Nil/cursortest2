package defpackage;

/* loaded from: classes.dex */
public final class srv implements urv {
    public final float a;

    public srv(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srv) && Float.compare(this.a, ((srv) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return n.n(new StringBuilder("Default(spaceBetweenCenters="), this.a, ')');
    }
}
