package defpackage;

import java.util.Arrays;

/* loaded from: classes12.dex */
public final class rfv implements tfv {
    public final float a;
    public final float b;
    public final String c;

    public rfv(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = b64.l("ResizeToMoveCenter||", String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), "||", String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (rfv.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.c, ((rfv) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
