package defpackage;

/* loaded from: classes.dex */
public final class otp {
    public static final otp d = new otp();
    public final long a;
    public final long b;
    public final float c;

    public /* synthetic */ otp() {
        this(c3x.h(4278190080L), 0L, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otp)) {
            return false;
        }
        otp otpVar = (otp) obj;
        return d85.c(this.a, otpVar.a) && enj.c(this.b, otpVar.b) && this.c == otpVar.c;
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Float.hashCode(this.c) + tlm.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        dfi.q(this.a, ", offset=", sb);
        sb.append((Object) enj.j(this.b));
        sb.append(", blurRadius=");
        return ouj.p(sb, this.c, ')');
    }

    public otp(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }
}
