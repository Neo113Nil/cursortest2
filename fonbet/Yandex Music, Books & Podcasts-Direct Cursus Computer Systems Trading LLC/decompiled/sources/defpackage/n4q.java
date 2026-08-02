package defpackage;

/* loaded from: classes4.dex */
public final class n4q {
    public static final n4q b = new n4q(1.0f);
    public final float a;

    public n4q(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4q) && Float.compare(this.a, ((n4q) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.m("SharedPlaybackVolume(fraction=", this.a, ")");
    }
}
