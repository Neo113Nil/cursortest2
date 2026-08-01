package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class S3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f27406d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27407e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f27408f;

    /* renamed from: g, reason: collision with root package name */
    public int f27409g;

    /* renamed from: h, reason: collision with root package name */
    public int f27410h;
    public Rect i;

    /* renamed from: b, reason: collision with root package name */
    public long f27404b = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: c, reason: collision with root package name */
    public long f27405c = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f27403a = new int[4];

    /* renamed from: j, reason: collision with root package name */
    public int f27411j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f27412k = -1;

    public static int a(int i, int i6) {
        return (i & 16777215) | ((i6 * 17) << 24);
    }

    public final void b(C4233yr c4233yr, boolean z3, Rect rect, int[] iArr) {
        int i;
        int i6;
        int i9 = !z3 ? 1 : 0;
        int width = rect.width();
        int i10 = i9 * width;
        int height = rect.height();
        while (true) {
            int i11 = 0;
            do {
                int i12 = 0;
                for (int i13 = 1; i12 < i13 && i13 <= 64; i13 <<= 2) {
                    if (c4233yr.b() < 4) {
                        i = -1;
                        i6 = 0;
                        break;
                    }
                    i12 = (i12 << 4) | c4233yr.h(4);
                }
                i = i12 & 3;
                i6 = i12 < 4 ? width : i12 >> 2;
                int min = Math.min(i6, width - i11);
                if (min > 0) {
                    int i14 = i10 + min;
                    Arrays.fill(iArr, i10, i14, this.f27403a[i]);
                    i11 += min;
                    i10 = i14;
                }
            } while (i11 < width);
            i9 += 2;
            if (i9 >= height) {
                return;
            }
            i10 = i9 * width;
            c4233yr.k();
        }
    }
}
