package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2214nG extends AbstractC0874Eh<C2214nG> implements Comparable<C2214nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C2214nG> list, List<C2214nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2214nG(int i, C2363pg c2363pg, int i6, C07589i c07589i, int i9, String str) {
        super(i, c2363pg, i6);
        List<String> list;
        int A00;
        int i10 = 0;
        this.A08 = C07579h.A0S(i9, false);
        int i11 = super.A02.A0H & (~((C2359pc) c07589i).A00);
        this.A06 = (i11 & 1) != 0;
        this.A07 = (i11 & 2) != 0;
        int i12 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c07589i.A0K.isEmpty()) {
            list = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            list = c07589i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = C07579h.A02(super.A02, list.get(bestLanguageIndex), c07589i.A0P);
            if (A02 > 0) {
                i12 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i12;
        this.A01 = bestLanguageScore;
        A00 = C07579h.A00(super.A02.A0E, ((C2359pc) c07589i).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C07579h.A02(super.A02, str, C07579h.A0K(str) == null);
        boolean z3 = this.A01 > 0 || (c07589i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C07579h.A0S(i9, c07589i.A0B) && z3) {
            i10 = 1;
        }
        this.A04 = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2214nG c2214nG) {
        AbstractC2252ns A06 = AbstractC2252ns.A01().A09(this.A08, c2214nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2214nG.A00), AbstractC2402qK.A03().A06()).A06(this.A01, c2214nG.A01).A06(this.A02, c2214nG.A02).A09(this.A06, c2214nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2214nG.A07), this.A01 == 0 ? AbstractC2402qK.A03() : AbstractC2402qK.A03().A06()).A06(this.A03, c2214nG.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c2214nG.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C2214nG> A02(int i, C2363pg c2363pg, C07589i c07589i, int[] iArr, String str) {
        C2K A01 = BP.A01();
        for (int i6 = 0; i6 < c2363pg.A01; i6++) {
            A01.A04(new C2214nG(i, c2363pg, i6, c07589i, iArr[i6], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0874Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2214nG c2214nG) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0874Eh
    public final int A08() {
        return this.A04;
    }
}
