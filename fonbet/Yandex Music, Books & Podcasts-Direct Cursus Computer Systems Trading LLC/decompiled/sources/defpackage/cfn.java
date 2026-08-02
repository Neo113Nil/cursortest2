package defpackage;

/* loaded from: classes3.dex */
public final class cfn extends hag {
    public final float a;

    public cfn(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfn) && Float.compare(this.a, ((cfn) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.p(new StringBuilder("Relative(value="), this.a, ')');
    }
}
