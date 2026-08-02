package com.yandex.passport.common.time;

import defpackage.xq0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements Comparable {
    public final long a;

    public static long a(int i, int i2, int i3) {
        return b(i, 0, i2, i3);
    }

    public static long b(long j, long j2, long j3, long j4) {
        return TimeUnit.SECONDS.toMillis(j3) + TimeUnit.MINUTES.toMillis(j2) + TimeUnit.HOURS.toMillis(j) + j4;
    }

    public static /* synthetic */ long c(int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return a(i, i2, i3);
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String f(long j, String str) {
        String str2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        String str3;
        boolean z;
        ArrayList arrayList = new ArrayList(str.length());
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        StringBuilder sb = null;
        b bVar = null;
        while (true) {
            String str4 = "M";
            str2 = "s";
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!z2 || charAt == '\'') {
                if (charAt != '\'') {
                    if (charAt == 'H') {
                        str4 = "H";
                    } else if (charAt != 'M') {
                        if (charAt == 'S') {
                            str4 = "S";
                        } else if (charAt == 'd') {
                            str4 = "d";
                        } else if (charAt == 'm') {
                            str4 = "m";
                        } else if (charAt == 's') {
                            str4 = "s";
                        } else if (charAt != 'y') {
                            if (sb == null) {
                                sb = new StringBuilder();
                                arrayList.add(new b(sb));
                            }
                            sb.append(charAt);
                        } else {
                            str4 = "y";
                        }
                    }
                    if (str4 != null) {
                        if (bVar == null || !bVar.a.equals(str4)) {
                            bVar = new b(str4);
                            arrayList.add(bVar);
                        } else {
                            bVar.b++;
                        }
                        sb = null;
                    }
                } else if (z2) {
                    z2 = false;
                    sb = null;
                } else {
                    sb = new StringBuilder();
                    arrayList.add(new b(sb));
                    z2 = true;
                }
                str4 = null;
                if (str4 != null) {
                }
            } else {
                sb.getClass();
                sb.append(charAt);
            }
            i++;
        }
        if (z2) {
            xq0.o("Unmatched quote in format: ".concat(str));
            return null;
        }
        b[] bVarArr = (b[]) arrayList.toArray(new b[0]);
        if (com.yandex.passport.internal.ui.a.o(bVarArr, "d")) {
            long j11 = j / 86400000;
            j3 = j - (86400000 * j11);
            j2 = j11;
        } else {
            j2 = 0;
            j3 = j;
        }
        if (com.yandex.passport.internal.ui.a.o(bVarArr, "H")) {
            long j12 = j3 / 3600000;
            j3 -= 3600000 * j12;
            j4 = j12;
        } else {
            j4 = 0;
        }
        if (com.yandex.passport.internal.ui.a.o(bVarArr, "m")) {
            long j13 = j3 / 60000;
            j3 -= 60000 * j13;
            j5 = j13;
        } else {
            j5 = 0;
        }
        if (com.yandex.passport.internal.ui.a.o(bVarArr, "s")) {
            long j14 = j3 / 1000;
            j3 -= 1000 * j14;
            j6 = j14;
        } else {
            j6 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = bVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length2) {
            b[] bVarArr2 = bVarArr;
            b bVar2 = bVarArr2[i2];
            int i3 = i2;
            Object obj = bVar2.a;
            int i4 = bVar2.b;
            boolean z4 = z3;
            if (obj instanceof StringBuilder) {
                sb2.append(((StringBuilder) obj).toString());
                long j15 = j4;
                j9 = j2;
                j10 = j3;
                j8 = j15;
            } else {
                if (obj.equals("y")) {
                    j7 = j3;
                    sb2.append(com.yandex.plus.core.locale.b.t(i4, 0L));
                } else {
                    j7 = j3;
                    if (obj.equals("M")) {
                        sb2.append(com.yandex.plus.core.locale.b.t(i4, 0L));
                    } else if (obj.equals("d")) {
                        sb2.append(com.yandex.plus.core.locale.b.t(i4, j2));
                    } else {
                        if (obj.equals("H")) {
                            j8 = j4;
                            sb2.append(com.yandex.plus.core.locale.b.t(i4, j8));
                            j9 = j2;
                        } else {
                            j8 = j4;
                            if (obj.equals("m")) {
                                j9 = j2;
                                sb2.append(com.yandex.plus.core.locale.b.t(i4, j5));
                            } else {
                                j9 = j2;
                                long j16 = j5;
                                if (obj.equals(str2)) {
                                    j5 = j16;
                                    sb2.append(com.yandex.plus.core.locale.b.t(i4, j6));
                                    str3 = str2;
                                    z = true;
                                    j10 = j7;
                                    i2 = i3 + 1;
                                    str2 = str3;
                                    boolean z5 = z;
                                    bVarArr = bVarArr2;
                                    long j17 = j8;
                                    z3 = z5;
                                    j3 = j10;
                                    j2 = j9;
                                    j4 = j17;
                                } else {
                                    j5 = j16;
                                    long j18 = j6;
                                    if (obj.equals("S")) {
                                        if (z4) {
                                            j6 = j18;
                                            str3 = str2;
                                            j10 = j7;
                                            sb2.append(com.yandex.plus.core.locale.b.t((int) Math.max(3.0d, i4), j10));
                                        } else {
                                            j6 = j18;
                                            str3 = str2;
                                            j10 = j7;
                                            sb2.append(com.yandex.plus.core.locale.b.t(i4, j10));
                                        }
                                        z = false;
                                        i2 = i3 + 1;
                                        str2 = str3;
                                        boolean z52 = z;
                                        bVarArr = bVarArr2;
                                        long j172 = j8;
                                        z3 = z52;
                                        j3 = j10;
                                        j2 = j9;
                                        j4 = j172;
                                    } else {
                                        j6 = j18;
                                        j10 = j7;
                                    }
                                }
                            }
                        }
                        str3 = str2;
                        j10 = j7;
                        z = false;
                        i2 = i3 + 1;
                        str2 = str3;
                        boolean z522 = z;
                        bVarArr = bVarArr2;
                        long j1722 = j8;
                        z3 = z522;
                        j3 = j10;
                        j2 = j9;
                        j4 = j1722;
                    }
                }
                str3 = str2;
                j8 = j4;
                z = false;
                j9 = j2;
                j10 = j7;
                i2 = i3 + 1;
                str2 = str3;
                boolean z5222 = z;
                bVarArr = bVarArr2;
                long j17222 = j8;
                z3 = z5222;
                j3 = j10;
                j2 = j9;
                j4 = j17222;
            }
            str3 = str2;
            z = z4;
            i2 = i3 + 1;
            str2 = str3;
            boolean z52222 = z;
            bVarArr = bVarArr2;
            long j172222 = j8;
            z3 = z52222;
            j3 = j10;
            j2 = j9;
            j4 = j172222;
        }
        return sb2.toString();
    }

    public static String g(long j) {
        return (j / 60000) / ((long) 60) > 0 ? f(j, "HH:mm:ss") : f(j, "mm:ss");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.f(this.a, ((a) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
