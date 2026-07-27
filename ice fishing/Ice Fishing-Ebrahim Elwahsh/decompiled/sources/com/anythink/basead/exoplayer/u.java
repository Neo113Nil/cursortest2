package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.h.s;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ae f8905a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8906b;

    /* renamed from: c, reason: collision with root package name */
    public final s.a f8907c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8908d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8909e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8910f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8911g;

    /* renamed from: h, reason: collision with root package name */
    public final af f8912h;
    public final com.anythink.basead.exoplayer.i.i i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f8913j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f8914k;

    public u(ae aeVar, long j9, af afVar, com.anythink.basead.exoplayer.i.i iVar) {
        this(aeVar, null, new s.a(0), j9, b.f6539b, 1, false, afVar, iVar);
    }

    public final u a(s.a aVar, long j9, long j10) {
        return new u(this.f8905a, this.f8906b, aVar, j9, aVar.a() ? j10 : -9223372036854775807L, this.f8910f, this.f8911g, this.f8912h, this.i);
    }

    public final u b(int i) {
        u uVar = new u(this.f8905a, this.f8906b, this.f8907c, this.f8908d, this.f8909e, i, this.f8911g, this.f8912h, this.i);
        a(this, uVar);
        return uVar;
    }

    public u(ae aeVar, Object obj, s.a aVar, long j9, long j10, int i, boolean z8, af afVar, com.anythink.basead.exoplayer.i.i iVar) {
        this.f8905a = aeVar;
        this.f8906b = obj;
        this.f8907c = aVar;
        this.f8908d = j9;
        this.f8909e = j10;
        this.f8913j = j9;
        this.f8914k = j9;
        this.f8910f = i;
        this.f8911g = z8;
        this.f8912h = afVar;
        this.i = iVar;
    }

    public final u a(int i) {
        u uVar = new u(this.f8905a, this.f8906b, this.f8907c.a(i), this.f8908d, this.f8909e, this.f8910f, this.f8911g, this.f8912h, this.i);
        a(this, uVar);
        return uVar;
    }

    public final u a(ae aeVar, Object obj) {
        u uVar = new u(aeVar, obj, this.f8907c, this.f8908d, this.f8909e, this.f8910f, this.f8911g, this.f8912h, this.i);
        a(this, uVar);
        return uVar;
    }

    public final u a(boolean z8) {
        u uVar = new u(this.f8905a, this.f8906b, this.f8907c, this.f8908d, this.f8909e, this.f8910f, z8, this.f8912h, this.i);
        a(this, uVar);
        return uVar;
    }

    public final u a(af afVar, com.anythink.basead.exoplayer.i.i iVar) {
        u uVar = new u(this.f8905a, this.f8906b, this.f8907c, this.f8908d, this.f8909e, this.f8910f, this.f8911g, afVar, iVar);
        a(this, uVar);
        return uVar;
    }

    private static void a(u uVar, u uVar2) {
        uVar2.f8913j = uVar.f8913j;
        uVar2.f8914k = uVar.f8914k;
    }
}
