package com.anythink.basead.exoplayer.k;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final int f9259b = 255;

    /* renamed from: d, reason: collision with root package name */
    private static final String f9261d = "NalUnitUtil";

    /* renamed from: e, reason: collision with root package name */
    private static final int f9262e = 6;

    /* renamed from: f, reason: collision with root package name */
    private static final int f9263f = 7;

    /* renamed from: g, reason: collision with root package name */
    private static final int f9264g = 39;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9258a = {0, 0, 0, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f9260c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: h, reason: collision with root package name */
    private static final Object f9265h = new Object();
    private static int[] i = new int[10];

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f9266a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9267b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9268c;

        public a(int i, int i4, boolean z6) {
            this.f9266a = i;
            this.f9267b = i4;
            this.f9268c = z6;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9269a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9270b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9271c;

        /* renamed from: d, reason: collision with root package name */
        public final float f9272d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f9273e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f9274f;

        /* renamed from: g, reason: collision with root package name */
        public final int f9275g;

        /* renamed from: h, reason: collision with root package name */
        public final int f9276h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f9277j;

        public b(int i, int i4, int i6, float f2, boolean z6, boolean z9, int i9, int i10, int i11, boolean z10) {
            this.f9269a = i;
            this.f9270b = i4;
            this.f9271c = i6;
            this.f9272d = f2;
            this.f9273e = z6;
            this.f9274f = z9;
            this.f9275g = i9;
            this.f9276h = i10;
            this.i = i11;
            this.f9277j = z10;
        }
    }

    private p() {
    }

    public static int a(byte[] bArr, int i4) {
        int i6;
        synchronized (f9265h) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i4) {
                while (true) {
                    if (i9 >= i4 - 2) {
                        i9 = i4;
                        break;
                    }
                    try {
                        if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i4) {
                    int[] iArr = i;
                    if (iArr.length <= i10) {
                        i = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    i[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i6 = i4 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i6 - i11);
        }
        return i6;
    }

    private static int b(byte[] bArr, int i4) {
        return bArr[i4 + 3] & 31;
    }

    private static int c(byte[] bArr, int i4) {
        return (bArr[i4 + 3] & 126) >> 1;
    }

    private static a b(byte[] bArr, int i4, int i6) {
        t tVar = new t(bArr, i4, i6);
        tVar.a(8);
        int c9 = tVar.c();
        int c10 = tVar.c();
        tVar.a();
        return new a(c9, c10, tVar.b());
    }

    private static int c(byte[] bArr, int i4, int i6) {
        while (i4 < i6 - 2) {
            if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                return i4;
            }
            i4++;
        }
        return i6;
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i4 = 0;
        int i6 = 0;
        while (true) {
            int i9 = i4 + 1;
            if (i9 < position) {
                int i10 = byteBuffer.get(i4) & 255;
                if (i6 == 3) {
                    if (i10 == 1 && (byteBuffer.get(i9) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i4 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i10 == 0) {
                    i6++;
                }
                if (i10 != 0) {
                    i6 = 0;
                }
                i4 = i9;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean a(String str, byte b9) {
        return (o.f9237h.equals(str) && (b9 & 31) == 6) || (o.i.equals(str) && ((b9 & 126) >> 1) == 39);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(byte[] bArr, int i4, int i6) {
        int c9;
        boolean z6;
        boolean z9;
        int i9;
        boolean z10;
        boolean b9;
        int b10;
        int i10;
        t tVar = new t(bArr, i4, i6);
        tVar.a(8);
        int b11 = tVar.b(8);
        tVar.a(16);
        int c10 = tVar.c();
        if (b11 == 100 || b11 == 110 || b11 == 122 || b11 == 244 || b11 == 44 || b11 == 83 || b11 == 86 || b11 == 118 || b11 == 128 || b11 == 138) {
            c9 = tVar.c();
            boolean b12 = c9 == 3 ? tVar.b() : false;
            tVar.c();
            tVar.c();
            tVar.a();
            if (tVar.b()) {
                int i11 = c9 != 3 ? 8 : 12;
                int i12 = 0;
                while (i12 < i11) {
                    if (tVar.b()) {
                        int i13 = i12 < 6 ? 16 : 64;
                        int i14 = 8;
                        int i15 = 8;
                        for (int i16 = 0; i16 < i13; i16++) {
                            if (i14 != 0) {
                                i14 = ((tVar.d() + i15) + 256) % 256;
                            }
                            if (i14 != 0) {
                                i15 = i14;
                            }
                        }
                    }
                    i12++;
                }
            }
            z6 = b12;
        } else {
            c9 = 1;
            z6 = false;
        }
        int c11 = tVar.c() + 4;
        int c12 = tVar.c();
        if (c12 == 0) {
            i9 = tVar.c() + 4;
            z9 = z6;
        } else {
            if (c12 == 1) {
                boolean b13 = tVar.b();
                tVar.d();
                tVar.d();
                long c13 = tVar.c();
                z9 = z6;
                for (int i17 = 0; i17 < c13; i17++) {
                    tVar.c();
                }
                z10 = b13;
                i9 = 0;
                tVar.c();
                tVar.a();
                int c14 = tVar.c() + 1;
                int c15 = tVar.c() + 1;
                b9 = tVar.b();
                int i18 = (2 - (b9 ? 1 : 0)) * c15;
                if (!b9) {
                    tVar.a();
                }
                tVar.a();
                int i19 = c14 * 16;
                int i20 = i18 * 16;
                if (tVar.b()) {
                    int c16 = tVar.c();
                    int c17 = tVar.c();
                    int c18 = tVar.c();
                    int c19 = tVar.c();
                    if (c9 == 0) {
                        i10 = 2 - (b9 ? 1 : 0);
                    } else {
                        int i21 = c9 == 3 ? 1 : 2;
                        i10 = (2 - (b9 ? 1 : 0)) * (c9 == 1 ? 2 : 1);
                        r7 = i21;
                    }
                    i19 -= (c16 + c17) * r7;
                    i20 -= (c18 + c19) * i10;
                }
                int i22 = i19;
                int i23 = i20;
                float f2 = 1.0f;
                if (tVar.b() && tVar.b()) {
                    b10 = tVar.b(8);
                    if (b10 != 255) {
                        int b14 = tVar.b(16);
                        int b15 = tVar.b(16);
                        if (b14 != 0 && b15 != 0) {
                            f2 = b14 / b15;
                        }
                    } else {
                        float[] fArr = f9260c;
                        if (b10 < fArr.length) {
                            f2 = fArr[b10];
                        } else {
                            Log.w(f9261d, "Unexpected aspect_ratio_idc value: ".concat(String.valueOf(b10)));
                        }
                    }
                }
                return new b(c10, i22, i23, f2, z9, b9, c11, c12, i9, z10);
            }
            z9 = z6;
            i9 = 0;
        }
        z10 = false;
        tVar.c();
        tVar.a();
        int c142 = tVar.c() + 1;
        int c152 = tVar.c() + 1;
        b9 = tVar.b();
        int i182 = (2 - (b9 ? 1 : 0)) * c152;
        if (!b9) {
        }
        tVar.a();
        int i192 = c142 * 16;
        int i202 = i182 * 16;
        if (tVar.b()) {
        }
        int i222 = i192;
        int i232 = i202;
        float f22 = 1.0f;
        if (tVar.b()) {
            b10 = tVar.b(8);
            if (b10 != 255) {
            }
        }
        return new b(c10, i222, i232, f22, z9, b9, c11, c12, i9, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0079, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int a(byte[] bArr, int i4, int i6, boolean[] zArr) {
        int i9 = i6 - i4;
        com.anythink.basead.exoplayer.k.a.b(i9 >= 0);
        if (i9 != 0) {
            if (zArr != null) {
                if (zArr[0]) {
                    a(zArr);
                    return i4 - 3;
                }
                if (i9 > 1 && zArr[1] && bArr[i4] == 1) {
                    a(zArr);
                    return i4 - 2;
                }
                if (i9 > 2 && zArr[2] && bArr[i4] == 0 && bArr[i4 + 1] == 1) {
                    a(zArr);
                    return i4 - 1;
                }
            }
            int i10 = i6 - 1;
            int i11 = i4 + 2;
            while (i11 < i10) {
                byte b9 = bArr[i11];
                if ((b9 & 254) == 0) {
                    int i12 = i11 - 2;
                    if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b9 == 1) {
                        if (zArr != null) {
                            a(zArr);
                        }
                        return i12;
                    }
                    i11 -= 2;
                }
                i11 += 3;
            }
            if (zArr != null) {
                boolean z6 = i9 > 2 ? false : false;
                zArr[0] = z6;
                zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i6 + (-2)] == 0 && bArr[i10] == 0;
                zArr[2] = bArr[i10] == 0;
            }
        }
        return i6;
    }

    private static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static void a(t tVar, int i4) {
        int i6 = 8;
        int i9 = 8;
        for (int i10 = 0; i10 < i4; i10++) {
            if (i6 != 0) {
                i6 = ((tVar.d() + i9) + 256) % 256;
            }
            if (i6 != 0) {
                i9 = i6;
            }
        }
    }
}
