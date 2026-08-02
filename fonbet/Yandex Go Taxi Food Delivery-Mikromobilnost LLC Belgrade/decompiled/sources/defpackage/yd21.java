package defpackage;

/* loaded from: classes10.dex */
public final class yd21 {
    public static final yd21 c = new yd21(false, false);
    public final boolean a;
    public final boolean b;

    public yd21(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd21)) {
            return false;
        }
        yd21 yd21Var = (yd21) obj;
        return this.a == yd21Var.a && this.b == yd21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomDecoderSettings(preferHardwareDecodersOnSamsungTablets=");
        sb.append(this.a);
        sb.append(", preferHardwareDecodersOnAnyModel=");
        return unr0.u(sb, this.b, ')');
    }

    public yd21() {
        this(false, false);
    }
}
