package defpackage;

import java.util.Arrays;

/* loaded from: classes12.dex */
public final class sfv implements tfv {
    public final float a;
    public final int b;
    public final float c;
    public final String d;

    public sfv(float f, float f2, int i) {
        this.a = f;
        this.b = i;
        this.c = f2;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
        StringBuilder u = b64.u(i, "RoundCornersCenterCrop||", format, "||", "||");
        u.append(format2);
        this.d = u.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (sfv.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.d, ((sfv) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public /* synthetic */ sfv(float f, int i) {
        this(f, 16.0f, i);
    }
}
