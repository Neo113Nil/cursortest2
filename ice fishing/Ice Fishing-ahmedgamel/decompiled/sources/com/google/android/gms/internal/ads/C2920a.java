package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2920a {

    /* renamed from: a, reason: collision with root package name */
    public final int f29753a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f29754b;

    /* renamed from: c, reason: collision with root package name */
    public final C2977b2[] f29755c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f29756d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f29757e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f29758f;

    /* renamed from: g, reason: collision with root package name */
    public final W6[] f29759g;

    static {
        String str = AbstractC3182eu.f30782a;
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

    public C2920a(int i, int[] iArr, C2977b2[] c2977b2Arr, long[] jArr, String[] strArr, W6[] w6Arr) {
        Uri uri;
        int length = iArr.length;
        int length2 = c2977b2Arr.length;
        int i4 = 0;
        AbstractC2792Sd.i(length == length2);
        AbstractC2792Sd.i(length == w6Arr.length);
        this.f29753a = i;
        this.f29756d = iArr;
        this.f29755c = c2977b2Arr;
        this.f29757e = jArr;
        this.f29754b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f29754b;
            if (i4 >= uriArr.length) {
                this.f29758f = strArr;
                this.f29759g = w6Arr;
                return;
            }
            C2977b2 c2977b2 = c2977b2Arr[i4];
            if (c2977b2 == null) {
                uri = null;
            } else {
                L0 l02 = c2977b2.f29973b;
                l02.getClass();
                uri = l02.f26806a;
            }
            uriArr[i4] = uri;
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2920a.class == obj.getClass()) {
            C2920a c2920a = (C2920a) obj;
            if (this.f29753a == c2920a.f29753a && Arrays.equals(this.f29755c, c2920a.f29755c) && Arrays.equals(this.f29756d, c2920a.f29756d) && Arrays.equals(this.f29757e, c2920a.f29757e) && Arrays.equals(this.f29758f, c2920a.f29758f) && Arrays.equals(this.f29759g, c2920a.f29759g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f29759g) + ((((Arrays.hashCode(this.f29757e) + ((Arrays.hashCode(this.f29756d) + ((Arrays.hashCode(this.f29755c) + (((this.f29753a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f29758f)) * 31)) * 31;
    }
}
