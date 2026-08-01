package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0881Eo {
    public final int A00;
    public final C2230nW A01;
    public final int[] A02;
    public final int[] A03;
    public final C2230nW[] A04;
    public final String[] A05;
    public final int[][][] A06;

    public C0881Eo(String[] strArr, int[] iArr, C2230nW[] c2230nWArr, int[] iArr2, int[][][] iArr3, C2230nW c2230nW) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = c2230nWArr;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = c2230nW;
        this.A00 = iArr.length;
    }

    private final int A00(int i, int i6, int i9) {
        return this.A06[i][i6][i9];
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int A01(int i, int i6, int[] iArr) {
        int i9 = 0;
        int i10 = 16;
        boolean z3 = false;
        String str = null;
        int i11 = 0;
        while (i11 < handledTrackCount) {
            int adaptiveSupport = iArr[i11];
            String firstSampleMimeType = this.A04[i].A05(i6).A08(adaptiveSupport).A0W;
            int adaptiveSupport2 = i9 + 1;
            if (i9 == 0) {
                str = firstSampleMimeType;
            } else {
                z3 = (!C5C.A1E(str, firstSampleMimeType)) | z3;
            }
            i10 = Math.min(i10, AbstractC07127i.A01(this.A06[i][i6][i11]));
            i11++;
            i9 = adaptiveSupport2;
        }
        if (z3) {
            int handledTrackCount = this.A02[i];
            return Math.min(i10, handledTrackCount);
        }
        return i10;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03(int i) {
        return this.A03[i];
    }

    public final int A04(int i, int i6, int i9) {
        return AbstractC07127i.A03(A00(i, i6, i9));
    }

    public final int A05(int i, int i6, boolean z3) {
        int i9 = this.A04[i].A05(i6).A01;
        int[] iArr = new int[i9];
        int i10 = 0;
        for (int trackIndexCount = 0; trackIndexCount < i9; trackIndexCount++) {
            int A04 = A04(i, i6, trackIndexCount);
            if (A04 == 4 || (z3 && A04 == 3)) {
                int trackCount = i10 + 1;
                iArr[i10] = trackIndexCount;
                i10 = trackCount;
            }
        }
        int trackCount2 = A01(i, i6, Arrays.copyOf(iArr, i10));
        return trackCount2;
    }

    public final C2230nW A06() {
        return this.A01;
    }

    public final C2230nW A07(int i) {
        return this.A04[i];
    }
}
