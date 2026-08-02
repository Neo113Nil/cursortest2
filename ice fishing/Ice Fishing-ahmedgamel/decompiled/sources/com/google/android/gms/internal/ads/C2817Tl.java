package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import t0.AbstractC4987C;

/* renamed from: com.google.android.gms.internal.ads.Tl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2817Tl {

    /* renamed from: a, reason: collision with root package name */
    public int f28573a;

    /* renamed from: b, reason: collision with root package name */
    public int f28574b;

    /* renamed from: d, reason: collision with root package name */
    public int f28576d = 7;

    /* renamed from: c, reason: collision with root package name */
    public int[] f28575c = new int[8];

    public void a(int i, int i4) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i6 = this.f28576d;
        int i9 = i6 * 2;
        int[] iArr = this.f28575c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f28575c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i9 >= iArr.length) {
            int[] iArr3 = new int[i6 * 4];
            this.f28575c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f28575c;
        iArr4[i9] = i;
        iArr4[i9 + 1] = i4;
        this.f28576d++;
    }

    public void b(RecyclerView recyclerView, boolean z6) {
        this.f28576d = 0;
        int[] iArr = this.f28575c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC4987C abstractC4987C = recyclerView.f5185E;
        if (recyclerView.f5183D == null || abstractC4987C == null || !abstractC4987C.i) {
            return;
        }
        if (z6) {
            if (!recyclerView.f5234w.m()) {
                abstractC4987C.i(recyclerView.f5183D.a(), this);
            }
        } else if (!recyclerView.K()) {
            abstractC4987C.h(this.f28573a, this.f28574b, recyclerView.f5184D0, this);
        }
        int i = this.f28576d;
        if (i > abstractC4987C.f40598j) {
            abstractC4987C.f40598j = i;
            abstractC4987C.f40599k = z6;
            recyclerView.f5230u.k();
        }
    }

    public void c(int i) {
        int[] iArr = this.f28575c;
        int i4 = this.f28574b;
        iArr[i4] = i;
        int i6 = this.f28576d & (i4 + 1);
        this.f28574b = i6;
        int i9 = this.f28573a;
        if (i6 == i9) {
            int length = iArr.length;
            int i10 = length - i9;
            int i11 = length + length;
            int[] iArr2 = new int[i11];
            System.arraycopy(iArr, i9, iArr2, 0, i10);
            System.arraycopy(this.f28575c, 0, iArr2, i10, this.f28573a);
            this.f28575c = iArr2;
            this.f28573a = 0;
            this.f28574b = length;
            this.f28576d = i11 - 1;
        }
    }
}
