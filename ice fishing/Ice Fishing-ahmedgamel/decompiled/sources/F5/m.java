package F5;

import L3.F;
import S0.s;
import a.AbstractC0422a;
import a7.InterfaceC0446e;
import g1.C4522b;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p7.C4853a;
import r6.C4960a;
import u7.C5093k;

/* loaded from: classes2.dex */
public final class m extends j implements e {

    /* renamed from: e, reason: collision with root package name */
    public final f f982e;

    /* renamed from: f, reason: collision with root package name */
    public final C5093k f983f;

    /* renamed from: g, reason: collision with root package name */
    public final C5093k f984g;

    public m(f fVar, C4522b c4522b, I0.j jVar) {
        super(c4522b, jVar);
        this.f982e = fVar;
        this.f983f = AbstractC0422a.q(new l(this, 0));
        this.f984g = AbstractC0422a.q(new l(this, 1));
    }

    @Override // F5.j
    public final X6.d d(Map attributes) {
        Duration ofSeconds;
        long nanos;
        Duration ofSeconds2;
        long nanos2;
        kotlin.jvm.internal.h.e(attributes, "attributes");
        Logger logger = X6.d.f3814y;
        s sVar = new s(5);
        sVar.f2840u = C4960a.f40385b;
        C4853a h9 = O3.b.h(attributes);
        Map extraHttpHeaders = (Map) this.f983f.getValue();
        f fVar = this.f982e;
        String appId = fVar.getAppIdForHeaders();
        String apiBaseUrl = fVar.getApiBaseUrl();
        boolean isOtelExporterLoggingEnabled = fVar.isOtelExporterLoggingEnabled();
        kotlin.jvm.internal.h.e(extraHttpHeaders, "extraHttpHeaders");
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(apiBaseUrl, "apiBaseUrl");
        Logger logger2 = b7.o.f5458x;
        ArrayList arrayList = new ArrayList();
        C4853a c4853a = C4853a.f39800c;
        ArrayList arrayList2 = new ArrayList();
        InterfaceC0446e.n();
        e7.e i = F.i(extraHttpHeaders, appId, apiBaseUrl, isOtelExporterLoggingEnabled);
        String str = e7.c.f37227v;
        e7.d dVar = new e7.d(i);
        dVar.f37236c = 100;
        dVar.f37237d = 100;
        ofSeconds = Duration.ofSeconds(30L);
        Objects.requireNonNull(ofSeconds, "timeout");
        nanos = ofSeconds.toNanos();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(timeUnit, "unit");
        k6.d.a("timeout must be non-negative", nanos >= 0);
        dVar.f37238e = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
        ofSeconds2 = Duration.ofSeconds(1L);
        Objects.requireNonNull(ofSeconds2, "delay");
        nanos2 = ofSeconds2.toNanos();
        k6.d.a("delay must be non-negative", nanos2 >= 0);
        dVar.f37235b = timeUnit.toNanos(nanos2);
        arrayList.add(dVar.a());
        sVar.f2841v = new b7.o(h9, new H5.a(0), arrayList, new a7.h(arrayList2));
        return sVar.i();
    }
}
