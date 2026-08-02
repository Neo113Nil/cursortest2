package com.anythink.core.common.s.a;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final int f17119c = 2048;

    /* renamed from: d, reason: collision with root package name */
    private static final String f17120d = "Invalid String";

    /* renamed from: a, reason: collision with root package name */
    public byte[] f17121a;

    /* renamed from: b, reason: collision with root package name */
    public int f17122b;

    /* renamed from: e, reason: collision with root package name */
    private char[] f17123e;

    public f(int i) {
        this(new byte[i], 0);
    }

    private int e() {
        byte[] bArr = this.f17121a;
        int i = this.f17122b;
        int i4 = i + 1;
        this.f17122b = i4;
        byte b9 = bArr[i];
        if ((b9 >> 7) == 0) {
            return b9;
        }
        int i6 = i + 2;
        this.f17122b = i6;
        int i9 = (bArr[i4] << 7) | (b9 & Byte.MAX_VALUE);
        if ((i9 >> 14) == 0) {
            return i9;
        }
        int i10 = i + 3;
        this.f17122b = i10;
        int i11 = (i9 & 16383) | (bArr[i6] << 14);
        if ((i11 >> 21) == 0) {
            return i11;
        }
        int i12 = i + 4;
        this.f17122b = i12;
        int i13 = (i11 & 2097151) | (bArr[i10] << 21);
        if ((i13 >> 28) == 0) {
            return i13;
        }
        this.f17122b = i + 5;
        return (bArr[i12] << 28) | (i13 & 268435455);
    }

    private static int f(int i) {
        if ((i >> 7) == 0) {
            return 1;
        }
        if ((i >> 14) == 0) {
            return 2;
        }
        if ((i >> 21) == 0) {
            return 3;
        }
        return (i >> 28) == 0 ? 4 : 5;
    }

    private byte[] g(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f17121a, this.f17122b, bArr, 0, i);
        this.f17122b += i;
        return bArr;
    }

    private char[] h(int i) {
        char[] cArr = this.f17123e;
        if (cArr == null) {
            char[] cArr2 = i <= 256 ? new char[256] : new char[f17119c];
            this.f17123e = cArr2;
            return cArr2;
        }
        if (cArr.length >= i) {
            return cArr;
        }
        char[] cArr3 = new char[f17119c];
        this.f17123e = cArr3;
        return cArr3;
    }

    public final byte a() {
        byte[] bArr = this.f17121a;
        int i = this.f17122b;
        this.f17122b = i + 1;
        return bArr[i];
    }

    public final short b() {
        byte[] bArr = this.f17121a;
        int i = this.f17122b;
        int i4 = i + 1;
        this.f17122b = i4;
        int i6 = bArr[i] & 255;
        this.f17122b = i + 2;
        return (short) ((bArr[i4] << 8) | i6);
    }

    public final int c() {
        byte[] bArr = this.f17121a;
        int i = this.f17122b;
        int i4 = i + 1;
        this.f17122b = i4;
        int i6 = bArr[i] & 255;
        int i9 = i + 2;
        this.f17122b = i9;
        int i10 = ((bArr[i4] & 255) << 8) | i6;
        int i11 = i + 3;
        this.f17122b = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 16);
        this.f17122b = i + 4;
        return (bArr[i11] << 24) | i12;
    }

    public final long d() {
        long c9 = c(this.f17122b);
        this.f17122b += 8;
        return c9;
    }

    public f(byte[] bArr) {
        this(bArr, 0);
    }

    private int c(int i, int i4) {
        while ((i4 & (-128)) != 0) {
            this.f17121a[i] = (byte) ((i4 & com.anythink.expressad.video.module.a.a.f22515R) | 128);
            i4 >>>= 7;
            i++;
        }
        int i6 = i + 1;
        this.f17121a[i] = (byte) i4;
        return i6;
    }

    public final void a(byte b9) {
        byte[] bArr = this.f17121a;
        int i = this.f17122b;
        this.f17122b = i + 1;
        bArr[i] = b9;
    }

    public final void b(int i) {
        byte[] bArr = this.f17121a;
        int i4 = this.f17122b;
        int i6 = i4 + 1;
        this.f17122b = i6;
        bArr[i4] = (byte) i;
        int i9 = i4 + 2;
        this.f17122b = i9;
        bArr[i6] = (byte) (i >> 8);
        int i10 = i4 + 3;
        this.f17122b = i10;
        bArr[i9] = (byte) (i >> 16);
        this.f17122b = i4 + 4;
        bArr[i10] = (byte) (i >> 24);
    }

    public f(byte[] bArr, int i) {
        this.f17123e = null;
        this.f17121a = bArr;
        this.f17122b = i;
    }

    private double d(com.anythink.core.common.s.a.a.a aVar) {
        return Double.longBitsToDouble(b(aVar));
    }

    public final void a(short s9) {
        byte[] bArr = this.f17121a;
        int i = this.f17122b;
        int i4 = i + 1;
        this.f17122b = i4;
        bArr[i] = (byte) s9;
        this.f17122b = i + 2;
        bArr[i4] = (byte) (s9 >> 8);
    }

    public final long c(int i) {
        byte[] bArr = this.f17121a;
        int i4 = i + 6;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i4] & 255) << 48) | (bArr[i + 7] << 56);
    }

    public final String d(int i) {
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        String str = i > f17119c ? new String(this.f17121a, this.f17122b, i, StandardCharsets.UTF_8) : a(this.f17121a, this.f17122b, i);
        this.f17122b += i;
        return str;
    }

    private float c(com.anythink.core.common.s.a.a.a aVar) {
        return Float.intBitsToFloat(a(aVar));
    }

    public final int a(int i) {
        byte[] bArr = this.f17121a;
        int i4 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i4 | ((bArr[i + 2] & 255) << 16);
    }

    private void c(String str) {
        byte[] bArr = this.f17121a;
        int i = this.f17122b;
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i6 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                bArr[i] = (byte) charAt;
                i++;
            } else if (charAt < f17119c) {
                int i9 = i + 1;
                bArr[i] = (byte) ((charAt >>> 6) | 192);
                i += 2;
                bArr[i9] = (byte) ((charAt & '?') | 128);
            } else if (charAt >= 55296 && charAt <= 57343) {
                i4 += 2;
                int charAt2 = ((charAt << '\n') + str.charAt(i6)) - 56613888;
                bArr[i] = (byte) ((charAt2 >>> 18) | 240);
                bArr[i + 1] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i10 = i + 3;
                bArr[i + 2] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i += 4;
                bArr[i10] = (byte) ((charAt2 & 63) | 128);
            } else {
                bArr[i] = (byte) ((charAt >>> '\f') | 224);
                int i11 = i + 2;
                bArr[i + 1] = (byte) (((charAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i11] = (byte) ((charAt & '?') | 128);
            }
            i4 = i6;
        }
        this.f17122b = i;
    }

    private void e(int i) {
        int i4 = this.f17122b;
        while ((i & (-128)) != 0) {
            this.f17121a[i4] = (byte) ((i & com.anythink.expressad.video.module.a.a.f22515R) | 128);
            i >>>= 7;
            i4++;
        }
        this.f17121a[i4] = (byte) i;
        this.f17122b = i4 + 1;
    }

    public final int a(com.anythink.core.common.s.a.a.a aVar) {
        return aVar != null ? aVar.d() : c();
    }

    public final long b(com.anythink.core.common.s.a.a.a aVar) {
        return aVar != null ? aVar.f() : d();
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int i6 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                i4++;
            } else if (charAt < f17119c) {
                i4 += 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i4 += 3;
            } else {
                i += 2;
                i4 += 4;
            }
            i = i6;
        }
        return i4;
    }

    public final void a(int i, int i4) {
        byte[] bArr = this.f17121a;
        bArr[i] = (byte) i4;
        bArr[i + 1] = (byte) (i4 >> 8);
        bArr[i + 2] = (byte) (i4 >> 16);
        bArr[i + 3] = (byte) (i4 >> 24);
    }

    public final long b(int i, int i4) {
        long j6 = 0;
        if (i4 <= 0) {
            return 0L;
        }
        int i6 = i4 >> 3;
        int i9 = i4 & 7;
        int i10 = 0;
        int i11 = i;
        for (int i12 = 0; i12 < i6; i12++) {
            j6 ^= c(i11);
            i11 += 8;
        }
        while (i10 < (i9 << 3)) {
            j6 ^= (this.f17121a[i11] & 255) << i10;
            i10 += 8;
            i11++;
        }
        int i13 = (i & 7) << 3;
        return (j6 >>> (64 - i13)) | (j6 << i13);
    }

    private byte[] b(com.anythink.core.common.s.a.a.a aVar, int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f17121a, this.f17122b, bArr, 0, i);
        this.f17122b += i;
        return aVar != null ? aVar.b() : bArr;
    }

    public final void a(int i, long j6) {
        byte[] bArr = this.f17121a;
        bArr[i] = (byte) j6;
        bArr[i + 1] = (byte) (j6 >> 8);
        bArr[i + 2] = (byte) (j6 >> 16);
        bArr[i + 3] = (byte) (j6 >> 24);
        bArr[i + 4] = (byte) (j6 >> 32);
        bArr[i + 5] = (byte) (j6 >> 40);
        bArr[i + 6] = (byte) (j6 >> 48);
        bArr[i + 7] = (byte) (j6 >> 56);
    }

    public final void a(long j6) {
        a(this.f17122b, j6);
        this.f17122b += 8;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f17121a, this.f17122b, length);
            this.f17122b += length;
        }
    }

    public final String a(com.anythink.core.common.s.a.a.a aVar, int i) {
        String str;
        if (aVar != null && i > 0) {
            byte[] bArr = this.f17121a;
            int i4 = this.f17122b;
            Arrays.copyOfRange(bArr, i4, i4 + i);
            byte[] b9 = aVar.b();
            if (b9 == null) {
                str = null;
            } else {
                str = b9.length > f17119c ? new String(b9, StandardCharsets.UTF_8) : a(b9, 0, b9.length);
            }
            this.f17122b += i;
            return str;
        }
        return d(i);
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = this.f17121a;
        int i = this.f17122b;
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i6 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                bArr[i] = (byte) charAt;
                i++;
            } else if (charAt < f17119c) {
                int i9 = i + 1;
                bArr[i] = (byte) ((charAt >>> 6) | 192);
                i += 2;
                bArr[i9] = (byte) ((charAt & '?') | 128);
            } else if (charAt >= 55296 && charAt <= 57343) {
                i4 += 2;
                int charAt2 = ((charAt << '\n') + str.charAt(i6)) - 56613888;
                bArr[i] = (byte) ((charAt2 >>> 18) | 240);
                bArr[i + 1] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i10 = i + 3;
                bArr[i + 2] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i += 4;
                bArr[i10] = (byte) ((charAt2 & 63) | 128);
            } else {
                bArr[i] = (byte) ((charAt >>> '\f') | 224);
                int i11 = i + 2;
                bArr[i + 1] = (byte) (((charAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i11] = (byte) ((charAt & '?') | 128);
            }
            i4 = i6;
        }
        this.f17122b = i;
    }

    public final synchronized String a(byte[] bArr, int i, int i4) {
        char[] cArr;
        int i6;
        int i9;
        try {
            cArr = this.f17123e;
            if (cArr == null) {
                if (i4 <= 256) {
                    cArr = new char[256];
                } else {
                    cArr = new char[f17119c];
                }
                this.f17123e = cArr;
            } else if (cArr.length < i4) {
                cArr = new char[f17119c];
                this.f17123e = cArr;
            }
            int i10 = i4 + i;
            i6 = 0;
            while (i < i10) {
                int i11 = i + 1;
                byte b9 = bArr[i];
                if (b9 > 0) {
                    cArr[i6] = (char) b9;
                    i6++;
                    i = i11;
                } else {
                    if (b9 < -32) {
                        i += 2;
                        byte b10 = bArr[i11];
                        if (b9 >= -62 && b10 <= -65) {
                            i9 = i6 + 1;
                            cArr[i6] = (char) ((b10 & c.f17105c) | ((b9 & 31) << 6));
                        } else {
                            throw new IllegalArgumentException(f17120d);
                        }
                    } else if (b9 < -16) {
                        int i12 = i + 2;
                        byte b11 = bArr[i11];
                        i += 3;
                        byte b12 = bArr[i12];
                        if ((b9 != -32 || b11 >= -96) && ((b9 != -19 || b11 < -96) && b11 <= -65 && b12 <= -65)) {
                            i9 = i6 + 1;
                            cArr[i6] = (char) (((b11 & c.f17105c) << 6) | ((b9 & 15) << 12) | (b12 & c.f17105c));
                        } else {
                            throw new IllegalArgumentException(f17120d);
                        }
                    } else {
                        byte b13 = bArr[i11];
                        int i13 = i + 3;
                        byte b14 = bArr[i + 2];
                        i += 4;
                        byte b15 = bArr[i13];
                        if (b13 <= -65) {
                            if ((((b13 + 112) + (b9 << 28)) >> 30) == 0 && b14 <= -65 && b15 <= -65) {
                                int i14 = ((b13 & c.f17105c) << 12) | ((b9 & 7) << 18) | ((b14 & c.f17105c) << 6) | (b15 & c.f17105c);
                                int i15 = i6 + 1;
                                cArr[i6] = (char) ((i14 >>> 10) + 55232);
                                i6 += 2;
                                cArr[i15] = (char) ((i14 & 1023) + 56320);
                            }
                        }
                        throw new IllegalArgumentException(f17120d);
                    }
                    i6 = i9;
                }
            }
            if (i <= i10) {
            } else {
                throw new IllegalArgumentException(f17120d);
            }
        } finally {
        }
        return new String(cArr, 0, i6);
    }
}
