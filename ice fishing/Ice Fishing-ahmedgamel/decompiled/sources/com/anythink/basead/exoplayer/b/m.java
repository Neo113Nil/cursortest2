package com.anythink.basead.exoplayer.b;

import com.anythink.expressad.foundation.h.p;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6580a = 2147385345;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6581b = 536864768;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6582c = -25230976;

    /* renamed from: d, reason: collision with root package name */
    private static final int f6583d = -14745368;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f6584e = Byte.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f6585f = 31;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f6586g = -2;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f6587h = -1;
    private static final int[] i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f6588j = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f6589k = {64, 112, 128, 192, 224, 256, 384, p.a.f19675a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    private m() {
    }

    private static boolean a(int i6) {
        return i6 == f6580a || i6 == f6582c || i6 == f6581b || i6 == f6583d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int b(byte[] bArr) {
        int i6;
        byte b9;
        int i9;
        int i10;
        byte b10;
        boolean z3 = false;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i10 = ((bArr[7] & 3) << 12) | ((bArr[6] & f6587h) << 4);
                b10 = bArr[9];
            } else if (b11 != 31) {
                i6 = ((bArr[5] & 3) << 12) | ((bArr[6] & f6587h) << 4);
                b9 = bArr[7];
            } else {
                i10 = ((bArr[6] & 3) << 12) | ((bArr[7] & f6587h) << 4);
                b10 = bArr[8];
            }
            i9 = (((b10 & 60) >> 2) | i10) + 1;
            z3 = true;
            return !z3 ? (i9 * 16) / 14 : i9;
        }
        i6 = ((bArr[4] & 3) << 12) | ((bArr[7] & f6587h) << 4);
        b9 = bArr[6];
        i9 = (((b9 & 240) >> 4) | i6) + 1;
        if (!z3) {
        }
    }

    private static com.anythink.basead.exoplayer.k.r c(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new com.anythink.basead.exoplayer.k.r(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b9 = copyOf[0];
        if (b9 == -2 || b9 == -1) {
            for (int i6 = 0; i6 < copyOf.length - 1; i6 += 2) {
                byte b10 = copyOf[i6];
                int i9 = i6 + 1;
                copyOf[i6] = copyOf[i9];
                copyOf[i9] = b10;
            }
        }
        com.anythink.basead.exoplayer.k.r rVar = new com.anythink.basead.exoplayer.k.r(copyOf);
        if (copyOf[0] == 31) {
            com.anythink.basead.exoplayer.k.r rVar2 = new com.anythink.basead.exoplayer.k.r(copyOf);
            while (rVar2.a() >= 16) {
                rVar2.b(2);
                rVar.d(rVar2.c(14));
            }
        }
        rVar.a(copyOf, copyOf.length);
        return rVar;
    }

    private static boolean d(byte[] bArr) {
        byte b9 = bArr[0];
        return b9 == -2 || b9 == -1;
    }

    private static int a(byte[] bArr) {
        int i6;
        byte b9;
        int i9;
        byte b10;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i6 = (bArr[4] & 7) << 4;
                b10 = bArr[7];
            } else if (b11 != 31) {
                i6 = (bArr[4] & 1) << 6;
                b9 = bArr[5];
            } else {
                i6 = (bArr[5] & 7) << 4;
                b10 = bArr[6];
            }
            i9 = b10 & 60;
            return (((i9 >> 2) | i6) + 1) * 32;
        }
        i6 = (bArr[5] & 1) << 6;
        b9 = bArr[4];
        i9 = b9 & 252;
        return (((i9 >> 2) | i6) + 1) * 32;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i6;
        byte b9;
        int i9;
        byte b10;
        int position = byteBuffer.position();
        byte b11 = byteBuffer.get(position);
        if (b11 != -2) {
            if (b11 == -1) {
                i6 = (byteBuffer.get(position + 4) & 7) << 4;
                b10 = byteBuffer.get(position + 7);
            } else if (b11 != 31) {
                i6 = (byteBuffer.get(position + 4) & 1) << 6;
                b9 = byteBuffer.get(position + 5);
            } else {
                i6 = (byteBuffer.get(position + 5) & 7) << 4;
                b10 = byteBuffer.get(position + 6);
            }
            i9 = b10 & 60;
            return (((i9 >> 2) | i6) + 1) * 32;
        }
        i6 = (byteBuffer.get(position + 5) & 1) << 6;
        b9 = byteBuffer.get(position + 4);
        i9 = b9 & 252;
        return (((i9 >> 2) | i6) + 1) * 32;
    }

    private static com.anythink.basead.exoplayer.m a(byte[] bArr, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        com.anythink.basead.exoplayer.k.r rVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            rVar = new com.anythink.basead.exoplayer.k.r(bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b9 = copyOf[0];
            if (b9 == -2 || b9 == -1) {
                for (int i6 = 0; i6 < copyOf.length - 1; i6 += 2) {
                    byte b10 = copyOf[i6];
                    int i9 = i6 + 1;
                    copyOf[i6] = copyOf[i9];
                    copyOf[i9] = b10;
                }
            }
            rVar = new com.anythink.basead.exoplayer.k.r(copyOf);
            if (copyOf[0] == 31) {
                com.anythink.basead.exoplayer.k.r rVar2 = new com.anythink.basead.exoplayer.k.r(copyOf);
                while (rVar2.a() >= 16) {
                    rVar2.b(2);
                    rVar.d(rVar2.c(14));
                }
            }
            rVar.a(copyOf, copyOf.length);
        }
        rVar.b(60);
        int i10 = i[rVar.c(6)];
        int i11 = f6588j[rVar.c(4)];
        int c9 = rVar.c(5);
        int[] iArr = f6589k;
        int i12 = c9 < iArr.length ? (iArr[c9] * 1000) / 2 : -1;
        rVar.b(10);
        return com.anythink.basead.exoplayer.m.a(str, com.anythink.basead.exoplayer.k.o.f8423D, null, i12, i10 + (rVar.c(2) > 0 ? 1 : 0), i11, null, eVar, str2);
    }
}
