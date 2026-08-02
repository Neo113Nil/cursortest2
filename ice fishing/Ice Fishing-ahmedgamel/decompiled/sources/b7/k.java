package b7;

import a7.C0447b;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n6.C4780f;
import n6.InterfaceC4781g;
import p6.C4840a;

/* loaded from: classes2.dex */
public class k implements l6.e {

    /* renamed from: a, reason: collision with root package name */
    public final C0536h f5594a;

    /* renamed from: b, reason: collision with root package name */
    public final C0530b f5595b;

    /* renamed from: c, reason: collision with root package name */
    public final Y6.a f5596c;

    /* renamed from: d, reason: collision with root package name */
    public long f5597d;

    /* renamed from: e, reason: collision with root package name */
    public l6.i f5598e = l6.i.UNDEFINED_SEVERITY_NUMBER;

    /* renamed from: f, reason: collision with root package name */
    public f6.f f5599f;

    /* renamed from: g, reason: collision with root package name */
    public C0447b f5600g;

    public k(C0536h c0536h, Y6.a aVar) {
        this.f5594a = c0536h;
        this.f5595b = (C0530b) c0536h.f5588c.get();
        this.f5596c = aVar;
    }

    @Override // l6.e
    public void b() {
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
        interfaceC0535g.Q(a9, new o(c0536h.f5587b, this.f5596c, this.f5597d, j6, ((C4780f) InterfaceC4781g.a(a9)).f39667a, this.f5598e, this.f5599f, this.f5600g));
    }

    @Override // l6.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public k c(k6.e eVar, Object obj) {
        if (eVar != null && !eVar.f38613b.isEmpty() && obj != null) {
            if (this.f5600g == null) {
                C0530b c0530b = this.f5595b;
                c0530b.getClass();
                this.f5600g = new C0447b(128, c0530b.f5574a);
            }
            this.f5600g.put(eVar, obj);
        }
        return this;
    }

    public k h(f6.f fVar) {
        this.f5599f = fVar;
        return this;
    }

    @Override // l6.e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public k a(String str) {
        Objects.requireNonNull(str, "value must not be null");
        return h(new f6.f(2, str));
    }

    @Override // l6.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public k e(l6.i iVar) {
        this.f5598e = iVar;
        return this;
    }

    @Override // l6.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public k d(Instant instant) {
        long epochSecond;
        int nano;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        this.f5597d = nanos + nano;
        return this;
    }
}
