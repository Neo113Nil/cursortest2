package defpackage;

/* loaded from: classes10.dex */
public final class rr90 extends tr90 {
    public final float c;

    public rr90(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr90) && Float.compare(this.c, ((rr90) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return n.n(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
    }
}
