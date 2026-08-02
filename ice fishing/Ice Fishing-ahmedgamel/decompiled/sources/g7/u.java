package g7;

import com.google.android.gms.internal.ads.C3067cm;
import java.io.Closeable;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import l7.C4678a;
import m7.C4755a;
import n7.C4787b;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class u implements m6.s, Closeable {

    /* renamed from: A, reason: collision with root package name */
    public static final Logger f37720A = Logger.getLogger(u.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f37721n;

    /* renamed from: u, reason: collision with root package name */
    public final List f37722u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f37723v;

    /* renamed from: w, reason: collision with root package name */
    public final C4787b f37724w;

    /* renamed from: x, reason: collision with root package name */
    public final S0.i f37725x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f37726y = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    public final a7.h f37727z;

    public u(ArrayList arrayList, IdentityHashMap identityHashMap, ArrayList arrayList2, C4853a c4853a, C4678a c4678a, a7.h hVar) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        systemUTC = Clock.systemUTC();
        instant = systemUTC.instant();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        epochSecond = instant.getEpochSecond();
        long nanos = timeUnit.toNanos(epochSecond);
        nano = instant.getNano();
        this.f37721n = arrayList;
        List list = (List) identityHashMap.entrySet().stream().map(new b7.m(1, arrayList)).collect(Collectors.toList());
        this.f37722u = list;
        this.f37723v = arrayList2;
        this.f37724w = new C4787b(c4853a, nanos + nano, c4678a);
        this.f37725x = new S0.i(new b7.m(2, this));
        this.f37727z = hVar;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            C4755a c4755a = (C4755a) it.next();
            new ArrayList(arrayList2).add(new c4.e());
            c4755a.getClass();
            throw null;
        }
    }

    @Override // m6.s
    public final m6.r a(String str) {
        if (this.f37722u.isEmpty()) {
            return m6.h.f39473n.a(str);
        }
        if (str == null || str.isEmpty()) {
            f37720A.fine("Meter requested without instrumentation scope name.");
            str = com.anythink.core.common.v.m.f17596e;
        }
        return new C3067cm(29, this.f37725x, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final Y6.c shutdown() {
        if (!this.f37726y.compareAndSet(false, true)) {
            f37720A.info("Multiple close calls");
            return Y6.c.f3919e;
        }
        List list = this.f37722u;
        if (list.isEmpty()) {
            return Y6.c.f3919e;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return Y6.c.d(arrayList);
        }
        ((C4755a) it.next()).getClass();
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkMeterProvider{clock=");
        C4787b c4787b = this.f37724w;
        c4787b.getClass();
        sb.append(Y6.d.f3925a);
        sb.append(", resource=");
        sb.append(c4787b.f39670a);
        sb.append(", metricReaders=");
        sb.append(this.f37722u.stream().map(new K6.b(24)).collect(Collectors.toList()));
        sb.append(", metricProducers=");
        sb.append(this.f37723v);
        sb.append(", views=");
        sb.append(this.f37721n);
        sb.append(", meterConfigurator=");
        sb.append(this.f37727z);
        sb.append("}");
        return sb.toString();
    }
}
