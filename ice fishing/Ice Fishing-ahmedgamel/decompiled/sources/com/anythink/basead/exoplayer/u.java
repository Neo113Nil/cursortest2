package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.h.s;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ae f9534a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9535b;

    /* renamed from: c, reason: collision with root package name */
    public final s.a f9536c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9537d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9538e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9539f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9540g;

    /* renamed from: h, reason: collision with root package name */
    public final af f9541h;
    public final com.anythink.basead.exoplayer.i.i i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f9542j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f9543k;

    public u(ae aeVar, long j6, af afVar, com.anythink.basead.exoplayer.i.i iVar) {
        this(aeVar, null, new s.a(0), j6, b.f7168b, 1, false, afVar, iVar);
    }

    public final u a(s.a aVar, long j6, long j9) {
        return new u(this.f9534a, this.f9535b, aVar, j6, aVar.a() ? j9 : -9223372036854775807L, this.f9539f, this.f9540g, this.f9541h, this.i);
    }

    public final u b(int i) {
        u uVar = new u(this.f9534a, this.f9535b, this.f9536c, this.f9537d, this.f9538e, i, this.f9540g, this.f9541h, this.i);
        a(this, uVar);
        return uVar;
    }

    public u(ae aeVar, Object obj, s.a aVar, long j6, long j9, int i, boolean z6, af afVar, com.anythink.basead.exoplayer.i.i iVar) {
        this.f9534a = aeVar;
        this.f9535b = obj;
        this.f9536c = aVar;
        this.f9537d = j6;
        this.f9538e = j9;
        this.f9542j = j6;
        this.f9543k = j6;
        this.f9539f = i;
        this.f9540g = z6;
        this.f9541h = afVar;
        this.i = iVar;
    }

    public final u a(int i) {
        u uVar = new u(this.f9534a, this.f9535b, this.f9536c.a(i), this.f9537d, this.f9538e, this.f9539f, this.f9540g, this.f9541h, this.i);
        a(this, uVar);
        return uVar;
    }

    public final u a(ae aeVar, Object obj) {
        u uVar = new u(aeVar, obj, this.f9536c, this.f9537d, this.f9538e, this.f9539f, this.f9540g, this.f9541h, this.i);
        a(this, uVar);
        return uVar;
    }

    public final u a(boolean z6) {
        u uVar = new u(this.f9534a, this.f9535b, this.f9536c, this.f9537d, this.f9538e, this.f9539f, z6, this.f9541h, this.i);
        a(this, uVar);
        return uVar;
    }

    public final u a(af afVar, com.anythink.basead.exoplayer.i.i iVar) {
        u uVar = new u(this.f9534a, this.f9535b, this.f9536c, this.f9537d, this.f9538e, this.f9539f, this.f9540g, afVar, iVar);
        a(this, uVar);
        return uVar;
    }

    private static void a(u uVar, u uVar2) {
        uVar2.f9542j = uVar.f9542j;
        uVar2.f9543k = uVar.f9543k;
    }
}
