package g7;

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
import l7.C4666a;
import m7.C4741a;
import n7.C4771b;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class u implements m6.s, Closeable {

    /* renamed from: A, reason: collision with root package name */
    public static final Logger f37695A = Logger.getLogger(u.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f37696n;

    /* renamed from: u, reason: collision with root package name */
    public final List f37697u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f37698v;

    /* renamed from: w, reason: collision with root package name */
    public final C4771b f37699w;

    /* renamed from: x, reason: collision with root package name */
    public final j4.q f37700x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f37701y = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    public final a7.h f37702z;

    public u(ArrayList arrayList, IdentityHashMap identityHashMap, ArrayList arrayList2, C4853a c4853a, C4666a c4666a, a7.h hVar) {
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
        this.f37696n = arrayList;
        List list = (List) identityHashMap.entrySet().stream().map(new b7.n(1, arrayList)).collect(Collectors.toList());
        this.f37697u = list;
        this.f37698v = arrayList2;
        this.f37699w = new C4771b(c4853a, nanos + nano, c4666a);
        this.f37700x = new j4.q(new b7.n(2, this));
        this.f37702z = hVar;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            C4741a c4741a = (C4741a) it.next();
            new ArrayList(arrayList2).add(new E3.e());
            c4741a.getClass();
            throw null;
        }
    }

    @Override // m6.s
    public final m6.r a(String str) {
        if (this.f37697u.isEmpty()) {
            return m6.h.f39314n.a(str);
        }
        if (str == null || str.isEmpty()) {
            f37695A.fine("Meter requested without instrumentation scope name.");
            str = com.anythink.core.common.v.m.f16809e;
        }
        return new b7.m(this.f37700x, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    public final Y6.c shutdown() {
        if (!this.f37701y.compareAndSet(false, true)) {
            f37695A.info("Multiple close calls");
            return Y6.c.f3975e;
        }
        List list = this.f37697u;
        if (list.isEmpty()) {
            return Y6.c.f3975e;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return Y6.c.d(arrayList);
        }
        ((C4741a) it.next()).getClass();
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkMeterProvider{clock=");
        C4771b c4771b = this.f37699w;
        c4771b.getClass();
        sb.append(Y6.d.f3981a);
        sb.append(", resource=");
        sb.append(c4771b.f39503a);
        sb.append(", metricReaders=");
        sb.append(this.f37697u.stream().map(new K6.b(24)).collect(Collectors.toList()));
        sb.append(", metricProducers=");
        sb.append(this.f37698v);
        sb.append(", views=");
        sb.append(this.f37696n);
        sb.append(", meterConfigurator=");
        sb.append(this.f37702z);
        sb.append("}");
        return sb.toString();
    }
}
