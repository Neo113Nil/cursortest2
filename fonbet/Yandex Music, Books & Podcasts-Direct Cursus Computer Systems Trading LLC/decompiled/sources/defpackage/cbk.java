package defpackage;

/* loaded from: classes.dex */
public final class cbk extends ebk {
    public final float c;

    public cbk(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbk) && Float.compare(this.c, ((cbk) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
    }
}
