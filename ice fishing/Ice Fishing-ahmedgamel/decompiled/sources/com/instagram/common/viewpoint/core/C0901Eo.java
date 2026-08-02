package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0901Eo {
    public final int A00;
    public final C2250nW A01;
    public final int[] A02;
    public final int[] A03;
    public final C2250nW[] A04;
    public final String[] A05;
    public final int[][][] A06;

    public C0901Eo(String[] strArr, int[] iArr, C2250nW[] c2250nWArr, int[] iArr2, int[][][] iArr3, C2250nW c2250nW) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = c2250nWArr;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = c2250nW;
        this.A00 = iArr.length;
    }

    private final int A00(int i, int i4, int i6) {
        return this.A06[i][i4][i6];
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int A01(int i, int i4, int[] iArr) {
        int i6 = 0;
        int i9 = 16;
        boolean z6 = false;
        String str = null;
        int i10 = 0;
        while (i10 < handledTrackCount) {
            int adaptiveSupport = iArr[i10];
            String firstSampleMimeType = this.A04[i].A05(i4).A08(adaptiveSupport).A0W;
            int adaptiveSupport2 = i6 + 1;
            if (i6 == 0) {
                str = firstSampleMimeType;
            } else {
                z6 = (!C5C.A1E(str, firstSampleMimeType)) | z6;
            }
            i9 = Math.min(i9, AbstractC07327i.A01(this.A06[i][i4][i10]));
            i10++;
            i6 = adaptiveSupport2;
        }
        if (z6) {
            int handledTrackCount = this.A02[i];
            return Math.min(i9, handledTrackCount);
        }
        return i9;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03(int i) {
        return this.A03[i];
    }

    public final int A04(int i, int i4, int i6) {
        return AbstractC07327i.A03(A00(i, i4, i6));
    }

    public final int A05(int i, int i4, boolean z6) {
        int i6 = this.A04[i].A05(i4).A01;
        int[] iArr = new int[i6];
        int i9 = 0;
        for (int trackIndexCount = 0; trackIndexCount < i6; trackIndexCount++) {
            int A04 = A04(i, i4, trackIndexCount);
            if (A04 == 4 || (z6 && A04 == 3)) {
                int trackCount = i9 + 1;
                iArr[i9] = trackIndexCount;
                i9 = trackCount;
            }
        }
        int trackCount2 = A01(i, i4, Arrays.copyOf(iArr, i9));
        return trackCount2;
    }

    public final C2250nW A06() {
        return this.A01;
    }

    public final C2250nW A07(int i) {
        return this.A04[i];
    }
}
