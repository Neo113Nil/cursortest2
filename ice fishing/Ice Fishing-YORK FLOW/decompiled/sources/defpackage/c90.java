package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class c90 implements java.lang.Comparable, java.io.Serializable {
    public static final /* synthetic */ int QiMR8OkAhezm = 0;
    public final long WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    static {
        new defpackage.c90(0, -31557014167219200L);
        new defpackage.c90(999999999, 31556889864403199L);
    }

    public c90(int i, long j) {
        this.WDYagTQQm9ns = j;
        this.oh71FJcDz6S2 = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            defpackage.h7.w7APNrr0aGRc("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        defpackage.c90 c90Var = (defpackage.c90) obj;
        c90Var.getClass();
        int h3m55N1URyyK = defpackage.ma0.h3m55N1URyyK(this.WDYagTQQm9ns, c90Var.WDYagTQQm9ns);
        return h3m55N1URyyK != 0 ? h3m55N1URyyK : defpackage.ma0.fNwYGHIYeJcR(this.oh71FJcDz6S2, c90Var.oh71FJcDz6S2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.c90)) {
            return false;
        }
        defpackage.c90 c90Var = (defpackage.c90) obj;
        return this.WDYagTQQm9ns == c90Var.WDYagTQQm9ns && this.oh71FJcDz6S2 == c90Var.oh71FJcDz6S2;
    }

    public final int hashCode() {
        return (this.oh71FJcDz6S2 * 51) + java.lang.Long.hashCode(this.WDYagTQQm9ns);
    }

    public final java.lang.String toString() {
        long j;
        int[] iArr;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long j2 = this.WDYagTQQm9ns;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + (i3 / 10));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (java.lang.Math.abs(i6) < 1000) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((java.lang.CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        defpackage.nn.BHfvd2J71qpO(sb, sb, i4);
        sb.append('-');
        defpackage.nn.BHfvd2J71qpO(sb, sb, i5);
        sb.append('T');
        defpackage.nn.BHfvd2J71qpO(sb, sb, i7);
        sb.append(':');
        defpackage.nn.BHfvd2J71qpO(sb, sb, i9);
        sb.append(':');
        defpackage.nn.BHfvd2J71qpO(sb, sb, i10);
        int i12 = this.oh71FJcDz6S2;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = defpackage.nn.oh71FJcDz6S2;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            java.lang.String valueOf = java.lang.String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
