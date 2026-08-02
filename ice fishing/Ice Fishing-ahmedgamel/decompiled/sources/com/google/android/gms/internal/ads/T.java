package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public long f28447a;

    /* renamed from: b, reason: collision with root package name */
    public long f28448b;

    /* renamed from: c, reason: collision with root package name */
    public long f28449c;

    /* renamed from: d, reason: collision with root package name */
    public long f28450d;

    /* renamed from: e, reason: collision with root package name */
    public long f28451e;

    /* renamed from: f, reason: collision with root package name */
    public long f28452f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28453g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f28454h;

    public final void a() {
        this.f28450d = 0L;
        this.f28451e = 0L;
        this.f28452f = 0L;
        this.f28454h = 0;
        Arrays.fill(this.f28453g, false);
    }

    public final boolean b() {
        return this.f28450d > 15 && this.f28454h == 0;
    }

    public final void c(long j6) {
        long j9 = this.f28450d;
        if (j9 == 0) {
            this.f28447a = j6;
        } else if (j9 == 1) {
            long j10 = j6 - this.f28447a;
            this.f28448b = j10;
            this.f28452f = j10;
            this.f28451e = 1L;
        } else {
            long j11 = j6 - this.f28449c;
            long abs = Math.abs(j11 - this.f28448b);
            int i = (int) (j9 % 15);
            boolean[] zArr = this.f28453g;
            if (abs <= 1000000) {
                this.f28451e++;
                this.f28452f += j11;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f28454h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f28454h++;
            }
        }
        this.f28450d++;
        this.f28449c = j6;
    }
}
