package com.google.android.gms.internal.ads;

import java.util.Arrays;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.ve, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4071ve {

    /* renamed from: b, reason: collision with root package name */
    public static final C4071ve f34816b = new C4071ve(new C2904a[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final C2904a f34817c;

    /* renamed from: a, reason: collision with root package name */
    public final C2904a[] f34818a;

    static {
        C2904a c2904a = new C2904a(-1, new int[0], new C3235g2[0], new long[0], new String[0], new AbstractC2912a7[0]);
        int[] iArr = c2904a.f29141d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c2904a.f29142e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, com.anythink.basead.exoplayer.b.f6539b);
        C3235g2[] c3235g2Arr = (C3235g2[]) Arrays.copyOf(c2904a.f29140c, 0);
        String[] strArr = (String[]) Arrays.copyOf(c2904a.f29143f, 0);
        AbstractC2912a7[] abstractC2912a7Arr = c2904a.f29144g;
        f34817c = new C2904a(0, copyOf, c3235g2Arr, copyOf2, strArr, (AbstractC2912a7[]) Arrays.copyOf(abstractC2912a7Arr, Math.max(0, abstractC2912a7Arr.length)));
        String str = AbstractC3548lu.f32613a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C4071ve(C2904a[] c2904aArr) {
        this.f34818a = c2904aArr;
    }

    public final C2904a a(int i) {
        return i < 0 ? f34817c : this.f34818a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4071ve.class == obj.getClass() && Arrays.equals(this.f34818a, ((C4071ve) obj).f34818a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34818a) + (((int) com.anythink.basead.exoplayer.b.f6539b) * 961);
    }

    public final String toString() {
        return AbstractC5051n.f("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
