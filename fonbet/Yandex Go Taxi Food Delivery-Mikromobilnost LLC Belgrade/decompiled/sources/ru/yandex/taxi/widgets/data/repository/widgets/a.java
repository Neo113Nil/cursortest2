package ru.yandex.taxi.widgets.data.repository.widgets;

import defpackage.c551;
import defpackage.g551;
import defpackage.gw00;
import defpackage.jst;
import defpackage.koh;
import defpackage.ny61;
import defpackage.p551;
import defpackage.xby;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public final ru.yandex.taxi.widgets.data.datasources.api.a a;
    public final g551 b;

    public a(ru.yandex.taxi.widgets.data.datasources.api.a aVar, g551 g551Var) {
        this.a = aVar;
        this.b = g551Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:11:0x0061->B:13:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(koh kohVar, ContinuationImpl continuationImpl) {
        WidgetsRepositoryImpl$deferTracking$1 widgetsRepositoryImpl$deferTracking$1;
        int i;
        if (continuationImpl instanceof WidgetsRepositoryImpl$deferTracking$1) {
            widgetsRepositoryImpl$deferTracking$1 = (WidgetsRepositoryImpl$deferTracking$1) continuationImpl;
            int i2 = widgetsRepositoryImpl$deferTracking$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetsRepositoryImpl$deferTracking$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetsRepositoryImpl$deferTracking$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetsRepositoryImpl$deferTracking$1.label;
                if (i != 0) {
                    b.b(obj);
                    widgetsRepositoryImpl$deferTracking$1.L$0 = null;
                    widgetsRepositoryImpl$deferTracking$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.d(this.a.a.b(kohVar), widgetsRepositoryImpl$deferTracking$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((p551) entry.getValue()).a);
                }
                return linkedHashMap;
            }
        }
        widgetsRepositoryImpl$deferTracking$1 = new WidgetsRepositoryImpl$deferTracking$1(this, continuationImpl);
        Object obj2 = widgetsRepositoryImpl$deferTracking$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsRepositoryImpl$deferTracking$1.label;
        if (i != 0) {
        }
        Map map2 = (Map) obj2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map2.size()));
        while (r6.hasNext()) {
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: Exception -> 0x0032, LOOP:0: B:13:0x006a->B:15:0x0070, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0051, B:13:0x006a, B:15:0x0070, B:23:0x0040), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(c551 c551Var, Map map, boolean z, ContinuationImpl continuationImpl) {
        WidgetsRepositoryImpl$requestWidgets$1 widgetsRepositoryImpl$requestWidgets$1;
        int i;
        try {
            if (continuationImpl instanceof WidgetsRepositoryImpl$requestWidgets$1) {
                widgetsRepositoryImpl$requestWidgets$1 = (WidgetsRepositoryImpl$requestWidgets$1) continuationImpl;
                int i2 = widgetsRepositoryImpl$requestWidgets$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    widgetsRepositoryImpl$requestWidgets$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = widgetsRepositoryImpl$requestWidgets$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = widgetsRepositoryImpl$requestWidgets$1.label;
                    if (i != 0) {
                        b.b(obj);
                        ru.yandex.taxi.widgets.data.datasources.api.a aVar = this.a;
                        widgetsRepositoryImpl$requestWidgets$1.L$0 = c551Var;
                        widgetsRepositoryImpl$requestWidgets$1.L$1 = map;
                        widgetsRepositoryImpl$requestWidgets$1.Z$0 = z;
                        widgetsRepositoryImpl$requestWidgets$1.label = 1;
                        obj = aVar.a(c551Var, z, widgetsRepositoryImpl$requestWidgets$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = widgetsRepositoryImpl$requestWidgets$1.Z$0;
                        map = (Map) widgetsRepositoryImpl$requestWidgets$1.L$1;
                        c551Var = (c551) widgetsRepositoryImpl$requestWidgets$1.L$0;
                        b.b(obj);
                    }
                    Map map2 = (Map) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map2.size()));
                    for (Object obj2 : map2.entrySet()) {
                        linkedHashMap.put(((Map.Entry) obj2).getKey(), ((p551) ((Map.Entry) obj2).getValue()).a);
                    }
                    return linkedHashMap;
                }
            }
            if (i != 0) {
            }
            Map map22 = (Map) obj;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map22.size()));
            while (r10.hasNext()) {
            }
            return linkedHashMap2;
        } catch (Exception e) {
            xby.l(jst.e, "SUPERAPP_TEAM:AGGREGATE_ORDERS:" + z, null, e, "Failed to load aggregation orders from API", 2);
            return (Serializable) this.b.b(c551Var, map, z);
        }
        widgetsRepositoryImpl$requestWidgets$1 = new WidgetsRepositoryImpl$requestWidgets$1(this, continuationImpl);
        Object obj3 = widgetsRepositoryImpl$requestWidgets$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsRepositoryImpl$requestWidgets$1.label;
    }
}
