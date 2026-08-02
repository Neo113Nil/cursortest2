package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.mE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2183mE extends AbstractC1009Iu {
    public static byte[] A03;
    public static String[] A04 = {"GA2pmS7X4ROGOgByNCdi18taC", "aAh4RNygY6pz4IdlAQ9iIXEvCFWWkzLF", "JuodTrkofMpjka010", "J1Lmlws0eqmUUC5GC3jhEdxTYojxk4jf", "6Ya7uqSvo", "3XyRCMiSsp8rG7f8J4q6xkUhsqnZzFaE", "VspF2Q", "vTSdivoAe22KROlTGGoK4NP8GmV"};
    public final long A00;
    public final List<C2183mE> A01;
    public final List<C2182mD> A02;

    public static String A04(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{68, 7, 11, 10, 16, 5, 13, 10, 1, 22, 23, 94, 68, 105, 37, 44, 40, c.f17105c, 44, 58, 115, 105};
    }

    static {
        A05();
    }

    public C2183mE(int i, long j6) {
        super(i);
        this.A00 = j6;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C2183mE A06(int i) {
        int size = this.A01.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2183mE c2183mE = this.A01.get(i4);
            int i6 = A04[7].length();
            if (i6 == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "n49CDGF4gSULbNzRfDOXSmTNWTogkE10";
            strArr[3] = "P3Agw1JJwclCkyu9DcuVtuUqOjxfkaYK";
            C2183mE c2183mE2 = c2183mE;
            int childrenSize = ((AbstractC1009Iu) c2183mE2).A00;
            if (childrenSize == i) {
                return c2183mE2;
            }
        }
        if (A04[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[1] = "eWhxbLiQvYVwUHrDqb1spRuVxj0ikF7I";
        strArr2[3] = "G0JrlMiW26lgTwAQcPtVzhOkcvjPkvCh";
        return null;
    }

    public final C2182mD A07(int i) {
        int size = this.A02.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2182mD c2182mD = this.A02.get(i4);
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[0];
            int i6 = str.length();
            int childrenSize = str2.length();
            if (i6 == childrenSize) {
                throw new RuntimeException();
            }
            A04[5] = "r5cbbIuLaeCnR7fWkiITKmUfsEKVcSuB";
            int childrenSize2 = ((AbstractC1009Iu) c2182mD).A00;
            if (childrenSize2 == i) {
                return c2182mD;
            }
        }
        return null;
    }

    public final void A08(C2183mE c2183mE) {
        this.A01.add(c2183mE);
    }

    public final void A09(C2182mD c2182mD) {
        this.A02.add(c2182mD);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1009Iu
    public final String toString() {
        return AbstractC1009Iu.A02(super.A00) + A04(13, 9, 29) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 48) + Arrays.toString(this.A01.toArray());
    }
}
