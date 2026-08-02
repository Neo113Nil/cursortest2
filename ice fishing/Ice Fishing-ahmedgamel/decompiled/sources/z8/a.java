package z8;

import kotlin.jvm.internal.h;
import y8.m;
import y8.s;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f42244a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f42245b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Q7.a.f2701a);
        h.d(bytes, "getBytes(...)");
        f42244a = bytes;
        f42245b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(long j6, y8.e eVar) {
        h.e(eVar, "<this>");
        if (j6 > 0) {
            long j9 = j6 - 1;
            if (eVar.k(j9) == 13) {
                String F8 = eVar.F(j9, Q7.a.f2701a);
                eVar.H(2L);
                return F8;
            }
        }
        String F9 = eVar.F(j6, Q7.a.f2701a);
        eVar.H(1L);
        return F9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r19 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(y8.e eVar, m mVar, boolean z6) {
        int i;
        byte[] bArr;
        int i4;
        int i6;
        s sVar;
        byte[] bArr2;
        int i9;
        h.e(eVar, "<this>");
        s sVar2 = eVar.f41923n;
        if (sVar2 == null) {
            return z6 ? -2 : -1;
        }
        int i10 = sVar2.f41959b;
        int i11 = sVar2.f41960c;
        byte[] bArr3 = sVar2.f41958a;
        s sVar3 = sVar2;
        int i12 = -1;
        int i13 = 0;
        loop0: while (true) {
            int i14 = i13 + 1;
            int[] iArr = mVar.f41942u;
            int i15 = iArr[i13];
            int i16 = i13 + 2;
            int i17 = iArr[i14];
            if (i17 != -1) {
                i12 = i17;
            }
            if (sVar3 == null) {
                break;
            }
            if (i15 >= 0) {
                int i18 = i10 + 1;
                int i19 = bArr3[i10] & 255;
                int i20 = i16 + i15;
                while (i16 != i20) {
                    if (i19 == iArr[i16]) {
                        i = iArr[i16 + i15];
                        if (i18 == i11) {
                            sVar3 = sVar3.f41963f;
                            h.b(sVar3);
                            i6 = sVar3.f41959b;
                            i4 = sVar3.f41960c;
                            bArr = sVar3.f41958a;
                            if (sVar3 == sVar2) {
                                sVar3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i4 = i11;
                            i6 = i18;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        byte[] bArr4 = bArr;
                        i13 = -i;
                        i10 = i6;
                        i11 = i4;
                        bArr3 = bArr4;
                    } else {
                        i16++;
                    }
                }
                break loop0;
            }
            int i21 = (i15 * (-1)) + i16;
            while (true) {
                int i22 = i10 + 1;
                int i23 = i16 + 1;
                if ((bArr3[i10] & 255) != iArr[i16]) {
                    break loop0;
                }
                boolean z9 = i23 == i21;
                if (i22 == i11) {
                    h.b(sVar3);
                    s sVar4 = sVar3.f41963f;
                    h.b(sVar4);
                    i9 = sVar4.f41959b;
                    int i24 = sVar4.f41960c;
                    bArr2 = sVar4.f41958a;
                    if (sVar4 != sVar2) {
                        sVar = sVar4;
                        i11 = i24;
                    } else {
                        if (!z9) {
                            break loop0;
                        }
                        i11 = i24;
                        sVar = null;
                    }
                } else {
                    sVar = sVar3;
                    bArr2 = bArr3;
                    i9 = i22;
                }
                if (z9) {
                    i = iArr[i23];
                    int i25 = i9;
                    i4 = i11;
                    i6 = i25;
                    byte[] bArr5 = bArr2;
                    sVar3 = sVar;
                    bArr = bArr5;
                    break;
                }
                i10 = i9;
                bArr3 = bArr2;
                sVar3 = sVar;
                i16 = i23;
            }
        }
        return i12;
    }
}
