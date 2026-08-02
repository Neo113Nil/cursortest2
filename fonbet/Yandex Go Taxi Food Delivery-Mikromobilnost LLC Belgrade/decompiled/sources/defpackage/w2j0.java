package defpackage;

import com.yandex.go.network_metrics.NetworkEventParam;
import com.yandex.go.network_metrics.Status;
import com.yandex.go.network_metrics.experiment.ReportingDestination;
import com.yandex.go.network_metrics.experiment.ReportingEndpoint;
import com.yandex.go.network_metrics.experiment.a;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final class w2j0 {
    public final a a;
    public final com.yandex.go.network_metrics.a b;
    public final bpt c;
    public final wot d;
    public final vit e;
    public final jtq0 f;
    public final AtomicLong h;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final AtomicReference i = new AtomicReference(null);

    public w2j0(a aVar, com.yandex.go.network_metrics.a aVar2, bpt bptVar, wot wotVar, vit vitVar, jtq0 jtq0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bptVar;
        this.d = wotVar;
        this.e = vitVar;
        this.f = jtq0Var;
        this.h = new AtomicLong(jtq0Var.d());
    }

    public static void c(ek7 ek7Var, IOException iOException) {
        ek7Var.c.put("error_domain", iOException.getClass().getSimpleName());
        ConcurrentHashMap concurrentHashMap = ek7Var.c;
        String message = iOException.getMessage();
        if (message == null) {
            message = "";
        }
        concurrentHashMap.put("error_description", message);
    }

    public static final boolean f(ek7 ek7Var, w2j0 w2j0Var, sqo sqoVar) {
        Map map = sqoVar.c;
        ConcurrentHashMap concurrentHashMap = ek7Var.c;
        Object obj = concurrentHashMap.get("request_path");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return true;
        }
        Object obj2 = concurrentHashMap.get("request_kind");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (map.containsKey("*")) {
            return true;
        }
        return (str2 == null || evu0.J(str2)) ? map.containsKey(str) : jl40.l(map.get(str), str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0281, code lost:
    
        if (f(r6, r23, r2) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0102, code lost:
    
        if (defpackage.evu0.z(r0, '}') != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(yf7 yf7Var, Status status, tls tlsVar) {
        String str;
        jtq0 jtq0Var;
        String str2;
        String str3;
        String uuid;
        Object obj;
        String g0;
        sqo sqoVar = (sqo) this.a.c.get();
        if (sqoVar.a && sqoVar.b) {
            jtq0 jtq0Var2 = this.f;
            long d = jtq0Var2.d();
            Pair b = b(yf7Var);
            zj7 zj7Var = (zj7) b.getFirst();
            ek7 ek7Var = (ek7) b.getSecond();
            ConcurrentHashMap concurrentHashMap = this.g;
            if (ek7Var == null && status == Status.Enqueue) {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                d5j0 k = yf7Var.k();
                String Q = evu0.Q("/", evu0.k0(this.d.a(k)).toString());
                bxw bxwVar = (bxw) k.c(bxw.class);
                if (bxwVar != null) {
                    Method method = bxwVar.c;
                    str = Q;
                    wqs wqsVar = (wqs) method.getAnnotation(wqs.class);
                    if (wqsVar == null || (str2 = wqsVar.value()) == null) {
                        s490 s490Var = (s490) method.getAnnotation(s490.class);
                        if (s490Var != null) {
                            str2 = s490Var.value();
                        } else {
                            t490 t490Var = (t490) method.getAnnotation(t490.class);
                            str2 = t490Var != null ? t490Var.value() : null;
                            if (str2 == null) {
                                ipf ipfVar = (ipf) method.getAnnotation(ipf.class);
                                str2 = ipfVar != null ? ipfVar.value() : null;
                                if (str2 == null) {
                                    p390 p390Var = (p390) method.getAnnotation(p390.class);
                                    str2 = p390Var != null ? p390Var.value() : null;
                                    if (str2 == null) {
                                        e5u e5uVar = (e5u) method.getAnnotation(e5u.class);
                                        str2 = e5uVar != null ? e5uVar.value() : null;
                                        if (str2 == null) {
                                            ap60 ap60Var = (ap60) method.getAnnotation(ap60.class);
                                            if (ap60Var != null) {
                                                str2 = ap60Var.value();
                                            } else {
                                                jtq0Var = jtq0Var2;
                                                str2 = null;
                                                if (((ni21) method.getAnnotation(ni21.class)) == null) {
                                                    if (str2 != null) {
                                                        if (evu0.z(str2, '{')) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    jtq0Var = jtq0Var2;
                    if (((ni21) method.getAnnotation(ni21.class)) == null) {
                    }
                } else {
                    str = Q;
                    jtq0Var = jtq0Var2;
                }
                str2 = null;
                if (str2 != null) {
                    if (evu0.J(str)) {
                        g0 = str;
                    } else {
                        String Q2 = evu0.Q("/", evu0.k0(evu0.k0(str).toString()).toString());
                        g0 = evu0.g0(Q2, "/", Q2);
                    }
                    str3 = g8e.p(g0, "/", str2);
                } else {
                    str3 = str;
                }
                concurrentHashMap2.put("request_path", str3);
                a1o a1oVar = (a1o) k.c(a1o.class);
                concurrentHashMap2.put("request_kind", a1oVar != null ? a1oVar.a : "");
                concurrentHashMap2.put(ClidProvider.TIMESTAMP, Long.valueOf(jtq0Var.d()));
                j3z j3zVar = (j3z) k.c(j3z.class);
                if (j3zVar == null || (uuid = j3zVar.a) == null) {
                    uuid = UUID.randomUUID().toString();
                }
                concurrentHashMap2.put("local_id", uuid);
                Iterator it = sqoVar.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it.next();
                    if (cvu0.s(str3, (String) next, false)) {
                        obj = next;
                        break;
                    }
                }
                if (obj != null) {
                    concurrentHashMap2.put("request_host", k.a.d);
                }
                concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap2));
                return;
            }
            if (ek7Var != null) {
                Status status2 = ek7Var.a;
                ConcurrentHashMap concurrentHashMap3 = ek7Var.c;
                if (status2 == status) {
                    return;
                }
                tlsVar.invoke(ek7Var);
                long j = d - ek7Var.b;
                switch (v2j0.a[status.ordinal()]) {
                    case 1:
                        if (status2 == Status.Enqueue) {
                            concurrentHashMap3.put("local_queue_time", Long.valueOf(j));
                        }
                        concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap3));
                        break;
                    case 2:
                        String str4 = eho.a;
                        MapBuilder mapBuilder = new MapBuilder();
                        mapBuilder.put(NetworkEventParam.DURATION.getKey(), Long.valueOf(j));
                        eho.c(mapBuilder, NetworkEventParam.URL, concurrentHashMap3.get("proxy_url"));
                        eho.c(mapBuilder, NetworkEventParam.ROUTE, concurrentHashMap3.get("proxy_route"));
                        e(sqoVar, ek7Var, "Network.Proxy", mapBuilder.j());
                        concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap3));
                        break;
                    case 3:
                        if (status2 == Status.Enqueue) {
                            concurrentHashMap3.put("local_queue_time", Long.valueOf(j));
                        }
                        concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap3));
                        break;
                    case 4:
                        String str5 = eho.a;
                        MapBuilder mapBuilder2 = new MapBuilder();
                        mapBuilder2.put(NetworkEventParam.DURATION.getKey(), Long.valueOf(j));
                        eho.c(mapBuilder2, NetworkEventParam.HOST, concurrentHashMap3.get("dns_domain"));
                        eho.c(mapBuilder2, NetworkEventParam.IP, concurrentHashMap3.get("dns_ip"));
                        e(sqoVar, ek7Var, "Network.DNS", mapBuilder2.j());
                        concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap3));
                        break;
                    case 5:
                        if (status2 == Status.Enqueue) {
                            concurrentHashMap3.put("local_queue_time", Long.valueOf(j));
                        }
                        concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap3));
                        break;
                    case 6:
                        String str6 = eho.a;
                        MapBuilder mapBuilder3 = new MapBuilder();
                        mapBuilder3.put(NetworkEventParam.DURATION.getKey(), Long.valueOf(j));
                        eho.c(mapBuilder3, NetworkEventParam.IP, concurrentHashMap3.get("connection_ip"));
                        eho.c(mapBuilder3, NetworkEventParam.HOST, concurrentHashMap3.get("dns_domain"));
                        eho.c(mapBuilder3, NetworkEventParam.PATH, concurrentHashMap3.get("request_path"));
                        e(sqoVar, ek7Var, "Network.Connect.Success", mapBuilder3.j());
                        concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap3));
                        break;
                    case 7:
                        String str7 = eho.a;
                        MapBuilder mapBuilder4 = new MapBuilder();
                        eho.c(mapBuilder4, NetworkEventParam.ERROR_DOMAIN, concurrentHashMap3.get("error_domain"));
                        eho.c(mapBuilder4, NetworkEventParam.ERROR_DESCRIPTION, concurrentHashMap3.get("error_description"));
                        eho.c(mapBuilder4, NetworkEventParam.HOST, concurrentHashMap3.get("dns_domain"));
                        eho.c(mapBuilder4, NetworkEventParam.PATH, concurrentHashMap3.get("request_path"));
                        e(sqoVar, ek7Var, "Network.Connect.Failure", mapBuilder4.j());
                        concurrentHashMap.remove(zj7Var);
                        break;
                    case 8:
                        if (status2 == Status.Enqueue) {
                            concurrentHashMap3.put("local_queue_time", Long.valueOf(j));
                        }
                        if (!f(ek7Var, this, sqoVar)) {
                            String str8 = eho.a;
                            MapBuilder mapBuilder5 = new MapBuilder();
                            eho.c(mapBuilder5, NetworkEventParam.HOST, concurrentHashMap3.get("request_host"));
                            eho.c(mapBuilder5, NetworkEventParam.PATH, concurrentHashMap3.get("request_path"));
                            eho.c(mapBuilder5, NetworkEventParam.KIND, concurrentHashMap3.get("request_kind"));
                            eho.c(mapBuilder5, NetworkEventParam.LOCAL_ID, concurrentHashMap3.get("local_id"));
                            e(sqoVar, ek7Var, "Network.Request", mapBuilder5.j());
                        }
                        concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap3));
                        break;
                    case 9:
                        concurrentHashMap3.put("request_duration", Long.valueOf(j));
                        concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap3));
                        break;
                    case 10:
                        Object obj2 = concurrentHashMap3.get("request_duration");
                        Long l = obj2 instanceof Long ? (Long) obj2 : null;
                        concurrentHashMap3.put("request_duration", Long.valueOf((l != null ? l.longValue() : 0L) + j));
                        d(ek7Var);
                        if (concurrentHashMap3.get("error_domain") == null) {
                            break;
                        } else {
                            e(sqoVar, ek7Var, "Network.Failure", eho.a(ek7Var));
                        }
                        concurrentHashMap.remove(zj7Var);
                        break;
                    case 11:
                        d(ek7Var);
                        e(sqoVar, ek7Var, "Network.Failure", eho.a(ek7Var));
                        concurrentHashMap.remove(zj7Var);
                        break;
                    case 12:
                        d(ek7Var);
                        String str9 = eho.a;
                        MapBuilder mapBuilder6 = new MapBuilder();
                        eho.c(mapBuilder6, NetworkEventParam.HOST, concurrentHashMap3.get("request_host"));
                        eho.c(mapBuilder6, NetworkEventParam.PATH, concurrentHashMap3.get("request_path"));
                        eho.c(mapBuilder6, NetworkEventParam.KIND, concurrentHashMap3.get("request_kind"));
                        eho.c(mapBuilder6, NetworkEventParam.LOCAL_QUEUE_DURATION, concurrentHashMap3.get("local_queue_time"));
                        eho.c(mapBuilder6, NetworkEventParam.LOCAL_ID, concurrentHashMap3.get("local_id"));
                        eho.c(mapBuilder6, NetworkEventParam.RETRY_NUMBER, concurrentHashMap3.get("retry_number"));
                        eho.c(mapBuilder6, NetworkEventParam.TOTAL_DURATION, concurrentHashMap3.get("total_duration"));
                        e(sqoVar, ek7Var, "Network.Cancelled", mapBuilder6.j());
                        concurrentHashMap.remove(zj7Var);
                        break;
                    case 13:
                        d(ek7Var);
                        if (!f(ek7Var, this, sqoVar)) {
                            e(sqoVar, ek7Var, "Network.Success", eho.b(ek7Var));
                        }
                        concurrentHashMap.remove(zj7Var);
                        break;
                    default:
                        concurrentHashMap.put(zj7Var, new ek7(status, d, concurrentHashMap3));
                        break;
                }
                long d2 = jtq0Var2.d();
                AtomicLong atomicLong = this.h;
                if (d2 - atomicLong.get() > 10000) {
                    concurrentHashMap.entrySet().removeIf(new md3(17, new u2j0(jtq0Var2.d() - 30000, this, sqoVar)));
                    atomicLong.set(d2);
                }
            }
        }
    }

    public final Pair b(yf7 yf7Var) {
        zj7 zj7Var = new zj7(yf7Var);
        return new Pair(zj7Var, (ek7) this.g.get(zj7Var));
    }

    public final void d(ek7 ek7Var) {
        ConcurrentHashMap concurrentHashMap = ek7Var.c;
        Object obj = concurrentHashMap.get(ClidProvider.TIMESTAMP);
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            concurrentHashMap.put("total_duration", Long.valueOf(this.f.d() - l.longValue()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        if (r1.contains("regular") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        if (r10.equals("Network.Request") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b1, code lost:
    
        r2 = new java.util.LinkedHashMap();
        r8 = r11.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c2, code lost:
    
        if (r8.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        r9 = (java.util.Map.Entry) r8.next();
        r0 = (java.lang.String) r9.getKey();
        com.yandex.go.network_metrics.NetworkEventParam.Companion.getClass();
        r3 = com.yandex.go.network_metrics.NetworkEventParam.paramsByKey;
        r0 = (com.yandex.go.network_metrics.NetworkEventParam) r3.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e1, code lost:
    
        r0 = r0.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        if (r0 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        r2.put(r9.getKey(), r9.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if (r2 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        ((ru.yandex.taxi.analytics.q) r7).h(r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:
    
        if (r1.contains("statbox") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
    
        r8 = new java.util.LinkedHashMap(defpackage.gw00.d(r11.size()));
        r9 = r11.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0120, code lost:
    
        if (r9.hasNext() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0122, code lost:
    
        r11 = (java.util.Map.Entry) r9.next();
        r0 = r11.getKey();
        r11 = r11.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0130, code lost:
    
        if (r11 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0132, code lost:
    
        r11 = kotlinx.serialization.json.JsonNull.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0153, code lost:
    
        r8.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0137, code lost:
    
        if ((r11 instanceof java.lang.Number) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0139, code lost:
    
        r11 = defpackage.qcx.b((java.lang.Number) r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0142, code lost:
    
        if ((r11 instanceof java.lang.Boolean) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0144, code lost:
    
        r11 = defpackage.qcx.a((java.lang.Boolean) r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014b, code lost:
    
        r11 = defpackage.qcx.c(r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0157, code lost:
    
        ((ru.yandex.taxi.analytics.q) r7).c(r10, new kotlinx.serialization.json.c(r8).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0165, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(sqo sqoVar, ek7 ek7Var, String str, MapBuilder mapBuilder) {
        Object obj = ek7Var.c.get("request_path");
        LinkedHashMap linkedHashMap = null;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            str2 = "";
        }
        Object obj2 = ek7Var.c.get("request_kind");
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        Map o = b.o(b.n(mapBuilder, (Map) this.i.updateAndGet(new saj(5, this))), new Pair(NetworkEventParam.TIMESTAMP.getKey(), Long.valueOf(this.f.d())));
        ReportingDestination reportingDestination = sqoVar.e;
        ac20 ac20Var = (ac20) this.e.b;
        List list = reportingDestination.a;
        List<ReportingEndpoint> list2 = reportingDestination.b;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (ReportingEndpoint reportingEndpoint : list2) {
                String str4 = reportingEndpoint.a;
                String str5 = reportingEndpoint.b;
                if (str4.length() > 0 && evu0.y(str2, reportingEndpoint.a, false) && (str5.length() == 0 || (str3 != null && evu0.y(str3, str5, false)))) {
                    break;
                }
            }
        }
    }
}
