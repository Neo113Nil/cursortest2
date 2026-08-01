package com.anythink.basead.exoplayer.j;

import android.net.Uri;

/* loaded from: classes.dex */
public final class w implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f8263a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.v f8264b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8265c;

    public w(h hVar, com.anythink.basead.exoplayer.k.v vVar, int i) {
        this.f8263a = (h) com.anythink.basead.exoplayer.k.a.a(hVar);
        this.f8264b = (com.anythink.basead.exoplayer.k.v) com.anythink.basead.exoplayer.k.a.a(vVar);
        this.f8265c = i;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        this.f8264b.a(this.f8265c);
        return this.f8263a.a(kVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8263a.b();
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i6) {
        this.f8264b.a(this.f8265c);
        return this.f8263a.a(bArr, i, i6);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8263a.a();
    }
}
