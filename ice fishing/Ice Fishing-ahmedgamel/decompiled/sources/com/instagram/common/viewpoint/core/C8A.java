package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.8A, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8A {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C2248no A00;
    public C2248no A01;
    public C2248no A02;
    public BP<C2248no> A03 = BP.A03();
    public AbstractC2292oX<C2248no, Timeline> A04 = AbstractC2292oX.A04();
    public final C2367pl A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2248no A00(InterfaceC06033b interfaceC06033b, BP<C2248no> bp, C2248no c2248no, C2367pl c2367pl) {
        int i;
        int i6;
        Timeline A7g = interfaceC06033b.A7g();
        int A7c = interfaceC06033b.A7c();
        Object A0M = A7g.A0N() ? null : A7g.A0M(A7c);
        if (!interfaceC06033b.AAd()) {
            boolean A0N = A7g.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (!A0N) {
                i = A7g.A0H(A7c, c2367pl).A07(C5C.A0O(interfaceC06033b.A7e()) - c2367pl.A0C());
                for (i6 = 0; i6 < bp.size(); i6++) {
                    C2248no c2248no2 = bp.get(i6);
                    if (A04(c2248no2, A0M, interfaceC06033b.AAd(), interfaceC06033b.A7Y(), interfaceC06033b.A7Z(), i)) {
                        return c2248no2;
                    }
                }
                if (bp.isEmpty() && c2248no != null) {
                    if (!A04(c2248no, A0M, interfaceC06033b.AAd(), interfaceC06033b.A7Y(), interfaceC06033b.A7Z(), i)) {
                        return c2248no;
                    }
                }
                return null;
            }
        }
        i = -1;
        while (i6 < bp.size()) {
        }
        if (bp.isEmpty()) {
            if (!A04(c2248no, A0M, interfaceC06033b.AAd(), interfaceC06033b.A7Y(), interfaceC06033b.A7Z(), i)) {
            }
        }
        return null;
    }

    public C8A(C2367pl c2367pl) {
        this.A05 = c2367pl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C2290oV<C2248no, Timeline> A03 = AbstractC2292oX.A03();
        if (this.A03.isEmpty()) {
            A03(A03, this.A01, timeline);
            C2248no c2248no = this.A02;
            C2248no c2248no2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!CB.A01(c2248no, c2248no2)) {
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
    private void A03(C2290oV<C2248no, Timeline> c2290oV, C2248no c2248no, Timeline timeline) {
        if (c2248no == null) {
            return;
        }
        if (timeline.A0A(c2248no.A04) != -1) {
            c2290oV.A05(c2248no, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c2248no);
        if (existingTimeline == null) {
            return;
        }
        c2290oV.A05(c2248no, existingTimeline);
    }

    public static boolean A04(C2248no c2248no, Object obj, boolean z3, int i, int i6, int i9) {
        if (c2248no.A04.equals(obj)) {
            return (z3 && c2248no.A00 == i && c2248no.A01 == i6) || (!z3 && c2248no.A00 == -1 && c2248no.A02 == i9);
        }
        return false;
    }

    public final Timeline A05(C2248no c2248no) {
        return this.A04.get(c2248no);
    }

    public final C2248no A06() {
        return this.A00;
    }

    public final void A07(InterfaceC06033b interfaceC06033b) {
        this.A00 = A00(interfaceC06033b, this.A03, this.A01, this.A05);
        A02(interfaceC06033b.A7g());
    }
}
