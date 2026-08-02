package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class p0l {
    public static final p0l d = new p0l(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        int i = dvt.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public p0l(float f2, float f3) {
        vq1.v(f2 > 0.0f);
        vq1.v(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final p0l a(float f2) {
        return new p0l(f2, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0l.class == obj.getClass()) {
            p0l p0lVar = (p0l) obj;
            if (this.a == p0lVar.a && this.b == p0lVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = dvt.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public p0l(float f2) {
        this(f2, 1.0f);
    }
}
