package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class IF {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f25473a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f25474b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f25475c;

    public IF(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f25473a = jArr;
        this.f25474b = jArr2;
        this.f25475c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(IF r32, int i) {
        QC.f(this.f25473a, r32.f25473a, i);
        QC.f(this.f25474b, r32.f25474b, i);
        QC.f(this.f25475c, r32.f25475c, i);
    }

    public IF() {
        IF r02 = MA.f26255G;
        this.f25473a = Arrays.copyOf(r02.f25473a, 10);
        this.f25474b = Arrays.copyOf(r02.f25474b, 10);
        this.f25475c = Arrays.copyOf(r02.f25475c, 10);
    }
}
