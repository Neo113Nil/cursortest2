package F5;

import N3.C;
import a7.InterfaceC0450e;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p7.C4853a;
import r6.C4910a;
import u7.C5085k;

/* loaded from: classes2.dex */
public final class m extends j implements e {

    /* renamed from: e, reason: collision with root package name */
    public final f f1008e;

    /* renamed from: f, reason: collision with root package name */
    public final C5085k f1009f;

    /* renamed from: g, reason: collision with root package name */
    public final C5085k f1010g;

    public m(f fVar, I0.j jVar, n4.c cVar) {
        super(jVar, cVar);
        this.f1008e = fVar;
        this.f1009f = C.O(new l(this, 0));
        this.f1010g = C.O(new l(this, 1));
    }

    @Override // F5.j
    public final X6.d d(Map attributes) {
        Duration ofSeconds;
        long nanos;
        Duration ofSeconds2;
        long nanos2;
        kotlin.jvm.internal.h.e(attributes, "attributes");
        Logger logger = X6.d.f3769y;
        S0.c cVar = new S0.c(6, false);
        cVar.f2902u = C4910a.f40221b;
        C4853a g9 = t8.g.g(attributes);
        Map extraHttpHeaders = (Map) this.f1009f.getValue();
        f fVar = this.f1008e;
        String appId = fVar.getAppIdForHeaders();
        String apiBaseUrl = fVar.getApiBaseUrl();
        boolean isOtelExporterLoggingEnabled = fVar.isOtelExporterLoggingEnabled();
        kotlin.jvm.internal.h.e(extraHttpHeaders, "extraHttpHeaders");
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(apiBaseUrl, "apiBaseUrl");
        Logger logger2 = b7.n.f5606x;
        ArrayList arrayList = new ArrayList();
        C4853a c4853a = C4853a.f39847c;
        ArrayList arrayList2 = new ArrayList();
        InterfaceC0450e.m();
        e7.e b9 = d6.c.b(extraHttpHeaders, appId, apiBaseUrl, isOtelExporterLoggingEnabled);
        String str = e7.c.f37303v;
        e7.d dVar = new e7.d(b9);
        dVar.f37312c = 100;
        dVar.f37313d = 100;
        ofSeconds = Duration.ofSeconds(30L);
        Objects.requireNonNull(ofSeconds, "timeout");
        nanos = ofSeconds.toNanos();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(timeUnit, "unit");
        k6.d.a("timeout must be non-negative", nanos >= 0);
        dVar.f37314e = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
        ofSeconds2 = Duration.ofSeconds(1L);
        Objects.requireNonNull(ofSeconds2, "delay");
        nanos2 = ofSeconds2.toNanos();
        k6.d.a("delay must be non-negative", nanos2 >= 0);
        dVar.f37311b = timeUnit.toNanos(nanos2);
        arrayList.add(dVar.a());
        cVar.f2903v = new b7.n(g9, new H5.a(0), arrayList, new a7.h(arrayList2));
        return cVar.d();
    }
}
