package kotlin.text;

import defpackage.aet;
import defpackage.get;
import defpackage.het;
import defpackage.met;
import defpackage.net;
import defpackage.uet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class h {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte a(String str) {
        aet aetVar;
        str.getClass();
        het c = c(str);
        if (c != null) {
            int i = c.a;
            if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) <= 0) {
                aetVar = new aet((byte) i);
                if (aetVar == null) {
                    return aetVar.a;
                }
                StringsKt__StringNumberConversionsKt.j(str);
                throw null;
            }
        }
        aetVar = null;
        if (aetVar == null) {
        }
    }

    public static final int b(String str) {
        str.getClass();
        het c = c(str);
        if (c != null) {
            return c.a;
        }
        StringsKt__StringNumberConversionsKt.j(str);
        throw null;
    }

    public static final het c(String str) {
        int i;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.e(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        get getVar = het.b;
        int i3 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i5 = i2 * 10;
            int i6 = digit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new het(i2);
    }

    public static final long d(String str) {
        str.getClass();
        net e = e(str);
        if (e != null) {
            return e.a;
        }
        StringsKt__StringNumberConversionsKt.j(str);
        throw null;
    }

    public static final net e(String str) {
        int i;
        long j;
        str.getClass();
        str.getClass();
        int i2 = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        int i3 = 1;
        if (Intrinsics.e(charAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i = 1;
        }
        long j2 = 10;
        met metVar = net.b;
        long j3 = 0;
        long j4 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), i2);
            if (digit < 0) {
                return null;
            }
            int i4 = length;
            long j5 = j3 ^ Long.MIN_VALUE;
            int i5 = i;
            if (Long.compare(j5, j4 ^ Long.MIN_VALUE) <= 0) {
                j = j2;
            } else {
                if (j4 != 512409557603043100L) {
                    return null;
                }
                if (j2 >= 0) {
                    long j6 = (Long.MAX_VALUE / j2) << i3;
                    j = j2;
                    j4 = j6 + ((((-1) - (j6 * j2)) ^ Long.MIN_VALUE) >= (j2 ^ Long.MIN_VALUE) ? i3 : 0);
                } else if (Long.MAX_VALUE < (j2 ^ Long.MIN_VALUE)) {
                    j = j2;
                    j4 = 0;
                } else {
                    j4 = 1;
                    j = j2;
                }
                if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j7 = j3 * j;
            get getVar = het.b;
            long j8 = (digit & 4294967295L) + j7;
            if (Long.compare(j8 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i5 + 1;
            j3 = j8;
            length = i4;
            j2 = j;
            i2 = 10;
            i3 = 1;
        }
        return new net(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final short f(String str) {
        uet uetVar;
        str.getClass();
        het c = c(str);
        if (c != null) {
            int i = c.a;
            if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) <= 0) {
                uetVar = new uet((short) i);
                if (uetVar == null) {
                    return uetVar.a;
                }
                StringsKt__StringNumberConversionsKt.j(str);
                throw null;
            }
        }
        uetVar = null;
        if (uetVar == null) {
        }
    }
}
