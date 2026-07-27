package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.h.s;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ae f8748a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8749b;

    /* renamed from: c, reason: collision with root package name */
    public final s.a f8750c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8751d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8752e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8753f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8754g;

    /* renamed from: h, reason: collision with root package name */
    public final af f8755h;
    public final com.anythink.basead.exoplayer.i.i i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f8756j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f8757k;

    public u(ae aeVar, long j6, af afVar, com.anythink.basead.exoplayer.i.i iVar) {
        this(aeVar, null, new s.a(0), j6, b.f6382b, 1, false, afVar, iVar);
    }

    public final u a(s.a aVar, long j6, long j9) {
        return new u(this.f8748a, this.f8749b, aVar, j6, aVar.a() ? j9 : -9223372036854775807L, this.f8753f, this.f8754g, this.f8755h, this.i);
    }

    public final u b(int i) {
        u uVar = new u(this.f8748a, this.f8749b, this.f8750c, this.f8751d, this.f8752e, i, this.f8754g, this.f8755h, this.i);
        a(this, uVar);
        return uVar;
    }

    public u(ae aeVar, Object obj, s.a aVar, long j6, long j9, int i, boolean z3, af afVar, com.anythink.basead.exoplayer.i.i iVar) {
        this.f8748a = aeVar;
        this.f8749b = obj;
        this.f8750c = aVar;
        this.f8751d = j6;
        this.f8752e = j9;
        this.f8756j = j6;
        this.f8757k = j6;
        this.f8753f = i;
        this.f8754g = z3;
        this.f8755h = afVar;
        this.i = iVar;
    }

    public final u a(int i) {
        u uVar = new u(this.f8748a, this.f8749b, this.f8750c.a(i), this.f8751d, this.f8752e, this.f8753f, this.f8754g, this.f8755h, this.i);
        a(this, uVar);
        return uVar;
    }

    public final u a(ae aeVar, Object obj) {
        u uVar = new u(aeVar, obj, this.f8750c, this.f8751d, this.f8752e, this.f8753f, this.f8754g, this.f8755h, this.i);
        a(this, uVar);
        return uVar;
    }

    public final u a(boolean z3) {
        u uVar = new u(this.f8748a, this.f8749b, this.f8750c, this.f8751d, this.f8752e, this.f8753f, z3, this.f8755h, this.i);
        a(this, uVar);
        return uVar;
    }

    public final u a(af afVar, com.anythink.basead.exoplayer.i.i iVar) {
        u uVar = new u(this.f8748a, this.f8749b, this.f8750c, this.f8751d, this.f8752e, this.f8753f, this.f8754g, afVar, iVar);
        a(this, uVar);
        return uVar;
    }

    private static void a(u uVar, u uVar2) {
        uVar2.f8756j = uVar.f8756j;
        uVar2.f8757k = uVar.f8757k;
    }
}
