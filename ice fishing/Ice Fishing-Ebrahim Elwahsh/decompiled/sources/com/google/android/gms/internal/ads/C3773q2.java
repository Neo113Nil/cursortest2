package com.google.android.gms.internal.ads;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3773q2 implements O0 {
    public static final byte[] m0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: n0, reason: collision with root package name */
    public static final byte[] f33565n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final byte[] f33566o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final byte[] f33567p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final UUID f33568q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final Map f33569r0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f33570A;

    /* renamed from: B, reason: collision with root package name */
    public int f33571B;

    /* renamed from: C, reason: collision with root package name */
    public long f33572C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f33573D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f33574E;

    /* renamed from: F, reason: collision with root package name */
    public long f33575F;

    /* renamed from: G, reason: collision with root package name */
    public int f33576G;

    /* renamed from: H, reason: collision with root package name */
    public long f33577H;

    /* renamed from: I, reason: collision with root package name */
    public long f33578I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f33579K;

    /* renamed from: L, reason: collision with root package name */
    public long f33580L;

    /* renamed from: M, reason: collision with root package name */
    public long f33581M;

    /* renamed from: N, reason: collision with root package name */
    public long f33582N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f33583O;

    /* renamed from: P, reason: collision with root package name */
    public int f33584P;

    /* renamed from: Q, reason: collision with root package name */
    public long f33585Q;

    /* renamed from: R, reason: collision with root package name */
    public long f33586R;

    /* renamed from: S, reason: collision with root package name */
    public int f33587S;

    /* renamed from: T, reason: collision with root package name */
    public int f33588T;

    /* renamed from: U, reason: collision with root package name */
    public int[] f33589U;

    /* renamed from: V, reason: collision with root package name */
    public int f33590V;

    /* renamed from: W, reason: collision with root package name */
    public int f33591W;

    /* renamed from: X, reason: collision with root package name */
    public int f33592X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f33593Z;

    /* renamed from: a, reason: collision with root package name */
    public final C3826r2 f33594a;

    /* renamed from: a0, reason: collision with root package name */
    public long f33595a0;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f33596b;

    /* renamed from: b0, reason: collision with root package name */
    public int f33597b0;

    /* renamed from: c, reason: collision with root package name */
    public final LongSparseArray f33598c;

    /* renamed from: c0, reason: collision with root package name */
    public int f33599c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33600d;

    /* renamed from: d0, reason: collision with root package name */
    public int f33601d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33602e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f33603e0;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3720p3 f33604f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f33605f0;

    /* renamed from: g, reason: collision with root package name */
    public final Lr f33606g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f33607g0;

    /* renamed from: h, reason: collision with root package name */
    public final Lr f33608h;

    /* renamed from: h0, reason: collision with root package name */
    public int f33609h0;
    public final Lr i;

    /* renamed from: i0, reason: collision with root package name */
    public byte f33610i0;

    /* renamed from: j, reason: collision with root package name */
    public final Lr f33611j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f33612j0;

    /* renamed from: k, reason: collision with root package name */
    public final Lr f33613k;

    /* renamed from: k0, reason: collision with root package name */
    public Q0 f33614k0;

    /* renamed from: l, reason: collision with root package name */
    public final Lr f33615l;

    /* renamed from: l0, reason: collision with root package name */
    public final C3503l2 f33616l0;

    /* renamed from: m, reason: collision with root package name */
    public final Lr f33617m;

    /* renamed from: n, reason: collision with root package name */
    public final Lr f33618n;

    /* renamed from: o, reason: collision with root package name */
    public final Lr f33619o;

    /* renamed from: p, reason: collision with root package name */
    public final Lr f33620p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f33621q;

    /* renamed from: r, reason: collision with root package name */
    public long f33622r;

    /* renamed from: s, reason: collision with root package name */
    public long f33623s;

    /* renamed from: t, reason: collision with root package name */
    public long f33624t;

    /* renamed from: u, reason: collision with root package name */
    public long f33625u;

    /* renamed from: v, reason: collision with root package name */
    public long f33626v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33627w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33628x;

    /* renamed from: y, reason: collision with root package name */
    public C3557m2 f33629y;

    /* renamed from: z, reason: collision with root package name */
    public C3719p2 f33630z;

    static {
        String str = AbstractC3548lu.f32613a;
        f33565n0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f33566o0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f33567p0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f33568q0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        com.anythink.basead.b.c.i.y(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        com.anythink.basead.b.c.i.y(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f33569r0 = Collections.unmodifiableMap(hashMap);
    }

    public C3773q2() {
        this(new C3503l2(), 2, InterfaceC3720p3.m0);
    }

    public static byte[] s(String str, long j9, long j10) {
        PA.n(j9 != com.anythink.basead.exoplayer.b.f6539b);
        Locale locale = Locale.US;
        int i = (int) (j9 / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j11 = j9 - (i * 3600000000L);
        int i4 = (int) (j11 / 60000000);
        Integer valueOf2 = Integer.valueOf(i4);
        long j12 = j11 - (i4 * 60000000);
        int i9 = (int) (j12 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i9), Integer.valueOf((int) ((j12 - (i9 * 1000000)) / j10)));
        String str2 = AbstractC3548lu.f32613a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        if (this.f33602e) {
            q02 = new com.bumptech.glide.manager.n(q02, this.f33604f);
        }
        this.f33614k0 = q02;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        G1.a aVar = new G1.a((byte) 0, 5);
        J0 j02 = (J0) p02;
        long j9 = j02.f25674v;
        long j10 = 1024;
        if (j9 != -1 && j9 <= 1024) {
            j10 = j9;
        }
        Lr lr = (Lr) aVar.f1195v;
        j02.I(lr.f26233a, 0, 4, false);
        long P8 = lr.P();
        aVar.f1194u = 4;
        while (true) {
            if (P8 != 440786851) {
                int i = (int) j10;
                int i4 = aVar.f1194u + 1;
                aVar.f1194u = i4;
                if (i4 == i) {
                    break;
                }
                j02.I(lr.f26233a, 0, 1, false);
                P8 = ((P8 << 8) & (-256)) | (lr.f26233a[0] & 255);
            } else {
                long v6 = aVar.v(j02);
                long j11 = aVar.f1194u;
                if (v6 != Long.MIN_VALUE) {
                    long j12 = j11 + v6;
                    if (j9 == -1 || j12 < j9) {
                        while (true) {
                            long j13 = aVar.f1194u;
                            if (j13 < j12) {
                                if (aVar.v(j02) != Long.MIN_VALUE) {
                                    long v9 = aVar.v(j02);
                                    if (v9 < 0) {
                                        break;
                                    }
                                    if (v9 != 0) {
                                        int i9 = (int) v9;
                                        j02.d(i9, false);
                                        aVar.f1194u += i9;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j13 == j12) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        this.f33582N = com.anythink.basead.exoplayer.b.f6539b;
        this.f33584P = 0;
        C3503l2 c3503l2 = this.f33616l0;
        c3503l2.f32522e = 0;
        c3503l2.f32519b.clear();
        C3826r2 c3826r2 = c3503l2.f32520c;
        c3826r2.f33936n = 0;
        c3826r2.f33937u = 0;
        C3826r2 c3826r22 = this.f33594a;
        c3826r22.f33936n = 0;
        c3826r22.f33937u = 0;
        q();
        this.f33574E = false;
        this.f33575F = com.anythink.basead.exoplayer.b.f6539b;
        this.f33576G = -1;
        this.f33577H = -1L;
        this.f33578I = -1L;
        if (!this.f33570A) {
            this.f33573D.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f33596b;
            if (i >= sparseArray.size()) {
                return;
            }
            C3502l1 c3502l1 = ((C3719p2) sparseArray.valueAt(i)).f33285W;
            if (c3502l1 != null) {
                c3502l1.f32512b = false;
                c3502l1.f32513c = 0;
            }
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x068f, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x082c, code lost:
    
        r3 = true;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x071d, code lost:
    
        if (r4 == 1) goto L411;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0227  */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        boolean z8;
        long j9;
        int i;
        String str;
        int i4;
        long j10;
        int i9;
        int i10;
        long j11;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        long j12;
        int i15;
        boolean z10;
        C3773q2 c3773q2;
        String str2;
        int i16;
        char c4;
        List list;
        SparseArray sparseArray;
        int i17;
        long j13;
        int i18;
        int i19;
        long j14;
        long j15;
        int i20;
        C3773q2 c3773q22 = this;
        int i21 = -1;
        int i22 = 0;
        c3773q22.f33583O = false;
        while (!c3773q22.f33583O) {
            C3503l2 c3503l2 = c3773q22.f33616l0;
            c3503l2.f32521d.getClass();
            while (true) {
                ArrayDeque arrayDeque = c3503l2.f32519b;
                C3449k2 c3449k2 = (C3449k2) arrayDeque.peek();
                int i23 = 8;
                int i24 = 374648427;
                RuntimeException runtimeException = null;
                if (c3449k2 == null || ((J0) p02).f25675w < c3449k2.f32235b) {
                    int i25 = c3503l2.f32522e;
                    C3826r2 c3826r2 = c3503l2.f32520c;
                    if (i25 == 0) {
                        J0 j02 = (J0) p02;
                        int i26 = 4;
                        int i27 = 0;
                        long e6 = c3826r2.e(j02, true, false, 4);
                        if (e6 == -2) {
                            j02.k();
                            while (true) {
                                byte[] bArr = c3503l2.f32518a;
                                j02.B(bArr, i27, i26);
                                byte b9 = bArr[i27];
                                int i28 = i23;
                                int i29 = 0;
                                while (true) {
                                    if (i29 < i28) {
                                        i15 = i29 + 1;
                                        j9 = 0;
                                        if ((C3826r2.f33933w[i29] & b9) == 0) {
                                            i29 = i15;
                                            i28 = 8;
                                        }
                                    } else {
                                        j9 = 0;
                                        i15 = -1;
                                    }
                                }
                                if (i15 != -1 && i15 <= 4) {
                                    int g9 = (int) C3826r2.g(i15, false, bArr);
                                    Object obj = c3503l2.f32521d.f32668u;
                                    if (g9 != 357149030 && g9 != 272869232 && g9 != 524531317 && g9 != 475249515) {
                                        if (g9 == 374648427) {
                                        }
                                    }
                                }
                                j02.s(1);
                                i26 = 4;
                                i27 = 0;
                                i23 = 8;
                            }
                            j02.s(i15);
                            j12 = i24;
                        } else {
                            j9 = 0;
                            j12 = e6;
                        }
                        z8 = true;
                        if (j12 == -1) {
                            z9 = false;
                        } else {
                            c3503l2.f32523f = (int) j12;
                            c3503l2.f32522e = 1;
                        }
                    } else {
                        z8 = true;
                        j9 = 0;
                    }
                    c3503l2.f32524g = c3826r2.e((J0) p02, false, z8, 8);
                    c3503l2.f32522e = 2;
                    C3562m7 c3562m7 = c3503l2.f32521d;
                    int i30 = c3503l2.f32523f;
                    C3773q2 c3773q23 = (C3773q2) c3562m7.f32668u;
                    switch (i30) {
                        case 128:
                        case 143:
                        case 160:
                        case 166:
                        case 174:
                        case 182:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 17849:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 272869232:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            long p6 = ((J0) p02).p();
                            arrayDeque.push(new C3449k2(i30, c3503l2.f32524g + p6));
                            ((C3773q2) c3503l2.f32521d.f32668u).i(c3503l2.f32523f, p6, c3503l2.f32524g);
                            i = 0;
                            c3503l2.f32522e = 0;
                            break;
                        case com.anythink.expressad.video.module.a.a.f21890V /* 131 */:
                        case 136:
                        case 137:
                        case 145:
                        case 146:
                        case 152:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 29636:
                        case 29637:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            long j16 = c3503l2.f32524g;
                            if (j16 > 8) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j16).length() + 22);
                                sb.append("Invalid integer size: ");
                                sb.append(j16);
                                throw W4.a(null, sb.toString());
                            }
                            c3773q23.j(i30, c3503l2.a((J0) p02, (int) j16));
                            i = 0;
                            c3503l2.f32522e = 0;
                            break;
                        case 133:
                        case 134:
                        case 17026:
                        case 17276:
                        case 21358:
                        case 2274716:
                            long j17 = c3503l2.f32524g;
                            if (j17 > 2147483647L) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j17).length() + 21);
                                sb2.append("String element size: ");
                                sb2.append(j17);
                                throw W4.a(null, sb2.toString());
                            }
                            int i31 = (int) j17;
                            if (i31 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i31];
                                ((J0) p02).y(bArr2, 0, i31);
                                while (i31 > 0) {
                                    int i32 = i31 - 1;
                                    if (bArr2[i32] == 0) {
                                        i31 = i32;
                                    } else {
                                        str = new String(bArr2, 0, i31);
                                    }
                                }
                                str = new String(bArr2, 0, i31);
                            }
                            c3773q23.getClass();
                            if (i30 == 133) {
                                c3773q23.k(i30);
                                c3773q23.f33629y.f32652h = str;
                            } else if (i30 == 134) {
                                c3773q23.l(i30);
                                c3773q23.f33630z.f33292c = str;
                            } else if (i30 == 17026) {
                                if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    StringBuilder sb3 = new StringBuilder(str.length() + 22);
                                    sb3.append("DocType ");
                                    sb3.append(str);
                                    sb3.append(" not supported");
                                    throw W4.a(null, sb3.toString());
                                }
                                c3773q23.f33627w = str.equals("webm");
                            } else if (i30 == 17276) {
                                c3773q23.k(i30);
                                c3773q23.f33629y.i = str;
                            } else if (i30 == 21358) {
                                c3773q23.l(i30);
                                c3773q23.f33630z.f33290b = str;
                            } else if (i30 == 2274716) {
                                c3773q23.l(i30);
                                c3773q23.f33630z.f33289a0 = str;
                            }
                            i = 0;
                            c3503l2.f32522e = 0;
                            break;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            int i33 = (int) c3503l2.f32524g;
                            SparseArray sparseArray2 = c3773q23.f33596b;
                            if (i30 == 161 || i30 == 163) {
                                int i34 = c3773q23.f33584P;
                                Lr lr = c3773q23.i;
                                if (i34 == 0) {
                                    C3826r2 c3826r22 = c3773q23.f33594a;
                                    i4 = 0;
                                    j10 = 2147483647L;
                                    c3773q23.f33590V = (int) c3826r22.e((J0) p02, false, true, 8);
                                    c3773q23.f33591W = c3826r22.f33937u;
                                    c3773q23.f33586R = com.anythink.basead.exoplayer.b.f6539b;
                                    c3773q23.f33584P = 1;
                                    lr.y(0);
                                } else {
                                    i4 = 0;
                                    j10 = 2147483647L;
                                }
                                C3719p2 c3719p2 = (C3719p2) sparseArray2.get(c3773q23.f33590V);
                                if (c3719p2 == null) {
                                    ((J0) p02).s(i33 - c3773q23.f33591W);
                                    c3773q23.f33584P = i4;
                                    i10 = i4;
                                } else {
                                    c3719p2.f33291b0.getClass();
                                    if (c3773q23.f33584P == 1) {
                                        J0 j03 = (J0) p02;
                                        c3773q23.o(j03, 3);
                                        int i35 = (lr.f26233a[2] & 6) >> 1;
                                        byte b10 = 255;
                                        if (i35 == 0) {
                                            c3773q23.f33588T = 1;
                                            int[] iArr = c3773q23.f33589U;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else {
                                                int length = iArr.length;
                                                if (length < 1) {
                                                    iArr = new int[Math.max(length + length, 1)];
                                                }
                                            }
                                            c3773q23.f33589U = iArr;
                                            iArr[0] = (i33 - c3773q23.f33591W) - 3;
                                        } else {
                                            c3773q23.o(j03, 4);
                                            int i36 = (lr.f26233a[3] & com.anythink.basead.exoplayer.k.p.f8630b) + 1;
                                            c3773q23.f33588T = i36;
                                            int[] iArr2 = c3773q23.f33589U;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i36];
                                            } else {
                                                int length2 = iArr2.length;
                                                if (length2 < i36) {
                                                    iArr2 = new int[Math.max(length2 + length2, i36)];
                                                }
                                            }
                                            c3773q23.f33589U = iArr2;
                                            if (i35 == 2) {
                                                int i37 = (i33 - c3773q23.f33591W) - 4;
                                                int i38 = c3773q23.f33588T;
                                                Arrays.fill(iArr2, 0, i38, i37 / i38);
                                            } else {
                                                int i39 = 0;
                                                if (i35 != 1) {
                                                    if (i35 != 3) {
                                                        throw W4.a(null, "Unexpected lacing value: 2");
                                                    }
                                                    int i40 = 4;
                                                    int i41 = 0;
                                                    int i42 = 0;
                                                    while (true) {
                                                        int i43 = c3773q23.f33588T - 1;
                                                        if (i41 < i43) {
                                                            c3773q23.f33589U[i41] = 0;
                                                            int i44 = 1;
                                                            int i45 = i40 + 1;
                                                            c3773q23.o(j03, i45);
                                                            if (lr.f26233a[i40] == 0) {
                                                                throw W4.a(runtimeException, "No valid varint length mask found");
                                                            }
                                                            int i46 = 0;
                                                            while (true) {
                                                                if (i46 < 8) {
                                                                    int i47 = i44 << (7 - i46);
                                                                    if ((lr.f26233a[i40] & i47) != 0) {
                                                                        int i48 = i45 + i46;
                                                                        c3773q23.o(j03, i48);
                                                                        j11 = (~i47) & lr.f26233a[i40] & b10;
                                                                        while (i45 < i48) {
                                                                            j11 = (j11 << 8) | (lr.f26233a[i45] & 255);
                                                                            i45++;
                                                                        }
                                                                        if (i41 > 0) {
                                                                            j11 -= (1 << ((i46 * 7) + 6)) - 1;
                                                                        }
                                                                        i40 = i48;
                                                                    } else {
                                                                        i46++;
                                                                        b10 = 255;
                                                                        i44 = 1;
                                                                    }
                                                                } else {
                                                                    i40 = i45;
                                                                    j11 = j9;
                                                                }
                                                            }
                                                            if (j11 >= -2147483648L && j11 <= j10) {
                                                                int[] iArr3 = c3773q23.f33589U;
                                                                int i49 = (int) j11;
                                                                if (i41 != 0) {
                                                                    i49 += iArr3[i41 - 1];
                                                                }
                                                                iArr3[i41] = i49;
                                                                i42 += i49;
                                                                i41++;
                                                                b10 = 255;
                                                                runtimeException = null;
                                                            }
                                                        } else {
                                                            c3773q23.f33589U[i43] = ((i33 - c3773q23.f33591W) - i40) - i42;
                                                        }
                                                    }
                                                    throw W4.a(null, "EBML lacing sample size out of range.");
                                                }
                                                int i50 = 4;
                                                int i51 = 0;
                                                int i52 = 0;
                                                while (true) {
                                                    int i53 = c3773q23.f33588T - 1;
                                                    if (i51 < i53) {
                                                        c3773q23.f33589U[i51] = i39;
                                                        while (true) {
                                                            i11 = i50 + 1;
                                                            c3773q23.o(j03, i11);
                                                            int i54 = lr.f26233a[i50] & 255;
                                                            int[] iArr4 = c3773q23.f33589U;
                                                            i12 = iArr4[i51] + i54;
                                                            iArr4[i51] = i12;
                                                            if (i54 != 255) {
                                                                break;
                                                            }
                                                            i50 = i11;
                                                        }
                                                        i52 += i12;
                                                        i51++;
                                                        i50 = i11;
                                                        i39 = 0;
                                                    } else {
                                                        c3773q23.f33589U[i53] = ((i33 - c3773q23.f33591W) - i50) - i52;
                                                    }
                                                }
                                            }
                                        }
                                        byte[] bArr3 = lr.f26233a;
                                        c3773q23.f33585Q = c3773q23.g((bArr3[1] & 255) | (bArr3[0] << 8)) + c3773q23.f33582N;
                                        if (c3719p2.f33297f == 1) {
                                            i13 = 2;
                                            i14 = 1;
                                        } else if (i30 == 163) {
                                            i13 = 2;
                                            i14 = (lr.f26233a[2] & com.anythink.core.common.s.a.c.f16474a) == 128 ? 1 : 0;
                                            i30 = 163;
                                        } else {
                                            i13 = 2;
                                            i14 = 0;
                                        }
                                        c3773q23.f33592X = i14;
                                        c3773q23.f33584P = i13;
                                        c3773q23.f33587S = 0;
                                        i9 = 163;
                                    } else {
                                        i9 = 163;
                                    }
                                    if (i30 == i9) {
                                        while (true) {
                                            int i55 = c3773q23.f33587S;
                                            if (i55 < c3773q23.f33588T) {
                                                c3773q23.n(c3719p2, c3773q23.f33585Q + ((c3773q23.f33587S * c3719p2.f33298g) / 1000), c3773q23.f33592X, c3773q23.p((J0) p02, c3719p2, c3773q23.f33589U[i55], false), 0);
                                                c3773q23.f33587S++;
                                            } else {
                                                i10 = 0;
                                                c3773q23.f33584P = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            int i56 = c3773q23.f33587S;
                                            if (i56 < c3773q23.f33588T) {
                                                int[] iArr5 = c3773q23.f33589U;
                                                iArr5[i56] = c3773q23.p((J0) p02, c3719p2, iArr5[i56], true);
                                                c3773q23.f33587S++;
                                            } else {
                                                i10 = 0;
                                            }
                                        }
                                    }
                                }
                                c3503l2.f32522e = i10 == true ? 1 : 0;
                                i = i10;
                                break;
                            } else if (i30 != 165) {
                                if (i30 == 16877) {
                                    c3773q23.l(i30);
                                    C3719p2 c3719p22 = c3773q23.f33630z;
                                    int i57 = c3719p22.i;
                                    if (i57 == 1685485123 || i57 == 1685480259) {
                                        byte[] bArr4 = new byte[i33];
                                        c3719p22.f33278P = bArr4;
                                        i10 = 0;
                                        ((J0) p02).y(bArr4, 0, i33);
                                    } else {
                                        ((J0) p02).s(i33);
                                        i10 = 0;
                                    }
                                } else if (i30 == 16981) {
                                    i10 = 0;
                                    c3773q23.l(i30);
                                    byte[] bArr5 = new byte[i33];
                                    c3773q23.f33630z.f33301k = bArr5;
                                    ((J0) p02).y(bArr5, 0, i33);
                                } else if (i30 == 18402) {
                                    i10 = 0;
                                    byte[] bArr6 = new byte[i33];
                                    ((J0) p02).y(bArr6, 0, i33);
                                    c3773q23.l(i30);
                                    c3773q23.f33630z.f33302l = new C3394j1(1, bArr6, 0, 0);
                                } else if (i30 == 21419) {
                                    i10 = 0;
                                    Lr lr2 = c3773q23.f33613k;
                                    Arrays.fill(lr2.f26233a, (byte) 0);
                                    ((J0) p02).y(lr2.f26233a, 4 - i33, i33);
                                    lr2.E(0);
                                    c3773q23.f33571B = (int) lr2.P();
                                } else if (i30 == 25506) {
                                    c3773q23.l(i30);
                                    byte[] bArr7 = new byte[i33];
                                    c3773q23.f33630z.f33303m = bArr7;
                                    i10 = 0;
                                    ((J0) p02).y(bArr7, 0, i33);
                                } else {
                                    if (i30 != 30322) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(i30).length() + 15);
                                        sb4.append("Unexpected id: ");
                                        sb4.append(i30);
                                        throw W4.a(null, sb4.toString());
                                    }
                                    c3773q23.l(i30);
                                    byte[] bArr8 = new byte[i33];
                                    c3773q23.f33630z.f33315y = bArr8;
                                    i10 = 0;
                                    ((J0) p02).y(bArr8, 0, i33);
                                }
                                c3503l2.f32522e = i10 == true ? 1 : 0;
                                i = i10;
                            } else {
                                if (c3773q23.f33584P == 2) {
                                    C3719p2 c3719p23 = (C3719p2) sparseArray2.get(c3773q23.f33590V);
                                    if (c3773q23.Y == 4 && "V_VP9".equals(c3719p23.f33292c)) {
                                        Lr lr3 = c3773q23.f33620p;
                                        lr3.y(i33);
                                        i10 = 0;
                                        ((J0) p02).y(lr3.f26233a, 0, i33);
                                        c3503l2.f32522e = i10 == true ? 1 : 0;
                                        i = i10;
                                    } else {
                                        ((J0) p02).s(i33);
                                    }
                                }
                                i10 = 0;
                                c3503l2.f32522e = i10 == true ? 1 : 0;
                                i = i10;
                            }
                            if (z9) {
                                long p9 = ((J0) p02).p();
                                c3773q2 = this;
                                if (c3773q2.f33579K) {
                                    c3773q2.f33581M = p9;
                                    s02.f27467n = c3773q2.f33580L;
                                    c3773q2.f33579K = z10;
                                    return 1;
                                }
                                if (c3773q2.f33570A) {
                                    long j18 = c3773q2.f33581M;
                                    if (j18 != -1) {
                                        s02.f27467n = j18;
                                        c3773q2.f33581M = -1L;
                                        return 1;
                                    }
                                }
                            } else {
                                c3773q2 = this;
                            }
                            if (z9) {
                                c3773q22 = c3773q2;
                                i21 = -1;
                                i22 = 0;
                            } else {
                                int i58 = 0;
                                while (true) {
                                    SparseArray sparseArray3 = c3773q2.f33596b;
                                    if (i58 >= sparseArray3.size()) {
                                        return -1;
                                    }
                                    C3719p2 c3719p24 = (C3719p2) sparseArray3.valueAt(i58);
                                    c3719p24.f33291b0.getClass();
                                    C3502l1 c3502l1 = c3719p24.f33285W;
                                    if (c3502l1 != null) {
                                        c3502l1.c(c3719p24.f33291b0, c3719p24.f33302l);
                                    }
                                    i58++;
                                }
                            }
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            long j19 = c3503l2.f32524g;
                            if (j19 != 4 && j19 != 8) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(j19).length() + 20);
                                sb5.append("Invalid float size: ");
                                sb5.append(j19);
                                throw W4.a(null, sb5.toString());
                            }
                            int i59 = (int) j19;
                            double intBitsToFloat = i59 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(c3503l2.a((J0) p02, i59));
                            if (i30 == 181) {
                                c3773q23.l(i30);
                                c3773q23.f33630z.f33282T = (int) intBitsToFloat;
                            } else if (i30 != 17545) {
                                switch (i30) {
                                    case 21969:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.f33269F = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.f33270G = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.f33271H = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.f33272I = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.J = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.f33273K = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.f33274L = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.f33275M = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.f33276N = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        c3773q23.l(i30);
                                        c3773q23.f33630z.f33277O = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i30) {
                                            case 30323:
                                                c3773q23.l(i30);
                                                c3773q23.f33630z.f33312v = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                c3773q23.l(i30);
                                                c3773q23.f33630z.f33313w = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                c3773q23.l(i30);
                                                c3773q23.f33630z.f33314x = (float) intBitsToFloat;
                                                break;
                                            default:
                                                c3773q23.getClass();
                                                break;
                                        }
                                }
                            } else {
                                c3773q23.f33625u = (long) intBitsToFloat;
                            }
                            i = 0;
                            c3503l2.f32522e = 0;
                            break;
                        default:
                            ((J0) p02).s((int) c3503l2.f32524g);
                            c3503l2.f32522e = 0;
                            i21 = -1;
                    }
                } else {
                    C3562m7 c3562m72 = c3503l2.f32521d;
                    int i60 = ((C3449k2) arrayDeque.pop()).f32234a;
                    C3773q2 c3773q24 = (C3773q2) c3562m72.f32668u;
                    c3773q24.f33614k0.getClass();
                    if (i60 != 128) {
                        SparseArray sparseArray4 = c3773q24.f33596b;
                        if (i60 != 160) {
                            if (i60 != 174) {
                                LongSparseArray longSparseArray = c3773q24.f33598c;
                                if (i60 == 17849) {
                                    for (int i61 = 0; i61 < sparseArray4.size(); i61++) {
                                        C3719p2 c3719p25 = (C3719p2) sparseArray4.valueAt(i61);
                                        ArrayList arrayList = new ArrayList(longSparseArray.size());
                                        for (int i62 = 0; i62 < longSparseArray.size(); i62++) {
                                            C3557m2 c3557m2 = (C3557m2) longSparseArray.valueAt(i62);
                                            long j20 = c3557m2.f32649e;
                                            if (j20 == 0 || j20 == c3719p25.f33296e) {
                                                long j21 = c3557m2.f32646b;
                                                String str3 = AbstractC3548lu.f32613a;
                                                if (j21 != com.anythink.basead.exoplayer.b.f6539b && j21 != Long.MIN_VALUE) {
                                                    j21 /= 1000000;
                                                }
                                                long j22 = j21;
                                                long j23 = c3557m2.f32647c;
                                                if (j23 != com.anythink.basead.exoplayer.b.f6539b && j23 != Long.MIN_VALUE) {
                                                    j23 /= 1000000;
                                                }
                                                arrayList.add(new M1(j22, j23, c3557m2.f32648d, c3557m2.f32650f != null ? new C3904sQ(c3557m2.f32651g, c3557m2.f32650f) : null));
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            TP tp = c3719p25.f33293c0;
                                            tp.getClass();
                                            C4065vP a9 = tp.a();
                                            R3 r32 = tp.f27773l;
                                            a9.f34782k = r32 != null ? r32.c((InterfaceC4043v3[]) arrayList.toArray(new L1[0])) : new R3(arrayList);
                                            c3719p25.f33293c0 = new TP(a9);
                                        }
                                    }
                                } else {
                                    if (i60 == 19899) {
                                        int i63 = c3773q24.f33571B;
                                        if (i63 != -1) {
                                            long j24 = c3773q24.f33572C;
                                            if (j24 != -1) {
                                                if (i63 == 475249515) {
                                                    c3773q24.f33580L = j24;
                                                }
                                            }
                                        }
                                        throw W4.a(null, "Mandatory element SeekID or SeekPosition not found");
                                    }
                                    if (i60 == 25152) {
                                        c3773q24.l(i60);
                                        C3719p2 c3719p26 = c3773q24.f33630z;
                                        if (c3719p26.f33300j) {
                                            C3394j1 c3394j1 = c3719p26.f33302l;
                                            if (c3394j1 == null) {
                                                throw W4.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                            }
                                            c3719p26.f33304n = new RO(null, true, new NO(AbstractC3389ix.f32028a, com.anythink.basead.exoplayer.k.o.f8606f, c3394j1.f32057b));
                                        }
                                    } else if (i60 == 28032) {
                                        c3773q24.l(i60);
                                        C3719p2 c3719p27 = c3773q24.f33630z;
                                        if (c3719p27.f33300j && c3719p27.f33301k != null) {
                                            throw W4.a(null, "Combining encryption and compression is not supported");
                                        }
                                    } else if (i60 == 357149030) {
                                        if (c3773q24.f33624t == com.anythink.basead.exoplayer.b.f6539b) {
                                            c3773q24.f33624t = 1000000L;
                                        }
                                        long j25 = c3773q24.f33625u;
                                        if (j25 != com.anythink.basead.exoplayer.b.f6539b) {
                                            c3773q24.f33626v = c3773q24.g(j25);
                                        }
                                    } else if (i60 != 374648427) {
                                        SparseArray sparseArray5 = c3773q24.f33573D;
                                        if (i60 != 475249515) {
                                            if (i60 == 182) {
                                                C3557m2 c3557m22 = c3773q24.f33629y;
                                                c3557m22.getClass();
                                                long j26 = c3557m22.f32645a;
                                                if (j26 != 0) {
                                                    longSparseArray.put(j26, c3557m22);
                                                }
                                                c3773q24.f33629y = null;
                                            } else if (i60 == 183 && !c3773q24.f33570A) {
                                                c3773q24.m(i60);
                                                if (c3773q24.f33575F != com.anythink.basead.exoplayer.b.f6539b && (i20 = c3773q24.f33576G) != i21 && c3773q24.f33577H != -1) {
                                                    List list2 = (List) sparseArray5.get(i20);
                                                    if (list2 == null) {
                                                        list2 = new ArrayList();
                                                        sparseArray5.put(c3773q24.f33576G, list2);
                                                    }
                                                    list2.add(new C3611n2(c3773q24.f33575F, c3773q24.f33623s + c3773q24.f33577H, c3773q24.f33578I));
                                                }
                                            }
                                        } else if (!c3773q24.f33570A) {
                                            int i64 = 0;
                                            while (true) {
                                                if (i64 < sparseArray5.size()) {
                                                    if (((List) sparseArray5.valueAt(i64)).isEmpty()) {
                                                        i64++;
                                                    } else if (c3773q24.f33626v != com.anythink.basead.exoplayer.b.f6539b) {
                                                        for (int i65 = 0; i65 < sparseArray5.size(); i65++) {
                                                            Collections.sort((List) sparseArray5.valueAt(i65));
                                                        }
                                                        c3773q24.f33614k0.w(new C3665o2(sparseArray5, c3773q24.f33626v, c3773q24.J, c3773q24.f33623s, c3773q24.f33622r));
                                                    }
                                                }
                                            }
                                            c3773q24.f33614k0.w(new T0(c3773q24.f33626v, 0L));
                                            c3773q24.f33570A = true;
                                            c3773q24.f33574E = false;
                                            int i66 = 0;
                                            while (i66 < sparseArray4.size()) {
                                                C3719p2 c3719p28 = (C3719p2) sparseArray4.valueAt(i66);
                                                long j27 = c3773q24.f33626v;
                                                long j28 = c3773q24.f33623s;
                                                long j29 = c3773q24.f33622r;
                                                if (c3719p28.f33297f != 2 || (list = (List) sparseArray5.get(c3719p28.f33294d)) == null || list.isEmpty()) {
                                                    sparseArray = sparseArray5;
                                                    i17 = i66;
                                                } else {
                                                    if (list.isEmpty()) {
                                                        sparseArray = sparseArray5;
                                                        i17 = i66;
                                                    } else {
                                                        int i67 = i21;
                                                        int min = Math.min(list.size(), 20);
                                                        double d2 = 0.0d;
                                                        sparseArray = sparseArray5;
                                                        int i68 = i67;
                                                        int i69 = 0;
                                                        while (true) {
                                                            if (i69 < min) {
                                                                i17 = i66;
                                                                C3611n2 c3611n2 = (C3611n2) list.get(i69);
                                                                long j30 = j27;
                                                                if (c3611n2.f32817n <= 10000000) {
                                                                    int i70 = i69 + 1;
                                                                    int size = list.size() - 1;
                                                                    long j31 = j28;
                                                                    long j32 = c3611n2.f32817n;
                                                                    long j33 = c3611n2.f32819v;
                                                                    long j34 = c3611n2.f32818u;
                                                                    if (i69 < size) {
                                                                        C3611n2 c3611n22 = (C3611n2) list.get(i70);
                                                                        i19 = i70;
                                                                        i18 = i69;
                                                                        j15 = c3611n22.f32817n - j32;
                                                                        j14 = (c3611n22.f32818u + c3611n22.f32819v) - (j34 + j33);
                                                                    } else {
                                                                        i18 = i69;
                                                                        i19 = i70;
                                                                        j14 = (j31 + j29) - (j34 + j33);
                                                                        j15 = j30 - j32;
                                                                    }
                                                                    if (j15 > 0) {
                                                                        double d3 = j14 / j15;
                                                                        if (d3 > d2) {
                                                                            d2 = d3;
                                                                            i68 = i18;
                                                                        }
                                                                    }
                                                                    i69 = i19;
                                                                    i66 = i17;
                                                                    j27 = j30;
                                                                    j28 = j31;
                                                                }
                                                            } else {
                                                                i17 = i66;
                                                            }
                                                        }
                                                        if (i68 != i67) {
                                                            j13 = ((C3611n2) list.get(i68)).f32817n;
                                                            if (j13 != com.anythink.basead.exoplayer.b.f6539b) {
                                                                TP tp2 = c3719p28.f33293c0;
                                                                tp2.getClass();
                                                                O1 o12 = new O1(j13);
                                                                R3 r33 = tp2.f27773l;
                                                                R3 r34 = r33 == null ? new R3(o12) : r33.c(o12);
                                                                TP tp3 = c3719p28.f33293c0;
                                                                tp3.getClass();
                                                                C4065vP c4065vP = new C4065vP(tp3);
                                                                c4065vP.f34782k = r34;
                                                                c3719p28.f33293c0 = new TP(c4065vP);
                                                            }
                                                        }
                                                    }
                                                    j13 = -9223372036854775807L;
                                                    if (j13 != com.anythink.basead.exoplayer.b.f6539b) {
                                                    }
                                                }
                                                if (!c3719p28.f33286X) {
                                                    c3719p28.f33291b0.getClass();
                                                    InterfaceC3448k1 interfaceC3448k1 = c3719p28.f33291b0;
                                                    TP tp4 = c3719p28.f33293c0;
                                                    tp4.getClass();
                                                    interfaceC3448k1.e(tp4);
                                                }
                                                i66 = i17 + 1;
                                                sparseArray5 = sparseArray;
                                                i21 = -1;
                                            }
                                            c3773q24.h();
                                        }
                                    } else {
                                        if (sparseArray4.size() == 0) {
                                            throw W4.a(null, "No valid tracks were found");
                                        }
                                        boolean z11 = !c3773q24.f33600d || c3773q24.f33580L == -1;
                                        int i71 = -1;
                                        int i72 = -1;
                                        int i73 = -1;
                                        int i74 = -1;
                                        for (int i75 = 0; i75 < sparseArray4.size(); i75++) {
                                            C3719p2 c3719p29 = (C3719p2) sparseArray4.valueAt(i75);
                                            int i76 = c3719p29.f33297f;
                                            if (i76 == 2) {
                                                if (c3719p29.f33287Z) {
                                                    i71 = c3719p29.f33294d;
                                                }
                                                if (i72 == -1) {
                                                    i72 = c3719p29.f33294d;
                                                }
                                            } else if (i76 == 1) {
                                                if (c3719p29.f33287Z) {
                                                    i73 = c3719p29.f33294d;
                                                }
                                                if (i74 == -1) {
                                                    i74 = c3719p29.f33294d;
                                                }
                                            }
                                            if (z11) {
                                                c3719p29.f33291b0.getClass();
                                                if (!c3719p29.f33286X) {
                                                    InterfaceC3448k1 interfaceC3448k12 = c3719p29.f33291b0;
                                                    TP tp5 = c3719p29.f33293c0;
                                                    tp5.getClass();
                                                    interfaceC3448k12.e(tp5);
                                                }
                                            }
                                        }
                                        if (i71 != -1) {
                                            c3773q24.J = i71;
                                        } else if (i72 != -1) {
                                            c3773q24.J = i72;
                                        } else if (i73 != -1) {
                                            c3773q24.J = i73;
                                        } else if (i74 != -1) {
                                            c3773q24.J = i74;
                                        } else {
                                            c3773q24.J = sparseArray4.size() > 0 ? ((C3719p2) sparseArray4.valueAt(0)).f33294d : -1;
                                        }
                                        if (z11) {
                                            c3773q24.h();
                                        }
                                    }
                                }
                            } else {
                                C3719p2 c3719p210 = c3773q24.f33630z;
                                c3719p210.getClass();
                                String str4 = c3719p210.f33292c;
                                if (str4 == null) {
                                    throw W4.a(null, "CodecId is missing in TrackEntry element");
                                }
                                switch (str4.hashCode()) {
                                    case -2095576542:
                                        if (str4.equals("V_MPEG4/ISO/AP")) {
                                            c4 = 6;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -2095575984:
                                        if (str4.equals("V_MPEG4/ISO/SP")) {
                                            c4 = 4;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1985379776:
                                        if (str4.equals("A_MS/ACM")) {
                                            c4 = 23;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1784763192:
                                        if (str4.equals("A_TRUEHD")) {
                                            c4 = 18;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1730367663:
                                        if (str4.equals("A_VORBIS")) {
                                            c4 = '\f';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1482641358:
                                        if (str4.equals("A_MPEG/L2")) {
                                            c4 = 14;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1482641357:
                                        if (str4.equals("A_MPEG/L3")) {
                                            c4 = 15;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -1373388978:
                                        if (str4.equals("V_MS/VFW/FOURCC")) {
                                            c4 = '\t';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -933872740:
                                        if (str4.equals("S_DVBSUB")) {
                                            c4 = '!';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -538363189:
                                        if (str4.equals("V_MPEG4/ISO/ASP")) {
                                            c4 = 5;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -538363109:
                                        if (str4.equals("V_MPEG4/ISO/AVC")) {
                                            c4 = 7;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -425012669:
                                        if (str4.equals("S_VOBSUB")) {
                                            c4 = 31;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case -356037306:
                                        if (str4.equals("A_DTS/LOSSLESS")) {
                                            c4 = 21;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 62923557:
                                        if (str4.equals("A_AAC")) {
                                            c4 = '\r';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 62923603:
                                        if (str4.equals("A_AC3")) {
                                            c4 = 16;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 62927045:
                                        if (str4.equals("A_DTS")) {
                                            c4 = 19;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 82318131:
                                        if (str4.equals("V_AV1")) {
                                            c4 = 2;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 82338133:
                                        if (str4.equals("V_VP8")) {
                                            c4 = 0;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 82338134:
                                        if (str4.equals("V_VP9")) {
                                            c4 = 1;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 99146302:
                                        if (str4.equals("S_HDMV/PGS")) {
                                            c4 = ' ';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 444813526:
                                        if (str4.equals("V_THEORA")) {
                                            c4 = '\n';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 542569478:
                                        if (str4.equals("A_DTS/EXPRESS")) {
                                            c4 = 20;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 635596514:
                                        if (str4.equals("A_PCM/FLOAT/IEEE")) {
                                            c4 = 26;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 725948237:
                                        if (str4.equals("A_PCM/INT/BIG")) {
                                            c4 = 25;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 725957860:
                                        if (str4.equals("A_PCM/INT/LIT")) {
                                            c4 = 24;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 738597099:
                                        if (str4.equals("S_TEXT/ASS")) {
                                            c4 = 28;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 738614379:
                                        if (str4.equals("S_TEXT/SSA")) {
                                            c4 = 29;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 855502857:
                                        if (str4.equals("V_MPEGH/ISO/HEVC")) {
                                            c4 = '\b';
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1045209816:
                                        if (str4.equals("S_TEXT/WEBVTT")) {
                                            c4 = 30;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1422270023:
                                        if (str4.equals("S_TEXT/UTF8")) {
                                            c4 = 27;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1809237540:
                                        if (str4.equals("V_MPEG2")) {
                                            c4 = 3;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1950749482:
                                        if (str4.equals("A_EAC3")) {
                                            c4 = 17;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1950789798:
                                        if (str4.equals("A_FLAC")) {
                                            c4 = 22;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    case 1951062397:
                                        if (str4.equals("A_OPUS")) {
                                            c4 = 11;
                                            break;
                                        }
                                        c4 = 65535;
                                        break;
                                    default:
                                        c4 = 65535;
                                        break;
                                }
                                switch (c4) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case ' ':
                                    case '!':
                                        c3719p210.a(c3719p210.f33294d);
                                        c3719p210.f33291b0 = c3773q24.f33614k0.x(c3719p210.f33294d, c3719p210.f33297f);
                                        sparseArray4.put(c3719p210.f33294d, c3719p210);
                                        break;
                                }
                                c3773q24.f33630z = null;
                            }
                        } else if (c3773q24.f33584P == 2) {
                            C3719p2 c3719p211 = (C3719p2) sparseArray4.get(c3773q24.f33590V);
                            c3719p211.f33291b0.getClass();
                            if (c3773q24.f33595a0 > 0 && "A_OPUS".equals(c3719p211.f33292c)) {
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c3773q24.f33595a0).array();
                                c3773q24.f33620p.z(array.length, array);
                            }
                            int i77 = 0;
                            for (int i78 = 0; i78 < c3773q24.f33588T; i78++) {
                                i77 += c3773q24.f33589U[i78];
                            }
                            int i79 = 0;
                            while (i79 < c3773q24.f33588T) {
                                long j35 = c3773q24.f33585Q + ((c3719p211.f33298g * i79) / 1000);
                                int i80 = c3773q24.f33592X;
                                if (i79 == 0) {
                                    if (!c3773q24.f33593Z) {
                                        i80 |= 1;
                                    }
                                    i16 = i80;
                                    i79 = 0;
                                } else {
                                    i16 = i80;
                                }
                                int i81 = c3773q24.f33589U[i79];
                                int i82 = i77 - i81;
                                c3773q24.n(c3719p211, j35, i16, i81, i82);
                                i79++;
                                i77 = i82;
                            }
                            c3773q24.f33584P = 0;
                        }
                    } else {
                        C3557m2 c3557m23 = c3773q24.f33629y;
                        c3557m23.getClass();
                        if (c3557m23.f32650f == null && (str2 = c3557m23.f32652h) != null) {
                            c3557m23.f32650f = str2;
                            String str5 = c3557m23.i;
                            if (str5 != null) {
                                c3557m23.f32651g = str5;
                            }
                        }
                    }
                    z9 = true;
                }
            }
        }
        return i22;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }

    public final long g(long j9) {
        long j10 = this.f33624t;
        if (j10 != com.anythink.basead.exoplayer.b.f6539b) {
            return AbstractC3548lu.w(j9, j10, 1000L, RoundingMode.DOWN);
        }
        throw W4.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final void h() {
        if (!this.f33628x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f33596b;
            if (i >= sparseArray.size()) {
                Q0 q02 = this.f33614k0;
                q02.getClass();
                q02.v();
                this.f33628x = false;
                return;
            }
            if (((C3719p2) sparseArray.valueAt(i)).f33286X) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void i(int i, long j9, long j10) {
        Q0 q02 = this.f33614k0;
        q02.getClass();
        if (i == 128) {
            k(i);
            this.f33629y.f32652h = null;
            k(i);
            this.f33629y.i = null;
            return;
        }
        if (i == 160) {
            this.f33593Z = false;
            this.f33595a0 = 0L;
            return;
        }
        if (i == 174) {
            C3719p2 c3719p2 = new C3719p2();
            c3719p2.f33305o = -1;
            c3719p2.f33306p = -1;
            c3719p2.f33307q = -1;
            c3719p2.f33308r = -1;
            c3719p2.f33309s = -1;
            c3719p2.f33310t = 0;
            c3719p2.f33311u = -1;
            c3719p2.f33312v = 0.0f;
            c3719p2.f33313w = 0.0f;
            c3719p2.f33314x = 0.0f;
            c3719p2.f33315y = null;
            c3719p2.f33316z = -1;
            c3719p2.f33264A = -1;
            c3719p2.f33265B = -1;
            c3719p2.f33266C = -1;
            c3719p2.f33267D = 1000;
            c3719p2.f33268E = 200;
            c3719p2.f33269F = -1.0f;
            c3719p2.f33270G = -1.0f;
            c3719p2.f33271H = -1.0f;
            c3719p2.f33272I = -1.0f;
            c3719p2.J = -1.0f;
            c3719p2.f33273K = -1.0f;
            c3719p2.f33274L = -1.0f;
            c3719p2.f33275M = -1.0f;
            c3719p2.f33276N = -1.0f;
            c3719p2.f33277O = -1.0f;
            c3719p2.f33279Q = 1;
            c3719p2.f33280R = -1;
            c3719p2.f33281S = -1;
            c3719p2.f33282T = 8000;
            c3719p2.f33283U = 0L;
            c3719p2.f33284V = 0L;
            c3719p2.f33286X = false;
            c3719p2.f33287Z = true;
            c3719p2.f33289a0 = "eng";
            this.f33630z = c3719p2;
            c3719p2.f33288a = this.f33627w;
            return;
        }
        if (i == 187) {
            if (this.f33570A) {
                return;
            }
            m(i);
            this.f33575F = com.anythink.basead.exoplayer.b.f6539b;
            return;
        }
        if (i == 19899) {
            this.f33571B = -1;
            this.f33572C = -1L;
            return;
        }
        if (i == 20533) {
            l(i);
            this.f33630z.f33300j = true;
            return;
        }
        if (i == 408125543) {
            long j11 = this.f33623s;
            if (j11 != -1 && j11 != j9) {
                throw W4.a(null, "Multiple Segment elements not supported");
            }
            this.f33623s = j9;
            this.f33622r = j10;
            return;
        }
        if (i == 475249515) {
            if (this.f33570A) {
                return;
            }
            this.f33574E = true;
            return;
        }
        if (i == 524531317) {
            if (this.f33570A) {
                return;
            }
            if (this.f33600d && this.f33580L != -1) {
                this.f33579K = true;
                return;
            } else {
                q02.w(new T0(this.f33626v, 0L));
                this.f33570A = true;
                return;
            }
        }
        if (i == 182) {
            C3557m2 c3557m2 = new C3557m2();
            c3557m2.f32646b = com.anythink.basead.exoplayer.b.f6539b;
            c3557m2.f32647c = com.anythink.basead.exoplayer.b.f6539b;
            this.f33629y = c3557m2;
            return;
        }
        if (i == 183 && !this.f33570A) {
            m(i);
            this.f33576G = -1;
            this.f33577H = -1L;
            this.f33578I = -1L;
        }
    }

    public final void j(int i, long j9) {
        boolean z8;
        if (i == 136) {
            z8 = j9 == 1;
            l(i);
            this.f33630z.f33287Z = z8;
            return;
        }
        if (i == 137) {
            k(i);
            this.f33629y.f32649e = j9;
            return;
        }
        if (i == 145) {
            k(i);
            this.f33629y.f32646b = j9;
            return;
        }
        if (i == 146) {
            k(i);
            this.f33629y.f32647c = j9;
            return;
        }
        if (i == 240) {
            if (this.f33570A) {
                return;
            }
            m(i);
            if (this.f33578I == -1) {
                this.f33578I = j9;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.f33570A) {
                return;
            }
            m(i);
            if (this.f33577H == -1) {
                this.f33577H = j9;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j9 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j9);
            sb.append(" not supported");
            throw W4.a(null, sb.toString());
        }
        if (i == 20530) {
            if (j9 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j9).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j9);
            sb2.append(" not supported");
            throw W4.a(null, sb2.toString());
        }
        if (i == 29636) {
            k(i);
            this.f33629y.f32645a = j9;
            return;
        }
        if (i == 29637) {
            l(i);
            this.f33630z.f33296e = j9;
            return;
        }
        switch (i) {
            case com.anythink.expressad.video.module.a.a.f21890V /* 131 */:
                int i4 = (int) j9;
                if (i4 == 1) {
                    l(i);
                    this.f33630z.f33297f = 2;
                    return;
                }
                if (i4 == 2) {
                    l(i);
                    this.f33630z.f33297f = 1;
                    return;
                } else if (i4 == 17) {
                    l(i);
                    this.f33630z.f33297f = 3;
                    return;
                } else if (i4 != 33) {
                    l(i);
                    this.f33630z.f33297f = -1;
                    return;
                } else {
                    l(i);
                    this.f33630z.f33297f = 5;
                    return;
                }
            case 152:
                z8 = j9 == 1;
                k(i);
                this.f33629y.f32648d = z8;
                return;
            case 155:
                this.f33586R = g(j9);
                return;
            case 159:
                l(i);
                this.f33630z.f33279Q = (int) j9;
                return;
            case 176:
                l(i);
                this.f33630z.f33305o = (int) j9;
                return;
            case 179:
                if (this.f33570A) {
                    return;
                }
                m(i);
                this.f33575F = g(j9);
                return;
            case 186:
                l(i);
                this.f33630z.f33306p = (int) j9;
                return;
            case 215:
                l(i);
                this.f33630z.f33294d = (int) j9;
                return;
            case 231:
                this.f33582N = g(j9);
                return;
            case 238:
                this.Y = (int) j9;
                return;
            case 247:
                if (this.f33570A) {
                    return;
                }
                m(i);
                this.f33576G = (int) j9;
                return;
            case 251:
                this.f33593Z = true;
                return;
            case 16871:
                l(i);
                this.f33630z.i = (int) j9;
                return;
            case 16980:
                if (j9 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j9).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j9);
                sb3.append(" not supported");
                throw W4.a(null, sb3.toString());
            case 17029:
                if (j9 < 1 || j9 > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j9).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j9);
                    sb4.append(" not supported");
                    throw W4.a(null, sb4.toString());
                }
                return;
            case 17143:
                if (j9 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j9).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j9);
                sb5.append(" not supported");
                throw W4.a(null, sb5.toString());
            case 18401:
                if (j9 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j9).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j9);
                sb6.append(" not supported");
                throw W4.a(null, sb6.toString());
            case 18408:
                if (j9 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j9).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j9);
                sb7.append(" not supported");
                throw W4.a(null, sb7.toString());
            case 21420:
                this.f33572C = j9 + this.f33623s;
                return;
            case 21432:
                int i9 = (int) j9;
                l(i);
                if (i9 == 0) {
                    this.f33630z.f33316z = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f33630z.f33316z = 2;
                    return;
                } else if (i9 == 3) {
                    this.f33630z.f33316z = 1;
                    return;
                } else {
                    if (i9 != 15) {
                        return;
                    }
                    this.f33630z.f33316z = 3;
                    return;
                }
            case 21680:
                l(i);
                this.f33630z.f33308r = (int) j9;
                return;
            case 21682:
                l(i);
                this.f33630z.f33310t = (int) j9;
                return;
            case 21690:
                l(i);
                this.f33630z.f33309s = (int) j9;
                return;
            case 21930:
                z8 = j9 == 1;
                l(i);
                this.f33630z.Y = z8;
                return;
            case 21938:
                l(i);
                this.f33630z.f33307q = (int) j9;
                return;
            case 21998:
                l(i);
                this.f33630z.f33299h = (int) j9;
                return;
            case 22186:
                l(i);
                this.f33630z.f33283U = j9;
                return;
            case 22203:
                l(i);
                this.f33630z.f33284V = j9;
                return;
            case 25188:
                l(i);
                this.f33630z.f33280R = (int) j9;
                return;
            case 30114:
                this.f33595a0 = j9;
                return;
            case 30321:
                int i10 = (int) j9;
                l(i);
                if (i10 == 0) {
                    this.f33630z.f33311u = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f33630z.f33311u = 1;
                    return;
                } else if (i10 == 2) {
                    this.f33630z.f33311u = 2;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f33630z.f33311u = 3;
                    return;
                }
            case 2352003:
                l(i);
                this.f33630z.f33298g = (int) j9;
                return;
            case 2807729:
                this.f33624t = j9;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i11 = (int) j9;
                        l(i);
                        if (i11 == 1) {
                            this.f33630z.f33266C = 2;
                            return;
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            this.f33630z.f33266C = 1;
                            return;
                        }
                    case 21946:
                        l(i);
                        int c4 = C2980bK.c((int) j9);
                        if (c4 != -1) {
                            this.f33630z.f33265B = c4;
                            return;
                        }
                        return;
                    case 21947:
                        l(i);
                        int b9 = C2980bK.b((int) j9);
                        if (b9 != -1) {
                            this.f33630z.f33264A = b9;
                            return;
                        }
                        return;
                    case 21948:
                        l(i);
                        this.f33630z.f33267D = (int) j9;
                        return;
                    case 21949:
                        l(i);
                        this.f33630z.f33268E = (int) j9;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void k(int i) {
        if (this.f33629y != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in an EditionEntry");
        throw W4.a(null, sb.toString());
    }

    public final void l(int i) {
        if (this.f33630z != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw W4.a(null, sb.toString());
    }

    public final void m(int i) {
        if (this.f33574E) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw W4.a(null, sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(C3719p2 c3719p2, long j9, int i, int i4, int i9) {
        char c4;
        byte[] s3;
        int i10;
        int i11;
        C3502l1 c3502l1 = c3719p2.f33285W;
        if (c3502l1 != null) {
            c3502l1.b(c3719p2.f33291b0, j9, i, i4, i9, c3719p2.f33302l);
        } else {
            String str = c3719p2.f33292c;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.f33588T > 1) {
                    AbstractC3217fl.I("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j10 = this.f33586R;
                    if (j10 == com.anythink.basead.exoplayer.b.f6539b) {
                        AbstractC3217fl.I("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        Lr lr = this.f33617m;
                        byte[] bArr = lr.f26233a;
                        switch (str.hashCode()) {
                            case 738597099:
                                if (str.equals("S_TEXT/ASS")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 738614379:
                                if (str.equals("S_TEXT/SSA")) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            default:
                                c4 = 65535;
                                break;
                        }
                        if (c4 == 0) {
                            s3 = s("%02d:%02d:%02d,%03d", j10, 1000L);
                            i10 = 19;
                        } else if (c4 == 1 || c4 == 2) {
                            s3 = s("%01d:%02d:%02d:%02d", j10, 10000L);
                            i10 = 21;
                        } else {
                            if (c4 != 3) {
                                throw new IllegalArgumentException();
                            }
                            s3 = s("%02d:%02d:%02d.%03d", j10, 1000L);
                            i10 = 25;
                        }
                        System.arraycopy(s3, 0, bArr, i10, s3.length);
                        int i12 = lr.f26234b;
                        while (true) {
                            if (i12 < lr.f26235c) {
                                if (lr.f26233a[i12] == 0) {
                                    lr.C(i12);
                                } else {
                                    i12++;
                                }
                            }
                        }
                        c3719p2.f33291b0.a(lr.f26235c, lr);
                        i11 = i4 + lr.f26235c;
                        if ((i & 268435456) != 0) {
                            int i13 = this.f33588T;
                            Lr lr2 = this.f33620p;
                            if (i13 > 1) {
                                lr2.y(0);
                            } else {
                                int i14 = lr2.f26235c;
                                c3719p2.f33291b0.f(lr2, i14, 2);
                                i11 += i14;
                            }
                        }
                        c3719p2.f33291b0.b(j9, i, i11, i9, c3719p2.f33302l);
                    }
                }
            }
            i11 = i4;
            if ((i & 268435456) != 0) {
            }
            c3719p2.f33291b0.b(j9, i, i11, i9, c3719p2.f33302l);
        }
        this.f33583O = true;
    }

    public final void o(J0 j02, int i) {
        Lr lr = this.i;
        if (lr.f26235c >= i) {
            return;
        }
        byte[] bArr = lr.f26233a;
        if (bArr.length < i) {
            int length = bArr.length;
            lr.A(Math.max(length + length, i));
        }
        byte[] bArr2 = lr.f26233a;
        int i4 = lr.f26235c;
        j02.E(bArr2, i4, i - i4, false);
        lr.C(i);
    }

    public final int p(J0 j02, C3719p2 c3719p2, int i, boolean z8) {
        int d2;
        int d3;
        int i4;
        String str = c3719p2.f33292c;
        if ("S_TEXT/UTF8".equals(str)) {
            r(j02, m0, i);
            int i9 = this.f33599c0;
            q();
            return i9;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            r(j02, f33566o0, i);
            int i10 = this.f33599c0;
            q();
            return i10;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            r(j02, f33567p0, i);
            int i11 = this.f33599c0;
            q();
            return i11;
        }
        if (c3719p2.f33286X) {
            c3719p2.f33293c0.getClass();
            Lr lr = new Lr(i);
            if (j02.I(lr.f26233a, 0, i, true)) {
                j02.f25677y = 0;
                if (PA.e(lr.J()) == 1 && lr.B() >= 10) {
                    byte[] bArr = new byte[10];
                    lr.H(bArr, 0, 10);
                    lr.E(0);
                    int z9 = PA.z(bArr);
                    if (lr.B() >= z9 + 4) {
                        lr.G(z9);
                        if (PA.e(lr.b()) == 2) {
                            TP tp = c3719p2.f33293c0;
                            tp.getClass();
                            C4065vP c4065vP = new C4065vP(tp);
                            c4065vP.e(com.anythink.basead.exoplayer.k.o.f8581E);
                            c3719p2.f33293c0 = new TP(c4065vP);
                        }
                    }
                }
            }
            c3719p2.f33291b0.e(c3719p2.f33293c0);
            c3719p2.f33286X = false;
            h();
        }
        InterfaceC3448k1 interfaceC3448k1 = c3719p2.f33291b0;
        boolean z10 = this.f33603e0;
        Lr lr2 = this.f33615l;
        if (!z10) {
            boolean z11 = c3719p2.f33300j;
            Lr lr3 = this.i;
            if (z11) {
                this.f33592X &= -1073741825;
                if (!this.f33605f0) {
                    j02.E(lr3.f26233a, 0, 1, false);
                    this.f33597b0++;
                    byte b9 = lr3.f26233a[0];
                    if ((b9 & com.anythink.core.common.s.a.c.f16474a) == 128) {
                        throw W4.a(null, "Extension bit is set in signal byte");
                    }
                    this.f33610i0 = b9;
                    this.f33605f0 = true;
                }
                byte b10 = this.f33610i0;
                if ((b10 & 1) == 1) {
                    int i12 = b10 & 2;
                    this.f33592X |= 1073741824;
                    if (!this.f33612j0) {
                        Lr lr4 = this.f33618n;
                        j02.E(lr4.f26233a, 0, 8, false);
                        this.f33597b0 += 8;
                        this.f33612j0 = true;
                        lr3.f26233a[0] = (byte) ((i12 != 2 ? 0 : 128) | 8);
                        lr3.E(0);
                        interfaceC3448k1.f(lr3, 1, 1);
                        this.f33599c0++;
                        lr4.E(0);
                        interfaceC3448k1.f(lr4, 8, 1);
                        this.f33599c0 += 8;
                    }
                    if (i12 == 2) {
                        if (!this.f33607g0) {
                            j02.E(lr3.f26233a, 0, 1, false);
                            this.f33597b0++;
                            lr3.E(0);
                            this.f33609h0 = lr3.K();
                            this.f33607g0 = true;
                        }
                        int i13 = this.f33609h0 * 4;
                        lr3.y(i13);
                        j02.E(lr3.f26233a, 0, i13, false);
                        this.f33597b0 += i13;
                        int i14 = (this.f33609h0 >> 1) + 1;
                        int i15 = (i14 * 6) + 2;
                        ByteBuffer byteBuffer = this.f33621q;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.f33621q = ByteBuffer.allocate(i15);
                        }
                        this.f33621q.position(0);
                        this.f33621q.putShort((short) i14);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i4 = this.f33609h0;
                            if (i16 >= i4) {
                                break;
                            }
                            int h9 = lr3.h();
                            int i18 = h9 - i17;
                            if (i16 % 2 == 0) {
                                this.f33621q.putShort((short) i18);
                            } else {
                                this.f33621q.putInt(i18);
                            }
                            i16++;
                            i17 = h9;
                        }
                        int i19 = (i - this.f33597b0) - i17;
                        if ((i4 & 1) == 1) {
                            this.f33621q.putInt(i19);
                        } else {
                            this.f33621q.putShort((short) i19);
                            this.f33621q.putInt(0);
                        }
                        byte[] array = this.f33621q.array();
                        Lr lr5 = this.f33619o;
                        lr5.z(i15, array);
                        interfaceC3448k1.f(lr5, i15, 1);
                        this.f33599c0 += i15;
                    }
                }
            } else {
                byte[] bArr2 = c3719p2.f33301k;
                if (bArr2 != null) {
                    lr2.z(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(c3719p2.f33292c) ? c3719p2.f33299h > 0 : z8) {
                this.f33592X |= 268435456;
                this.f33620p.y(0);
                int i20 = (lr2.f26235c + i) - this.f33597b0;
                lr3.y(4);
                byte[] bArr3 = lr3.f26233a;
                bArr3[0] = (byte) ((i20 >> 24) & com.anythink.basead.exoplayer.k.p.f8630b);
                bArr3[1] = (byte) ((i20 >> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
                bArr3[2] = (byte) ((i20 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
                bArr3[3] = (byte) (i20 & com.anythink.basead.exoplayer.k.p.f8630b);
                interfaceC3448k1.f(lr3, 4, 2);
                this.f33599c0 += 4;
            }
            this.f33603e0 = true;
        }
        int i21 = i + lr2.f26235c;
        String str2 = c3719p2.f33292c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (c3719p2.f33285W != null) {
                PA.T(lr2.f26235c == 0);
                c3719p2.f33285W.a(j02);
            }
            while (true) {
                int i22 = this.f33597b0;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int B8 = lr2.B();
                if (B8 > 0) {
                    d3 = Math.min(i23, B8);
                    interfaceC3448k1.a(d3, lr2);
                } else {
                    d3 = interfaceC3448k1.d(j02, i23, false);
                }
                this.f33597b0 += d3;
                this.f33599c0 += d3;
            }
        } else {
            Lr lr6 = this.f33608h;
            byte[] bArr4 = lr6.f26233a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i24 = c3719p2.f33295d0;
            int i25 = 4 - i24;
            while (this.f33597b0 < i21) {
                int i26 = this.f33601d0;
                if (i26 == 0) {
                    int min = Math.min(i24, lr2.B());
                    j02.E(bArr4, i25 + min, i24 - min, false);
                    if (min > 0) {
                        lr2.H(bArr4, i25, min);
                    }
                    this.f33597b0 += i24;
                    lr6.E(0);
                    this.f33601d0 = lr6.h();
                    Lr lr7 = this.f33606g;
                    lr7.E(0);
                    interfaceC3448k1.a(4, lr7);
                    this.f33599c0 += 4;
                } else {
                    int B9 = lr2.B();
                    if (B9 > 0) {
                        d2 = Math.min(i26, B9);
                        interfaceC3448k1.a(d2, lr2);
                    } else {
                        d2 = interfaceC3448k1.d(j02, i26, false);
                    }
                    this.f33597b0 += d2;
                    this.f33599c0 += d2;
                    this.f33601d0 -= d2;
                }
            }
        }
        if ("A_VORBIS".equals(c3719p2.f33292c)) {
            Lr lr8 = this.f33611j;
            lr8.E(0);
            interfaceC3448k1.a(4, lr8);
            this.f33599c0 += 4;
        }
        int i27 = this.f33599c0;
        q();
        return i27;
    }

    public final void q() {
        this.f33597b0 = 0;
        this.f33599c0 = 0;
        this.f33601d0 = 0;
        this.f33603e0 = false;
        this.f33605f0 = false;
        this.f33607g0 = false;
        this.f33609h0 = 0;
        this.f33610i0 = (byte) 0;
        this.f33612j0 = false;
        this.f33615l.y(0);
    }

    public final void r(J0 j02, byte[] bArr, int i) {
        int length = bArr.length;
        int i4 = length + i;
        Lr lr = this.f33617m;
        byte[] bArr2 = lr.f26233a;
        if (bArr2.length < i4) {
            byte[] copyOf = Arrays.copyOf(bArr, i4 + i);
            lr.z(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        j02.E(lr.f26233a, length, i, false);
        lr.E(0);
        lr.C(i4);
    }

    public C3773q2(C3503l2 c3503l2, int i, InterfaceC3720p3 interfaceC3720p3) {
        this.f33623s = -1L;
        this.f33624t = com.anythink.basead.exoplayer.b.f6539b;
        this.f33625u = com.anythink.basead.exoplayer.b.f6539b;
        this.f33626v = com.anythink.basead.exoplayer.b.f6539b;
        this.f33575F = com.anythink.basead.exoplayer.b.f6539b;
        this.f33576G = -1;
        this.f33577H = -1L;
        this.f33578I = -1L;
        this.J = -1;
        this.f33580L = -1L;
        this.f33581M = -1L;
        this.f33582N = com.anythink.basead.exoplayer.b.f6539b;
        this.f33616l0 = c3503l2;
        c3503l2.f32521d = new C3562m7(this);
        this.f33604f = interfaceC3720p3;
        this.f33573D = new SparseArray();
        this.f33600d = true;
        this.f33602e = (i & 2) == 0;
        this.f33594a = new C3826r2(0);
        this.f33598c = new LongSparseArray();
        this.f33596b = new SparseArray();
        this.i = new Lr(4);
        this.f33611j = new Lr(ByteBuffer.allocate(4).putInt(-1).array());
        this.f33613k = new Lr(4);
        this.f33606g = new Lr(PA.f26862N);
        this.f33608h = new Lr(4);
        this.f33615l = new Lr();
        this.f33617m = new Lr();
        this.f33618n = new Lr(8);
        this.f33619o = new Lr();
        this.f33620p = new Lr();
        this.f33589U = new int[1];
        this.f33628x = true;
    }
}
