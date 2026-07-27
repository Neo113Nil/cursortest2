package F5;

import a.AbstractC0422a;
import g1.C4522b;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import v7.AbstractC5129j;
import z7.C5274k;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final C4522b f975a;

    /* renamed from: b, reason: collision with root package name */
    public final I0.j f976b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f977c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public X6.d f978d;

    public j(C4522b c4522b, I0.j jVar) {
        this.f975a = c4522b;
        this.f976b = jVar;
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
            int i6 = gVar.f966v;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.f966v = i6 - Integer.MIN_VALUE;
                Object obj = gVar.f964n;
                Object obj2 = A7.a.f58n;
                i = gVar.f966v;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    gVar.f966v = 1;
                    obj = jVar.c(gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.d.k(obj);
                        return obj;
                    }
                    com.bumptech.glide.d.k(obj);
                }
                b7.o oVar = ((X6.d) obj).f3818w.f3811n;
                gVar.f966v = 2;
                C5274k c5274k = new C5274k(A8.b.l(gVar));
                Y6.c M8 = oVar.f5459n.f5439d.M();
                M8.c(10L, TimeUnit.SECONDS);
                c5274k.resumeWith(M8);
                Object a9 = c5274k.a();
                return a9 != obj2 ? obj2 : a9;
            }
        }
        gVar = new g(jVar, cVar);
        Object obj3 = gVar.f964n;
        Object obj22 = A7.a.f58n;
        i = gVar.f966v;
        if (i != 0) {
        }
        b7.o oVar2 = ((X6.d) obj3).f3818w.f3811n;
        gVar.f966v = 2;
        C5274k c5274k2 = new C5274k(A8.b.l(gVar));
        Y6.c M82 = oVar2.f5459n.f5439d.M();
        M82.c(10L, TimeUnit.SECONDS);
        c5274k2.resumeWith(M82);
        Object a92 = c5274k2.a();
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
            int i6 = hVar.f970w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                hVar.f970w = i6 - Integer.MIN_VALUE;
                Object obj = hVar.f968u;
                A7.a aVar = A7.a.f58n;
                i = hVar.f970w;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    hVar.f967n = jVar;
                    hVar.f970w = 1;
                    obj = jVar.c(hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = hVar.f967n;
                    com.bumptech.glide.d.k(obj);
                }
                l6.e a9 = ((X6.d) obj).f3818w.f3811n.a("loggerBuilder").build().a();
                I0.j jVar2 = jVar.f976b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                UUID randomUUID = UUID.randomUUID();
                kotlin.jvm.internal.h.d(randomUUID, "randomUUID(...)");
                String uuid = randomUUID.toString();
                kotlin.jvm.internal.h.d(uuid, "toString(...)");
                linkedHashMap.put("log.record.uid", uuid);
                f fVar = (f) jVar2.f1264u;
                AbstractC0422a.t(linkedHashMap, "ossdk.app_id", fVar.getAppId());
                AbstractC0422a.t(linkedHashMap, "ossdk.onesignal_id", fVar.getOnesignalId());
                AbstractC0422a.t(linkedHashMap, "ossdk.push_subscription_id", fVar.getPushSubscriptionId());
                linkedHashMap.put("app.state", fVar.getAppState());
                linkedHashMap.put("process.uptime", String.valueOf(fVar.getProcessUptime()));
                linkedHashMap.put("thread.name", fVar.getCurrentThreadName());
                enabledFeatureFlags = fVar.getEnabledFeatureFlags();
                if (!enabledFeatureFlags.isEmpty()) {
                    linkedHashMap.put("ossdk.feature_flags", AbstractC5129j.E(AbstractC5129j.J(enabledFeatureFlags), ",", null, null, null, 62));
                }
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                kotlin.jvm.internal.h.d(unmodifiableMap, "unmodifiableMap(...)");
                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                    String str = (String) entry.getKey();
                    a9.c(k6.e.a(f6.b.f37516n, str), (String) entry.getValue());
                }
                return a9;
            }
        }
        hVar = new h(jVar, cVar);
        Object obj2 = hVar.f968u;
        A7.a aVar2 = A7.a.f58n;
        i = hVar.f970w;
        if (i != 0) {
        }
        l6.e a92 = ((X6.d) obj2).f3818w.f3811n.a("loggerBuilder").build().a();
        I0.j jVar22 = jVar.f976b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        UUID randomUUID2 = UUID.randomUUID();
        kotlin.jvm.internal.h.d(randomUUID2, "randomUUID(...)");
        String uuid2 = randomUUID2.toString();
        kotlin.jvm.internal.h.d(uuid2, "toString(...)");
        linkedHashMap2.put("log.record.uid", uuid2);
        f fVar2 = (f) jVar22.f1264u;
        AbstractC0422a.t(linkedHashMap2, "ossdk.app_id", fVar2.getAppId());
        AbstractC0422a.t(linkedHashMap2, "ossdk.onesignal_id", fVar2.getOnesignalId());
        AbstractC0422a.t(linkedHashMap2, "ossdk.push_subscription_id", fVar2.getPushSubscriptionId());
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
            int i6 = iVar.f974w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                iVar.f974w = i6 - Integer.MIN_VALUE;
                Object obj = iVar.f972u;
                A7.a aVar = A7.a.f58n;
                i = iVar.f974w;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    C4522b c4522b = this.f975a;
                    iVar.f971n = this;
                    iVar.f974w = 1;
                    obj = c4522b.D(iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    jVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.f971n;
                    com.bumptech.glide.d.k(obj);
                }
                Map map = (Map) obj;
                synchronized (jVar.f977c) {
                    X6.d dVar = jVar.f978d;
                    if (dVar != null) {
                        return dVar;
                    }
                    X6.d d2 = jVar.d(map);
                    jVar.f978d = d2;
                    return d2;
                }
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f972u;
        A7.a aVar2 = A7.a.f58n;
        i = iVar.f974w;
        if (i != 0) {
        }
        Map map2 = (Map) obj2;
        synchronized (jVar.f977c) {
        }
    }

    public abstract X6.d d(Map map);
}
