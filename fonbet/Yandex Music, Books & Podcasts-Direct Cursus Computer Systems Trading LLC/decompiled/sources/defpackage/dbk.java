package defpackage;

/* loaded from: classes.dex */
public final class dbk extends ebk {
    public final float c;

    public dbk(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbk) && Float.compare(this.c, ((dbk) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("VerticalTo(y="), this.c, ')');
    }
}
