package com.anythink.basead.exoplayer.k;

import com.google.android.gms.internal.ads.Wv;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9203a = 32;

    /* renamed from: b, reason: collision with root package name */
    private int f9204b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f9205c;

    public m() {
        this((byte) 0);
    }

    private void a(long j6) {
        int i = this.f9204b;
        long[] jArr = this.f9205c;
        if (i == jArr.length) {
            this.f9205c = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f9205c;
        int i4 = this.f9204b;
        this.f9204b = i4 + 1;
        jArr2[i4] = j6;
    }

    private long[] b() {
        return Arrays.copyOf(this.f9205c, this.f9204b);
    }

    private m(byte b9) {
        this.f9205c = new long[32];
    }

    private long a(int i) {
        if (i >= 0 && i < this.f9204b) {
            return this.f9205c[i];
        }
        StringBuilder k9 = Wv.k(i, "Invalid index ", ", size is ");
        k9.append(this.f9204b);
        throw new IndexOutOfBoundsException(k9.toString());
    }

    private int a() {
        return this.f9204b;
    }
}
