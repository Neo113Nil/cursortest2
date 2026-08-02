package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.instagram.common.viewpoint.core.AR;
import com.instagram.common.viewpoint.core.AS;
import com.instagram.common.viewpoint.core.AbstractC06443y;
import com.instagram.common.viewpoint.core.AnonymousClass22;
import com.instagram.common.viewpoint.core.AnonymousClass23;
import com.instagram.common.viewpoint.core.AnonymousClass24;
import com.instagram.common.viewpoint.core.AnonymousClass43;
import com.instagram.common.viewpoint.core.BP;
import com.instagram.common.viewpoint.core.C2385pj;
import com.instagram.common.viewpoint.core.C2387pl;
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

    public abstract C2387pl A0I(int i, C2387pl c2387pl, boolean z6);

    public abstract C2385pj A0L(int i, C2385pj c2385pj, long j6);

    public abstract Object A0M(int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static AR A02(Bundle bundle) {
        BP A042 = A04(C2385pj.A0J, AnonymousClass43.A00(bundle, A05));
        BP A043 = A04(C2387pl.A08, AnonymousClass43.A00(bundle, A03));
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
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = i4;
            int i6 = A00[1].charAt(20);
            if (i6 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i, int i4, boolean z6) {
        switch (i4) {
            case 0:
                if (i == A0C(z6)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                int A0C = A0C(z6);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i == A0C) {
                    return A0B(z6);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i, C2387pl c2387pl, C2385pj c2385pj, int i4, boolean z6) {
        int i6 = A0H(i, c2387pl).A00;
        int windowIndex = A0K(i6, c2385pj).A01;
        if (windowIndex == i) {
            int nextWindowIndex = A08(i6, i4, z6);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c2385pj).A00;
            return windowIndex2;
        }
        int windowIndex3 = i + 1;
        return windowIndex3;
    }

    public int A0B(boolean z6) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z6) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C2385pj c2385pj, C2387pl c2387pl, int i, long j6) {
        return A0E(c2385pj, c2387pl, i, j6);
    }

    public final Pair<Object, Long> A0E(C2385pj c2385pj, C2387pl c2387pl, int i, long j6) {
        return (Pair) AbstractC06443y.A01(A0G(c2385pj, c2387pl, i, j6, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C2385pj c2385pj, C2387pl c2387pl, int i, long j6, long j9) {
        return A0G(c2385pj, c2387pl, i, j6, j9);
    }

    public final Pair<Object, Long> A0G(C2385pj c2385pj, C2387pl c2387pl, int i, long j6, long j9) {
        AbstractC06443y.A00(i, 0, A07());
        A0L(i, c2385pj, j9);
        if (j6 == b.f7168b) {
            j6 = c2385pj.A05();
            if (j6 == b.f7168b) {
                return null;
            }
        }
        int i4 = c2385pj.A00;
        A0H(i4, c2387pl);
        while (i4 < c2385pj.A01 && c2387pl.A02 != j6 && A0H(i4 + 1, c2387pl).A02 <= j6) {
            i4++;
        }
        A0I(i4, c2387pl, true);
        long j10 = j6 - c2387pl.A02;
        if (c2387pl.A01 != b.f7168b) {
            long j11 = c2387pl.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            j10 = Math.min(j10, j11 - 1);
        }
        return Pair.create(AbstractC06443y.A01(c2387pl.A04), Long.valueOf(Math.max(0L, j10)));
    }

    public final C2387pl A0H(int i, C2387pl c2387pl) {
        return A0I(i, c2387pl, false);
    }

    public C2387pl A0J(Object obj, C2387pl c2387pl) {
        return A0I(A0A(obj), c2387pl, true);
    }

    public final C2385pj A0K(int i, C2385pj c2385pj) {
        return A0L(i, c2385pj, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i, C2387pl c2387pl, C2385pj c2385pj, int i4, boolean z6) {
        return A09(i, c2387pl, c2385pj, i4, z6) == -1;
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
        C2385pj c2385pj = new C2385pj();
        C2387pl c2387pl = new C2387pl();
        C2385pj window = new C2385pj();
        C2387pl otherPeriod = new C2387pl();
        for (int i = 0; i < A07(); i++) {
            if (!A0K(i, c2385pj).equals(timeline.A0K(i, window))) {
                return false;
            }
        }
        for (int i4 = 0; i4 < A06(); i4++) {
            boolean equals = A0I(i4, c2387pl, true).equals(timeline.A0I(i4, otherPeriod, true));
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
        C2385pj c2385pj = new C2385pj();
        C2387pl c2387pl = new C2387pl();
        int result = 7 * 31;
        int i = result + A07();
        for (int i4 = 0; i4 < A07(); i4++) {
            C2385pj window = A0K(i4, c2385pj);
            i = (i * 31) + window.hashCode();
        }
        int result2 = i * 31;
        int i6 = result2 + A06();
        for (int i9 = 0; i9 < A06(); i9++) {
            i6 = (i6 * 31) + A0I(i9, c2387pl, true).hashCode();
        }
        int A0B = A0B(true);
        while (A0B != -1) {
            int windowIndex = i6 * 31;
            i6 = windowIndex + A0B;
            A0B = A08(A0B, 0, true);
        }
        return i6;
    }
}
