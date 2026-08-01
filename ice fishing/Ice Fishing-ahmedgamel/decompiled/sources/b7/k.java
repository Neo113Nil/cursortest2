package b7;

import a7.C0443b;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n6.C4764f;
import n6.InterfaceC4765g;
import p6.C4840a;

/* loaded from: classes2.dex */
public class k implements l6.e {

    /* renamed from: a, reason: collision with root package name */
    public final C0528h f5444a;

    /* renamed from: b, reason: collision with root package name */
    public final C0522b f5445b;

    /* renamed from: c, reason: collision with root package name */
    public final Y6.a f5446c;

    /* renamed from: d, reason: collision with root package name */
    public long f5447d;

    /* renamed from: e, reason: collision with root package name */
    public l6.i f5448e = l6.i.UNDEFINED_SEVERITY_NUMBER;

    /* renamed from: f, reason: collision with root package name */
    public f6.f f5449f;

    /* renamed from: g, reason: collision with root package name */
    public C0443b f5450g;

    public k(C0528h c0528h, Y6.a aVar) {
        this.f5444a = c0528h;
        this.f5445b = (C0522b) c0528h.f5438c.get();
        this.f5446c = aVar;
    }

    @Override // l6.e
    public void b() {
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
        interfaceC0527g.Q(a9, new p(c0528h.f5437b, this.f5446c, this.f5447d, j6, ((C4764f) InterfaceC4765g.a(a9)).f39500a, this.f5448e, this.f5449f, this.f5450g));
    }

    @Override // l6.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public k c(k6.e eVar, Object obj) {
        if (eVar != null && !eVar.f38686b.isEmpty() && obj != null) {
            if (this.f5450g == null) {
                C0522b c0522b = this.f5445b;
                c0522b.getClass();
                this.f5450g = new C0443b(128, c0522b.f5424a);
            }
            this.f5450g.put(eVar, obj);
        }
        return this;
    }

    public k h(f6.f fVar) {
        this.f5449f = fVar;
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
        this.f5448e = iVar;
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
        this.f5447d = nanos + nano;
        return this;
    }
}
