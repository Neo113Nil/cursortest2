package defpackage;

/* loaded from: classes5.dex */
public final class daa implements gaa {
    public final float a;

    public daa(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof daa) && Float.compare(this.a, ((daa) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.m("InProgress(progress=", this.a, ")");
    }
}
