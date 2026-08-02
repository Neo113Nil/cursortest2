package com.google.android.gms.internal.ads;

import java.util.Arrays;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.re, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3865re {

    /* renamed from: b, reason: collision with root package name */
    public static final C3865re f34414b = new C3865re(new C2920a[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final C2920a f34415c;

    /* renamed from: a, reason: collision with root package name */
    public final C2920a[] f34416a;

    static {
        C2920a c2920a = new C2920a(-1, new int[0], new C2977b2[0], new long[0], new String[0], new W6[0]);
        int[] iArr = c2920a.f29756d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c2920a.f29757e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, com.anythink.basead.exoplayer.b.f7168b);
        C2977b2[] c2977b2Arr = (C2977b2[]) Arrays.copyOf(c2920a.f29755c, 0);
        String[] strArr = (String[]) Arrays.copyOf(c2920a.f29758f, 0);
        W6[] w6Arr = c2920a.f29759g;
        f34415c = new C2920a(0, copyOf, c2977b2Arr, copyOf2, strArr, (W6[]) Arrays.copyOf(w6Arr, Math.max(0, w6Arr.length)));
        String str = AbstractC3182eu.f30782a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C3865re(C2920a[] c2920aArr) {
        this.f34416a = c2920aArr;
    }

    public final C2920a a(int i) {
        return i < 0 ? f34415c : this.f34416a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3865re.class == obj.getClass() && Arrays.equals(this.f34416a, ((C3865re) obj).f34416a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34416a) + (((int) com.anythink.basead.exoplayer.b.f7168b) * 961);
    }

    public final String toString() {
        return AbstractC5128c.f("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
