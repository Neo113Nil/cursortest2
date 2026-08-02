package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f7675a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7676b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7677c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7678d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f7679e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7680f;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f7676b = iArr;
        this.f7677c = jArr;
        this.f7678d = jArr2;
        this.f7679e = jArr3;
        int length = iArr.length;
        this.f7675a = length;
        if (length > 0) {
            this.f7680f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f7680f = 0L;
        }
    }

    private int b(long j6) {
        return af.a(this.f7679e, j6, true);
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final boolean a() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f7675a + ", sizes=" + Arrays.toString(this.f7676b) + ", offsets=" + Arrays.toString(this.f7677c) + ", timeUs=" + Arrays.toString(this.f7679e) + ", durationsUs=" + Arrays.toString(this.f7678d) + ")";
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final k.a a(long j6) {
        int a9 = af.a(this.f7679e, j6, true);
        l lVar = new l(this.f7679e[a9], this.f7677c[a9]);
        if (lVar.f7967b >= j6 || a9 == this.f7675a - 1) {
            return new k.a(lVar);
        }
        int i = a9 + 1;
        return new k.a(lVar, new l(this.f7679e[i], this.f7677c[i]));
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final long b() {
        return this.f7680f;
    }
}
