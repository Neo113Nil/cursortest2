package b7;

import h6.C4574a;
import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import n6.C4764f;
import n6.InterfaceC4765g;
import p6.C4840a;

/* renamed from: b7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0524d extends k implements l6.e {

    /* renamed from: h, reason: collision with root package name */
    public a7.f f5433h;

    @Override // b7.k, l6.e
    public final l6.e a(String str) {
        super.a(str);
        return this;
    }

    @Override // b7.k, l6.e
    public final void b() {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        C0528h c0528h = this.f5444a;
        if (c0528h.f5440e != null) {
            return;
        }
        C4840a a9 = C4840a.a();
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        long j6 = nanos + nano;
        InterfaceC0527g interfaceC0527g = c0528h.f5439d;
        interfaceC0527g.Q(a9, new C0526f(c0528h.f5437b, this.f5446c, this.f5447d, j6, ((C4764f) InterfaceC4765g.a(a9)).f39500a, this.f5448e, this.f5449f, this.f5433h));
    }

    @Override // b7.k, l6.e
    public final /* bridge */ /* synthetic */ l6.e c(k6.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // b7.k, l6.e
    public final l6.e d(Instant instant) {
        super.d(instant);
        return this;
    }

    @Override // b7.k, l6.e
    public final l6.e e(l6.i iVar) {
        this.f5448e = iVar;
        return this;
    }

    @Override // l6.e
    public l6.e f(f6.c cVar) {
        if (cVar != null && !cVar.isEmpty()) {
            cVar.forEach(new S6.a(3, this));
        }
        return this;
    }

    @Override // b7.k
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ k c(k6.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // b7.k
    public final k h(f6.f fVar) {
        this.f5449f = fVar;
        return this;
    }

    @Override // b7.k
    /* renamed from: i */
    public final k a(String str) {
        super.a(str);
        return this;
    }

    @Override // b7.k
    /* renamed from: j */
    public final k e(l6.i iVar) {
        this.f5448e = iVar;
        return this;
    }

    @Override // b7.k
    /* renamed from: k */
    public final k d(Instant instant) {
        super.d(instant);
        return this;
    }

    public final void l(k6.e eVar, Object obj) {
        if (eVar == null || eVar.f38686b.isEmpty() || obj == null) {
            return;
        }
        C4574a c9 = C4574a.c(eVar);
        if (c9.f38020b.isEmpty()) {
            return;
        }
        if (this.f5433h == null) {
            C0522b c0522b = this.f5445b;
            c0522b.getClass();
            this.f5433h = new a7.f(128, c0522b.f5424a);
        }
        this.f5433h.put(c9, obj);
    }
}
