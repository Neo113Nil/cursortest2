package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public long f27664a;

    /* renamed from: b, reason: collision with root package name */
    public long f27665b;

    /* renamed from: c, reason: collision with root package name */
    public long f27666c;

    /* renamed from: d, reason: collision with root package name */
    public long f27667d;

    /* renamed from: e, reason: collision with root package name */
    public long f27668e;

    /* renamed from: f, reason: collision with root package name */
    public long f27669f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f27670g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f27671h;

    public final void a() {
        this.f27667d = 0L;
        this.f27668e = 0L;
        this.f27669f = 0L;
        this.f27671h = 0;
        Arrays.fill(this.f27670g, false);
    }

    public final boolean b() {
        return this.f27667d > 15 && this.f27671h == 0;
    }

    public final void c(long j6) {
        long j9 = this.f27667d;
        if (j9 == 0) {
            this.f27664a = j6;
        } else if (j9 == 1) {
            long j10 = j6 - this.f27664a;
            this.f27665b = j10;
            this.f27669f = j10;
            this.f27668e = 1L;
        } else {
            long j11 = j6 - this.f27666c;
            long abs = Math.abs(j11 - this.f27665b);
            int i = (int) (j9 % 15);
            boolean[] zArr = this.f27670g;
            if (abs <= 1000000) {
                this.f27668e++;
                this.f27669f += j11;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f27671h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f27671h++;
            }
        }
        this.f27667d++;
        this.f27666c = j6;
    }
}
