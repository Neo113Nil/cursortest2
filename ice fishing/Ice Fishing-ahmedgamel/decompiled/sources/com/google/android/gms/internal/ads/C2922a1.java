package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2922a1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f29765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29766b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29767c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29768d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29769e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29770f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29771g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29772h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f29773j;

    /* renamed from: k, reason: collision with root package name */
    public final int f29774k;

    /* renamed from: l, reason: collision with root package name */
    public final float f29775l;

    /* renamed from: m, reason: collision with root package name */
    public final int f29776m;

    /* renamed from: n, reason: collision with root package name */
    public final String f29777n;

    /* renamed from: o, reason: collision with root package name */
    public final C2590Gf f29778o;

    public C2922a1(List list, int i, int i4, int i6, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f2, int i16, String str, C2590Gf c2590Gf) {
        this.f29765a = list;
        this.f29766b = i;
        this.f29767c = i4;
        this.f29768d = i6;
        this.f29769e = i9;
        this.f29770f = i10;
        this.f29771g = i11;
        this.f29772h = i12;
        this.i = i13;
        this.f29773j = i14;
        this.f29774k = i15;
        this.f29775l = f2;
        this.f29776m = i16;
        this.f29777n = str;
        this.f29778o = c2590Gf;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2922a1 a(Cr cr, boolean z6, C2590Gf c2590Gf) {
        boolean z9;
        boolean z10;
        int i;
        int i4;
        char c9;
        N6.i iVar;
        int i6;
        int i9;
        int i10;
        int i11 = 4;
        boolean z11 = true;
        if (z6) {
            try {
                cr.G(4);
            } catch (ArrayIndexOutOfBoundsException e9) {
                e = e9;
                z10 = true;
                throw U4.a(e, "Error parsing".concat(z10 != z6 ? "HEVC config" : "L-HEVC config"));
            }
        } else {
            try {
                cr.G(21);
            } catch (ArrayIndexOutOfBoundsException e10) {
                e = e10;
                z9 = z11;
                z10 = z9;
                throw U4.a(e, "Error parsing".concat(z10 != z6 ? "HEVC config" : "L-HEVC config"));
            }
        }
        int K7 = cr.K() & 3;
        int K8 = cr.K();
        int i12 = cr.f24998b;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < K8; i15++) {
            cr.G(1);
            int L2 = cr.L();
            for (int i16 = 0; i16 < L2; i16++) {
                int L6 = cr.L();
                i14 += L6 + 4;
                cr.G(L6);
            }
        }
        cr.E(i12);
        byte[] bArr = new byte[i14];
        C2590Gf c2590Gf2 = c2590Gf;
        int i17 = 0;
        float f2 = 1.0f;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        String str = null;
        int i28 = 0;
        while (i28 < K8) {
            int K9 = cr.K() & 63;
            int L8 = cr.L();
            z9 = z11;
            int i29 = i13;
            C2590Gf c2590Gf3 = c2590Gf2;
            while (i29 < L8) {
                try {
                    int L9 = cr.L();
                    int i30 = i29;
                    System.arraycopy(SK.m0, i13, bArr, i17, i11);
                    int i31 = i17 + 4;
                    System.arraycopy(cr.f24997a, cr.f24998b, bArr, i31, L9);
                    int i32 = 32;
                    if (K9 != 32) {
                        i32 = K9;
                    } else if (i30 == 0) {
                        c2590Gf3 = SK.L(bArr, i31, i31 + L9);
                        i4 = i31;
                        i = K7;
                        i9 = 0;
                        i6 = 0;
                        c9 = '?';
                        i17 = i4 + L9;
                        cr.G(L9);
                        i29 = i9 + 1;
                        i11 = 4;
                        i13 = i6;
                        K7 = i;
                    }
                    i = K7;
                    if (i32 != 33) {
                        i4 = i31;
                        int i33 = 8;
                        if (i32 == 39 && i30 == 0) {
                            int i34 = i17 + 6;
                            int i35 = (i4 + L9) - 1;
                            while (true) {
                                byte b9 = bArr[i35];
                                if (b9 != 0) {
                                    if (b9 != 0) {
                                        if (i35 > i34) {
                                            C0 c02 = new C0(bArr, i34, i35 + 1);
                                            while (c02.j(16)) {
                                                int i36 = i33;
                                                int l9 = c02.l(i36);
                                                int i37 = 0;
                                                while (l9 == 255) {
                                                    i37 += com.anythink.basead.exoplayer.k.p.f9259b;
                                                    l9 = c02.l(i36);
                                                }
                                                int i38 = i37 + l9;
                                                int l10 = c02.l(i36);
                                                int i39 = 0;
                                                while (l10 == 255) {
                                                    i39 += com.anythink.basead.exoplayer.k.p.f9259b;
                                                    l10 = c02.l(8);
                                                }
                                                i33 = 8;
                                                int i40 = i39 + l10;
                                                if (i40 == 0) {
                                                    break;
                                                }
                                                if (c02.j(i40)) {
                                                    if (i38 == 176) {
                                                        int n9 = c02.n();
                                                        boolean k9 = c02.k();
                                                        int n10 = k9 ? c02.n() : 0;
                                                        int n11 = c02.n();
                                                        int i41 = -1;
                                                        int i42 = 0;
                                                        while (i42 <= n11) {
                                                            int n12 = c02.n();
                                                            c02.n();
                                                            int i43 = i42;
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
                                                                i42 = i43 + 1;
                                                                i41 = n12;
                                                            }
                                                            iVar = null;
                                                            break;
                                                        }
                                                        c9 = '?';
                                                        iVar = new N6.i(i41, 7);
                                                    } else {
                                                        c02.h(i40 * 8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c9 = '?';
                                    iVar = null;
                                    break;
                                } else {
                                    if (i35 <= i34) {
                                        break;
                                    }
                                    i35--;
                                }
                            }
                            iVar = null;
                            c9 = '?';
                            if (iVar == null || c2590Gf3 == null) {
                                i6 = 0;
                            } else {
                                i6 = 0;
                                if (iVar.f2062u == ((Xx) ((RB) c2590Gf3.f25830u).get(0)).f29389b) {
                                    i9 = i30;
                                    i26 = 4;
                                    i17 = i4 + L9;
                                    cr.G(L9);
                                    i29 = i9 + 1;
                                    i11 = 4;
                                    i13 = i6;
                                    K7 = i;
                                } else {
                                    i26 = 5;
                                }
                            }
                            i9 = i30;
                            i17 = i4 + L9;
                            cr.G(L9);
                            i29 = i9 + 1;
                            i11 = 4;
                            i13 = i6;
                            K7 = i;
                        }
                    } else if (i30 == 0) {
                        C3994tz O8 = SK.O(bArr, i31, i31 + L9, c2590Gf3);
                        int i44 = O8.f35207a + 1;
                        int i45 = O8.f35213g;
                        int i46 = O8.f35214h;
                        int i47 = O8.f35209c + 8;
                        i4 = i31;
                        int i48 = O8.f35210d + 8;
                        int i49 = O8.f35216k;
                        int i50 = O8.f35217l;
                        int i51 = O8.f35218m;
                        float f9 = O8.i;
                        int i52 = O8.f35215j;
                        C4155wy c4155wy = O8.f35208b;
                        if (c4155wy != null) {
                            i10 = i52;
                            str = AbstractC4305zm.a(c4155wy.f35691a, c4155wy.f35692b, c4155wy.f35693c, c4155wy.f35694d, c4155wy.f35695e, c4155wy.f35696f);
                        } else {
                            i10 = i52;
                        }
                        i25 = i51;
                        f2 = f9;
                        i27 = i10;
                        i9 = i30;
                        i22 = i48;
                        i23 = i49;
                        i24 = i50;
                        i21 = i47;
                        i19 = i45;
                        i20 = i46;
                        i6 = 0;
                        i18 = i44;
                        c9 = '?';
                        i17 = i4 + L9;
                        cr.G(L9);
                        i29 = i9 + 1;
                        i11 = 4;
                        i13 = i6;
                        K7 = i;
                    } else {
                        i4 = i31;
                    }
                    i6 = 0;
                    c9 = '?';
                    i9 = i30;
                    i17 = i4 + L9;
                    cr.G(L9);
                    i29 = i9 + 1;
                    i11 = 4;
                    i13 = i6;
                    K7 = i;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    e = e11;
                    z10 = z9;
                    throw U4.a(e, "Error parsing".concat(z10 != z6 ? "HEVC config" : "L-HEVC config"));
                }
            }
            i28++;
            c2590Gf2 = c2590Gf3;
            z11 = z9;
            K7 = K7;
            i11 = 4;
        }
        z9 = z11;
        return new C2922a1(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), K7 + 1, i18, i19, i20, i21, i22, i23, i24, i25, i26, f2, i27, str, c2590Gf2);
    }
}
