package flex.core.loader.network;

import com.yandex.div.state.db.StateEntry;
import core.network.mapi.exception.MapiClientException;
import defpackage.bvf0;
import defpackage.c2r0;
import defpackage.cnr0;
import defpackage.dai0;
import defpackage.dez;
import defpackage.f0m;
import defpackage.fxl;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.h2m;
import defpackage.i3y;
import defpackage.i7x0;
import defpackage.ie7;
import defpackage.ig90;
import defpackage.j1m;
import defpackage.j73;
import defpackage.jg90;
import defpackage.jp50;
import defpackage.jse;
import defpackage.kc7;
import defpackage.kg90;
import defpackage.kp50;
import defpackage.kq90;
import defpackage.l2m;
import defpackage.lu00;
import defpackage.m631;
import defpackage.n2m;
import defpackage.ng90;
import defpackage.ny61;
import defpackage.og90;
import defpackage.oyr;
import defpackage.p2m;
import defpackage.p7j0;
import defpackage.pu00;
import defpackage.q370;
import defpackage.qu00;
import defpackage.r2m;
import defpackage.rbx;
import defpackage.s7s0;
import defpackage.sbc;
import defpackage.sbx;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tjr;
import defpackage.u1m;
import defpackage.unr0;
import defpackage.uu00;
import defpackage.uyg;
import defpackage.uzl;
import defpackage.v5j0;
import defpackage.vez0;
import defpackage.vzl;
import defpackage.w511;
import defpackage.wbe0;
import defpackage.wu00;
import defpackage.wwq;
import defpackage.wzl;
import defpackage.xfz;
import defpackage.xjr;
import defpackage.xu00;
import defpackage.xw91;
import defpackage.xzl;
import defpackage.yjr;
import defpackage.yu00;
import defpackage.ywl;
import defpackage.zjr;
import flex.health.ErrorTypes;
import flex.loader.DocumentFetchOrigin;
import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final class d implements dez {
    public final sls A;
    public final zjr B;
    public final lu00 a;
    public final l2m b;
    public final jse c;
    public final r2m w;
    public final jp50 x;
    public final fxl y;
    public final wwq z;

    public d(lu00 lu00Var, l2m l2mVar, jse jseVar, r2m r2mVar, jp50 jp50Var, fxl fxlVar, wwq wwqVar, sls slsVar) {
        this.a = lu00Var;
        this.b = l2mVar;
        this.c = jseVar;
        this.w = r2mVar;
        this.x = jp50Var;
        this.y = fxlVar;
        this.z = wwqVar;
        this.A = slsVar;
        this.B = new zjr(xfz.b(d.class.getSimpleName()));
    }

    public static final uu00 b(d dVar, u1m u1mVar, wbe0 wbe0Var, Map map, kotlinx.serialization.json.c cVar) {
        dVar.getClass();
        String str = u1mVar.a;
        LinkedHashMap n = kotlin.collections.b.n(u1mVar.b, wbe0Var.a);
        Map z = g8e.z("Compat-Vector", "+Q+y6l");
        Map map2 = u1mVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map2.size()));
            for (Map.Entry entry : map2.entrySet()) {
                linkedHashMap2.put(entry.getKey(), xw91.m(entry.getValue()));
            }
            linkedHashMap.put("request", new kotlinx.serialization.json.c(linkedHashMap2));
        }
        if (cVar != null) {
            linkedHashMap.put("context", cVar);
        }
        xw91.g(xw91.n(wbe0Var.b), linkedHashMap);
        rbx rbxVar = sbx.d;
        kotlinx.serialization.json.c cVar2 = new kotlinx.serialization.json.c(kotlin.collections.b.n(linkedHashMap, gw00.e(new Pair("payload", new kotlinx.serialization.json.c(map)))));
        rbxVar.getClass();
        return new uu00(str, z, n, rbxVar.c(cVar2, kotlinx.serialization.json.c.Companion.serializer()));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(5:(2:3|(12:5|6|7|8|(1:(4:11|12|13|14)(2:68|69))(13:70|71|72|73|74|75|76|77|78|79|80|81|(1:83)(1:84))|15|16|17|18|19|20|21))|18|19|20|21)|99|6|7|8|(0)(0)|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bc, code lost:
    
        r6 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x0048, B:16:0x0098, B:19:0x00a6, B:30:0x00da, B:36:0x011f, B:39:0x0127, B:43:0x013d, B:45:0x0145, B:72:0x0069, B:75:0x0074, B:78:0x0078, B:81:0x0086), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d A[Catch: all -> 0x016f, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x016f, blocks: (B:28:0x00cf, B:31:0x00dd, B:34:0x010d, B:48:0x014b), top: B:27:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, u1m u1mVar, uu00 uu00Var, c cVar, i7x0 i7x0Var, boolean z, List list, boolean z2, v5j0 v5j0Var, ContinuationImpl continuationImpl) {
        DocumentService$tryLoadFromNetwork$1 documentService$tryLoadFromNetwork$1;
        int i;
        Throwable th;
        zjr zjrVar;
        i7x0 i7x0Var2;
        List list2;
        boolean z3;
        v5j0 v5j0Var2;
        d dVar2;
        boolean booleanValue;
        tjr tjrVar;
        StackTraceElement stackTraceElement;
        String fileName;
        Integer num;
        u1m u1mVar2;
        u1m u1mVar3;
        v5j0 v5j0Var3;
        i7x0 i7x0Var3;
        List list3;
        boolean z4;
        zjr zjrVar2 = dVar.B;
        try {
            try {
                if (continuationImpl instanceof DocumentService$tryLoadFromNetwork$1) {
                    documentService$tryLoadFromNetwork$1 = (DocumentService$tryLoadFromNetwork$1) continuationImpl;
                    int i2 = documentService$tryLoadFromNetwork$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        documentService$tryLoadFromNetwork$1.label = i2 - Integer.MIN_VALUE;
                        DocumentService$tryLoadFromNetwork$1 documentService$tryLoadFromNetwork$12 = documentService$tryLoadFromNetwork$1;
                        Object obj = documentService$tryLoadFromNetwork$12.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = documentService$tryLoadFromNetwork$12.label;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            try {
                                zjrVar2.b();
                                documentService$tryLoadFromNetwork$12.L$0 = u1mVar;
                                documentService$tryLoadFromNetwork$12.L$1 = null;
                                documentService$tryLoadFromNetwork$12.L$2 = null;
                                i7x0Var2 = i7x0Var;
                                try {
                                    documentService$tryLoadFromNetwork$12.L$3 = i7x0Var2;
                                    list2 = list;
                                } catch (MapiClientException e) {
                                    e = e;
                                    list2 = list;
                                    z3 = z2;
                                    v5j0Var2 = v5j0Var;
                                    dVar.d(e.getDetails(), v5j0Var2.l);
                                    if (z3) {
                                        i7x0Var2.a(list2);
                                    }
                                    dVar.k(u1mVar, e, "DocumentService.tryLoadFromNetwork", i7x0Var2);
                                    i3y g = g(dVar, u1mVar, null, null, null, e, null, 46);
                                    EmptyList emptyList = EmptyList.a;
                                    s7s0 s7s0Var = zjrVar2.c.a;
                                    booleanValue = Boolean.FALSE.booleanValue();
                                    tjrVar = tjr.d;
                                    if (booleanValue && (stackTraceElement = (StackTraceElement) j73.G(0, new Throwable().getStackTrace())) != null) {
                                        fileName = stackTraceElement.getFileName();
                                        if (fileName == null) {
                                            fileName = "No file info";
                                        }
                                        String methodName = stackTraceElement.getMethodName();
                                        Integer num2 = new Integer(stackTraceElement.getLineNumber());
                                        num = num2.intValue() > 0 ? num2 : null;
                                        if (num != null || (r3 = num.toString()) == null) {
                                            String str = "No line info";
                                        }
                                        tjrVar = new tjr(fileName, methodName, str);
                                    }
                                    zjrVar = zjrVar2;
                                    zjrVar.d(FlexLogLevel.DEBUG, "Failed to fetch document", g, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                                    uzl uzlVar = new uzl(e);
                                    zjrVar.a();
                                    return uzlVar;
                                }
                            } catch (MapiClientException e2) {
                                e = e2;
                                i7x0Var2 = i7x0Var;
                            }
                            try {
                                documentService$tryLoadFromNetwork$12.L$4 = list2;
                                documentService$tryLoadFromNetwork$12.L$5 = v5j0Var;
                                documentService$tryLoadFromNetwork$12.L$6 = dVar;
                                documentService$tryLoadFromNetwork$12.Z$0 = z;
                                z3 = z2;
                                try {
                                    documentService$tryLoadFromNetwork$12.Z$1 = z3;
                                    documentService$tryLoadFromNetwork$12.label = 1;
                                    obj = dVar.i(uu00Var, cVar, z, v5j0Var, documentService$tryLoadFromNetwork$12);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    dVar2 = dVar;
                                    v5j0Var2 = v5j0Var;
                                } catch (MapiClientException e3) {
                                    e = e3;
                                    v5j0Var2 = v5j0Var;
                                    dVar.d(e.getDetails(), v5j0Var2.l);
                                    if (z3) {
                                    }
                                    dVar.k(u1mVar, e, "DocumentService.tryLoadFromNetwork", i7x0Var2);
                                    i3y g2 = g(dVar, u1mVar, null, null, null, e, null, 46);
                                    EmptyList emptyList2 = EmptyList.a;
                                    s7s0 s7s0Var2 = zjrVar2.c.a;
                                    booleanValue = Boolean.FALSE.booleanValue();
                                    tjrVar = tjr.d;
                                    if (booleanValue) {
                                    }
                                    zjrVar = zjrVar2;
                                    zjrVar.d(FlexLogLevel.DEBUG, "Failed to fetch document", g2, emptyList2, tjrVar.a, tjrVar.b, tjrVar.c);
                                    uzl uzlVar2 = new uzl(e);
                                    zjrVar.a();
                                    return uzlVar2;
                                }
                            } catch (MapiClientException e4) {
                                e = e4;
                                z3 = z2;
                                v5j0Var2 = v5j0Var;
                                dVar.d(e.getDetails(), v5j0Var2.l);
                                if (z3) {
                                }
                                dVar.k(u1mVar, e, "DocumentService.tryLoadFromNetwork", i7x0Var2);
                                i3y g22 = g(dVar, u1mVar, null, null, null, e, null, 46);
                                EmptyList emptyList22 = EmptyList.a;
                                s7s0 s7s0Var22 = zjrVar2.c.a;
                                booleanValue = Boolean.FALSE.booleanValue();
                                tjrVar = tjr.d;
                                if (booleanValue) {
                                }
                                zjrVar = zjrVar2;
                                zjrVar.d(FlexLogLevel.DEBUG, "Failed to fetch document", g22, emptyList22, tjrVar.a, tjrVar.b, tjrVar.c);
                                uzl uzlVar22 = new uzl(e);
                                zjrVar.a();
                                return uzlVar22;
                            }
                        } else {
                            if (i != 1) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z5 = documentService$tryLoadFromNetwork$12.Z$1;
                            d dVar3 = (d) documentService$tryLoadFromNetwork$12.L$6;
                            v5j0 v5j0Var4 = (v5j0) documentService$tryLoadFromNetwork$12.L$5;
                            List list4 = (List) documentService$tryLoadFromNetwork$12.L$4;
                            i7x0 i7x0Var4 = (i7x0) documentService$tryLoadFromNetwork$12.L$3;
                            u1mVar2 = (u1m) documentService$tryLoadFromNetwork$12.L$0;
                            try {
                                kotlin.b.b(obj);
                                z3 = z5;
                                list2 = list4;
                                i7x0Var2 = i7x0Var4;
                                u1mVar = u1mVar2;
                                dVar2 = dVar3;
                                v5j0Var2 = v5j0Var4;
                            } catch (MapiClientException e5) {
                                e = e5;
                                z3 = z5;
                                v5j0Var2 = v5j0Var4;
                                list2 = list4;
                                i7x0Var2 = i7x0Var4;
                                u1mVar = u1mVar2;
                                try {
                                    dVar.d(e.getDetails(), v5j0Var2.l);
                                    if (z3) {
                                    }
                                    dVar.k(u1mVar, e, "DocumentService.tryLoadFromNetwork", i7x0Var2);
                                    i3y g222 = g(dVar, u1mVar, null, null, null, e, null, 46);
                                    EmptyList emptyList222 = EmptyList.a;
                                    s7s0 s7s0Var222 = zjrVar2.c.a;
                                    booleanValue = Boolean.FALSE.booleanValue();
                                    tjrVar = tjr.d;
                                    if (booleanValue) {
                                        fileName = stackTraceElement.getFileName();
                                        if (fileName == null) {
                                        }
                                        String methodName2 = stackTraceElement.getMethodName();
                                        Integer num22 = new Integer(stackTraceElement.getLineNumber());
                                        if (num22.intValue() > 0) {
                                        }
                                        if (num != null) {
                                        }
                                        String str2 = "No line info";
                                        tjrVar = new tjr(fileName, methodName2, str2);
                                    }
                                    zjrVar = zjrVar2;
                                    try {
                                        zjrVar.d(FlexLogLevel.DEBUG, "Failed to fetch document", g222, emptyList222, tjrVar.a, tjrVar.b, tjrVar.c);
                                        uzl uzlVar222 = new uzl(e);
                                        zjrVar.a();
                                        return uzlVar222;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        th = th;
                                        zjrVar.a();
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    zjrVar = zjrVar2;
                                }
                            }
                        }
                        wzl wzlVar = (wzl) obj;
                        u1mVar3 = u1mVar;
                        v5j0Var3 = v5j0Var2;
                        i7x0Var3 = i7x0Var2;
                        list3 = list2;
                        z4 = z3;
                        dVar2.e(wzlVar, u1mVar3, i7x0Var3, list3, z4, v5j0Var3);
                        zjrVar2.a();
                        return wzlVar;
                    }
                }
                dVar2.e(wzlVar, u1mVar3, i7x0Var3, list3, z4, v5j0Var3);
                zjrVar2.a();
                return wzlVar;
            } catch (MapiClientException e6) {
                e = e6;
                u1mVar2 = u1mVar3;
                i7x0Var2 = i7x0Var3;
                list2 = list3;
                v5j0Var2 = v5j0Var3;
                z3 = z4;
                u1mVar = u1mVar2;
                dVar.d(e.getDetails(), v5j0Var2.l);
                if (z3) {
                }
                dVar.k(u1mVar, e, "DocumentService.tryLoadFromNetwork", i7x0Var2);
                i3y g2222 = g(dVar, u1mVar, null, null, null, e, null, 46);
                EmptyList emptyList2222 = EmptyList.a;
                s7s0 s7s0Var2222 = zjrVar2.c.a;
                booleanValue = Boolean.FALSE.booleanValue();
                tjrVar = tjr.d;
                if (booleanValue) {
                }
                zjrVar = zjrVar2;
                zjrVar.d(FlexLogLevel.DEBUG, "Failed to fetch document", g2222, emptyList2222, tjrVar.a, tjrVar.b, tjrVar.c);
                uzl uzlVar2222 = new uzl(e);
                zjrVar.a();
                return uzlVar2222;
            }
            if (i != 0) {
            }
            wzl wzlVar2 = (wzl) obj;
            u1mVar3 = u1mVar;
            v5j0Var3 = v5j0Var2;
            i7x0Var3 = i7x0Var2;
            list3 = list2;
            z4 = z3;
        } catch (Throwable th4) {
            th = th4;
            zjrVar = zjrVar2;
        }
        documentService$tryLoadFromNetwork$1 = new DocumentService$tryLoadFromNetwork$1(dVar, continuationImpl);
        DocumentService$tryLoadFromNetwork$1 documentService$tryLoadFromNetwork$122 = documentService$tryLoadFromNetwork$1;
        Object obj2 = documentService$tryLoadFromNetwork$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentService$tryLoadFromNetwork$122.label;
    }

    public static i3y g(d dVar, u1m u1mVar, ywl ywlVar, Map map, Boolean bool, Throwable th, kq90 kq90Var, int i) {
        if ((i & 2) != 0) {
            ywlVar = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            th = null;
        }
        kq90 kq90Var2 = (i & 32) != 0 ? null : kq90Var;
        dVar.getClass();
        return xfz.a(new Pair("queryPath", u1mVar.a), new Pair("queryParams", u1mVar.b), xfz.d(ywlVar != null ? ywlVar.e : null, "currentDocumentContext"), xfz.d(map, "payload"), xfz.d(bool, "retriedAfterError"), xfz.d(th, "error"), xfz.d(kq90Var2, "patchParams"));
    }

    public static Map j(u1m u1mVar, ArrayList arrayList) {
        String str;
        Map map = u1mVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList2.add(((String) entry.getKey()) + Extension.COLON_SPACE + kotlin.collections.a.X((List) entry.getValue(), Extension.FIX_SPACE, null, null, null, 62));
        }
        Pair pair = new Pair("query", kotlin.collections.a.X(arrayList2, "\n", null, null, null, 62));
        Map map2 = u1mVar.c;
        if (map2 != null) {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                arrayList3.add(((String) entry2.getKey()) + Extension.COLON_SPACE + entry2.getValue());
            }
            str = kotlin.collections.a.X(arrayList3, "\n", null, null, null, 62);
        } else {
            str = "";
        }
        return kotlin.collections.b.i(pair, new Pair("body", str), new Pair("tags", kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62)));
    }

    public static uu00 m(u1m u1mVar, kotlinx.serialization.json.c cVar, Map map, boolean z) {
        String str;
        String str2 = u1mVar.a;
        Map map2 = u1mVar.b;
        LinkedHashMap x = g8e.x("Compat-Vector", "+Q+y6l");
        if (z) {
            x.put("Retried-Attempt", "1");
        }
        Map map3 = u1mVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map3 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map3.size()));
            for (Map.Entry entry : map3.entrySet()) {
                linkedHashMap2.put(entry.getKey(), xw91.m(entry.getValue()));
            }
            linkedHashMap.put("request", new kotlinx.serialization.json.c(linkedHashMap2));
        }
        if (!map.isEmpty()) {
            linkedHashMap.put("payload", new kotlinx.serialization.json.c(map));
        }
        if (cVar != null) {
            linkedHashMap.put("context", cVar);
        }
        if (linkedHashMap.isEmpty()) {
            str = "{}";
        } else {
            rbx rbxVar = sbx.d;
            kotlinx.serialization.json.c cVar2 = new kotlinx.serialization.json.c(linkedHashMap);
            rbxVar.getClass();
            str = rbxVar.c(cVar2, kotlinx.serialization.json.c.Companion.serializer());
        }
        return new uu00(str2, x, map2, str);
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.B;
    }

    public final void d(wu00 wu00Var, boolean z) {
        c2r0 c2r0Var = new c2r0(6, 1);
        c2r0Var.a(xfz.d(wu00Var.c, Constants.INTENT_PARAM_RESPONSE_CODE));
        c2r0Var.a(xfz.d(wu00Var.d, "responseMessage"));
        c2r0Var.a(xfz.d(wu00Var.e, "requestId"));
        c2r0Var.a(new Pair(StateEntry.COLUMN_PATH, ((uu00) wu00Var.a).a));
        c2r0Var.a(new Pair("isPreload", Boolean.valueOf(z)));
        Map map = wu00Var.k;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        c2r0Var.b(arrayList.toArray(new Pair[0]));
        ArrayList arrayList2 = c2r0Var.b;
        Pair[] pairArr = (Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]);
        String str = this.B.d;
        if (str != null) {
            xfz.a.put(new yjr(str), xfz.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        }
    }

    public final void e(wzl wzlVar, u1m u1mVar, i7x0 i7x0Var, List list, boolean z, v5j0 v5j0Var) {
        StackTraceElement stackTraceElement;
        String str;
        tjr tjrVar;
        StackTraceElement stackTraceElement2;
        String str2;
        i3y g = g(this, u1mVar, null, null, null, null, null, 62);
        zjr zjrVar = this.B;
        s7s0 s7s0Var = zjrVar.c.a;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = bool.booleanValue();
        tjr tjrVar2 = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        } else {
            tjrVar = tjrVar2;
        }
        FlexLogLevel flexLogLevel = FlexLogLevel.DEBUG;
        String str3 = tjrVar.a;
        String str4 = tjrVar.c;
        String str5 = tjrVar.b;
        EmptyList emptyList = EmptyList.a;
        zjrVar.d(flexLogLevel, "Fetched document", g, emptyList, str3, str5, str4);
        if (wzlVar instanceof uzl) {
            if (z) {
                i7x0Var.a(list);
            }
            if (v5j0Var.l) {
                i7x0Var.b("isPreload");
            }
            d(v5j0Var.a(), v5j0Var.l);
            uzl uzlVar = (uzl) wzlVar;
            k(u1mVar, uzlVar.a, "DocumentService.tryLoadFromNetwork", i7x0Var);
            i3y g2 = g(this, u1mVar, null, null, null, uzlVar.a, null, 46);
            s7s0 s7s0Var2 = zjrVar.c.a;
            if (bool.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName2 = stackTraceElement2.getFileName();
                if (fileName2 == null) {
                    fileName2 = "No file info";
                }
                String methodName2 = stackTraceElement2.getMethodName();
                int lineNumber2 = stackTraceElement2.getLineNumber();
                Integer valueOf2 = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                if (valueOf2 == null || (str2 = valueOf2.toString()) == null) {
                    str2 = "No line info";
                }
                tjrVar2 = new tjr(fileName2, methodName2, str2);
            }
            tjr tjrVar3 = tjrVar2;
            zjrVar.d(flexLogLevel, "Failed to parse fetched document", g2, emptyList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
        } else {
            i7x0Var.b("fromNetwork");
        }
        if ((wzlVar instanceof xzl) && ((xzl) wzlVar).e) {
            i7x0Var.b("screenIsBroken");
            if (v5j0Var.l) {
                i7x0Var.b("isPreload");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff A[Catch: IllegalArgumentException -> 0x00f5, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x00f5, blocks: (B:74:0x00ee, B:76:0x00f2, B:31:0x00fb, B:33:0x00ff), top: B:73:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(u1m u1mVar, ywl ywlVar, Map map, i7x0 i7x0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ContinuationImpl continuationImpl) {
        StackTraceElement stackTraceElement;
        String str;
        tjr tjrVar;
        Object obj;
        Map map2;
        StackTraceElement stackTraceElement2;
        String fileName;
        Integer num;
        ArrayList c = i7x0Var.c();
        ArrayList arrayList = new ArrayList(tcc.n(c, 10));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            ConcurrentHashMap concurrentHashMap = xfz.a;
            arrayList.add(new xjr(str2));
        }
        boolean z6 = true;
        boolean z7 = z5 || c.contains("isPreload");
        CopyOnWriteArraySet copyOnWriteArraySet = i7x0Var.a;
        if (!copyOnWriteArraySet.isEmpty()) {
            copyOnWriteArraySet.clear();
            i7x0Var.d();
        }
        boolean z8 = ywlVar != null;
        boolean z9 = z8 && (z2 || !z);
        boolean z10 = (z8 || z) ? false : true;
        if (z9) {
            i7x0Var.b("reloadRequest");
        } else if (z10) {
            i7x0Var.b("headRequest");
        }
        i3y g = g(this, u1mVar, ywlVar, map, Boolean.valueOf(z), null, null, 48);
        zjr zjrVar = this.B;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar2 = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName2 = stackTraceElement.getFileName();
            if (fileName2 == null) {
                fileName2 = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            Integer num2 = new Integer(stackTraceElement.getLineNumber());
            if (num2.intValue() <= 0) {
                num2 = null;
            }
            if (num2 == null || (str = num2.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName2, methodName, str);
        } else {
            tjrVar = tjrVar2;
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Document fetch started", g, arrayList, tjrVar.a, tjrVar.b, tjrVar.c);
        try {
            if (ywlVar != null) {
                try {
                    q370 q370Var = ywlVar.e;
                    if (q370Var != null) {
                        obj = q370Var.a;
                        map2 = map;
                        uu00 m = m(u1mVar, !(obj instanceof kotlinx.serialization.json.c) ? (kotlinx.serialization.json.c) obj : null, map2, z);
                        v5j0 v5j0Var = new v5j0(m, null);
                        v5j0Var.l = z7;
                        if (!z7 && (ywlVar != null || z)) {
                            z6 = false;
                        }
                        v5j0Var.m = z6;
                        return bvf0.n(new DocumentService$fetchDocumentInternal$2(this, z2, u1mVar, m, i7x0Var, c, z4, z3, v5j0Var, ywlVar, null), continuationImpl);
                    }
                } catch (IllegalArgumentException e) {
                    e = e;
                    map2 = map;
                    IllegalArgumentException illegalArgumentException = e;
                    i3y g2 = g(this, u1mVar, ywlVar, map2, Boolean.valueOf(z), illegalArgumentException, null, 32);
                    s7s0 s7s0Var2 = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                        fileName = stackTraceElement2.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName2 = stackTraceElement2.getMethodName();
                        num = new Integer(stackTraceElement2.getLineNumber());
                        if (num.intValue() <= 0) {
                            num = null;
                        }
                        if (num != null || (r1 = num.toString()) == null) {
                            String str3 = "No line info";
                        }
                        tjrVar2 = new tjr(fileName, methodName2, str3);
                    }
                    tjr tjrVar3 = tjrVar2;
                    zjrVar.d(FlexLogLevel.DEBUG, "Failed to create request", g2, arrayList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
                    if (z4) {
                        i7x0Var.a(c);
                    }
                    return new uzl(illegalArgumentException);
                }
            }
            uu00 m2 = m(u1mVar, !(obj instanceof kotlinx.serialization.json.c) ? (kotlinx.serialization.json.c) obj : null, map2, z);
            v5j0 v5j0Var2 = new v5j0(m2, null);
            v5j0Var2.l = z7;
            if (!z7) {
                z6 = false;
            }
            v5j0Var2.m = z6;
            return bvf0.n(new DocumentService$fetchDocumentInternal$2(this, z2, u1mVar, m2, i7x0Var, c, z4, z3, v5j0Var2, ywlVar, null), continuationImpl);
        } catch (IllegalArgumentException e2) {
            e = e2;
            IllegalArgumentException illegalArgumentException2 = e;
            i3y g22 = g(this, u1mVar, ywlVar, map2, Boolean.valueOf(z), illegalArgumentException2, null, 32);
            s7s0 s7s0Var22 = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue()) {
                fileName = stackTraceElement2.getFileName();
                if (fileName == null) {
                }
                String methodName22 = stackTraceElement2.getMethodName();
                num = new Integer(stackTraceElement2.getLineNumber());
                if (num.intValue() <= 0) {
                }
                if (num != null) {
                }
                String str32 = "No line info";
                tjrVar2 = new tjr(fileName, methodName22, str32);
            }
            tjr tjrVar32 = tjrVar2;
            zjrVar.d(FlexLogLevel.DEBUG, "Failed to create request", g22, arrayList, tjrVar32.a, tjrVar32.b, tjrVar32.c);
            if (z4) {
            }
            return new uzl(illegalArgumentException2);
        }
        obj = null;
        map2 = map;
    }

    public final wzl h(u1m u1mVar, uu00 uu00Var, c cVar, i7x0 i7x0Var) {
        StackTraceElement stackTraceElement;
        String str;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        kc7 load = this.x.load(new p7j0(4, uu00Var.a, uu00Var.c), new n2m(cVar, 1));
        String str2 = "No line info";
        EmptyList emptyList = EmptyList.a;
        zjr zjrVar = this.B;
        tjr tjrVar = tjr.d;
        if (load == null) {
            i3y g = g(this, u1mVar, null, null, null, null, null, 62);
            s7s0 s7s0Var = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement2.getFileName();
                str = fileName != null ? fileName : "No file info";
                String methodName = stackTraceElement2.getMethodName();
                int lineNumber = stackTraceElement2.getLineNumber();
                Integer valueOf = Integer.valueOf(lineNumber);
                if (lineNumber <= 0) {
                    valueOf = null;
                }
                if (valueOf != null && (num2 = valueOf.toString()) != null) {
                    str2 = num2;
                }
                tjrVar = new tjr(str, methodName, str2);
            }
            zjrVar.d(FlexLogLevel.DEBUG, "Failed to load document from network cache", g, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
            return null;
        }
        f0m f0mVar = new f0m(load.b.a);
        boolean z = load.c;
        kg90 kg90Var = (kg90) load.a;
        DocumentFetchOrigin documentFetchOrigin = DocumentFetchOrigin.Cache;
        if (kg90Var instanceof jg90) {
            m631 m631Var = new m631(g8e.z("sourceType", documentFetchOrigin.getValue()));
            jg90 jg90Var = (jg90) kg90Var;
            h2m h2mVar = (h2m) jg90Var.a;
            cnr0 cnr0Var = h2mVar.a.c;
            cnr0 cnr0Var2 = cnr0.b;
            kg90Var = new jg90(new h2m(ywl.a(h2mVar.a, null, null, cnr0Var.a(vez0.f(Collections.singletonList(m631Var))), null, 59), h2mVar.b), jg90Var.b, jg90Var.c);
        } else if (!(kg90Var instanceof ig90)) {
            w511.b();
            return null;
        }
        wzl S = kp50.S(kg90Var, f0mVar, z, false);
        ArrayList<ng90> arrayList = load.d;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (ng90 ng90Var : arrayList) {
            arrayList2.add(new og90(((h2m) ((jg90) ng90Var.c()).a).a, ng90Var.b()));
        }
        boolean isEmpty = arrayList2.isEmpty();
        boolean z2 = S instanceof xzl;
        if (z2 && isEmpty) {
            return S;
        }
        if (z2 && !isEmpty) {
            return new vzl((xzl) S, arrayList2);
        }
        if (S instanceof uzl) {
            uzl uzlVar = (uzl) S;
            k(u1mVar, uzlVar.a, "DocumentService.loadFromCache", i7x0Var);
            String concat = "Loaded cached result is ".concat(uzl.class.getSimpleName());
            i3y g2 = g(this, u1mVar, null, null, null, uzlVar.a, null, 46);
            s7s0 s7s0Var2 = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName2 = stackTraceElement.getFileName();
                str = fileName2 != null ? fileName2 : "No file info";
                String methodName2 = stackTraceElement.getMethodName();
                int lineNumber2 = stackTraceElement.getLineNumber();
                Integer valueOf2 = Integer.valueOf(lineNumber2);
                if (lineNumber2 <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null && (num = valueOf2.toString()) != null) {
                    str2 = num;
                }
                tjrVar = new tjr(str, methodName2, str2);
            }
            zjrVar.d(FlexLogLevel.DEBUG, concat, g2, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(uu00 uu00Var, yu00 yu00Var, boolean z, v5j0 v5j0Var, ContinuationImpl continuationImpl) {
        DocumentService$loadFromNetwork$1 documentService$loadFromNetwork$1;
        int i;
        v5j0 v5j0Var2;
        if (continuationImpl instanceof DocumentService$loadFromNetwork$1) {
            documentService$loadFromNetwork$1 = (DocumentService$loadFromNetwork$1) continuationImpl;
            int i2 = documentService$loadFromNetwork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                documentService$loadFromNetwork$1.label = i2 - Integer.MIN_VALUE;
                DocumentService$loadFromNetwork$1 documentService$loadFromNetwork$12 = documentService$loadFromNetwork$1;
                Object obj = documentService$loadFromNetwork$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentService$loadFromNetwork$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pu00 pu00Var = new pu00(new ie7(this.x, new p7j0(4, uu00Var.a, uu00Var.c), z, new qu00(uu00Var, (uyg) this.A.invoke(), v5j0Var, yu00Var), null));
                    wwq wwqVar = this.z;
                    j1m j1mVar = wwqVar != null ? new j1m(uu00Var, wwqVar) : null;
                    documentService$loadFromNetwork$12.L$0 = null;
                    documentService$loadFromNetwork$12.L$1 = null;
                    documentService$loadFromNetwork$12.L$2 = null;
                    documentService$loadFromNetwork$12.L$3 = v5j0Var;
                    documentService$loadFromNetwork$12.L$4 = null;
                    documentService$loadFromNetwork$12.Z$0 = z;
                    documentService$loadFromNetwork$12.label = 1;
                    obj = this.a.executeRequest(uu00Var, pu00Var, j1mVar, v5j0Var, documentService$loadFromNetwork$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    v5j0Var2 = v5j0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v5j0Var2 = (v5j0) documentService$loadFromNetwork$12.L$3;
                    kotlin.b.b(obj);
                }
                xu00 xu00Var = (xu00) obj;
                d(xu00Var.b, v5j0Var2.l);
                return kp50.W((wzl) xu00Var.a, true);
            }
        }
        documentService$loadFromNetwork$1 = new DocumentService$loadFromNetwork$1(this, continuationImpl);
        DocumentService$loadFromNetwork$1 documentService$loadFromNetwork$122 = documentService$loadFromNetwork$1;
        Object obj2 = documentService$loadFromNetwork$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentService$loadFromNetwork$122.label;
        if (i != 0) {
        }
        xu00 xu00Var2 = (xu00) obj2;
        d(xu00Var2.b, v5j0Var2.l);
        return kp50.W((wzl) xu00Var2.a, true);
    }

    public final void k(u1m u1mVar, Throwable th, String str, i7x0 i7x0Var) {
        StackTraceElement stackTraceElement;
        String str2;
        if (!(th instanceof MapiClientException)) {
            l(u1mVar, null, th, str, i7x0Var);
            return;
        }
        MapiClientException mapiClientException = (MapiClientException) th;
        String str3 = mapiClientException.getDetails().e;
        int i = p2m.a[mapiClientException.getIssueType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                l(u1mVar, str3, th, str, i7x0Var);
                return;
            } else {
                w511.b();
                return;
            }
        }
        r2m r2mVar = this.w;
        if (r2mVar != null) {
            r2mVar.handleDocumentRequestError(u1mVar, str3, th, mapiClientException.getDetails().c);
        }
        String type = ErrorTypes.DOCUMENT_REQUEST_ERROR.getType();
        c2r0 c2r0Var = new c2r0(4, 1);
        c2r0Var.a(new Pair("locator", str));
        c2r0Var.a(new Pair("cause", th));
        c2r0Var.a(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, oyr.p("Document request error: failed to fetch document (", th.getMessage(), Extension.C_BRAKE)));
        c2r0Var.b(dai0.J(j(u1mVar, i7x0Var.c())));
        ArrayList arrayList = c2r0Var.b;
        i3y a = xfz.a((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
        zjr zjrVar = this.B;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str2);
        }
        i3y a2 = xfz.a(new Pair("errorType", type));
        zjrVar.d(FlexLogLevel.FAULT, "Failed to fetch document", xfz.c(a, a2), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    public final void l(u1m u1mVar, String str, Throwable th, String str2, i7x0 i7x0Var) {
        StackTraceElement stackTraceElement;
        String str3;
        r2m r2mVar = this.w;
        if (r2mVar != null) {
            r2mVar.handleDocumentParseError(u1mVar, str, th);
        }
        String type = ErrorTypes.DOCUMENT_PARSE_ERROR.getType();
        c2r0 c2r0Var = new c2r0(4, 1);
        c2r0Var.a(new Pair("locator", str2));
        c2r0Var.a(new Pair("cause", th));
        c2r0Var.a(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, unr0.p("Document parse error: failed to parse document (", th.getClass().getSimpleName(), Extension.COLON_SPACE, th.getMessage(), Extension.C_BRAKE)));
        c2r0Var.b(dai0.J(j(u1mVar, i7x0Var.c())));
        ArrayList arrayList = c2r0Var.b;
        i3y a = xfz.a((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
        zjr zjrVar = this.B;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str3 = valueOf.toString()) == null) {
                str3 = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str3);
        }
        i3y a2 = xfz.a(new Pair("errorType", type));
        zjrVar.d(FlexLogLevel.FAULT, "Failed to parse document", xfz.c(a, a2), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    public d(lu00 lu00Var, l2m l2mVar, jse jseVar, r2m r2mVar, jp50 jp50Var, fxl fxlVar, wwq wwqVar, uyg uygVar, int i) {
        this(lu00Var, l2mVar, jseVar, r2mVar, jp50Var, fxlVar, wwqVar, new sbc(15, uygVar));
    }
}
