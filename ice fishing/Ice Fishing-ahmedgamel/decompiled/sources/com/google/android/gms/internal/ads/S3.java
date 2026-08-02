package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class S3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f28120d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28121e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f28122f;

    /* renamed from: g, reason: collision with root package name */
    public int f28123g;

    /* renamed from: h, reason: collision with root package name */
    public int f28124h;
    public Rect i;

    /* renamed from: b, reason: collision with root package name */
    public long f28118b = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: c, reason: collision with root package name */
    public long f28119c = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f28117a = new int[4];

    /* renamed from: j, reason: collision with root package name */
    public int f28125j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f28126k = -1;

    public static int a(int i, int i4) {
        return (i & 16777215) | ((i4 * 17) << 24);
    }

    public final void b(C4256yr c4256yr, boolean z6, Rect rect, int[] iArr) {
        int i;
        int i4;
        int i6 = !z6 ? 1 : 0;
        int width = rect.width();
        int i9 = i6 * width;
        int height = rect.height();
        while (true) {
            int i10 = 0;
            do {
                int i11 = 0;
                for (int i12 = 1; i11 < i12 && i12 <= 64; i12 <<= 2) {
                    if (c4256yr.b() < 4) {
                        i = -1;
                        i4 = 0;
                        break;
                    }
                    i11 = (i11 << 4) | c4256yr.h(4);
                }
                i = i11 & 3;
                i4 = i11 < 4 ? width : i11 >> 2;
                int min = Math.min(i4, width - i10);
                if (min > 0) {
                    int i13 = i9 + min;
                    Arrays.fill(iArr, i9, i13, this.f28117a[i]);
                    i10 += min;
                    i9 = i13;
                }
            } while (i10 < width);
            i6 += 2;
            if (i6 >= height) {
                return;
            }
            i9 = i6 * width;
            c4256yr.k();
        }
    }
}
