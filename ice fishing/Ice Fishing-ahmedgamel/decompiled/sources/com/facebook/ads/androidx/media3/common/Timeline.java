package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.instagram.common.viewpoint.core.AR;
import com.instagram.common.viewpoint.core.AS;
import com.instagram.common.viewpoint.core.AbstractC06243y;
import com.instagram.common.viewpoint.core.AnonymousClass22;
import com.instagram.common.viewpoint.core.AnonymousClass23;
import com.instagram.common.viewpoint.core.AnonymousClass24;
import com.instagram.common.viewpoint.core.AnonymousClass43;
import com.instagram.common.viewpoint.core.BP;
import com.instagram.common.viewpoint.core.C2365pj;
import com.instagram.common.viewpoint.core.C2367pl;
import com.instagram.common.viewpoint.core.C2K;
import com.instagram.common.viewpoint.core.C5C;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Timeline implements AnonymousClass24 {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new AS();
    public static final String A05 = C5C.A0h(0);
    public static final String A03 = C5C.A0h(1);
    public static final String A04 = C5C.A0h(2);
    public static final AnonymousClass23<Timeline> A01 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pq
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            Timeline A022;
            A022 = Timeline.A02(bundle);
            return A022;
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C2367pl A0I(int i, C2367pl c2367pl, boolean z3);

    public abstract C2365pj A0L(int i, C2365pj c2365pj, long j6);

    public abstract Object A0M(int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static AR A02(Bundle bundle) {
        BP A042 = A04(C2365pj.A0J, AnonymousClass43.A00(bundle, A05));
        BP A043 = A04(C2367pl.A08, AnonymousClass43.A00(bundle, A03));
        int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(A042.size());
        }
        return new AR(A042, A043, intArray);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends AnonymousClass24> BP<T> A04(AnonymousClass23<T> anonymousClass23, IBinder iBinder) {
        if (iBinder == null) {
            return BP.A03();
        }
        C2K c2k = new C2K();
        BP<Bundle> A002 = AnonymousClass22.A00(iBinder);
        for (int i = 0; i < A002.size(); i++) {
            c2k.A04(anonymousClass23.A6f(A002.get(i)));
        }
        return c2k.A05();
    }

    public static int[] A05(int i) {
        int[] iArr = new int[i];
        for (int i6 = 0; i6 < i; i6++) {
            iArr[i6] = i6;
            int i9 = A00[1].charAt(20);
            if (i9 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i, int i6, boolean z3) {
        switch (i6) {
            case 0:
                if (i == A0C(z3)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                int A0C = A0C(z3);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i == A0C) {
                    return A0B(z3);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i, C2367pl c2367pl, C2365pj c2365pj, int i6, boolean z3) {
        int i9 = A0H(i, c2367pl).A00;
        int windowIndex = A0K(i9, c2365pj).A01;
        if (windowIndex == i) {
            int nextWindowIndex = A08(i9, i6, z3);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c2365pj).A00;
            return windowIndex2;
        }
        int windowIndex3 = i + 1;
        return windowIndex3;
    }

    public int A0B(boolean z3) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z3) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C2365pj c2365pj, C2367pl c2367pl, int i, long j6) {
        return A0E(c2365pj, c2367pl, i, j6);
    }

    public final Pair<Object, Long> A0E(C2365pj c2365pj, C2367pl c2367pl, int i, long j6) {
        return (Pair) AbstractC06243y.A01(A0G(c2365pj, c2367pl, i, j6, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C2365pj c2365pj, C2367pl c2367pl, int i, long j6, long j9) {
        return A0G(c2365pj, c2367pl, i, j6, j9);
    }

    public final Pair<Object, Long> A0G(C2365pj c2365pj, C2367pl c2367pl, int i, long j6, long j9) {
        AbstractC06243y.A00(i, 0, A07());
        A0L(i, c2365pj, j9);
        if (j6 == b.f6382b) {
            j6 = c2365pj.A05();
            if (j6 == b.f6382b) {
                return null;
            }
        }
        int i6 = c2365pj.A00;
        A0H(i6, c2367pl);
        while (i6 < c2365pj.A01 && c2367pl.A02 != j6 && A0H(i6 + 1, c2367pl).A02 <= j6) {
            i6++;
        }
        A0I(i6, c2367pl, true);
        long j10 = j6 - c2367pl.A02;
        if (c2367pl.A01 != b.f6382b) {
            long j11 = c2367pl.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            j10 = Math.min(j10, j11 - 1);
        }
        return Pair.create(AbstractC06243y.A01(c2367pl.A04), Long.valueOf(Math.max(0L, j10)));
    }

    public final C2367pl A0H(int i, C2367pl c2367pl) {
        return A0I(i, c2367pl, false);
    }

    public C2367pl A0J(Object obj, C2367pl c2367pl) {
        return A0I(A0A(obj), c2367pl, true);
    }

    public final C2365pj A0K(int i, C2365pj c2365pj) {
        return A0L(i, c2365pj, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i, C2367pl c2367pl, C2365pj c2365pj, int i6, boolean z3) {
        return A09(i, c2367pl, c2365pj, i6, z3) == -1;
    }

    public final boolean equals(Object obj) {
        int A0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C2365pj c2365pj = new C2365pj();
        C2367pl c2367pl = new C2367pl();
        C2365pj window = new C2365pj();
        C2367pl otherPeriod = new C2367pl();
        for (int i = 0; i < A07(); i++) {
            if (!A0K(i, c2365pj).equals(timeline.A0K(i, window))) {
                return false;
            }
        }
        for (int i6 = 0; i6 < A06(); i6++) {
            boolean equals = A0I(i6, c2367pl, true).equals(timeline.A0I(i6, otherPeriod, true));
            if (A00[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
            strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
            if (!equals) {
                return false;
            }
        }
        int A0B = A0B(true);
        if (A0B != timeline.A0B(true) || (A0C = A0C(true)) != timeline.A0C(true)) {
            return false;
        }
        while (A0B != A0C) {
            int A08 = A08(A0B, 0, true);
            if (A08 != timeline.A08(A0B, 0, true)) {
                return false;
            }
            A0B = A08;
        }
        return true;
    }

    public final int hashCode() {
        C2365pj c2365pj = new C2365pj();
        C2367pl c2367pl = new C2367pl();
        int result = 7 * 31;
        int i = result + A07();
        for (int i6 = 0; i6 < A07(); i6++) {
            C2365pj window = A0K(i6, c2365pj);
            i = (i * 31) + window.hashCode();
        }
        int result2 = i * 31;
        int i9 = result2 + A06();
        for (int i10 = 0; i10 < A06(); i10++) {
            i9 = (i9 * 31) + A0I(i10, c2367pl, true).hashCode();
        }
        int A0B = A0B(true);
        while (A0B != -1) {
            int windowIndex = i9 * 31;
            i9 = windowIndex + A0B;
            A0B = A08(A0B, 0, true);
        }
        return i9;
    }
}
