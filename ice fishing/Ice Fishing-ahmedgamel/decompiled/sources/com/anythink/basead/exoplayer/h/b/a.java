package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public abstract class a extends i {

    /* renamed from: a, reason: collision with root package name */
    public final long f8306a;

    /* renamed from: k, reason: collision with root package name */
    private b f8307k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f8308l;

    public a(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j6, long j9, long j10, long j11) {
        super(hVar, kVar, mVar, i, obj, j6, j9, j11);
        this.f8306a = j10;
    }

    public final void a(b bVar) {
        this.f8307k = bVar;
        this.f8308l = bVar.a();
    }

    public final b c() {
        return this.f8307k;
    }

    public final int a(int i) {
        return this.f8308l[i];
    }
}
