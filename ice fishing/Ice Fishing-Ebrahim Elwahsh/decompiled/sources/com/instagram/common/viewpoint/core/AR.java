package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* loaded from: assets/audience_network/classes2.dex */
public final class AR extends Timeline {
    public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
    public final BP<C2366pl> A00;
    public final BP<C2364pj> A01;
    public final int[] A02;
    public final int[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    /* JADX WARN: Incorrect condition in loop: B:6:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AR(BP<C2364pj> bp, BP<C2366pl> bp2, int[] iArr) {
        AbstractC06233y.A07(bp.size() == iArr.length);
        this.A01 = bp;
        this.A00 = bp2;
        this.A02 = iArr;
        this.A03 = new int[iArr.length];
        for (int i = 0; i < i; i++) {
            int[] iArr2 = this.A03;
            int i4 = iArr[i];
            iArr2[i4] = i;
        }
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A01.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A08(int i, int i4, boolean z8) {
        if (i4 == 1) {
            return i;
        }
        if (i == A0C(z8)) {
            if (i4 == 2) {
                return A0B(z8);
            }
            return -1;
        }
        if (z8) {
            return this.A02[this.A03[i] + 1];
        }
        return i + 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z8) {
        if (A0N()) {
            return -1;
        }
        if (!z8) {
            return 0;
        }
        int[] iArr = this.A02;
        if (A04[1].charAt(22) == 'H') {
            throw new RuntimeException();
        }
        A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
        return iArr[0];
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z8) {
        if (A0N()) {
            return -1;
        }
        if (z8) {
            return this.A02[A07() - 1];
        }
        return A07() - 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2366pl A0I(int i, C2366pl p6, boolean z8) {
        C2407qS c2407qS;
        C2366pl p9 = this.A00.get(i);
        Object obj = p9.A03;
        Object obj2 = p9.A04;
        int i4 = p9.A00;
        long j9 = p9.A01;
        long j10 = p9.A02;
        c2407qS = p9.A06;
        p6.A0G(obj, obj2, i4, j9, j10, c2407qS, p9.A05);
        return p6;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2364pj A0L(int i, C2364pj c2364pj, long j9) {
        C2364pj c2364pj2 = this.A01.get(i);
        c2364pj.A07(c2364pj2.A0C, c2364pj2.A09, c2364pj2.A0A, c2364pj2.A06, c2364pj2.A07, c2364pj2.A04, c2364pj2.A0G, c2364pj2.A0D, c2364pj2.A08, c2364pj2.A02, c2364pj2.A03, c2364pj2.A00, c2364pj2.A01, c2364pj2.A05);
        c2364pj.A0F = c2364pj2.A0F;
        return c2364pj;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i) {
        throw new UnsupportedOperationException();
    }
}
