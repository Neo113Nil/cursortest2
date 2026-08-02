package defpackage;

/* loaded from: classes10.dex */
public final class sr90 extends tr90 {
    public final float c;

    public sr90(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr90) && Float.compare(this.c, ((sr90) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return n.n(new StringBuilder("VerticalTo(y="), this.c, ')');
    }
}
