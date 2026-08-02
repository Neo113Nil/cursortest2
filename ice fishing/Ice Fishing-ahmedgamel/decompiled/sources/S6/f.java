package S6;

import N3.C;
import com.google.android.gms.internal.ads.C2964aq;
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
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2982a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2983b;

    /* renamed from: c, reason: collision with root package name */
    public final n f2984c;

    /* renamed from: d, reason: collision with root package name */
    public final M6.d f2985d;

    /* renamed from: e, reason: collision with root package name */
    public final p f2986e;

    public f(String str, long j6, long j9, M6.d dVar, Z6.a aVar, SSLContext sSLContext) {
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
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new W2.b("okhttp-dispatch"));
        C2964aq c2964aq = new C2964aq();
        c2964aq.f29918v = threadPoolExecutor;
        this.f2982a = true;
        q qVar = new q();
        qVar.f38289a = c2964aq;
        duration = Duration.ofMillis(min2);
        kotlin.jvm.internal.h.e(duration, "duration");
        millis3 = duration.toMillis();
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        qVar.f38307t = j8.d.b(millis3);
        duration2 = Duration.ofMillis(min);
        kotlin.jvm.internal.h.e(duration2, "duration");
        millis4 = duration2.toMillis();
        qVar.f38306s = j8.d.b(millis4);
        if (aVar != null) {
            qVar.f38291c.add(new i(aVar, new K6.b(14)));
        }
        if (str.startsWith("http://")) {
            List connectionSpecs = Collections.singletonList(i8.i.f38246f);
            kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
            connectionSpecs.equals(qVar.f38302o);
            qVar.f38302o = j8.d.j(connectionSpecs);
        }
        this.f2983b = new r(qVar);
        m mVar = new m();
        p pVar = null;
        mVar.c(null, str);
        this.f2984c = mVar.a();
        Q7.i iVar = p.f38286b;
        try {
            pVar = C.I("application/x-protobuf");
        } catch (IllegalArgumentException unused) {
        }
        this.f2986e = pVar;
        this.f2985d = dVar;
    }
}
