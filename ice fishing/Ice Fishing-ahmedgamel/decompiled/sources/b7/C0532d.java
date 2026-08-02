package b7;

import h6.C4579a;
import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import n6.C4780f;
import n6.InterfaceC4781g;
import p6.C4840a;

/* renamed from: b7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0532d extends k implements l6.e {

    /* renamed from: h, reason: collision with root package name */
    public a7.f f5583h;

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
        C0536h c0536h = this.f5594a;
        if (c0536h.f5590e != null) {
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
        InterfaceC0535g interfaceC0535g = c0536h.f5589d;
        interfaceC0535g.Q(a9, new C0534f(c0536h.f5587b, this.f5596c, this.f5597d, j6, ((C4780f) InterfaceC4781g.a(a9)).f39667a, this.f5598e, this.f5599f, this.f5583h));
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
        this.f5598e = iVar;
        return this;
    }

    @Override // l6.e
    public l6.e f(f6.c cVar) {
        if (cVar != null && !cVar.isEmpty()) {
            cVar.forEach(new S6.b(3, this));
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
        this.f5599f = fVar;
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
        this.f5598e = iVar;
        return this;
    }

    @Override // b7.k
    /* renamed from: k */
    public final k d(Instant instant) {
        super.d(instant);
        return this;
    }

    public final void l(k6.e eVar, Object obj) {
        if (eVar == null || eVar.f38613b.isEmpty() || obj == null) {
            return;
        }
        C4579a c9 = C4579a.c(eVar);
        if (c9.f38137b.isEmpty()) {
            return;
        }
        if (this.f5583h == null) {
            C0530b c0530b = this.f5595b;
            c0530b.getClass();
            this.f5583h = new a7.f(128, c0530b.f5574a);
        }
        this.f5583h.put(c9, obj);
    }
}
