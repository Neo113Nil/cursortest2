package B5;

import S0.s;
import g1.C4523c;
import g1.C4524d;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import l7.C4707a;
import n6.C4814a;
import q7.C4942k;

/* loaded from: classes2.dex */
public final class m extends j implements e {

    /* renamed from: e, reason: collision with root package name */
    public final f f353e;

    /* renamed from: f, reason: collision with root package name */
    public final C4942k f354f;

    /* renamed from: g, reason: collision with root package name */
    public final C4942k f355g;

    public m(f fVar, C4524d c4524d, C4523c c4523c) {
        super(c4524d, c4523c);
        this.f353e = fVar;
        this.f354f = com.bumptech.glide.e.q(new l(this, 0));
        this.f355g = com.bumptech.glide.e.q(new l(this, 1));
    }

    @Override // B5.j
    public final T6.d d(Map attributes) {
        Duration ofSeconds;
        long nanos;
        Duration ofSeconds2;
        long nanos2;
        kotlin.jvm.internal.h.e(attributes, "attributes");
        Logger logger = T6.d.f3120y;
        s sVar = new s(6, false);
        sVar.f2952u = C4814a.f39646b;
        C4707a d2 = K3.b.d(attributes);
        Map extraHttpHeaders = (Map) this.f354f.getValue();
        f fVar = this.f353e;
        String appId = fVar.getAppIdForHeaders();
        String apiBaseUrl = fVar.getApiBaseUrl();
        boolean isOtelExporterLoggingEnabled = fVar.isOtelExporterLoggingEnabled();
        kotlin.jvm.internal.h.e(extraHttpHeaders, "extraHttpHeaders");
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(apiBaseUrl, "apiBaseUrl");
        Logger logger2 = X6.n.f3871x;
        ArrayList arrayList = new ArrayList();
        C4707a c4707a = C4707a.f39080c;
        ArrayList arrayList2 = new ArrayList();
        W6.e.h();
        a7.f c4 = w8.a.c(extraHttpHeaders, appId, apiBaseUrl, isOtelExporterLoggingEnabled);
        String str = a7.d.f4412v;
        a7.e eVar = new a7.e(c4);
        eVar.f4421c = 100;
        eVar.f4422d = 100;
        ofSeconds = Duration.ofSeconds(30L);
        Objects.requireNonNull(ofSeconds, "timeout");
        nanos = ofSeconds.toNanos();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(timeUnit, "unit");
        g6.d.a("timeout must be non-negative", nanos >= 0);
        eVar.f4423e = nanos == 0 ? Long.MAX_VALUE : timeUnit.toNanos(nanos);
        ofSeconds2 = Duration.ofSeconds(1L);
        Objects.requireNonNull(ofSeconds2, "delay");
        nanos2 = ofSeconds2.toNanos();
        g6.d.a("delay must be non-negative", nanos2 >= 0);
        eVar.f4420b = timeUnit.toNanos(nanos2);
        arrayList.add(eVar.a());
        sVar.f2953v = new X6.n(d2, new D5.a(0), arrayList, new W6.h(arrayList2));
        return sVar.a();
    }
}
