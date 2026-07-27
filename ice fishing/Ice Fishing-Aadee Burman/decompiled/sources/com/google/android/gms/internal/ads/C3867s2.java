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
public final class C3867s2 implements Q0 {
    public static final byte[] m0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: n0, reason: collision with root package name */
    public static final byte[] f33810n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final byte[] f33811o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final byte[] f33812p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final UUID f33813q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final Map f33814r0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f33815A;

    /* renamed from: B, reason: collision with root package name */
    public int f33816B;

    /* renamed from: C, reason: collision with root package name */
    public long f33817C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f33818D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f33819E;

    /* renamed from: F, reason: collision with root package name */
    public long f33820F;

    /* renamed from: G, reason: collision with root package name */
    public int f33821G;

    /* renamed from: H, reason: collision with root package name */
    public long f33822H;

    /* renamed from: I, reason: collision with root package name */
    public long f33823I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f33824K;

    /* renamed from: L, reason: collision with root package name */
    public long f33825L;

    /* renamed from: M, reason: collision with root package name */
    public long f33826M;

    /* renamed from: N, reason: collision with root package name */
    public long f33827N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f33828O;

    /* renamed from: P, reason: collision with root package name */
    public int f33829P;

    /* renamed from: Q, reason: collision with root package name */
    public long f33830Q;

    /* renamed from: R, reason: collision with root package name */
    public long f33831R;

    /* renamed from: S, reason: collision with root package name */
    public int f33832S;

    /* renamed from: T, reason: collision with root package name */
    public int f33833T;

    /* renamed from: U, reason: collision with root package name */
    public int[] f33834U;

    /* renamed from: V, reason: collision with root package name */
    public int f33835V;

    /* renamed from: W, reason: collision with root package name */
    public int f33836W;

    /* renamed from: X, reason: collision with root package name */
    public int f33837X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f33838Z;

    /* renamed from: a, reason: collision with root package name */
    public final C3921t2 f33839a;

    /* renamed from: a0, reason: collision with root package name */
    public long f33840a0;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f33841b;

    /* renamed from: b0, reason: collision with root package name */
    public int f33842b0;

    /* renamed from: c, reason: collision with root package name */
    public final LongSparseArray f33843c;

    /* renamed from: c0, reason: collision with root package name */
    public int f33844c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33845d;

    /* renamed from: d0, reason: collision with root package name */
    public int f33846d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33847e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f33848e0;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3814r3 f33849f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f33850f0;

    /* renamed from: g, reason: collision with root package name */
    public final Cr f33851g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f33852g0;

    /* renamed from: h, reason: collision with root package name */
    public final Cr f33853h;

    /* renamed from: h0, reason: collision with root package name */
    public int f33854h0;
    public final Cr i;

    /* renamed from: i0, reason: collision with root package name */
    public byte f33855i0;

    /* renamed from: j, reason: collision with root package name */
    public final Cr f33856j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f33857j0;

    /* renamed from: k, reason: collision with root package name */
    public final Cr f33858k;

    /* renamed from: k0, reason: collision with root package name */
    public S0 f33859k0;

    /* renamed from: l, reason: collision with root package name */
    public final Cr f33860l;

    /* renamed from: l0, reason: collision with root package name */
    public final C3598n2 f33861l0;

    /* renamed from: m, reason: collision with root package name */
    public final Cr f33862m;

    /* renamed from: n, reason: collision with root package name */
    public final Cr f33863n;

    /* renamed from: o, reason: collision with root package name */
    public final Cr f33864o;

    /* renamed from: p, reason: collision with root package name */
    public final Cr f33865p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f33866q;

    /* renamed from: r, reason: collision with root package name */
    public long f33867r;

    /* renamed from: s, reason: collision with root package name */
    public long f33868s;

    /* renamed from: t, reason: collision with root package name */
    public long f33869t;

    /* renamed from: u, reason: collision with root package name */
    public long f33870u;

    /* renamed from: v, reason: collision with root package name */
    public long f33871v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f33872w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f33873x;

    /* renamed from: y, reason: collision with root package name */
    public C3652o2 f33874y;

    /* renamed from: z, reason: collision with root package name */
    public C3813r2 f33875z;

    static {
        String str = AbstractC3159eu.f29993a;
        f33810n0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f33811o0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f33812p0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f33813q0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        com.anythink.basead.exoplayer.f.f.y(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        com.anythink.basead.exoplayer.f.f.y(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f33814r0 = Collections.unmodifiableMap(hashMap);
    }

    public C3867s2() {
        this(new C3598n2(), 2, InterfaceC3814r3.m0);
    }

    public static byte[] s(String str, long j6, long j9) {
        AbstractC2772Sd.i(j6 != com.anythink.basead.exoplayer.b.f6382b);
        Locale locale = Locale.US;
        int i = (int) (j6 / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j10 = j6 - (i * 3600000000L);
        int i6 = (int) (j10 / 60000000);
        Integer valueOf2 = Integer.valueOf(i6);
        long j11 = j10 - (i6 * 60000000);
        int i9 = (int) (j11 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i9), Integer.valueOf((int) ((j11 - (i9 * 1000000)) / j9)));
        String str2 = AbstractC3159eu.f29993a;
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
        boolean z3;
        long j6;
        int i;
        String str;
        int i6;
        long j9;
        int i9;
        int i10;
        long j10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z6;
        long j11;
        int i15;
        boolean z9;
        C3867s2 c3867s2;
        String str2;
        int i16;
        char c9;
        List list;
        SparseArray sparseArray;
        int i17;
        long j12;
        int i18;
        int i19;
        long j13;
        long j14;
        int i20;
        C3867s2 c3867s22 = this;
        int i21 = -1;
        int i22 = 0;
        c3867s22.f33828O = false;
        while (!c3867s22.f33828O) {
            C3598n2 c3598n2 = c3867s22.f33861l0;
            c3598n2.f32667d.getClass();
            while (true) {
                ArrayDeque arrayDeque = c3598n2.f32665b;
                C3544m2 c3544m2 = (C3544m2) arrayDeque.peek();
                int i23 = 8;
                int i24 = 374648427;
                RuntimeException runtimeException = null;
                if (c3544m2 == null || ((K0) r02).f25819w < c3544m2.f31879b) {
                    int i25 = c3598n2.f32668e;
                    C3921t2 c3921t2 = c3598n2.f32666c;
                    if (i25 == 0) {
                        K0 k02 = (K0) r02;
                        int i26 = 4;
                        int i27 = 0;
                        long d2 = c3921t2.d(k02, true, false, 4);
                        if (d2 == -2) {
                            k02.l();
                            while (true) {
                                byte[] bArr = c3598n2.f32664a;
                                k02.y(bArr, i27, i26);
                                byte b9 = bArr[i27];
                                int i28 = i23;
                                int i29 = 0;
                                while (true) {
                                    if (i29 < i28) {
                                        i15 = i29 + 1;
                                        j6 = 0;
                                        if ((C3921t2.f34188w[i29] & b9) == 0) {
                                            i29 = i15;
                                            i28 = 8;
                                        }
                                    } else {
                                        j6 = 0;
                                        i15 = -1;
                                    }
                                }
                                if (i15 != -1 && i15 <= 4) {
                                    int g4 = (int) C3921t2.g(i15, false, bArr);
                                    Object obj = c3598n2.f32667d.f32862u;
                                    if (g4 != 357149030 && g4 != 272869232 && g4 != 524531317 && g4 != 475249515) {
                                        if (g4 == 374648427) {
                                        }
                                    }
                                }
                                k02.v(1);
                                i26 = 4;
                                i27 = 0;
                                i23 = 8;
                            }
                            k02.v(i15);
                            j11 = i24;
                        } else {
                            j6 = 0;
                            j11 = d2;
                        }
                        z3 = true;
                        if (j11 == -1) {
                            z6 = false;
                        } else {
                            c3598n2.f32669f = (int) j11;
                            c3598n2.f32668e = 1;
                        }
                    } else {
                        z3 = true;
                        j6 = 0;
                    }
                    c3598n2.f32670g = c3921t2.d((K0) r02, false, z3, 8);
                    c3598n2.f32668e = 2;
                    C3657o7 c3657o7 = c3598n2.f32667d;
                    int i30 = c3598n2.f32669f;
                    C3867s2 c3867s23 = (C3867s2) c3657o7.f32862u;
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
                            long p9 = ((K0) r02).p();
                            arrayDeque.push(new C3544m2(i30, c3598n2.f32670g + p9));
                            ((C3867s2) c3598n2.f32667d.f32862u).i(c3598n2.f32669f, p9, c3598n2.f32670g);
                            i = 0;
                            c3598n2.f32668e = 0;
                            break;
                        case com.anythink.expressad.video.module.a.a.f21732V /* 131 */:
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
                            long j15 = c3598n2.f32670g;
                            if (j15 > 8) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j15).length() + 22);
                                sb.append("Invalid integer size: ");
                                sb.append(j15);
                                throw U4.a(null, sb.toString());
                            }
                            c3867s23.j(i30, c3598n2.a((K0) r02, (int) j15));
                            i = 0;
                            c3598n2.f32668e = 0;
                            break;
                        case 133:
                        case 134:
                        case 17026:
                        case 17276:
                        case 21358:
                        case 2274716:
                            long j16 = c3598n2.f32670g;
                            if (j16 > 2147483647L) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j16).length() + 21);
                                sb2.append("String element size: ");
                                sb2.append(j16);
                                throw U4.a(null, sb2.toString());
                            }
                            int i31 = (int) j16;
                            if (i31 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i31];
                                ((K0) r02).u(bArr2, 0, i31);
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
                            c3867s23.getClass();
                            if (i30 == 133) {
                                c3867s23.k(i30);
                                c3867s23.f33874y.f32845h = str;
                            } else if (i30 == 134) {
                                c3867s23.l(i30);
                                c3867s23.f33875z.f33484c = str;
                            } else if (i30 == 17026) {
                                if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    StringBuilder sb3 = new StringBuilder(str.length() + 22);
                                    sb3.append("DocType ");
                                    sb3.append(str);
                                    sb3.append(" not supported");
                                    throw U4.a(null, sb3.toString());
                                }
                                c3867s23.f33872w = str.equals("webm");
                            } else if (i30 == 17276) {
                                c3867s23.k(i30);
                                c3867s23.f33874y.i = str;
                            } else if (i30 == 21358) {
                                c3867s23.l(i30);
                                c3867s23.f33875z.f33482b = str;
                            } else if (i30 == 2274716) {
                                c3867s23.l(i30);
                                c3867s23.f33875z.f33481a0 = str;
                            }
                            i = 0;
                            c3598n2.f32668e = 0;
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
                            int i33 = (int) c3598n2.f32670g;
                            SparseArray sparseArray2 = c3867s23.f33841b;
                            if (i30 == 161 || i30 == 163) {
                                int i34 = c3867s23.f33829P;
                                Cr cr = c3867s23.i;
                                if (i34 == 0) {
                                    C3921t2 c3921t22 = c3867s23.f33839a;
                                    i6 = 0;
                                    j9 = 2147483647L;
                                    c3867s23.f33835V = (int) c3921t22.d((K0) r02, false, true, 8);
                                    c3867s23.f33836W = c3921t22.f34192u;
                                    c3867s23.f33831R = com.anythink.basead.exoplayer.b.f6382b;
                                    c3867s23.f33829P = 1;
                                    cr.y(0);
                                } else {
                                    i6 = 0;
                                    j9 = 2147483647L;
                                }
                                C3813r2 c3813r2 = (C3813r2) sparseArray2.get(c3867s23.f33835V);
                                if (c3813r2 == null) {
                                    ((K0) r02).v(i33 - c3867s23.f33836W);
                                    c3867s23.f33829P = i6;
                                    i10 = i6;
                                } else {
                                    c3813r2.f33483b0.getClass();
                                    if (c3867s23.f33829P == 1) {
                                        K0 k03 = (K0) r02;
                                        c3867s23.o(k03, 3);
                                        int i35 = (cr.f24252a[2] & 6) >> 1;
                                        byte b10 = 255;
                                        if (i35 == 0) {
                                            c3867s23.f33833T = 1;
                                            int[] iArr = c3867s23.f33834U;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else {
                                                int length = iArr.length;
                                                if (length < 1) {
                                                    iArr = new int[Math.max(length + length, 1)];
                                                }
                                            }
                                            c3867s23.f33834U = iArr;
                                            iArr[0] = (i33 - c3867s23.f33836W) - 3;
                                        } else {
                                            c3867s23.o(k03, 4);
                                            int i36 = (cr.f24252a[3] & com.anythink.basead.exoplayer.k.p.f8473b) + 1;
                                            c3867s23.f33833T = i36;
                                            int[] iArr2 = c3867s23.f33834U;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i36];
                                            } else {
                                                int length2 = iArr2.length;
                                                if (length2 < i36) {
                                                    iArr2 = new int[Math.max(length2 + length2, i36)];
                                                }
                                            }
                                            c3867s23.f33834U = iArr2;
                                            if (i35 == 2) {
                                                int i37 = (i33 - c3867s23.f33836W) - 4;
                                                int i38 = c3867s23.f33833T;
                                                Arrays.fill(iArr2, 0, i38, i37 / i38);
                                            } else {
                                                int i39 = 0;
                                                if (i35 != 1) {
                                                    if (i35 != 3) {
                                                        throw U4.a(null, "Unexpected lacing value: 2");
                                                    }
                                                    int i40 = 4;
                                                    int i41 = 0;
                                                    int i42 = 0;
                                                    while (true) {
                                                        int i43 = c3867s23.f33833T - 1;
                                                        if (i41 < i43) {
                                                            c3867s23.f33834U[i41] = 0;
                                                            int i44 = 1;
                                                            int i45 = i40 + 1;
                                                            c3867s23.o(k03, i45);
                                                            if (cr.f24252a[i40] == 0) {
                                                                throw U4.a(runtimeException, "No valid varint length mask found");
                                                            }
                                                            int i46 = 0;
                                                            while (true) {
                                                                if (i46 < 8) {
                                                                    int i47 = i44 << (7 - i46);
                                                                    if ((cr.f24252a[i40] & i47) != 0) {
                                                                        int i48 = i45 + i46;
                                                                        c3867s23.o(k03, i48);
                                                                        j10 = (~i47) & cr.f24252a[i40] & b10;
                                                                        while (i45 < i48) {
                                                                            j10 = (j10 << 8) | (cr.f24252a[i45] & 255);
                                                                            i45++;
                                                                        }
                                                                        if (i41 > 0) {
                                                                            j10 -= (1 << ((i46 * 7) + 6)) - 1;
                                                                        }
                                                                        i40 = i48;
                                                                    } else {
                                                                        i46++;
                                                                        b10 = 255;
                                                                        i44 = 1;
                                                                    }
                                                                } else {
                                                                    i40 = i45;
                                                                    j10 = j6;
                                                                }
                                                            }
                                                            if (j10 >= -2147483648L && j10 <= j9) {
                                                                int[] iArr3 = c3867s23.f33834U;
                                                                int i49 = (int) j10;
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
                                                            c3867s23.f33834U[i43] = ((i33 - c3867s23.f33836W) - i40) - i42;
                                                        }
                                                    }
                                                    throw U4.a(null, "EBML lacing sample size out of range.");
                                                }
                                                int i50 = 4;
                                                int i51 = 0;
                                                int i52 = 0;
                                                while (true) {
                                                    int i53 = c3867s23.f33833T - 1;
                                                    if (i51 < i53) {
                                                        c3867s23.f33834U[i51] = i39;
                                                        while (true) {
                                                            i11 = i50 + 1;
                                                            c3867s23.o(k03, i11);
                                                            int i54 = cr.f24252a[i50] & 255;
                                                            int[] iArr4 = c3867s23.f33834U;
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
                                                        c3867s23.f33834U[i53] = ((i33 - c3867s23.f33836W) - i50) - i52;
                                                    }
                                                }
                                            }
                                        }
                                        byte[] bArr3 = cr.f24252a;
                                        c3867s23.f33830Q = c3867s23.g((bArr3[1] & 255) | (bArr3[0] << 8)) + c3867s23.f33827N;
                                        if (c3813r2.f33489f == 1) {
                                            i13 = 2;
                                            i14 = 1;
                                        } else if (i30 == 163) {
                                            i13 = 2;
                                            i14 = (cr.f24252a[2] & com.anythink.core.common.s.a.c.f16316a) == 128 ? 1 : 0;
                                            i30 = 163;
                                        } else {
                                            i13 = 2;
                                            i14 = 0;
                                        }
                                        c3867s23.f33837X = i14;
                                        c3867s23.f33829P = i13;
                                        c3867s23.f33832S = 0;
                                        i9 = 163;
                                    } else {
                                        i9 = 163;
                                    }
                                    if (i30 == i9) {
                                        while (true) {
                                            int i55 = c3867s23.f33832S;
                                            if (i55 < c3867s23.f33833T) {
                                                c3867s23.n(c3813r2, c3867s23.f33830Q + ((c3867s23.f33832S * c3813r2.f33490g) / 1000), c3867s23.f33837X, c3867s23.p((K0) r02, c3813r2, c3867s23.f33834U[i55], false), 0);
                                                c3867s23.f33832S++;
                                            } else {
                                                i10 = 0;
                                                c3867s23.f33829P = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            int i56 = c3867s23.f33832S;
                                            if (i56 < c3867s23.f33833T) {
                                                int[] iArr5 = c3867s23.f33834U;
                                                iArr5[i56] = c3867s23.p((K0) r02, c3813r2, iArr5[i56], true);
                                                c3867s23.f33832S++;
                                            } else {
                                                i10 = 0;
                                            }
                                        }
                                    }
                                }
                                c3598n2.f32668e = i10 == true ? 1 : 0;
                                i = i10;
                                break;
                            } else if (i30 != 165) {
                                if (i30 == 16877) {
                                    c3867s23.l(i30);
                                    C3813r2 c3813r22 = c3867s23.f33875z;
                                    int i57 = c3813r22.i;
                                    if (i57 == 1685485123 || i57 == 1685480259) {
                                        byte[] bArr4 = new byte[i33];
                                        c3813r22.f33470P = bArr4;
                                        i10 = 0;
                                        ((K0) r02).u(bArr4, 0, i33);
                                    } else {
                                        ((K0) r02).v(i33);
                                        i10 = 0;
                                    }
                                } else if (i30 == 16981) {
                                    i10 = 0;
                                    c3867s23.l(i30);
                                    byte[] bArr5 = new byte[i33];
                                    c3867s23.f33875z.f33493k = bArr5;
                                    ((K0) r02).u(bArr5, 0, i33);
                                } else if (i30 == 18402) {
                                    i10 = 0;
                                    byte[] bArr6 = new byte[i33];
                                    ((K0) r02).u(bArr6, 0, i33);
                                    c3867s23.l(i30);
                                    c3867s23.f33875z.f33494l = new C3489l1(1, bArr6, 0, 0);
                                } else if (i30 == 21419) {
                                    i10 = 0;
                                    Cr cr2 = c3867s23.f33858k;
                                    Arrays.fill(cr2.f24252a, (byte) 0);
                                    ((K0) r02).u(cr2.f24252a, 4 - i33, i33);
                                    cr2.E(0);
                                    c3867s23.f33816B = (int) cr2.P();
                                } else if (i30 == 25506) {
                                    c3867s23.l(i30);
                                    byte[] bArr7 = new byte[i33];
                                    c3867s23.f33875z.f33495m = bArr7;
                                    i10 = 0;
                                    ((K0) r02).u(bArr7, 0, i33);
                                } else {
                                    if (i30 != 30322) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(i30).length() + 15);
                                        sb4.append("Unexpected id: ");
                                        sb4.append(i30);
                                        throw U4.a(null, sb4.toString());
                                    }
                                    c3867s23.l(i30);
                                    byte[] bArr8 = new byte[i33];
                                    c3867s23.f33875z.f33507y = bArr8;
                                    i10 = 0;
                                    ((K0) r02).u(bArr8, 0, i33);
                                }
                                c3598n2.f32668e = i10 == true ? 1 : 0;
                                i = i10;
                            } else {
                                if (c3867s23.f33829P == 2) {
                                    C3813r2 c3813r23 = (C3813r2) sparseArray2.get(c3867s23.f33835V);
                                    if (c3867s23.Y == 4 && "V_VP9".equals(c3813r23.f33484c)) {
                                        Cr cr3 = c3867s23.f33865p;
                                        cr3.y(i33);
                                        i10 = 0;
                                        ((K0) r02).u(cr3.f24252a, 0, i33);
                                        c3598n2.f32668e = i10 == true ? 1 : 0;
                                        i = i10;
                                    } else {
                                        ((K0) r02).v(i33);
                                    }
                                }
                                i10 = 0;
                                c3598n2.f32668e = i10 == true ? 1 : 0;
                                i = i10;
                            }
                            if (z6) {
                                long p10 = ((K0) r02).p();
                                c3867s2 = this;
                                if (c3867s2.f33824K) {
                                    c3867s2.f33826M = p10;
                                    u02.f27844n = c3867s2.f33825L;
                                    c3867s2.f33824K = z9;
                                    return 1;
                                }
                                if (c3867s2.f33815A) {
                                    long j17 = c3867s2.f33826M;
                                    if (j17 != -1) {
                                        u02.f27844n = j17;
                                        c3867s2.f33826M = -1L;
                                        return 1;
                                    }
                                }
                            } else {
                                c3867s2 = this;
                            }
                            if (z6) {
                                c3867s22 = c3867s2;
                                i21 = -1;
                                i22 = 0;
                            } else {
                                int i58 = 0;
                                while (true) {
                                    SparseArray sparseArray3 = c3867s2.f33841b;
                                    if (i58 >= sparseArray3.size()) {
                                        return -1;
                                    }
                                    C3813r2 c3813r24 = (C3813r2) sparseArray3.valueAt(i58);
                                    c3813r24.f33483b0.getClass();
                                    C3597n1 c3597n1 = c3813r24.f33477W;
                                    if (c3597n1 != null) {
                                        c3597n1.c(c3813r24.f33483b0, c3813r24.f33494l);
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
                            long j18 = c3598n2.f32670g;
                            if (j18 != 4 && j18 != 8) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(j18).length() + 20);
                                sb5.append("Invalid float size: ");
                                sb5.append(j18);
                                throw U4.a(null, sb5.toString());
                            }
                            int i59 = (int) j18;
                            double intBitsToFloat = i59 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(c3598n2.a((K0) r02, i59));
                            if (i30 == 181) {
                                c3867s23.l(i30);
                                c3867s23.f33875z.f33474T = (int) intBitsToFloat;
                            } else if (i30 != 17545) {
                                switch (i30) {
                                    case 21969:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.f33461F = (float) intBitsToFloat;
                                        break;
                                    case 21970:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.f33462G = (float) intBitsToFloat;
                                        break;
                                    case 21971:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.f33463H = (float) intBitsToFloat;
                                        break;
                                    case 21972:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.f33464I = (float) intBitsToFloat;
                                        break;
                                    case 21973:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.J = (float) intBitsToFloat;
                                        break;
                                    case 21974:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.f33465K = (float) intBitsToFloat;
                                        break;
                                    case 21975:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.f33466L = (float) intBitsToFloat;
                                        break;
                                    case 21976:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.f33467M = (float) intBitsToFloat;
                                        break;
                                    case 21977:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.f33468N = (float) intBitsToFloat;
                                        break;
                                    case 21978:
                                        c3867s23.l(i30);
                                        c3867s23.f33875z.f33469O = (float) intBitsToFloat;
                                        break;
                                    default:
                                        switch (i30) {
                                            case 30323:
                                                c3867s23.l(i30);
                                                c3867s23.f33875z.f33504v = (float) intBitsToFloat;
                                                break;
                                            case 30324:
                                                c3867s23.l(i30);
                                                c3867s23.f33875z.f33505w = (float) intBitsToFloat;
                                                break;
                                            case 30325:
                                                c3867s23.l(i30);
                                                c3867s23.f33875z.f33506x = (float) intBitsToFloat;
                                                break;
                                            default:
                                                c3867s23.getClass();
                                                break;
                                        }
                                }
                            } else {
                                c3867s23.f33870u = (long) intBitsToFloat;
                            }
                            i = 0;
                            c3598n2.f32668e = 0;
                            break;
                        default:
                            ((K0) r02).v((int) c3598n2.f32670g);
                            c3598n2.f32668e = 0;
                            i21 = -1;
                    }
                } else {
                    C3657o7 c3657o72 = c3598n2.f32667d;
                    int i60 = ((C3544m2) arrayDeque.pop()).f31878a;
                    C3867s2 c3867s24 = (C3867s2) c3657o72.f32862u;
                    c3867s24.f33859k0.getClass();
                    if (i60 != 128) {
                        SparseArray sparseArray4 = c3867s24.f33841b;
                        if (i60 != 160) {
                            if (i60 != 174) {
                                LongSparseArray longSparseArray = c3867s24.f33843c;
                                if (i60 == 17849) {
                                    for (int i61 = 0; i61 < sparseArray4.size(); i61++) {
                                        C3813r2 c3813r25 = (C3813r2) sparseArray4.valueAt(i61);
                                        ArrayList arrayList = new ArrayList(longSparseArray.size());
                                        for (int i62 = 0; i62 < longSparseArray.size(); i62++) {
                                            C3652o2 c3652o2 = (C3652o2) longSparseArray.valueAt(i62);
                                            long j19 = c3652o2.f32842e;
                                            if (j19 == 0 || j19 == c3813r25.f33488e) {
                                                long j20 = c3652o2.f32839b;
                                                String str3 = AbstractC3159eu.f29993a;
                                                if (j20 != com.anythink.basead.exoplayer.b.f6382b && j20 != Long.MIN_VALUE) {
                                                    j20 /= 1000000;
                                                }
                                                long j21 = j20;
                                                long j22 = c3652o2.f32840c;
                                                if (j22 != com.anythink.basead.exoplayer.b.f6382b && j22 != Long.MIN_VALUE) {
                                                    j22 /= 1000000;
                                                }
                                                arrayList.add(new O1(j21, j22, c3652o2.f32841d, c3652o2.f32843f != null ? new C3138eQ(c3652o2.f32844g, c3652o2.f32843f) : null));
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            DP dp = c3813r25.f33485c0;
                                            dp.getClass();
                                            C3299hP a9 = dp.a();
                                            O3 o32 = dp.f24428l;
                                            a9.f30789k = o32 != null ? o32.c((InterfaceC3922t3[]) arrayList.toArray(new N1[0])) : new O3(arrayList);
                                            c3813r25.f33485c0 = new DP(a9);
                                        }
                                    }
                                } else {
                                    if (i60 == 19899) {
                                        int i63 = c3867s24.f33816B;
                                        if (i63 != -1) {
                                            long j23 = c3867s24.f33817C;
                                            if (j23 != -1) {
                                                if (i63 == 475249515) {
                                                    c3867s24.f33825L = j23;
                                                }
                                            }
                                        }
                                        throw U4.a(null, "Mandatory element SeekID or SeekPosition not found");
                                    }
                                    if (i60 == 25152) {
                                        c3867s24.l(i60);
                                        C3813r2 c3813r26 = c3867s24.f33875z;
                                        if (c3813r26.f33492j) {
                                            C3489l1 c3489l1 = c3813r26.f33494l;
                                            if (c3489l1 == null) {
                                                throw U4.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                            }
                                            c3813r26.f33496n = new EO(null, true, new AO(Yw.f28760a, com.anythink.basead.exoplayer.k.o.f8449f, c3489l1.f31681b));
                                        }
                                    } else if (i60 == 28032) {
                                        c3867s24.l(i60);
                                        C3813r2 c3813r27 = c3867s24.f33875z;
                                        if (c3813r27.f33492j && c3813r27.f33493k != null) {
                                            throw U4.a(null, "Combining encryption and compression is not supported");
                                        }
                                    } else if (i60 == 357149030) {
                                        if (c3867s24.f33869t == com.anythink.basead.exoplayer.b.f6382b) {
                                            c3867s24.f33869t = 1000000L;
                                        }
                                        long j24 = c3867s24.f33870u;
                                        if (j24 != com.anythink.basead.exoplayer.b.f6382b) {
                                            c3867s24.f33871v = c3867s24.g(j24);
                                        }
                                    } else if (i60 != 374648427) {
                                        SparseArray sparseArray5 = c3867s24.f33818D;
                                        if (i60 != 475249515) {
                                            if (i60 == 182) {
                                                C3652o2 c3652o22 = c3867s24.f33874y;
                                                c3652o22.getClass();
                                                long j25 = c3652o22.f32838a;
                                                if (j25 != 0) {
                                                    longSparseArray.put(j25, c3652o22);
                                                }
                                                c3867s24.f33874y = null;
                                            } else if (i60 == 183 && !c3867s24.f33815A) {
                                                c3867s24.m(i60);
                                                if (c3867s24.f33820F != com.anythink.basead.exoplayer.b.f6382b && (i20 = c3867s24.f33821G) != i21 && c3867s24.f33822H != -1) {
                                                    List list2 = (List) sparseArray5.get(i20);
                                                    if (list2 == null) {
                                                        list2 = new ArrayList();
                                                        sparseArray5.put(c3867s24.f33821G, list2);
                                                    }
                                                    list2.add(new C3706p2(c3867s24.f33820F, c3867s24.f33868s + c3867s24.f33822H, c3867s24.f33823I));
                                                }
                                            }
                                        } else if (!c3867s24.f33815A) {
                                            int i64 = 0;
                                            while (true) {
                                                if (i64 < sparseArray5.size()) {
                                                    if (((List) sparseArray5.valueAt(i64)).isEmpty()) {
                                                        i64++;
                                                    } else if (c3867s24.f33871v != com.anythink.basead.exoplayer.b.f6382b) {
                                                        for (int i65 = 0; i65 < sparseArray5.size(); i65++) {
                                                            Collections.sort((List) sparseArray5.valueAt(i65));
                                                        }
                                                        c3867s24.f33859k0.D(new C3760q2(sparseArray5, c3867s24.f33871v, c3867s24.J, c3867s24.f33868s, c3867s24.f33867r));
                                                    }
                                                }
                                            }
                                            c3867s24.f33859k0.D(new V0(c3867s24.f33871v, 0L));
                                            c3867s24.f33815A = true;
                                            c3867s24.f33819E = false;
                                            int i66 = 0;
                                            while (i66 < sparseArray4.size()) {
                                                C3813r2 c3813r28 = (C3813r2) sparseArray4.valueAt(i66);
                                                long j26 = c3867s24.f33871v;
                                                long j27 = c3867s24.f33868s;
                                                long j28 = c3867s24.f33867r;
                                                if (c3813r28.f33489f != 2 || (list = (List) sparseArray5.get(c3813r28.f33486d)) == null || list.isEmpty()) {
                                                    sparseArray = sparseArray5;
                                                    i17 = i66;
                                                } else {
                                                    if (list.isEmpty()) {
                                                        sparseArray = sparseArray5;
                                                        i17 = i66;
                                                    } else {
                                                        int i67 = i21;
                                                        int min = Math.min(list.size(), 20);
                                                        double d9 = 0.0d;
                                                        sparseArray = sparseArray5;
                                                        int i68 = i67;
                                                        int i69 = 0;
                                                        while (true) {
                                                            if (i69 < min) {
                                                                i17 = i66;
                                                                C3706p2 c3706p2 = (C3706p2) list.get(i69);
                                                                long j29 = j26;
                                                                if (c3706p2.f33016n <= 10000000) {
                                                                    int i70 = i69 + 1;
                                                                    int size = list.size() - 1;
                                                                    long j30 = j27;
                                                                    long j31 = c3706p2.f33016n;
                                                                    long j32 = c3706p2.f33018v;
                                                                    long j33 = c3706p2.f33017u;
                                                                    if (i69 < size) {
                                                                        C3706p2 c3706p22 = (C3706p2) list.get(i70);
                                                                        i19 = i70;
                                                                        i18 = i69;
                                                                        j14 = c3706p22.f33016n - j31;
                                                                        j13 = (c3706p22.f33017u + c3706p22.f33018v) - (j33 + j32);
                                                                    } else {
                                                                        i18 = i69;
                                                                        i19 = i70;
                                                                        j13 = (j30 + j28) - (j33 + j32);
                                                                        j14 = j29 - j31;
                                                                    }
                                                                    if (j14 > 0) {
                                                                        double d10 = j13 / j14;
                                                                        if (d10 > d9) {
                                                                            d9 = d10;
                                                                            i68 = i18;
                                                                        }
                                                                    }
                                                                    i69 = i19;
                                                                    i66 = i17;
                                                                    j26 = j29;
                                                                    j27 = j30;
                                                                }
                                                            } else {
                                                                i17 = i66;
                                                            }
                                                        }
                                                        if (i68 != i67) {
                                                            j12 = ((C3706p2) list.get(i68)).f33016n;
                                                            if (j12 != com.anythink.basead.exoplayer.b.f6382b) {
                                                                DP dp2 = c3813r28.f33485c0;
                                                                dp2.getClass();
                                                                Q1 q12 = new Q1(j12);
                                                                O3 o33 = dp2.f24428l;
                                                                O3 o34 = o33 == null ? new O3(q12) : o33.c(q12);
                                                                DP dp3 = c3813r28.f33485c0;
                                                                dp3.getClass();
                                                                C3299hP c3299hP = new C3299hP(dp3);
                                                                c3299hP.f30789k = o34;
                                                                c3813r28.f33485c0 = new DP(c3299hP);
                                                            }
                                                        }
                                                    }
                                                    j12 = -9223372036854775807L;
                                                    if (j12 != com.anythink.basead.exoplayer.b.f6382b) {
                                                    }
                                                }
                                                if (!c3813r28.f33478X) {
                                                    c3813r28.f33483b0.getClass();
                                                    InterfaceC3543m1 interfaceC3543m1 = c3813r28.f33483b0;
                                                    DP dp4 = c3813r28.f33485c0;
                                                    dp4.getClass();
                                                    interfaceC3543m1.e(dp4);
                                                }
                                                i66 = i17 + 1;
                                                sparseArray5 = sparseArray;
                                                i21 = -1;
                                            }
                                            c3867s24.h();
                                        }
                                    } else {
                                        if (sparseArray4.size() == 0) {
                                            throw U4.a(null, "No valid tracks were found");
                                        }
                                        boolean z10 = !c3867s24.f33845d || c3867s24.f33825L == -1;
                                        int i71 = -1;
                                        int i72 = -1;
                                        int i73 = -1;
                                        int i74 = -1;
                                        for (int i75 = 0; i75 < sparseArray4.size(); i75++) {
                                            C3813r2 c3813r29 = (C3813r2) sparseArray4.valueAt(i75);
                                            int i76 = c3813r29.f33489f;
                                            if (i76 == 2) {
                                                if (c3813r29.f33479Z) {
                                                    i71 = c3813r29.f33486d;
                                                }
                                                if (i72 == -1) {
                                                    i72 = c3813r29.f33486d;
                                                }
                                            } else if (i76 == 1) {
                                                if (c3813r29.f33479Z) {
                                                    i73 = c3813r29.f33486d;
                                                }
                                                if (i74 == -1) {
                                                    i74 = c3813r29.f33486d;
                                                }
                                            }
                                            if (z10) {
                                                c3813r29.f33483b0.getClass();
                                                if (!c3813r29.f33478X) {
                                                    InterfaceC3543m1 interfaceC3543m12 = c3813r29.f33483b0;
                                                    DP dp5 = c3813r29.f33485c0;
                                                    dp5.getClass();
                                                    interfaceC3543m12.e(dp5);
                                                }
                                            }
                                        }
                                        if (i71 != -1) {
                                            c3867s24.J = i71;
                                        } else if (i72 != -1) {
                                            c3867s24.J = i72;
                                        } else if (i73 != -1) {
                                            c3867s24.J = i73;
                                        } else if (i74 != -1) {
                                            c3867s24.J = i74;
                                        } else {
                                            c3867s24.J = sparseArray4.size() > 0 ? ((C3813r2) sparseArray4.valueAt(0)).f33486d : -1;
                                        }
                                        if (z10) {
                                            c3867s24.h();
                                        }
                                    }
                                }
                            } else {
                                C3813r2 c3813r210 = c3867s24.f33875z;
                                c3813r210.getClass();
                                String str4 = c3813r210.f33484c;
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
                                        c3813r210.a(c3813r210.f33486d);
                                        c3813r210.f33483b0 = c3867s24.f33859k0.C(c3813r210.f33486d, c3813r210.f33489f);
                                        sparseArray4.put(c3813r210.f33486d, c3813r210);
                                        break;
                                }
                                c3867s24.f33875z = null;
                            }
                        } else if (c3867s24.f33829P == 2) {
                            C3813r2 c3813r211 = (C3813r2) sparseArray4.get(c3867s24.f33835V);
                            c3813r211.f33483b0.getClass();
                            if (c3867s24.f33840a0 > 0 && "A_OPUS".equals(c3813r211.f33484c)) {
                                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c3867s24.f33840a0).array();
                                c3867s24.f33865p.z(array.length, array);
                            }
                            int i77 = 0;
                            for (int i78 = 0; i78 < c3867s24.f33833T; i78++) {
                                i77 += c3867s24.f33834U[i78];
                            }
                            int i79 = 0;
                            while (i79 < c3867s24.f33833T) {
                                long j34 = c3867s24.f33830Q + ((c3813r211.f33490g * i79) / 1000);
                                int i80 = c3867s24.f33837X;
                                if (i79 == 0) {
                                    if (!c3867s24.f33838Z) {
                                        i80 |= 1;
                                    }
                                    i16 = i80;
                                    i79 = 0;
                                } else {
                                    i16 = i80;
                                }
                                int i81 = c3867s24.f33834U[i79];
                                int i82 = i77 - i81;
                                c3867s24.n(c3813r211, j34, i16, i81, i82);
                                i79++;
                                i77 = i82;
                            }
                            c3867s24.f33829P = 0;
                        }
                    } else {
                        C3652o2 c3652o23 = c3867s24.f33874y;
                        c3652o23.getClass();
                        if (c3652o23.f32843f == null && (str2 = c3652o23.f32845h) != null) {
                            c3652o23.f32843f = str2;
                            String str5 = c3652o23.i;
                            if (str5 != null) {
                                c3652o23.f32844g = str5;
                            }
                        }
                    }
                    z6 = true;
                }
            }
        }
        return i22;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        if (this.f33847e) {
            s02 = new com.bumptech.glide.manager.o(s02, this.f33849f);
        }
        this.f33859k0 = s02;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f33827N = com.anythink.basead.exoplayer.b.f6382b;
        this.f33829P = 0;
        C3598n2 c3598n2 = this.f33861l0;
        c3598n2.f32668e = 0;
        c3598n2.f32665b.clear();
        C3921t2 c3921t2 = c3598n2.f32666c;
        c3921t2.f34191n = 0;
        c3921t2.f34192u = 0;
        C3921t2 c3921t22 = this.f33839a;
        c3921t22.f34191n = 0;
        c3921t22.f34192u = 0;
        q();
        this.f33819E = false;
        this.f33820F = com.anythink.basead.exoplayer.b.f6382b;
        this.f33821G = -1;
        this.f33822H = -1L;
        this.f33823I = -1L;
        if (!this.f33815A) {
            this.f33818D.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f33841b;
            if (i >= sparseArray.size()) {
                return;
            }
            C3597n1 c3597n1 = ((C3813r2) sparseArray.valueAt(i)).f33477W;
            if (c3597n1 != null) {
                c3597n1.f32658b = false;
                c3597n1.f32659c = 0;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        G1.a aVar = new G1.a((byte) 0, 3);
        K0 k02 = (K0) r02;
        long j6 = k02.f25818v;
        long j9 = 1024;
        if (j6 != -1 && j6 <= 1024) {
            j9 = j6;
        }
        Cr cr = (Cr) aVar.f1051v;
        k02.A(cr.f24252a, 0, 4, false);
        long P8 = cr.P();
        aVar.f1050u = 4;
        while (true) {
            if (P8 != 440786851) {
                int i = (int) j9;
                int i6 = aVar.f1050u + 1;
                aVar.f1050u = i6;
                if (i6 == i) {
                    break;
                }
                k02.A(cr.f24252a, 0, 1, false);
                P8 = ((P8 << 8) & (-256)) | (cr.f24252a[0] & 255);
            } else {
                long u3 = aVar.u(k02);
                long j10 = aVar.f1050u;
                if (u3 != Long.MIN_VALUE) {
                    long j11 = j10 + u3;
                    if (j6 == -1 || j11 < j6) {
                        while (true) {
                            long j12 = aVar.f1050u;
                            if (j12 < j11) {
                                if (aVar.u(k02) != Long.MIN_VALUE) {
                                    long u6 = aVar.u(k02);
                                    if (u6 < 0) {
                                        break;
                                    }
                                    if (u6 != 0) {
                                        int i9 = (int) u6;
                                        k02.c(i9, false);
                                        aVar.f1050u += i9;
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
        long j9 = this.f33869t;
        if (j9 != com.anythink.basead.exoplayer.b.f6382b) {
            return AbstractC3159eu.w(j6, j9, 1000L, RoundingMode.DOWN);
        }
        throw U4.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final void h() {
        if (!this.f33873x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f33841b;
            if (i >= sparseArray.size()) {
                S0 s02 = this.f33859k0;
                s02.getClass();
                s02.B();
                this.f33873x = false;
                return;
            }
            if (((C3813r2) sparseArray.valueAt(i)).f33478X) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void i(int i, long j6, long j9) {
        S0 s02 = this.f33859k0;
        s02.getClass();
        if (i == 128) {
            k(i);
            this.f33874y.f32845h = null;
            k(i);
            this.f33874y.i = null;
            return;
        }
        if (i == 160) {
            this.f33838Z = false;
            this.f33840a0 = 0L;
            return;
        }
        if (i == 174) {
            C3813r2 c3813r2 = new C3813r2();
            c3813r2.f33497o = -1;
            c3813r2.f33498p = -1;
            c3813r2.f33499q = -1;
            c3813r2.f33500r = -1;
            c3813r2.f33501s = -1;
            c3813r2.f33502t = 0;
            c3813r2.f33503u = -1;
            c3813r2.f33504v = 0.0f;
            c3813r2.f33505w = 0.0f;
            c3813r2.f33506x = 0.0f;
            c3813r2.f33507y = null;
            c3813r2.f33508z = -1;
            c3813r2.f33456A = -1;
            c3813r2.f33457B = -1;
            c3813r2.f33458C = -1;
            c3813r2.f33459D = 1000;
            c3813r2.f33460E = 200;
            c3813r2.f33461F = -1.0f;
            c3813r2.f33462G = -1.0f;
            c3813r2.f33463H = -1.0f;
            c3813r2.f33464I = -1.0f;
            c3813r2.J = -1.0f;
            c3813r2.f33465K = -1.0f;
            c3813r2.f33466L = -1.0f;
            c3813r2.f33467M = -1.0f;
            c3813r2.f33468N = -1.0f;
            c3813r2.f33469O = -1.0f;
            c3813r2.f33471Q = 1;
            c3813r2.f33472R = -1;
            c3813r2.f33473S = -1;
            c3813r2.f33474T = 8000;
            c3813r2.f33475U = 0L;
            c3813r2.f33476V = 0L;
            c3813r2.f33478X = false;
            c3813r2.f33479Z = true;
            c3813r2.f33481a0 = "eng";
            this.f33875z = c3813r2;
            c3813r2.f33480a = this.f33872w;
            return;
        }
        if (i == 187) {
            if (this.f33815A) {
                return;
            }
            m(i);
            this.f33820F = com.anythink.basead.exoplayer.b.f6382b;
            return;
        }
        if (i == 19899) {
            this.f33816B = -1;
            this.f33817C = -1L;
            return;
        }
        if (i == 20533) {
            l(i);
            this.f33875z.f33492j = true;
            return;
        }
        if (i == 408125543) {
            long j10 = this.f33868s;
            if (j10 != -1 && j10 != j6) {
                throw U4.a(null, "Multiple Segment elements not supported");
            }
            this.f33868s = j6;
            this.f33867r = j9;
            return;
        }
        if (i == 475249515) {
            if (this.f33815A) {
                return;
            }
            this.f33819E = true;
            return;
        }
        if (i == 524531317) {
            if (this.f33815A) {
                return;
            }
            if (this.f33845d && this.f33825L != -1) {
                this.f33824K = true;
                return;
            } else {
                s02.D(new V0(this.f33871v, 0L));
                this.f33815A = true;
                return;
            }
        }
        if (i == 182) {
            C3652o2 c3652o2 = new C3652o2();
            c3652o2.f32839b = com.anythink.basead.exoplayer.b.f6382b;
            c3652o2.f32840c = com.anythink.basead.exoplayer.b.f6382b;
            this.f33874y = c3652o2;
            return;
        }
        if (i == 183 && !this.f33815A) {
            m(i);
            this.f33821G = -1;
            this.f33822H = -1L;
            this.f33823I = -1L;
        }
    }

    public final void j(int i, long j6) {
        boolean z3;
        if (i == 136) {
            z3 = j6 == 1;
            l(i);
            this.f33875z.f33479Z = z3;
            return;
        }
        if (i == 137) {
            k(i);
            this.f33874y.f32842e = j6;
            return;
        }
        if (i == 145) {
            k(i);
            this.f33874y.f32839b = j6;
            return;
        }
        if (i == 146) {
            k(i);
            this.f33874y.f32840c = j6;
            return;
        }
        if (i == 240) {
            if (this.f33815A) {
                return;
            }
            m(i);
            if (this.f33823I == -1) {
                this.f33823I = j6;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.f33815A) {
                return;
            }
            m(i);
            if (this.f33822H == -1) {
                this.f33822H = j6;
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
            this.f33874y.f32838a = j6;
            return;
        }
        if (i == 29637) {
            l(i);
            this.f33875z.f33488e = j6;
            return;
        }
        switch (i) {
            case com.anythink.expressad.video.module.a.a.f21732V /* 131 */:
                int i6 = (int) j6;
                if (i6 == 1) {
                    l(i);
                    this.f33875z.f33489f = 2;
                    return;
                }
                if (i6 == 2) {
                    l(i);
                    this.f33875z.f33489f = 1;
                    return;
                } else if (i6 == 17) {
                    l(i);
                    this.f33875z.f33489f = 3;
                    return;
                } else if (i6 != 33) {
                    l(i);
                    this.f33875z.f33489f = -1;
                    return;
                } else {
                    l(i);
                    this.f33875z.f33489f = 5;
                    return;
                }
            case 152:
                z3 = j6 == 1;
                k(i);
                this.f33874y.f32841d = z3;
                return;
            case 155:
                this.f33831R = g(j6);
                return;
            case 159:
                l(i);
                this.f33875z.f33471Q = (int) j6;
                return;
            case 176:
                l(i);
                this.f33875z.f33497o = (int) j6;
                return;
            case 179:
                if (this.f33815A) {
                    return;
                }
                m(i);
                this.f33820F = g(j6);
                return;
            case 186:
                l(i);
                this.f33875z.f33498p = (int) j6;
                return;
            case 215:
                l(i);
                this.f33875z.f33486d = (int) j6;
                return;
            case 231:
                this.f33827N = g(j6);
                return;
            case 238:
                this.Y = (int) j6;
                return;
            case 247:
                if (this.f33815A) {
                    return;
                }
                m(i);
                this.f33821G = (int) j6;
                return;
            case 251:
                this.f33838Z = true;
                return;
            case 16871:
                l(i);
                this.f33875z.i = (int) j6;
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
                this.f33817C = j6 + this.f33868s;
                return;
            case 21432:
                int i9 = (int) j6;
                l(i);
                if (i9 == 0) {
                    this.f33875z.f33508z = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f33875z.f33508z = 2;
                    return;
                } else if (i9 == 3) {
                    this.f33875z.f33508z = 1;
                    return;
                } else {
                    if (i9 != 15) {
                        return;
                    }
                    this.f33875z.f33508z = 3;
                    return;
                }
            case 21680:
                l(i);
                this.f33875z.f33500r = (int) j6;
                return;
            case 21682:
                l(i);
                this.f33875z.f33502t = (int) j6;
                return;
            case 21690:
                l(i);
                this.f33875z.f33501s = (int) j6;
                return;
            case 21930:
                z3 = j6 == 1;
                l(i);
                this.f33875z.Y = z3;
                return;
            case 21938:
                l(i);
                this.f33875z.f33499q = (int) j6;
                return;
            case 21998:
                l(i);
                this.f33875z.f33491h = (int) j6;
                return;
            case 22186:
                l(i);
                this.f33875z.f33475U = j6;
                return;
            case 22203:
                l(i);
                this.f33875z.f33476V = j6;
                return;
            case 25188:
                l(i);
                this.f33875z.f33472R = (int) j6;
                return;
            case 30114:
                this.f33840a0 = j6;
                return;
            case 30321:
                int i10 = (int) j6;
                l(i);
                if (i10 == 0) {
                    this.f33875z.f33503u = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f33875z.f33503u = 1;
                    return;
                } else if (i10 == 2) {
                    this.f33875z.f33503u = 2;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f33875z.f33503u = 3;
                    return;
                }
            case 2352003:
                l(i);
                this.f33875z.f33490g = (int) j6;
                return;
            case 2807729:
                this.f33869t = j6;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i11 = (int) j6;
                        l(i);
                        if (i11 == 1) {
                            this.f33875z.f33458C = 2;
                            return;
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            this.f33875z.f33458C = 1;
                            return;
                        }
                    case 21946:
                        l(i);
                        int c9 = KJ.c((int) j6);
                        if (c9 != -1) {
                            this.f33875z.f33457B = c9;
                            return;
                        }
                        return;
                    case 21947:
                        l(i);
                        int b9 = KJ.b((int) j6);
                        if (b9 != -1) {
                            this.f33875z.f33456A = b9;
                            return;
                        }
                        return;
                    case 21948:
                        l(i);
                        this.f33875z.f33459D = (int) j6;
                        return;
                    case 21949:
                        l(i);
                        this.f33875z.f33460E = (int) j6;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void k(int i) {
        if (this.f33874y != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in an EditionEntry");
        throw U4.a(null, sb.toString());
    }

    public final void l(int i) {
        if (this.f33875z != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw U4.a(null, sb.toString());
    }

    public final void m(int i) {
        if (this.f33819E) {
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
    public final void n(C3813r2 c3813r2, long j6, int i, int i6, int i9) {
        char c9;
        byte[] s9;
        int i10;
        int i11;
        C3597n1 c3597n1 = c3813r2.f33477W;
        if (c3597n1 != null) {
            c3597n1.b(c3813r2.f33483b0, j6, i, i6, i9, c3813r2.f33494l);
        } else {
            String str = c3813r2.f33484c;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.f33833T > 1) {
                    AbstractC2968bG.y("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j9 = this.f33831R;
                    if (j9 == com.anythink.basead.exoplayer.b.f6382b) {
                        AbstractC2968bG.y("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        Cr cr = this.f33862m;
                        byte[] bArr = cr.f24252a;
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
                            i10 = 19;
                        } else if (c9 == 1 || c9 == 2) {
                            s9 = s("%01d:%02d:%02d:%02d", j9, 10000L);
                            i10 = 21;
                        } else {
                            if (c9 != 3) {
                                throw new IllegalArgumentException();
                            }
                            s9 = s("%02d:%02d:%02d.%03d", j9, 1000L);
                            i10 = 25;
                        }
                        System.arraycopy(s9, 0, bArr, i10, s9.length);
                        int i12 = cr.f24253b;
                        while (true) {
                            if (i12 < cr.f24254c) {
                                if (cr.f24252a[i12] == 0) {
                                    cr.C(i12);
                                } else {
                                    i12++;
                                }
                            }
                        }
                        c3813r2.f33483b0.a(cr.f24254c, cr);
                        i11 = i6 + cr.f24254c;
                        if ((i & 268435456) != 0) {
                            int i13 = this.f33833T;
                            Cr cr2 = this.f33865p;
                            if (i13 > 1) {
                                cr2.y(0);
                            } else {
                                int i14 = cr2.f24254c;
                                c3813r2.f33483b0.f(cr2, i14, 2);
                                i11 += i14;
                            }
                        }
                        c3813r2.f33483b0.c(j6, i, i11, i9, c3813r2.f33494l);
                    }
                }
            }
            i11 = i6;
            if ((i & 268435456) != 0) {
            }
            c3813r2.f33483b0.c(j6, i, i11, i9, c3813r2.f33494l);
        }
        this.f33828O = true;
    }

    public final void o(K0 k02, int i) {
        Cr cr = this.i;
        if (cr.f24254c >= i) {
            return;
        }
        byte[] bArr = cr.f24252a;
        if (bArr.length < i) {
            int length = bArr.length;
            cr.A(Math.max(length + length, i));
        }
        byte[] bArr2 = cr.f24252a;
        int i6 = cr.f24254c;
        k02.z(bArr2, i6, i - i6, false);
        cr.C(i);
    }

    public final int p(K0 k02, C3813r2 c3813r2, int i, boolean z3) {
        int d2;
        int d9;
        int i6;
        String str = c3813r2.f33484c;
        if ("S_TEXT/UTF8".equals(str)) {
            r(k02, m0, i);
            int i9 = this.f33844c0;
            q();
            return i9;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            r(k02, f33811o0, i);
            int i10 = this.f33844c0;
            q();
            return i10;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            r(k02, f33812p0, i);
            int i11 = this.f33844c0;
            q();
            return i11;
        }
        if (c3813r2.f33478X) {
            DP dp = c3813r2.f33485c0;
            dp.getClass();
            DP P8 = AbstractC2968bG.P(k02, i, dp);
            c3813r2.f33485c0 = P8;
            c3813r2.f33483b0.e(P8);
            c3813r2.f33478X = false;
            h();
        }
        InterfaceC3543m1 interfaceC3543m1 = c3813r2.f33483b0;
        boolean z6 = this.f33848e0;
        Cr cr = this.f33860l;
        if (!z6) {
            boolean z9 = c3813r2.f33492j;
            Cr cr2 = this.i;
            if (z9) {
                this.f33837X &= -1073741825;
                if (!this.f33850f0) {
                    k02.z(cr2.f24252a, 0, 1, false);
                    this.f33842b0++;
                    byte b9 = cr2.f24252a[0];
                    if ((b9 & com.anythink.core.common.s.a.c.f16316a) == 128) {
                        throw U4.a(null, "Extension bit is set in signal byte");
                    }
                    this.f33855i0 = b9;
                    this.f33850f0 = true;
                }
                byte b10 = this.f33855i0;
                if ((b10 & 1) == 1) {
                    int i12 = b10 & 2;
                    this.f33837X |= 1073741824;
                    if (!this.f33857j0) {
                        Cr cr3 = this.f33863n;
                        k02.z(cr3.f24252a, 0, 8, false);
                        this.f33842b0 += 8;
                        this.f33857j0 = true;
                        cr2.f24252a[0] = (byte) ((i12 != 2 ? 0 : 128) | 8);
                        cr2.E(0);
                        interfaceC3543m1.f(cr2, 1, 1);
                        this.f33844c0++;
                        cr3.E(0);
                        interfaceC3543m1.f(cr3, 8, 1);
                        this.f33844c0 += 8;
                    }
                    if (i12 == 2) {
                        if (!this.f33852g0) {
                            k02.z(cr2.f24252a, 0, 1, false);
                            this.f33842b0++;
                            cr2.E(0);
                            this.f33854h0 = cr2.K();
                            this.f33852g0 = true;
                        }
                        int i13 = this.f33854h0 * 4;
                        cr2.y(i13);
                        k02.z(cr2.f24252a, 0, i13, false);
                        this.f33842b0 += i13;
                        int i14 = (this.f33854h0 >> 1) + 1;
                        int i15 = (i14 * 6) + 2;
                        ByteBuffer byteBuffer = this.f33866q;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.f33866q = ByteBuffer.allocate(i15);
                        }
                        this.f33866q.position(0);
                        this.f33866q.putShort((short) i14);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i6 = this.f33854h0;
                            if (i16 >= i6) {
                                break;
                            }
                            int h9 = cr2.h();
                            int i18 = h9 - i17;
                            if (i16 % 2 == 0) {
                                this.f33866q.putShort((short) i18);
                            } else {
                                this.f33866q.putInt(i18);
                            }
                            i16++;
                            i17 = h9;
                        }
                        int i19 = (i - this.f33842b0) - i17;
                        if ((i6 & 1) == 1) {
                            this.f33866q.putInt(i19);
                        } else {
                            this.f33866q.putShort((short) i19);
                            this.f33866q.putInt(0);
                        }
                        byte[] array = this.f33866q.array();
                        Cr cr4 = this.f33864o;
                        cr4.z(i15, array);
                        interfaceC3543m1.f(cr4, i15, 1);
                        this.f33844c0 += i15;
                    }
                }
            } else {
                byte[] bArr = c3813r2.f33493k;
                if (bArr != null) {
                    cr.z(bArr.length, bArr);
                }
            }
            if (!"A_OPUS".equals(c3813r2.f33484c) ? c3813r2.f33491h > 0 : z3) {
                this.f33837X |= 268435456;
                this.f33865p.y(0);
                int i20 = (cr.f24254c + i) - this.f33842b0;
                cr2.y(4);
                byte[] bArr2 = cr2.f24252a;
                bArr2[0] = (byte) ((i20 >> 24) & com.anythink.basead.exoplayer.k.p.f8473b);
                bArr2[1] = (byte) ((i20 >> 16) & com.anythink.basead.exoplayer.k.p.f8473b);
                bArr2[2] = (byte) ((i20 >> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
                bArr2[3] = (byte) (i20 & com.anythink.basead.exoplayer.k.p.f8473b);
                interfaceC3543m1.f(cr2, 4, 2);
                this.f33844c0 += 4;
            }
            this.f33848e0 = true;
        }
        int i21 = i + cr.f24254c;
        String str2 = c3813r2.f33484c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (c3813r2.f33477W != null) {
                AbstractC2772Sd.H(cr.f24254c == 0);
                c3813r2.f33477W.a(k02);
            }
            while (true) {
                int i22 = this.f33842b0;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int B9 = cr.B();
                if (B9 > 0) {
                    d9 = Math.min(i23, B9);
                    interfaceC3543m1.a(d9, cr);
                } else {
                    d9 = interfaceC3543m1.d(k02, i23, false);
                }
                this.f33842b0 += d9;
                this.f33844c0 += d9;
            }
        } else {
            Cr cr5 = this.f33853h;
            byte[] bArr3 = cr5.f24252a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = c3813r2.f33487d0;
            int i25 = 4 - i24;
            while (this.f33842b0 < i21) {
                int i26 = this.f33846d0;
                if (i26 == 0) {
                    int min = Math.min(i24, cr.B());
                    k02.z(bArr3, i25 + min, i24 - min, false);
                    if (min > 0) {
                        cr.H(bArr3, i25, min);
                    }
                    this.f33842b0 += i24;
                    cr5.E(0);
                    this.f33846d0 = cr5.h();
                    Cr cr6 = this.f33851g;
                    cr6.E(0);
                    interfaceC3543m1.a(4, cr6);
                    this.f33844c0 += 4;
                } else {
                    int B10 = cr.B();
                    if (B10 > 0) {
                        d2 = Math.min(i26, B10);
                        interfaceC3543m1.a(d2, cr);
                    } else {
                        d2 = interfaceC3543m1.d(k02, i26, false);
                    }
                    this.f33842b0 += d2;
                    this.f33844c0 += d2;
                    this.f33846d0 -= d2;
                }
            }
        }
        if ("A_VORBIS".equals(c3813r2.f33484c)) {
            Cr cr7 = this.f33856j;
            cr7.E(0);
            interfaceC3543m1.a(4, cr7);
            this.f33844c0 += 4;
        }
        int i27 = this.f33844c0;
        q();
        return i27;
    }

    public final void q() {
        this.f33842b0 = 0;
        this.f33844c0 = 0;
        this.f33846d0 = 0;
        this.f33848e0 = false;
        this.f33850f0 = false;
        this.f33852g0 = false;
        this.f33854h0 = 0;
        this.f33855i0 = (byte) 0;
        this.f33857j0 = false;
        this.f33860l.y(0);
    }

    public final void r(K0 k02, byte[] bArr, int i) {
        int length = bArr.length;
        int i6 = length + i;
        Cr cr = this.f33862m;
        byte[] bArr2 = cr.f24252a;
        if (bArr2.length < i6) {
            byte[] copyOf = Arrays.copyOf(bArr, i6 + i);
            cr.z(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        k02.z(cr.f24252a, length, i, false);
        cr.E(0);
        cr.C(i6);
    }

    public C3867s2(C3598n2 c3598n2, int i, InterfaceC3814r3 interfaceC3814r3) {
        this.f33868s = -1L;
        this.f33869t = com.anythink.basead.exoplayer.b.f6382b;
        this.f33870u = com.anythink.basead.exoplayer.b.f6382b;
        this.f33871v = com.anythink.basead.exoplayer.b.f6382b;
        this.f33820F = com.anythink.basead.exoplayer.b.f6382b;
        this.f33821G = -1;
        this.f33822H = -1L;
        this.f33823I = -1L;
        this.J = -1;
        this.f33825L = -1L;
        this.f33826M = -1L;
        this.f33827N = com.anythink.basead.exoplayer.b.f6382b;
        this.f33861l0 = c3598n2;
        c3598n2.f32667d = new C3657o7(this);
        this.f33849f = interfaceC3814r3;
        this.f33818D = new SparseArray();
        this.f33845d = true;
        this.f33847e = (i & 2) == 0;
        this.f33839a = new C3921t2(0);
        this.f33843c = new LongSparseArray();
        this.f33841b = new SparseArray();
        this.i = new Cr(4);
        this.f33856j = new Cr(ByteBuffer.allocate(4).putInt(-1).array());
        this.f33858k = new Cr(4);
        this.f33851g = new Cr(SK.f27460r0);
        this.f33853h = new Cr(4);
        this.f33860l = new Cr();
        this.f33862m = new Cr();
        this.f33863n = new Cr(8);
        this.f33864o = new Cr();
        this.f33865p = new Cr();
        this.f33834U = new int[1];
        this.f33873x = true;
    }
}
