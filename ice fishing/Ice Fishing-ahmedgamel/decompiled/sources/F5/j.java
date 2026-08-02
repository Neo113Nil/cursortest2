package F5;

import a.AbstractC0426a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import v7.AbstractC5119j;
import z7.C5247k;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final I0.j f1001a;

    /* renamed from: b, reason: collision with root package name */
    public final n4.c f1002b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1003c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public X6.d f1004d;

    public j(I0.j jVar, n4.c cVar) {
        this.f1001a = jVar;
        this.f1002b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(j jVar, B7.c cVar) {
        g gVar;
        int i;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i4 = gVar.f992v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gVar.f992v = i4 - Integer.MIN_VALUE;
                Object obj = gVar.f990n;
                Object obj2 = A7.a.f215n;
                i = gVar.f992v;
                if (i != 0) {
                    Q3.b.s(obj);
                    gVar.f992v = 1;
                    obj = jVar.c(gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Q3.b.s(obj);
                        return obj;
                    }
                    Q3.b.s(obj);
                }
                b7.n nVar = ((X6.d) obj).f3773w.f3766n;
                gVar.f992v = 2;
                C5247k c5247k = new C5247k(A8.b.n(gVar));
                Y6.c M8 = nVar.f5607n.f5589d.M();
                M8.c(10L, TimeUnit.SECONDS);
                c5247k.resumeWith(M8);
                Object a9 = c5247k.a();
                return a9 != obj2 ? obj2 : a9;
            }
        }
        gVar = new g(jVar, cVar);
        Object obj3 = gVar.f990n;
        Object obj22 = A7.a.f215n;
        i = gVar.f992v;
        if (i != 0) {
        }
        b7.n nVar2 = ((X6.d) obj3).f3773w.f3766n;
        gVar.f992v = 2;
        C5247k c5247k2 = new C5247k(A8.b.n(gVar));
        Y6.c M82 = nVar2.f5607n.f5589d.M();
        M82.c(10L, TimeUnit.SECONDS);
        c5247k2.resumeWith(M82);
        Object a92 = c5247k2.a();
        if (a92 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4 A[LOOP:0: B:14:0x00de->B:16:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(j jVar, B7.c cVar) {
        h hVar;
        int i;
        List enabledFeatureFlags;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i4 = hVar.f996w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.f996w = i4 - Integer.MIN_VALUE;
                Object obj = hVar.f994u;
                A7.a aVar = A7.a.f215n;
                i = hVar.f996w;
                if (i != 0) {
                    Q3.b.s(obj);
                    hVar.f993n = jVar;
                    hVar.f996w = 1;
                    obj = jVar.c(hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = hVar.f993n;
                    Q3.b.s(obj);
                }
                l6.e a9 = ((X6.d) obj).f3773w.f3766n.a("loggerBuilder").build().a();
                n4.c cVar2 = jVar.f1002b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                UUID randomUUID = UUID.randomUUID();
                kotlin.jvm.internal.h.d(randomUUID, "randomUUID(...)");
                String uuid = randomUUID.toString();
                kotlin.jvm.internal.h.d(uuid, "toString(...)");
                linkedHashMap.put("log.record.uid", uuid);
                f fVar = (f) cVar2.f39658u;
                AbstractC0426a.m(linkedHashMap, "ossdk.app_id", fVar.getAppId());
                AbstractC0426a.m(linkedHashMap, "ossdk.onesignal_id", fVar.getOnesignalId());
                AbstractC0426a.m(linkedHashMap, "ossdk.push_subscription_id", fVar.getPushSubscriptionId());
                linkedHashMap.put("app.state", fVar.getAppState());
                linkedHashMap.put("process.uptime", String.valueOf(fVar.getProcessUptime()));
                linkedHashMap.put("thread.name", fVar.getCurrentThreadName());
                enabledFeatureFlags = fVar.getEnabledFeatureFlags();
                if (!enabledFeatureFlags.isEmpty()) {
                    linkedHashMap.put("ossdk.feature_flags", AbstractC5119j.C(AbstractC5119j.H(enabledFeatureFlags), ",", null, null, null, 62));
                }
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                kotlin.jvm.internal.h.d(unmodifiableMap, "unmodifiableMap(...)");
                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                    String str = (String) entry.getKey();
                    a9.c(k6.e.a(f6.b.f37478n, str), (String) entry.getValue());
                }
                return a9;
            }
        }
        hVar = new h(jVar, cVar);
        Object obj2 = hVar.f994u;
        A7.a aVar2 = A7.a.f215n;
        i = hVar.f996w;
        if (i != 0) {
        }
        l6.e a92 = ((X6.d) obj2).f3773w.f3766n.a("loggerBuilder").build().a();
        n4.c cVar22 = jVar.f1002b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        UUID randomUUID2 = UUID.randomUUID();
        kotlin.jvm.internal.h.d(randomUUID2, "randomUUID(...)");
        String uuid2 = randomUUID2.toString();
        kotlin.jvm.internal.h.d(uuid2, "toString(...)");
        linkedHashMap2.put("log.record.uid", uuid2);
        f fVar2 = (f) cVar22.f39658u;
        AbstractC0426a.m(linkedHashMap2, "ossdk.app_id", fVar2.getAppId());
        AbstractC0426a.m(linkedHashMap2, "ossdk.onesignal_id", fVar2.getOnesignalId());
        AbstractC0426a.m(linkedHashMap2, "ossdk.push_subscription_id", fVar2.getPushSubscriptionId());
        linkedHashMap2.put("app.state", fVar2.getAppState());
        linkedHashMap2.put("process.uptime", String.valueOf(fVar2.getProcessUptime()));
        linkedHashMap2.put("thread.name", fVar2.getCurrentThreadName());
        enabledFeatureFlags = fVar2.getEnabledFeatureFlags();
        if (!enabledFeatureFlags.isEmpty()) {
        }
        Map unmodifiableMap2 = Collections.unmodifiableMap(linkedHashMap2);
        kotlin.jvm.internal.h.d(unmodifiableMap2, "unmodifiableMap(...)");
        while (r8.hasNext()) {
        }
        return a92;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(B7.c cVar) {
        i iVar;
        int i;
        j jVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i4 = iVar.f1000w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iVar.f1000w = i4 - Integer.MIN_VALUE;
                Object obj = iVar.f998u;
                A7.a aVar = A7.a.f215n;
                i = iVar.f1000w;
                if (i != 0) {
                    Q3.b.s(obj);
                    I0.j jVar2 = this.f1001a;
                    iVar.f997n = this;
                    iVar.f1000w = 1;
                    obj = jVar2.r(iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    jVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.f997n;
                    Q3.b.s(obj);
                }
                Map map = (Map) obj;
                synchronized (jVar.f1003c) {
                    X6.d dVar = jVar.f1004d;
                    if (dVar != null) {
                        return dVar;
                    }
                    X6.d d9 = jVar.d(map);
                    jVar.f1004d = d9;
                    return d9;
                }
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f998u;
        A7.a aVar2 = A7.a.f215n;
        i = iVar.f1000w;
        if (i != 0) {
        }
        Map map2 = (Map) obj2;
        synchronized (jVar.f1003c) {
        }
    }

    public abstract X6.d d(Map map);
}
