package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class Q2 implements Q0 {

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f27706N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: O, reason: collision with root package name */
    public static final DP f27707O;

    /* renamed from: A, reason: collision with root package name */
    public P2 f27708A;

    /* renamed from: B, reason: collision with root package name */
    public int f27709B;

    /* renamed from: C, reason: collision with root package name */
    public int f27710C;

    /* renamed from: D, reason: collision with root package name */
    public int f27711D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f27712E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f27713F;

    /* renamed from: G, reason: collision with root package name */
    public S0 f27714G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC3566m1[] f27715H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC3566m1[] f27716I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f27717K;

    /* renamed from: L, reason: collision with root package name */
    public long f27718L;

    /* renamed from: M, reason: collision with root package name */
    public long f27719M;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3837r3 f27720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27721b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27722c;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f27727h;
    public final Cr i;

    /* renamed from: n, reason: collision with root package name */
    public final C2749Pl f27732n;

    /* renamed from: o, reason: collision with root package name */
    public final C3717or f27733o;

    /* renamed from: p, reason: collision with root package name */
    public C3523lC f27734p;

    /* renamed from: q, reason: collision with root package name */
    public int f27735q;

    /* renamed from: r, reason: collision with root package name */
    public int f27736r;

    /* renamed from: s, reason: collision with root package name */
    public long f27737s;

    /* renamed from: t, reason: collision with root package name */
    public int f27738t;

    /* renamed from: u, reason: collision with root package name */
    public Cr f27739u;

    /* renamed from: v, reason: collision with root package name */
    public long f27740v;

    /* renamed from: w, reason: collision with root package name */
    public int f27741w;

    /* renamed from: x, reason: collision with root package name */
    public long f27742x;

    /* renamed from: y, reason: collision with root package name */
    public long f27743y;

    /* renamed from: z, reason: collision with root package name */
    public long f27744z;

    /* renamed from: j, reason: collision with root package name */
    public final C3067cm f27728j = new C3067cm(10);

    /* renamed from: k, reason: collision with root package name */
    public final Cr f27729k = new Cr(16);

    /* renamed from: e, reason: collision with root package name */
    public final Cr f27724e = new Cr(SK.m0);

    /* renamed from: f, reason: collision with root package name */
    public final Cr f27725f = new Cr(6);

    /* renamed from: g, reason: collision with root package name */
    public final Cr f27726g = new Cr();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f27730l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f27731m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f27723d = new SparseArray();

    static {
        C3322hP c3322hP = new C3322hP();
        c3322hP.e(com.anythink.basead.exoplayer.k.o.ai);
        f27707O = new DP(c3322hP);
    }

    public Q2(InterfaceC3837r3 interfaceC3837r3, int i, RB rb) {
        this.f27720a = interfaceC3837r3;
        this.f27721b = i;
        this.f27722c = Collections.unmodifiableList(rb);
        byte[] bArr = new byte[16];
        this.f27727h = bArr;
        this.i = new Cr(bArr);
        PB pb = RB.f27933u;
        this.f27734p = C3523lC.f32525x;
        this.f27743y = com.anythink.basead.exoplayer.b.f7168b;
        this.f27742x = com.anythink.basead.exoplayer.b.f7168b;
        this.f27744z = com.anythink.basead.exoplayer.b.f7168b;
        this.f27714G = S0.f28105g0;
        this.f27715H = new InterfaceC3566m1[0];
        this.f27716I = new InterfaceC3566m1[0];
        this.f27732n = new C2749Pl(new Ux(3, this));
        this.f27733o = new C3717or(3);
        this.f27718L = -1L;
        this.f27719M = -1L;
    }

    public static void i(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw U4.a(null, sb.toString());
    }

    public static void j(Cr cr, int i, C2978b3 c2978b3) {
        cr.E(i + 8);
        int b9 = cr.b();
        byte[] bArr = J2.f26400a;
        if ((b9 & 1) != 0) {
            throw U4.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z6 = (b9 & 2) != 0;
        int h3 = cr.h();
        if (h3 == 0) {
            Arrays.fill(c2978b3.f29987l, 0, c2978b3.f29981e, false);
            return;
        }
        int i4 = c2978b3.f29981e;
        if (h3 != i4) {
            throw U4.a(null, D.x.o(new StringBuilder(String.valueOf(h3).length() + 58 + String.valueOf(i4).length()), "Senc sample count ", h3, " is different from fragment sample count", i4));
        }
        Arrays.fill(c2978b3.f29987l, 0, h3, z6);
        int B3 = cr.B();
        Cr cr2 = c2978b3.f29989n;
        cr2.y(B3);
        c2978b3.f29986k = true;
        c2978b3.f29990o = true;
        cr.H(cr2.f24997a, 0, cr2.f24999c);
        cr2.E(0);
        c2978b3.f29990o = false;
    }

    public static Pair k(long j6, Cr cr) {
        long j9;
        long j10;
        Cr cr2 = cr;
        cr2.E(8);
        int a9 = J2.a(cr2.b());
        cr2.G(4);
        long P8 = cr2.P();
        if (a9 == 0) {
            j9 = cr2.P();
            j10 = cr2.P();
        } else {
            j9 = cr2.j();
            j10 = cr2.j();
        }
        long j11 = j10 + j6;
        long w3 = AbstractC3182eu.w(j9, 1000000L, P8, RoundingMode.DOWN);
        cr2.G(2);
        int L2 = cr2.L();
        int[] iArr = new int[L2];
        long[] jArr = new long[L2];
        long[] jArr2 = new long[L2];
        long[] jArr3 = new long[L2];
        long j12 = j11;
        long j13 = w3;
        int i = 0;
        while (i < L2) {
            int b9 = cr2.b();
            if ((Integer.MIN_VALUE & b9) != 0) {
                throw U4.a(null, "Unhandled indirect reference");
            }
            long P9 = cr2.P();
            iArr[i] = b9 & Integer.MAX_VALUE;
            jArr[i] = j12;
            jArr3[i] = j13;
            j9 += P9;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long w6 = AbstractC3182eu.w(j9, 1000000L, P8, RoundingMode.DOWN);
            jArr4[i] = w6 - jArr5[i];
            cr2.G(4);
            j12 += iArr[i];
            i++;
            L2 = L2;
            cr2 = cr;
            j13 = w6;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(w3), new J0(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EO l(ArrayList arrayList) {
        int i;
        UUID uuid;
        C3680o7 c3680o7;
        UUID uuid2;
        int size = arrayList.size();
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < size) {
            Zw zw = (Zw) arrayList.get(i4);
            if (zw.f31925b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = zw.f29750c.f24997a;
                Cr cr = new Cr(bArr);
                if (cr.f24999c >= 32) {
                    cr.E(0);
                    int B3 = cr.B();
                    int b9 = cr.b();
                    if (b9 != B3) {
                        AbstractC2991bG.y("PsshAtomUtil", D.x.o(new StringBuilder(String.valueOf(b9).length() + 52 + String.valueOf(B3).length()), "Advertised atom size (", b9, ") does not match buffer size: ", B3));
                    } else {
                        int b10 = cr.b();
                        if (b10 != 1886614376) {
                            com.IceFishing.LiveIceFishing.k.t(b10, "Atom type is not pssh: ", "PsshAtomUtil", new StringBuilder(String.valueOf(b10).length() + 23));
                        } else {
                            int a9 = J2.a(cr.b());
                            if (a9 > 1) {
                                com.IceFishing.LiveIceFishing.k.t(a9, "Unsupported pssh version: ", "PsshAtomUtil", new StringBuilder(String.valueOf(a9).length() + 26));
                            } else {
                                UUID uuid3 = new UUID(cr.d(), cr.d());
                                if (a9 == 1) {
                                    int h3 = cr.h();
                                    UUID[] uuidArr = new UUID[h3];
                                    int i6 = 0;
                                    while (i6 < h3) {
                                        uuidArr[i6] = new UUID(cr.d(), cr.d());
                                        i6++;
                                        i4 = i4;
                                    }
                                }
                                i = i4;
                                uuid = null;
                                int h9 = cr.h();
                                int B9 = cr.B();
                                if (h9 != B9) {
                                    AbstractC2991bG.y("PsshAtomUtil", D.x.o(new StringBuilder(String.valueOf(h9).length() + 49 + String.valueOf(B9).length()), "Atom data size (", h9, ") does not match the bytes left: ", B9));
                                    c3680o7 = null;
                                } else {
                                    cr.H(new byte[h9], 0, h9);
                                    c3680o7 = new C3680o7(4, uuid3);
                                }
                                uuid2 = c3680o7 != null ? uuid : (UUID) c3680o7.f33649u;
                                if (uuid2 != null) {
                                    AbstractC2991bG.y("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList2.add(new AO(uuid2, com.anythink.basead.exoplayer.k.o.f9234e, bArr));
                                }
                            }
                        }
                    }
                }
                i = i4;
                c3680o7 = null;
                uuid = null;
                if (c3680o7 != null) {
                }
                if (uuid2 != null) {
                }
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new EO(null, false, (AO[]) arrayList2.toArray(new AO[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x00e2, code lost:
    
        r2 = r42.f27735q;
        r4 = com.anythink.basead.exoplayer.k.o.i;
        r7 = r3.f27499a;
        r8 = r3.f27500b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00ed, code lost:
    
        if (r2 != 3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00f1, code lost:
    
        if (r3.f27511n != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00f3, code lost:
    
        r2 = r3.f27502d.f30202d[r3.f27504f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0102, code lost:
    
        r42.f27709B = r2;
        r2 = r3.f27502d.f30199a.f29608g.f25176o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0110, code lost:
    
        if (java.util.Objects.equals(r2, com.anythink.basead.exoplayer.k.o.f9237h) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0114, code lost:
    
        if ((r10 & 64) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0116, code lost:
    
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0126, code lost:
    
        r42.f27712E = !r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x012e, code lost:
    
        if (r3.f27504f >= r3.i) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0130, code lost:
    
        ((com.google.android.gms.internal.ads.K0) r0).a(r42.f27709B, false);
        r0 = r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x013c, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x013f, code lost:
    
        r2 = r8.f29989n;
        r0 = r0.f29783d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0143, code lost:
    
        if (r0 == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0145, code lost:
    
        r2.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0148, code lost:
    
        r0 = r3.f27504f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x014c, code lost:
    
        if (r8.f29986k == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0152, code lost:
    
        if (r8.f29987l[r0] == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0154, code lost:
    
        r2.G(r2.L() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0161, code lost:
    
        if (r3.c() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0163, code lost:
    
        r42.f27708A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0166, code lost:
    
        r42.f27735q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0169, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0174, code lost:
    
        if (r3.f27502d.f30199a.f29609h != r29) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0176, code lost:
    
        r42.f27709B -= 8;
        ((com.google.android.gms.internal.ads.K0) r0).a(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0193, code lost:
    
        if ("audio/ac4".equals(r3.f27502d.f30199a.f29608g.f25176o) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0195, code lost:
    
        r42.f27710C = r3.d(r42.f27709B, 7);
        com.google.android.gms.internal.ads.MA.z(r42.f27709B, r14);
        r7.a(7, r14);
        r2 = r42.f27710C + 7;
        r42.f27710C = r2;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01b6, code lost:
    
        r42.f27709B += r2;
        r42.f27735q = 4;
        r42.f27711D = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x01ad, code lost:
    
        r9 = 0;
        r2 = r3.d(r42.f27709B, 0);
        r42.f27710C = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0119, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x011f, code lost:
    
        if (java.util.Objects.equals(r2, com.anythink.basead.exoplayer.k.o.i) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0123, code lost:
    
        if ((r10 & 128) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00fc, code lost:
    
        r2 = r8.f29984h[r3.f27504f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01c0, code lost:
    
        r2 = r3.f27502d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01c4, code lost:
    
        if (r3.f27511n != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01c6, code lost:
    
        r9 = r2.f30204f[r3.f27504f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01d3, code lost:
    
        r2 = r2.f30199a;
        r8 = r2.f29611k;
        r2 = r2.f29608g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01d9, code lost:
    
        if (r8 == 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x01db, code lost:
    
        r11 = r42.f27725f;
        r12 = r11.f24997a;
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r13 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01eb, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01f1, code lost:
    
        if (r42.f27710C >= r42.f27709B) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01f3, code lost:
    
        r8 = r42.f27711D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01f5, code lost:
    
        if (r8 != 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01fa, code lost:
    
        if (r42.f27716I.length > 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01fe, code lost:
    
        if (r42.f27712E != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0201, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0218, code lost:
    
        r39 = r6;
        r17 = r3;
        ((com.google.android.gms.internal.ads.K0) r0).A(r12, r13, r16 + r8, false);
        r11.E(0);
        r6 = r11.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x022c, code lost:
    
        if (r6 < 0) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x022e, code lost:
    
        r42.f27711D = r6 - r8;
        r6 = r42.f27724e;
        r6.E(0);
        r7.a(4, r6);
        r42.f27710C += 4;
        r42.f27709B += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0247, code lost:
    
        if (r42.f27716I.length <= 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0249, code lost:
    
        if (r8 <= 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x024b, code lost:
    
        r3 = com.google.android.gms.internal.ads.SK.X(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x024f, code lost:
    
        if (r3 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0253, code lost:
    
        r6 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x025a, code lost:
    
        if (r6 == (-1662541442)) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x025f, code lost:
    
        if (r6 == 1331836730) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0264, code lost:
    
        if (r6 == 1331856911) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x026d, code lost:
    
        if (r3.equals("video/vvc") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x026f, code lost:
    
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0283, code lost:
    
        if (r3 == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0286, code lost:
    
        if (r3 == 1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x028a, code lost:
    
        if (r3 == r25) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0297, code lost:
    
        if (((r12[r26] & 248) >> 3) != 23) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x02b3, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x02b6, code lost:
    
        r42.f27713F = r3;
        r7.a(r8, r11);
        r42.f27710C += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02c0, code lost:
    
        if (r8 <= 0) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02c4, code lost:
    
        if (r42.f27712E != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02ca, code lost:
    
        if (com.google.android.gms.internal.ads.SK.G(r12, r8, r2) == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02cc, code lost:
    
        r42.f27712E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x02cf, code lost:
    
        r8 = r16;
        r3 = r17;
        r6 = r39;
        r25 = 2;
        r27 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x02a6, code lost:
    
        if (((r12[4] & 126) >> 1) != 39) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02b1, code lost:
    
        if ((r12[4] & 31) != r27) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0282, code lost:
    
        r3 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0276, code lost:
    
        if (r3.equals(com.anythink.basead.exoplayer.k.o.f9237h) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0278, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x027e, code lost:
    
        if (r3.equals(r4) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0280, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x02b5, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02e2, code lost:
    
        throw com.google.android.gms.internal.ads.U4.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0203, code lost:
    
        r8 = com.google.android.gms.internal.ads.SK.x(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0213, code lost:
    
        if ((r16 + r8) <= (r42.f27709B - r42.f27710C)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0216, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02e3, code lost:
    
        r17 = r3;
        r39 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02e9, code lost:
    
        if (r42.f27713F == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02eb, code lost:
    
        r3 = r42.f27726g;
        r3.y(r8);
        r44 = r4;
        ((com.google.android.gms.internal.ads.K0) r0).A(r3.f24997a, 0, r42.f27711D, false);
        r7.a(r42.f27711D, r3);
        r6 = r42.f27711D;
        r8 = com.google.android.gms.internal.ads.SK.b(r3.f24999c, r3.f24997a);
        r3.E(0);
        r3.C(r8);
        r8 = r2.f25178q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0315, code lost:
    
        if (r8 != (-1)) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0319, code lost:
    
        if (r15.f27642a == 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x031b, code lost:
    
        r15.j(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0326, code lost:
    
        r15.k(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0331, code lost:
    
        if ((r17.b() & 4) == 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0333, code lost:
    
        r15.l(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0341, code lost:
    
        r42.f27710C += r6;
        r42.f27711D -= r6;
        r4 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0321, code lost:
    
        if (r15.f27642a == r8) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0323, code lost:
    
        r15.j(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x033a, code lost:
    
        r44 = r4;
        r6 = r7.d(r0, r8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x034e, code lost:
    
        r39 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0393, code lost:
    
        r0 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0399, code lost:
    
        if (r42.f27712E != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x039b, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x039e, code lost:
    
        r35 = r0;
        r0 = r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x03a4, code lost:
    
        if (r0 == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x03a6, code lost:
    
        r38 = r0.f29782c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03ad, code lost:
    
        r33 = r9;
        r7.c(r33, r35, r42.f27709B, 0, r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03be, code lost:
    
        if (r39.isEmpty() != false) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x03c0, code lost:
    
        r0 = (com.google.android.gms.internal.ads.N2) r39.removeFirst();
        r2 = r42.f27741w;
        r8 = r0.f27176c;
        r42.f27741w = r2 - r8;
        r2 = r0.f27175b;
        r4 = r0.f27174a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x03d1, code lost:
    
        if (r2 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x03d3, code lost:
    
        r4 = r4 + r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x03d5, code lost:
    
        r5 = r4;
        r0 = r42.f27715H;
        r2 = r0.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03da, code lost:
    
        if (r11 >= r2) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03dc, code lost:
    
        r0[r11].c(r5, 1, r8, r42.f27741w, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03ec, code lost:
    
        if (r3.c() != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x03ee, code lost:
    
        r42.f27708A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x03f1, code lost:
    
        r42.f27735q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x03ab, code lost:
    
        r38 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0351, code lost:
    
        r39 = r6;
        r4 = r3.f27509l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0355, code lost:
    
        if (r4 != null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x035e, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC2991bG.n(r2.f25176o) == false) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0360, code lost:
    
        r2 = com.google.android.gms.internal.ads.AbstractC2991bG.P(r0, r42.f27709B, r3.f27510m);
        r3.f27510m = r2;
        r2.getClass();
        r5 = new com.google.android.gms.internal.ads.C3322hP(r2);
        r5.f31562r = r4.f25180s;
        r7.e(new com.google.android.gms.internal.ads.DP(r5));
        r3.f27509l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0381, code lost:
    
        r2 = r42.f27710C;
        r4 = r42.f27709B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0385, code lost:
    
        if (r2 >= r4) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0387, code lost:
    
        r42.f27710C += r7.d(r0, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x01cd, code lost:
    
        r9 = r8.i[r3.f27504f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x093c, code lost:
    
        throw com.google.android.gms.internal.ads.U4.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x093d  */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        long j6;
        long j9;
        long j10;
        long j11;
        String m9;
        long P8;
        String str;
        long j12;
        long j13;
        long j14;
        char c9;
        char c10;
        boolean z6;
        int i;
        int i4;
        int i6;
        long j15;
        long j16;
        long P9;
        int i9;
        int i10;
        R0 r03 = r02;
        while (true) {
            int i11 = this.f27735q;
            ArrayDeque arrayDeque = this.f27730l;
            SparseArray sparseArray = this.f27723d;
            C3717or c3717or = this.f27733o;
            int i12 = this.f27721b;
            boolean z9 = true;
            C2749Pl c2749Pl = this.f27732n;
            Cr cr = this.i;
            if (i11 != 0) {
                ArrayDeque arrayDeque2 = this.f27731m;
                if (i11 != 1) {
                    long j17 = Long.MAX_VALUE;
                    if (i11 != 2) {
                        char c11 = 2;
                        if (i11 == 5) {
                            cr.y(16);
                            K0 k02 = (K0) r02;
                            if (k02.A(cr.f24997a, 0, 16, true)) {
                                cr.E(0);
                                int b9 = cr.b();
                                int b10 = cr.b();
                                if (b9 == 16 && b10 == 1835430511) {
                                    cr.G(4);
                                    long P10 = cr.P();
                                    long j18 = k02.f26570v - P10;
                                    if (P10 <= 0 || P10 > 2147483647L || j18 < 0 || j18 < this.f27719M) {
                                        m(new V0(this.f27743y, this.f27719M), u02);
                                    } else {
                                        u02.f28641n = j18;
                                        this.f27735q = 6;
                                    }
                                } else {
                                    m(new V0(this.f27743y, this.f27719M), u02);
                                }
                            } else {
                                m(new V0(this.f27743y, this.f27719M), u02);
                            }
                            int i13 = this.f27735q;
                            if (i13 == 6 || i13 == 0) {
                                return 1;
                            }
                        } else if (i11 != 6) {
                            P2 p22 = this.f27708A;
                            if (p22 != null) {
                                c9 = 5;
                                c10 = 6;
                                z6 = true;
                                break;
                            }
                            int size = sparseArray.size();
                            c9 = 5;
                            c10 = 6;
                            P2 p23 = null;
                            int i14 = 0;
                            while (i14 < size) {
                                P2 p24 = (P2) sparseArray.valueAt(i14);
                                boolean z10 = z9;
                                boolean z11 = p24.f27511n;
                                if (z11 || p24.f27504f != p24.f27502d.f30200b) {
                                    C2978b3 c2978b3 = p24.f27500b;
                                    if (z11) {
                                        i = size;
                                        if (p24.f27506h == c2978b3.f29980d) {
                                        }
                                    } else {
                                        i = size;
                                    }
                                    long j19 = !z11 ? p24.f27502d.f30201c[p24.f27504f] : c2978b3.f29982f[p24.f27506h];
                                    if (j19 < j17) {
                                        p23 = p24;
                                        j17 = j19;
                                    }
                                } else {
                                    i = size;
                                }
                                i14++;
                                size = i;
                                z9 = z10;
                            }
                            z6 = z9;
                            if (p23 == null) {
                                int i15 = (int) (this.f27740v - ((K0) r03).f26571w);
                                if (i15 < 0) {
                                    throw U4.a(null, "Offset to end of mdat was negative.");
                                }
                                ((K0) r03).a(i15, false);
                                g();
                            } else {
                                int i16 = (int) ((!p23.f27511n ? p23.f27502d.f30201c[p23.f27504f] : p23.f27500b.f29982f[p23.f27506h]) - ((K0) r03).f26571w);
                                if (i16 < 0) {
                                    AbstractC2991bG.y("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i16 = 0;
                                }
                                ((K0) r03).a(i16, false);
                                this.f27708A = p23;
                                p22 = p23;
                            }
                        } else {
                            K0 k03 = (K0) r03;
                            long j20 = ((K0) r03).f26570v - k03.f26571w;
                            cr.y(8);
                            if (k03.E(cr.f24997a, 0, 8, true)) {
                                cr.E(0);
                                int b11 = cr.b();
                                if (cr.b() != 1835430497) {
                                    m(new V0(this.f27743y, this.f27719M), u02);
                                } else {
                                    int i17 = (int) j20;
                                    Cr cr2 = new Cr(i17);
                                    k03.A(cr2.f24997a, 0, i17, false);
                                    cr2.E(b11 == 1 ? 16 : 8);
                                    SparseArray sparseArray2 = new SparseArray();
                                    SparseArray sparseArray3 = new SparseArray();
                                    while (cr2.B() >= 8) {
                                        int i18 = cr2.f24998b;
                                        long P11 = cr2.P();
                                        int b12 = cr2.b();
                                        if (P11 == 1) {
                                            if (cr2.B() < 8) {
                                                break;
                                            }
                                            P11 = cr2.d();
                                        } else if (P11 == 0) {
                                            P11 = cr2.f24999c - i18;
                                        }
                                        int i19 = P11 == 1 ? 16 : 8;
                                        if (P11 < i19) {
                                            break;
                                        }
                                        long j21 = i18;
                                        int i20 = i19;
                                        if (P11 > cr2.f24999c - j21) {
                                            break;
                                        }
                                        if (b12 != 1952871009) {
                                            j15 = P11;
                                            j16 = j21;
                                        } else if (P11 < i20 + 16) {
                                            cr2.E((int) (j21 + P11));
                                        } else {
                                            int a9 = J2.a(cr2.b());
                                            int b13 = cr2.b();
                                            P2 p25 = (P2) sparseArray.get(b13);
                                            if (p25 == null) {
                                                cr2.E((int) (j21 + P11));
                                            } else {
                                                long j22 = p25.f27502d.f30199a.f29604c;
                                                int b14 = cr2.b();
                                                int i21 = b14 >> 4;
                                                int i22 = b14 >> 2;
                                                int i23 = b14 & 3;
                                                long P12 = cr2.P();
                                                int i24 = (i21 & 3) + 1;
                                                j15 = P11;
                                                int i25 = (i22 & 3) + 1;
                                                int i26 = i23 + 1;
                                                j16 = j21;
                                                if (((a9 == 1 ? 16L : 8L) + i24 + i25 + i26) * P12 > cr2.B()) {
                                                    cr2.E((int) (j16 + j15));
                                                } else {
                                                    int i27 = (int) P12;
                                                    long[] jArr = new long[i27];
                                                    long[] jArr2 = new long[i27];
                                                    int i28 = 0;
                                                    while (i28 < i27) {
                                                        if (a9 == 1) {
                                                            P9 = cr2.j();
                                                            i9 = i24;
                                                            i10 = 1;
                                                        } else {
                                                            P9 = cr2.P();
                                                            i9 = i24;
                                                            i10 = a9;
                                                        }
                                                        long j23 = i10 == 1 ? cr2.j() : cr2.P();
                                                        cr2.G(i9 + i25 + i26);
                                                        jArr[i28] = AbstractC3182eu.w(P9, 1000000L, j22, RoundingMode.DOWN);
                                                        jArr2[i28] = j23;
                                                        i28++;
                                                        i24 = i9;
                                                    }
                                                    sparseArray2.put(b13, jArr);
                                                    sparseArray3.put(b13, jArr2);
                                                }
                                            }
                                        }
                                        cr2.E((int) (j16 + j15));
                                    }
                                    if (sparseArray2.size() == 0) {
                                        m(new V0(this.f27743y, this.f27719M), u02);
                                    } else {
                                        int i29 = -1;
                                        int i30 = -1;
                                        for (int i31 = 0; i31 < sparseArray2.size(); i31++) {
                                            int keyAt = sparseArray2.keyAt(i31);
                                            P2 p26 = (P2) sparseArray.get(keyAt);
                                            if (p26 != null) {
                                                int i32 = p26.f27502d.f30199a.f29603b;
                                                if (i29 != -1) {
                                                    i6 = i29;
                                                } else if (i32 == 2) {
                                                    i29 = keyAt;
                                                } else {
                                                    i6 = -1;
                                                }
                                                if (i30 == -1) {
                                                    i30 = i32 == 1 ? keyAt : -1;
                                                }
                                                i29 = i6;
                                            }
                                        }
                                        if (i29 == -1) {
                                            if (i30 != -1) {
                                                i4 = i30;
                                                m(new O2(sparseArray2, sparseArray3, this.f27743y, this.f27719M, i4), u02);
                                            } else {
                                                i29 = sparseArray2.keyAt(0);
                                            }
                                        }
                                        i4 = i29;
                                        m(new O2(sparseArray2, sparseArray3, this.f27743y, this.f27719M, i4), u02);
                                    }
                                }
                            } else {
                                m(new V0(this.f27743y, this.f27719M), u02);
                            }
                            if (this.f27735q == 0) {
                                return 1;
                            }
                        }
                    } else {
                        int size2 = sparseArray.size();
                        P2 p27 = null;
                        for (int i33 = 0; i33 < size2; i33++) {
                            C2978b3 c2978b32 = ((P2) sparseArray.valueAt(i33)).f27500b;
                            if (c2978b32.f29990o) {
                                long j24 = c2978b32.f29979c;
                                if (j24 < j17) {
                                    p27 = (P2) sparseArray.valueAt(i33);
                                    j17 = j24;
                                }
                            }
                        }
                        if (p27 == null) {
                            this.f27735q = 3;
                        } else {
                            int i34 = (int) (j17 - ((K0) r02).f26571w);
                            if (i34 < 0) {
                                throw U4.a(null, "Offset to encryption data was negative.");
                            }
                            K0 k04 = (K0) r02;
                            k04.a(i34, false);
                            C2978b3 c2978b33 = p27.f27500b;
                            Cr cr3 = c2978b33.f29989n;
                            k04.A(cr3.f24997a, 0, cr3.f24999c, false);
                            cr3.E(0);
                            c2978b33.f29990o = false;
                        }
                    }
                } else {
                    long j25 = this.f27737s - this.f27738t;
                    Cr cr4 = this.f27739u;
                    int i35 = (int) j25;
                    if (cr4 != null) {
                        ((K0) r02).A(cr4.f24997a, 8, i35, false);
                        int i36 = this.f27736r;
                        Zw zw = new Zw(i36, cr4);
                        if (!arrayDeque.isEmpty()) {
                            ((Iw) arrayDeque.peek()).f26373d.add(zw);
                        } else if (i36 == 1936286840) {
                            Pair k9 = k(((K0) r02).f26571w, cr4);
                            c3717or.A((J0) k9.second);
                            this.f27744z = ((Long) k9.first).longValue();
                            if (!this.f27717K) {
                                this.f27714G.D(((LinkedHashMap) c3717or.f33740u).size() == 1 ? (InterfaceC3136e1) k9.second : c3717or.D());
                                this.J = true;
                            }
                        } else if (i36 == 1701671783 && this.f27715H.length != 0) {
                            cr4.E(8);
                            int a10 = J2.a(cr4.b());
                            if (a10 == 0) {
                                m9 = cr4.m();
                                m9.getClass();
                                String m10 = cr4.m();
                                m10.getClass();
                                long P13 = cr4.P();
                                long P14 = cr4.P();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long w3 = AbstractC3182eu.w(P14, 1000000L, P13, roundingMode);
                                long j26 = this.f27744z;
                                long j27 = j26 != com.anythink.basead.exoplayer.b.f7168b ? j26 + w3 : -9223372036854775807L;
                                long w6 = AbstractC3182eu.w(cr4.P(), 1000L, P13, roundingMode);
                                P8 = cr4.P();
                                str = m10;
                                j12 = j27;
                                j13 = w6;
                                j14 = w3;
                            } else if (a10 != 1) {
                                com.IceFishing.LiveIceFishing.k.t(a10, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor", new StringBuilder(String.valueOf(a10).length() + 35));
                            } else {
                                long P15 = cr4.P();
                                long j28 = cr4.j();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long w9 = AbstractC3182eu.w(j28, 1000000L, P15, roundingMode2);
                                long w10 = AbstractC3182eu.w(cr4.P(), 1000L, P15, roundingMode2);
                                long P16 = cr4.P();
                                m9 = cr4.m();
                                m9.getClass();
                                String m11 = cr4.m();
                                m11.getClass();
                                P8 = P16;
                                str = m11;
                                j13 = w10;
                                j14 = -9223372036854775807L;
                                j12 = w9;
                            }
                            byte[] bArr = new byte[cr4.B()];
                            cr4.H(bArr, 0, cr4.B());
                            C3067cm c3067cm = this.f27728j;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c3067cm.f30365u;
                            byteArrayOutputStream.reset();
                            try {
                                DataOutputStream dataOutputStream = (DataOutputStream) c3067cm.f30366v;
                                dataOutputStream.writeBytes(m9);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(str);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(j13);
                                dataOutputStream.writeLong(P8);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                Cr cr5 = new Cr(byteArrayOutputStream.toByteArray());
                                int B3 = cr5.B();
                                for (InterfaceC3566m1 interfaceC3566m1 : this.f27715H) {
                                    cr5.E(0);
                                    interfaceC3566m1.a(B3, cr5);
                                }
                                if (j12 == com.anythink.basead.exoplayer.b.f7168b) {
                                    arrayDeque2.addLast(new N2(B3, j14, true));
                                    this.f27741w += B3;
                                } else if (arrayDeque2.isEmpty()) {
                                    for (InterfaceC3566m1 interfaceC3566m12 : this.f27715H) {
                                        interfaceC3566m12.c(j12, 1, B3, 0, null);
                                    }
                                } else {
                                    arrayDeque2.addLast(new N2(B3, j12, false));
                                    this.f27741w += B3;
                                }
                            } catch (IOException e9) {
                                throw new RuntimeException(e9);
                            }
                        }
                    } else {
                        ((K0) r02).a(i35, false);
                    }
                    h(((K0) r02).f26571w);
                }
            } else {
                int i37 = this.f27738t;
                Cr cr6 = this.f27729k;
                if (i37 == 0) {
                    if (!((K0) r02).A(cr6.f24997a, 0, 8, true)) {
                        long j29 = this.f27718L;
                        if (j29 == -1) {
                            c2749Pl.l(0);
                            return -1;
                        }
                        u02.f28641n = j29;
                        this.f27718L = -1L;
                        this.f27714G.D(c3717or.D());
                        this.f27717K = true;
                        return 1;
                    }
                    this.f27738t = 8;
                    cr6.E(0);
                    this.f27737s = cr6.P();
                    this.f27736r = cr6.b();
                }
                long j30 = this.f27737s;
                if (j30 == 1) {
                    ((K0) r02).A(cr6.f24997a, 8, 8, false);
                    this.f27738t += 8;
                    this.f27737s = cr6.j();
                } else if (j30 == 0) {
                    long j31 = ((K0) r02).f26570v;
                    if (j31 == -1) {
                        j31 = !arrayDeque.isEmpty() ? ((Iw) arrayDeque.peek()).f26372c : -1L;
                    }
                    if (j31 != -1) {
                        j6 = -1;
                        this.f27737s = (j31 - ((K0) r02).f26571w) + this.f27738t;
                        j9 = this.f27737s;
                        int i38 = this.f27738t;
                        j10 = i38;
                        if (j9 < j10) {
                            j11 = j10;
                        } else {
                            if (this.f27736r != 1718773093 || i38 != 8) {
                                break;
                            }
                            this.f27737s = j10;
                            j9 = j10;
                            j11 = j9;
                        }
                        if (this.f27718L == j6) {
                            if (this.f27736r == 1936286840) {
                                cr.y((int) j9);
                                System.arraycopy(cr6.f24997a, 0, cr.f24997a, 0, 8);
                                ((K0) r02).A(cr.f24997a, 8, (int) (this.f27737s - this.f27738t), false);
                                c3717or.A((J0) k(((K0) r02).q(), cr).second);
                            } else {
                                ((K0) r02).a((int) (j9 - j11), true);
                            }
                            g();
                        } else {
                            long j32 = ((K0) r02).f26571w - j11;
                            int i39 = this.f27736r;
                            if ((i39 == 1836019558 || i39 == 1835295092) && !this.J) {
                                long j33 = ((K0) r02).f26570v;
                                if (j33 == j6 || this.f27719M != j6 || (i12 & 512) == 0) {
                                    this.f27714G.D(new V0(this.f27743y, j32));
                                    this.J = true;
                                } else {
                                    this.f27719M = j32;
                                    u02.f28641n = j33 - 16;
                                    this.f27735q = 5;
                                }
                            }
                            if (this.f27736r == 1836019558) {
                                int size3 = sparseArray.size();
                                for (int i40 = 0; i40 < size3; i40++) {
                                    C2978b3 c2978b34 = ((P2) sparseArray.valueAt(i40)).f27500b;
                                    c2978b34.f29979c = j32;
                                    c2978b34.f29978b = j32;
                                }
                            }
                            int i41 = this.f27736r;
                            if (i41 == 1835295092) {
                                this.f27708A = null;
                                this.f27740v = j32 + this.f27737s;
                                this.f27735q = 2;
                            } else if (i41 == 1836019574 || i41 == 1953653099 || i41 == 1835297121 || i41 == 1835626086 || i41 == 1937007212 || i41 == 1836019558 || i41 == 1953653094 || i41 == 1836475768 || i41 == 1701082227 || i41 == 1835365473) {
                                K0 k05 = (K0) r02;
                                long j34 = k05.f26571w;
                                long j35 = this.f27737s;
                                long j36 = j34 + j35;
                                if (j35 != this.f27738t && i41 == 1835365473) {
                                    cr.y(8);
                                    k05.E(cr.f24997a, 0, 8, false);
                                    J2.f(cr);
                                    k05.a(cr.f24998b, false);
                                    k05.f26573y = 0;
                                }
                                long j37 = j36 - 8;
                                arrayDeque.push(new Iw(this.f27736r, j37));
                                if (this.f27737s == this.f27738t) {
                                    h(j37);
                                } else {
                                    g();
                                }
                            } else if (i41 == 1751411826 || i41 == 1835296868 || i41 == 1836476516 || i41 == 1936286840 || i41 == 1937011556 || i41 == 1937011827 || i41 == 1668576371 || i41 == 1937011555 || i41 == 1937011578 || i41 == 1937013298 || i41 == 1937007471 || i41 == 1668232756 || i41 == 1937011571 || i41 == 1952867444 || i41 == 1952868452 || i41 == 1953196132 || i41 == 1953654136 || i41 == 1953658222 || i41 == 1886614376 || i41 == 1935763834 || i41 == 1935763823 || i41 == 1936027235 || i41 == 1970628964 || i41 == 1935828848 || i41 == 1936158820 || i41 == 1701606260 || i41 == 1835362404 || i41 == 1701671783 || i41 == 1969517665 || i41 == 1801812339 || i41 == 1768715124) {
                                if (this.f27738t != 8) {
                                    throw U4.c("Leaf atom defines extended atom size (unsupported).");
                                }
                                if (this.f27737s > 2147483647L) {
                                    throw U4.c("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                Cr cr7 = new Cr((int) this.f27737s);
                                System.arraycopy(cr6.f24997a, 0, cr7.f24997a, 0, 8);
                                this.f27739u = cr7;
                                this.f27735q = 1;
                            } else {
                                if (this.f27737s > 2147483647L) {
                                    throw U4.c("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                this.f27739u = null;
                                this.f27735q = 1;
                            }
                        }
                        if (this.f27735q == 5) {
                            return 1;
                        }
                    }
                }
                j6 = -1;
                j9 = this.f27737s;
                int i382 = this.f27738t;
                j10 = i382;
                if (j9 < j10) {
                }
                if (this.f27718L == j6) {
                }
                if (this.f27735q == 5) {
                }
            }
            r03 = r02;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        if ((this.f27721b & 32) == 0) {
            s02 = new com.bumptech.glide.manager.n(s02, this.f27720a);
        }
        this.f27714G = s02;
        g();
        InterfaceC3566m1[] interfaceC3566m1Arr = new InterfaceC3566m1[2];
        this.f27715H = interfaceC3566m1Arr;
        int i = 0;
        InterfaceC3566m1[] interfaceC3566m1Arr2 = (InterfaceC3566m1[]) AbstractC3182eu.o(interfaceC3566m1Arr, 0);
        this.f27715H = interfaceC3566m1Arr2;
        for (InterfaceC3566m1 interfaceC3566m1 : interfaceC3566m1Arr2) {
            interfaceC3566m1.e(f27707O);
        }
        List list = this.f27722c;
        this.f27716I = new InterfaceC3566m1[list.size()];
        int i4 = 100;
        while (i < this.f27716I.length) {
            int i6 = i4 + 1;
            InterfaceC3566m1 C8 = this.f27714G.C(i4, 3);
            C8.e((DP) list.get(i));
            this.f27716I[i] = C8;
            i++;
            i4 = i6;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        SparseArray sparseArray = this.f27723d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((P2) sparseArray.valueAt(i)).a();
        }
        this.f27731m.clear();
        this.f27741w = 0;
        ((PriorityQueue) this.f27732n.f27646e).clear();
        this.f27742x = j9;
        this.f27730l.clear();
        this.f27719M = -1L;
        g();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        C3523lC c3523lC;
        InterfaceC3352i1 u6 = AbstractC2659Kg.u(r02, true);
        if (u6 != null) {
            c3523lC = RB.j(u6);
        } else {
            PB pb = RB.f27933u;
            c3523lC = C3523lC.f32525x;
        }
        this.f27734p = c3523lC;
        return u6 == null;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final /* synthetic */ List f() {
        return this.f27734p;
    }

    public final void g() {
        this.f27735q = 0;
        this.f27738t = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:400:0x0867, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x086a, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0481  */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j6) {
        O3 o32;
        ArrayList arrayList;
        int i;
        String str;
        int i4;
        boolean z6;
        ?? r32;
        K2 k22;
        int i6;
        K2 k23;
        ArrayList arrayList2;
        int i9;
        int i10;
        ArrayList arrayList3;
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        boolean z9;
        int i15;
        int i16;
        int i17;
        int i18;
        P2 p22;
        ArrayList arrayList4;
        int i19;
        int i20;
        P2 p23;
        ArrayList arrayList5;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean[] zArr;
        int i25;
        int i26;
        K2 k24;
        int i27;
        P2 p24;
        Z2 z22;
        SC sc;
        int i28;
        while (true) {
            ArrayDeque arrayDeque = this.f27730l;
            if (arrayDeque.isEmpty() || ((Iw) arrayDeque.peek()).f26372c != j6) {
                break;
            }
            Iw iw = (Iw) arrayDeque.pop();
            int i29 = iw.f31925b;
            SparseArray sparseArray = this.f27723d;
            ArrayList arrayList6 = iw.f26373d;
            int i30 = 12;
            int i31 = 16;
            int i32 = 2;
            if (i29 == 1836019574) {
                EO l9 = l(arrayList6);
                Iw j9 = iw.j(1836475768);
                j9.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList7 = j9.f26373d;
                int size = arrayList7.size();
                long j10 = com.anythink.basead.exoplayer.b.f7168b;
                int i33 = 0;
                while (i33 < size) {
                    Zw zw = (Zw) arrayList7.get(i33);
                    int i34 = zw.f31925b;
                    Cr cr = zw.f29750c;
                    if (i34 == 1953654136) {
                        cr.E(i30);
                        Pair create = Pair.create(Integer.valueOf(cr.b()), new K2(cr.b() - 1, cr.b(), cr.b(), cr.b()));
                        sparseArray2.put(((Integer) create.first).intValue(), (K2) create.second);
                    } else if (i34 == 1835362404) {
                        cr.E(8);
                        j10 = J2.a(cr.b()) == 0 ? cr.P() : cr.j();
                    }
                    i33++;
                    i30 = 12;
                }
                int i35 = 0;
                Iw j11 = iw.j(1835365473);
                O3 e9 = j11 != null ? J2.e(j11) : null;
                Z0 z02 = new Z0();
                Zw i36 = iw.i(1969517665);
                if (i36 != null) {
                    o32 = J2.c(i36);
                    z02.a(o32);
                } else {
                    o32 = null;
                }
                Zw i37 = iw.i(1836476516);
                i37.getClass();
                O3 o33 = new O3(J2.d(i37.f29750c));
                long j12 = j10;
                boolean z10 = -1;
                ArrayList b9 = J2.b(iw, z02, j12, l9, false, false, new L2(i35));
                int size2 = b9.size();
                if (sparseArray.size() == 0) {
                    String g9 = AbstractC2792Sd.g(b9);
                    int i38 = 0;
                    while (i38 < size2) {
                        C3031c3 c3031c3 = (C3031c3) b9.get(i38);
                        Z2 z23 = c3031c3.f30199a;
                        if (z23.f29613m) {
                            S0 s02 = this.f27714G;
                            int i39 = z23.f29603b;
                            InterfaceC3566m1 C8 = s02.C(i38, i39);
                            C8.getClass();
                            DP dp = z23.f29608g;
                            dp.getClass();
                            i4 = i38;
                            C3322hP c3322hP = new C3322hP(dp);
                            c3322hP.d(g9);
                            str = g9;
                            if (i39 == 1) {
                                int i40 = z02.f29596a;
                                arrayList = b9;
                                r32 = -1;
                                r32 = -1;
                                r32 = -1;
                                i = size2;
                                if (i40 != -1 && (i6 = z02.f29597b) != -1) {
                                    c3322hP.f31541K = i40;
                                    c3322hP.f31542L = i6;
                                }
                            } else {
                                arrayList = b9;
                                i = size2;
                                r32 = -1;
                            }
                            SK.l(i39, e9, c3322hP, dp.f25173l, o32, o33);
                            int size3 = sparseArray2.size();
                            int i41 = z23.f29602a;
                            if (size3 == 1) {
                                k22 = (K2) sparseArray2.valueAt(0);
                            } else {
                                k22 = (K2) sparseArray2.get(i41);
                                k22.getClass();
                            }
                            sparseArray.put(i41, new P2(C8, c3031c3, k22, new DP(c3322hP)));
                            this.f27743y = Math.max(this.f27743y, z23.f29606e);
                            z6 = r32;
                        } else {
                            arrayList = b9;
                            i = size2;
                            str = g9;
                            i4 = i38;
                            z6 = z10;
                        }
                        i38 = i4 + 1;
                        z10 = z6;
                        size2 = i;
                        g9 = str;
                        b9 = arrayList;
                    }
                    this.f27714G.B();
                } else {
                    ArrayList arrayList8 = b9;
                    int i42 = 0;
                    int i43 = 0;
                    while (i42 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        if (((C3031c3) arrayList9.get(i42)).f30199a.f29613m) {
                            i43++;
                        }
                        i42++;
                        arrayList8 = arrayList9;
                    }
                    ArrayList arrayList10 = arrayList8;
                    AbstractC2792Sd.H(sparseArray.size() == i43);
                    for (int i44 = 0; i44 < size2; i44++) {
                        C3031c3 c3031c32 = (C3031c3) arrayList10.get(i44);
                        Z2 z24 = c3031c32.f30199a;
                        if (z24.f29613m) {
                            int i45 = z24.f29602a;
                            P2 p25 = (P2) sparseArray.get(i45);
                            if (sparseArray2.size() == 1) {
                                k23 = (K2) sparseArray2.valueAt(0);
                            } else {
                                k23 = (K2) sparseArray2.get(i45);
                                k23.getClass();
                            }
                            p25.f27502d = c3031c32;
                            p25.f27503e = k23;
                            if (p25.f27509l == null) {
                                p25.f27499a.e(p25.f27510m);
                            }
                            p25.a();
                        }
                    }
                }
            } else {
                int i46 = 4;
                if (i29 == 1836019558) {
                    ArrayList arrayList11 = iw.f26374e;
                    int size4 = arrayList11.size();
                    int i47 = 0;
                    while (i47 < size4) {
                        Iw iw2 = (Iw) arrayList11.get(i47);
                        if (iw2.f31925b == 1953653094) {
                            Zw i48 = iw2.i(1952868452);
                            i48.getClass();
                            Cr cr2 = i48.f29750c;
                            cr2.E(8);
                            int b10 = cr2.b();
                            byte[] bArr2 = J2.f26400a;
                            P2 p26 = (P2) sparseArray.get(cr2.b());
                            if (p26 == null) {
                                p26 = null;
                            } else {
                                int i49 = b10 & 1;
                                C2978b3 c2978b3 = p26.f27500b;
                                if (i49 != 0) {
                                    long j13 = cr2.j();
                                    c2978b3.f29978b = j13;
                                    c2978b3.f29979c = j13;
                                }
                                K2 k25 = p26.f27503e;
                                c2978b3.f29977a = new K2((b10 & 2) != 0 ? cr2.b() - 1 : k25.f26581a, (b10 & 8) != 0 ? cr2.b() : k25.f26582b, (b10 & 16) != 0 ? cr2.b() : k25.f26583c, (b10 & 32) != 0 ? cr2.b() : k25.f26584d);
                            }
                            if (p26 == null) {
                                arrayList2 = arrayList11;
                                i9 = size4;
                                i10 = i47;
                                arrayList3 = arrayList6;
                                i11 = i31;
                                i12 = i32;
                            } else {
                                C2978b3 c2978b32 = p26.f27500b;
                                long j14 = c2978b32.f29991p;
                                boolean z11 = c2978b32.f29992q;
                                p26.a();
                                p26.f27511n = true;
                                Zw i50 = iw2.i(1952867444);
                                if (i50 != null) {
                                    Cr cr3 = i50.f29750c;
                                    cr3.E(8);
                                    c2978b32.f29991p = J2.a(cr3.b()) == 1 ? cr3.j() : cr3.P();
                                    c2978b32.f29992q = true;
                                } else {
                                    c2978b32.f29991p = j14;
                                    c2978b32.f29992q = z11;
                                }
                                ArrayList arrayList12 = iw2.f26373d;
                                int size5 = arrayList12.size();
                                int i51 = 0;
                                int i52 = 0;
                                int i53 = 0;
                                while (true) {
                                    i13 = 1953658222;
                                    if (i51 >= size5) {
                                        break;
                                    }
                                    Zw zw2 = (Zw) arrayList12.get(i51);
                                    ArrayList arrayList13 = arrayList11;
                                    if (zw2.f31925b == 1953658222) {
                                        Cr cr4 = zw2.f29750c;
                                        cr4.E(12);
                                        int h3 = cr4.h();
                                        if (h3 > 0) {
                                            i53 += h3;
                                            i52++;
                                            i51++;
                                            arrayList11 = arrayList13;
                                        }
                                    }
                                    i51++;
                                    arrayList11 = arrayList13;
                                }
                                arrayList2 = arrayList11;
                                p26.f27506h = 0;
                                p26.f27505g = 0;
                                p26.f27504f = 0;
                                c2978b32.f29980d = i52;
                                c2978b32.f29981e = i53;
                                if (c2978b32.f29983g.length < i52) {
                                    c2978b32.f29982f = new long[i52];
                                    c2978b32.f29983g = new int[i52];
                                }
                                if (c2978b32.f29984h.length < i53) {
                                    int i54 = (i53 * 125) / 100;
                                    c2978b32.f29984h = new int[i54];
                                    c2978b32.i = new long[i54];
                                    c2978b32.f29985j = new boolean[i54];
                                    c2978b32.f29987l = new boolean[i54];
                                }
                                int i55 = 0;
                                int i56 = 0;
                                int i57 = 0;
                                while (true) {
                                    long j15 = 0;
                                    if (i55 >= size5) {
                                        break;
                                    }
                                    Zw zw3 = (Zw) arrayList12.get(i55);
                                    if (zw3.f31925b == i13) {
                                        int i58 = i56 + 1;
                                        Cr cr5 = zw3.f29750c;
                                        cr5.E(8);
                                        int b11 = cr5.b();
                                        i15 = i55;
                                        C3031c3 c3031c33 = p26.f27502d;
                                        i16 = size4;
                                        K2 k26 = c2978b32.f29977a;
                                        String str2 = AbstractC3182eu.f30782a;
                                        i17 = i47;
                                        c2978b32.f29983g[i56] = cr5.h();
                                        long[] jArr = c2978b32.f29982f;
                                        i18 = size5;
                                        int i59 = i56;
                                        long j16 = c2978b32.f29978b;
                                        jArr[i59] = j16;
                                        if ((b11 & 1) != 0) {
                                            jArr[i59] = j16 + cr5.b();
                                        }
                                        boolean z12 = (b11 & 4) != 0;
                                        int i60 = k26.f26584d;
                                        int b12 = z12 ? cr5.b() : i60;
                                        boolean z13 = z12;
                                        int i61 = b11 & 256;
                                        int i62 = b11 & 512;
                                        int i63 = b11 & 1024;
                                        int i64 = b11 & 2048;
                                        Z2 z25 = c3031c33.f30199a;
                                        SC sc2 = z25.i;
                                        if (sc2 != null) {
                                            i19 = i60;
                                            i20 = b12;
                                            if (sc2.f28138u == 1 && (sc = z25.f29610j) != null) {
                                                if (sc2.a(0) == 0) {
                                                    p23 = p26;
                                                    arrayList5 = arrayList6;
                                                    i21 = i57;
                                                } else {
                                                    long a9 = sc2.a(0);
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    arrayList5 = arrayList6;
                                                    i21 = i57;
                                                    long w3 = AbstractC3182eu.w(a9, 1000000L, z25.f29605d, roundingMode);
                                                    p23 = p26;
                                                    i28 = w3 + AbstractC3182eu.w(sc.a(0), 1000000L, z25.f29604c, roundingMode) >= z25.f29606e ? 0 : 0;
                                                    int[] iArr = c2978b32.f29984h;
                                                    long[] jArr2 = c2978b32.i;
                                                    boolean[] zArr2 = c2978b32.f29985j;
                                                    i57 = i21 + c2978b32.f29983g[i59];
                                                    int[] iArr2 = iArr;
                                                    long j17 = c2978b32.f29991p;
                                                    arrayList4 = arrayList5;
                                                    i22 = i21;
                                                    while (i22 < i57) {
                                                        if (i61 != 0) {
                                                            i23 = i22;
                                                            i24 = cr5.b();
                                                        } else {
                                                            i23 = i22;
                                                            i24 = k26.f26582b;
                                                        }
                                                        i(i24);
                                                        if (i62 != 0) {
                                                            zArr = zArr2;
                                                            i25 = cr5.b();
                                                        } else {
                                                            zArr = zArr2;
                                                            i25 = k26.f26583c;
                                                        }
                                                        i(i25);
                                                        if (i63 != 0) {
                                                            i26 = cr5.b();
                                                        } else {
                                                            if (i23 == 0) {
                                                                if (z13) {
                                                                    i26 = i20;
                                                                    i23 = 0;
                                                                } else {
                                                                    i23 = 0;
                                                                }
                                                            }
                                                            i26 = i19;
                                                        }
                                                        if (i64 != 0) {
                                                            k24 = k26;
                                                            i27 = cr5.b();
                                                        } else {
                                                            k24 = k26;
                                                            i27 = 0;
                                                        }
                                                        int i65 = i25;
                                                        int[] iArr3 = iArr2;
                                                        long w6 = AbstractC3182eu.w((i27 + j17) - j15, 1000000L, z25.f29604c, RoundingMode.DOWN);
                                                        jArr2[i23] = w6;
                                                        if (c2978b32.f29992q) {
                                                            p24 = p23;
                                                            z22 = z25;
                                                        } else {
                                                            p24 = p23;
                                                            z22 = z25;
                                                            jArr2[i23] = w6 + p24.f27502d.i;
                                                        }
                                                        iArr3[i23] = i65;
                                                        zArr[i23] = ((i26 >> 16) & 1) == 0;
                                                        j17 += i24;
                                                        i22 = i23 + 1;
                                                        z25 = z22;
                                                        zArr2 = zArr;
                                                        iArr2 = iArr3;
                                                        p23 = p24;
                                                        k26 = k24;
                                                    }
                                                    p22 = p23;
                                                    c2978b32.f29991p = j17;
                                                    i56 = i58;
                                                }
                                                j15 = sc.a(i28);
                                                int[] iArr4 = c2978b32.f29984h;
                                                long[] jArr22 = c2978b32.i;
                                                boolean[] zArr22 = c2978b32.f29985j;
                                                i57 = i21 + c2978b32.f29983g[i59];
                                                int[] iArr22 = iArr4;
                                                long j172 = c2978b32.f29991p;
                                                arrayList4 = arrayList5;
                                                i22 = i21;
                                                while (i22 < i57) {
                                                }
                                                p22 = p23;
                                                c2978b32.f29991p = j172;
                                                i56 = i58;
                                            }
                                        } else {
                                            i19 = i60;
                                            i20 = b12;
                                        }
                                        p23 = p26;
                                        arrayList5 = arrayList6;
                                        i21 = i57;
                                        int[] iArr42 = c2978b32.f29984h;
                                        long[] jArr222 = c2978b32.i;
                                        boolean[] zArr222 = c2978b32.f29985j;
                                        i57 = i21 + c2978b32.f29983g[i59];
                                        int[] iArr222 = iArr42;
                                        long j1722 = c2978b32.f29991p;
                                        arrayList4 = arrayList5;
                                        i22 = i21;
                                        while (i22 < i57) {
                                        }
                                        p22 = p23;
                                        c2978b32.f29991p = j1722;
                                        i56 = i58;
                                    } else {
                                        i15 = i55;
                                        i16 = size4;
                                        i17 = i47;
                                        i18 = size5;
                                        p22 = p26;
                                        arrayList4 = arrayList6;
                                    }
                                    i55 = i15 + 1;
                                    p26 = p22;
                                    size4 = i16;
                                    i47 = i17;
                                    size5 = i18;
                                    arrayList6 = arrayList4;
                                    i13 = 1953658222;
                                }
                                i9 = size4;
                                i10 = i47;
                                arrayList3 = arrayList6;
                                C3031c3 c3031c34 = p26.f27502d;
                                K2 k27 = c2978b32.f29977a;
                                k27.getClass();
                                C2924a3[] c2924a3Arr = c3031c34.f30199a.f29614n;
                                C2924a3 c2924a3 = c2924a3Arr == null ? null : c2924a3Arr[k27.f26581a];
                                Zw i66 = iw2.i(1935763834);
                                if (i66 != null) {
                                    c2924a3.getClass();
                                    Cr cr6 = i66.f29750c;
                                    cr6.E(8);
                                    if ((cr6.b() & 1) == 1) {
                                        cr6.G(8);
                                    }
                                    int K7 = cr6.K();
                                    int h9 = cr6.h();
                                    int i67 = c2978b32.f29981e;
                                    if (h9 > i67) {
                                        throw U4.a(null, D.x.o(new StringBuilder(String.valueOf(h9).length() + 56 + String.valueOf(i67).length()), "Saiz sample count ", h9, " is greater than fragment sample count", i67));
                                    }
                                    int i68 = c2924a3.f29783d;
                                    if (K7 == 0) {
                                        boolean[] zArr3 = c2978b32.f29987l;
                                        i14 = 0;
                                        for (int i69 = 0; i69 < h9; i69++) {
                                            int K8 = cr6.K();
                                            i14 += K8;
                                            zArr3[i69] = K8 > i68;
                                        }
                                        z9 = false;
                                    } else {
                                        boolean z14 = K7 > i68;
                                        i14 = K7 * h9;
                                        z9 = false;
                                        Arrays.fill(c2978b32.f29987l, 0, h9, z14);
                                    }
                                    Arrays.fill(c2978b32.f29987l, h9, c2978b32.f29981e, z9);
                                    if (i14 > 0) {
                                        c2978b32.f29989n.y(i14);
                                        c2978b32.f29986k = true;
                                        c2978b32.f29990o = true;
                                    }
                                }
                                Zw i70 = iw2.i(1935763823);
                                if (i70 != null) {
                                    Cr cr7 = i70.f29750c;
                                    cr7.E(8);
                                    int b13 = cr7.b();
                                    if ((b13 & 1) == 1) {
                                        cr7.G(8);
                                    }
                                    int h10 = cr7.h();
                                    if (h10 != 1) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(h10).length() + 29);
                                        sb.append("Unexpected saio entry count: ");
                                        sb.append(h10);
                                        throw U4.a(null, sb.toString());
                                    }
                                    c2978b32.f29979c += J2.a(b13) == 0 ? cr7.P() : cr7.j();
                                }
                                Zw i71 = iw2.i(1936027235);
                                if (i71 != null) {
                                    j(i71.f29750c, 0, c2978b32);
                                }
                                String str3 = c2924a3 != null ? c2924a3.f29781b : null;
                                Cr cr8 = null;
                                Cr cr9 = null;
                                for (int i72 = 0; i72 < arrayList12.size(); i72++) {
                                    Zw zw4 = (Zw) arrayList12.get(i72);
                                    Cr cr10 = zw4.f29750c;
                                    int i73 = zw4.f31925b;
                                    if (i73 == 1935828848) {
                                        cr10.E(12);
                                        if (cr10.b() == 1936025959) {
                                            cr8 = cr10;
                                        }
                                    } else if (i73 == 1936158820) {
                                        cr10.E(12);
                                        if (cr10.b() == 1936025959) {
                                            cr9 = cr10;
                                        }
                                    }
                                }
                                if (cr8 == null || cr9 == null) {
                                    i12 = i32;
                                } else {
                                    cr8.E(8);
                                    int a10 = J2.a(cr8.b());
                                    int i74 = i46;
                                    cr8.G(i74);
                                    if (a10 == 1) {
                                        cr8.G(i74);
                                    }
                                    if (cr8.b() != 1) {
                                        throw U4.c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    cr9.E(8);
                                    int a11 = J2.a(cr9.b());
                                    cr9.G(i74);
                                    if (a11 != 1) {
                                        i12 = i32;
                                        if (a11 >= i12) {
                                            cr9.G(i74);
                                        }
                                    } else {
                                        if (cr9.P() == 0) {
                                            throw U4.c("Variable length description in sgpd found (unsupported)");
                                        }
                                        i12 = i32;
                                    }
                                    if (cr9.P() != 1) {
                                        throw U4.c("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    cr9.G(1);
                                    int K9 = cr9.K();
                                    int i75 = (K9 & 240) >> 4;
                                    int i76 = K9 & 15;
                                    i46 = i74;
                                    if (cr9.K() == 1) {
                                        int K10 = cr9.K();
                                        int i77 = i31;
                                        byte[] bArr3 = new byte[i77];
                                        cr9.H(bArr3, 0, i77);
                                        if (K10 == 0) {
                                            int K11 = cr9.K();
                                            byte[] bArr4 = new byte[K11];
                                            cr9.H(bArr4, 0, K11);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        c2978b32.f29986k = true;
                                        c2978b32.f29988m = new C2924a3(true, str3, K10, bArr3, i75, i76, bArr);
                                    }
                                }
                                int size6 = arrayList12.size();
                                for (int i78 = 0; i78 < size6; i78++) {
                                    Zw zw5 = (Zw) arrayList12.get(i78);
                                    if (zw5.f31925b == 1970628964) {
                                        Cr cr11 = zw5.f29750c;
                                        cr11.E(8);
                                        byte[] bArr5 = this.f27727h;
                                        cr11.H(bArr5, 0, 16);
                                        if (Arrays.equals(bArr5, f27706N)) {
                                            j(cr11, 16, c2978b32);
                                        }
                                    }
                                }
                                i11 = 16;
                            }
                        } else {
                            arrayList2 = arrayList11;
                            i9 = size4;
                            i10 = i47;
                            arrayList3 = arrayList6;
                            i11 = i31;
                            i12 = i32;
                        }
                        i47 = i10 + 1;
                        i31 = i11;
                        i32 = i12;
                        arrayList11 = arrayList2;
                        size4 = i9;
                        arrayList6 = arrayList3;
                    }
                    EO l10 = l(arrayList6);
                    if (l10 != null) {
                        int size7 = sparseArray.size();
                        for (int i79 = 0; i79 < size7; i79++) {
                            P2 p27 = (P2) sparseArray.valueAt(i79);
                            C3031c3 c3031c35 = p27.f27502d;
                            K2 k28 = p27.f27500b.f29977a;
                            String str4 = AbstractC3182eu.f30782a;
                            int i80 = k28.f26581a;
                            C2924a3[] c2924a3Arr2 = c3031c35.f30199a.f29614n;
                            C2924a3 c2924a32 = c2924a3Arr2 == null ? null : c2924a3Arr2[i80];
                            EO a12 = l10.a(c2924a32 != null ? c2924a32.f29781b : null);
                            DP dp2 = p27.f27510m;
                            dp2.getClass();
                            C3322hP c3322hP2 = new C3322hP(dp2);
                            c3322hP2.f31562r = a12;
                            DP dp3 = new DP(c3322hP2);
                            if (p27.f27509l != null) {
                                p27.f27509l = dp3;
                            } else {
                                p27.f27499a.e(dp3);
                            }
                        }
                    }
                    if (this.f27742x != com.anythink.basead.exoplayer.b.f7168b) {
                        int size8 = sparseArray.size();
                        for (int i81 = 0; i81 < size8; i81++) {
                            P2 p28 = (P2) sparseArray.valueAt(i81);
                            long j18 = this.f27742x;
                            int i82 = p28.f27504f;
                            while (true) {
                                C2978b3 c2978b33 = p28.f27500b;
                                if (i82 < c2978b33.f29981e && c2978b33.i[i82] <= j18) {
                                    if (c2978b33.f29985j[i82]) {
                                        p28.i = i82;
                                    }
                                    i82++;
                                }
                            }
                        }
                        this.f27742x = com.anythink.basead.exoplayer.b.f7168b;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((Iw) arrayDeque.peek()).f26374e.add(iw);
                }
            }
        }
    }

    public final void m(InterfaceC3136e1 interfaceC3136e1, U0 u02) {
        this.f27714G.D(interfaceC3136e1);
        this.J = true;
        u02.f28641n = this.f27719M;
        g();
    }
}
