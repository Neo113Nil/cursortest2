package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f7046a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7047b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7048c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7049d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f7050e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7051f;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f7047b = iArr;
        this.f7048c = jArr;
        this.f7049d = jArr2;
        this.f7050e = jArr3;
        int length = iArr.length;
        this.f7046a = length;
        if (length > 0) {
            this.f7051f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f7051f = 0L;
        }
    }

    private int b(long j9) {
        return af.a(this.f7050e, j9, true);
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final boolean a() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f7046a + ", sizes=" + Arrays.toString(this.f7047b) + ", offsets=" + Arrays.toString(this.f7048c) + ", timeUs=" + Arrays.toString(this.f7050e) + ", durationsUs=" + Arrays.toString(this.f7049d) + ")";
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final k.a a(long j9) {
        int a9 = af.a(this.f7050e, j9, true);
        l lVar = new l(this.f7050e[a9], this.f7048c[a9]);
        if (lVar.f7338b >= j9 || a9 == this.f7046a - 1) {
            return new k.a(lVar);
        }
        int i = a9 + 1;
        return new k.a(lVar, new l(this.f7050e[i], this.f7048c[i]));
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final long b() {
        return this.f7051f;
    }
}
