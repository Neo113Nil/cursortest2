package ru.yandex.taxi.analytics;

import com.yandex.auth.LegacyAccountType;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.auu0;
import defpackage.cne0;
import defpackage.cta1;
import defpackage.dqe0;
import defpackage.h1p;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.k42;
import defpackage.kj;
import defpackage.nly;
import defpackage.nmx;
import defpackage.ny61;
import defpackage.o22;
import defpackage.o2y0;
import defpackage.oly;
import defpackage.p2y0;
import defpackage.p53;
import defpackage.ply;
import defpackage.pz40;
import defpackage.qcx;
import defpackage.qly;
import defpackage.qqd0;
import defpackage.rly;
import defpackage.rqd0;
import defpackage.sly;
import defpackage.tcc;
import defpackage.tly;
import defpackage.w511;
import defpackage.w9w0;
import defpackage.wnt;
import defpackage.x2p;
import defpackage.xnt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes9.dex */
public final class g {
    public final ru.yandex.taxi.startup.launch.h a;
    public final h3y b;
    public final h3y c;
    public final x2p d;
    public final dqe0 e;
    public final h3y f;
    public final k42 g;
    public final rqd0 h;
    public final o22 i;
    public final wnt j;
    public final w9w0 k;

    public g(ru.yandex.taxi.startup.launch.h hVar, h3y h3yVar, h3y h3yVar2, x2p x2pVar, dqe0 dqe0Var, h3y h3yVar3, k42 k42Var, rqd0 rqd0Var, o22 o22Var, wnt wntVar, w9w0 w9w0Var) {
        this.a = hVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = x2pVar;
        this.e = dqe0Var;
        this.f = h3yVar3;
        this.g = k42Var;
        this.h = rqd0Var;
        this.i = o22Var;
        this.j = wntVar;
        this.k = w9w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da A[LOOP:0: B:58:0x00d4->B:60:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AnalyticsCommonParamsManager$createCommonParams$1 analyticsCommonParamsManager$createCommonParams$1;
        Object obj;
        Object obj2;
        int i;
        Map mapBuilder;
        String str;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        kotlinx.serialization.json.b bVar;
        Long valueOf;
        String str2;
        Map map5;
        String str3;
        Map map6;
        Map map7;
        String str4;
        String str5;
        if (continuationImpl instanceof AnalyticsCommonParamsManager$createCommonParams$1) {
            analyticsCommonParamsManager$createCommonParams$1 = (AnalyticsCommonParamsManager$createCommonParams$1) continuationImpl;
            int i2 = analyticsCommonParamsManager$createCommonParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsCommonParamsManager$createCommonParams$1.label = i2 - Integer.MIN_VALUE;
                obj = analyticsCommonParamsManager$createCommonParams$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsCommonParamsManager$createCommonParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapBuilder = new MapBuilder();
                    ru.yandex.taxi.startup.launch.h hVar = this.a;
                    mapBuilder.put("userid", qcx.c(hVar.Hg()));
                    mapBuilder.put("phone_id", qcx.c(((cne0) hVar.b).l("phone_id", null)));
                    mapBuilder.put("phone_pd_id", qcx.c(hVar.Jg()));
                    analyticsCommonParamsManager$createCommonParams$1.L$0 = mapBuilder;
                    analyticsCommonParamsManager$createCommonParams$1.L$1 = mapBuilder;
                    str = "zone_mode";
                    analyticsCommonParamsManager$createCommonParams$1.L$2 = "zone_mode";
                    analyticsCommonParamsManager$createCommonParams$1.L$3 = mapBuilder;
                    analyticsCommonParamsManager$createCommonParams$1.label = 1;
                    obj = g(analyticsCommonParamsManager$createCommonParams$1);
                    if (obj != obj2) {
                        map = mapBuilder;
                        map2 = map;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        map3 = (Map) analyticsCommonParamsManager$createCommonParams$1.L$1;
                        map4 = (Map) analyticsCommonParamsManager$createCommonParams$1.L$0;
                        kotlin.b.b(obj);
                        bVar = (kotlinx.serialization.json.b) obj;
                        if (bVar != null) {
                        }
                        h3y h3yVar = this.c;
                        kj Ig = ((ru.yandex.taxi.am.g) h3yVar.get()).a.Ig();
                        valueOf = Ig == null ? Long.valueOf(Ig.a) : null;
                        if (valueOf != null) {
                        }
                        kj Ig2 = ((ru.yandex.taxi.am.g) h3yVar.get()).a.Ig();
                        str2 = Ig2 == null ? Ig2.m ? "phonish" : "yandex" : null;
                        if (str2 != null) {
                        }
                        analyticsCommonParamsManager$createCommonParams$1.L$0 = map4;
                        analyticsCommonParamsManager$createCommonParams$1.L$1 = map3;
                        analyticsCommonParamsManager$createCommonParams$1.label = 3;
                        obj = e(analyticsCommonParamsManager$createCommonParams$1);
                        if (obj != obj2) {
                            map5 = map4;
                            str3 = (String) obj;
                            if (str3 != null) {
                            }
                            String a = this.k.a();
                            if (a != null) {
                            }
                            if (str4 != null) {
                            }
                            map3.put("MainScreenVersion", qcx.c(this.g.a.getAnalyticsName()));
                            return new kotlinx.serialization.json.c(((MapBuilder) map5).j());
                        }
                        return obj2;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map6 = (Map) analyticsCommonParamsManager$createCommonParams$1.L$1;
                        map7 = (Map) analyticsCommonParamsManager$createCommonParams$1.L$0;
                        kotlin.b.b(obj);
                        str5 = (String) obj;
                        if (str5 != null) {
                        }
                        map5 = map7;
                        map3 = map6;
                        String a2 = this.k.a();
                        str4 = a2 != null ? a2 : null;
                        if (str4 != null) {
                        }
                        map3.put("MainScreenVersion", qcx.c(this.g.a.getAnalyticsName()));
                        return new kotlinx.serialization.json.c(((MapBuilder) map5).j());
                    }
                    map3 = (Map) analyticsCommonParamsManager$createCommonParams$1.L$1;
                    map5 = (Map) analyticsCommonParamsManager$createCommonParams$1.L$0;
                    kotlin.b.b(obj);
                    str3 = (String) obj;
                    if (str3 != null) {
                        map3.put("orderid", qcx.c(str3));
                        analyticsCommonParamsManager$createCommonParams$1.L$0 = map5;
                        analyticsCommonParamsManager$createCommonParams$1.L$1 = map3;
                        analyticsCommonParamsManager$createCommonParams$1.L$2 = null;
                        analyticsCommonParamsManager$createCommonParams$1.label = 4;
                        obj = f(analyticsCommonParamsManager$createCommonParams$1);
                        if (obj != obj2) {
                            map6 = map3;
                            map7 = map5;
                            str5 = (String) obj;
                            if (str5 != null) {
                            }
                            map5 = map7;
                            map3 = map6;
                        }
                        return obj2;
                    }
                    String a22 = this.k.a();
                    if (a22 != null) {
                    }
                    if (str4 != null) {
                    }
                    map3.put("MainScreenVersion", qcx.c(this.g.a.getAnalyticsName()));
                    return new kotlinx.serialization.json.c(((MapBuilder) map5).j());
                }
                mapBuilder = (Map) analyticsCommonParamsManager$createCommonParams$1.L$3;
                str = (String) analyticsCommonParamsManager$createCommonParams$1.L$2;
                map = (Map) analyticsCommonParamsManager$createCommonParams$1.L$1;
                map2 = (Map) analyticsCommonParamsManager$createCommonParams$1.L$0;
                kotlin.b.b(obj);
                mapBuilder.put(str, qcx.c((String) obj));
                for (Map.Entry entry : this.d.a().entrySet()) {
                    map.put(((h1p) entry.getKey()).getValue(), ((xnt) this.j).a((Set) entry.getValue(), new p53(auu0.a, 1)));
                }
                analyticsCommonParamsManager$createCommonParams$1.L$0 = map2;
                analyticsCommonParamsManager$createCommonParams$1.L$1 = map;
                analyticsCommonParamsManager$createCommonParams$1.L$2 = null;
                analyticsCommonParamsManager$createCommonParams$1.L$3 = null;
                analyticsCommonParamsManager$createCommonParams$1.label = 2;
                obj = c(analyticsCommonParamsManager$createCommonParams$1);
                if (obj != obj2) {
                    map3 = map;
                    map4 = map2;
                    bVar = (kotlinx.serialization.json.b) obj;
                    if (bVar != null) {
                    }
                    h3y h3yVar2 = this.c;
                    kj Ig3 = ((ru.yandex.taxi.am.g) h3yVar2.get()).a.Ig();
                    if (Ig3 == null) {
                    }
                    if (valueOf != null) {
                    }
                    kj Ig22 = ((ru.yandex.taxi.am.g) h3yVar2.get()).a.Ig();
                    if (Ig22 == null) {
                    }
                    if (str2 != null) {
                    }
                    analyticsCommonParamsManager$createCommonParams$1.L$0 = map4;
                    analyticsCommonParamsManager$createCommonParams$1.L$1 = map3;
                    analyticsCommonParamsManager$createCommonParams$1.label = 3;
                    obj = e(analyticsCommonParamsManager$createCommonParams$1);
                    if (obj != obj2) {
                    }
                }
                return obj2;
            }
        }
        analyticsCommonParamsManager$createCommonParams$1 = new AnalyticsCommonParamsManager$createCommonParams$1(this, continuationImpl);
        obj = analyticsCommonParamsManager$createCommonParams$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsCommonParamsManager$createCommonParams$1.label;
        if (i != 0) {
        }
        mapBuilder.put(str, qcx.c((String) obj));
        while (r14.hasNext()) {
        }
        analyticsCommonParamsManager$createCommonParams$1.L$0 = map2;
        analyticsCommonParamsManager$createCommonParams$1.L$1 = map;
        analyticsCommonParamsManager$createCommonParams$1.L$2 = null;
        analyticsCommonParamsManager$createCommonParams$1.L$3 = null;
        analyticsCommonParamsManager$createCommonParams$1.label = 2;
        obj = c(analyticsCommonParamsManager$createCommonParams$1);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0078, code lost:
    
        if (r5 == r2) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0089  */
    /* JADX WARN: Type inference failed for: r11v46, types: [p2y0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, ContinuationImpl continuationImpl) {
        AnalyticsCommonParamsManager$createCommonParamsMap$1 analyticsCommonParamsManager$createCommonParamsMap$1;
        int i;
        String Hg;
        e0 e0Var;
        Object k;
        Iterator it;
        Object obj;
        o2y0 o2y0Var;
        String str2;
        kj Ig;
        MapBuilder mapBuilder;
        String str3;
        String str4;
        sly slyVar;
        rly rlyVar = rly.a;
        if (continuationImpl instanceof AnalyticsCommonParamsManager$createCommonParamsMap$1) {
            analyticsCommonParamsManager$createCommonParamsMap$1 = (AnalyticsCommonParamsManager$createCommonParamsMap$1) continuationImpl;
            int i2 = analyticsCommonParamsManager$createCommonParamsMap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsCommonParamsManager$createCommonParamsMap$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = analyticsCommonParamsManager$createCommonParamsMap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsCommonParamsManager$createCommonParamsMap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Hg = this.a.Hg();
                    p2y0 p2y0Var = (p2y0) this.b.get();
                    analyticsCommonParamsManager$createCommonParamsMap$1.L$0 = str;
                    analyticsCommonParamsManager$createCommonParamsMap$1.L$1 = Hg;
                    analyticsCommonParamsManager$createCommonParamsMap$1.L$2 = p2y0Var;
                    analyticsCommonParamsManager$createCommonParamsMap$1.label = 1;
                    e0Var = (e0) p2y0Var;
                    k = e0Var.k(analyticsCommonParamsManager$createCommonParamsMap$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) analyticsCommonParamsManager$createCommonParamsMap$1.L$1;
                        kotlin.b.b(obj2);
                        o2y0Var = (o2y0) obj2;
                        Hg = str2;
                        Ig = ((ru.yandex.taxi.am.g) this.c.get()).a.Ig();
                        mapBuilder = new MapBuilder();
                        if (Hg != null && Hg.length() != 0) {
                            mapBuilder.put("userid", Hg);
                        }
                        LinkedHashMap a = this.d.a();
                        for (h1p h1pVar : a.keySet()) {
                            String value = h1pVar.getValue();
                            Object obj3 = (Set) a.get(h1pVar);
                            if (obj3 == null) {
                                obj3 = EmptySet.a;
                            }
                            mapBuilder.put(value, obj3.toString());
                        }
                        if (o2y0Var != null) {
                            if (!o2y0Var.b().I()) {
                                mapBuilder.put("orderid", o2y0Var.b().a);
                            }
                            TaxiOrder b = o2y0Var.b();
                            DriveState driveState = b.V().i;
                            if (driveState != null) {
                                mapBuilder.put("OrderStatus", cta1.d(driveState));
                            }
                            mapBuilder.put("zone_mode", b.b.Q);
                        } else {
                            mapBuilder.put("zone_mode", this.e.a.Q);
                        }
                        mapBuilder.put("ongoing_orderids", ((nmx) this.f.get()).a());
                        if (Ig != null) {
                            mapBuilder.put("account_uid", new Long(Ig.a));
                            String l = ((cne0) this.a.b).l("phone_id", null);
                            if (l != null) {
                                mapBuilder.put("phone_id", l);
                            }
                            String Jg = this.a.Jg();
                            if (Jg != null) {
                                mapBuilder.put("phone_pd_id", Jg);
                            }
                            if (Ig.m) {
                                mapBuilder.put("account_type", "phonish");
                            } else if (Ig.n) {
                                mapBuilder.put("account_type", "yandex");
                            } else if (Ig.p) {
                                mapBuilder.put("account_type", "lite");
                            } else if (Ig.o) {
                                mapBuilder.put("account_type", LegacyAccountType.STRING_SOCIAL);
                            } else {
                                mapBuilder.put("account_type", "yandex.no_email");
                            }
                        }
                        mapBuilder.put("have_plus_flg", Boolean.valueOf(((qqd0) this.h.a.getValue()).b));
                        str3 = this.i.b;
                        if (str3 != null) {
                            mapBuilder.put("order_key", str3);
                            o22 o22Var = this.i;
                            String str5 = o22Var.b;
                            String str6 = "";
                            if (str5 != null) {
                                pz40 pz40Var = (pz40) o22Var.a.a.get(str5);
                                if (pz40Var == null || (slyVar = (sly) ((r0) pz40Var).getValue()) == null) {
                                    slyVar = rlyVar;
                                }
                                if (!slyVar.equals(rlyVar) && !slyVar.equals(qly.a)) {
                                    if (slyVar instanceof oly) {
                                        tly b2 = ((oly) slyVar).b();
                                        if (b2 != null) {
                                            str6 = b2.g();
                                        }
                                    } else if (slyVar instanceof nly) {
                                        str6 = ((nly) slyVar).b().g();
                                    } else {
                                        if (!(slyVar instanceof ply)) {
                                            w511.b();
                                            return null;
                                        }
                                        str6 = ((ply) slyVar).b().g();
                                    }
                                }
                            }
                            mapBuilder.put("order_status", str6);
                        }
                        String a2 = this.k.a();
                        str4 = a2 != null ? a2 : null;
                        if (str4 != null) {
                            mapBuilder.put("superapp_session", str4);
                        }
                        mapBuilder.put("MainScreenVersion", this.g.a.getAnalyticsName());
                        return mapBuilder.j();
                    }
                    ?? r11 = (p2y0) analyticsCommonParamsManager$createCommonParamsMap$1.L$2;
                    String str7 = (String) analyticsCommonParamsManager$createCommonParamsMap$1.L$1;
                    String str8 = (String) analyticsCommonParamsManager$createCommonParamsMap$1.L$0;
                    kotlin.b.b(obj2);
                    e0Var = r11;
                    str = str8;
                    k = obj2;
                    Hg = str7;
                }
                it = ((List) k).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((o2y0) obj).b().a, str)) {
                        break;
                    }
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var == null) {
                    analyticsCommonParamsManager$createCommonParamsMap$1.L$0 = null;
                    analyticsCommonParamsManager$createCommonParamsMap$1.L$1 = Hg;
                    analyticsCommonParamsManager$createCommonParamsMap$1.L$2 = null;
                    analyticsCommonParamsManager$createCommonParamsMap$1.L$3 = null;
                    analyticsCommonParamsManager$createCommonParamsMap$1.label = 2;
                    Object y = e0Var.y(analyticsCommonParamsManager$createCommonParamsMap$1);
                    if (y != coroutineSingletons) {
                        String str9 = Hg;
                        obj2 = y;
                        str2 = str9;
                        o2y0Var = (o2y0) obj2;
                        Hg = str2;
                    }
                    return coroutineSingletons;
                }
                Ig = ((ru.yandex.taxi.am.g) this.c.get()).a.Ig();
                mapBuilder = new MapBuilder();
                if (Hg != null) {
                    mapBuilder.put("userid", Hg);
                }
                LinkedHashMap a3 = this.d.a();
                while (r2.hasNext()) {
                }
                if (o2y0Var != null) {
                }
                mapBuilder.put("ongoing_orderids", ((nmx) this.f.get()).a());
                if (Ig != null) {
                }
                mapBuilder.put("have_plus_flg", Boolean.valueOf(((qqd0) this.h.a.getValue()).b));
                str3 = this.i.b;
                if (str3 != null) {
                }
                String a22 = this.k.a();
                if (a22 != null) {
                }
                if (str4 != null) {
                }
                mapBuilder.put("MainScreenVersion", this.g.a.getAnalyticsName());
                return mapBuilder.j();
            }
        }
        analyticsCommonParamsManager$createCommonParamsMap$1 = new AnalyticsCommonParamsManager$createCommonParamsMap$1(this, continuationImpl);
        Object obj22 = analyticsCommonParamsManager$createCommonParamsMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsCommonParamsManager$createCommonParamsMap$1.label;
        if (i != 0) {
        }
        it = ((List) k).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        o2y0Var = (o2y0) obj;
        if (o2y0Var == null) {
        }
        Ig = ((ru.yandex.taxi.am.g) this.c.get()).a.Ig();
        mapBuilder = new MapBuilder();
        if (Hg != null) {
        }
        LinkedHashMap a32 = this.d.a();
        while (r2.hasNext()) {
        }
        if (o2y0Var != null) {
        }
        mapBuilder.put("ongoing_orderids", ((nmx) this.f.get()).a());
        if (Ig != null) {
        }
        mapBuilder.put("have_plus_flg", Boolean.valueOf(((qqd0) this.h.a.getValue()).b));
        str3 = this.i.b;
        if (str3 != null) {
        }
        String a222 = this.k.a();
        if (a222 != null) {
        }
        if (str4 != null) {
        }
        mapBuilder.put("MainScreenVersion", this.g.a.getAnalyticsName());
        return mapBuilder.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        AnalyticsCommonParamsManager$getActiveOrderIds$1 analyticsCommonParamsManager$getActiveOrderIds$1;
        int i;
        List list;
        if (continuationImpl instanceof AnalyticsCommonParamsManager$getActiveOrderIds$1) {
            analyticsCommonParamsManager$getActiveOrderIds$1 = (AnalyticsCommonParamsManager$getActiveOrderIds$1) continuationImpl;
            int i2 = analyticsCommonParamsManager$getActiveOrderIds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsCommonParamsManager$getActiveOrderIds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = analyticsCommonParamsManager$getActiveOrderIds$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsCommonParamsManager$getActiveOrderIds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    analyticsCommonParamsManager$getActiveOrderIds$1.label = 1;
                    obj = d(analyticsCommonParamsManager$getActiveOrderIds$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return null;
                }
                return ((xnt) this.j).a(list, new p53(auu0.a, 0));
            }
        }
        analyticsCommonParamsManager$getActiveOrderIds$1 = new AnalyticsCommonParamsManager$getActiveOrderIds$1(this, continuationImpl);
        Object obj3 = analyticsCommonParamsManager$getActiveOrderIds$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsCommonParamsManager$getActiveOrderIds$1.label;
        if (i != 0) {
        }
        list = (List) obj3;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[LOOP:1: B:22:0x0079->B:24:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(ContinuationImpl continuationImpl) {
        AnalyticsCommonParamsManager$getActiveOrdersIds$1 analyticsCommonParamsManager$getActiveOrdersIds$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof AnalyticsCommonParamsManager$getActiveOrdersIds$1) {
            analyticsCommonParamsManager$getActiveOrdersIds$1 = (AnalyticsCommonParamsManager$getActiveOrdersIds$1) continuationImpl;
            int i2 = analyticsCommonParamsManager$getActiveOrdersIds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsCommonParamsManager$getActiveOrdersIds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = analyticsCommonParamsManager$getActiveOrdersIds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsCommonParamsManager$getActiveOrdersIds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 p2y0Var = (p2y0) this.b.get();
                    analyticsCommonParamsManager$getActiveOrdersIds$1.label = 1;
                    obj = ((e0) p2y0Var).k(analyticsCommonParamsManager$getActiveOrdersIds$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (!((o2y0) obj2).b().I()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((o2y0) it.next()).b().a);
                }
                return arrayList2;
            }
        }
        analyticsCommonParamsManager$getActiveOrdersIds$1 = new AnalyticsCommonParamsManager$getActiveOrdersIds$1(this, continuationImpl);
        Object obj3 = analyticsCommonParamsManager$getActiveOrdersIds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsCommonParamsManager$getActiveOrdersIds$1.label;
        if (i != 0) {
        }
        ArrayList arrayList3 = new ArrayList();
        while (r5.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        AnalyticsCommonParamsManager$getOrderId$1 analyticsCommonParamsManager$getOrderId$1;
        int i;
        o2y0 o2y0Var;
        if (continuationImpl instanceof AnalyticsCommonParamsManager$getOrderId$1) {
            analyticsCommonParamsManager$getOrderId$1 = (AnalyticsCommonParamsManager$getOrderId$1) continuationImpl;
            int i2 = analyticsCommonParamsManager$getOrderId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsCommonParamsManager$getOrderId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = analyticsCommonParamsManager$getOrderId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsCommonParamsManager$getOrderId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    analyticsCommonParamsManager$getOrderId$1.label = 1;
                    obj = ((e0) ((p2y0) this.b.get())).y(analyticsCommonParamsManager$getOrderId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null || o2y0Var.b().I()) {
                    return null;
                }
                return o2y0Var.b().a;
            }
        }
        analyticsCommonParamsManager$getOrderId$1 = new AnalyticsCommonParamsManager$getOrderId$1(this, continuationImpl);
        Object obj2 = analyticsCommonParamsManager$getOrderId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsCommonParamsManager$getOrderId$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        AnalyticsCommonParamsManager$getOrderState$1 analyticsCommonParamsManager$getOrderState$1;
        int i;
        o2y0 o2y0Var;
        if (continuationImpl instanceof AnalyticsCommonParamsManager$getOrderState$1) {
            analyticsCommonParamsManager$getOrderState$1 = (AnalyticsCommonParamsManager$getOrderState$1) continuationImpl;
            int i2 = analyticsCommonParamsManager$getOrderState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsCommonParamsManager$getOrderState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = analyticsCommonParamsManager$getOrderState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsCommonParamsManager$getOrderState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    analyticsCommonParamsManager$getOrderState$1.label = 1;
                    obj = ((e0) ((p2y0) this.b.get())).y(analyticsCommonParamsManager$getOrderState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var == null) {
                    return cta1.d(o2y0Var.c());
                }
                return null;
            }
        }
        analyticsCommonParamsManager$getOrderState$1 = new AnalyticsCommonParamsManager$getOrderState$1(this, continuationImpl);
        Object obj2 = analyticsCommonParamsManager$getOrderState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsCommonParamsManager$getOrderState$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        AnalyticsCommonParamsManager$getZoneMode$1 analyticsCommonParamsManager$getZoneMode$1;
        int i;
        TaxiOrder b;
        String str;
        if (continuationImpl instanceof AnalyticsCommonParamsManager$getZoneMode$1) {
            analyticsCommonParamsManager$getZoneMode$1 = (AnalyticsCommonParamsManager$getZoneMode$1) continuationImpl;
            int i2 = analyticsCommonParamsManager$getZoneMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                analyticsCommonParamsManager$getZoneMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = analyticsCommonParamsManager$getZoneMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = analyticsCommonParamsManager$getZoneMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    analyticsCommonParamsManager$getZoneMode$1.label = 1;
                    obj = ((e0) ((p2y0) this.b.get())).y(analyticsCommonParamsManager$getZoneMode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var = (o2y0) obj;
                return (o2y0Var != null || (b = o2y0Var.b()) == null || (str = b.b.Q) == null) ? this.e.a.Q : str;
            }
        }
        analyticsCommonParamsManager$getZoneMode$1 = new AnalyticsCommonParamsManager$getZoneMode$1(this, continuationImpl);
        Object obj2 = analyticsCommonParamsManager$getZoneMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = analyticsCommonParamsManager$getZoneMode$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj2;
        if (o2y0Var2 != null) {
        }
    }
}
