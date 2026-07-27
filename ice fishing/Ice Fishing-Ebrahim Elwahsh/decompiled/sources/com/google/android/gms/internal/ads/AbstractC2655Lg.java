package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.anythink.basead.ui.BaseATView;
import com.anythink.expressad.foundation.h.p;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.Lg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2655Lg implements R0 {

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f26180P = 0;

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f26181Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public static int f26182R = 2;

    /* renamed from: n, reason: collision with root package name */
    public static AudioManager f26183n;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f26184u = {1, 2, 3, 6};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f26185v = {48000, 44100, 32000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f26186w = {24000, 22050, 16000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f26187x = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f26188y = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, p.a.f19833a, 512, 576, 640};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f26189z = {69, 87, 104, 121, 139, 174, BaseATView.a.f9928G, 243, com.anythink.expressad.foundation.g.a.aW, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f26166A = {0, 0, 0, 0, 16, 0, com.anythink.core.common.s.a.c.f16474a, 0, 0, -86, 0, 56, -101, 113};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f26167B = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* renamed from: C, reason: collision with root package name */
    public static final C2837Wb f26168C = new C2837Wb(6);

    /* renamed from: D, reason: collision with root package name */
    public static final C3940t8 f26169D = new C3940t8(14);

    /* renamed from: E, reason: collision with root package name */
    public static final C3940t8 f26170E = new C3940t8(28);

    /* renamed from: F, reason: collision with root package name */
    public static final C2945am f26171F = new C2945am(8);

    /* renamed from: G, reason: collision with root package name */
    public static final C2945am f26172G = new C2945am(15);

    /* renamed from: H, reason: collision with root package name */
    public static final C2945am f26173H = new C2945am(21);

    /* renamed from: I, reason: collision with root package name */
    public static final C3225ft f26174I = new C3225ft(1);
    public static final C3225ft J = new C3225ft(7);

    /* renamed from: K, reason: collision with root package name */
    public static final O2 f26175K = new O2(4);

    /* renamed from: L, reason: collision with root package name */
    public static final C3225ft f26176L = new C3225ft(18);

    /* renamed from: M, reason: collision with root package name */
    public static final KF f26177M = new KF(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: N, reason: collision with root package name */
    public static final MF f26178N = new MF(new C3602mu(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 20), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f26179O = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static Cursor A(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static void B(MF mf, MF mf2, KF kf) {
        long[] jArr = new long[10];
        C3602mu c3602mu = mf.f26316a;
        long[] jArr2 = (long[]) c3602mu.f32774u;
        C3602mu c3602mu2 = mf2.f26316a;
        long[] jArr3 = (long[]) c3602mu2.f32775v;
        long[] jArr4 = (long[]) c3602mu2.f32774u;
        AbstractC3217fl.p(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) c3602mu.f32775v;
        AbstractC3217fl.z(jArr5, jArr3, jArr4);
        AbstractC3217fl.U(jArr5, jArr5, kf.f25947b);
        long[] jArr6 = kf.f25946a;
        long[] jArr7 = (long[]) c3602mu.f32776w;
        AbstractC3217fl.U(jArr7, jArr2, jArr6);
        long[] jArr8 = mf.f26317b;
        AbstractC3217fl.U(jArr8, mf2.f26317b, kf.f25948c);
        kf.a(jArr2, (long[]) c3602mu2.f32776w);
        AbstractC3217fl.p(jArr, jArr2, jArr2);
        AbstractC3217fl.z(jArr2, jArr7, jArr5);
        AbstractC3217fl.p(jArr5, jArr7, jArr5);
        AbstractC3217fl.p(jArr7, jArr, jArr8);
        AbstractC3217fl.z(jArr8, jArr, jArr8);
    }

    public static void C(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static void D(MF mf, MF mf2, KF kf) {
        long[] jArr = new long[10];
        C3602mu c3602mu = mf.f26316a;
        long[] jArr2 = (long[]) c3602mu.f32774u;
        C3602mu c3602mu2 = mf2.f26316a;
        long[] jArr3 = (long[]) c3602mu2.f32775v;
        long[] jArr4 = (long[]) c3602mu2.f32774u;
        AbstractC3217fl.p(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) c3602mu.f32775v;
        AbstractC3217fl.z(jArr5, jArr3, jArr4);
        AbstractC3217fl.U(jArr5, jArr5, kf.f25946a);
        long[] jArr6 = kf.f25947b;
        long[] jArr7 = (long[]) c3602mu.f32776w;
        AbstractC3217fl.U(jArr7, jArr2, jArr6);
        long[] jArr8 = mf.f26317b;
        AbstractC3217fl.U(jArr8, mf2.f26317b, kf.f25948c);
        kf.a(jArr2, (long[]) c3602mu2.f32776w);
        AbstractC3217fl.p(jArr, jArr2, jArr2);
        AbstractC3217fl.z(jArr2, jArr7, jArr5);
        AbstractC3217fl.p(jArr5, jArr7, jArr5);
        AbstractC3217fl.z(jArr7, jArr, jArr8);
        AbstractC3217fl.p(jArr8, jArr, jArr8);
    }

    public static void E(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void F(C3602mu c3602mu, MF mf) {
        C3602mu c3602mu2 = mf.f26316a;
        long[] jArr = (long[]) c3602mu2.f32774u;
        long[] jArr2 = new long[10];
        long[] jArr3 = (long[]) c3602mu.f32774u;
        AbstractC3217fl.Y(jArr, jArr3);
        long[] jArr4 = (long[]) c3602mu2.f32776w;
        long[] jArr5 = (long[]) c3602mu.f32775v;
        AbstractC3217fl.Y(jArr4, jArr5);
        long[] jArr6 = mf.f26317b;
        AbstractC3217fl.Y(jArr6, (long[]) c3602mu.f32776w);
        AbstractC3217fl.p(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) c3602mu2.f32775v;
        AbstractC3217fl.p(jArr7, jArr3, jArr5);
        AbstractC3217fl.Y(jArr2, jArr7);
        AbstractC3217fl.p(jArr7, jArr4, jArr);
        AbstractC3217fl.z(jArr4, jArr4, jArr);
        AbstractC3217fl.z(jArr, jArr2, jArr7);
        AbstractC3217fl.z(jArr6, jArr6, jArr4);
    }

    public static int G(int i, int i4) {
        int i9 = (~(i ^ i4)) & com.anythink.basead.exoplayer.k.p.f8630b;
        int i10 = i9 & (i9 << 4);
        int i11 = i10 & (i10 << 2);
        return (i11 & (i11 + i11)) >> 7;
    }

    public static void H(KF kf, int i, byte b9) {
        KF[][] kfArr = NF.f26501d;
        int i4 = (b9 & 255) >> 7;
        int i9 = (-i4) & b9;
        int i10 = b9 - (i9 + i9);
        kf.b(kfArr[i][0], G(i10, 1));
        kf.b(kfArr[i][1], G(i10, 2));
        kf.b(kfArr[i][2], G(i10, 3));
        kf.b(kfArr[i][3], G(i10, 4));
        kf.b(kfArr[i][4], G(i10, 5));
        kf.b(kfArr[i][5], G(i10, 6));
        kf.b(kfArr[i][6], G(i10, 7));
        kf.b(kfArr[i][7], G(i10, 8));
        long[] jArr = kf.f25947b;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        long[] jArr2 = kf.f25946a;
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArr3 = kf.f25948c;
        long[] copyOf3 = Arrays.copyOf(jArr3, 10);
        for (int i11 = 0; i11 < copyOf3.length; i11++) {
            copyOf3[i11] = -copyOf3[i11];
        }
        C3686oN.e(jArr2, copyOf, i4);
        C3686oN.e(jArr, copyOf2, i4);
        C3686oN.e(jArr3, copyOf3, i4);
    }

    public static byte[] I(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i4 = 0; i4 < 256; i4++) {
            bArr2[i4] = (byte) (1 & ((bArr[i4 >> 3] & 255) >> (i4 & 7)));
        }
        for (int i9 = 0; i9 < 256; i9++) {
            if (bArr2[i9] != 0) {
                for (int i10 = 1; i10 <= 6 && (i = i9 + i10) < 256; i10++) {
                    byte b9 = bArr2[i];
                    if (b9 != 0) {
                        byte b10 = bArr2[i9];
                        int i11 = b9 << i10;
                        int i12 = b10 + i11;
                        if (i12 <= 15) {
                            bArr2[i9] = (byte) i12;
                            bArr2[i] = 0;
                        } else {
                            int i13 = b10 - i11;
                            if (i13 >= -15) {
                                bArr2[i9] = (byte) i13;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long J(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static long K(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | J(i, bArr);
    }

    public static synchronized AudioManager b(Context context) {
        synchronized (AbstractC2655Lg.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f26183n = null;
                }
                AudioManager audioManager = f26183n;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    C2865Xm c2865Xm = new C2865Xm();
                    AbstractC3217fl.j().execute(new MD(14, applicationContext, c2865Xm));
                    c2865Xm.b();
                    AudioManager audioManager2 = f26183n;
                    if (audioManager2 != null) {
                        return audioManager2;
                    }
                    throw null;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(com.anythink.basead.exoplayer.k.o.f8602b);
                f26183n = audioManager3;
                if (audioManager3 != null) {
                    return audioManager3;
                }
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static N3 c(N3 n32, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (n32 == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (N3) map.get(strArr[0]);
            }
            if (length2 > 1) {
                N3 n33 = new N3();
                while (i < length2) {
                    n33.c((N3) map.get(strArr[i]));
                    i++;
                }
                return n33;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                n32.c((N3) map.get(strArr[0]));
                return n32;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    n32.c((N3) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return n32;
    }

    public static Yx e(h3.n nVar) {
        Yx yx = new Yx();
        yx.f28924A = nVar;
        nVar.a(HD.f25326n, new Mt(5, yx));
        return yx;
    }

    public static String f(Context context, String str, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        ZD zd = new ZD();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new S6(1, zd));
        return (String) zd.get();
    }

    public static ArrayList g(CC cc) {
        ArrayList arrayList = new ArrayList();
        cc.getClass();
        while (cc.hasNext()) {
            arrayList.add(cc.next());
        }
        return arrayList;
    }

    public static ArrayList h(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b9 = asReadOnlyBuffer.get();
                int i = b9 >> 3;
                if (((b9 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b9 >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i4 = 0; i4 < 8; i4++) {
                        byte b10 = asReadOnlyBuffer.get();
                        remaining |= (b10 & Byte.MAX_VALUE) << (i4 * 7);
                        if ((b10 & com.anythink.core.common.s.a.c.f16474a) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                int i9 = i & 15;
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new C3244gB(i9, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static void i(int i, String str, Throwable th) {
        String j9 = D.y.j(i, "Ad failed to load : ", new StringBuilder(String.valueOf(i).length() + 20));
        int i4 = t2.C.f40822b;
        u2.i.e(j9);
        t2.C.l(str, th);
        if (i == 3) {
            return;
        }
        p2.j.f39798C.f39808h.e(str, th);
    }

    public static void j(C3636na c3636na, C3528la c3528la, String... strArr) {
        if (c3528la == null) {
            return;
        }
        p2.j.f39798C.f39810k.getClass();
        c3636na.a(c3528la, SystemClock.elapsedRealtime(), strArr);
    }

    public static boolean k(J0 j02) {
        Lr lr = new Lr(8);
        int i = B.a(j02, lr).f23935a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        j02.I(lr.f26233a, 0, 4, false);
        lr.E(0);
        int b9 = lr.b();
        if (b9 == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b9).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(b9);
        AbstractC3217fl.T("WavHeaderReader", sb.toString());
        return false;
    }

    public static boolean l(Lr lr, U0 u02, int i, S0 s02) {
        long j9;
        int i4 = lr.f26234b;
        long P8 = lr.P();
        long j10 = P8 >>> 16;
        if (j10 != i) {
            return false;
        }
        boolean z8 = (j10 & 1) == 1;
        long j11 = P8 >> 12;
        long j12 = P8 >> 8;
        long j13 = P8 >> 4;
        long j14 = P8 >> 1;
        long j15 = P8 & 1;
        int i9 = (int) (j13 & 15);
        if (i9 <= 7) {
            j9 = 1;
            if (i9 != u02.f27906g - 1) {
                return false;
            }
        } else {
            j9 = 1;
            if (i9 > 10 || u02.f27906g != 2) {
                return false;
            }
        }
        int i10 = (int) (j14 & 7);
        if (!(i10 == 0 || i10 == u02.i) || j15 == j9) {
            return false;
        }
        try {
            long o9 = lr.o();
            if (!z8) {
                o9 *= u02.f27901b;
            }
            long j16 = u02.f27908j;
            if (j16 != 0 && o9 > j16) {
                return false;
            }
            s02.f27467n = o9;
            int q6 = q((int) (j11 & 15), lr);
            long j17 = u02.f27908j;
            boolean z9 = j17 == 0 || o9 + ((long) q6) >= j17;
            if (q6 == -1) {
                return false;
            }
            if ((!z9 && q6 < u02.f27900a) || q6 > u02.f27901b) {
                return false;
            }
            int i11 = (int) (j12 & 15);
            if (i11 != 0) {
                if (i11 > 11) {
                    int i12 = u02.f27904e;
                    if (i11 != 12) {
                        if (i11 > 14) {
                            return false;
                        }
                        int L8 = lr.L();
                        if (i11 == 14) {
                            L8 *= 10;
                        }
                        if (L8 != i12) {
                            return false;
                        }
                    } else if (lr.K() * 1000 != i12) {
                        return false;
                    }
                } else if (i11 != u02.f27905f) {
                    return false;
                }
            }
            int K8 = lr.K();
            int i13 = lr.f26234b;
            byte[] bArr = lr.f26233a;
            int i14 = i13 - 1;
            String str = AbstractC3548lu.f32613a;
            int i15 = 0;
            for (int i16 = i4; i16 < i14; i16++) {
                i15 = AbstractC3548lu.i[i15 ^ (bArr[i16] & 255)];
            }
            if (K8 != i15) {
                return false;
            }
            if (lr.B() != 0) {
                int I2 = lr.I();
                if ((I2 & 128) != 0) {
                    return false;
                }
                int i17 = (I2 & com.anythink.expressad.video.module.a.a.f21885Q) >> 1;
                if ((i17 >= 2 && i17 <= 7) || (i17 >= 13 && i17 <= 31)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i17).length() + 57);
                    sb.append("Ignoring frame where first subframe has a reserved type: ");
                    sb.append(i17);
                    AbstractC3217fl.y("FlacFrameReader", sb.toString());
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static byte[] m(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i4 = 0;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            int i9 = i4 + i4;
            bArr2[i9] = (byte) (bArr[i4] & 15);
            bArr2[i9 + 1] = (byte) ((bArr[i4] & 255) >> 4);
            i4++;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < 63) {
            byte b9 = (byte) (bArr2[i10] + i11);
            bArr2[i10] = b9;
            int i12 = (b9 + 8) >> 4;
            bArr2[i10] = (byte) (b9 - (i12 << 4));
            i10++;
            i11 = i12;
        }
        bArr2[63] = (byte) (bArr2[63] + i11);
        MF mf = new MF(0);
        MF mf2 = new MF(1);
        for (i = 1; i < 64; i += 2) {
            KF kf = new KF();
            H(kf, i / 2, bArr2[i]);
            MF.a(mf2, mf);
            B(mf, mf2, kf);
        }
        C3602mu c3602mu = new C3602mu(20);
        C3602mu.n(c3602mu, mf);
        F(c3602mu, mf);
        C3602mu.n(c3602mu, mf);
        F(c3602mu, mf);
        C3602mu.n(c3602mu, mf);
        F(c3602mu, mf);
        C3602mu.n(c3602mu, mf);
        F(c3602mu, mf);
        for (int i13 = 0; i13 < 64; i13 += 2) {
            KF kf2 = new KF();
            H(kf2, i13 / 2, bArr2[i13]);
            MF.a(mf2, mf);
            B(mf, mf2, kf2);
        }
        C3602mu c3602mu2 = new C3602mu(mf);
        long[] jArr = new long[10];
        AbstractC3217fl.Y(jArr, (long[]) c3602mu2.f32774u);
        long[] jArr2 = new long[10];
        AbstractC3217fl.Y(jArr2, (long[]) c3602mu2.f32775v);
        long[] jArr3 = new long[10];
        AbstractC3217fl.Y(jArr3, (long[]) c3602mu2.f32776w);
        long[] jArr4 = new long[10];
        AbstractC3217fl.Y(jArr4, jArr3);
        long[] jArr5 = new long[10];
        AbstractC3217fl.z(jArr5, jArr2, jArr);
        AbstractC3217fl.U(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        AbstractC3217fl.U(jArr6, jArr, jArr2);
        AbstractC3217fl.U(jArr6, jArr6, NF.f26498a);
        AbstractC3217fl.p(jArr6, jArr6, jArr4);
        AbstractC3217fl.J(jArr6, jArr6);
        if (MessageDigest.isEqual(AbstractC3217fl.c0(jArr5), AbstractC3217fl.c0(jArr6))) {
            return c3602mu2.t();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static int n(int i, int i4) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i4 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i9 = i / i4;
        int i10 = i - (i4 * i9);
        if (i10 == 0) {
            return i9;
        }
        int i11 = ((i ^ i4) >> 31) | 1;
        switch (RC.f27318a[roundingMode.ordinal()]) {
            case 1:
                PA.v(false);
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
                int abs2 = abs - (Math.abs(i4) - abs);
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

    public static void o(Context context, boolean z8) {
        if (z8) {
            int i = t2.C.f40822b;
            u2.i.e("This request is sent from a test device.");
            return;
        }
        u2.d dVar = C4907p.f40108g.f40109a;
        String c4 = u2.d.c(context);
        String o9 = D.y.o(new StringBuilder(String.valueOf(c4).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", c4, "\")) to get test ads on this device.");
        int i4 = t2.C.f40822b;
        u2.i.e(o9);
    }

    public static byte[] p(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) C3253gK.f30984e.f30987a.d("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static int q(int i, Lr lr) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return lr.K() + 1;
            case 7:
                return lr.L() + 1;
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

    public static int r(SQLiteDatabase sQLiteDatabase, int i) {
        int i4 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor A8 = A(sQLiteDatabase, i);
        if (A8.getCount() > 0) {
            A8.moveToNext();
            i4 = A8.getInt(A8.getColumnIndexOrThrow("value"));
        }
        A8.close();
        return i4;
    }

    public static AbstractList s(List list, XA xa) {
        return list instanceof RandomAccess ? new C3353iC(list, xa) : new C3405jC(list, xa);
    }

    public static final void t(StringBuilder sb, Iterator it, String str) {
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
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    public static B u(int i, J0 j02, Lr lr) {
        B a9 = B.a(j02, lr);
        while (true) {
            int i4 = a9.f23935a;
            if (i4 == i) {
                return a9;
            }
            com.anythink.basead.b.c.i.s(i4, "Ignoring unknown WAV chunk: ", "WavHeaderReader", new StringBuilder(String.valueOf(i4).length() + 28));
            long j9 = a9.f23936b;
            long j10 = 8 + j9;
            if ((1 & j9) != 0) {
                j10 = 9 + j9;
            }
            if (j10 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i4);
                throw W4.c(sb.toString());
            }
            j02.b((int) j10, false);
            a9 = B.a(j02, lr);
        }
    }

    public static Pair v(RandomAccessFile randomAccessFile, int i) {
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
        z(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i9 = capacity2 - 22;
            int min = Math.min(i9, 65535);
            for (int i10 = 0; i10 < min; i10++) {
                i4 = i9 - i10;
                if (allocate.getInt(i4) == 101010256 && ((char) allocate.getShort(i4 + 20)) == i10) {
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

    public static void w(SQLiteDatabase sQLiteDatabase, long j9, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.anythink.expressad.foundation.d.d.f18754u, Long.valueOf(j9));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j9)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static /* synthetic */ boolean x(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        AbstractC3217fl.P(jArr2);
        byte[] c02 = AbstractC3217fl.c0(jArr2);
        for (int i = 0; i < 32; i++) {
            if (c02[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static int y(int i, int i4) {
        int i9;
        if (i < 0 || i >= 3 || i4 < 0 || (i9 = i4 >> 1) >= 19) {
            return -1;
        }
        int i10 = f26185v[i];
        if (i10 == 44100) {
            int i11 = f26189z[i9] + (i4 & 1);
            return i11 + i11;
        }
        int i12 = f26188y[i9];
        return i10 == 32000 ? i12 * 6 : i12 * 4;
    }

    public static void z(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
