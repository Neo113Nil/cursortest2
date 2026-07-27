package X6;

import j6.C4604f;
import j6.InterfaceC4605g;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l6.C4694a;

/* loaded from: classes2.dex */
public class k implements h6.e {

    /* renamed from: a, reason: collision with root package name */
    public final h f3859a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3860b;

    /* renamed from: c, reason: collision with root package name */
    public final U6.a f3861c;

    /* renamed from: d, reason: collision with root package name */
    public long f3862d;

    /* renamed from: e, reason: collision with root package name */
    public h6.i f3863e = h6.i.UNDEFINED_SEVERITY_NUMBER;

    /* renamed from: f, reason: collision with root package name */
    public b6.f f3864f;

    /* renamed from: g, reason: collision with root package name */
    public W6.b f3865g;

    public k(h hVar, U6.a aVar) {
        this.f3859a = hVar;
        this.f3860b = (b) hVar.f3853c.get();
        this.f3861c = aVar;
    }

    @Override // h6.e
    public void b() {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        h hVar = this.f3859a;
        if (hVar.f3855e != null) {
            return;
        }
        C4694a a9 = C4694a.a();
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        long j9 = nanos + nano;
        g gVar = hVar.f3854d;
        gVar.T(a9, new o(hVar.f3852b, this.f3861c, this.f3862d, j9, ((C4604f) InterfaceC4605g.a(a9)).f38577a, this.f3863e, this.f3864f, this.f3865g));
    }

    @Override // h6.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public k e(g6.e eVar, Object obj) {
        if (eVar != null && !eVar.f37932b.isEmpty() && obj != null) {
            if (this.f3865g == null) {
                b bVar = this.f3860b;
                bVar.getClass();
                this.f3865g = new W6.b(128, bVar.f3839a);
            }
            this.f3865g.put(eVar, obj);
        }
        return this;
    }

    public k h(b6.f fVar) {
        this.f3864f = fVar;
        return this;
    }

    @Override // h6.e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public k a(String str) {
        Objects.requireNonNull(str, "value must not be null");
        return h(new b6.f(2, str));
    }

    @Override // h6.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public k c(h6.i iVar) {
        this.f3863e = iVar;
        return this;
    }

    @Override // h6.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public k f(Instant instant) {
        long epochSecond;
        int nano;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        this.f3862d = nanos + nano;
        return this;
    }
}
