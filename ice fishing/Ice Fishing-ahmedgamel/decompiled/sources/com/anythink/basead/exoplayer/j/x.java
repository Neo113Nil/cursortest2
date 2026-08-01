package com.anythink.basead.exoplayer.j;

import com.anythink.basead.exoplayer.j.h;

/* loaded from: classes.dex */
public final class x implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.a f8266a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.v f8267b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8268c;

    private x(h.a aVar, com.anythink.basead.exoplayer.k.v vVar, int i) {
        this.f8266a = aVar;
        this.f8267b = vVar;
        this.f8268c = i;
    }

    private w b() {
        return new w(this.f8266a.a(), this.f8267b, this.f8268c);
    }

    @Override // com.anythink.basead.exoplayer.j.h.a
    public final /* synthetic */ h a() {
        return new w(this.f8266a.a(), this.f8267b, this.f8268c);
    }
}
