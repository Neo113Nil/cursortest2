package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import t0.AbstractC4990E;

/* renamed from: com.google.android.gms.internal.ads.Sl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2780Sl {

    /* renamed from: a, reason: collision with root package name */
    public int f27544a;

    /* renamed from: b, reason: collision with root package name */
    public int f27545b;

    /* renamed from: d, reason: collision with root package name */
    public int f27547d = 7;

    /* renamed from: c, reason: collision with root package name */
    public int[] f27546c = new int[8];

    public void a(int i, int i6) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i9 = this.f27547d;
        int i10 = i9 * 2;
        int[] iArr = this.f27546c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f27546c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int[] iArr3 = new int[i9 * 4];
            this.f27546c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f27546c;
        iArr4[i10] = i;
        iArr4[i10 + 1] = i6;
        this.f27547d++;
    }

    public void b(RecyclerView recyclerView, boolean z3) {
        this.f27547d = 0;
        int[] iArr = this.f27546c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC4990E abstractC4990E = recyclerView.f5218E;
        if (recyclerView.f5216D == null || abstractC4990E == null || !abstractC4990E.i) {
            return;
        }
        if (z3) {
            if (!recyclerView.f5268w.m()) {
                abstractC4990E.i(recyclerView.f5216D.a(), this);
            }
        } else if (!recyclerView.K()) {
            abstractC4990E.h(this.f27544a, this.f27545b, recyclerView.f5227I0, this);
        }
        int i = this.f27547d;
        if (i > abstractC4990E.f40548j) {
            abstractC4990E.f40548j = i;
            abstractC4990E.f40549k = z3;
            recyclerView.f5264u.k();
        }
    }

    public void c(int i) {
        int[] iArr = this.f27546c;
        int i6 = this.f27545b;
        iArr[i6] = i;
        int i9 = this.f27547d & (i6 + 1);
        this.f27545b = i9;
        int i10 = this.f27544a;
        if (i9 == i10) {
            int length = iArr.length;
            int i11 = length - i10;
            int i12 = length + length;
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f27546c, 0, iArr2, i11, this.f27544a);
            this.f27546c = iArr2;
            this.f27544a = 0;
            this.f27545b = length;
            this.f27547d = i12 - 1;
        }
    }
}
