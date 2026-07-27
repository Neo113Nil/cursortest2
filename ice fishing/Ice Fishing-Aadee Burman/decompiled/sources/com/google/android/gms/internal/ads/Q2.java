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
    public static final byte[] f26919N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: O, reason: collision with root package name */
    public static final DP f26920O;

    /* renamed from: A, reason: collision with root package name */
    public P2 f26921A;

    /* renamed from: B, reason: collision with root package name */
    public int f26922B;

    /* renamed from: C, reason: collision with root package name */
    public int f26923C;

    /* renamed from: D, reason: collision with root package name */
    public int f26924D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f26925E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f26926F;

    /* renamed from: G, reason: collision with root package name */
    public S0 f26927G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC3543m1[] f26928H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC3543m1[] f26929I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f26930K;

    /* renamed from: L, reason: collision with root package name */
    public long f26931L;

    /* renamed from: M, reason: collision with root package name */
    public long f26932M;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3814r3 f26933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26934b;

    /* renamed from: c, reason: collision with root package name */
    public final List f26935c;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f26940h;
    public final Cr i;

    /* renamed from: n, reason: collision with root package name */
    public final C2712Ol f26945n;

    /* renamed from: o, reason: collision with root package name */
    public final C3694or f26946o;

    /* renamed from: p, reason: collision with root package name */
    public C3500lC f26947p;

    /* renamed from: q, reason: collision with root package name */
    public int f26948q;

    /* renamed from: r, reason: collision with root package name */
    public int f26949r;

    /* renamed from: s, reason: collision with root package name */
    public long f26950s;

    /* renamed from: t, reason: collision with root package name */
    public int f26951t;

    /* renamed from: u, reason: collision with root package name */
    public Cr f26952u;

    /* renamed from: v, reason: collision with root package name */
    public long f26953v;

    /* renamed from: w, reason: collision with root package name */
    public int f26954w;

    /* renamed from: x, reason: collision with root package name */
    public long f26955x;

    /* renamed from: y, reason: collision with root package name */
    public long f26956y;

    /* renamed from: z, reason: collision with root package name */
    public long f26957z;

    /* renamed from: j, reason: collision with root package name */
    public final C2991bm f26941j = new C2991bm(8);

    /* renamed from: k, reason: collision with root package name */
    public final Cr f26942k = new Cr(16);

    /* renamed from: e, reason: collision with root package name */
    public final Cr f26937e = new Cr(SK.f27460r0);

    /* renamed from: f, reason: collision with root package name */
    public final Cr f26938f = new Cr(6);

    /* renamed from: g, reason: collision with root package name */
    public final Cr f26939g = new Cr();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f26943l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f26944m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f26936d = new SparseArray();

    static {
        C3299hP c3299hP = new C3299hP();
        c3299hP.e(com.anythink.basead.exoplayer.k.o.ai);
        f26920O = new DP(c3299hP);
    }

    public Q2(InterfaceC3814r3 interfaceC3814r3, int i, RB rb) {
        this.f26933a = interfaceC3814r3;
        this.f26934b = i;
        this.f26935c = Collections.unmodifiableList(rb);
        byte[] bArr = new byte[16];
        this.f26940h = bArr;
        this.i = new Cr(bArr);
        PB pb = RB.f27177u;
        this.f26947p = C3500lC.f31745x;
        this.f26956y = com.anythink.basead.exoplayer.b.f6382b;
        this.f26955x = com.anythink.basead.exoplayer.b.f6382b;
        this.f26957z = com.anythink.basead.exoplayer.b.f6382b;
        this.f26927G = S0.f27391l0;
        this.f26928H = new InterfaceC3543m1[0];
        this.f26929I = new InterfaceC3543m1[0];
        this.f26945n = new C2712Ol(new Ux(3, this));
        this.f26946o = new C3694or(3);
        this.f26931L = -1L;
        this.f26932M = -1L;
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

    public static void j(Cr cr, int i, C2955b3 c2955b3) {
        cr.E(i + 8);
        int b9 = cr.b();
        byte[] bArr = J2.f25647a;
        if ((b9 & 1) != 0) {
            throw U4.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z3 = (b9 & 2) != 0;
        int h9 = cr.h();
        if (h9 == 0) {
            Arrays.fill(c2955b3.f29199l, 0, c2955b3.f29193e, false);
            return;
        }
        int i6 = c2955b3.f29193e;
        if (h9 != i6) {
            throw U4.a(null, D.y.r(new StringBuilder(String.valueOf(h9).length() + 58 + String.valueOf(i6).length()), "Senc sample count ", h9, " is different from fragment sample count", i6));
        }
        Arrays.fill(c2955b3.f29199l, 0, h9, z3);
        int B9 = cr.B();
        Cr cr2 = c2955b3.f29201n;
        cr2.y(B9);
        c2955b3.f29198k = true;
        c2955b3.f29202o = true;
        cr.H(cr2.f24252a, 0, cr2.f24254c);
        cr2.E(0);
        c2955b3.f29202o = false;
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
        long w6 = AbstractC3159eu.w(j9, 1000000L, P8, RoundingMode.DOWN);
        cr2.G(2);
        int L6 = cr2.L();
        int[] iArr = new int[L6];
        long[] jArr = new long[L6];
        long[] jArr2 = new long[L6];
        long[] jArr3 = new long[L6];
        long j12 = j11;
        long j13 = w6;
        int i = 0;
        while (i < L6) {
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
            long w9 = AbstractC3159eu.w(j9, 1000000L, P8, RoundingMode.DOWN);
            jArr4[i] = w9 - jArr5[i];
            cr2.G(4);
            j12 += iArr[i];
            i++;
            L6 = L6;
            cr2 = cr;
            j13 = w9;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(w6), new J0(iArr, jArr, jArr2, jArr3));
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
        C3657o7 c3657o7;
        UUID uuid2;
        int size = arrayList.size();
        int i6 = 0;
        ArrayList arrayList2 = null;
        while (i6 < size) {
            Zw zw = (Zw) arrayList.get(i6);
            if (zw.f31138b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = zw.f28980c.f24252a;
                Cr cr = new Cr(bArr);
                if (cr.f24254c >= 32) {
                    cr.E(0);
                    int B9 = cr.B();
                    int b9 = cr.b();
                    if (b9 != B9) {
                        AbstractC2968bG.y("PsshAtomUtil", D.y.r(new StringBuilder(String.valueOf(b9).length() + 52 + String.valueOf(B9).length()), "Advertised atom size (", b9, ") does not match buffer size: ", B9));
                    } else {
                        int b10 = cr.b();
                        if (b10 != 1886614376) {
                            com.anythink.basead.exoplayer.f.f.q(b10, "Atom type is not pssh: ", "PsshAtomUtil", new StringBuilder(String.valueOf(b10).length() + 23));
                        } else {
                            int a9 = J2.a(cr.b());
                            if (a9 > 1) {
                                com.anythink.basead.exoplayer.f.f.q(a9, "Unsupported pssh version: ", "PsshAtomUtil", new StringBuilder(String.valueOf(a9).length() + 26));
                            } else {
                                UUID uuid3 = new UUID(cr.d(), cr.d());
                                if (a9 == 1) {
                                    int h9 = cr.h();
                                    UUID[] uuidArr = new UUID[h9];
                                    int i9 = 0;
                                    while (i9 < h9) {
                                        uuidArr[i9] = new UUID(cr.d(), cr.d());
                                        i9++;
                                        i6 = i6;
                                    }
                                }
                                i = i6;
                                uuid = null;
                                int h10 = cr.h();
                                int B10 = cr.B();
                                if (h10 != B10) {
                                    AbstractC2968bG.y("PsshAtomUtil", D.y.r(new StringBuilder(String.valueOf(h10).length() + 49 + String.valueOf(B10).length()), "Atom data size (", h10, ") does not match the bytes left: ", B10));
                                    c3657o7 = null;
                                } else {
                                    cr.H(new byte[h10], 0, h10);
                                    c3657o7 = new C3657o7(4, uuid3);
                                }
                                uuid2 = c3657o7 != null ? uuid : (UUID) c3657o7.f32862u;
                                if (uuid2 != null) {
                                    AbstractC2968bG.y("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList2.add(new AO(uuid2, com.anythink.basead.exoplayer.k.o.f8448e, bArr));
                                }
                            }
                        }
                    }
                }
                i = i6;
                c3657o7 = null;
                uuid = null;
                if (c3657o7 != null) {
                }
                if (uuid2 != null) {
                }
            } else {
                i = i6;
            }
            i6 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new EO(null, false, (AO[]) arrayList2.toArray(new AO[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x00e2, code lost:
    
        r2 = r42.f26948q;
        r4 = com.anythink.basead.exoplayer.k.o.i;
        r7 = r3.f26716a;
        r8 = r3.f26717b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00ed, code lost:
    
        if (r2 != 3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00f1, code lost:
    
        if (r3.f26728n != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00f3, code lost:
    
        r2 = r3.f26719d.f29419d[r3.f26721f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0102, code lost:
    
        r42.f26922B = r2;
        r2 = r3.f26719d.f29416a.f28828g.f24431o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0110, code lost:
    
        if (java.util.Objects.equals(r2, com.anythink.basead.exoplayer.k.o.f8451h) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0114, code lost:
    
        if ((r10 & 64) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0116, code lost:
    
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0126, code lost:
    
        r42.f26925E = !r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x012e, code lost:
    
        if (r3.f26721f >= r3.i) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0130, code lost:
    
        ((com.google.android.gms.internal.ads.K0) r0).a(r42.f26922B, false);
        r0 = r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x013c, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x013f, code lost:
    
        r2 = r8.f29201n;
        r0 = r0.f29013d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0143, code lost:
    
        if (r0 == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0145, code lost:
    
        r2.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0148, code lost:
    
        r0 = r3.f26721f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x014c, code lost:
    
        if (r8.f29198k == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0152, code lost:
    
        if (r8.f29199l[r0] == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0154, code lost:
    
        r2.G(r2.L() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0161, code lost:
    
        if (r3.c() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0163, code lost:
    
        r42.f26921A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0166, code lost:
    
        r42.f26948q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0169, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0174, code lost:
    
        if (r3.f26719d.f29416a.f28829h != r29) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0176, code lost:
    
        r42.f26922B -= 8;
        ((com.google.android.gms.internal.ads.K0) r0).a(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0193, code lost:
    
        if ("audio/ac4".equals(r3.f26719d.f29416a.f28828g.f24431o) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0195, code lost:
    
        r42.f26923C = r3.d(r42.f26922B, 7);
        com.google.android.gms.internal.ads.MA.z(r42.f26922B, r14);
        r7.a(7, r14);
        r2 = r42.f26923C + 7;
        r42.f26923C = r2;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01b6, code lost:
    
        r42.f26922B += r2;
        r42.f26948q = 4;
        r42.f26924D = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x01ad, code lost:
    
        r9 = 0;
        r2 = r3.d(r42.f26922B, 0);
        r42.f26923C = r2;
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
    
        r2 = r8.f29196h[r3.f26721f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01c0, code lost:
    
        r2 = r3.f26719d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01c4, code lost:
    
        if (r3.f26728n != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01c6, code lost:
    
        r9 = r2.f29421f[r3.f26721f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01d3, code lost:
    
        r2 = r2.f29416a;
        r8 = r2.f28831k;
        r2 = r2.f28828g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01d9, code lost:
    
        if (r8 == 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x01db, code lost:
    
        r11 = r42.f26938f;
        r12 = r11.f24252a;
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r13 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01eb, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01f1, code lost:
    
        if (r42.f26923C >= r42.f26922B) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01f3, code lost:
    
        r8 = r42.f26924D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01f5, code lost:
    
        if (r8 != 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01fa, code lost:
    
        if (r42.f26929I.length > 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01fe, code lost:
    
        if (r42.f26925E != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0201, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0218, code lost:
    
        r39 = r6;
        r17 = r3;
        ((com.google.android.gms.internal.ads.K0) r0).z(r12, r13, r16 + r8, false);
        r11.E(0);
        r6 = r11.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x022c, code lost:
    
        if (r6 < 0) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x022e, code lost:
    
        r42.f26924D = r6 - r8;
        r6 = r42.f26937e;
        r6.E(0);
        r7.a(4, r6);
        r42.f26923C += 4;
        r42.f26922B += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0247, code lost:
    
        if (r42.f26929I.length <= 0) goto L156;
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
    
        r42.f26926F = r3;
        r7.a(r8, r11);
        r42.f26923C += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02c0, code lost:
    
        if (r8 <= 0) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02c4, code lost:
    
        if (r42.f26925E != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02ca, code lost:
    
        if (com.google.android.gms.internal.ads.SK.G(r12, r8, r2) == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02cc, code lost:
    
        r42.f26925E = true;
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
    
        if (r3.equals(com.anythink.basead.exoplayer.k.o.f8451h) == false) goto L140;
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
    
        if ((r16 + r8) <= (r42.f26922B - r42.f26923C)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0216, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02e3, code lost:
    
        r17 = r3;
        r39 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02e9, code lost:
    
        if (r42.f26926F == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02eb, code lost:
    
        r3 = r42.f26939g;
        r3.y(r8);
        r44 = r4;
        ((com.google.android.gms.internal.ads.K0) r0).z(r3.f24252a, 0, r42.f26924D, false);
        r7.a(r42.f26924D, r3);
        r6 = r42.f26924D;
        r8 = com.google.android.gms.internal.ads.SK.b(r3.f24254c, r3.f24252a);
        r3.E(0);
        r3.C(r8);
        r8 = r2.f24433q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0315, code lost:
    
        if (r8 != (-1)) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0319, code lost:
    
        if (r15.f26650a == 0) goto L177;
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
    
        r42.f26923C += r6;
        r42.f26924D -= r6;
        r4 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0321, code lost:
    
        if (r15.f26650a == r8) goto L177;
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
    
        if (r42.f26925E != false) goto L196;
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
    
        r38 = r0.f29012c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03ad, code lost:
    
        r33 = r9;
        r7.c(r33, r35, r42.f26922B, 0, r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03be, code lost:
    
        if (r39.isEmpty() != false) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x03c0, code lost:
    
        r0 = (com.google.android.gms.internal.ads.N2) r39.removeFirst();
        r2 = r42.f26954w;
        r8 = r0.f26391c;
        r42.f26954w = r2 - r8;
        r2 = r0.f26390b;
        r4 = r0.f26389a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x03d1, code lost:
    
        if (r2 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x03d3, code lost:
    
        r4 = r4 + r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x03d5, code lost:
    
        r5 = r4;
        r0 = r42.f26928H;
        r2 = r0.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03da, code lost:
    
        if (r11 >= r2) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03dc, code lost:
    
        r0[r11].c(r5, 1, r8, r42.f26954w, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03ec, code lost:
    
        if (r3.c() != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x03ee, code lost:
    
        r42.f26921A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x03f1, code lost:
    
        r42.f26948q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x03ab, code lost:
    
        r38 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0351, code lost:
    
        r39 = r6;
        r4 = r3.f26726l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0355, code lost:
    
        if (r4 != null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x035e, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC2968bG.n(r2.f24431o) == false) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0360, code lost:
    
        r2 = com.google.android.gms.internal.ads.AbstractC2968bG.P(r0, r42.f26922B, r3.f26727m);
        r3.f26727m = r2;
        r2.getClass();
        r5 = new com.google.android.gms.internal.ads.C3299hP(r2);
        r5.f30796r = r4.f24435s;
        r7.e(new com.google.android.gms.internal.ads.DP(r5));
        r3.f26726l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0381, code lost:
    
        r2 = r42.f26923C;
        r4 = r42.f26922B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0385, code lost:
    
        if (r2 >= r4) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0387, code lost:
    
        r42.f26923C += r7.d(r0, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x01cd, code lost:
    
        r9 = r8.i[r3.f26721f];
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
        String m4;
        long P8;
        String str;
        long j12;
        long j13;
        long j14;
        char c9;
        char c10;
        boolean z3;
        int i;
        int i6;
        int i9;
        long j15;
        long j16;
        long P9;
        int i10;
        int i11;
        R0 r03 = r02;
        while (true) {
            int i12 = this.f26948q;
            ArrayDeque arrayDeque = this.f26943l;
            SparseArray sparseArray = this.f26936d;
            C3694or c3694or = this.f26946o;
            int i13 = this.f26934b;
            boolean z6 = true;
            C2712Ol c2712Ol = this.f26945n;
            Cr cr = this.i;
            if (i12 != 0) {
                ArrayDeque arrayDeque2 = this.f26944m;
                if (i12 != 1) {
                    long j17 = Long.MAX_VALUE;
                    if (i12 != 2) {
                        char c11 = 2;
                        if (i12 == 5) {
                            cr.y(16);
                            K0 k02 = (K0) r02;
                            if (k02.z(cr.f24252a, 0, 16, true)) {
                                cr.E(0);
                                int b9 = cr.b();
                                int b10 = cr.b();
                                if (b9 == 16 && b10 == 1835430511) {
                                    cr.G(4);
                                    long P10 = cr.P();
                                    long j18 = k02.f25818v - P10;
                                    if (P10 <= 0 || P10 > 2147483647L || j18 < 0 || j18 < this.f26932M) {
                                        m(new V0(this.f26956y, this.f26932M), u02);
                                    } else {
                                        u02.f27844n = j18;
                                        this.f26948q = 6;
                                    }
                                } else {
                                    m(new V0(this.f26956y, this.f26932M), u02);
                                }
                            } else {
                                m(new V0(this.f26956y, this.f26932M), u02);
                            }
                            int i14 = this.f26948q;
                            if (i14 == 6 || i14 == 0) {
                                return 1;
                            }
                        } else if (i12 != 6) {
                            P2 p22 = this.f26921A;
                            if (p22 != null) {
                                c9 = 5;
                                c10 = 6;
                                z3 = true;
                                break;
                            }
                            int size = sparseArray.size();
                            c9 = 5;
                            c10 = 6;
                            P2 p23 = null;
                            int i15 = 0;
                            while (i15 < size) {
                                P2 p24 = (P2) sparseArray.valueAt(i15);
                                boolean z9 = z6;
                                boolean z10 = p24.f26728n;
                                if (z10 || p24.f26721f != p24.f26719d.f29417b) {
                                    C2955b3 c2955b3 = p24.f26717b;
                                    if (z10) {
                                        i = size;
                                        if (p24.f26723h == c2955b3.f29192d) {
                                        }
                                    } else {
                                        i = size;
                                    }
                                    long j19 = !z10 ? p24.f26719d.f29418c[p24.f26721f] : c2955b3.f29194f[p24.f26723h];
                                    if (j19 < j17) {
                                        p23 = p24;
                                        j17 = j19;
                                    }
                                } else {
                                    i = size;
                                }
                                i15++;
                                size = i;
                                z6 = z9;
                            }
                            z3 = z6;
                            if (p23 == null) {
                                int i16 = (int) (this.f26953v - ((K0) r03).f25819w);
                                if (i16 < 0) {
                                    throw U4.a(null, "Offset to end of mdat was negative.");
                                }
                                ((K0) r03).a(i16, false);
                                g();
                            } else {
                                int i17 = (int) ((!p23.f26728n ? p23.f26719d.f29418c[p23.f26721f] : p23.f26717b.f29194f[p23.f26723h]) - ((K0) r03).f25819w);
                                if (i17 < 0) {
                                    AbstractC2968bG.y("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i17 = 0;
                                }
                                ((K0) r03).a(i17, false);
                                this.f26921A = p23;
                                p22 = p23;
                            }
                        } else {
                            K0 k03 = (K0) r03;
                            long j20 = ((K0) r03).f25818v - k03.f25819w;
                            cr.y(8);
                            if (k03.A(cr.f24252a, 0, 8, true)) {
                                cr.E(0);
                                int b11 = cr.b();
                                if (cr.b() != 1835430497) {
                                    m(new V0(this.f26956y, this.f26932M), u02);
                                } else {
                                    int i18 = (int) j20;
                                    Cr cr2 = new Cr(i18);
                                    k03.z(cr2.f24252a, 0, i18, false);
                                    cr2.E(b11 == 1 ? 16 : 8);
                                    SparseArray sparseArray2 = new SparseArray();
                                    SparseArray sparseArray3 = new SparseArray();
                                    while (cr2.B() >= 8) {
                                        int i19 = cr2.f24253b;
                                        long P11 = cr2.P();
                                        int b12 = cr2.b();
                                        if (P11 == 1) {
                                            if (cr2.B() < 8) {
                                                break;
                                            }
                                            P11 = cr2.d();
                                        } else if (P11 == 0) {
                                            P11 = cr2.f24254c - i19;
                                        }
                                        int i20 = P11 == 1 ? 16 : 8;
                                        if (P11 < i20) {
                                            break;
                                        }
                                        long j21 = i19;
                                        int i21 = i20;
                                        if (P11 > cr2.f24254c - j21) {
                                            break;
                                        }
                                        if (b12 != 1952871009) {
                                            j15 = P11;
                                            j16 = j21;
                                        } else if (P11 < i21 + 16) {
                                            cr2.E((int) (j21 + P11));
                                        } else {
                                            int a9 = J2.a(cr2.b());
                                            int b13 = cr2.b();
                                            P2 p25 = (P2) sparseArray.get(b13);
                                            if (p25 == null) {
                                                cr2.E((int) (j21 + P11));
                                            } else {
                                                long j22 = p25.f26719d.f29416a.f28824c;
                                                int b14 = cr2.b();
                                                int i22 = b14 >> 4;
                                                int i23 = b14 >> 2;
                                                int i24 = b14 & 3;
                                                long P12 = cr2.P();
                                                int i25 = (i22 & 3) + 1;
                                                j15 = P11;
                                                int i26 = (i23 & 3) + 1;
                                                int i27 = i24 + 1;
                                                j16 = j21;
                                                if (((a9 == 1 ? 16L : 8L) + i25 + i26 + i27) * P12 > cr2.B()) {
                                                    cr2.E((int) (j16 + j15));
                                                } else {
                                                    int i28 = (int) P12;
                                                    long[] jArr = new long[i28];
                                                    long[] jArr2 = new long[i28];
                                                    int i29 = 0;
                                                    while (i29 < i28) {
                                                        if (a9 == 1) {
                                                            P9 = cr2.j();
                                                            i10 = i25;
                                                            i11 = 1;
                                                        } else {
                                                            P9 = cr2.P();
                                                            i10 = i25;
                                                            i11 = a9;
                                                        }
                                                        long j23 = i11 == 1 ? cr2.j() : cr2.P();
                                                        cr2.G(i10 + i26 + i27);
                                                        jArr[i29] = AbstractC3159eu.w(P9, 1000000L, j22, RoundingMode.DOWN);
                                                        jArr2[i29] = j23;
                                                        i29++;
                                                        i25 = i10;
                                                    }
                                                    sparseArray2.put(b13, jArr);
                                                    sparseArray3.put(b13, jArr2);
                                                }
                                            }
                                        }
                                        cr2.E((int) (j16 + j15));
                                    }
                                    if (sparseArray2.size() == 0) {
                                        m(new V0(this.f26956y, this.f26932M), u02);
                                    } else {
                                        int i30 = -1;
                                        int i31 = -1;
                                        for (int i32 = 0; i32 < sparseArray2.size(); i32++) {
                                            int keyAt = sparseArray2.keyAt(i32);
                                            P2 p26 = (P2) sparseArray.get(keyAt);
                                            if (p26 != null) {
                                                int i33 = p26.f26719d.f29416a.f28823b;
                                                if (i30 != -1) {
                                                    i9 = i30;
                                                } else if (i33 == 2) {
                                                    i30 = keyAt;
                                                } else {
                                                    i9 = -1;
                                                }
                                                if (i31 == -1) {
                                                    i31 = i33 == 1 ? keyAt : -1;
                                                }
                                                i30 = i9;
                                            }
                                        }
                                        if (i30 == -1) {
                                            if (i31 != -1) {
                                                i6 = i31;
                                                m(new O2(sparseArray2, sparseArray3, this.f26956y, this.f26932M, i6), u02);
                                            } else {
                                                i30 = sparseArray2.keyAt(0);
                                            }
                                        }
                                        i6 = i30;
                                        m(new O2(sparseArray2, sparseArray3, this.f26956y, this.f26932M, i6), u02);
                                    }
                                }
                            } else {
                                m(new V0(this.f26956y, this.f26932M), u02);
                            }
                            if (this.f26948q == 0) {
                                return 1;
                            }
                        }
                    } else {
                        int size2 = sparseArray.size();
                        P2 p27 = null;
                        for (int i34 = 0; i34 < size2; i34++) {
                            C2955b3 c2955b32 = ((P2) sparseArray.valueAt(i34)).f26717b;
                            if (c2955b32.f29202o) {
                                long j24 = c2955b32.f29191c;
                                if (j24 < j17) {
                                    p27 = (P2) sparseArray.valueAt(i34);
                                    j17 = j24;
                                }
                            }
                        }
                        if (p27 == null) {
                            this.f26948q = 3;
                        } else {
                            int i35 = (int) (j17 - ((K0) r02).f25819w);
                            if (i35 < 0) {
                                throw U4.a(null, "Offset to encryption data was negative.");
                            }
                            K0 k04 = (K0) r02;
                            k04.a(i35, false);
                            C2955b3 c2955b33 = p27.f26717b;
                            Cr cr3 = c2955b33.f29201n;
                            k04.z(cr3.f24252a, 0, cr3.f24254c, false);
                            cr3.E(0);
                            c2955b33.f29202o = false;
                        }
                    }
                } else {
                    long j25 = this.f26950s - this.f26951t;
                    Cr cr4 = this.f26952u;
                    int i36 = (int) j25;
                    if (cr4 != null) {
                        ((K0) r02).z(cr4.f24252a, 8, i36, false);
                        int i37 = this.f26949r;
                        Zw zw = new Zw(i37, cr4);
                        if (!arrayDeque.isEmpty()) {
                            ((Iw) arrayDeque.peek()).f25620d.add(zw);
                        } else if (i37 == 1936286840) {
                            Pair k9 = k(((K0) r02).f25819w, cr4);
                            c3694or.A((J0) k9.second);
                            this.f26957z = ((Long) k9.first).longValue();
                            if (!this.f26930K) {
                                this.f26927G.D(((LinkedHashMap) c3694or.f32954u).size() == 1 ? (InterfaceC3113e1) k9.second : c3694or.D());
                                this.J = true;
                            }
                        } else if (i37 == 1701671783 && this.f26928H.length != 0) {
                            cr4.E(8);
                            int a10 = J2.a(cr4.b());
                            if (a10 == 0) {
                                m4 = cr4.m();
                                m4.getClass();
                                String m9 = cr4.m();
                                m9.getClass();
                                long P13 = cr4.P();
                                long P14 = cr4.P();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long w6 = AbstractC3159eu.w(P14, 1000000L, P13, roundingMode);
                                long j26 = this.f26957z;
                                long j27 = j26 != com.anythink.basead.exoplayer.b.f6382b ? j26 + w6 : -9223372036854775807L;
                                long w9 = AbstractC3159eu.w(cr4.P(), 1000L, P13, roundingMode);
                                P8 = cr4.P();
                                str = m9;
                                j12 = j27;
                                j13 = w9;
                                j14 = w6;
                            } else if (a10 != 1) {
                                com.anythink.basead.exoplayer.f.f.q(a10, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor", new StringBuilder(String.valueOf(a10).length() + 35));
                            } else {
                                long P15 = cr4.P();
                                long j28 = cr4.j();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long w10 = AbstractC3159eu.w(j28, 1000000L, P15, roundingMode2);
                                long w11 = AbstractC3159eu.w(cr4.P(), 1000L, P15, roundingMode2);
                                long P16 = cr4.P();
                                m4 = cr4.m();
                                m4.getClass();
                                String m10 = cr4.m();
                                m10.getClass();
                                P8 = P16;
                                str = m10;
                                j13 = w11;
                                j14 = -9223372036854775807L;
                                j12 = w10;
                            }
                            byte[] bArr = new byte[cr4.B()];
                            cr4.H(bArr, 0, cr4.B());
                            C2991bm c2991bm = this.f26941j;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c2991bm.f29323u;
                            byteArrayOutputStream.reset();
                            try {
                                DataOutputStream dataOutputStream = (DataOutputStream) c2991bm.f29324v;
                                dataOutputStream.writeBytes(m4);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(str);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(j13);
                                dataOutputStream.writeLong(P8);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                Cr cr5 = new Cr(byteArrayOutputStream.toByteArray());
                                int B9 = cr5.B();
                                for (InterfaceC3543m1 interfaceC3543m1 : this.f26928H) {
                                    cr5.E(0);
                                    interfaceC3543m1.a(B9, cr5);
                                }
                                if (j12 == com.anythink.basead.exoplayer.b.f6382b) {
                                    arrayDeque2.addLast(new N2(B9, j14, true));
                                    this.f26954w += B9;
                                } else if (arrayDeque2.isEmpty()) {
                                    for (InterfaceC3543m1 interfaceC3543m12 : this.f26928H) {
                                        interfaceC3543m12.c(j12, 1, B9, 0, null);
                                    }
                                } else {
                                    arrayDeque2.addLast(new N2(B9, j12, false));
                                    this.f26954w += B9;
                                }
                            } catch (IOException e9) {
                                throw new RuntimeException(e9);
                            }
                        }
                    } else {
                        ((K0) r02).a(i36, false);
                    }
                    h(((K0) r02).f25819w);
                }
            } else {
                int i38 = this.f26951t;
                Cr cr6 = this.f26942k;
                if (i38 == 0) {
                    if (!((K0) r02).z(cr6.f24252a, 0, 8, true)) {
                        long j29 = this.f26931L;
                        if (j29 == -1) {
                            c2712Ol.l(0);
                            return -1;
                        }
                        u02.f27844n = j29;
                        this.f26931L = -1L;
                        this.f26927G.D(c3694or.D());
                        this.f26930K = true;
                        return 1;
                    }
                    this.f26951t = 8;
                    cr6.E(0);
                    this.f26950s = cr6.P();
                    this.f26949r = cr6.b();
                }
                long j30 = this.f26950s;
                if (j30 == 1) {
                    ((K0) r02).z(cr6.f24252a, 8, 8, false);
                    this.f26951t += 8;
                    this.f26950s = cr6.j();
                } else if (j30 == 0) {
                    long j31 = ((K0) r02).f25818v;
                    if (j31 == -1) {
                        j31 = !arrayDeque.isEmpty() ? ((Iw) arrayDeque.peek()).f25619c : -1L;
                    }
                    if (j31 != -1) {
                        j6 = -1;
                        this.f26950s = (j31 - ((K0) r02).f25819w) + this.f26951t;
                        j9 = this.f26950s;
                        int i39 = this.f26951t;
                        j10 = i39;
                        if (j9 < j10) {
                            j11 = j10;
                        } else {
                            if (this.f26949r != 1718773093 || i39 != 8) {
                                break;
                            }
                            this.f26950s = j10;
                            j9 = j10;
                            j11 = j9;
                        }
                        if (this.f26931L == j6) {
                            if (this.f26949r == 1936286840) {
                                cr.y((int) j9);
                                System.arraycopy(cr6.f24252a, 0, cr.f24252a, 0, 8);
                                ((K0) r02).z(cr.f24252a, 8, (int) (this.f26950s - this.f26951t), false);
                                c3694or.A((J0) k(((K0) r02).q(), cr).second);
                            } else {
                                ((K0) r02).a((int) (j9 - j11), true);
                            }
                            g();
                        } else {
                            long j32 = ((K0) r02).f25819w - j11;
                            int i40 = this.f26949r;
                            if ((i40 == 1836019558 || i40 == 1835295092) && !this.J) {
                                long j33 = ((K0) r02).f25818v;
                                if (j33 == j6 || this.f26932M != j6 || (i13 & 512) == 0) {
                                    this.f26927G.D(new V0(this.f26956y, j32));
                                    this.J = true;
                                } else {
                                    this.f26932M = j32;
                                    u02.f27844n = j33 - 16;
                                    this.f26948q = 5;
                                }
                            }
                            if (this.f26949r == 1836019558) {
                                int size3 = sparseArray.size();
                                for (int i41 = 0; i41 < size3; i41++) {
                                    C2955b3 c2955b34 = ((P2) sparseArray.valueAt(i41)).f26717b;
                                    c2955b34.f29191c = j32;
                                    c2955b34.f29190b = j32;
                                }
                            }
                            int i42 = this.f26949r;
                            if (i42 == 1835295092) {
                                this.f26921A = null;
                                this.f26953v = j32 + this.f26950s;
                                this.f26948q = 2;
                            } else if (i42 == 1836019574 || i42 == 1953653099 || i42 == 1835297121 || i42 == 1835626086 || i42 == 1937007212 || i42 == 1836019558 || i42 == 1953653094 || i42 == 1836475768 || i42 == 1701082227 || i42 == 1835365473) {
                                K0 k05 = (K0) r02;
                                long j34 = k05.f25819w;
                                long j35 = this.f26950s;
                                long j36 = j34 + j35;
                                if (j35 != this.f26951t && i42 == 1835365473) {
                                    cr.y(8);
                                    k05.A(cr.f24252a, 0, 8, false);
                                    J2.f(cr);
                                    k05.a(cr.f24253b, false);
                                    k05.f25821y = 0;
                                }
                                long j37 = j36 - 8;
                                arrayDeque.push(new Iw(this.f26949r, j37));
                                if (this.f26950s == this.f26951t) {
                                    h(j37);
                                } else {
                                    g();
                                }
                            } else if (i42 == 1751411826 || i42 == 1835296868 || i42 == 1836476516 || i42 == 1936286840 || i42 == 1937011556 || i42 == 1937011827 || i42 == 1668576371 || i42 == 1937011555 || i42 == 1937011578 || i42 == 1937013298 || i42 == 1937007471 || i42 == 1668232756 || i42 == 1937011571 || i42 == 1952867444 || i42 == 1952868452 || i42 == 1953196132 || i42 == 1953654136 || i42 == 1953658222 || i42 == 1886614376 || i42 == 1935763834 || i42 == 1935763823 || i42 == 1936027235 || i42 == 1970628964 || i42 == 1935828848 || i42 == 1936158820 || i42 == 1701606260 || i42 == 1835362404 || i42 == 1701671783 || i42 == 1969517665 || i42 == 1801812339 || i42 == 1768715124) {
                                if (this.f26951t != 8) {
                                    throw U4.c("Leaf atom defines extended atom size (unsupported).");
                                }
                                if (this.f26950s > 2147483647L) {
                                    throw U4.c("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                Cr cr7 = new Cr((int) this.f26950s);
                                System.arraycopy(cr6.f24252a, 0, cr7.f24252a, 0, 8);
                                this.f26952u = cr7;
                                this.f26948q = 1;
                            } else {
                                if (this.f26950s > 2147483647L) {
                                    throw U4.c("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                this.f26952u = null;
                                this.f26948q = 1;
                            }
                        }
                        if (this.f26948q == 5) {
                            return 1;
                        }
                    }
                }
                j6 = -1;
                j9 = this.f26950s;
                int i392 = this.f26951t;
                j10 = i392;
                if (j9 < j10) {
                }
                if (this.f26931L == j6) {
                }
                if (this.f26948q == 5) {
                }
            }
            r03 = r02;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        if ((this.f26934b & 32) == 0) {
            s02 = new com.bumptech.glide.manager.o(s02, this.f26933a);
        }
        this.f26927G = s02;
        g();
        InterfaceC3543m1[] interfaceC3543m1Arr = new InterfaceC3543m1[2];
        this.f26928H = interfaceC3543m1Arr;
        int i = 0;
        InterfaceC3543m1[] interfaceC3543m1Arr2 = (InterfaceC3543m1[]) AbstractC3159eu.o(interfaceC3543m1Arr, 0);
        this.f26928H = interfaceC3543m1Arr2;
        for (InterfaceC3543m1 interfaceC3543m1 : interfaceC3543m1Arr2) {
            interfaceC3543m1.e(f26920O);
        }
        List list = this.f26935c;
        this.f26929I = new InterfaceC3543m1[list.size()];
        int i6 = 100;
        while (i < this.f26929I.length) {
            int i9 = i6 + 1;
            InterfaceC3543m1 C8 = this.f26927G.C(i6, 3);
            C8.e((DP) list.get(i));
            this.f26929I[i] = C8;
            i++;
            i6 = i9;
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        SparseArray sparseArray = this.f26936d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((P2) sparseArray.valueAt(i)).a();
        }
        this.f26944m.clear();
        this.f26954w = 0;
        ((PriorityQueue) this.f26945n.f26654e).clear();
        this.f26955x = j9;
        this.f26943l.clear();
        this.f26932M = -1L;
        g();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        C3500lC c3500lC;
        InterfaceC3329i1 u3 = AbstractC2639Kg.u(r02, true);
        if (u3 != null) {
            c3500lC = RB.j(u3);
        } else {
            PB pb = RB.f27177u;
            c3500lC = C3500lC.f31745x;
        }
        this.f26947p = c3500lC;
        return u3 == null;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final /* synthetic */ List f() {
        return this.f26947p;
    }

    public final void g() {
        this.f26948q = 0;
        this.f26951t = 0;
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
        int i6;
        boolean z3;
        ?? r32;
        K2 k22;
        int i9;
        K2 k23;
        ArrayList arrayList2;
        int i10;
        int i11;
        ArrayList arrayList3;
        int i12;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        boolean z6;
        int i16;
        int i17;
        int i18;
        int i19;
        P2 p22;
        ArrayList arrayList4;
        int i20;
        int i21;
        P2 p23;
        ArrayList arrayList5;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean[] zArr;
        int i26;
        int i27;
        K2 k24;
        int i28;
        P2 p24;
        Z2 z22;
        SC sc;
        int i29;
        while (true) {
            ArrayDeque arrayDeque = this.f26943l;
            if (arrayDeque.isEmpty() || ((Iw) arrayDeque.peek()).f25619c != j6) {
                break;
            }
            Iw iw = (Iw) arrayDeque.pop();
            int i30 = iw.f31138b;
            SparseArray sparseArray = this.f26936d;
            ArrayList arrayList6 = iw.f25620d;
            int i31 = 12;
            int i32 = 16;
            int i33 = 2;
            if (i30 == 1836019574) {
                EO l9 = l(arrayList6);
                Iw j9 = iw.j(1836475768);
                j9.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList7 = j9.f25620d;
                int size = arrayList7.size();
                long j10 = com.anythink.basead.exoplayer.b.f6382b;
                int i34 = 0;
                while (i34 < size) {
                    Zw zw = (Zw) arrayList7.get(i34);
                    int i35 = zw.f31138b;
                    Cr cr = zw.f28980c;
                    if (i35 == 1953654136) {
                        cr.E(i31);
                        Pair create = Pair.create(Integer.valueOf(cr.b()), new K2(cr.b() - 1, cr.b(), cr.b(), cr.b()));
                        sparseArray2.put(((Integer) create.first).intValue(), (K2) create.second);
                    } else if (i35 == 1835362404) {
                        cr.E(8);
                        j10 = J2.a(cr.b()) == 0 ? cr.P() : cr.j();
                    }
                    i34++;
                    i31 = 12;
                }
                int i36 = 0;
                Iw j11 = iw.j(1835365473);
                O3 e9 = j11 != null ? J2.e(j11) : null;
                Z0 z02 = new Z0();
                Zw i37 = iw.i(1969517665);
                if (i37 != null) {
                    o32 = J2.c(i37);
                    z02.a(o32);
                } else {
                    o32 = null;
                }
                Zw i38 = iw.i(1836476516);
                i38.getClass();
                O3 o33 = new O3(J2.d(i38.f28980c));
                long j12 = j10;
                boolean z9 = -1;
                ArrayList b9 = J2.b(iw, z02, j12, l9, false, false, new L2(i36));
                int size2 = b9.size();
                if (sparseArray.size() == 0) {
                    String g4 = AbstractC2772Sd.g(b9);
                    int i39 = 0;
                    while (i39 < size2) {
                        C3008c3 c3008c3 = (C3008c3) b9.get(i39);
                        Z2 z23 = c3008c3.f29416a;
                        if (z23.f28833m) {
                            S0 s02 = this.f26927G;
                            int i40 = z23.f28823b;
                            InterfaceC3543m1 C8 = s02.C(i39, i40);
                            C8.getClass();
                            DP dp = z23.f28828g;
                            dp.getClass();
                            i6 = i39;
                            C3299hP c3299hP = new C3299hP(dp);
                            c3299hP.d(g4);
                            str = g4;
                            if (i40 == 1) {
                                int i41 = z02.f28816a;
                                arrayList = b9;
                                r32 = -1;
                                r32 = -1;
                                r32 = -1;
                                i = size2;
                                if (i41 != -1 && (i9 = z02.f28817b) != -1) {
                                    c3299hP.f30775K = i41;
                                    c3299hP.f30776L = i9;
                                }
                            } else {
                                arrayList = b9;
                                i = size2;
                                r32 = -1;
                            }
                            SK.l(i40, e9, c3299hP, dp.f24428l, o32, o33);
                            int size3 = sparseArray2.size();
                            int i42 = z23.f28822a;
                            if (size3 == 1) {
                                k22 = (K2) sparseArray2.valueAt(0);
                            } else {
                                k22 = (K2) sparseArray2.get(i42);
                                k22.getClass();
                            }
                            sparseArray.put(i42, new P2(C8, c3008c3, k22, new DP(c3299hP)));
                            this.f26956y = Math.max(this.f26956y, z23.f28826e);
                            z3 = r32;
                        } else {
                            arrayList = b9;
                            i = size2;
                            str = g4;
                            i6 = i39;
                            z3 = z9;
                        }
                        i39 = i6 + 1;
                        z9 = z3;
                        size2 = i;
                        g4 = str;
                        b9 = arrayList;
                    }
                    this.f26927G.B();
                } else {
                    ArrayList arrayList8 = b9;
                    int i43 = 0;
                    int i44 = 0;
                    while (i43 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        if (((C3008c3) arrayList9.get(i43)).f29416a.f28833m) {
                            i44++;
                        }
                        i43++;
                        arrayList8 = arrayList9;
                    }
                    ArrayList arrayList10 = arrayList8;
                    AbstractC2772Sd.H(sparseArray.size() == i44);
                    for (int i45 = 0; i45 < size2; i45++) {
                        C3008c3 c3008c32 = (C3008c3) arrayList10.get(i45);
                        Z2 z24 = c3008c32.f29416a;
                        if (z24.f28833m) {
                            int i46 = z24.f28822a;
                            P2 p25 = (P2) sparseArray.get(i46);
                            if (sparseArray2.size() == 1) {
                                k23 = (K2) sparseArray2.valueAt(0);
                            } else {
                                k23 = (K2) sparseArray2.get(i46);
                                k23.getClass();
                            }
                            p25.f26719d = c3008c32;
                            p25.f26720e = k23;
                            if (p25.f26726l == null) {
                                p25.f26716a.e(p25.f26727m);
                            }
                            p25.a();
                        }
                    }
                }
            } else {
                int i47 = 4;
                if (i30 == 1836019558) {
                    ArrayList arrayList11 = iw.f25621e;
                    int size4 = arrayList11.size();
                    int i48 = 0;
                    while (i48 < size4) {
                        Iw iw2 = (Iw) arrayList11.get(i48);
                        if (iw2.f31138b == 1953653094) {
                            Zw i49 = iw2.i(1952868452);
                            i49.getClass();
                            Cr cr2 = i49.f28980c;
                            cr2.E(8);
                            int b10 = cr2.b();
                            byte[] bArr2 = J2.f25647a;
                            P2 p26 = (P2) sparseArray.get(cr2.b());
                            if (p26 == null) {
                                p26 = null;
                            } else {
                                int i50 = b10 & 1;
                                C2955b3 c2955b3 = p26.f26717b;
                                if (i50 != 0) {
                                    long j13 = cr2.j();
                                    c2955b3.f29190b = j13;
                                    c2955b3.f29191c = j13;
                                }
                                K2 k25 = p26.f26720e;
                                c2955b3.f29189a = new K2((b10 & 2) != 0 ? cr2.b() - 1 : k25.f25829a, (b10 & 8) != 0 ? cr2.b() : k25.f25830b, (b10 & 16) != 0 ? cr2.b() : k25.f25831c, (b10 & 32) != 0 ? cr2.b() : k25.f25832d);
                            }
                            if (p26 == null) {
                                arrayList2 = arrayList11;
                                i10 = size4;
                                i11 = i48;
                                arrayList3 = arrayList6;
                                i12 = i32;
                                i13 = i33;
                            } else {
                                C2955b3 c2955b32 = p26.f26717b;
                                long j14 = c2955b32.f29203p;
                                boolean z10 = c2955b32.f29204q;
                                p26.a();
                                p26.f26728n = true;
                                Zw i51 = iw2.i(1952867444);
                                if (i51 != null) {
                                    Cr cr3 = i51.f28980c;
                                    cr3.E(8);
                                    c2955b32.f29203p = J2.a(cr3.b()) == 1 ? cr3.j() : cr3.P();
                                    c2955b32.f29204q = true;
                                } else {
                                    c2955b32.f29203p = j14;
                                    c2955b32.f29204q = z10;
                                }
                                ArrayList arrayList12 = iw2.f25620d;
                                int size5 = arrayList12.size();
                                int i52 = 0;
                                int i53 = 0;
                                int i54 = 0;
                                while (true) {
                                    i14 = 1953658222;
                                    if (i52 >= size5) {
                                        break;
                                    }
                                    Zw zw2 = (Zw) arrayList12.get(i52);
                                    ArrayList arrayList13 = arrayList11;
                                    if (zw2.f31138b == 1953658222) {
                                        Cr cr4 = zw2.f28980c;
                                        cr4.E(12);
                                        int h9 = cr4.h();
                                        if (h9 > 0) {
                                            i54 += h9;
                                            i53++;
                                            i52++;
                                            arrayList11 = arrayList13;
                                        }
                                    }
                                    i52++;
                                    arrayList11 = arrayList13;
                                }
                                arrayList2 = arrayList11;
                                p26.f26723h = 0;
                                p26.f26722g = 0;
                                p26.f26721f = 0;
                                c2955b32.f29192d = i53;
                                c2955b32.f29193e = i54;
                                if (c2955b32.f29195g.length < i53) {
                                    c2955b32.f29194f = new long[i53];
                                    c2955b32.f29195g = new int[i53];
                                }
                                if (c2955b32.f29196h.length < i54) {
                                    int i55 = (i54 * 125) / 100;
                                    c2955b32.f29196h = new int[i55];
                                    c2955b32.i = new long[i55];
                                    c2955b32.f29197j = new boolean[i55];
                                    c2955b32.f29199l = new boolean[i55];
                                }
                                int i56 = 0;
                                int i57 = 0;
                                int i58 = 0;
                                while (true) {
                                    long j15 = 0;
                                    if (i56 >= size5) {
                                        break;
                                    }
                                    Zw zw3 = (Zw) arrayList12.get(i56);
                                    if (zw3.f31138b == i14) {
                                        int i59 = i57 + 1;
                                        Cr cr5 = zw3.f28980c;
                                        cr5.E(8);
                                        int b11 = cr5.b();
                                        i16 = i56;
                                        C3008c3 c3008c33 = p26.f26719d;
                                        i17 = size4;
                                        K2 k26 = c2955b32.f29189a;
                                        String str2 = AbstractC3159eu.f29993a;
                                        i18 = i48;
                                        c2955b32.f29195g[i57] = cr5.h();
                                        long[] jArr = c2955b32.f29194f;
                                        i19 = size5;
                                        int i60 = i57;
                                        long j16 = c2955b32.f29190b;
                                        jArr[i60] = j16;
                                        if ((b11 & 1) != 0) {
                                            jArr[i60] = j16 + cr5.b();
                                        }
                                        boolean z11 = (b11 & 4) != 0;
                                        int i61 = k26.f25832d;
                                        int b12 = z11 ? cr5.b() : i61;
                                        boolean z12 = z11;
                                        int i62 = b11 & 256;
                                        int i63 = b11 & 512;
                                        int i64 = b11 & 1024;
                                        int i65 = b11 & 2048;
                                        Z2 z25 = c3008c33.f29416a;
                                        SC sc2 = z25.i;
                                        if (sc2 != null) {
                                            i20 = i61;
                                            i21 = b12;
                                            if (sc2.f27424u == 1 && (sc = z25.f28830j) != null) {
                                                if (sc2.a(0) == 0) {
                                                    p23 = p26;
                                                    arrayList5 = arrayList6;
                                                    i22 = i58;
                                                } else {
                                                    long a9 = sc2.a(0);
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    arrayList5 = arrayList6;
                                                    i22 = i58;
                                                    long w6 = AbstractC3159eu.w(a9, 1000000L, z25.f28825d, roundingMode);
                                                    p23 = p26;
                                                    i29 = w6 + AbstractC3159eu.w(sc.a(0), 1000000L, z25.f28824c, roundingMode) >= z25.f28826e ? 0 : 0;
                                                    int[] iArr = c2955b32.f29196h;
                                                    long[] jArr2 = c2955b32.i;
                                                    boolean[] zArr2 = c2955b32.f29197j;
                                                    i58 = i22 + c2955b32.f29195g[i60];
                                                    int[] iArr2 = iArr;
                                                    long j17 = c2955b32.f29203p;
                                                    arrayList4 = arrayList5;
                                                    i23 = i22;
                                                    while (i23 < i58) {
                                                        if (i62 != 0) {
                                                            i24 = i23;
                                                            i25 = cr5.b();
                                                        } else {
                                                            i24 = i23;
                                                            i25 = k26.f25830b;
                                                        }
                                                        i(i25);
                                                        if (i63 != 0) {
                                                            zArr = zArr2;
                                                            i26 = cr5.b();
                                                        } else {
                                                            zArr = zArr2;
                                                            i26 = k26.f25831c;
                                                        }
                                                        i(i26);
                                                        if (i64 != 0) {
                                                            i27 = cr5.b();
                                                        } else {
                                                            if (i24 == 0) {
                                                                if (z12) {
                                                                    i27 = i21;
                                                                    i24 = 0;
                                                                } else {
                                                                    i24 = 0;
                                                                }
                                                            }
                                                            i27 = i20;
                                                        }
                                                        if (i65 != 0) {
                                                            k24 = k26;
                                                            i28 = cr5.b();
                                                        } else {
                                                            k24 = k26;
                                                            i28 = 0;
                                                        }
                                                        int i66 = i26;
                                                        int[] iArr3 = iArr2;
                                                        long w9 = AbstractC3159eu.w((i28 + j17) - j15, 1000000L, z25.f28824c, RoundingMode.DOWN);
                                                        jArr2[i24] = w9;
                                                        if (c2955b32.f29204q) {
                                                            p24 = p23;
                                                            z22 = z25;
                                                        } else {
                                                            p24 = p23;
                                                            z22 = z25;
                                                            jArr2[i24] = w9 + p24.f26719d.i;
                                                        }
                                                        iArr3[i24] = i66;
                                                        zArr[i24] = ((i27 >> 16) & 1) == 0;
                                                        j17 += i25;
                                                        i23 = i24 + 1;
                                                        z25 = z22;
                                                        zArr2 = zArr;
                                                        iArr2 = iArr3;
                                                        p23 = p24;
                                                        k26 = k24;
                                                    }
                                                    p22 = p23;
                                                    c2955b32.f29203p = j17;
                                                    i57 = i59;
                                                }
                                                j15 = sc.a(i29);
                                                int[] iArr4 = c2955b32.f29196h;
                                                long[] jArr22 = c2955b32.i;
                                                boolean[] zArr22 = c2955b32.f29197j;
                                                i58 = i22 + c2955b32.f29195g[i60];
                                                int[] iArr22 = iArr4;
                                                long j172 = c2955b32.f29203p;
                                                arrayList4 = arrayList5;
                                                i23 = i22;
                                                while (i23 < i58) {
                                                }
                                                p22 = p23;
                                                c2955b32.f29203p = j172;
                                                i57 = i59;
                                            }
                                        } else {
                                            i20 = i61;
                                            i21 = b12;
                                        }
                                        p23 = p26;
                                        arrayList5 = arrayList6;
                                        i22 = i58;
                                        int[] iArr42 = c2955b32.f29196h;
                                        long[] jArr222 = c2955b32.i;
                                        boolean[] zArr222 = c2955b32.f29197j;
                                        i58 = i22 + c2955b32.f29195g[i60];
                                        int[] iArr222 = iArr42;
                                        long j1722 = c2955b32.f29203p;
                                        arrayList4 = arrayList5;
                                        i23 = i22;
                                        while (i23 < i58) {
                                        }
                                        p22 = p23;
                                        c2955b32.f29203p = j1722;
                                        i57 = i59;
                                    } else {
                                        i16 = i56;
                                        i17 = size4;
                                        i18 = i48;
                                        i19 = size5;
                                        p22 = p26;
                                        arrayList4 = arrayList6;
                                    }
                                    i56 = i16 + 1;
                                    p26 = p22;
                                    size4 = i17;
                                    i48 = i18;
                                    size5 = i19;
                                    arrayList6 = arrayList4;
                                    i14 = 1953658222;
                                }
                                i10 = size4;
                                i11 = i48;
                                arrayList3 = arrayList6;
                                C3008c3 c3008c34 = p26.f26719d;
                                K2 k27 = c2955b32.f29189a;
                                k27.getClass();
                                C2901a3[] c2901a3Arr = c3008c34.f29416a.f28834n;
                                C2901a3 c2901a3 = c2901a3Arr == null ? null : c2901a3Arr[k27.f25829a];
                                Zw i67 = iw2.i(1935763834);
                                if (i67 != null) {
                                    c2901a3.getClass();
                                    Cr cr6 = i67.f28980c;
                                    cr6.E(8);
                                    if ((cr6.b() & 1) == 1) {
                                        cr6.G(8);
                                    }
                                    int K7 = cr6.K();
                                    int h10 = cr6.h();
                                    int i68 = c2955b32.f29193e;
                                    if (h10 > i68) {
                                        throw U4.a(null, D.y.r(new StringBuilder(String.valueOf(h10).length() + 56 + String.valueOf(i68).length()), "Saiz sample count ", h10, " is greater than fragment sample count", i68));
                                    }
                                    int i69 = c2901a3.f29013d;
                                    if (K7 == 0) {
                                        boolean[] zArr3 = c2955b32.f29199l;
                                        i15 = 0;
                                        for (int i70 = 0; i70 < h10; i70++) {
                                            int K8 = cr6.K();
                                            i15 += K8;
                                            zArr3[i70] = K8 > i69;
                                        }
                                        z6 = false;
                                    } else {
                                        boolean z13 = K7 > i69;
                                        i15 = K7 * h10;
                                        z6 = false;
                                        Arrays.fill(c2955b32.f29199l, 0, h10, z13);
                                    }
                                    Arrays.fill(c2955b32.f29199l, h10, c2955b32.f29193e, z6);
                                    if (i15 > 0) {
                                        c2955b32.f29201n.y(i15);
                                        c2955b32.f29198k = true;
                                        c2955b32.f29202o = true;
                                    }
                                }
                                Zw i71 = iw2.i(1935763823);
                                if (i71 != null) {
                                    Cr cr7 = i71.f28980c;
                                    cr7.E(8);
                                    int b13 = cr7.b();
                                    if ((b13 & 1) == 1) {
                                        cr7.G(8);
                                    }
                                    int h11 = cr7.h();
                                    if (h11 != 1) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(h11).length() + 29);
                                        sb.append("Unexpected saio entry count: ");
                                        sb.append(h11);
                                        throw U4.a(null, sb.toString());
                                    }
                                    c2955b32.f29191c += J2.a(b13) == 0 ? cr7.P() : cr7.j();
                                }
                                Zw i72 = iw2.i(1936027235);
                                if (i72 != null) {
                                    j(i72.f28980c, 0, c2955b32);
                                }
                                String str3 = c2901a3 != null ? c2901a3.f29011b : null;
                                Cr cr8 = null;
                                Cr cr9 = null;
                                for (int i73 = 0; i73 < arrayList12.size(); i73++) {
                                    Zw zw4 = (Zw) arrayList12.get(i73);
                                    Cr cr10 = zw4.f28980c;
                                    int i74 = zw4.f31138b;
                                    if (i74 == 1935828848) {
                                        cr10.E(12);
                                        if (cr10.b() == 1936025959) {
                                            cr8 = cr10;
                                        }
                                    } else if (i74 == 1936158820) {
                                        cr10.E(12);
                                        if (cr10.b() == 1936025959) {
                                            cr9 = cr10;
                                        }
                                    }
                                }
                                if (cr8 == null || cr9 == null) {
                                    i13 = i33;
                                } else {
                                    cr8.E(8);
                                    int a10 = J2.a(cr8.b());
                                    int i75 = i47;
                                    cr8.G(i75);
                                    if (a10 == 1) {
                                        cr8.G(i75);
                                    }
                                    if (cr8.b() != 1) {
                                        throw U4.c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    cr9.E(8);
                                    int a11 = J2.a(cr9.b());
                                    cr9.G(i75);
                                    if (a11 != 1) {
                                        i13 = i33;
                                        if (a11 >= i13) {
                                            cr9.G(i75);
                                        }
                                    } else {
                                        if (cr9.P() == 0) {
                                            throw U4.c("Variable length description in sgpd found (unsupported)");
                                        }
                                        i13 = i33;
                                    }
                                    if (cr9.P() != 1) {
                                        throw U4.c("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    cr9.G(1);
                                    int K9 = cr9.K();
                                    int i76 = (K9 & 240) >> 4;
                                    int i77 = K9 & 15;
                                    i47 = i75;
                                    if (cr9.K() == 1) {
                                        int K10 = cr9.K();
                                        int i78 = i32;
                                        byte[] bArr3 = new byte[i78];
                                        cr9.H(bArr3, 0, i78);
                                        if (K10 == 0) {
                                            int K11 = cr9.K();
                                            byte[] bArr4 = new byte[K11];
                                            cr9.H(bArr4, 0, K11);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        c2955b32.f29198k = true;
                                        c2955b32.f29200m = new C2901a3(true, str3, K10, bArr3, i76, i77, bArr);
                                    }
                                }
                                int size6 = arrayList12.size();
                                for (int i79 = 0; i79 < size6; i79++) {
                                    Zw zw5 = (Zw) arrayList12.get(i79);
                                    if (zw5.f31138b == 1970628964) {
                                        Cr cr11 = zw5.f28980c;
                                        cr11.E(8);
                                        byte[] bArr5 = this.f26940h;
                                        cr11.H(bArr5, 0, 16);
                                        if (Arrays.equals(bArr5, f26919N)) {
                                            j(cr11, 16, c2955b32);
                                        }
                                    }
                                }
                                i12 = 16;
                            }
                        } else {
                            arrayList2 = arrayList11;
                            i10 = size4;
                            i11 = i48;
                            arrayList3 = arrayList6;
                            i12 = i32;
                            i13 = i33;
                        }
                        i48 = i11 + 1;
                        i32 = i12;
                        i33 = i13;
                        arrayList11 = arrayList2;
                        size4 = i10;
                        arrayList6 = arrayList3;
                    }
                    EO l10 = l(arrayList6);
                    if (l10 != null) {
                        int size7 = sparseArray.size();
                        for (int i80 = 0; i80 < size7; i80++) {
                            P2 p27 = (P2) sparseArray.valueAt(i80);
                            C3008c3 c3008c35 = p27.f26719d;
                            K2 k28 = p27.f26717b.f29189a;
                            String str4 = AbstractC3159eu.f29993a;
                            int i81 = k28.f25829a;
                            C2901a3[] c2901a3Arr2 = c3008c35.f29416a.f28834n;
                            C2901a3 c2901a32 = c2901a3Arr2 == null ? null : c2901a3Arr2[i81];
                            EO a12 = l10.a(c2901a32 != null ? c2901a32.f29011b : null);
                            DP dp2 = p27.f26727m;
                            dp2.getClass();
                            C3299hP c3299hP2 = new C3299hP(dp2);
                            c3299hP2.f30796r = a12;
                            DP dp3 = new DP(c3299hP2);
                            if (p27.f26726l != null) {
                                p27.f26726l = dp3;
                            } else {
                                p27.f26716a.e(dp3);
                            }
                        }
                    }
                    if (this.f26955x != com.anythink.basead.exoplayer.b.f6382b) {
                        int size8 = sparseArray.size();
                        for (int i82 = 0; i82 < size8; i82++) {
                            P2 p28 = (P2) sparseArray.valueAt(i82);
                            long j18 = this.f26955x;
                            int i83 = p28.f26721f;
                            while (true) {
                                C2955b3 c2955b33 = p28.f26717b;
                                if (i83 < c2955b33.f29193e && c2955b33.i[i83] <= j18) {
                                    if (c2955b33.f29197j[i83]) {
                                        p28.i = i83;
                                    }
                                    i83++;
                                }
                            }
                        }
                        this.f26955x = com.anythink.basead.exoplayer.b.f6382b;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((Iw) arrayDeque.peek()).f25621e.add(iw);
                }
            }
        }
    }

    public final void m(InterfaceC3113e1 interfaceC3113e1, U0 u02) {
        this.f26927G.D(interfaceC3113e1);
        this.J = true;
        u02.f27844n = this.f26932M;
        g();
    }
}
