package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2897a {

    /* renamed from: a, reason: collision with root package name */
    public final int f28983a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f28984b;

    /* renamed from: c, reason: collision with root package name */
    public final C2954b2[] f28985c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f28986d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f28987e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f28988f;

    /* renamed from: g, reason: collision with root package name */
    public final W6[] f28989g;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public C2897a(int i, int[] iArr, C2954b2[] c2954b2Arr, long[] jArr, String[] strArr, W6[] w6Arr) {
        Uri uri;
        int length = iArr.length;
        int length2 = c2954b2Arr.length;
        int i6 = 0;
        AbstractC2772Sd.i(length == length2);
        AbstractC2772Sd.i(length == w6Arr.length);
        this.f28983a = i;
        this.f28986d = iArr;
        this.f28985c = c2954b2Arr;
        this.f28987e = jArr;
        this.f28984b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f28984b;
            if (i6 >= uriArr.length) {
                this.f28988f = strArr;
                this.f28989g = w6Arr;
                return;
            }
            C2954b2 c2954b2 = c2954b2Arr[i6];
            if (c2954b2 == null) {
                uri = null;
            } else {
                L0 l02 = c2954b2.f29185b;
                l02.getClass();
                uri = l02.f26006a;
            }
            uriArr[i6] = uri;
            i6++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2897a.class == obj.getClass()) {
            C2897a c2897a = (C2897a) obj;
            if (this.f28983a == c2897a.f28983a && Arrays.equals(this.f28985c, c2897a.f28985c) && Arrays.equals(this.f28986d, c2897a.f28986d) && Arrays.equals(this.f28987e, c2897a.f28987e) && Arrays.equals(this.f28988f, c2897a.f28988f) && Arrays.equals(this.f28989g, c2897a.f28989g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f28989g) + ((((Arrays.hashCode(this.f28987e) + ((Arrays.hashCode(this.f28986d) + ((Arrays.hashCode(this.f28985c) + (((this.f28983a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f28988f)) * 31)) * 31;
    }
}
