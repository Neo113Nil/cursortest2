package defpackage;

/* loaded from: classes10.dex */
public final class tz6 {
    public final float a;

    public tz6(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tz6)) {
            return false;
        }
        return y7m.b(0.0f, 0.0f) && y7m.b(0.0f, 0.0f) && y7m.b(0.0f, 0.0f) && y7m.b(this.a, ((tz6) obj).a) && y7m.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + g8e.c(this.a, g8e.c(0.0f, g8e.c(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
