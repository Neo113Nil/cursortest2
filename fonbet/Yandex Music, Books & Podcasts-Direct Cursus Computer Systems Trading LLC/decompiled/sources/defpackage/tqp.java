package defpackage;

/* loaded from: classes4.dex */
public final class tqp implements brp {
    public final float a;

    public tqp(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqp) && Float.compare(this.a, ((tqp) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ouj.m("PlaybackSpeed(rate=", this.a, ")");
    }
}
