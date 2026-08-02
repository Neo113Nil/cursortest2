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
import r2.C4906k;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.bG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2991bG implements T0 {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f30056R = 0;

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ int f30057S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f30058T = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f30059n = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f30060u = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f30061v = {64, 112, 128, 192, 224, 256, 384, p.a.f20462a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f30062w = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f30063x = {5, 8, 10, 12};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f30064y = {6, 9, 12, 15};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f30065z = {2, 4, 6, 8};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f30040A = {9, 11, 13, 16};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f30041B = {5, 8, 10, 12};

    /* renamed from: C, reason: collision with root package name */
    public static final C3516l5 f30042C = new C3516l5("gads:sdk_csi_server", "https://csi.gstatic.com/csi", 4);

    /* renamed from: D, reason: collision with root package name */
    public static final C4112w8 f30043D = new C4112w8(6);

    /* renamed from: E, reason: collision with root package name */
    public static final C4112w8 f30044E = new C4112w8(16);

    /* renamed from: F, reason: collision with root package name */
    public static final C2851Vl f30045F = new C2851Vl(0);

    /* renamed from: G, reason: collision with root package name */
    public static final C2851Vl f30046G = new C2851Vl(10);

    /* renamed from: H, reason: collision with root package name */
    public static final C2851Vl f30047H = new C2851Vl(17);

    /* renamed from: I, reason: collision with root package name */
    public static final Object f30048I = new Object();
    public static final Bs J = new Bs(3);

    /* renamed from: K, reason: collision with root package name */
    public static final Bs f30049K = new Bs(9);

    /* renamed from: L, reason: collision with root package name */
    public static final Bs f30050L = new Bs(14);

    /* renamed from: M, reason: collision with root package name */
    public static final Bs f30051M = new Bs(20);

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f30052N = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: O, reason: collision with root package name */
    public static final int[] f30053O = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: P, reason: collision with root package name */
    public static final int[] f30054P = {67108863, 33554431};

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f30055Q = {26, 25};

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
        int i4;
        byte b9;
        int i6;
        int i9;
        int i10;
        byte b10;
        boolean z6 = false;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i9 = (bArr[7] & 3) << 12;
                i10 = (bArr[6] & 255) << 4;
                b10 = bArr[9];
            } else if (b11 != 31) {
                i = (bArr[5] & 3) << 12;
                i4 = (bArr[6] & 255) << 4;
                b9 = bArr[7];
            } else {
                i9 = (bArr[6] & 3) << 12;
                i10 = (bArr[7] & 255) << 4;
                b10 = bArr[8];
            }
            i6 = (((b10 & 60) >> 2) | i9 | i10) + 1;
            z6 = true;
            return !z6 ? (i6 * 16) / 14 : i6;
        }
        i = (bArr[4] & 3) << 12;
        i4 = (bArr[7] & 255) << 4;
        b9 = bArr[6];
        i6 = (((b9 & 240) >> 4) | i | i4) + 1;
        if (!z6) {
        }
    }

    public static void C(String str, String str2, Throwable th) {
        synchronized (f30048I) {
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
            int i4 = i + 1;
            long j10 = jArr[i4] + j9;
            jArr[i4] = j10;
            long j11 = j10 / 33554432;
            jArr[i4] = j10 - (j11 << 25);
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
        int o4 = AbstractC2659Kg.o(obj);
        int i4 = o4 & i;
        int q8 = q(i4, obj3);
        if (q8 != 0) {
            int i6 = ~i;
            int i9 = o4 & i6;
            int i10 = -1;
            while (true) {
                int i11 = q8 - 1;
                int i12 = iArr[i11];
                int i13 = i12 & i;
                if ((i12 & i6) != i9 || !Objects.equals(obj, objArr[i11]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i11]))) {
                    if (i13 == 0) {
                        break;
                    }
                    i10 = i11;
                    q8 = i13;
                }
            }
        }
        return -1;
    }

    public static Pair F(RandomAccessFile randomAccessFile, int i) {
        int i4;
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
            int i6 = capacity2 - 22;
            int min = Math.min(i6, 65535);
            for (int i9 = 0; i9 < min; i9++) {
                i4 = i6 - i9;
                if (allocate.getInt(i4) == 101010256 && ((char) allocate.getShort(i4 + 20)) == i9) {
                    break;
                }
            }
        }
        i4 = -1;
        if (i4 == -1) {
            return null;
        }
        allocate.position(i4);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i4));
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
        boolean z6;
        int i4;
        int i6;
        int[] iArr;
        int i9;
        String str;
        int i10;
        long j6;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C4256yr S8 = S(bArr);
        S8.f(40);
        int h3 = S8.h(2);
        boolean g9 = S8.g();
        int i20 = true != g9 ? 16 : 20;
        S8.f(true != g9 ? 8 : 12);
        int h9 = S8.h(i20) + 1;
        boolean g10 = S8.g();
        if (g10) {
            i6 = S8.h(2);
            int h10 = S8.h(3) + 1;
            if (S8.g()) {
                S8.f(36);
            }
            int h11 = S8.h(3) + 1;
            int h12 = S8.h(3) + 1;
            if (h11 != 1 || h12 != 1) {
                throw U4.c("Multiple audio presentations or assets not supported");
            }
            int i21 = h3 + 1;
            int h13 = S8.h(i21);
            for (int i22 = 0; i22 < i21; i22++) {
                if (((h13 >> i22) & 1) == 1) {
                    S8.f(8);
                }
            }
            i = 0;
            z6 = S8.g();
            if (z6) {
                S8.f(2);
                int h14 = (S8.h(2) + 1) << 2;
                int h15 = S8.h(2) + 1;
                iArr = new int[h15];
                for (int i23 = 0; i23 < h15; i23++) {
                    iArr[i23] = Q(S8.h(h14));
                }
            } else {
                iArr = null;
            }
            i4 = h10 * 512;
        } else {
            i = 0;
            z6 = false;
            i4 = 0;
            i6 = -1;
            iArr = null;
        }
        S8.f(i20);
        S8.f(12);
        if (g10) {
            if (S8.g()) {
                S8.f(4);
            }
            if (S8.g()) {
                S8.f(24);
            }
            if (S8.g()) {
                S8.l(S8.h(10) + 1);
            }
            int i24 = 5;
            S8.f(5);
            i9 = f30062w[S8.h(4)];
            int h16 = S8.h(8) + 1;
            if (S8.g()) {
                int g11 = h16 > 2 ? S8.g() : i;
                int g12 = h16 > 6 ? S8.g() : i;
                if (S8.g()) {
                    i12 = 1;
                    i19 = (S8.h(2) + 1) << 2;
                    S8.f(i19);
                } else {
                    i12 = 1;
                    i19 = i;
                }
                i14 = 6;
                int h17 = S8.h(3);
                int[] iArr2 = new int[h17];
                for (int i25 = i; i25 < h17; i25++) {
                    iArr2[i25] = S8.h(i19);
                }
                int i26 = i;
                while (i26 < h17) {
                    int Q8 = Q(iArr2[i26]);
                    int i27 = i24;
                    int h18 = S8.h(i24) + 1;
                    int i28 = i;
                    while (i28 < Q8) {
                        S8.f(Integer.bitCount(S8.h(h18)) * 5);
                        i28++;
                        iArr2 = iArr2;
                    }
                    i26++;
                    i24 = i27;
                }
                i13 = i24;
                i16 = g11;
                i15 = g12;
            } else {
                i12 = 1;
                i13 = 5;
                i14 = 6;
                S8.f(3);
                int i29 = i;
                i15 = i29 == true ? 1 : 0;
                i16 = i29;
            }
            boolean g13 = S8.g();
            if (g13) {
                S8.f(8);
            }
            if (S8.g()) {
                S8.f(i13);
            }
            if (g13 && i16 != 0) {
                S8.f(8);
            }
            if (z6 && S8.g()) {
                iArr.getClass();
                S8.f(7);
                if (S8.h(2) < 3) {
                    S8.f(3);
                } else {
                    S8.f(8);
                }
                boolean g14 = S8.g();
                int length = iArr.length;
                int i30 = i;
                while (i30 < length) {
                    int i31 = iArr[i30];
                    if (g14) {
                        S8.f(i31 * 6);
                        i18 = i14;
                    } else {
                        i18 = i14;
                        S8.f(i18);
                    }
                    i30++;
                    i14 = i18;
                }
                int i32 = i14;
                int[] iArr3 = new int[3];
                iArr3[i] = h16;
                if (i15 != 0) {
                    iArr3[i12] = i32;
                    i17 = 2;
                } else {
                    i17 = i12;
                }
                if (i16 != 0) {
                    iArr3[i17] = 2;
                    i17++;
                }
                int length2 = iArr.length;
                for (int i33 = i; i33 < length2; i33++) {
                    int i34 = iArr[i33];
                    for (int i35 = i; i35 < i17; i35++) {
                        int i36 = iArr3[i35];
                        int i37 = i;
                        while (i37 < i36) {
                            S8.f(Integer.bitCount(S8.h(i34)) * 6);
                            i37++;
                            iArr3 = iArr3;
                        }
                    }
                }
            }
            int h19 = S8.h(2);
            String str2 = com.anythink.basead.exoplayer.k.o.f9210E;
            if (h19 != 0) {
                if (h19 != i12) {
                    if (h19 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(h19).length() + 42);
                        sb.append("Unsupported coding mode in DTS HD header: ");
                        sb.append(h19);
                        throw U4.a(null, sb.toString());
                    }
                    str2 = com.anythink.basead.exoplayer.k.o.f9211F;
                }
                i10 = h16;
                str = str2;
            }
        } else {
            i9 = -2147483647;
            str = null;
            i10 = -1;
        }
        int i38 = i9;
        if (g10) {
            if (i6 == 0) {
                i11 = 32000;
            } else if (i6 == 1) {
                i11 = 44100;
            } else {
                if (i6 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 51);
                    sb2.append("Unsupported reference clock code in DTS HD header: ");
                    sb2.append(i6);
                    throw U4.a(null, sb2.toString());
                }
                i11 = 48000;
            }
            j6 = AbstractC3182eu.w(i4, 1000000L, i11, RoundingMode.DOWN);
        } else {
            j6 = com.anythink.basead.exoplayer.b.f7168b;
        }
        return new P0(str, i10, i38, h9, j6);
    }

    public static void H(String str, String str2) {
        synchronized (f30048I) {
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
        synchronized (f30048I) {
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
            synchronized (f30048I) {
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
        return com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(replace2).length() + length + 3 + 1), str, "\n  ", replace2, "\n");
    }

    public static long[] N(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i4 = f30052N[i];
            jArr[i] = (((((bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8)) | ((bArr[i4 + 2] & 255) << 16)) | ((bArr[i4 + 3] & 255) << 24)) >> f30053O[i]) & f30054P[i & 1];
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
        int i4 = 0;
        int i6 = 0;
        while (true) {
            iArr = f30055Q;
            c9 = 25;
            i = 2;
            j6 = 19;
            if (i6 >= 2) {
                break;
            }
            int i9 = 0;
            while (i9 < 9) {
                long j9 = copyOf[i9];
                int i10 = -((int) (((j9 >> 31) & j9) >> iArr[i9 & 1]));
                copyOf[i9] = j9 + (i10 << r15);
                i9++;
                copyOf[i9] = copyOf[i9] - i10;
            }
            long j10 = copyOf[9];
            copyOf[9] = j10 + (r4 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j10 >> 31) & j10) >> 25))) * 19);
            i6++;
        }
        long j11 = copyOf[0];
        copyOf[0] = j11 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j11 >> 31) & j11) >> 26)));
        int i11 = 0;
        while (true) {
            iArr2 = f30054P;
            if (i11 >= i) {
                break;
            }
            int i12 = i4;
            while (i12 < 9) {
                long j12 = copyOf[i12];
                int i13 = i4;
                long j13 = j12 >> iArr[i12 & 1];
                copyOf[i12] = j12 & iArr2[r16];
                i12++;
                copyOf[i12] = copyOf[i12] + ((int) j13);
                i4 = i13;
                c9 = c9;
                i11 = i11;
                j6 = j6;
            }
            i11++;
            i = 2;
        }
        int i14 = i4;
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[i14] = (((int) (r2 >> c9)) * j6) + copyOf[i14];
        int i15 = ~((((int) r4) - 67108845) >> 31);
        for (int i16 = 1; i16 < 10; i16++) {
            int i17 = ~(((int) copyOf[i16]) ^ iArr2[i16 & 1]);
            int i18 = i17 & (i17 << 16);
            int i19 = i18 & (i18 << 8);
            int i20 = i19 & (i19 << 4);
            int i21 = i20 & (i20 << 2);
            i15 &= (i21 & (i21 + i21)) >> 31;
        }
        copyOf[i14] = copyOf[i14] - (67108845 & i15);
        long j14 = 33554431 & i15;
        copyOf[1] = copyOf[1] - j14;
        for (int i22 = 2; i22 < 10; i22 += 2) {
            copyOf[i22] = copyOf[i22] - (67108863 & i15);
            int i23 = i22 + 1;
            copyOf[i23] = copyOf[i23] - j14;
        }
        for (int i24 = i14; i24 < 10; i24++) {
            copyOf[i24] = copyOf[i24] << f30053O[i24];
        }
        byte[] bArr = new byte[32];
        for (int i25 = i14; i25 < 10; i25++) {
            int i26 = f30052N[i25];
            long j15 = bArr[i26];
            long j16 = copyOf[i25];
            bArr[i26] = (byte) (j15 | (j16 & 255));
            bArr[i26 + 1] = (byte) (bArr[r5] | ((j16 >> 8) & 255));
            bArr[i26 + 2] = (byte) (bArr[r5] | ((j16 >> 16) & 255));
            bArr[i26 + 3] = (byte) (bArr[r4] | ((j16 >> 24) & 255));
        }
        return bArr;
    }

    public static DP P(R0 r02, int i, DP dp) {
        Cr cr = new Cr(i);
        if (r02.E(cr.f24997a, 0, i, true)) {
            r02.l();
            int J8 = cr.J();
            if (o(J8) == 1) {
                if (cr.B() >= 10) {
                    byte[] bArr = new byte[10];
                    cr.H(bArr, 0, 10);
                    int B3 = B(bArr);
                    if (cr.f24999c >= B3 + 4) {
                        cr.E(B3);
                        J8 = cr.J();
                    }
                }
            }
            if (o(J8) == 2 && cr.B() >= 7) {
                int i4 = cr.f24998b;
                byte[] bArr2 = new byte[7];
                cr.H(bArr2, 0, 7);
                cr.E(i4);
                C4256yr S8 = S(bArr2);
                S8.f(42);
                int h3 = S8.h(true != S8.g() ? 8 : 12) + 1;
                if (h3 > 0 && cr.B() >= h3) {
                    byte[] bArr3 = new byte[h3];
                    cr.H(bArr3, 0, h3);
                    P0 G2 = G(bArr3);
                    String str = dp.f25176o;
                    String str2 = G2.f27489a;
                    if (str2 == null) {
                        str2 = com.anythink.basead.exoplayer.k.o.f9210E;
                    }
                    if (!Objects.equals(str, str2)) {
                        C3322hP c3322hP = new C3322hP(dp);
                        c3322hP.e(str2);
                        return new DP(c3322hP);
                    }
                }
            }
        }
        return dp;
    }

    public static int Q(int i) {
        int i4 = i & 1;
        if ((i & 2) != 0) {
            i4 += 2;
        }
        if ((i & 4) != 0) {
            i4 += 2;
        }
        if ((i & 8) != 0) {
            i4++;
        }
        if ((i & 16) != 0) {
            i4++;
        }
        if ((i & 32) != 0) {
            i4 += 2;
        }
        if ((i & 64) != 0) {
            i4 += 2;
        }
        if ((i & 128) != 0) {
            i4++;
        }
        if ((i & 256) != 0) {
            i4++;
        }
        if ((i & 512) != 0) {
            i4 += 2;
        }
        if ((i & 1024) != 0) {
            i4 += 2;
        }
        if ((i & 2048) != 0) {
            i4 += 2;
        }
        if ((i & 4096) != 0) {
            i4++;
        }
        if ((i & 8192) != 0) {
            i4 += 2;
        }
        if ((i & 16384) != 0) {
            i4++;
        }
        return (i & 32768) != 0 ? i4 + 2 : i4;
    }

    public static int R(C4256yr c4256yr, int[] iArr) {
        int i = 0;
        for (int i4 = 0; i4 < 3 && c4256yr.g(); i4++) {
            i++;
        }
        int i6 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i6 += 1 << iArr[i9];
        }
        return c4256yr.h(iArr[i]) + i6;
    }

    public static C4256yr S(byte[] bArr) {
        byte b9 = bArr[0];
        if (b9 == Byte.MAX_VALUE || b9 == 100 || b9 == 64 || b9 == 113) {
            return new C4256yr(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = copyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b11 = copyOf[i];
                int i4 = i + 1;
                copyOf[i] = copyOf[i4];
                copyOf[i4] = b11;
            }
        }
        int length = copyOf.length;
        C4256yr c4256yr = new C4256yr(copyOf, length);
        if (copyOf[0] == 31) {
            C4256yr c4256yr2 = new C4256yr(copyOf, length);
            while (c4256yr2.b() >= 16) {
                c4256yr2.f(2);
                int h3 = c4256yr2.h(14);
                int min = Math.min(8 - c4256yr.f36018c, 14);
                int i6 = c4256yr.f36018c;
                int i9 = (8 - i6) - min;
                byte[] bArr2 = c4256yr.f36016a;
                int i10 = c4256yr.f36017b;
                byte b12 = (byte) (((65280 >> i6) | ((1 << i9) - 1)) & bArr2[i10]);
                bArr2[i10] = b12;
                int i11 = 14 - min;
                int i12 = h3 & 16383;
                bArr2[i10] = (byte) (b12 | ((i12 >>> i11) << i9));
                int i13 = i10 + 1;
                while (i11 > 8) {
                    i11 -= 8;
                    c4256yr.f36016a[i13] = (byte) (i12 >>> i11);
                    i13++;
                }
                byte[] bArr3 = c4256yr.f36016a;
                byte b13 = (byte) (bArr3[i13] & ((1 << r7) - 1));
                bArr3[i13] = b13;
                bArr3[i13] = (byte) (((i12 & ((1 << i11) - 1)) << (8 - i11)) | b13);
                c4256yr.f(14);
                c4256yr.m();
            }
        }
        int length2 = copyOf.length;
        c4256yr.f36016a = copyOf;
        c4256yr.f36017b = 0;
        c4256yr.f36018c = 0;
        c4256yr.f36019d = length2;
        return c4256yr;
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

    public static Wx b(l3.m mVar) {
        Wx wx = new Wx();
        wx.f29228A = mVar;
        mVar.a(GD.f25742n, new C3557lt(6, wx));
        return wx;
    }

    public static Object e(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(D.x.k(i, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i).length() + 41)));
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

    public static ArrayList g(AbstractC4278zC abstractC4278zC) {
        ArrayList arrayList = new ArrayList();
        abstractC4278zC.getClass();
        while (abstractC4278zC.hasNext()) {
            arrayList.add(abstractC4278zC.next());
        }
        return arrayList;
    }

    public static void h(int i, String str, Throwable th) {
        String k9 = D.x.k(i, "Ad failed to load : ", new StringBuilder(String.valueOf(i).length() + 20));
        int i4 = w2.z.f41712b;
        x2.i.e(k9);
        w2.z.l(str, th);
        if (i == 3) {
            return;
        }
        C4906k.f40186C.f40196h.e(str, th);
    }

    public static void i(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(D.x.k(i, "csd-", new StringBuilder(String.valueOf(i).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void j(C3808qa c3808qa, C3700oa c3700oa, String... strArr) {
        if (c3700oa == null) {
            return;
        }
        C4906k.f40186C.f40198k.getClass();
        c3808qa.a(c3700oa, SystemClock.elapsedRealtime(), strArr);
    }

    public static void k(String str, String str2) {
        synchronized (f30048I) {
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
        int i4 = cr.f24998b;
        long P8 = cr.P();
        long j9 = P8 >>> 16;
        if (j9 != i) {
            return false;
        }
        boolean z6 = (j9 & 1) == 1;
        long j10 = P8 >> 12;
        long j11 = P8 >> 8;
        long j12 = P8 >> 4;
        long j13 = P8 >> 1;
        long j14 = P8 & 1;
        int i6 = (int) (j12 & 15);
        if (i6 <= 7) {
            j6 = 1;
            if (i6 != w02.f29095g - 1) {
                return false;
            }
        } else {
            j6 = 1;
            if (i6 > 10 || w02.f29095g != 2) {
                return false;
            }
        }
        int i9 = (int) (j13 & 7);
        if (!(i9 == 0 || i9 == w02.i) || j14 == j6) {
            return false;
        }
        try {
            long o4 = cr.o();
            if (!z6) {
                o4 *= w02.f29090b;
            }
            long j15 = w02.f29097j;
            if (j15 != 0 && o4 > j15) {
                return false;
            }
            u02.f28641n = o4;
            int v9 = v((int) (j10 & 15), cr);
            long j16 = w02.f29097j;
            boolean z9 = j16 == 0 || o4 + ((long) v9) >= j16;
            if (v9 == -1) {
                return false;
            }
            if ((!z9 && v9 < w02.f29089a) || v9 > w02.f29090b) {
                return false;
            }
            int i10 = (int) (j11 & 15);
            if (i10 != 0) {
                if (i10 > 11) {
                    int i11 = w02.f29093e;
                    if (i10 != 12) {
                        if (i10 > 14) {
                            return false;
                        }
                        int L2 = cr.L();
                        if (i10 == 14) {
                            L2 *= 10;
                        }
                        if (L2 != i11) {
                            return false;
                        }
                    } else if (cr.K() * 1000 != i11) {
                        return false;
                    }
                } else if (i10 != w02.f29094f) {
                    return false;
                }
            }
            int K7 = cr.K();
            int i12 = cr.f24998b;
            byte[] bArr = cr.f24997a;
            int i13 = i12 - 1;
            String str = AbstractC3182eu.f30782a;
            int i14 = 0;
            for (int i15 = i4; i15 < i13; i15++) {
                i14 = AbstractC3182eu.i[i14 ^ (bArr[i15] & 255)];
            }
            if (K7 != i14) {
                return false;
            }
            if (cr.B() != 0) {
                int I8 = cr.I();
                if ((I8 & 128) != 0) {
                    return false;
                }
                int i16 = (I8 & com.anythink.expressad.video.module.a.a.f22514Q) >> 1;
                if ((i16 >= 2 && i16 <= 7) || (i16 >= 13 && i16 <= 31)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i16).length() + 57);
                    sb.append("Ignoring frame where first subframe has a reserved type: ");
                    sb.append(i16);
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
        return Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9209D) || Objects.equals(str, com.anythink.basead.exoplayer.k.o.f9210E);
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

    public static int p(int i, int i4) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i4 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i6 = i / i4;
        int i9 = i - (i4 * i6);
        if (i9 == 0) {
            return i6;
        }
        int i10 = ((i ^ i4) >> 31) | 1;
        switch (NC.f27256a[roundingMode.ordinal()]) {
            case 1:
                QC.j(false);
                return i6;
            case 2:
                return i6;
            case 3:
                if (i10 >= 0) {
                    return i6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i10 <= 0) {
                    return i6;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i9);
                int abs2 = abs - (Math.abs(i4) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i6;
                }
                if (abs2 <= 0) {
                    return i6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i6 + i10;
    }

    public static int q(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static void r(Context context, boolean z6) {
        if (z6) {
            int i = w2.z.f41712b;
            x2.i.e("This request is sent from a test device.");
            return;
        }
        x2.d dVar = C4949p.f40498g.f40499a;
        String c9 = x2.d.c(context);
        String p9 = D.x.p(new StringBuilder(String.valueOf(c9).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", c9, "\")) to get test ads on this device.");
        int i4 = w2.z.f41712b;
        x2.i.e(p9);
    }

    public static void s(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void t(String str, String str2) {
        synchronized (f30048I) {
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
        return list instanceof RandomAccess ? new C3201fC(list, ua) : new C3255gC(list, ua);
    }

    public static void x(int i, int i4, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i4;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i4;
        } else {
            ((int[]) obj)[i] = i4;
        }
    }

    public static void y(String str, String str2) {
        synchronized (f30048I) {
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
