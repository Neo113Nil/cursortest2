package defpackage;

/* loaded from: classes4.dex */
public final class ihg extends khg {
    public final float a;

    public ihg(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihg) && Float.compare(this.a, ((ihg) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.m("Loading(progress=", this.a, ")");
    }
}
