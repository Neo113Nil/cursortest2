package com.anythink.core.common.n.b.a.e;

import com.anythink.basead.exoplayer.k.p;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f16106a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, com.anythink.expressad.video.module.a.a.f22543z, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f16107b = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};

    /* renamed from: c, reason: collision with root package name */
    private static final k f16108c = new k();

    /* renamed from: d, reason: collision with root package name */
    private final a f16109d = new a();

    private k() {
        b();
    }

    public static k a() {
        return f16108c;
    }

    private void b() {
        int i = 0;
        while (true) {
            byte[] bArr = f16107b;
            if (i >= bArr.length) {
                return;
            }
            int i4 = f16106a[i];
            byte b9 = bArr[i];
            a aVar = new a(i, b9);
            a aVar2 = this.f16109d;
            while (b9 > 8) {
                b9 = (byte) (b9 - 8);
                int i6 = (i4 >>> b9) & p.f9259b;
                a[] aVarArr = aVar2.f16110a;
                if (aVarArr == null) {
                    throw new IllegalStateException("invalid dictionary: prefix not unique");
                }
                if (aVarArr[i6] == null) {
                    aVarArr[i6] = new a();
                }
                aVar2 = aVar2.f16110a[i6];
            }
            int i9 = 8 - b9;
            int i10 = (i4 << i9) & p.f9259b;
            int i11 = 1 << i9;
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                aVar2.f16110a[i12] = aVar;
            }
            i++;
        }
    }

    public static void a(com.anythink.core.common.n.c.f fVar, com.anythink.core.common.n.c.d dVar) {
        long j6 = 0;
        int i = 0;
        for (int i4 = 0; i4 < fVar.j(); i4++) {
            int b9 = fVar.b(i4) & 255;
            int i6 = f16106a[b9];
            byte b10 = f16107b[b9];
            j6 = (j6 << b10) | i6;
            i += b10;
            while (i >= 8) {
                i -= 8;
                dVar.l((int) (j6 >> i));
            }
        }
        if (i > 0) {
            dVar.l((int) ((j6 << (8 - i)) | (p.f9259b >>> i)));
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final a[] f16110a;

        /* renamed from: b, reason: collision with root package name */
        final int f16111b;

        /* renamed from: c, reason: collision with root package name */
        final int f16112c;

        public a() {
            this.f16110a = new a[256];
            this.f16111b = 0;
            this.f16112c = 0;
        }

        public a(int i, int i4) {
            this.f16110a = null;
            this.f16111b = i;
            int i6 = i4 & 7;
            this.f16112c = i6 == 0 ? 8 : i6;
        }
    }

    public static int a(com.anythink.core.common.n.c.f fVar) {
        long j6 = 0;
        for (int i = 0; i < fVar.j(); i++) {
            j6 += f16107b[fVar.b(i) & 255];
        }
        return (int) ((j6 + 7) >> 3);
    }

    public final byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a aVar = this.f16109d;
        int i = 0;
        int i4 = 0;
        for (byte b9 : bArr) {
            i = (i << 8) | (b9 & 255);
            i4 += 8;
            while (i4 >= 8) {
                aVar = aVar.f16110a[(i >>> (i4 - 8)) & p.f9259b];
                if (aVar.f16110a == null) {
                    byteArrayOutputStream.write(aVar.f16111b);
                    i4 -= aVar.f16112c;
                    aVar = this.f16109d;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            a aVar2 = aVar.f16110a[(i << (8 - i4)) & p.f9259b];
            if (aVar2.f16110a != null || aVar2.f16112c > i4) {
                break;
            }
            byteArrayOutputStream.write(aVar2.f16111b);
            i4 -= aVar2.f16112c;
            aVar = this.f16109d;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void a(int i, int i4, byte b9) {
        a aVar = new a(i, b9);
        a aVar2 = this.f16109d;
        while (b9 > 8) {
            b9 = (byte) (b9 - 8);
            int i6 = (i4 >>> b9) & p.f9259b;
            a[] aVarArr = aVar2.f16110a;
            if (aVarArr != null) {
                if (aVarArr[i6] == null) {
                    aVarArr[i6] = new a();
                }
                aVar2 = aVar2.f16110a[i6];
            } else {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
        }
        int i9 = 8 - b9;
        int i10 = (i4 << i9) & p.f9259b;
        int i11 = 1 << i9;
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            aVar2.f16110a[i12] = aVar;
        }
    }
}
