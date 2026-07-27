package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import t0.AbstractC5019C;

/* renamed from: com.google.android.gms.internal.ads.Vl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2830Vl {

    /* renamed from: a, reason: collision with root package name */
    public int f28294a;

    /* renamed from: b, reason: collision with root package name */
    public int f28295b;

    /* renamed from: d, reason: collision with root package name */
    public int f28297d = 7;

    /* renamed from: c, reason: collision with root package name */
    public int[] f28296c = new int[8];

    public void a(int i, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i9 = this.f28297d;
        int i10 = i9 * 2;
        int[] iArr = this.f28296c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f28296c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int[] iArr3 = new int[i9 * 4];
            this.f28296c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f28296c;
        iArr4[i10] = i;
        iArr4[i10 + 1] = i4;
        this.f28297d++;
    }

    public void b(RecyclerView recyclerView, boolean z8) {
        this.f28297d = 0;
        int[] iArr = this.f28296c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC5019C abstractC5019C = recyclerView.f5330E;
        if (recyclerView.f5328D == null || abstractC5019C == null || !abstractC5019C.i) {
            return;
        }
        if (z8) {
            if (!recyclerView.f5380w.n()) {
                abstractC5019C.i(recyclerView.f5328D.a(), this);
            }
        } else if (!recyclerView.K()) {
            abstractC5019C.h(this.f28294a, this.f28295b, recyclerView.f5339I0, this);
        }
        int i = this.f28297d;
        if (i > abstractC5019C.f40570j) {
            abstractC5019C.f40570j = i;
            abstractC5019C.f40571k = z8;
            recyclerView.f5376u.k();
        }
    }

    public void c(int i) {
        int[] iArr = this.f28296c;
        int i4 = this.f28295b;
        iArr[i4] = i;
        int i9 = this.f28297d & (i4 + 1);
        this.f28295b = i9;
        int i10 = this.f28294a;
        if (i9 == i10) {
            int length = iArr.length;
            int i11 = length - i10;
            int i12 = length + length;
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f28296c, 0, iArr2, i11, this.f28294a);
            this.f28296c = iArr2;
            this.f28294a = 0;
            this.f28295b = length;
            this.f28297d = i12 - 1;
        }
    }
}
