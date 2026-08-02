package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class kio {
    public static final byte[] g = new byte[0];
    public final boolean a;
    public final byte b;
    public final int c;
    public final long d;
    public final int e;
    public final byte[] f;

    public kio(jio jioVar) {
        this.a = jioVar.a;
        this.b = jioVar.b;
        this.c = jioVar.c;
        this.d = jioVar.d;
        this.e = jioVar.e;
        this.f = jioVar.f;
    }

    public static int a(int i) {
        return pd.Q(i + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kio.class == obj.getClass()) {
            kio kioVar = (kio) obj;
            if (this.b == kioVar.b && this.c == kioVar.c && this.a == kioVar.a && this.d == kioVar.d && this.e == kioVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((527 + this.b) * 31) + this.c) * 31) + (this.a ? 1 : 0)) * 31;
        long j = this.d;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.a)};
        int i = dvt.a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
