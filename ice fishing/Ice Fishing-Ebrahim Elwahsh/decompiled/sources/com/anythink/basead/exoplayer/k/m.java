package com.anythink.basead.exoplayer.k;

import com.google.android.gms.internal.ads.CL;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8574a = 32;

    /* renamed from: b, reason: collision with root package name */
    private int f8575b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f8576c;

    public m() {
        this((byte) 0);
    }

    private void a(long j9) {
        int i = this.f8575b;
        long[] jArr = this.f8576c;
        if (i == jArr.length) {
            this.f8576c = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f8576c;
        int i4 = this.f8575b;
        this.f8575b = i4 + 1;
        jArr2[i4] = j9;
    }

    private long[] b() {
        return Arrays.copyOf(this.f8576c, this.f8575b);
    }

    private m(byte b9) {
        this.f8576c = new long[32];
    }

    private long a(int i) {
        if (i >= 0 && i < this.f8575b) {
            return this.f8576c[i];
        }
        StringBuilder l9 = CL.l(i, "Invalid index ", ", size is ");
        l9.append(this.f8575b);
        throw new IndexOutOfBoundsException(l9.toString());
    }

    private int a() {
        return this.f8575b;
    }
}
