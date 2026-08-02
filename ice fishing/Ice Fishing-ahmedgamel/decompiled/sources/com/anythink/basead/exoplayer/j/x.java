package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.j.h;

/* loaded from: classes.dex */
public final class x implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.a f9052a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.v f9053b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9054c;

    private x(h.a aVar, com.anythink.basead.exoplayer.k.v vVar, int i) {
        this.f9052a = aVar;
        this.f9053b = vVar;
        this.f9054c = i;
    }

    private w b() {
        return new w(this.f9052a.a(), this.f9053b, this.f9054c);
    }

    @Override // com.anythink.basead.exoplayer.j.h.a
    public final /* synthetic */ h a() {
        return new w(this.f9052a.a(), this.f9053b, this.f9054c);
    }
}
