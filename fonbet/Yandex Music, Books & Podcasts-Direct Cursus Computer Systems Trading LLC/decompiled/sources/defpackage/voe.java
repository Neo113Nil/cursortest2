package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class voe implements Comparable, Serializable {
    public static final voe c = new voe(-31557014167219200L, 0);
    public static final voe d = new voe(31556889864403199L, 999999999);
    public final long a;
    public final int b;

    public voe(long j, int i) {
        this.a = j;
        this.b = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            xq0.x("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i = xoe.a;
        zoe zoeVar = new zoe();
        zoeVar.a = this.a;
        zoeVar.b = this.b;
        return zoeVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        voe voeVar = (voe) obj;
        voeVar.getClass();
        int f = Intrinsics.f(this.a, voeVar.a);
        return f != 0 ? f : Intrinsics.e(this.b, voeVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voe)) {
            return false;
        }
        voe voeVar = (voe) obj;
        return this.a == voeVar.a && this.b == voeVar.b;
    }

    public final int hashCode() {
        return (this.b * 51) + Long.hashCode(this.a);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.a;
        long j3 = j2 / 86400;
        long j4 = 0;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j5 = j2 % 86400;
        int i = (int) (j5 + (86400 & (((j5 ^ 86400) & ((-j5) | j5)) >> 63)));
        long j6 = (j3 + 719528) - 60;
        if (j6 < 0) {
            long j7 = 146097;
            long j8 = ((j6 + 1) / j7) - 1;
            j = 0;
            j4 = 400 * j8;
            j6 += (-j8) * j7;
        } else {
            j = 0;
        }
        long j9 = 400;
        long j10 = ((j9 * j6) + 591) / 146097;
        long j11 = 365;
        long j12 = 4;
        long j13 = 100;
        long j14 = j6 - ((j10 / j9) + (((j10 / j12) + (j11 * j10)) - (j10 / j13)));
        if (j14 < j) {
            j10--;
            j14 = j6 - ((j10 / j9) + (((j10 / j12) + (j11 * j10)) - (j10 / j13)));
        }
        int i2 = (int) j14;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j10 + j4 + (i3 / 10));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        bow.r(sb, sb, i4);
        sb.append('-');
        bow.r(sb, sb, i5);
        sb.append('T');
        bow.r(sb, sb, i7);
        sb.append(':');
        bow.r(sb, sb, i9);
        sb.append(':');
        bow.r(sb, sb, i10);
        int i12 = this.b;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = bow.k;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String valueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
