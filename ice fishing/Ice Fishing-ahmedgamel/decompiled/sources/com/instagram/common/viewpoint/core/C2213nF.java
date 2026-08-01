package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2213nF extends AbstractC0874Eh<C2213nF> {
    public static String[] A0H = {"VuHjt8oOpq8N7C214wGoSA1AvoAEOrJ7", "uFvhlxS5lUy9ksGg6O4Xt3y9x", "z2gekC5V6p56SAeTbAO0jRL35", "AJl44cd0wjf7yp80NhOEfrZac9uQkeAm", "fvb2kSFN69PWkoJ4Ln26XpHSuOzso8Xv", "xYIwGH1EqCgaa9qjZOqbWgZcWwFFG4Ev", "iW7gA0b6LPVcA0KpSRoleRmfzjbkINez", "mxsnKoNumrVzSuMZZmY48wO5LDc3OokM"};
    public final int A00;
    public final int A01;
    public final int A02;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A03;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C07589i A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public C2213nF(int i, C2363pg c2363pg, int i6, C07589i c07589i, int i9, String str, int i10, boolean z3) {
        super(i, c2363pg, i6);
        int requiredAdaptiveSupport;
        int A00;
        int A07;
        this.A09 = c07589i;
        if (c07589i.A07) {
            requiredAdaptiveSupport = 24;
        } else {
            requiredAdaptiveSupport = 16;
        }
        this.A0A = c07589i.A06 && (i10 & requiredAdaptiveSupport) != 0;
        this.A0C = z3 && (super.A02.A0L == -1 || super.A02.A0L <= ((C2359pc) c07589i).A06) && ((super.A02.A0A == -1 || super.A02.A0A <= ((C2359pc) c07589i).A05) && ((super.A02.A01 == -1.0f || super.A02.A01 <= ((float) ((C2359pc) c07589i).A04)) && (super.A02.A05 == -1 || super.A02.A05 <= ((C2359pc) c07589i).A03)));
        this.A0D = z3 && (super.A02.A0L == -1 || super.A02.A0L >= ((C2359pc) c07589i).A0A) && ((super.A02.A0A == -1 || super.A02.A0A >= ((C2359pc) c07589i).A09) && ((super.A02.A01 == -1.0f || super.A02.A01 >= ((float) ((C2359pc) c07589i).A08)) && (super.A02.A05 == -1 || super.A02.A05 >= ((C2359pc) c07589i).A07)));
        this.A0E = C07579h.A0S(i9, false);
        int bestLanguageIndex = 0;
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        while (true) {
            if (i12 >= c07589i.A0L.size()) {
                break;
            }
            int A02 = C07579h.A02(super.A02, c07589i.A0L.get(i12), false);
            if (A02 > 0) {
                i11 = i12;
                bestLanguageIndex = A02;
                break;
            }
            i12++;
        }
        this.A03 = i11;
        this.A04 = bestLanguageIndex;
        this.A00 = super.A02.A05;
        this.A02 = super.A02.A06();
        A00 = C07579h.A00(super.A02.A0E, ((C2359pc) c07589i).A0D);
        this.A06 = A00;
        this.A0B = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A07 = C07579h.A02(super.A02, str, C07579h.A0K(str) == null);
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        while (true) {
            if (i14 < c07589i.A0M.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c07589i.A0M.get(i14))) {
                    i13 = i14;
                    break;
                }
                i14++;
            } else {
                break;
            }
        }
        this.A05 = i13;
        this.A0G = AbstractC07127i.A02(i9) == 128;
        this.A0F = AbstractC07127i.A04(i9) == 64;
        A07 = C07579h.A07(super.A02.A0W);
        this.A01 = A07;
        this.A08 = A00(i9, requiredAdaptiveSupport);
    }

    private int A00(int i, int i6) {
        if ((super.A02.A0E & 16384) != 0 || !C07579h.A0S(i, this.A09.A0B)) {
            return 0;
        }
        if (!this.A0C && !this.A09.A0C) {
            return 0;
        }
        if (C07579h.A0S(i, false) && this.A0D && this.A0C && super.A02.A05 != -1 && !this.A09.A0N && !this.A09.A0O && (i & i6) != 0) {
            return 2;
        }
        return 1;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public static int A01(C2213nF c2213nF, C2213nF c2213nF2) {
        AbstractC2252ns A09 = AbstractC2252ns.A01().A09(c2213nF.A0E, c2213nF2.A0E).A08(Integer.valueOf(c2213nF.A03), Integer.valueOf(c2213nF2.A03), AbstractC2402qK.A03().A06()).A06(c2213nF.A04, c2213nF2.A04).A06(c2213nF.A06, c2213nF2.A06).A09(c2213nF.A0B, c2213nF2.A0B).A06(c2213nF.A07, c2213nF2.A07).A09(c2213nF.A0C, c2213nF2.A0C).A09(c2213nF.A0D, c2213nF2.A0D).A08(Integer.valueOf(c2213nF.A05), Integer.valueOf(c2213nF2.A05), AbstractC2402qK.A03().A06()).A09(c2213nF.A0G, c2213nF2.A0G).A09(c2213nF.A0F, c2213nF2.A0F);
        if (c2213nF.A0G && c2213nF.A0F) {
            int i = c2213nF.A01;
            int i6 = c2213nF2.A01;
            if (A0H[4].charAt(7) == 'c') {
                throw new RuntimeException();
            }
            A0H[4] = "L7q4oO3o2NLjefqLZehpujqtxzeKbA5O";
            A09 = A09.A06(i, i6);
        }
        int A05 = A09.A05();
        if (A0H[7].charAt(14) != 'M') {
            return A05;
        }
        A0H[0] = "TVm4CsN40i91TfwfawYUT3UYECpWhhhJ";
        return A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    public static int A02(C2213nF c2213nF, C2213nF c2213nF2) {
        AbstractC2402qK abstractC2402qK;
        AbstractC2402qK A06;
        AbstractC2402qK abstractC2402qK2;
        AbstractC2402qK abstractC2402qK3;
        if (!c2213nF.A0C || !c2213nF.A0E) {
            abstractC2402qK = C07579h.A09;
            A06 = abstractC2402qK.A06();
        } else {
            A06 = C07579h.A09;
        }
        AbstractC2252ns A01 = AbstractC2252ns.A01();
        Integer valueOf = Integer.valueOf(c2213nF.A00);
        Integer valueOf2 = Integer.valueOf(c2213nF2.A00);
        boolean z3 = c2213nF.A09.A0O;
        String[] strArr = A0H;
        if (strArr[6].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0H[4] = "07GlML0JAKsk4TXVd5GQtUxHkz6E2kCF";
        if (z3) {
            abstractC2402qK3 = C07579h.A09;
            abstractC2402qK2 = abstractC2402qK3.A06();
        } else {
            abstractC2402qK2 = C07579h.A0A;
        }
        return A01.A08(valueOf, valueOf2, abstractC2402qK2).A08(Integer.valueOf(c2213nF.A02), Integer.valueOf(c2213nF2.A02), A06).A08(Integer.valueOf(c2213nF.A00), Integer.valueOf(c2213nF2.A00), A06).A05();
    }

    public static int A05(List<C2213nF> list, List<C2213nF> list2) {
        return AbstractC2252ns.A01().A08((C2213nF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = C2213nF.A01((C2213nF) obj, (C2213nF) obj2);
                return A01;
            }
        }), (C2213nF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = C2213nF.A01((C2213nF) obj, (C2213nF) obj2);
                return A01;
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = C2213nF.A01((C2213nF) obj, (C2213nF) obj2);
                return A01;
            }
        }).A06(list.size(), list2.size()).A08((C2213nF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = C2213nF.A02((C2213nF) obj, (C2213nF) obj2);
                return A02;
            }
        }), (C2213nF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = C2213nF.A02((C2213nF) obj, (C2213nF) obj2);
                return A02;
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = C2213nF.A02((C2213nF) obj, (C2213nF) obj2);
                return A02;
            }
        }).A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo> */
    public static BP<C2213nF> A06(int pixelCount, C2363pg c2363pg, C07589i c07589i, int[] iArr, String str, int i) {
        int A03;
        A03 = C07579h.A03(c2363pg, ((C2359pc) c07589i).A0F, ((C2359pc) c07589i).A0E, c07589i.A0Q);
        C2K A01 = BP.A01();
        int i6 = 0;
        while (true) {
            int i9 = c2363pg.A01;
            String[] strArr = A0H;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[6] = "2BgCu4KRvJ20zb7ljNDccj45OL5WeAVY";
            strArr2[5] = "2mW0v3SSZTDHEKi4uYotr9FneqRXRzcE";
            if (i6 < i9) {
                int A06 = c2363pg.A08(i6).A06();
                A01.A04(new C2213nF(pixelCount, c2363pg, i6, c07589i, iArr[i6], str, i, A03 == Integer.MAX_VALUE || (A06 != -1 && A06 <= A03)));
                i6++;
            } else {
                return A01.A05();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0874Eh
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2213nF c2213nF) {
        if (this.A0A || C5C.A1E(super.A02.A0W, ((AbstractC0874Eh) c2213nF).A02.A0W)) {
            if (!this.A09.A05) {
                if (this.A0G == c2213nF.A0G) {
                    boolean z3 = this.A0F;
                    if (A0H[7].charAt(14) != 'M') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0H;
                    strArr[1] = "O482IHGDjbokfcz29RQKjL9l7";
                    strArr[2] = "cI8rqKrS6U71hTMAagWNF9taj";
                    if (z3 == c2213nF.A0F) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0874Eh
    public final int A08() {
        return this.A08;
    }
}
