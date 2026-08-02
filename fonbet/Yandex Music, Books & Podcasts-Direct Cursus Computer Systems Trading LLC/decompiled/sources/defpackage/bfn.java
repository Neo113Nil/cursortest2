package defpackage;

/* loaded from: classes3.dex */
public final class bfn extends hag {
    public final float a;

    public bfn(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfn) && Float.compare(this.a, ((bfn) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("Fixed(value="), this.a, ')');
    }
}
