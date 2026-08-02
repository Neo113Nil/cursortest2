package defpackage;

import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public abstract class b {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        bytes.getClass();
        a = bytes;
    }

    public static final boolean a(xap xapVar, int i, byte[] bArr, int i2) {
        int i3 = xapVar.c;
        byte[] bArr2 = xapVar.a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                xapVar = xapVar.f;
                xapVar.getClass();
                bArr2 = xapVar.a;
                i = xapVar.b;
                i3 = xapVar.c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final String b(hi3 hi3Var, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (hi3Var.P(j2) == 13) {
                String F0 = hi3Var.F0(j2, Charsets.UTF_8);
                hi3Var.skip(2L);
                return F0;
            }
        }
        String F02 = hi3Var.F0(j, Charsets.UTF_8);
        hi3Var.skip(1L);
        return F02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(hi3 hi3Var, qwj qwjVar, boolean z) {
        int i;
        int i2;
        int i3;
        xap xapVar;
        int i4;
        qwjVar.getClass();
        xap xapVar2 = hi3Var.a;
        if (xapVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = xapVar2.a;
        int i5 = xapVar2.b;
        int i6 = xapVar2.c;
        int[] iArr = qwjVar.c;
        xap xapVar3 = xapVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (xapVar3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            xapVar3 = xapVar3.f;
                            xapVar3.getClass();
                            int i16 = xapVar3.b;
                            byte[] bArr2 = xapVar3.a;
                            i2 = xapVar3.c;
                            if (xapVar3 == xapVar2) {
                                i3 = i16;
                                bArr = bArr2;
                                xapVar3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) != iArr[i11]) {
                    break loop0;
                }
                boolean z2 = i20 == i18;
                if (i19 == i6) {
                    xapVar3.getClass();
                    xap xapVar4 = xapVar3.f;
                    xapVar4.getClass();
                    i3 = xapVar4.b;
                    byte[] bArr3 = xapVar4.a;
                    i4 = xapVar4.c;
                    if (xapVar4 != xapVar2) {
                        xapVar = xapVar4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        xapVar = null;
                    }
                } else {
                    xapVar = xapVar3;
                    i4 = i6;
                    i3 = i19;
                }
                if (z2) {
                    i = iArr[i20];
                    int i21 = i4;
                    xapVar3 = xapVar;
                    i2 = i21;
                    break;
                }
                i5 = i3;
                i6 = i4;
                xapVar3 = xapVar;
                i11 = i20;
            }
        }
        return i7;
    }
}
