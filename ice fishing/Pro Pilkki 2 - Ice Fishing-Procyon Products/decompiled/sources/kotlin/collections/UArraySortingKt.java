package kotlin.collections;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UArraySortingKt {
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m658partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM278getw2LRezQ = UByteArray.m278getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM278getw2LRezQ = UByteArray.m278getw2LRezQ(bArr, i) & UByte.MAX_VALUE;
                i3 = bM278getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM278getw2LRezQ, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m278getw2LRezQ(bArr, i2) & UByte.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM278getw2LRezQ2 = UByteArray.m278getw2LRezQ(bArr, i);
                UByteArray.m283setVurrAj0(bArr, i, UByteArray.m278getw2LRezQ(bArr, i2));
                UByteArray.m283setVurrAj0(bArr, i2, bM278getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m662quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM658partition4UcCI2c = m658partition4UcCI2c(bArr, i, i2);
        int i3 = iM658partition4UcCI2c - 1;
        if (i < i3) {
            m662quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM658partition4UcCI2c < i2) {
            m662quickSort4UcCI2c(bArr, iM658partition4UcCI2c, i2);
        }
    }

    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m659partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM541getMh2AYeg = UShortArray.m541getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM541getMh2AYeg = UShortArray.m541getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM541getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM541getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m541getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM541getMh2AYeg2 = UShortArray.m541getMh2AYeg(sArr, i);
                UShortArray.m546set01HTLdE(sArr, i, UShortArray.m541getMh2AYeg(sArr, i2));
                UShortArray.m546set01HTLdE(sArr, i2, sM541getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m663quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM659partitionAa5vz7o = m659partitionAa5vz7o(sArr, i, i2);
        int i3 = iM659partitionAa5vz7o - 1;
        if (i < i3) {
            m663quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM659partitionAa5vz7o < i2) {
            m663quickSortAa5vz7o(sArr, iM659partitionAa5vz7o, i2);
        }
    }

    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m660partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM357getpVg5ArA = UIntArray.m357getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compare(UIntArray.m357getpVg5ArA(iArr, i) ^ Integer.MIN_VALUE, iM357getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (Integer.compare(UIntArray.m357getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, iM357getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM357getpVg5ArA2 = UIntArray.m357getpVg5ArA(iArr, i);
                UIntArray.m362setVXSXFK8(iArr, i, UIntArray.m357getpVg5ArA(iArr, i2));
                UIntArray.m362setVXSXFK8(iArr, i2, iM357getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m664quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM660partitionoBK06Vg = m660partitionoBK06Vg(iArr, i, i2);
        int i3 = iM660partitionoBK06Vg - 1;
        if (i < i3) {
            m664quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM660partitionoBK06Vg < i2) {
            m664quickSortoBK06Vg(iArr, iM660partitionoBK06Vg, i2);
        }
    }

    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m657partitionnroSd4(long[] jArr, int i, int i2) {
        long jM436getsVKNKU = ULongArray.m436getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compare(ULongArray.m436getsVKNKU(jArr, i) ^ Long.MIN_VALUE, jM436getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (Long.compare(ULongArray.m436getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, jM436getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM436getsVKNKU2 = ULongArray.m436getsVKNKU(jArr, i);
                ULongArray.m441setk8EXiF4(jArr, i, ULongArray.m436getsVKNKU(jArr, i2));
                ULongArray.m441setk8EXiF4(jArr, i2, jM436getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m661quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM657partitionnroSd4 = m657partitionnroSd4(jArr, i, i2);
        int i3 = iM657partitionnroSd4 - 1;
        if (i < i3) {
            m661quickSortnroSd4(jArr, i, i3);
        }
        if (iM657partitionnroSd4 < i2) {
            m661quickSortnroSd4(jArr, iM657partitionnroSd4, i2);
        }
    }

    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m666sortArray4UcCI2c(byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m662quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m667sortArrayAa5vz7o(short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m663quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m668sortArrayoBK06Vg(int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m664quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m665sortArraynroSd4(long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m661quickSortnroSd4(array, i, i2 - 1);
    }
}
