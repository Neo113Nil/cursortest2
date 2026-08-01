package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f6889a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f6890b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f6891c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f6892d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f6893e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6894f;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f6890b = iArr;
        this.f6891c = jArr;
        this.f6892d = jArr2;
        this.f6893e = jArr3;
        int length = iArr.length;
        this.f6889a = length;
        if (length > 0) {
            this.f6894f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f6894f = 0L;
        }
    }

    private int b(long j6) {
        return af.a(this.f6893e, j6, true);
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final boolean a() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f6889a + ", sizes=" + Arrays.toString(this.f6890b) + ", offsets=" + Arrays.toString(this.f6891c) + ", timeUs=" + Arrays.toString(this.f6893e) + ", durationsUs=" + Arrays.toString(this.f6892d) + ")";
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final k.a a(long j6) {
        int a9 = af.a(this.f6893e, j6, true);
        l lVar = new l(this.f6893e[a9], this.f6891c[a9]);
        if (lVar.f7181b >= j6 || a9 == this.f6889a - 1) {
            return new k.a(lVar);
        }
        int i = a9 + 1;
        return new k.a(lVar, new l(this.f6893e[i], this.f6891c[i]));
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final long b() {
        return this.f6894f;
    }
}
