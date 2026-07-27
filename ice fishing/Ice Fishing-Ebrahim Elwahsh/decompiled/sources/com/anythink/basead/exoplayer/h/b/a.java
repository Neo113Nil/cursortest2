package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public abstract class a extends i {

    /* renamed from: a, reason: collision with root package name */
    public final long f7677a;

    /* renamed from: k, reason: collision with root package name */
    private b f7678k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f7679l;

    public a(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j9, long j10, long j11, long j12) {
        super(hVar, kVar, mVar, i, obj, j9, j10, j12);
        this.f7677a = j11;
    }

    public final void a(b bVar) {
        this.f7678k = bVar;
        this.f7679l = bVar.a();
    }

    public final b c() {
        return this.f7678k;
    }

    public final int a(int i) {
        return this.f7679l[i];
    }
}
