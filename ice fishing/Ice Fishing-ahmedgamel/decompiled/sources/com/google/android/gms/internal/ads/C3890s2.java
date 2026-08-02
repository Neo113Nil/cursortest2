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

/* renamed from: com.google.android.gms.internal.ads.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3890s2 implements Q0 {
    public static final byte[] m0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: n0, reason: collision with root package name */
    public static final byte[] f34578n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final byte[] f34579o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final byte[] f34580p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final UUID f34581q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final Map f34582r0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f34583A;

    /* renamed from: B, reason: collision with root package name */
    public int f34584B;

    /* renamed from: C, reason: collision with root package name */
    public long f34585C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f34586D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f34587E;

    /* renamed from: F, reason: collision with root package name */
    public long f34588F;

    /* renamed from: G, reason: collision with root package name */
    public int f34589G;

    /* renamed from: H, reason: collision with root package name */
    public long f34590H;

    /* renamed from: I, reason: collision with root package name */
    public long f34591I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f34592K;

    /* renamed from: L, reason: collision with root package name */
    public long f34593L;

    /* renamed from: M, reason: collision with root package name */
    public long f34594M;

    /* renamed from: N, reason: collision with root package name */
    public long f34595N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f34596O;

    /* renamed from: P, reason: collision with root package name */
    public int f34597P;

    /* renamed from: Q, reason: collision with root package name */
    public long f34598Q;

    /* renamed from: R, reason: collision with root package name */
    public long f34599R;

    /* renamed from: S, reason: collision with root package name */
    public int f34600S;

    /* renamed from: T, reason: collision with root package name */
    public int f34601T;

    /* renamed from: U, reason: collision with root package name */
    public int[] f34602U;

    /* renamed from: V, reason: collision with root package name */
    public int f34603V;

    /* renamed from: W, reason: collision with root package name */
    public int f34604W;

    /* renamed from: X, reason: collision with root package name */
    public int f34605X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f34606Z;

    /* renamed from: a, reason: collision with root package name */
    public final C3944t2 f34607a;

    /* renamed from: a0, reason: collision with root package name */
    public long f34608a0;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f34609b;

    /* renamed from: b0, reason: collision with root package name */
    public int f34610b0;

    /* renamed from: c, reason: collision with root package name */
    public final LongSparseArray f34611c;

    /* renamed from: c0, reason: collision with root package name */
    public int f34612c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34613d;

    /* renamed from: d0, reason: collision with root package name */
    public int f34614d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34615e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f34616e0;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3837r3 f34617f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f34618f0;

    /* renamed from: g, reason: collision with root package name */
    public final Cr f34619g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f34620g0;

    /* renamed from: h, reason: collision with root package name */
    public final Cr f34621h;

    /* renamed from: h0, reason: collision with root package name */
    public int f34622h0;
    public final Cr i;

    /* renamed from: i0, reason: collision with root package name */
    public byte f34623i0;

    /* renamed from: j, reason: collision with root package name */
    public final Cr f34624j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f34625j0;

    /* renamed from: k, reason: collision with root package name */
    public final Cr f34626k;

    /* renamed from: k0, reason: collision with root package name */
    public S0 f34627k0;

    /* renamed from: l, reason: collision with root package name */
    public final Cr f34628l;

    /* renamed from: l0, reason: collision with root package name */
    public final C3621n2 f34629l0;

    /* renamed from: m, reason: collision with root package name */
    public final Cr f34630m;

    /* renamed from: n, reason: collision with root package name */
    public final Cr f34631n;

    /* renamed from: o, reason: collision with root package name */
    public final Cr f34632o;

    /* renamed from: p, reason: collision with root package name */
    public final Cr f34633p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f34634q;

    /* renamed from: r, reason: collision with root package name */
    public long f34635r;

    /* renamed from: s, reason: collision with root package name */
    public long f34636s;

    /* renamed from: t, reason: collision with root package name */
    public long f34637t;

    /* renamed from: u, reason: collision with root package name */
    public long f34638u;

    /* renamed from: v, reason: collision with root package name */
    public long f34639v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34640w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f34641x;

    /* renamed from: y, reason: collision with root package name */
    public C3675o2 f34642y;

    /* renamed from: z, reason: collision with root package name */
    public C3836r2 f34643z;

    static {
        String str = AbstractC3182eu.f30782a;
        f34578n0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f34579o0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f34580p0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f34581q0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        com.IceFishing.LiveIceFishing.k.A(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        com.IceFishing.LiveIceFishing.k.A(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f34582r0 = Collections.unmodifiableMap(hashMap);
    }

    public C3890s2() {
        this(new C3621n2(), 2, InterfaceC3837r3.f34276h0);
    }

    public static byte[] s(String str, long j6, long j9) {
        AbstractC2792Sd.i(j6 != com.anythink.basead.exoplayer.b.f7168b);
        Locale locale = Locale.US;
        int i = (int) (j6 / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j10 = j6 - (i * 3600000000L);
        int i4 = (int) (j10 / 60000000);
        Integer valueOf2 = Integer.valueOf(i4);
        long j11 = j10 - (i4 * 60000000);
        int i6 = (int) (j11 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i6), Integer.valueOf((int) ((j11 - (i6 * 1000000)) / j9)));
        String str2 = AbstractC3182eu.f30782a;
        return format.getBytes(StandardCharsets.UTF_8);
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
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        boolean z6;
        long j6;
        int i;
        String str;
        int i4;
        long j9;
        int i6;
        int i9;
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        long j11;
        int i14;
        boolean z10;
        C3890s2 c3890s2;
        String str2;
        int i15;
        char c9;
        List list;
        SparseArray sparseArray;
        int i16;
        long j12;
        int i17;
        int i18;
        long j13;
        long j14;
        int i19;
        C3890s2 c3890s22 = this;
        int i20 = -1;
        int i21 = 0;
        c3890s22.f34596O = false;
        while (!c3890s22.f34596O) {
            C3621n2 c3621n2 = c3890s22.f34629l0;
            c3621n2.f33445d.getClass();
            while (true) {
                ArrayDeque arrayDeque = c3621n2.f33443b;
                C3567m2 c3567m2 = (C3567m2) arrayDeque.peek();
                int i22 = 8;
                int i23 = 374648427;
                RuntimeException runtimeException = null;
                if (c3567m2 == null || ((K0) r02).f26571w < c3567m2.f32659b) {
                    int i24 = c3621n2.f33446e;
                    C3944t2 c3944t2 = c3621n2.f33444c;
                    if (i24 == 0) {
                        K0 k02 = (K0) r02;
                        int i25 = 4;
                        int i26 = 0;
                        long d9 = c3944t2.d(k02, true, false, 4);
                        if (d9 == -2) {
                            k02.l();
                            while (true) {
                                byte[] bArr = c3621n2.f33442a;
                                k02.x(bArr, i26, i25);
                                byte b9 = bArr[i26];
                                int i27 = i22;
                                int i28 = 0;
                                while (true) {
                                    if (i28 < i27) {
                                        i14 = i28 + 1;
                                        j6 = 0;
                                        if ((C3944t2.f34974w[i28] & b9) == 0) {
                                            i28 = i14;
                                            i27 = 8;
                                        }
                                    } else {
                                        j6 = 0;
                                        i14 = -1;
                                    }
                                }
                                if (i14 != -1 && i14 <= 4) {
                                    int g9 = (int) C3944t2.g(i14, false, bArr);
                                    Object obj = c3621n2.f33445d.f33649u;
                                    if (g9 != 357149030 && g9 != 272869232 && g9 != 524531317 && g9 != 475249515) {
                                        if (g9 == 374648427) {
                                        }
                                    }
                                }
                                k02.v(1);
                                i25 = 4;
                                i26 = 0;
                                i22 = 8;
                            }
                            k02.v(i14);
                            j11 = i23;
                        } else {
                            j6 = 0;
                            j11 = d9;
                        }
                        z6 = true;
                        if (j11 == -1) {
                            z9 = false;
                        } else {
                            c3621n2.f33447f = (int) j11;
                            c3621n2.f33446e = 1;
                        }
                    } else {
                        z6 = true;
                        j6 = 0;
                    }
                    c3621n2.f33448g = c3944t2.d((K0) r02, false, z6, 8);
                    c3621n2.f33446e = 2;
                    C3680o7 c3680o7 = c3621n2.f33445d;
                    int i29 = c3621n2.f33447f;
                    C3890s2 c3890s23 = (C3890s2) c3680o7.f33649u;
                    switch (i29) {
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
                            long p9 = ((K0) r02).p();
                            arrayDeque.push(new C3567m2(i29, c3621n2.f33448g + p9));
                            ((C3890s2) c3621n2.f33445d.f33649u).i(c3621n2.f33447f, p9, c3621n2.f33448g);
                            i = 0;
                            c3621n2.f33446e = 0;
                            break;
                        case com.anythink.expressad.video.module.a.a.f22519V /* 131 */:
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
                            long j15 = c3621n2.f33448g;
                            if (j15 > 8) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j15).length() + 22);
                                sb.append("Invalid integer size: ");
                                sb.append(j15);
                                throw U4.a(null, sb.toString());
                            }
                            c3890s23.j(i29, c3621n2.a((K0) r02, (int) j15));
                            i = 0;
                            c3621n2.f33446e = 0;
                            break;
                        case 133:
                        case 134:
                        case 17026:
                        case 17276:
                        case 21358:
                        case 2274716:
                            long j16 = c3621n2.f33448g;
                            if (j16 > 2147483647L) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j16).length() + 21);
                                sb2.append("String element size: ");
                                sb2.append(j16);
                                throw U4.a(null, sb2.toString());
                            }
                            int i30 = (int) j16;
                            if (i30 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i30];
                                ((K0) r02).u(bArr2, 0, i30);
                                while (i30 > 0) {
                                    int i31 = i30 - 1;
                                    if (bArr2[i31] == 0) {
                                        i30 = i31;
                                    } else {
                                        str = new String(bArr2, 0, i30);
                                    }
                                }
                                str = new String(bArr2, 0, i30);
                            }
                            c3890s23.getClass();
                            if (i29 == 133) {
                                c3890s23.k(i29);
                                c3890s23.f34642y.f33632h = str;
                            } else if (i29 == 134) {
                                c3890s23.l(i29);
                                c3890s23.f34643z.f34251c = str;
                            } else if (i29 == 17026) {
                                if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    StringBuilder sb3 = new StringBuilder(str.length() + 22);
                                    sb3.append("DocType ");
                                    sb3.append(str);
                                    sb3.append(" not supported");
                                    throw U4.a(null, sb3.toString());
                                }
                                c3890s23.f34640w = str.equals("webm");
                            } else if (i29 == 17276) {
                                c3890s23.k(i29);
                                c3890s23.f34642y.i = str;
                            } else if (i29 == 21358) {
                                c3890s23.l(i29);
                                c3890s23.f34643z.f34249b = str;
                            } else if (i29 == 2274716) {
                                c3890s23.l(i29);
                                c3890s23.f34643z.f34248a0 = str;
                            }
                            i = 0;
                            c3621n2.f33446e = 0;
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
                            int i32 = (int) c3621n2.f33448g;
                            SparseArray sparseArray2 = c3890s23.f34609b;
                            if (i29 == 161 || i29 == 163) {
                                int i33 = c3890s23.f34597P;
                                Cr cr = c3890s23.i;
                                if (i33 == 0) {
                                    C3944t2 c3944t22 = c3890s23.f34607a;
                                    i4 = 0;
                                    j9 = 2147483647L;
                                    c3890s23.f34603V = (int) c3944t22.d((K0) r02, false, true, 8);
                                    c3890s23.f34604W = c3944t22.f34978u;
                                    c3890s23.f34599R = com.anythink.basead.exoplayer.b.f7168b;
                                    c3890s23.f34597P = 1;
                                    cr.y(0);
                                } else {
                                    i4 = 0;
                                    j9 = 2147483647L;
                                }
                                C3836r2 c3836r2 = (C3836r2) sparseArray2.get(c3890s23.f34603V);
                                if (c3836r2 == null) {
                                    ((K0) r02).v(i32 - c3890s23.f34604W);
                                    c3890s23.f34597P = i4;
                                    i9 = i4;
                                } else {
                                    c3836r2.f34250b0.getClass();
                                    if (c3890s23.f34597P == 1) {
                                        K0 k03 = (K0) r02;
                                        c3890s23.o(k03, 3);
                                        int i34 = (cr.f24997a[2] & 6) >> 1;
                                        byte b10 = 255;
                                        if (i34 == 0) {
                                            c3890s23.f34601T = 1;
                                            int[] iArr = c3890s23.f34602U;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else {
                                                int length = iArr.length;
                                                if (length < 1) {
                                                    iArr = new int[Math.max(length + length, 1)];
                                                }
                                            }
                                            c3890s23.f34602U = iArr;
                                            iArr[0] = (i32 - c3890s23.f34604W) - 3;
                                        } else {
                                            c3890s23.o(k03, 4);
                                            int i35 = (cr.f24997a[3] & com.anythink.basead.exoplayer.k.p.f9259b) + 1;
                                            c3890s23.f34601T = i35;
                                            int[] iArr2 = c3890s23.f34602U;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i35];
                                            } else {
                                                int length2 = iArr2.length;
                                                if (length2 < i35) {
                                                    iArr2 = new int[Math.max(length2 + length2, i35)];
                                                }
                                            }
                                            c3890s23.f34602U = iArr2;
                                            if (i34 == 2) {
                                                int i36 = (i32 - c3890s23.f34604W) - 4;
                                                int i37 = c3890s23.f34601T;
                                                Arrays.fill(iArr2, 0, i37, i36 / i37);
                                            } else {
                                                int i38 = 0;
                                                if (i34 != 1) {
                                                    if (i34 != 3) {
                                                        throw U4.a(null, "Unexpected lacing value: 2");
                                                    }
                                                    int i39 = 4;
                                                    int i40 = 0;
                                                    int i41 = 0;
                                                    while (true) {
                                                        int i42 = c3890s23.f34601T - 1;
                                                        if (i40 < i42) {
                                                            c3890s23.f34602U[i40] = 0;
                                                            int i43 = 1;
                                                            int i44 = i39 + 1;
                                                            c3890s23.o(k03, i44);
                                                            if (cr.f24997a[i39] == 0) {
                                                                throw U4.a(runtimeException, "No valid varint length mask found");
                                                            }
                                                            int i45 = 0;
                                                            while (true) {
                                                                if (i45 < 8) {
                                                                    int i46 = i43 << (7 - i45);
                                                                    if ((cr.f24997a[i39] & i46) != 0) {
                                                                        int i47 = i44 + i45;
                                                                        c3890s23.o(k03, i47);
                                                                        j10 = (~i46) & cr.f24997a[i39] & b10;
                                                                        while (i44 < i47) {
                                                                            j10 = (j10 << 8) | (cr.f24997a[i44] & 255);
                                                                            i44++;
                                                                        }
                                                                        if (i40 > 0) {
                                                                            j10 -= (1 << ((i45 * 7) + 6)) - 1;
                                                                        }
                                                                        i39 = i47;
                                                                    } else {
                                                                        i45++;
                                                                        b10 = 255;
                                                                        i43 = 1;
                                                                    }
                                                                } else {
                                                                    i39 = i44;
                                                                    j10 = j6;
                                                                }
                                                            }
                                                            if (j10 >= -2147483648L && j10 <= j9) {
                                                                int[] iArr3 = c3890s23.f34602U;
                                                                int i48 = (int) j10;
                                                                if (i40 != 0) {
                                                                    i48 += iArr3[i40 - 1];
                                                                }
                                                                iArr3[i40] = i48;
                                                                i41 += i48;
                                                                i40++;
                                                                b10 = 255;
                                                                runtimeException = null;
                                                            }
                                                        } else {
                                                            c3890s23.f34602U[i42] = ((i32 - c3890s23.f34604W) - i39) - i41;
                                                        }
                                                    }
                                                    throw U4.a(null, "EBML lacing sample size out of range.");
                                                }
                                                int i49 = 4;
                                                int i50 = 0;
                                                int i51 = 0;
                                                while (true) {
                                                    int i52 = c3890s23.f34601T - 1;
                                                    if (i50 < i52) {
                                                        c3890s23.f34602U[i50] = i38;
                                                        while (true) {
                                                            i10 = i49 + 1;
                                                            c3890s23.o(k03, i10);
                                                            int i53 = cr.f24997a[i49] & 255;
                                                            int[] iArr4 = c3890s23.f34602U;
                                                            i11 = iArr4[i50] + i53;
                                                            iArr4[i50] = i11;
                                                            if (i53 != 255) {
                                                                break;
                                                            }
                                                            i49 = i10;
                                                        }
                                                        i51 += i11;
                                                        i50++;
                                                        i49 = i10;
                                                        i38 = 0;
                                                    } else {
                                                        c3890s23.f34602U[i52] = ((i32 - c3890s23.f34604W) - i49) - i51;
                                                    }
                                                }
                                            }
                                        }
                                        byte[] bArr3 = cr.f24997a;
                                        c3890s23.f34598Q = c3890s23.g((bArr3[1] & 255) | (bArr3[0] << 8)) + c3890s23.f34595N;
                                        if (c3836r2.f34256f == 1) {
                                            i12 = 2;
                                            i13 = 1;
                                        } else if (i29 == 163) {
                                            i12 = 2;
                                            i13 = (cr.f24997a[2] & com.anythink.core.common.s.a.c.f17103a) == 128 ? 1 : 0;
                                            i29 = 163;
                                        } else {
                                            i12 = 2;
                                            i13 = 0;
                                        }
                                        c3890s23.f34605X = i13;
                                        c3890s23.f34597P = i12;
                                        c3890s23.f34600S = 0;
                                        i6 = 163;
                                    } else {
                                        i6 = 163;
                                    }
                                    if (i29 == i6) {
                                        while (true) {
                                            int i54 = c3890s23.f34600S;
                                            if (i54 < c3890s23.f34601T) {
                                                c3890s23.n(c3836r2, c3890s23.f34598Q + ((c3890s23.f34600S * c3836r2.f34257g) / 1000), c3890s23.f34605X, c3890s23.p((K0) r02, c3836r2, c3890s23.f34602U[i54], false), 0);
                                                c3890s23.f34600S++;
                                            } else {
                                                i9 = 0;
                                                c3890s23.f34597P = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            int i55 = c3890s23.f34600S;
                                            if (i55 < c3890s23.f34601T) {
                                                int[] iArr5 = c3890s23.f34602U;
                                                iArr5[i55] = c3890s23.p((K0) r02, c3836r2, iArr5[i55], true);
                                                c3890s23.f34600S++;
                                            } else {
                                                i9 = 0;
                                            }
                                        }
                                    }
                                }
                                c3621n2.f33446e = i9 == true ? 1 : 0;
                                i = i9;
                                break;
                            } else if (i29 != 165) {
                                if (i29 == 16877) {
                                    c3890s23.l(i29);
                                    C3836r2 c3836r22 = c3890s23.f34643z;
                                    int i56 = c3836r22.i;
                                    if (i56 == 1685485123 || i56 == 1685480259) {
                                        byte[] bArr4 = new byte[i32];
                                        c3836r22.f34237P = bArr4;
                                        i9 = 0;
                                        ((K0) r02).u(bArr4, 0, i32);
                                    } else {
                                        ((K0) r02).v(i32);
                                        i9 = 0;
                                    }
                                } else if (i29 == 16981) {
                                    i9 = 0;
                                    c3890s23.l(i29);
                                    byte[] bArr5 = new byte[i32];
                                    c3890s23.f34643z.f34260k = bArr5;
                                    ((K0) r02).u(bArr5, 0, i32);
                                } else if (i29 == 18402) {
                                    i9 = 0;
                                    byte[] bArr6 = new byte[i32];
                                    ((K0) r02).u(bArr6, 0, i32);
                                    c3890s23.l(i29);
                                    c3890s23.f34643z.f34261l = new C3512l1(1, bArr6, 0, 0);
                                } else if (i29 == 21419) {
                                    i9 = 0;
                                    Cr cr2 = c3890s23.f34626k;
                                    Arrays.fill(cr2.f24997a, (byte) 0);
                                    ((K0) r02).u(cr2.f24997a, 4 - i32, i32);
                                    cr2.E(0);
                                    c3890s23.f34584B = (int) cr2.P();
                                } else if (i29 == 25506) {
                                    c3890s23.l(i29);
                                    byte[] bArr7 = new byte[i32];
                                    c3890s23.f34643z.f34262m = bArr7;
                                    i9 = 0;
                                    ((K0) r02).u(bArr7, 0, i32);
                                } else {
                                    if (i29 != 30322) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(i29).length() + 15);
                                        sb4.append("Unexpected id: ");
                                        sb4.append(i29);
                                        throw U4.a(null, sb4.toString());
                                    }
                                    c3890s23.l(i29);
                                    byte[] bArr8 = new byte[i32];
                                    c3890s23.f34643z.f34274y = bArr8;
                                    i9 = 0;
                                    ((K0) r02).u(bArr8, 0, i32);
                                }
                                c3621n2.f33446e = i9 == true ? 1 : 0;
                                i = i9;
                            } else {
                                if (c3890s23.f34597P == 2) {
                                    C3836r2 c3836r23 = (C3836r2) sparseArray2.get(c3890s23.f34603V);
                                    if (c3890s23.Y == 4 && "V_VP9".equals(c3836r23.f34251c)) {
                                        Cr cr3 = c3890s23.f34633p;
                                        cr3.y(i32);
                                        i9 = 0;
                                        ((K0) r02).u(cr3.f24997a, 0, i32);
                                        c3621n2.f33446e = i9 == true ? 1 : 0;
                                        i = i9;
                                    } else {
                                        ((K0) r02).v(i32);
                                    }
                                }
                                i9 = 0;
                                c3621n2.f33446e = i9 == true ? 1 : 0;
                                i = i9;
                            }
                            if (z9) {
                                long p10 = ((K0) r02).p();
                                c3890s2 = this;
                                if (c3890s2.f34592K) {
                                    c3890s2.f34594M = p10;
                                    u02.f28641n = c3890s2.f34593L;
                                    c3890s2.f34592K = z10;
                                    return 1;
                                }
                                if (c3890s2.f34583A) {
                                    long j17 = c3890s2.f34594M;
                                    if (j17 != -1) {
                                        u02.f28641n = j17;
                                        c3890s2.f34594M = -1L;
                                        return 1;
                                    }
                                }
                            } else {
                                c3890s2 = this;
                            }
                            if (z9) {
                                c3890s22 = c3890s2;
                                i20 = -1;
                                i21 = 0;
                            } else {
                                int i57 = 0;
                                while (true) {
                                    SparseArray sparseArray3 = c3890s2.f34609b;
                                    if (i57 >= sparseArray3.size()) {
                                        return -1;
                                    }
                                    C3836r2 c3836r24 = (C3836r2) sparseArray3.valueAt(i57);
                                    c3836r24.f34250b0.getClass();
                                    C3620n1 c3620n1 = c3836r24.f34244W;
                                    if (c3620n1 != null) {
                                        c3620n1.c(c3836r24.f34250b0, c3836r24.f34261l);
                                    }
                                    i57++;
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
                            long j18 = c3621n2.f33448g;
                            if (j18 != 4 && j18 != 8) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(j18).length() + 20);
                                sb5.append("Invalid float size: ");
                                sb5.append(j18);
                                throw U4.a(null, sb5.toString());
                            }
                            int i58 = (int) j18;
                            double intBitsToFloat = i58 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(c3621n2.a((K0) r02, i58));
                            if (i29 == 181) {
                                c3890s23.l(i29);
                                c3890s23.f34643z.f34241T = (int) intBitsToFloat;
                            } else if (i29 != 17545) {
                                switch (i29) {
                                    case 21969:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.f34228F = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.f34229G = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.f34230H = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.f34231I = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.J = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.f34232K = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.f34233L = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.f34234M = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.f34235N = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        c3890s23.l(i29);
                                        c3890s23.f34643z.f34236O = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i29) {
                                            case 30323:
                                                c3890s23.l(i29);
                                                c3890s23.f34643z.f34271v = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                c3890s23.l(i29);
                                                c3890s23.f34643z.f34272w = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                c3890s23.l(i29);
                                                c3890s23.f34643z.f34273x = (float) intBitsToFloat;
                                                break;
                                            default:
                                                c3890s23.getClass();
                                                break;
                                        }
                                }
                            } else {
                                c3890s23.f34638u = (long) intBitsToFloat;
                            }
                            i = 0;
                            c3621n2.f33446e = 0;
                            break;
                        default:
                            ((K0) r02).v((int) c3621n2.f33448g);
                            c3621n2.f33446e = 0;
                            i20 = -1;
                    }
                } else {
                    C3680o7 c3680o72 = c3621n2.f33445d;
                    int i59 = ((C3567m2) arrayDeque.pop()).f32658a;
                    C3890s2 c3890s24 = (C3890s2) c3680o72.f33649u;
                    c3890s24.f34627k0.getClass();
                    if (i59 != 128) {
                        SparseArray sparseArray4 = c3890s24.f34609b;
                        if (i59 != 160) {
                            if (i59 != 174) {
                                LongSparseArray longSparseArray = c3890s24.f34611c;
                                if (i59 == 17849) {
                                    for (int i60 = 0; i60 < sparseArray4.size(); i60++) {
                                        C3836r2 c3836r25 = (C3836r2) sparseArray4.valueAt(i60);
                                        ArrayList arrayList = new ArrayList(longSparseArray.size());
                                        for (int i61 = 0; i61 < longSparseArray.size(); i61++) {
                                            C3675o2 c3675o2 = (C3675o2) longSparseArray.valueAt(i61);
                                            long j19 = c3675o2.f33629e;
                                            if (j19 == 0 || j19 == c3836r25.f34255e) {
                                                long j20 = c3675o2.f33626b;
                                                String str3 = AbstractC3182eu.f30782a;
                                                if (j20 != com.anythink.basead.exoplayer.b.f7168b && j20 != Long.MIN_VALUE) {
                                                    j20 /= 1000000;
                                                }
                                                long j21 = j20;
                                                long j22 = c3675o2.f33627c;
                                                if (j22 != com.anythink.basead.exoplayer.b.f7168b && j22 != Long.MIN_VALUE) {
                                                    j22 /= 1000000;
                                                }
                                                arrayList.add(new O1(j21, j22, c3675o2.f33628d, c3675o2.f33630f != null ? new C3323hQ(c3675o2.f33631g, c3675o2.f33630f) : null));
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            DP dp = c3836r25.f34252c0;
                                            dp.getClass();
                                            C3322hP a9 = dp.a();
                                            O3 o32 = dp.f25173l;
                                            a9.f31555k = o32 != null ? o32.c((InterfaceC3945t3[]) arrayList.toArray(new N1[0])) : new O3(arrayList);
                                            c3836r25.f34252c0 = new DP(a9);
                                        }
                                    }
                                } else {
                                    if (i59 == 19899) {
                                        int i62 = c3890s24.f34584B;
                                        if (i62 != -1) {
                                            long j23 = c3890s24.f34585C;
                                            if (j23 != -1) {
                                                if (i62 == 475249515) {
                                                    c3890s24.f34593L = j23;
                                                }
                                            }
                                        }
                                        throw U4.a(null, "Mandatory element SeekID or SeekPosition not found");
                                    }
                                    if (i59 == 25152) {
                                        c3890s24.l(i59);
                                        C3836r2 c3836r26 = c3890s24.f34643z;
                                        if (c3836r26.f34259j) {
                                            C3512l1 c3512l1 = c3836r26.f34261l;
                                            if (c3512l1 == null) {
                                                throw U4.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                            }
                                            c3836r26.f34263n = new EO(null, true, new AO(Yw.f29540a, com.anythink.basead.exoplayer.k.o.f9235f, c3512l1.f32461b));
                                        }
                                    } else if (i59 == 28032) {
                                        c3890s24.l(i59);
                                        C3836r2 c3836r27 = c3890s24.f34643z;
                                        if (c3836r27.f34259j && c3836r27.f34260k != null) {
                                            throw U4.a(null, "Combining encryption and compression is not supported");
                                        }
                                    } else if (i59 == 357149030) {
                                        if (c3890s24.f34637t == com.anythink.basead.exoplayer.b.f7168b) {
                                            c3890s24.f34637t = 1000000L;
                                        }
                                        long j24 = c3890s24.f34638u;
                                        if (j24 != com.anythink.basead.exoplayer.b.f7168b) {
                                            c3890s24.f34639v = c3890s24.g(j24);
                                        }
                                    } else if (i59 != 374648427) {
                                        SparseArray sparseArray5 = c3890s24.f34586D;
                                        if (i59 != 475249515) {
                                            if (i59 == 182) {
                                                C3675o2 c3675o22 = c3890s24.f34642y;
                                                c3675o22.getClass();
                                                long j25 = c3675o22.f33625a;
                                                if (j25 != 0) {
                                                    longSparseArray.put(j25, c3675o22);
                                                }
                                                c3890s24.f34642y = null;
                                            } else if (i59 == 183 && !c3890s24.f34583A) {
                                                c3890s24.m(i59);
                                                if (c3890s24.f34588F != com.anythink.basead.exoplayer.b.f7168b && (i19 = c3890s24.f34589G) != i20 && c3890s24.f34590H != -1) {
                                                    List list2 = (List) sparseArray5.get(i19);
                                                    if (list2 == null) {
                                                        list2 = new ArrayList();
                                                        sparseArray5.put(c3890s24.f34589G, list2);
                                                    }
                                                    list2.add(new C3729p2(c3890s24.f34588F, c3890s24.f34636s + c3890s24.f34590H, c3890s24.f34591I));
                                                }
                                            }
                                        } else if (!c3890s24.f34583A) {
                                            int i63 = 0;
                                            while (true) {
                                                if (i63 < sparseArray5.size()) {
                                                    if (((List) sparseArray5.valueAt(i63)).isEmpty()) {
                                                        i63++;
                                                    } else if (c3890s24.f34639v != com.anythink.basead.exoplayer.b.f7168b) {
                                                        for (int i64 = 0; i64 < sparseArray5.size(); i64++) {
                                                            Collections.sort((List) sparseArray5.valueAt(i64));
                                                        }
                                                        c3890s24.f34627k0.D(new C3783q2(sparseArray5, c3890s24.f34639v, c3890s24.J, c3890s24.f34636s, c3890s24.f34635r));
                                                    }
                                                }
                                            }
                                            c3890s24.f34627k0.D(new V0(c3890s24.f34639v, 0L));
                                            c3890s24.f34583A = true;
                                            c3890s24.f34587E = false;
                                            int i65 = 0;
                                            while (i65 < sparseArray4.size()) {
                                                C3836r2 c3836r28 = (C3836r2) sparseArray4.valueAt(i65);
                                                long j26 = c3890s24.f34639v;
                                                long j27 = c3890s24.f34636s;
                                                long j28 = c3890s24.f34635r;
                                                if (c3836r28.f34256f != 2 || (list = (List) sparseArray5.get(c3836r28.f34253d)) == null || list.isEmpty()) {
                                                    sparseArray = sparseArray5;
                                                    i16 = i65;
                                                } else {
                                                    if (list.isEmpty()) {
                                                        sparseArray = sparseArray5;
                                                        i16 = i65;
                                                    } else {
                                                        int i66 = i20;
                                                        int min = Math.min(list.size(), 20);
                                                        double d10 = 0.0d;
                                                        sparseArray = sparseArray5;
                                                        int i67 = i66;
                                                        int i68 = 0;
                                                        while (true) {
                                                            if (i68 < min) {
                                                                i16 = i65;
                                                                C3729p2 c3729p2 = (C3729p2) list.get(i68);
                                                                long j29 = j26;
                                                                if (c3729p2.f33806n <= 10000000) {
                                                                    int i69 = i68 + 1;
                                                                    int size = list.size() - 1;
                                                                    long j30 = j27;
                                                                    long j31 = c3729p2.f33806n;
                                                                    long j32 = c3729p2.f33808v;
                                                                    long j33 = c3729p2.f33807u;
                                                                    if (i68 < size) {
                                                                        C3729p2 c3729p22 = (C3729p2) list.get(i69);
                                                                        i18 = i69;
                                                                        i17 = i68;
                                                                        j14 = c3729p22.f33806n - j31;
                                                                        j13 = (c3729p22.f33807u + c3729p22.f33808v) - (j33 + j32);
                                                                    } else {
                                                                        i17 = i68;
                                                                        i18 = i69;
                                                                        j13 = (j30 + j28) - (j33 + j32);
                                                                        j14 = j29 - j31;
                                                                    }
                                                                    if (j14 > 0) {
                                                                        double d11 = j13 / j14;
                                                                        if (d11 > d10) {
                                                                            d10 = d11;
                                                                            i67 = i17;
                                                                        }
                                                                    }
                                                                    i68 = i18;
                                                                    i65 = i16;
                                                                    j26 = j29;
                                                                    j27 = j30;
                                                                }
                                                            } else {
                                                                i16 = i65;
                                                            }
                                                        }
                                                        if (i67 != i66) {
                                                            j12 = ((C3729p2) list.get(i67)).f33806n;
                                                            if (j12 != com.anythink.basead.exoplayer.b.f7168b) {
                                                                DP dp2 = c3836r28.f34252c0;
                                                                dp2.getClass();
                                                                Q1 q12 = new Q1(j12);
                                                                O3 o33 = dp2.f25173l;
                                                                O3 o34 = o33 == null ? new O3(q12) : o33.c(q12);
                                                                DP dp3 = c3836r28.f34252c0;
                                                                dp3.getClass();
                                                                C3322hP c3322hP = new C3322hP(dp3);
                                                                c3322hP.f31555k = o34;
                                                                c3836r28.f34252c0 = new DP(c3322hP);
                                                            }
                                                        }
                                                    }
                                                    j12 = -9223372036854775807L;
                                                    if (j12 != com.anythink.basead.exoplayer.b.f7168b) {
                                                    }
                                                }
                                                if (!c3836r28.f34245X) {
                                                    c3836r28.f34250b0.getClass();
                                                    InterfaceC3566m1 interfaceC3566m1 = c3836r28.f34250b0;
                                                    DP dp4 = c3836r28.f34252c0;
                                                    dp4.getClass();
                                                    interfaceC3566m1.e(dp4);
                                                }
                                                i65 = i16 + 1;
                                                sparseArray5 = sparseArray;
                                                i20 = -1;
                                            }
                                            c3890s24.h();
                                        }
                                    } else {
                                        if (sparseArray4.size() == 0) {
                                            throw U4.a(null, "No valid tracks were found");
                                        }
                                        boolean z11 = !c3890s24.f34613d || c3890s24.f34593L == -1;
                                        int i70 = -1;
                                        int i71 = -1;
                                        int i72 = -1;
                                        int i73 = -1;
                                        for (int i74 = 0; i74 < sparseArray4.size(); i74++) {
                                            C3836r2 c3836r29 = (C3836r2) sparseArray4.valueAt(i74);
                                            int i75 = c3836r29.f34256f;
                                            if (i75 == 2) {
                                                if (c3836r29.f34246Z) {
                                                    i70 = c3836r29.f34253d;
                                                }
                                                if (i71 == -1) {
                                                    i71 = c3836r29.f34253d;
                                                }
                                            } else if (i75 == 1) {
                                                if (c3836r29.f34246Z) {
                                                    i72 = c3836r29.f34253d;
                                                }
                                                if (i73 == -1) {
                                                    i73 = c3836r29.f34253d;
                                                }
                                            }
                                            if (z11) {
                                                c3836r29.f34250b0.getClass();
                                                if (!c3836r29.f34245X) {
                                                    InterfaceC3566m1 interfaceC3566m12 = c3836r29.f34250b0;
                                                    DP dp5 = c3836r29.f34252c0;
                                                    dp5.getClass();
                                                    interfaceC3566m12.e(dp5);
                                                }
                                            }
                                        }
                                        if (i70 != -1) {
                                            c3890s24.J = i70;
                                        } else if (i71 != -1) {
                                            c3890s24.J = i71;
                                        } else if (i72 != -1) {
                                            c3890s24.J = i72;
                                        } else if (i73 != -1) {
                                            c3890s24.J = i73;
                                        } else {
                                            c3890s24.J = sparseArray4.size() > 0 ? ((C3836r2) sparseArray4.valueAt(0)).f34253d : -1;
                                        }
                                        if (z11) {
                                            c3890s24.h();
                                        }
                                    }
                                }
                            } else {
                                C3836r2 c3836r210 = c3890s24.f34643z;
                                c3836r210.getClass();
                                String str4 = c3836r210.f34251c;
                                if (str4 == null) {
                                    throw U4.a(null, "CodecId is missing in TrackEntry element");
                                }
                                switch (str4.hashCode()) {
                                    case -2095576542:
                                        if (str4.equals("V_MPEG4/ISO/AP")) {
                                            c9 = 6;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -2095575984:
                                        if (str4.equals("V_MPEG4/ISO/SP")) {
                                            c9 = 4;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1985379776:
                                        if (str4.equals("A_MS/ACM")) {
                                            c9 = 23;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1784763192:
                                        if (str4.equals("A_TRUEHD")) {
                                            c9 = 18;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1730367663:
                                        if (str4.equals("A_VORBIS")) {
                                            c9 = '\f';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1482641358:
                                        if (str4.equals("A_MPEG/L2")) {
                                            c9 = 14;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1482641357:
                                        if (str4.equals("A_MPEG/L3")) {
                                            c9 = 15;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -1373388978:
                                        if (str4.equals("V_MS/VFW/FOURCC")) {
                                            c9 = '\t';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -933872740:
                                        if (str4.equals("S_DVBSUB")) {
                                            c9 = '!';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -538363189:
                                        if (str4.equals("V_MPEG4/ISO/ASP")) {
                                            c9 = 5;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -538363109:
                                        if (str4.equals("V_MPEG4/ISO/AVC")) {
                                            c9 = 7;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -425012669:
                                        if (str4.equals("S_VOBSUB")) {
                                            c9 = 31;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -356037306:
                                        if (str4.equals("A_DTS/LOSSLESS")) {
                                            c9 = 21;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 62923557:
                                        if (str4.equals("A_AAC")) {
                                            c9 = '\r';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 62923603:
                                        if (str4.equals("A_AC3")) {
                                            c9 = 16;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 62927045:
                                        if (str4.equals("A_DTS")) {
                                            c9 = 19;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 82318131:
                                        if (str4.equals("V_AV1")) {
                                            c9 = 2;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 82338133:
                                        if (str4.equals("V_VP8")) {
                                            c9 = 0;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 82338134:
                                        if (str4.equals("V_VP9")) {
                                            c9 = 1;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 99146302:
                                        if (str4.equals("S_HDMV/PGS")) {
                                            c9 = ' ';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 444813526:
                                        if (str4.equals("V_THEORA")) {
                                            c9 = '\n';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 542569478:
                                        if (str4.equals("A_DTS/EXPRESS")) {
                                            c9 = 20;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 635596514:
                                        if (str4.equals("A_PCM/FLOAT/IEEE")) {
                                            c9 = 26;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 725948237:
                                        if (str4.equals("A_PCM/INT/BIG")) {
                                            c9 = 25;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 725957860:
                                        if (str4.equals("A_PCM/INT/LIT")) {
                                            c9 = 24;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 738597099:
                                        if (str4.equals("S_TEXT/ASS")) {
                                            c9 = 28;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 738614379:
                                        if (str4.equals("S_TEXT/SSA")) {
                                            c9 = 29;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 855502857:
                                        if (str4.equals("V_MPEGH/ISO/HEVC")) {
                                            c9 = '\b';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1045209816:
                                        if (str4.equals("S_TEXT/WEBVTT")) {
                                            c9 = 30;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1422270023:
                                        if (str4.equals("S_TEXT/UTF8")) {
                                            c9 = 27;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1809237540:
                                        if (str4.equals("V_MPEG2")) {
                                            c9 = 3;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1950749482:
                                        if (str4.equals("A_EAC3")) {
                                            c9 = 17;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1950789798:
                                        if (str4.equals("A_FLAC")) {
                                            c9 = 22;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case 1951062397:
                                        if (str4.equals("A_OPUS")) {
                                            c9 = 11;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    default:
                                        c9 = 65535;
                                        break;
                                }
                                switch (c9) {
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
                                        c3836r210.a(c3836r210.f34253d);
                                        c3836r210.f34250b0 = c3890s24.f34627k0.C(c3836r210.f34253d, c3836r210.f34256f);
                                        sparseArray4.put(c3836r210.f34253d, c3836r210);
                                        break;
                                }
                                c3890s24.f34643z = null;
                            }
                        } else if (c3890s24.f34597P == 2) {
                            C3836r2 c3836r211 = (C3836r2) sparseArray4.get(c3890s24.f34603V);
                            c3836r211.f34250b0.getClass();
                            if (c3890s24.f34608a0 > 0 && "A_OPUS".equals(c3836r211.f34251c)) {
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c3890s24.f34608a0).array();
                                c3890s24.f34633p.z(array.length, array);
                            }
                            int i76 = 0;
                            for (int i77 = 0; i77 < c3890s24.f34601T; i77++) {
                                i76 += c3890s24.f34602U[i77];
                            }
                            int i78 = 0;
                            while (i78 < c3890s24.f34601T) {
                                long j34 = c3890s24.f34598Q + ((c3836r211.f34257g * i78) / 1000);
                                int i79 = c3890s24.f34605X;
                                if (i78 == 0) {
                                    if (!c3890s24.f34606Z) {
                                        i79 |= 1;
                                    }
                                    i15 = i79;
                                    i78 = 0;
                                } else {
                                    i15 = i79;
                                }
                                int i80 = c3890s24.f34602U[i78];
                                int i81 = i76 - i80;
                                c3890s24.n(c3836r211, j34, i15, i80, i81);
                                i78++;
                                i76 = i81;
                            }
                            c3890s24.f34597P = 0;
                        }
                    } else {
                        C3675o2 c3675o23 = c3890s24.f34642y;
                        c3675o23.getClass();
                        if (c3675o23.f33630f == null && (str2 = c3675o23.f33632h) != null) {
                            c3675o23.f33630f = str2;
                            String str5 = c3675o23.i;
                            if (str5 != null) {
                                c3675o23.f33631g = str5;
                            }
                        }
                    }
                    z9 = true;
                }
            }
        }
        return i21;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        if (this.f34615e) {
            s02 = new com.bumptech.glide.manager.n(s02, this.f34617f);
        }
        this.f34627k0 = s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f34595N = com.anythink.basead.exoplayer.b.f7168b;
        this.f34597P = 0;
        C3621n2 c3621n2 = this.f34629l0;
        c3621n2.f33446e = 0;
        c3621n2.f33443b.clear();
        C3944t2 c3944t2 = c3621n2.f33444c;
        c3944t2.f34977n = 0;
        c3944t2.f34978u = 0;
        C3944t2 c3944t22 = this.f34607a;
        c3944t22.f34977n = 0;
        c3944t22.f34978u = 0;
        q();
        this.f34587E = false;
        this.f34588F = com.anythink.basead.exoplayer.b.f7168b;
        this.f34589G = -1;
        this.f34590H = -1L;
        this.f34591I = -1L;
        if (!this.f34583A) {
            this.f34586D.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f34609b;
            if (i >= sparseArray.size()) {
                return;
            }
            C3620n1 c3620n1 = ((C3836r2) sparseArray.valueAt(i)).f34244W;
            if (c3620n1 != null) {
                c3620n1.f33436b = false;
                c3620n1.f33437c = 0;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        I1.a aVar = new I1.a((byte) 0, 3);
        K0 k02 = (K0) r02;
        long j6 = k02.f26570v;
        long j9 = 1024;
        if (j6 != -1 && j6 <= 1024) {
            j9 = j6;
        }
        Cr cr = (Cr) aVar.f1304v;
        k02.E(cr.f24997a, 0, 4, false);
        long P8 = cr.P();
        aVar.f1303u = 4;
        while (true) {
            if (P8 != 440786851) {
                int i = (int) j9;
                int i4 = aVar.f1303u + 1;
                aVar.f1303u = i4;
                if (i4 == i) {
                    break;
                }
                k02.E(cr.f24997a, 0, 1, false);
                P8 = ((P8 << 8) & (-256)) | (cr.f24997a[0] & 255);
            } else {
                long u6 = aVar.u(k02);
                long j10 = aVar.f1303u;
                if (u6 != Long.MIN_VALUE) {
                    long j11 = j10 + u6;
                    if (j6 == -1 || j11 < j6) {
                        while (true) {
                            long j12 = aVar.f1303u;
                            if (j12 < j11) {
                                if (aVar.u(k02) != Long.MIN_VALUE) {
                                    long u9 = aVar.u(k02);
                                    if (u9 < 0) {
                                        break;
                                    }
                                    if (u9 != 0) {
                                        int i6 = (int) u9;
                                        k02.d(i6, false);
                                        aVar.f1303u += i6;
                                    }
                                } else {
                                    break;
                                }
                            } else if (j12 == j11) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    public final long g(long j6) {
        long j9 = this.f34637t;
        if (j9 != com.anythink.basead.exoplayer.b.f7168b) {
            return AbstractC3182eu.w(j6, j9, 1000L, RoundingMode.DOWN);
        }
        throw U4.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final void h() {
        if (!this.f34641x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f34609b;
            if (i >= sparseArray.size()) {
                S0 s02 = this.f34627k0;
                s02.getClass();
                s02.B();
                this.f34641x = false;
                return;
            }
            if (((C3836r2) sparseArray.valueAt(i)).f34245X) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void i(int i, long j6, long j9) {
        S0 s02 = this.f34627k0;
        s02.getClass();
        if (i == 128) {
            k(i);
            this.f34642y.f33632h = null;
            k(i);
            this.f34642y.i = null;
            return;
        }
        if (i == 160) {
            this.f34606Z = false;
            this.f34608a0 = 0L;
            return;
        }
        if (i == 174) {
            C3836r2 c3836r2 = new C3836r2();
            c3836r2.f34264o = -1;
            c3836r2.f34265p = -1;
            c3836r2.f34266q = -1;
            c3836r2.f34267r = -1;
            c3836r2.f34268s = -1;
            c3836r2.f34269t = 0;
            c3836r2.f34270u = -1;
            c3836r2.f34271v = 0.0f;
            c3836r2.f34272w = 0.0f;
            c3836r2.f34273x = 0.0f;
            c3836r2.f34274y = null;
            c3836r2.f34275z = -1;
            c3836r2.f34223A = -1;
            c3836r2.f34224B = -1;
            c3836r2.f34225C = -1;
            c3836r2.f34226D = 1000;
            c3836r2.f34227E = 200;
            c3836r2.f34228F = -1.0f;
            c3836r2.f34229G = -1.0f;
            c3836r2.f34230H = -1.0f;
            c3836r2.f34231I = -1.0f;
            c3836r2.J = -1.0f;
            c3836r2.f34232K = -1.0f;
            c3836r2.f34233L = -1.0f;
            c3836r2.f34234M = -1.0f;
            c3836r2.f34235N = -1.0f;
            c3836r2.f34236O = -1.0f;
            c3836r2.f34238Q = 1;
            c3836r2.f34239R = -1;
            c3836r2.f34240S = -1;
            c3836r2.f34241T = 8000;
            c3836r2.f34242U = 0L;
            c3836r2.f34243V = 0L;
            c3836r2.f34245X = false;
            c3836r2.f34246Z = true;
            c3836r2.f34248a0 = "eng";
            this.f34643z = c3836r2;
            c3836r2.f34247a = this.f34640w;
            return;
        }
        if (i == 187) {
            if (this.f34583A) {
                return;
            }
            m(i);
            this.f34588F = com.anythink.basead.exoplayer.b.f7168b;
            return;
        }
        if (i == 19899) {
            this.f34584B = -1;
            this.f34585C = -1L;
            return;
        }
        if (i == 20533) {
            l(i);
            this.f34643z.f34259j = true;
            return;
        }
        if (i == 408125543) {
            long j10 = this.f34636s;
            if (j10 != -1 && j10 != j6) {
                throw U4.a(null, "Multiple Segment elements not supported");
            }
            this.f34636s = j6;
            this.f34635r = j9;
            return;
        }
        if (i == 475249515) {
            if (this.f34583A) {
                return;
            }
            this.f34587E = true;
            return;
        }
        if (i == 524531317) {
            if (this.f34583A) {
                return;
            }
            if (this.f34613d && this.f34593L != -1) {
                this.f34592K = true;
                return;
            } else {
                s02.D(new V0(this.f34639v, 0L));
                this.f34583A = true;
                return;
            }
        }
        if (i == 182) {
            C3675o2 c3675o2 = new C3675o2();
            c3675o2.f33626b = com.anythink.basead.exoplayer.b.f7168b;
            c3675o2.f33627c = com.anythink.basead.exoplayer.b.f7168b;
            this.f34642y = c3675o2;
            return;
        }
        if (i == 183 && !this.f34583A) {
            m(i);
            this.f34589G = -1;
            this.f34590H = -1L;
            this.f34591I = -1L;
        }
    }

    public final void j(int i, long j6) {
        boolean z6;
        if (i == 136) {
            z6 = j6 == 1;
            l(i);
            this.f34643z.f34246Z = z6;
            return;
        }
        if (i == 137) {
            k(i);
            this.f34642y.f33629e = j6;
            return;
        }
        if (i == 145) {
            k(i);
            this.f34642y.f33626b = j6;
            return;
        }
        if (i == 146) {
            k(i);
            this.f34642y.f33627c = j6;
            return;
        }
        if (i == 240) {
            if (this.f34583A) {
                return;
            }
            m(i);
            if (this.f34591I == -1) {
                this.f34591I = j6;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.f34583A) {
                return;
            }
            m(i);
            if (this.f34590H == -1) {
                this.f34590H = j6;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j6 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j6);
            sb.append(" not supported");
            throw U4.a(null, sb.toString());
        }
        if (i == 20530) {
            if (j6 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j6);
            sb2.append(" not supported");
            throw U4.a(null, sb2.toString());
        }
        if (i == 29636) {
            k(i);
            this.f34642y.f33625a = j6;
            return;
        }
        if (i == 29637) {
            l(i);
            this.f34643z.f34255e = j6;
            return;
        }
        switch (i) {
            case com.anythink.expressad.video.module.a.a.f22519V /* 131 */:
                int i4 = (int) j6;
                if (i4 == 1) {
                    l(i);
                    this.f34643z.f34256f = 2;
                    return;
                }
                if (i4 == 2) {
                    l(i);
                    this.f34643z.f34256f = 1;
                    return;
                } else if (i4 == 17) {
                    l(i);
                    this.f34643z.f34256f = 3;
                    return;
                } else if (i4 != 33) {
                    l(i);
                    this.f34643z.f34256f = -1;
                    return;
                } else {
                    l(i);
                    this.f34643z.f34256f = 5;
                    return;
                }
            case 152:
                z6 = j6 == 1;
                k(i);
                this.f34642y.f33628d = z6;
                return;
            case 155:
                this.f34599R = g(j6);
                return;
            case 159:
                l(i);
                this.f34643z.f34238Q = (int) j6;
                return;
            case 176:
                l(i);
                this.f34643z.f34264o = (int) j6;
                return;
            case 179:
                if (this.f34583A) {
                    return;
                }
                m(i);
                this.f34588F = g(j6);
                return;
            case 186:
                l(i);
                this.f34643z.f34265p = (int) j6;
                return;
            case 215:
                l(i);
                this.f34643z.f34253d = (int) j6;
                return;
            case 231:
                this.f34595N = g(j6);
                return;
            case 238:
                this.Y = (int) j6;
                return;
            case 247:
                if (this.f34583A) {
                    return;
                }
                m(i);
                this.f34589G = (int) j6;
                return;
            case 251:
                this.f34606Z = true;
                return;
            case 16871:
                l(i);
                this.f34643z.i = (int) j6;
                return;
            case 16980:
                if (j6 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j6).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j6);
                sb3.append(" not supported");
                throw U4.a(null, sb3.toString());
            case 17029:
                if (j6 < 1 || j6 > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j6).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j6);
                    sb4.append(" not supported");
                    throw U4.a(null, sb4.toString());
                }
                return;
            case 17143:
                if (j6 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j6).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j6);
                sb5.append(" not supported");
                throw U4.a(null, sb5.toString());
            case 18401:
                if (j6 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j6).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j6);
                sb6.append(" not supported");
                throw U4.a(null, sb6.toString());
            case 18408:
                if (j6 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j6).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j6);
                sb7.append(" not supported");
                throw U4.a(null, sb7.toString());
            case 21420:
                this.f34585C = j6 + this.f34636s;
                return;
            case 21432:
                int i6 = (int) j6;
                l(i);
                if (i6 == 0) {
                    this.f34643z.f34275z = 0;
                    return;
                }
                if (i6 == 1) {
                    this.f34643z.f34275z = 2;
                    return;
                } else if (i6 == 3) {
                    this.f34643z.f34275z = 1;
                    return;
                } else {
                    if (i6 != 15) {
                        return;
                    }
                    this.f34643z.f34275z = 3;
                    return;
                }
            case 21680:
                l(i);
                this.f34643z.f34267r = (int) j6;
                return;
            case 21682:
                l(i);
                this.f34643z.f34269t = (int) j6;
                return;
            case 21690:
                l(i);
                this.f34643z.f34268s = (int) j6;
                return;
            case 21930:
                z6 = j6 == 1;
                l(i);
                this.f34643z.Y = z6;
                return;
            case 21938:
                l(i);
                this.f34643z.f34266q = (int) j6;
                return;
            case 21998:
                l(i);
                this.f34643z.f34258h = (int) j6;
                return;
            case 22186:
                l(i);
                this.f34643z.f34242U = j6;
                return;
            case 22203:
                l(i);
                this.f34643z.f34243V = j6;
                return;
            case 25188:
                l(i);
                this.f34643z.f34239R = (int) j6;
                return;
            case 30114:
                this.f34608a0 = j6;
                return;
            case 30321:
                int i9 = (int) j6;
                l(i);
                if (i9 == 0) {
                    this.f34643z.f34270u = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f34643z.f34270u = 1;
                    return;
                } else if (i9 == 2) {
                    this.f34643z.f34270u = 2;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.f34643z.f34270u = 3;
                    return;
                }
            case 2352003:
                l(i);
                this.f34643z.f34257g = (int) j6;
                return;
            case 2807729:
                this.f34637t = j6;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i10 = (int) j6;
                        l(i);
                        if (i10 == 1) {
                            this.f34643z.f34225C = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            this.f34643z.f34225C = 1;
                            return;
                        }
                    case 21946:
                        l(i);
                        int c9 = KJ.c((int) j6);
                        if (c9 != -1) {
                            this.f34643z.f34224B = c9;
                            return;
                        }
                        return;
                    case 21947:
                        l(i);
                        int b9 = KJ.b((int) j6);
                        if (b9 != -1) {
                            this.f34643z.f34223A = b9;
                            return;
                        }
                        return;
                    case 21948:
                        l(i);
                        this.f34643z.f34226D = (int) j6;
                        return;
                    case 21949:
                        l(i);
                        this.f34643z.f34227E = (int) j6;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void k(int i) {
        if (this.f34642y != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in an EditionEntry");
        throw U4.a(null, sb.toString());
    }

    public final void l(int i) {
        if (this.f34643z != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw U4.a(null, sb.toString());
    }

    public final void m(int i) {
        if (this.f34587E) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a Cues");
        throw U4.a(null, sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(C3836r2 c3836r2, long j6, int i, int i4, int i6) {
        char c9;
        byte[] s9;
        int i9;
        int i10;
        C3620n1 c3620n1 = c3836r2.f34244W;
        if (c3620n1 != null) {
            c3620n1.b(c3836r2.f34250b0, j6, i, i4, i6, c3836r2.f34261l);
        } else {
            String str = c3836r2.f34251c;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.f34601T > 1) {
                    AbstractC2991bG.y("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j9 = this.f34599R;
                    if (j9 == com.anythink.basead.exoplayer.b.f7168b) {
                        AbstractC2991bG.y("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        Cr cr = this.f34630m;
                        byte[] bArr = cr.f24997a;
                        switch (str.hashCode()) {
                            case 738597099:
                                if (str.equals("S_TEXT/ASS")) {
                                    c9 = 1;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case 738614379:
                                if (str.equals("S_TEXT/SSA")) {
                                    c9 = 2;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    c9 = 3;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    c9 = 0;
                                    break;
                                }
                                c9 = 65535;
                                break;
                            default:
                                c9 = 65535;
                                break;
                        }
                        if (c9 == 0) {
                            s9 = s("%02d:%02d:%02d,%03d", j9, 1000L);
                            i9 = 19;
                        } else if (c9 == 1 || c9 == 2) {
                            s9 = s("%01d:%02d:%02d:%02d", j9, 10000L);
                            i9 = 21;
                        } else {
                            if (c9 != 3) {
                                throw new IllegalArgumentException();
                            }
                            s9 = s("%02d:%02d:%02d.%03d", j9, 1000L);
                            i9 = 25;
                        }
                        System.arraycopy(s9, 0, bArr, i9, s9.length);
                        int i11 = cr.f24998b;
                        while (true) {
                            if (i11 < cr.f24999c) {
                                if (cr.f24997a[i11] == 0) {
                                    cr.C(i11);
                                } else {
                                    i11++;
                                }
                            }
                        }
                        c3836r2.f34250b0.a(cr.f24999c, cr);
                        i10 = i4 + cr.f24999c;
                        if ((i & 268435456) != 0) {
                            int i12 = this.f34601T;
                            Cr cr2 = this.f34633p;
                            if (i12 > 1) {
                                cr2.y(0);
                            } else {
                                int i13 = cr2.f24999c;
                                c3836r2.f34250b0.f(cr2, i13, 2);
                                i10 += i13;
                            }
                        }
                        c3836r2.f34250b0.c(j6, i, i10, i6, c3836r2.f34261l);
                    }
                }
            }
            i10 = i4;
            if ((i & 268435456) != 0) {
            }
            c3836r2.f34250b0.c(j6, i, i10, i6, c3836r2.f34261l);
        }
        this.f34596O = true;
    }

    public final void o(K0 k02, int i) {
        Cr cr = this.i;
        if (cr.f24999c >= i) {
            return;
        }
        byte[] bArr = cr.f24997a;
        if (bArr.length < i) {
            int length = bArr.length;
            cr.A(Math.max(length + length, i));
        }
        byte[] bArr2 = cr.f24997a;
        int i4 = cr.f24999c;
        k02.A(bArr2, i4, i - i4, false);
        cr.C(i);
    }

    public final int p(K0 k02, C3836r2 c3836r2, int i, boolean z6) {
        int d9;
        int d10;
        int i4;
        String str = c3836r2.f34251c;
        if ("S_TEXT/UTF8".equals(str)) {
            r(k02, m0, i);
            int i6 = this.f34612c0;
            q();
            return i6;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            r(k02, f34579o0, i);
            int i9 = this.f34612c0;
            q();
            return i9;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            r(k02, f34580p0, i);
            int i10 = this.f34612c0;
            q();
            return i10;
        }
        if (c3836r2.f34245X) {
            DP dp = c3836r2.f34252c0;
            dp.getClass();
            DP P8 = AbstractC2991bG.P(k02, i, dp);
            c3836r2.f34252c0 = P8;
            c3836r2.f34250b0.e(P8);
            c3836r2.f34245X = false;
            h();
        }
        InterfaceC3566m1 interfaceC3566m1 = c3836r2.f34250b0;
        boolean z9 = this.f34616e0;
        Cr cr = this.f34628l;
        if (!z9) {
            boolean z10 = c3836r2.f34259j;
            Cr cr2 = this.i;
            if (z10) {
                this.f34605X &= -1073741825;
                if (!this.f34618f0) {
                    k02.A(cr2.f24997a, 0, 1, false);
                    this.f34610b0++;
                    byte b9 = cr2.f24997a[0];
                    if ((b9 & com.anythink.core.common.s.a.c.f17103a) == 128) {
                        throw U4.a(null, "Extension bit is set in signal byte");
                    }
                    this.f34623i0 = b9;
                    this.f34618f0 = true;
                }
                byte b10 = this.f34623i0;
                if ((b10 & 1) == 1) {
                    int i11 = b10 & 2;
                    this.f34605X |= 1073741824;
                    if (!this.f34625j0) {
                        Cr cr3 = this.f34631n;
                        k02.A(cr3.f24997a, 0, 8, false);
                        this.f34610b0 += 8;
                        this.f34625j0 = true;
                        cr2.f24997a[0] = (byte) ((i11 != 2 ? 0 : 128) | 8);
                        cr2.E(0);
                        interfaceC3566m1.f(cr2, 1, 1);
                        this.f34612c0++;
                        cr3.E(0);
                        interfaceC3566m1.f(cr3, 8, 1);
                        this.f34612c0 += 8;
                    }
                    if (i11 == 2) {
                        if (!this.f34620g0) {
                            k02.A(cr2.f24997a, 0, 1, false);
                            this.f34610b0++;
                            cr2.E(0);
                            this.f34622h0 = cr2.K();
                            this.f34620g0 = true;
                        }
                        int i12 = this.f34622h0 * 4;
                        cr2.y(i12);
                        k02.A(cr2.f24997a, 0, i12, false);
                        this.f34610b0 += i12;
                        int i13 = (this.f34622h0 >> 1) + 1;
                        int i14 = (i13 * 6) + 2;
                        ByteBuffer byteBuffer = this.f34634q;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f34634q = ByteBuffer.allocate(i14);
                        }
                        this.f34634q.position(0);
                        this.f34634q.putShort((short) i13);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i4 = this.f34622h0;
                            if (i15 >= i4) {
                                break;
                            }
                            int h3 = cr2.h();
                            int i17 = h3 - i16;
                            if (i15 % 2 == 0) {
                                this.f34634q.putShort((short) i17);
                            } else {
                                this.f34634q.putInt(i17);
                            }
                            i15++;
                            i16 = h3;
                        }
                        int i18 = (i - this.f34610b0) - i16;
                        if ((i4 & 1) == 1) {
                            this.f34634q.putInt(i18);
                        } else {
                            this.f34634q.putShort((short) i18);
                            this.f34634q.putInt(0);
                        }
                        byte[] array = this.f34634q.array();
                        Cr cr4 = this.f34632o;
                        cr4.z(i14, array);
                        interfaceC3566m1.f(cr4, i14, 1);
                        this.f34612c0 += i14;
                    }
                }
            } else {
                byte[] bArr = c3836r2.f34260k;
                if (bArr != null) {
                    cr.z(bArr.length, bArr);
                }
            }
            if (!"A_OPUS".equals(c3836r2.f34251c) ? c3836r2.f34258h > 0 : z6) {
                this.f34605X |= 268435456;
                this.f34633p.y(0);
                int i19 = (cr.f24999c + i) - this.f34610b0;
                cr2.y(4);
                byte[] bArr2 = cr2.f24997a;
                bArr2[0] = (byte) ((i19 >> 24) & com.anythink.basead.exoplayer.k.p.f9259b);
                bArr2[1] = (byte) ((i19 >> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
                bArr2[2] = (byte) ((i19 >> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
                bArr2[3] = (byte) (i19 & com.anythink.basead.exoplayer.k.p.f9259b);
                interfaceC3566m1.f(cr2, 4, 2);
                this.f34612c0 += 4;
            }
            this.f34616e0 = true;
        }
        int i20 = i + cr.f24999c;
        String str2 = c3836r2.f34251c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (c3836r2.f34244W != null) {
                AbstractC2792Sd.H(cr.f24999c == 0);
                c3836r2.f34244W.a(k02);
            }
            while (true) {
                int i21 = this.f34610b0;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                int B3 = cr.B();
                if (B3 > 0) {
                    d10 = Math.min(i22, B3);
                    interfaceC3566m1.a(d10, cr);
                } else {
                    d10 = interfaceC3566m1.d(k02, i22, false);
                }
                this.f34610b0 += d10;
                this.f34612c0 += d10;
            }
        } else {
            Cr cr5 = this.f34621h;
            byte[] bArr3 = cr5.f24997a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i23 = c3836r2.f34254d0;
            int i24 = 4 - i23;
            while (this.f34610b0 < i20) {
                int i25 = this.f34614d0;
                if (i25 == 0) {
                    int min = Math.min(i23, cr.B());
                    k02.A(bArr3, i24 + min, i23 - min, false);
                    if (min > 0) {
                        cr.H(bArr3, i24, min);
                    }
                    this.f34610b0 += i23;
                    cr5.E(0);
                    this.f34614d0 = cr5.h();
                    Cr cr6 = this.f34619g;
                    cr6.E(0);
                    interfaceC3566m1.a(4, cr6);
                    this.f34612c0 += 4;
                } else {
                    int B9 = cr.B();
                    if (B9 > 0) {
                        d9 = Math.min(i25, B9);
                        interfaceC3566m1.a(d9, cr);
                    } else {
                        d9 = interfaceC3566m1.d(k02, i25, false);
                    }
                    this.f34610b0 += d9;
                    this.f34612c0 += d9;
                    this.f34614d0 -= d9;
                }
            }
        }
        if ("A_VORBIS".equals(c3836r2.f34251c)) {
            Cr cr7 = this.f34624j;
            cr7.E(0);
            interfaceC3566m1.a(4, cr7);
            this.f34612c0 += 4;
        }
        int i26 = this.f34612c0;
        q();
        return i26;
    }

    public final void q() {
        this.f34610b0 = 0;
        this.f34612c0 = 0;
        this.f34614d0 = 0;
        this.f34616e0 = false;
        this.f34618f0 = false;
        this.f34620g0 = false;
        this.f34622h0 = 0;
        this.f34623i0 = (byte) 0;
        this.f34625j0 = false;
        this.f34628l.y(0);
    }

    public final void r(K0 k02, byte[] bArr, int i) {
        int length = bArr.length;
        int i4 = length + i;
        Cr cr = this.f34630m;
        byte[] bArr2 = cr.f24997a;
        if (bArr2.length < i4) {
            byte[] copyOf = Arrays.copyOf(bArr, i4 + i);
            cr.z(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        k02.A(cr.f24997a, length, i, false);
        cr.E(0);
        cr.C(i4);
    }

    public C3890s2(C3621n2 c3621n2, int i, InterfaceC3837r3 interfaceC3837r3) {
        this.f34636s = -1L;
        this.f34637t = com.anythink.basead.exoplayer.b.f7168b;
        this.f34638u = com.anythink.basead.exoplayer.b.f7168b;
        this.f34639v = com.anythink.basead.exoplayer.b.f7168b;
        this.f34588F = com.anythink.basead.exoplayer.b.f7168b;
        this.f34589G = -1;
        this.f34590H = -1L;
        this.f34591I = -1L;
        this.J = -1;
        this.f34593L = -1L;
        this.f34594M = -1L;
        this.f34595N = com.anythink.basead.exoplayer.b.f7168b;
        this.f34629l0 = c3621n2;
        c3621n2.f33445d = new C3680o7(this);
        this.f34617f = interfaceC3837r3;
        this.f34586D = new SparseArray();
        this.f34613d = true;
        this.f34615e = (i & 2) == 0;
        this.f34607a = new C3944t2(0);
        this.f34611c = new LongSparseArray();
        this.f34609b = new SparseArray();
        this.i = new Cr(4);
        this.f34624j = new Cr(ByteBuffer.allocate(4).putInt(-1).array());
        this.f34626k = new Cr(4);
        this.f34619g = new Cr(SK.m0);
        this.f34621h = new Cr(4);
        this.f34628l = new Cr();
        this.f34630m = new Cr();
        this.f34631n = new Cr(8);
        this.f34632o = new Cr();
        this.f34633p = new Cr();
        this.f34602U = new int[1];
        this.f34641x = true;
    }
}
