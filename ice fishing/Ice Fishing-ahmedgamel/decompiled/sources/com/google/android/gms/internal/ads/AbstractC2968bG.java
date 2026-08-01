package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.anythink.expressad.foundation.h.p;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.RoundingMode;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import p2.C4835j;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.bG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2968bG implements T0 {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f29268R = 0;

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ int f29269S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f29270T = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f29271n = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f29272u = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f29273v = {64, 112, 128, 192, 224, 256, 384, p.a.f19675a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f29274w = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f29275x = {5, 8, 10, 12};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f29276y = {6, 9, 12, 15};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f29277z = {2, 4, 6, 8};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f29252A = {9, 11, 13, 16};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f29253B = {5, 8, 10, 12};

    /* renamed from: C, reason: collision with root package name */
    public static final C3493l5 f29254C = new C3493l5("gads:sdk_csi_server", "https://csi.gstatic.com/csi", 4);

    /* renamed from: D, reason: collision with root package name */
    public static final C4089w8 f29255D = new C4089w8(6);

    /* renamed from: E, reason: collision with root package name */
    public static final C4089w8 f29256E = new C4089w8(16);

    /* renamed from: F, reason: collision with root package name */
    public static final C2812Ul f29257F = new C2812Ul(0);

    /* renamed from: G, reason: collision with root package name */
    public static final C2812Ul f29258G = new C2812Ul(10);

    /* renamed from: H, reason: collision with root package name */
    public static final C2812Ul f29259H = new C2812Ul(17);

    /* renamed from: I, reason: collision with root package name */
    public static final Object f29260I = new Object();
    public static final Bs J = new Bs(3);

    /* renamed from: K, reason: collision with root package name */
    public static final Bs f29261K = new Bs(9);

    /* renamed from: L, reason: collision with root package name */
    public static final Bs f29262L = new Bs(14);

    /* renamed from: M, reason: collision with root package name */
    public static final Bs f29263M = new Bs(20);

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f29264N = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: O, reason: collision with root package name */
    public static final int[] f29265O = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: P, reason: collision with root package name */
    public static final int[] f29266P = {67108863, 33554431};

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f29267Q = {26, 25};

    public static void A(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j6 = jArr[8];
        long j9 = jArr[18];
        long j10 = j6 + (j9 << 4);
        jArr[8] = j10;
        long j11 = j9 + j9 + j10;
        jArr[8] = j11;
        jArr[8] = j11 + j9;
        long j12 = jArr[7];
        long j13 = jArr[17];
        long j14 = j12 + (j13 << 4);
        jArr[7] = j14;
        long j15 = j13 + j13 + j14;
        jArr[7] = j15;
        jArr[7] = j15 + j13;
        long j16 = jArr[6];
        long j17 = jArr[16];
        long j18 = j16 + (j17 << 4);
        jArr[6] = j18;
        long j19 = j17 + j17 + j18;
        jArr[6] = j19;
        jArr[6] = j19 + j17;
        long j20 = jArr[5];
        long j21 = jArr[15];
        long j22 = j20 + (j21 << 4);
        jArr[5] = j22;
        long j23 = j21 + j21 + j22;
        jArr[5] = j23;
        jArr[5] = j23 + j21;
        long j24 = jArr[4];
        long j25 = jArr[14];
        long j26 = j24 + (j25 << 4);
        jArr[4] = j26;
        long j27 = j25 + j25 + j26;
        jArr[4] = j27;
        jArr[4] = j27 + j25;
        long j28 = jArr[3];
        long j29 = jArr[13];
        long j30 = j28 + (j29 << 4);
        jArr[3] = j30;
        long j31 = j29 + j29 + j30;
        jArr[3] = j31;
        jArr[3] = j31 + j29;
        long j32 = jArr[2];
        long j33 = jArr[12];
        long j34 = j32 + (j33 << 4);
        jArr[2] = j34;
        long j35 = j33 + j33 + j34;
        jArr[2] = j35;
        jArr[2] = j35 + j33;
        long j36 = jArr[1];
        long j37 = jArr[11];
        long j38 = j36 + (j37 << 4);
        jArr[1] = j38;
        long j39 = j37 + j37 + j38;
        jArr[1] = j39;
        jArr[1] = j39 + j37;
        long j40 = jArr[0];
        long j41 = jArr[10];
        long j42 = j40 + (j41 << 4);
        jArr[0] = j42;
        long j43 = j41 + j41 + j42;
        jArr[0] = j43;
        jArr[0] = j43 + j41;
        D(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int B(byte[] bArr) {
        int i;
        int i6;
        byte b9;
        int i9;
        int i10;
        int i11;
        byte b10;
        boolean z3 = false;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i10 = (bArr[7] & 3) << 12;
                i11 = (bArr[6] & 255) << 4;
                b10 = bArr[9];
            } else if (b11 != 31) {
                i = (bArr[5] & 3) << 12;
                i6 = (bArr[6] & 255) << 4;
                b9 = bArr[7];
            } else {
                i10 = (bArr[6] & 3) << 12;
                i11 = (bArr[7] & 255) << 4;
                b10 = bArr[8];
            }
            i9 = (((b10 & 60) >> 2) | i10 | i11) + 1;
            z3 = true;
            return !z3 ? (i9 * 16) / 14 : i9;
        }
        i = (bArr[4] & 3) << 12;
        i6 = (bArr[7] & 255) << 4;
        b9 = bArr[6];
        i9 = (((b9 & 240) >> 4) | i | i6) + 1;
        if (!z3) {
        }
    }

    public static void C(String str, String str2, Throwable th) {
        synchronized (f29260I) {
            Log.w(str, M(str2, th));
        }
    }

    public static void D(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j6 = jArr[i];
            long j9 = j6 / 67108864;
            jArr[i] = j6 - (j9 << 26);
            int i6 = i + 1;
            long j10 = jArr[i6] + j9;
            jArr[i6] = j10;
            long j11 = j10 / 33554432;
            jArr[i6] = j10 - (j11 << 25);
            i += 2;
            jArr[i] = jArr[i] + j11;
        }
        long j12 = jArr[0];
        long j13 = jArr[10];
        long j14 = j12 + (j13 << 4);
        jArr[0] = j14;
        long j15 = j13 + j13 + j14;
        jArr[0] = j15;
        long j16 = j15 + j13;
        jArr[0] = j16;
        jArr[10] = 0;
        long j17 = j16 / 67108864;
        jArr[0] = j16 - (j17 << 26);
        jArr[1] = jArr[1] + j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        x(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int E(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int o6 = AbstractC2639Kg.o(obj);
        int i6 = o6 & i;
        int q8 = q(i6, obj3);
        if (q8 != 0) {
            int i9 = ~i;
            int i10 = o6 & i9;
            int i11 = -1;
            while (true) {
                int i12 = q8 - 1;
                int i13 = iArr[i12];
                int i14 = i13 & i;
                if ((i13 & i9) != i10 || !Objects.equals(obj, objArr[i12]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i12]))) {
                    if (i14 == 0) {
                        break;
                    }
                    i11 = i12;
                    q8 = i14;
                }
            }
        }
        return -1;
    }

    public static Pair F(RandomAccessFile randomAccessFile, int i) {
        int i6;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        K(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i9 = capacity2 - 22;
            int min = Math.min(i9, 65535);
            for (int i10 = 0; i10 < min; i10++) {
                i6 = i9 - i10;
                if (allocate.getInt(i6) == 101010256 && ((char) allocate.getShort(i6 + 20)) == i10) {
                    break;
                }
            }
        }
        i6 = -1;
        if (i6 == -1) {
            return null;
        }
        allocate.position(i6);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0253, code lost:
    
        if ((r0.h(12) & 256) != 0) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static P0 G(byte[] bArr) {
        int i;
        boolean z3;
        int i6;
        int i9;
        int[] iArr;
        int i10;
        String str;
        int i11;
        long j6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C4233yr S8 = S(bArr);
        S8.f(40);
        int h9 = S8.h(2);
        boolean g4 = S8.g();
        int i21 = true != g4 ? 16 : 20;
        S8.f(true != g4 ? 8 : 12);
        int h10 = S8.h(i21) + 1;
        boolean g9 = S8.g();
        if (g9) {
            i9 = S8.h(2);
            int h11 = S8.h(3) + 1;
            if (S8.g()) {
                S8.f(36);
            }
            int h12 = S8.h(3) + 1;
            int h13 = S8.h(3) + 1;
            if (h12 != 1 || h13 != 1) {
                throw U4.c("Multiple audio presentations or assets not supported");
            }
            int i22 = h9 + 1;
            int h14 = S8.h(i22);
            for (int i23 = 0; i23 < i22; i23++) {
                if (((h14 >> i23) & 1) == 1) {
                    S8.f(8);
                }
            }
            i = 0;
            z3 = S8.g();
            if (z3) {
                S8.f(2);
                int h15 = (S8.h(2) + 1) << 2;
                int h16 = S8.h(2) + 1;
                iArr = new int[h16];
                for (int i24 = 0; i24 < h16; i24++) {
                    iArr[i24] = Q(S8.h(h15));
                }
            } else {
                iArr = null;
            }
            i6 = h11 * 512;
        } else {
            i = 0;
            z3 = false;
            i6 = 0;
            i9 = -1;
            iArr = null;
        }
        S8.f(i21);
        S8.f(12);
        if (g9) {
            if (S8.g()) {
                S8.f(4);
            }
            if (S8.g()) {
                S8.f(24);
            }
            if (S8.g()) {
                S8.l(S8.h(10) + 1);
            }
            int i25 = 5;
            S8.f(5);
            i10 = f29274w[S8.h(4)];
            int h17 = S8.h(8) + 1;
            if (S8.g()) {
                int g10 = h17 > 2 ? S8.g() : i;
                int g11 = h17 > 6 ? S8.g() : i;
                if (S8.g()) {
                    i13 = 1;
                    i20 = (S8.h(2) + 1) << 2;
                    S8.f(i20);
                } else {
                    i13 = 1;
                    i20 = i;
                }
                i15 = 6;
                int h18 = S8.h(3);
                int[] iArr2 = new int[h18];
                for (int i26 = i; i26 < h18; i26++) {
                    iArr2[i26] = S8.h(i20);
                }
                int i27 = i;
                while (i27 < h18) {
                    int Q8 = Q(iArr2[i27]);
                    int i28 = i25;
                    int h19 = S8.h(i25) + 1;
                    int i29 = i;
                    while (i29 < Q8) {
                        S8.f(Integer.bitCount(S8.h(h19)) * 5);
                        i29++;
                        iArr2 = iArr2;
                    }
                    i27++;
                    i25 = i28;
                }
                i14 = i25;
                i17 = g10;
                i16 = g11;
            } else {
                i13 = 1;
                i14 = 5;
                i15 = 6;
                S8.f(3);
                int i30 = i;
                i16 = i30 == true ? 1 : 0;
                i17 = i30;
            }
            boolean g12 = S8.g();
            if (g12) {
                S8.f(8);
            }
            if (S8.g()) {
                S8.f(i14);
            }
            if (g12 && i17 != 0) {
                S8.f(8);
            }
            if (z3 && S8.g()) {
                iArr.getClass();
                S8.f(7);
                if (S8.h(2) < 3) {
                    S8.f(3);
                } else {
                    S8.f(8);
                }
                boolean g13 = S8.g();
                int length = iArr.length;
                int i31 = i;
                while (i31 < length) {
                    int i32 = iArr[i31];
                    if (g13) {
                        S8.f(i32 * 6);
                        i19 = i15;
                    } else {
                        i19 = i15;
                        S8.f(i19);
                    }
                    i31++;
                    i15 = i19;
                }
                int i33 = i15;
                int[] iArr3 = new int[3];
                iArr3[i] = h17;
                if (i16 != 0) {
                    iArr3[i13] = i33;
                    i18 = 2;
                } else {
                    i18 = i13;
                }
                if (i17 != 0) {
                    iArr3[i18] = 2;
                    i18++;
                }
                int length2 = iArr.length;
                for (int i34 = i; i34 < length2; i34++) {
                    int i35 = iArr[i34];
                    for (int i36 = i; i36 < i18; i36++) {
                        int i37 = iArr3[i36];
                        int i38 = i;
                        while (i38 < i37) {
                            S8.f(Integer.bitCount(S8.h(i35)) * 6);
                            i38++;
                            iArr3 = iArr3;
                        }
                    }
                }
            }
            int h20 = S8.h(2);
            String str2 = com.anythink.basead.exoplayer.k.o.f8424E;
            if (h20 != 0) {
                if (h20 != i13) {
                    if (h20 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(h20).length() + 42);
                        sb.append("Unsupported coding mode in DTS HD header: ");
                        sb.append(h20);
                        throw U4.a(null, sb.toString());
                    }
                    str2 = com.anythink.basead.exoplayer.k.o.f8425F;
                }
                i11 = h17;
                str = str2;
            }
        } else {
            i10 = -2147483647;
            str = null;
            i11 = -1;
        }
        int i39 = i10;
        if (g9) {
            if (i9 == 0) {
                i12 = 32000;
            } else if (i9 == 1) {
                i12 = 44100;
            } else {
                if (i9 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i9).length() + 51);
                    sb2.append("Unsupported reference clock code in DTS HD header: ");
                    sb2.append(i9);
                    throw U4.a(null, sb2.toString());
                }
                i12 = 48000;
            }
            j6 = AbstractC3159eu.w(i6, 1000000L, i12, RoundingMode.DOWN);
        } else {
            j6 = com.anythink.basead.exoplayer.b.f6382b;
        }
        return new P0(str, i11, i39, h10, j6);
    }

    public static void H(String str, String str2) {
        synchronized (f29260I) {
            Log.e(str, M(str2, null));
        }
    }

    public static void I(long[] jArr, long[] jArr2, long[] jArr3) {
        long j6 = jArr2[0];
        long j9 = jArr3[0];
        long j10 = j6 * j9;
        long j11 = jArr3[1];
        long j12 = jArr2[1];
        long j13 = (j12 * j9) + (j6 * j11);
        long j14 = jArr3[2];
        long j15 = jArr2[2];
        long j16 = ((j12 + j12) * j11) + (j6 * j14) + (j15 * j9);
        long j17 = jArr3[3];
        long j18 = jArr2[3];
        long j19 = (j12 * j14) + (j15 * j11) + (j6 * j17) + (j18 * j9);
        long j20 = jArr3[4];
        long j21 = jArr2[4];
        long j22 = (j12 * j17) + (j18 * j11);
        long j23 = j22 + j22 + (j15 * j14) + (j6 * j20) + (j21 * j9);
        long j24 = jArr3[5];
        long j25 = jArr2[5];
        long j26 = (j15 * j17) + (j18 * j14) + (j12 * j20) + (j21 * j11) + (j6 * j24) + (j25 * j9);
        long j27 = jArr3[6];
        long j28 = jArr2[6];
        long j29 = (j18 * j17) + (j12 * j24) + (j25 * j11);
        long j30 = j29 + j29 + (j15 * j20) + (j21 * j14) + (j6 * j27) + (j28 * j9);
        long j31 = jArr3[7];
        long j32 = jArr2[7];
        long j33 = (j18 * j20) + (j21 * j17) + (j15 * j24) + (j25 * j14) + (j12 * j27) + (j28 * j11) + (j6 * j31) + (j32 * j9);
        long j34 = jArr3[8];
        long j35 = jArr2[8];
        long j36 = (j18 * j24) + (j25 * j17) + (j12 * j31) + (j32 * j11);
        long j37 = j36 + j36 + (j21 * j20) + (j15 * j27) + (j28 * j14) + (j6 * j34) + (j35 * j9);
        long j38 = jArr3[9];
        long j39 = jArr2[9];
        long j40 = (j21 * j24) + (j25 * j20) + (j18 * j27) + (j28 * j17) + (j15 * j31) + (j32 * j14) + (j12 * j34) + (j35 * j11) + (j6 * j38) + (j9 * j39);
        long j41 = (j25 * j24) + (j18 * j31) + (j32 * j17) + (j12 * j38) + (j11 * j39);
        long j42 = (j25 * j31) + (j32 * j24) + (j18 * j38) + (j17 * j39);
        long j43 = (j32 * j31) + (j25 * j38) + (j24 * j39);
        long j44 = (j32 * j34) + (j35 * j31) + (j28 * j38) + (j27 * j39);
        long j45 = (j31 * j39) + (j32 * j38);
        A(new long[]{j10, j13, j16, j19, j23, j26, j30, j33, j37, j40, j41 + j41 + (j21 * j27) + (j28 * j20) + (j15 * j34) + (j35 * j14), (j25 * j27) + (j28 * j24) + (j21 * j31) + (j32 * j20) + (j18 * j34) + (j35 * j17) + (j15 * j38) + (j14 * j39), j42 + j42 + (j28 * j27) + (j21 * j34) + (j35 * j20), (j28 * j31) + (j32 * j27) + (j25 * j34) + (j35 * j24) + (j21 * j38) + (j20 * j39), j43 + j43 + (j28 * j34) + (j35 * j27), j44, j45 + j45 + (j35 * j34), (j34 * j39) + (j35 * j38), (j39 + j39) * j38}, jArr);
    }

    public static void J(String str, String str2, Throwable th) {
        synchronized (f29260I) {
            Log.e(str, M(str2, th));
        }
    }

    public static void K(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static void L(long[] jArr, long[] jArr2) {
        long j6 = jArr2[0];
        long j9 = j6 * j6;
        long j10 = jArr2[1];
        long j11 = (j6 + j6) * j10;
        long j12 = jArr2[2];
        long j13 = (j6 * j12) + (j10 * j10);
        long j14 = jArr2[3];
        long j15 = (j6 * j14) + (j10 * j12);
        long j16 = jArr2[4];
        long j17 = (j12 * j12) + (j10 * 4 * j14) + ((j6 + j6) * j16);
        long j18 = jArr2[5];
        long j19 = (j12 * j14) + (j10 * j16) + (j6 * j18);
        long j20 = jArr2[6];
        long j21 = (j14 * j14) + (j12 * j16) + (j6 * j20) + ((j10 + j10) * j18);
        long j22 = jArr2[7];
        long j23 = (j14 * j16) + (j12 * j18) + (j10 * j20) + (j6 * j22);
        long j24 = jArr2[8];
        long j25 = (j14 * j18) + (j10 * j22);
        long j26 = j25 + j25 + (j12 * j20) + (j6 * j24);
        long j27 = j26 + j26 + (j16 * j16);
        long j28 = jArr2[9];
        long j29 = (j16 * j18) + (j14 * j20) + (j12 * j22) + (j10 * j24) + (j6 * j28);
        long j30 = (j10 * j28) + (j14 * j22);
        long j31 = j30 + j30 + (j18 * j18) + (j16 * j20) + (j12 * j24);
        long j32 = (j18 * j20) + (j16 * j22) + (j14 * j24) + (j12 * j28);
        long j33 = (j14 * j28) + (j18 * j22);
        long j34 = j33 + j33 + (j16 * j24);
        long j35 = j34 + j34 + (j20 * j20);
        long j36 = (j20 * j22) + (j18 * j24) + (j16 * j28);
        long j37 = (j22 * j22) + (j20 * j24) + ((j18 + j18) * j28);
        long j38 = (j20 * j28) + (j22 * j24);
        A(new long[]{j9, j11, j13 + j13, j15 + j15, j17, j19 + j19, j21 + j21, j23 + j23, j27, j29 + j29, j31 + j31, j32 + j32, j35, j36 + j36, j37 + j37, j38 + j38, (j22 * 4 * j28) + (j24 * j24), (j24 + j24) * j28, (j28 + j28) * j28}, jArr);
    }

    public static String M(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (f29260I) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String replace2 = replace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(replace2).length() + length + 3 + 1), str, "\n  ", replace2, "\n");
    }

    public static long[] N(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i6 = f29264N[i];
            jArr[i] = (((((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8)) | ((bArr[i6 + 2] & 255) << 16)) | ((bArr[i6 + 3] & 255) << 24)) >> f29265O[i]) & f29266P[i & 1];
        }
        return jArr;
    }

    public static byte[] O(long[] jArr) {
        int[] iArr;
        char c9;
        int i;
        long j6;
        int[] iArr2;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i6 = 0;
        int i9 = 0;
        while (true) {
            iArr = f29267Q;
            c9 = 25;
            i = 2;
            j6 = 19;
            if (i9 >= 2) {
                break;
            }
            int i10 = 0;
            while (i10 < 9) {
                long j9 = copyOf[i10];
                int i11 = -((int) (((j9 >> 31) & j9) >> iArr[i10 & 1]));
                copyOf[i10] = j9 + (i11 << r15);
                i10++;
                copyOf[i10] = copyOf[i10] - i11;
            }
            long j10 = copyOf[9];
            copyOf[9] = j10 + (r4 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j10 >> 31) & j10) >> 25))) * 19);
            i9++;
        }
        long j11 = copyOf[0];
        copyOf[0] = j11 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j11 >> 31) & j11) >> 26)));
        int i12 = 0;
        while (true) {
            iArr2 = f29266P;
            if (i12 >= i) {
                break;
            }
            int i13 = i6;
            while (i13 < 9) {
                long j12 = copyOf[i13];
                int i14 = i6;
                long j13 = j12 >> iArr[i13 & 1];
                copyOf[i13] = j12 & iArr2[r16];
                i13++;
                copyOf[i13] = copyOf[i13] + ((int) j13);
                i6 = i14;
                c9 = c9;
                i12 = i12;
                j6 = j6;
            }
            i12++;
            i = 2;
        }
        int i15 = i6;
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[i15] = (((int) (r2 >> c9)) * j6) + copyOf[i15];
        int i16 = ~((((int) r4) - 67108845) >> 31);
        for (int i17 = 1; i17 < 10; i17++) {
            int i18 = ~(((int) copyOf[i17]) ^ iArr2[i17 & 1]);
            int i19 = i18 & (i18 << 16);
            int i20 = i19 & (i19 << 8);
            int i21 = i20 & (i20 << 4);
            int i22 = i21 & (i21 << 2);
            i16 &= (i22 & (i22 + i22)) >> 31;
        }
        copyOf[i15] = copyOf[i15] - (67108845 & i16);
        long j14 = 33554431 & i16;
        copyOf[1] = copyOf[1] - j14;
        for (int i23 = 2; i23 < 10; i23 += 2) {
            copyOf[i23] = copyOf[i23] - (67108863 & i16);
            int i24 = i23 + 1;
            copyOf[i24] = copyOf[i24] - j14;
        }
        for (int i25 = i15; i25 < 10; i25++) {
            copyOf[i25] = copyOf[i25] << f29265O[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = i15; i26 < 10; i26++) {
            int i27 = f29264N[i26];
            long j15 = bArr[i27];
            long j16 = copyOf[i26];
            bArr[i27] = (byte) (j15 | (j16 & 255));
            bArr[i27 + 1] = (byte) (bArr[r5] | ((j16 >> 8) & 255));
            bArr[i27 + 2] = (byte) (bArr[r5] | ((j16 >> 16) & 255));
            bArr[i27 + 3] = (byte) (bArr[r4] | ((j16 >> 24) & 255));
        }
        return bArr;
    }

    public static DP P(R0 r02, int i, DP dp) {
        Cr cr = new Cr(i);
        if (r02.A(cr.f24252a, 0, i, true)) {
            r02.l();
            int J2 = cr.J();
            if (o(J2) == 1) {
                if (cr.B() >= 10) {
                    byte[] bArr = new byte[10];
                    cr.H(bArr, 0, 10);
                    int B9 = B(bArr);
                    if (cr.f24254c >= B9 + 4) {
                        cr.E(B9);
                        J2 = cr.J();
                    }
                }
            }
            if (o(J2) == 2 && cr.B() >= 7) {
                int i6 = cr.f24253b;
                byte[] bArr2 = new byte[7];
                cr.H(bArr2, 0, 7);
                cr.E(i6);
                C4233yr S8 = S(bArr2);
                S8.f(42);
                int h9 = S8.h(true != S8.g() ? 8 : 12) + 1;
                if (h9 > 0 && cr.B() >= h9) {
                    byte[] bArr3 = new byte[h9];
                    cr.H(bArr3, 0, h9);
                    P0 G7 = G(bArr3);
                    String str = dp.f24431o;
                    String str2 = G7.f26706a;
                    if (str2 == null) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8424E;
                    }
                    if (!Objects.equals(str, str2)) {
                        C3299hP c3299hP = new C3299hP(dp);
                        c3299hP.e(str2);
                        return new DP(c3299hP);
                    }
                }
            }
        }
        return dp;
    }

    public static int Q(int i) {
        int i6 = i & 1;
        if ((i & 2) != 0) {
            i6 += 2;
        }
        if ((i & 4) != 0) {
            i6 += 2;
        }
        if ((i & 8) != 0) {
            i6++;
        }
        if ((i & 16) != 0) {
            i6++;
        }
        if ((i & 32) != 0) {
            i6 += 2;
        }
        if ((i & 64) != 0) {
            i6 += 2;
        }
        if ((i & 128) != 0) {
            i6++;
        }
        if ((i & 256) != 0) {
            i6++;
        }
        if ((i & 512) != 0) {
            i6 += 2;
        }
        if ((i & 1024) != 0) {
            i6 += 2;
        }
        if ((i & 2048) != 0) {
            i6 += 2;
        }
        if ((i & 4096) != 0) {
            i6++;
        }
        if ((i & 8192) != 0) {
            i6 += 2;
        }
        if ((i & 16384) != 0) {
            i6++;
        }
        return (i & 32768) != 0 ? i6 + 2 : i6;
    }

    public static int R(C4233yr c4233yr, int[] iArr) {
        int i = 0;
        for (int i6 = 0; i6 < 3 && c4233yr.g(); i6++) {
            i++;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i9 += 1 << iArr[i10];
        }
        return c4233yr.h(iArr[i]) + i9;
    }

    public static C4233yr S(byte[] bArr) {
        byte b9 = bArr[0];
        if (b9 == Byte.MAX_VALUE || b9 == 100 || b9 == 64 || b9 == 113) {
            return new C4233yr(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = copyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b11 = copyOf[i];
                int i6 = i + 1;
                copyOf[i] = copyOf[i6];
                copyOf[i6] = b11;
            }
        }
        int length = copyOf.length;
        C4233yr c4233yr = new C4233yr(copyOf, length);
        if (copyOf[0] == 31) {
            C4233yr c4233yr2 = new C4233yr(copyOf, length);
            while (c4233yr2.b() >= 16) {
                c4233yr2.f(2);
                int h9 = c4233yr2.h(14);
                int min = Math.min(8 - c4233yr.f35234c, 14);
                int i9 = c4233yr.f35234c;
                int i10 = (8 - i9) - min;
                byte[] bArr2 = c4233yr.f35232a;
                int i11 = c4233yr.f35233b;
                byte b12 = (byte) (((65280 >> i9) | ((1 << i10) - 1)) & bArr2[i11]);
                bArr2[i11] = b12;
                int i12 = 14 - min;
                int i13 = h9 & 16383;
                bArr2[i11] = (byte) (b12 | ((i13 >>> i12) << i10));
                int i14 = i11 + 1;
                while (i12 > 8) {
                    i12 -= 8;
                    c4233yr.f35232a[i14] = (byte) (i13 >>> i12);
                    i14++;
                }
                byte[] bArr3 = c4233yr.f35232a;
                byte b13 = (byte) (bArr3[i14] & ((1 << r7) - 1));
                bArr3[i14] = b13;
                bArr3[i14] = (byte) (((i13 & ((1 << i12) - 1)) << (8 - i12)) | b13);
                c4233yr.f(14);
                c4233yr.m();
            }
        }
        int length2 = copyOf.length;
        c4233yr.f35232a = copyOf;
        c4233yr.f35233b = 0;
        c4233yr.f35234c = 0;
        c4233yr.f35235d = length2;
        return c4233yr;
    }

    public static Q3 a(Q3 q32, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (q32 == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (Q3) map.get(strArr[0]);
            }
            if (length2 > 1) {
                Q3 q33 = new Q3();
                while (i < length2) {
                    q33.d((Q3) map.get(strArr[i]));
                    i++;
                }
                return q33;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                q32.d((Q3) map.get(strArr[0]));
                return q32;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    q32.d((Q3) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return q32;
    }

    public static Wx b(j3.m mVar) {
        Wx wx = new Wx();
        wx.f28448A = mVar;
        mVar.a(GD.f24952n, new C3534lt(6, wx));
        return wx;
    }

    public static Object e(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(D.y.m(i, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i).length() + 41)));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static String f(Context context, String str, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        XD xd = new XD();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new V6(1, xd));
        return (String) xd.get();
    }

    public static ArrayList g(AbstractC4255zC abstractC4255zC) {
        ArrayList arrayList = new ArrayList();
        abstractC4255zC.getClass();
        while (abstractC4255zC.hasNext()) {
            arrayList.add(abstractC4255zC.next());
        }
        return arrayList;
    }

    public static void h(int i, String str, Throwable th) {
        String m4 = D.y.m(i, "Ad failed to load : ", new StringBuilder(String.valueOf(i).length() + 20));
        int i6 = u2.z.f41322b;
        v2.i.e(m4);
        u2.z.l(str, th);
        if (i == 3) {
            return;
        }
        C4835j.f39733C.f39743h.e(str, th);
    }

    public static void i(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(D.y.m(i, "csd-", new StringBuilder(String.valueOf(i).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void j(C3785qa c3785qa, C3677oa c3677oa, String... strArr) {
        if (c3677oa == null) {
            return;
        }
        C4835j.f39733C.f39745k.getClass();
        c3785qa.a(c3677oa, SystemClock.elapsedRealtime(), strArr);
    }

    public static void k(String str, String str2) {
        synchronized (f29260I) {
            Log.d(str, M(str2, null));
        }
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static boolean m(Cr cr, W0 w02, int i, U0 u02) {
        long j6;
        int i6 = cr.f24253b;
        long P8 = cr.P();
        long j9 = P8 >>> 16;
        if (j9 != i) {
            return false;
        }
        boolean z3 = (j9 & 1) == 1;
        long j10 = P8 >> 12;
        long j11 = P8 >> 8;
        long j12 = P8 >> 4;
        long j13 = P8 >> 1;
        long j14 = P8 & 1;
        int i9 = (int) (j12 & 15);
        if (i9 <= 7) {
            j6 = 1;
            if (i9 != w02.f28297g - 1) {
                return false;
            }
        } else {
            j6 = 1;
            if (i9 > 10 || w02.f28297g != 2) {
                return false;
            }
        }
        int i10 = (int) (j13 & 7);
        if (!(i10 == 0 || i10 == w02.i) || j14 == j6) {
            return false;
        }
        try {
            long o6 = cr.o();
            if (!z3) {
                o6 *= w02.f28292b;
            }
            long j15 = w02.f28299j;
            if (j15 != 0 && o6 > j15) {
                return false;
            }
            u02.f27844n = o6;
            int v9 = v((int) (j10 & 15), cr);
            long j16 = w02.f28299j;
            boolean z6 = j16 == 0 || o6 + ((long) v9) >= j16;
            if (v9 == -1) {
                return false;
            }
            if ((!z6 && v9 < w02.f28291a) || v9 > w02.f28292b) {
                return false;
            }
            int i11 = (int) (j11 & 15);
            if (i11 != 0) {
                if (i11 > 11) {
                    int i12 = w02.f28295e;
                    if (i11 != 12) {
                        if (i11 > 14) {
                            return false;
                        }
                        int L6 = cr.L();
                        if (i11 == 14) {
                            L6 *= 10;
                        }
                        if (L6 != i12) {
                            return false;
                        }
                    } else if (cr.K() * 1000 != i12) {
                        return false;
                    }
                } else if (i11 != w02.f28296f) {
                    return false;
                }
            }
            int K7 = cr.K();
            int i13 = cr.f24253b;
            byte[] bArr = cr.f24252a;
            int i14 = i13 - 1;
            String str = AbstractC3159eu.f29993a;
            int i15 = 0;
            for (int i16 = i6; i16 < i14; i16++) {
                i15 = AbstractC3159eu.i[i15 ^ (bArr[i16] & 255)];
            }
            if (K7 != i15) {
                return false;
            }
            if (cr.B() != 0) {
                int I8 = cr.I();
                if ((I8 & 128) != 0) {
                    return false;
                }
                int i17 = (I8 & com.anythink.expressad.video.module.a.a.f21727Q) >> 1;
                if ((i17 >= 2 && i17 <= 7) || (i17 >= 13 && i17 <= 31)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i17).length() + 57);
                    sb.append("Ignoring frame where first subframe has a reserved type: ");
                    sb.append(i17);
                    t("FlacFrameReader", sb.toString());
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean n(String str) {
        return Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8423D) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8424E);
    }

    public static int o(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static int p(int i, int i6) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i6 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i9 = i / i6;
        int i10 = i - (i6 * i9);
        if (i10 == 0) {
            return i9;
        }
        int i11 = ((i ^ i6) >> 31) | 1;
        switch (NC.f26472a[roundingMode.ordinal()]) {
            case 1:
                QC.j(false);
                return i9;
            case 2:
                return i9;
            case 3:
                if (i11 >= 0) {
                    return i9;
                }
                break;
            case 4:
                break;
            case 5:
                if (i11 <= 0) {
                    return i9;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i10);
                int abs2 = abs - (Math.abs(i6) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i9;
                }
                if (abs2 <= 0) {
                    return i9;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i9 + i11;
    }

    public static int q(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static void r(Context context, boolean z3) {
        if (z3) {
            int i = u2.z.f41322b;
            v2.i.e("This request is sent from a test device.");
            return;
        }
        v2.d dVar = C4900p.f40199g.f40200a;
        String c9 = v2.d.c(context);
        String s9 = D.y.s(new StringBuilder(String.valueOf(c9).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", c9, "\")) to get test ads on this device.");
        int i6 = u2.z.f41322b;
        v2.i.e(s9);
    }

    public static void s(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void t(String str, String str2) {
        synchronized (f29260I) {
            Log.i(str, M(str2, null));
        }
    }

    public static void u(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static int v(int i, Cr cr) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return cr.K() + 1;
            case 7:
                return cr.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static AbstractList w(List list, UA ua) {
        return list instanceof RandomAccess ? new C3178fC(list, ua) : new C3232gC(list, ua);
    }

    public static void x(int i, int i6, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i6;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i6;
        } else {
            ((int[]) obj)[i] = i6;
        }
    }

    public static void y(String str, String str2) {
        synchronized (f29260I) {
            Log.w(str, M(str2, null));
        }
    }

    public static final void z(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }
}
