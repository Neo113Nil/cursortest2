package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2234nG extends AbstractC0894Eh<C2234nG> implements Comparable<C2234nG> {
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
    public static int A01(List<C2234nG> list, List<C2234nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2234nG(int i, C2383pg c2383pg, int i4, C07789i c07789i, int i6, String str) {
        super(i, c2383pg, i4);
        List<String> list;
        int A00;
        int i9 = 0;
        this.A08 = C07779h.A0S(i6, false);
        int i10 = super.A02.A0H & (~((C2379pc) c07789i).A00);
        this.A06 = (i10 & 1) != 0;
        this.A07 = (i10 & 2) != 0;
        int i11 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c07789i.A0K.isEmpty()) {
            list = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            list = c07789i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = C07779h.A02(super.A02, list.get(bestLanguageIndex), c07789i.A0P);
            if (A02 > 0) {
                i11 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i11;
        this.A01 = bestLanguageScore;
        A00 = C07779h.A00(super.A02.A0E, ((C2379pc) c07789i).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C07779h.A02(super.A02, str, C07779h.A0K(str) == null);
        boolean z6 = this.A01 > 0 || (c07789i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C07779h.A0S(i6, c07789i.A0B) && z6) {
            i9 = 1;
        }
        this.A04 = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2234nG c2234nG) {
        AbstractC2272ns A06 = AbstractC2272ns.A01().A09(this.A08, c2234nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2234nG.A00), AbstractC2422qK.A03().A06()).A06(this.A01, c2234nG.A01).A06(this.A02, c2234nG.A02).A09(this.A06, c2234nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2234nG.A07), this.A01 == 0 ? AbstractC2422qK.A03() : AbstractC2422qK.A03().A06()).A06(this.A03, c2234nG.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c2234nG.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C2234nG> A02(int i, C2383pg c2383pg, C07789i c07789i, int[] iArr, String str) {
        C2K A01 = BP.A01();
        for (int i4 = 0; i4 < c2383pg.A01; i4++) {
            A01.A04(new C2234nG(i, c2383pg, i4, c07789i, iArr[i4], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0894Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2234nG c2234nG) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0894Eh
    public final int A08() {
        return this.A04;
    }
}
