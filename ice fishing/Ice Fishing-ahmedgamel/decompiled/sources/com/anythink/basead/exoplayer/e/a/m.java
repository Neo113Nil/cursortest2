package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    public final j f7932a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7933b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7934c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f7935d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7936e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f7937f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7938g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7939h;

    public m(j jVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j6) {
        com.anythink.basead.exoplayer.k.a.a(iArr.length == jArr2.length);
        com.anythink.basead.exoplayer.k.a.a(jArr.length == jArr2.length);
        com.anythink.basead.exoplayer.k.a.a(iArr2.length == jArr2.length);
        this.f7932a = jVar;
        this.f7934c = jArr;
        this.f7935d = iArr;
        this.f7936e = i;
        this.f7937f = jArr2;
        this.f7938g = iArr2;
        this.f7939h = j6;
        this.f7933b = jArr.length;
    }

    public final int a(long j6) {
        for (int a9 = af.a(this.f7937f, j6, false); a9 >= 0; a9--) {
            if ((this.f7938g[a9] & 1) != 0) {
                return a9;
            }
        }
        return -1;
    }

    public final int b(long j6) {
        for (int a9 = af.a(this.f7937f, j6, true, false); a9 < this.f7937f.length; a9++) {
            if ((this.f7938g[a9] & 1) != 0) {
                return a9;
            }
        }
        return -1;
    }
}
