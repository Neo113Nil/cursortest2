package com.anythink.basead.exoplayer.j;

import android.net.Uri;

/* loaded from: classes.dex */
public final class w implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f9049a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.v f9050b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9051c;

    public w(h hVar, com.anythink.basead.exoplayer.k.v vVar, int i) {
        this.f9049a = (h) com.anythink.basead.exoplayer.k.a.a(hVar);
        this.f9050b = (com.anythink.basead.exoplayer.k.v) com.anythink.basead.exoplayer.k.a.a(vVar);
        this.f9051c = i;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        this.f9050b.a(this.f9051c);
        return this.f9049a.a(kVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f9049a.b();
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        this.f9050b.a(this.f9051c);
        return this.f9049a.a(bArr, i, i4);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f9049a.a();
    }
}
