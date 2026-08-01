package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* loaded from: assets/audience_network/classes2.dex */
public final class AR extends Timeline {
    public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
    public final BP<C2367pl> A00;
    public final BP<C2365pj> A01;
    public final int[] A02;
    public final int[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    /* JADX WARN: Incorrect condition in loop: B:6:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AR(BP<C2365pj> bp, BP<C2367pl> bp2, int[] iArr) {
        AbstractC06243y.A07(bp.size() == iArr.length);
        this.A01 = bp;
        this.A00 = bp2;
        this.A02 = iArr;
        this.A03 = new int[iArr.length];
        for (int i = 0; i < i; i++) {
            int[] iArr2 = this.A03;
            int i6 = iArr[i];
            iArr2[i6] = i;
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
    public final int A08(int i, int i6, boolean z3) {
        if (i6 == 1) {
            return i;
        }
        if (i == A0C(z3)) {
            if (i6 == 2) {
                return A0B(z3);
            }
            return -1;
        }
        if (z3) {
            return this.A02[this.A03[i] + 1];
        }
        return i + 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z3) {
        if (A0N()) {
            return -1;
        }
        if (!z3) {
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
    public final int A0C(boolean z3) {
        if (A0N()) {
            return -1;
        }
        if (z3) {
            return this.A02[A07() - 1];
        }
        return A07() - 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2367pl A0I(int i, C2367pl p9, boolean z3) {
        C2408qS c2408qS;
        C2367pl p10 = this.A00.get(i);
        Object obj = p10.A03;
        Object obj2 = p10.A04;
        int i6 = p10.A00;
        long j6 = p10.A01;
        long j9 = p10.A02;
        c2408qS = p10.A06;
        p9.A0G(obj, obj2, i6, j6, j9, c2408qS, p10.A05);
        return p9;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C2365pj A0L(int i, C2365pj c2365pj, long j6) {
        C2365pj c2365pj2 = this.A01.get(i);
        c2365pj.A07(c2365pj2.A0C, c2365pj2.A09, c2365pj2.A0A, c2365pj2.A06, c2365pj2.A07, c2365pj2.A04, c2365pj2.A0G, c2365pj2.A0D, c2365pj2.A08, c2365pj2.A02, c2365pj2.A03, c2365pj2.A00, c2365pj2.A01, c2365pj2.A05);
        c2365pj.A0F = c2365pj2.A0F;
        return c2365pj;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i) {
        throw new UnsupportedOperationException();
    }
}
