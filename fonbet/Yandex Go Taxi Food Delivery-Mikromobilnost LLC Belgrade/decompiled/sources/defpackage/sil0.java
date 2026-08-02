package defpackage;

import java.util.Locale;

/* loaded from: classes10.dex */
public final class sil0 {
    public static final byte[] g = new byte[0];
    public final boolean a;
    public final byte b;
    public final int c;
    public final long d;
    public final int e;
    public final byte[] f;

    public sil0(ril0 ril0Var) {
        this.a = ril0Var.a;
        this.b = ril0Var.b;
        this.c = ril0Var.c;
        this.d = ril0Var.d;
        this.e = ril0Var.e;
        this.f = ril0Var.f;
    }

    public static int a(int i) {
        return Math.floorMod(i + 1, 65536);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sil0.class == obj.getClass()) {
            sil0 sil0Var = (sil0) obj;
            if (this.b == sil0Var.b && this.c == sil0Var.c && this.a == sil0Var.a && this.d == sil0Var.d && this.e == sil0Var.e) {
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
        int i = tw21.a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
