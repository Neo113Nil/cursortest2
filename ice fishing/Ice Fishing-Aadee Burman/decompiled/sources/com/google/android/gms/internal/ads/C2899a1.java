package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2899a1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f28995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28996b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28997c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28998d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28999e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29000f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29001g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29002h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f29003j;

    /* renamed from: k, reason: collision with root package name */
    public final int f29004k;

    /* renamed from: l, reason: collision with root package name */
    public final float f29005l;

    /* renamed from: m, reason: collision with root package name */
    public final int f29006m;

    /* renamed from: n, reason: collision with root package name */
    public final String f29007n;

    /* renamed from: o, reason: collision with root package name */
    public final C2570Gf f29008o;

    public C2899a1(List list, int i, int i6, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f3, int i17, String str, C2570Gf c2570Gf) {
        this.f28995a = list;
        this.f28996b = i;
        this.f28997c = i6;
        this.f28998d = i9;
        this.f28999e = i10;
        this.f29000f = i11;
        this.f29001g = i12;
        this.f29002h = i13;
        this.i = i14;
        this.f29003j = i15;
        this.f29004k = i16;
        this.f29005l = f3;
        this.f29006m = i17;
        this.f29007n = str;
        this.f29008o = c2570Gf;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2899a1 a(Cr cr, boolean z3, C2570Gf c2570Gf) {
        boolean z6;
        boolean z9;
        int i;
        int i6;
        char c9;
        N6.i iVar;
        int i9;
        int i10;
        int i11;
        int i12 = 4;
        boolean z10 = true;
        if (z3) {
            try {
                cr.G(4);
            } catch (ArrayIndexOutOfBoundsException e9) {
                e = e9;
                z9 = true;
                throw U4.a(e, "Error parsing".concat(z9 != z3 ? "HEVC config" : "L-HEVC config"));
            }
        } else {
            try {
                cr.G(21);
            } catch (ArrayIndexOutOfBoundsException e10) {
                e = e10;
                z6 = z10;
                z9 = z6;
                throw U4.a(e, "Error parsing".concat(z9 != z3 ? "HEVC config" : "L-HEVC config"));
            }
        }
        int K7 = cr.K() & 3;
        int K8 = cr.K();
        int i13 = cr.f24253b;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < K8; i16++) {
            cr.G(1);
            int L6 = cr.L();
            for (int i17 = 0; i17 < L6; i17++) {
                int L8 = cr.L();
                i15 += L8 + 4;
                cr.G(L8);
            }
        }
        cr.E(i13);
        byte[] bArr = new byte[i15];
        C2570Gf c2570Gf2 = c2570Gf;
        int i18 = 0;
        float f3 = 1.0f;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        String str = null;
        int i29 = 0;
        while (i29 < K8) {
            int K9 = cr.K() & 63;
            int L9 = cr.L();
            z6 = z10;
            int i30 = i14;
            C2570Gf c2570Gf3 = c2570Gf2;
            while (i30 < L9) {
                try {
                    int L10 = cr.L();
                    int i31 = i30;
                    System.arraycopy(SK.f27460r0, i14, bArr, i18, i12);
                    int i32 = i18 + 4;
                    System.arraycopy(cr.f24252a, cr.f24253b, bArr, i32, L10);
                    int i33 = 32;
                    if (K9 != 32) {
                        i33 = K9;
                    } else if (i31 == 0) {
                        c2570Gf3 = SK.L(bArr, i32, i32 + L10);
                        i6 = i32;
                        i = K7;
                        i10 = 0;
                        i9 = 0;
                        c9 = '?';
                        i18 = i6 + L10;
                        cr.G(L10);
                        i30 = i10 + 1;
                        i12 = 4;
                        i14 = i9;
                        K7 = i;
                    }
                    i = K7;
                    if (i33 != 33) {
                        i6 = i32;
                        int i34 = 8;
                        if (i33 == 39 && i31 == 0) {
                            int i35 = i18 + 6;
                            int i36 = (i6 + L10) - 1;
                            while (true) {
                                byte b9 = bArr[i36];
                                if (b9 != 0) {
                                    if (b9 != 0) {
                                        if (i36 > i35) {
                                            C0 c02 = new C0(bArr, i35, i36 + 1);
                                            while (c02.j(16)) {
                                                int i37 = i34;
                                                int l9 = c02.l(i37);
                                                int i38 = 0;
                                                while (l9 == 255) {
                                                    i38 += com.anythink.basead.exoplayer.k.p.f8473b;
                                                    l9 = c02.l(i37);
                                                }
                                                int i39 = i38 + l9;
                                                int l10 = c02.l(i37);
                                                int i40 = 0;
                                                while (l10 == 255) {
                                                    i40 += com.anythink.basead.exoplayer.k.p.f8473b;
                                                    l10 = c02.l(8);
                                                }
                                                i34 = 8;
                                                int i41 = i40 + l10;
                                                if (i41 == 0) {
                                                    break;
                                                }
                                                if (c02.j(i41)) {
                                                    if (i39 == 176) {
                                                        int n9 = c02.n();
                                                        boolean k9 = c02.k();
                                                        int n10 = k9 ? c02.n() : 0;
                                                        int n11 = c02.n();
                                                        int i42 = -1;
                                                        int i43 = 0;
                                                        while (i43 <= n11) {
                                                            int n12 = c02.n();
                                                            c02.n();
                                                            int i44 = i43;
                                                            int l11 = c02.l(6);
                                                            if (l11 == 63) {
                                                                c9 = '?';
                                                            } else {
                                                                c02.l(l11 == 0 ? Math.max(0, n9 - 30) : Math.max(0, (l11 + n9) - 31));
                                                                if (k9) {
                                                                    int l12 = c02.l(6);
                                                                    if (l12 == 63) {
                                                                        c9 = '?';
                                                                    } else {
                                                                        c02.l(l12 == 0 ? Math.max(0, n10 - 30) : Math.max(0, (l12 + n10) - 31));
                                                                    }
                                                                }
                                                                if (c02.k()) {
                                                                    c02.h(10);
                                                                }
                                                                i43 = i44 + 1;
                                                                i42 = n12;
                                                            }
                                                            iVar = null;
                                                            break;
                                                        }
                                                        c9 = '?';
                                                        iVar = new N6.i(i42, 7);
                                                    } else {
                                                        c02.h(i41 * 8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c9 = '?';
                                    iVar = null;
                                    break;
                                } else {
                                    if (i36 <= i35) {
                                        break;
                                    }
                                    i36--;
                                }
                            }
                            iVar = null;
                            c9 = '?';
                            if (iVar == null || c2570Gf3 == null) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                                if (iVar.f1974u == ((Xx) ((RB) c2570Gf3.f25042u).get(0)).f28612b) {
                                    i10 = i31;
                                    i27 = 4;
                                    i18 = i6 + L10;
                                    cr.G(L10);
                                    i30 = i10 + 1;
                                    i12 = 4;
                                    i14 = i9;
                                    K7 = i;
                                } else {
                                    i27 = 5;
                                }
                            }
                            i10 = i31;
                            i18 = i6 + L10;
                            cr.G(L10);
                            i30 = i10 + 1;
                            i12 = 4;
                            i14 = i9;
                            K7 = i;
                        }
                    } else if (i31 == 0) {
                        C3971tz O8 = SK.O(bArr, i32, i32 + L10, c2570Gf3);
                        int i45 = O8.f34433a + 1;
                        int i46 = O8.f34439g;
                        int i47 = O8.f34440h;
                        int i48 = O8.f34435c + 8;
                        i6 = i32;
                        int i49 = O8.f34436d + 8;
                        int i50 = O8.f34442k;
                        int i51 = O8.f34443l;
                        int i52 = O8.f34444m;
                        float f9 = O8.i;
                        int i53 = O8.f34441j;
                        C4132wy c4132wy = O8.f34434b;
                        if (c4132wy != null) {
                            i11 = i53;
                            str = AbstractC4228ym.a(c4132wy.f34910a, c4132wy.f34911b, c4132wy.f34912c, c4132wy.f34913d, c4132wy.f34914e, c4132wy.f34915f);
                        } else {
                            i11 = i53;
                        }
                        i26 = i52;
                        f3 = f9;
                        i28 = i11;
                        i10 = i31;
                        i23 = i49;
                        i24 = i50;
                        i25 = i51;
                        i22 = i48;
                        i20 = i46;
                        i21 = i47;
                        i9 = 0;
                        i19 = i45;
                        c9 = '?';
                        i18 = i6 + L10;
                        cr.G(L10);
                        i30 = i10 + 1;
                        i12 = 4;
                        i14 = i9;
                        K7 = i;
                    } else {
                        i6 = i32;
                    }
                    i9 = 0;
                    c9 = '?';
                    i10 = i31;
                    i18 = i6 + L10;
                    cr.G(L10);
                    i30 = i10 + 1;
                    i12 = 4;
                    i14 = i9;
                    K7 = i;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    e = e11;
                    z9 = z6;
                    throw U4.a(e, "Error parsing".concat(z9 != z3 ? "HEVC config" : "L-HEVC config"));
                }
            }
            i29++;
            c2570Gf2 = c2570Gf3;
            z10 = z6;
            K7 = K7;
            i12 = 4;
        }
        z6 = z10;
        return new C2899a1(i15 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), K7 + 1, i19, i20, i21, i22, i23, i24, i25, i26, i27, f3, i28, str, c2570Gf2);
    }
}
