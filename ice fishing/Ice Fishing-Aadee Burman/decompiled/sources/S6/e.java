package S6;

import L3.F;
import com.google.android.gms.internal.ads.C2941aq;
import i8.i;
import i8.m;
import i8.n;
import i8.p;
import i8.q;
import i8.r;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2899a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2900b;

    /* renamed from: c, reason: collision with root package name */
    public final n f2901c;

    /* renamed from: d, reason: collision with root package name */
    public final M6.d f2902d;

    /* renamed from: e, reason: collision with root package name */
    public final p f2903e;

    public e(String str, long j6, long j9, M6.d dVar, Z6.a aVar, SSLContext sSLContext) {
        Duration ofNanos;
        long millis;
        Duration ofNanos2;
        long millis2;
        Duration duration;
        long millis3;
        Duration duration2;
        long millis4;
        ofNanos = Duration.ofNanos(j6);
        millis = ofNanos.toMillis();
        int min = (int) Math.min(millis, 2147483647L);
        ofNanos2 = Duration.ofNanos(j9);
        millis2 = ofNanos2.toMillis();
        int min2 = (int) Math.min(millis2, 2147483647L);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new U2.b("okhttp-dispatch"));
        C2941aq c2941aq = new C2941aq();
        c2941aq.f29133v = threadPoolExecutor;
        this.f2899a = true;
        q qVar = new q();
        qVar.f38170a = c2941aq;
        duration = Duration.ofMillis(min2);
        kotlin.jvm.internal.h.e(duration, "duration");
        millis3 = duration.toMillis();
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        qVar.f38188t = j8.d.b(millis3);
        duration2 = Duration.ofMillis(min);
        kotlin.jvm.internal.h.e(duration2, "duration");
        millis4 = duration2.toMillis();
        qVar.f38187s = j8.d.b(millis4);
        if (aVar != null) {
            qVar.f38172c.add(new h(aVar, new K6.b(14)));
        }
        if (str.startsWith("http://")) {
            List connectionSpecs = Collections.singletonList(i.f38127f);
            kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
            connectionSpecs.equals(qVar.f38183o);
            qVar.f38183o = j8.d.j(connectionSpecs);
        }
        this.f2900b = new r(qVar);
        m mVar = new m();
        p pVar = null;
        mVar.c(null, str);
        this.f2901c = mVar.a();
        Q7.i iVar = p.f38167b;
        try {
            pVar = F.l("application/x-protobuf");
        } catch (IllegalArgumentException unused) {
        }
        this.f2903e = pVar;
        this.f2902d = dVar;
    }
}
