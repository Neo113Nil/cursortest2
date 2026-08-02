package defpackage;

/* loaded from: classes3.dex */
public final class jhg extends lhg {
    public final float a;

    public jhg(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhg) && Float.compare(this.a, ((jhg) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.m("Loading(progress=", this.a, ")");
    }
}
