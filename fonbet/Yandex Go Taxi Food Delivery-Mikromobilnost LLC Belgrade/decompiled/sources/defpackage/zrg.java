package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import ru.CryptoPro.JCP.tools.LicenseUtility;

@gsq0(with = z5z0.class)
/* loaded from: classes4.dex */
public final class zrg extends asg {
    public static final yrg Companion = new yrg();
    public final long b;
    public final String c;
    public final long d;

    public zrg(long j) {
        this.b = j;
        if (j <= 0) {
            w511.f(qv10.k(j, "Unit duration must be positive, but was ", " ns."));
            throw null;
        }
        if (j % 3600000000000L == 0) {
            this.c = "HOUR";
            this.d = j / 3600000000000L;
            return;
        }
        if (j % 60000000000L == 0) {
            this.c = "MINUTE";
            this.d = j / 60000000000L;
            return;
        }
        if (j % MathMethodsKt.NANOS_PER_SECOND == 0) {
            this.c = "SECOND";
            this.d = j / MathMethodsKt.NANOS_PER_SECOND;
        } else if (j % 1000000 == 0) {
            this.c = "MILLISECOND";
            this.d = j / 1000000;
        } else if (j % 1000 == 0) {
            this.c = "MICROSECOND";
            this.d = j / 1000;
        } else {
            this.c = "NANOSECOND";
            this.d = j;
        }
    }

    public final zrg b(int i) {
        return new zrg(Math.multiplyExact(this.b, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zrg) {
            return this.b == ((zrg) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final String toString() {
        long j = this.d;
        String str = this.c;
        if (j == 1) {
            return str;
        }
        return j + LicenseUtility.SEPARATOR + str;
    }
}
