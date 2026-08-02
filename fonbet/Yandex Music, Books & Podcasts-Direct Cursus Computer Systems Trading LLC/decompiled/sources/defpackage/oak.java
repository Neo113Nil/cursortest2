package defpackage;

/* loaded from: classes.dex */
public final class oak extends ebk {
    public final float c;

    public oak(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oak) && Float.compare(this.c, ((oak) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("HorizontalTo(x="), this.c, ')');
    }
}
