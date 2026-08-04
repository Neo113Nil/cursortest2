package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public class o extends StringsKt__StringNumberConversionsKt {
    public static final boolean b(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Iterable intRange = new IntRange(0, charSequence.length() - 1);
        if ((intRange instanceof Collection) && ((Collection) intRange).isEmpty()) {
            z = true;
        } else {
            Iterator it = intRange.iterator();
            while (((n.c) it).f218c) {
                char cCharAt = charSequence.charAt(((a0) it).a());
                if (!(Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt))) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public static final boolean c(String str, int i2, String other, int i3, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z ? str.regionMatches(i2, other, i3, i4) : str.regionMatches(z, i2, other, i3, i4);
    }

    public static boolean d(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return str.startsWith(prefix);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006a A[PHI: r13
      0x006a: PHI (r13v2 long) = (r13v1 long), (r13v4 long) binds: [B:28:0x005c, B:32:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075 A[LOOP:0: B:23:0x004d->B:37:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0073 A[SYNTHETIC] */
    public static Long e(String str) {
        byte b2;
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char cCharAt = str.charAt(0);
            boolean z = true;
            if (cCharAt < '0') {
                b2 = -1;
            } else {
                b2 = cCharAt == '0' ? (byte) 0 : (byte) 1;
            }
            long j4 = -9223372036854775807L;
            if (b2 >= 0) {
                z = false;
            } else if (length != 1) {
                if (cCharAt == '-') {
                    j4 = Long.MIN_VALUE;
                    i2 = 1;
                } else if (cCharAt == '+') {
                    z = false;
                    i2 = 1;
                }
            }
            long j5 = -256204778801521550L;
            long j6 = 0;
            long j7 = -256204778801521550L;
            while (i2 < length) {
                int iDigit = Character.digit((int) str.charAt(i2), 10);
                if (iDigit >= 0) {
                    if (j6 >= j7) {
                        j2 = j6 * ((long) 10);
                        j3 = iDigit;
                        if (j2 < j4 + j3) {
                            j6 = j2 - j3;
                            i2++;
                            j5 = -256204778801521550L;
                        }
                    } else if (j7 == j5) {
                        j7 = j4 / ((long) 10);
                        if (j6 >= j7) {
                            j2 = j6 * ((long) 10);
                            j3 = iDigit;
                            if (j2 < j4 + j3) {
                                j6 = j2 - j3;
                                i2++;
                                j5 = -256204778801521550L;
                            }
                        }
                    }
                }
            }
            return z ? Long.valueOf(j6) : Long.valueOf(-j6);
        }
        return null;
    }
}
