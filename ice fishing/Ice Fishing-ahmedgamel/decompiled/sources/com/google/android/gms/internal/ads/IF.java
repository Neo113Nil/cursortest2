package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class IF {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f26216a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f26217b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f26218c;

    public IF(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f26216a = jArr;
        this.f26217b = jArr2;
        this.f26218c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(IF r32, int i) {
        QC.f(this.f26216a, r32.f26216a, i);
        QC.f(this.f26217b, r32.f26217b, i);
        QC.f(this.f26218c, r32.f26218c, i);
    }

    public IF() {
        IF r02 = MA.f27046G;
        this.f26216a = Arrays.copyOf(r02.f26216a, 10);
        this.f26217b = Arrays.copyOf(r02.f26217b, 10);
        this.f26218c = Arrays.copyOf(r02.f26218c, 10);
    }
}
