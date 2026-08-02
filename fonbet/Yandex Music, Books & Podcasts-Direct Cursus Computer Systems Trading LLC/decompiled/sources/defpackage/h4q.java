package defpackage;

/* loaded from: classes4.dex */
public final class h4q {
    public static final h4q b = new h4q(1.0f);
    public final float a;

    public h4q(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4q) && Float.compare(this.a, ((h4q) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.m("SharedPlaybackSpeed(rate=", this.a, ")");
    }
}
