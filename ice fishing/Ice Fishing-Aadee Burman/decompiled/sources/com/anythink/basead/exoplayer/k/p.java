package com.anythink.basead.exoplayer.k;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final int f8473b = 255;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8475d = "NalUnitUtil";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8476e = 6;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8477f = 7;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8478g = 39;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8472a = {0, 0, 0, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f8474c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: h, reason: collision with root package name */
    private static final Object f8479h = new Object();
    private static int[] i = new int[10];

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8480a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8481b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f8482c;

        public a(int i, int i6, boolean z3) {
            this.f8480a = i;
            this.f8481b = i6;
            this.f8482c = z3;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f8483a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8484b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8485c;

        /* renamed from: d, reason: collision with root package name */
        public final float f8486d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f8487e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f8488f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8489g;

        /* renamed from: h, reason: collision with root package name */
        public final int f8490h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f8491j;

        public b(int i, int i6, int i9, float f3, boolean z3, boolean z6, int i10, int i11, int i12, boolean z9) {
            this.f8483a = i;
            this.f8484b = i6;
            this.f8485c = i9;
            this.f8486d = f3;
            this.f8487e = z3;
            this.f8488f = z6;
            this.f8489g = i10;
            this.f8490h = i11;
            this.i = i12;
            this.f8491j = z9;
        }
    }

    private p() {
    }

    public static int a(byte[] bArr, int i6) {
        int i9;
        synchronized (f8479h) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i6) {
                while (true) {
                    if (i10 >= i6 - 2) {
                        i10 = i6;
                        break;
                    }
                    try {
                        if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                            break;
                        }
                        i10++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i10 < i6) {
                    int[] iArr = i;
                    if (iArr.length <= i11) {
                        i = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    i[i11] = i10;
                    i10 += 3;
                    i11++;
                }
            }
            i9 = i6 - i11;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i[i14] - i13;
                System.arraycopy(bArr, i13, bArr, i12, i15);
                int i16 = i12 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i12 = i16 + 2;
                bArr[i17] = 0;
                i13 += i15 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i12, i9 - i12);
        }
        return i9;
    }

    private static int b(byte[] bArr, int i6) {
        return bArr[i6 + 3] & 31;
    }

    private static int c(byte[] bArr, int i6) {
        return (bArr[i6 + 3] & 126) >> 1;
    }

    private static a b(byte[] bArr, int i6, int i9) {
        t tVar = new t(bArr, i6, i9);
        tVar.a(8);
        int c9 = tVar.c();
        int c10 = tVar.c();
        tVar.a();
        return new a(c9, c10, tVar.b());
    }

    private static int c(byte[] bArr, int i6, int i9) {
        while (i6 < i9 - 2) {
            if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && bArr[i6 + 2] == 3) {
                return i6;
            }
            i6++;
        }
        return i9;
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i6 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i6 + 1;
            if (i10 < position) {
                int i11 = byteBuffer.get(i6) & 255;
                if (i9 == 3) {
                    if (i11 == 1 && (byteBuffer.get(i10) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i6 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i11 == 0) {
                    i9++;
                }
                if (i11 != 0) {
                    i9 = 0;
                }
                i6 = i10;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean a(String str, byte b9) {
        return (o.f8451h.equals(str) && (b9 & 31) == 6) || (o.i.equals(str) && ((b9 & 126) >> 1) == 39);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(byte[] bArr, int i6, int i9) {
        int c9;
        boolean z3;
        boolean z6;
        int i10;
        boolean z9;
        boolean b9;
        int b10;
        int i11;
        t tVar = new t(bArr, i6, i9);
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
                int i12 = c9 != 3 ? 8 : 12;
                int i13 = 0;
                while (i13 < i12) {
                    if (tVar.b()) {
                        int i14 = i13 < 6 ? 16 : 64;
                        int i15 = 8;
                        int i16 = 8;
                        for (int i17 = 0; i17 < i14; i17++) {
                            if (i15 != 0) {
                                i15 = ((tVar.d() + i16) + 256) % 256;
                            }
                            if (i15 != 0) {
                                i16 = i15;
                            }
                        }
                    }
                    i13++;
                }
            }
            z3 = b12;
        } else {
            c9 = 1;
            z3 = false;
        }
        int c11 = tVar.c() + 4;
        int c12 = tVar.c();
        if (c12 == 0) {
            i10 = tVar.c() + 4;
            z6 = z3;
        } else {
            if (c12 == 1) {
                boolean b13 = tVar.b();
                tVar.d();
                tVar.d();
                long c13 = tVar.c();
                z6 = z3;
                for (int i18 = 0; i18 < c13; i18++) {
                    tVar.c();
                }
                z9 = b13;
                i10 = 0;
                tVar.c();
                tVar.a();
                int c14 = tVar.c() + 1;
                int c15 = tVar.c() + 1;
                b9 = tVar.b();
                int i19 = (2 - (b9 ? 1 : 0)) * c15;
                if (!b9) {
                    tVar.a();
                }
                tVar.a();
                int i20 = c14 * 16;
                int i21 = i19 * 16;
                if (tVar.b()) {
                    int c16 = tVar.c();
                    int c17 = tVar.c();
                    int c18 = tVar.c();
                    int c19 = tVar.c();
                    if (c9 == 0) {
                        i11 = 2 - (b9 ? 1 : 0);
                    } else {
                        int i22 = c9 == 3 ? 1 : 2;
                        i11 = (2 - (b9 ? 1 : 0)) * (c9 == 1 ? 2 : 1);
                        r7 = i22;
                    }
                    i20 -= (c16 + c17) * r7;
                    i21 -= (c18 + c19) * i11;
                }
                int i23 = i20;
                int i24 = i21;
                float f3 = 1.0f;
                if (tVar.b() && tVar.b()) {
                    b10 = tVar.b(8);
                    if (b10 != 255) {
                        int b14 = tVar.b(16);
                        int b15 = tVar.b(16);
                        if (b14 != 0 && b15 != 0) {
                            f3 = b14 / b15;
                        }
                    } else {
                        float[] fArr = f8474c;
                        if (b10 < fArr.length) {
                            f3 = fArr[b10];
                        } else {
                            Log.w(f8475d, "Unexpected aspect_ratio_idc value: ".concat(String.valueOf(b10)));
                        }
                    }
                }
                return new b(c10, i23, i24, f3, z6, b9, c11, c12, i10, z9);
            }
            z6 = z3;
            i10 = 0;
        }
        z9 = false;
        tVar.c();
        tVar.a();
        int c142 = tVar.c() + 1;
        int c152 = tVar.c() + 1;
        b9 = tVar.b();
        int i192 = (2 - (b9 ? 1 : 0)) * c152;
        if (!b9) {
        }
        tVar.a();
        int i202 = c142 * 16;
        int i212 = i192 * 16;
        if (tVar.b()) {
        }
        int i232 = i202;
        int i242 = i212;
        float f32 = 1.0f;
        if (tVar.b()) {
            b10 = tVar.b(8);
            if (b10 != 255) {
            }
        }
        return new b(c10, i232, i242, f32, z6, b9, c11, c12, i10, z9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0079, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int a(byte[] bArr, int i6, int i9, boolean[] zArr) {
        int i10 = i9 - i6;
        com.anythink.basead.exoplayer.k.a.b(i10 >= 0);
        if (i10 != 0) {
            if (zArr != null) {
                if (zArr[0]) {
                    a(zArr);
                    return i6 - 3;
                }
                if (i10 > 1 && zArr[1] && bArr[i6] == 1) {
                    a(zArr);
                    return i6 - 2;
                }
                if (i10 > 2 && zArr[2] && bArr[i6] == 0 && bArr[i6 + 1] == 1) {
                    a(zArr);
                    return i6 - 1;
                }
            }
            int i11 = i9 - 1;
            int i12 = i6 + 2;
            while (i12 < i11) {
                byte b9 = bArr[i12];
                if ((b9 & 254) == 0) {
                    int i13 = i12 - 2;
                    if (bArr[i13] == 0 && bArr[i12 - 1] == 0 && b9 == 1) {
                        if (zArr != null) {
                            a(zArr);
                        }
                        return i13;
                    }
                    i12 -= 2;
                }
                i12 += 3;
            }
            if (zArr != null) {
                boolean z3 = i10 > 2 ? false : false;
                zArr[0] = z3;
                zArr[1] = i10 <= 1 ? zArr[2] && bArr[i11] == 0 : bArr[i9 + (-2)] == 0 && bArr[i11] == 0;
                zArr[2] = bArr[i11] == 0;
            }
        }
        return i9;
    }

    private static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static void a(t tVar, int i6) {
        int i9 = 8;
        int i10 = 8;
        for (int i11 = 0; i11 < i6; i11++) {
            if (i9 != 0) {
                i9 = ((tVar.d() + i10) + 256) % 256;
            }
            if (i9 != 0) {
                i10 = i9;
            }
        }
    }
}
