package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    public final j f7303a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7304b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7305c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f7306d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7307e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f7308f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7309g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7310h;

    public m(j jVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j9) {
        C0544a.a(iArr.length == jArr2.length);
        C0544a.a(jArr.length == jArr2.length);
        C0544a.a(iArr2.length == jArr2.length);
        this.f7303a = jVar;
        this.f7305c = jArr;
        this.f7306d = iArr;
        this.f7307e = i;
        this.f7308f = jArr2;
        this.f7309g = iArr2;
        this.f7310h = j9;
        this.f7304b = jArr.length;
    }

    public final int a(long j9) {
        for (int a9 = af.a(this.f7308f, j9, false); a9 >= 0; a9--) {
            if ((this.f7309g[a9] & 1) != 0) {
                return a9;
            }
        }
        return -1;
    }

    public final int b(long j9) {
        for (int a9 = af.a(this.f7308f, j9, true, false); a9 < this.f7308f.length; a9++) {
            if ((this.f7309g[a9] & 1) != 0) {
                return a9;
            }
        }
        return -1;
    }
}
