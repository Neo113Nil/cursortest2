package defpackage;

import com.connectsdk.discovery.DiscoveryProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.impl.TrackingEventType;

/* loaded from: classes6.dex */
public final class v2t {
    public final ihs a;
    public final ihs b;
    public final ihs c;
    public final ihs d;
    public final ihs e;
    public final r2t f;
    public final gs4 g;
    public final ScheduledExecutorService h;
    public final ExecutorService i;
    public volatile q2t j;
    public volatile ScheduledFuture l;
    public volatile ScheduledFuture m;
    public volatile paw p;
    public volatile VhVideoData q;
    public boolean r;
    public boolean s;
    public final u2t t;
    public final t2t u;
    public volatile Object k = c5b.a;
    public volatile AtomicLong n = new AtomicLong(0);
    public volatile AtomicBoolean o = new AtomicBoolean(false);

    public v2t(ihs ihsVar, ihs ihsVar2, ihs ihsVar3, ihs ihsVar4, ihs ihsVar5, r2t r2tVar, gs4 gs4Var, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService) {
        this.a = ihsVar;
        this.b = ihsVar2;
        this.c = ihsVar3;
        this.d = ihsVar4;
        this.e = ihsVar5;
        this.f = r2tVar;
        this.g = gs4Var;
        this.h = scheduledExecutorService;
        this.i = executorService;
        new AtomicLong(0L);
        this.t = new u2t(this);
        this.u = new t2t(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void a() {
        if (this.k.isEmpty()) {
            List h = u75.h(new Pair(Long.valueOf(10000 - this.b.a()), TrackingEventType.CONTENT_DURATION_10), new Pair(Long.valueOf(20000 - this.b.a()), TrackingEventType.CONTENT_DURATION_20), new Pair(Long.valueOf(30000 - this.b.a()), TrackingEventType.CONTENT_DURATION_30), new Pair(Long.valueOf(40000 - this.b.a()), TrackingEventType.CONTENT_DURATION_40), new Pair(Long.valueOf(50000 - this.b.a()), TrackingEventType.CONTENT_DURATION_50), new Pair(Long.valueOf(DiscoveryProvider.TIMEOUT - this.b.a()), TrackingEventType.CONTENT_DURATION_60));
            ArrayList arrayList = new ArrayList();
            for (Object obj : h) {
                if (((Number) ((Pair) obj).a).longValue() >= 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList2.add(y2x.X(this.h, new xlr(4, this, pair), ((Number) pair.a).longValue()));
            }
            this.k = arrayList2;
        }
    }

    public final void b() {
        paw pawVar = this.p;
        if (pawVar != null) {
            pawVar.F(this.t);
        }
        paw pawVar2 = this.p;
        if (pawVar2 != null) {
            pawVar2.q(this.u);
        }
        if (!this.s) {
            q2t q2tVar = this.j;
            e(q2tVar != null ? q2t.a(q2tVar, TrackingEventType.PLAYER_STOP, null, null, 14) : null);
            this.s = true;
        }
        d();
        ScheduledFuture scheduledFuture = this.m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.m = null;
        c();
        this.a.b();
        this.b.b();
        this.c.b();
        this.d.b();
        this.e.b();
        this.j = null;
        this.p = null;
    }

    public final void c() {
        for (ScheduledFuture scheduledFuture : (Iterable) this.k) {
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
        this.k = c5b.a;
    }

    public final void d() {
        ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.l = null;
    }

    public final void e(LinkedHashMap linkedHashMap) {
        if (linkedHashMap != null) {
            gs4 gs4Var = this.g;
            try {
                ((ExecutorService) gs4Var.d).execute(new zvh(11, gs4Var, linkedHashMap));
            } catch (RejectedExecutionException unused) {
                ((kc7) gs4Var.c).b(((n4f) gs4Var.a).to(linkedHashMap));
            }
        }
    }
}
