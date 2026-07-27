package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.8A, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8A {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C2247no A00;
    public C2247no A01;
    public C2247no A02;
    public BP<C2247no> A03 = BP.A03();
    public AbstractC2291oX<C2247no, Timeline> A04 = AbstractC2291oX.A04();
    public final C2366pl A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2247no A00(InterfaceC06023b interfaceC06023b, BP<C2247no> bp, C2247no c2247no, C2366pl c2366pl) {
        int i;
        int i4;
        Timeline A7g = interfaceC06023b.A7g();
        int A7c = interfaceC06023b.A7c();
        Object A0M = A7g.A0N() ? null : A7g.A0M(A7c);
        if (!interfaceC06023b.AAd()) {
            boolean A0N = A7g.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (!A0N) {
                i = A7g.A0H(A7c, c2366pl).A07(C5C.A0O(interfaceC06023b.A7e()) - c2366pl.A0C());
                for (i4 = 0; i4 < bp.size(); i4++) {
                    C2247no c2247no2 = bp.get(i4);
                    if (A04(c2247no2, A0M, interfaceC06023b.AAd(), interfaceC06023b.A7Y(), interfaceC06023b.A7Z(), i)) {
                        return c2247no2;
                    }
                }
                if (bp.isEmpty() && c2247no != null) {
                    if (!A04(c2247no, A0M, interfaceC06023b.AAd(), interfaceC06023b.A7Y(), interfaceC06023b.A7Z(), i)) {
                        return c2247no;
                    }
                }
                return null;
            }
        }
        i = -1;
        while (i4 < bp.size()) {
        }
        if (bp.isEmpty()) {
            if (!A04(c2247no, A0M, interfaceC06023b.AAd(), interfaceC06023b.A7Y(), interfaceC06023b.A7Z(), i)) {
            }
        }
        return null;
    }

    public C8A(C2366pl c2366pl) {
        this.A05 = c2366pl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C2289oV<C2247no, Timeline> A03 = AbstractC2291oX.A03();
        if (this.A03.isEmpty()) {
            A03(A03, this.A01, timeline);
            C2247no c2247no = this.A02;
            C2247no c2247no2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!CB.A01(c2247no, c2247no2)) {
                A03(A03, this.A02, timeline);
            }
            if (!CB.A01(this.A00, this.A01) && !CB.A01(this.A00, this.A02)) {
                A03(A03, this.A00, timeline);
            }
        } else {
            for (int i = 0; i < this.A03.size(); i++) {
                A03(A03, this.A03.get(i), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(A03, this.A00, timeline);
            }
        }
        this.A04 = A03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C2289oV<C2247no, Timeline> c2289oV, C2247no c2247no, Timeline timeline) {
        if (c2247no == null) {
            return;
        }
        if (timeline.A0A(c2247no.A04) != -1) {
            c2289oV.A05(c2247no, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c2247no);
        if (existingTimeline == null) {
            return;
        }
        c2289oV.A05(c2247no, existingTimeline);
    }

    public static boolean A04(C2247no c2247no, Object obj, boolean z8, int i, int i4, int i9) {
        if (c2247no.A04.equals(obj)) {
            return (z8 && c2247no.A00 == i && c2247no.A01 == i4) || (!z8 && c2247no.A00 == -1 && c2247no.A02 == i9);
        }
        return false;
    }

    public final Timeline A05(C2247no c2247no) {
        return this.A04.get(c2247no);
    }

    public final C2247no A06() {
        return this.A00;
    }

    public final void A07(InterfaceC06023b interfaceC06023b) {
        this.A00 = A00(interfaceC06023b, this.A03, this.A01, this.A05);
        A02(interfaceC06023b.A7g());
    }
}
