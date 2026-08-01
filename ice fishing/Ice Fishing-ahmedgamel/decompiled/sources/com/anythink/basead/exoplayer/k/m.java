package com.anythink.basead.exoplayer.k;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8417a = 32;

    /* renamed from: b, reason: collision with root package name */
    private int f8418b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f8419c;

    public m() {
        this((byte) 0);
    }

    private void a(long j6) {
        int i = this.f8418b;
        long[] jArr = this.f8419c;
        if (i == jArr.length) {
            this.f8419c = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f8419c;
        int i6 = this.f8418b;
        this.f8418b = i6 + 1;
        jArr2[i6] = j6;
    }

    private long[] b() {
        return Arrays.copyOf(this.f8419c, this.f8418b);
    }

    private m(byte b9) {
        this.f8419c = new long[32];
    }

    private long a(int i) {
        if (i >= 0 && i < this.f8418b) {
            return this.f8419c[i];
        }
        StringBuilder i6 = AbstractC4404f.i(i, "Invalid index ", ", size is ");
        i6.append(this.f8418b);
        throw new IndexOutOfBoundsException(i6.toString());
    }

    private int a() {
        return this.f8418b;
    }
}
