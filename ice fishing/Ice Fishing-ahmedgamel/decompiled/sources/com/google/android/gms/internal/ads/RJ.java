package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class RJ {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f27947a = Charset.forName("UTF-8");

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e5, code lost:
    
        if (r8 == 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e7, code lost:
    
        if (r8 == 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e9, code lost:
    
        if (r8 == 3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00eb, code lost:
    
        if (r8 == 4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0105, code lost:
    
        if (r10 != r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0107, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0108, code lost:
    
        r0 = new byte[r10];
        java.lang.System.arraycopy(r4, 0, r0, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ee, code lost:
    
        r0 = r10 + 1;
        r4[r10] = (byte) (r9 >> 10);
        r10 = r10 + 2;
        r4[r0] = (byte) (r9 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fd, code lost:
    
        r4[r10] = (byte) (r9 >> 4);
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(f27947a);
        int length = bytes.length;
        int i = (length * 3) / 4;
        byte[] bArr = new byte[i];
        int[] iArr = SK.f28177q0;
        int i4 = 0;
        int i6 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            if (i6 == 0) {
                while (true) {
                    int i11 = i4 + 4;
                    if (i11 > length) {
                        break;
                    }
                    i9 = (iArr[bytes[i4] & 255] << 18) | (iArr[bytes[i4 + 1] & 255] << 12) | (iArr[bytes[i4 + 2] & 255] << 6) | iArr[bytes[i4 + 3] & 255];
                    if (i9 < 0) {
                        break;
                    }
                    bArr[i10 + 2] = (byte) i9;
                    bArr[i10 + 1] = (byte) (i9 >> 8);
                    bArr[i10] = (byte) (i9 >> 16);
                    i10 += 3;
                    i4 = i11;
                }
                if (i4 >= length) {
                    i6 = 0;
                    break;
                }
                i6 = 0;
            }
            int i12 = i4 + 1;
            int i13 = iArr[bytes[i4] & 255];
            if (i6 == 0) {
                if (i13 < 0) {
                    if (i13 != -1) {
                        break;
                    }
                } else {
                    i6++;
                    i9 = i13;
                }
            } else {
                if (i6 == 1) {
                    if (i13 < 0) {
                        if (i13 != -1) {
                            break;
                        }
                    }
                    i6++;
                    i13 |= i9 << 6;
                } else if (i6 == 2) {
                    if (i13 < 0) {
                        if (i13 != -2) {
                            if (i13 != -1) {
                                break;
                            }
                        } else {
                            bArr[i10] = (byte) (i9 >> 4);
                            i6 = 4;
                            i10++;
                        }
                    }
                    i6++;
                    i13 |= i9 << 6;
                } else if (i6 == 3) {
                    if (i13 < 0) {
                        if (i13 != -2) {
                            if (i13 != -1) {
                                break;
                            }
                        } else {
                            bArr[i10 + 1] = (byte) (i9 >> 2);
                            bArr[i10] = (byte) (i9 >> 10);
                            i10 += 2;
                            i6 = 5;
                        }
                    } else {
                        int i14 = i13 | (i9 << 6);
                        bArr[i10 + 2] = (byte) i14;
                        bArr[i10 + 1] = (byte) (i14 >> 8);
                        bArr[i10] = (byte) (i14 >> 16);
                        i10 += 3;
                        i9 = i14;
                        i6 = 0;
                    }
                } else if (i6 == 4) {
                    if (i13 != -2) {
                        if (i13 != -1) {
                            break;
                        }
                    } else {
                        i6++;
                    }
                } else if (i6 == 5 && i13 != -1) {
                    break;
                }
                i9 = i13;
            }
            i4 = i12;
        }
        throw new IllegalArgumentException("bad base-64");
    }
}
