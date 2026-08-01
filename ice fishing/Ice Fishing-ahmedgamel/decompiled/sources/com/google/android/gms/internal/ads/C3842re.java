package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.re, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3842re {

    /* renamed from: b, reason: collision with root package name */
    public static final C3842re f33641b = new C3842re(new C2897a[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final C2897a f33642c;

    /* renamed from: a, reason: collision with root package name */
    public final C2897a[] f33643a;

    static {
        C2897a c2897a = new C2897a(-1, new int[0], new C2954b2[0], new long[0], new String[0], new W6[0]);
        int[] iArr = c2897a.f28986d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c2897a.f28987e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, com.anythink.basead.exoplayer.b.f6382b);
        C2954b2[] c2954b2Arr = (C2954b2[]) Arrays.copyOf(c2897a.f28985c, 0);
        String[] strArr = (String[]) Arrays.copyOf(c2897a.f28988f, 0);
        W6[] w6Arr = c2897a.f28989g;
        f33642c = new C2897a(0, copyOf, c2954b2Arr, copyOf2, strArr, (W6[]) Arrays.copyOf(w6Arr, Math.max(0, w6Arr.length)));
        String str = AbstractC3159eu.f29993a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C3842re(C2897a[] c2897aArr) {
        this.f33643a = c2897aArr;
    }

    public final C2897a a(int i) {
        return i < 0 ? f33642c : this.f33643a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3842re.class == obj.getClass() && Arrays.equals(this.f33643a, ((C3842re) obj).f33643a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f33643a) + (((int) com.anythink.basead.exoplayer.b.f6382b) * 961);
    }

    public final String toString() {
        return u1.h.f("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
