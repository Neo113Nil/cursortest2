package defpackage;

/* loaded from: classes.dex */
public final class wak extends ebk {
    public final float c;

    public wak(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wak) && Float.compare(this.c, ((wak) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
    }
}
