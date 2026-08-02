package ru.yandex.taxi.order.analytics.marknotify;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.oo70;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final wnt a;
    public final cne0 b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();

    public b(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = dne0Var.a("orders");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0054, B:12:0x0071, B:14:0x0077, B:17:0x0084, B:22:0x008a), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v4, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, oo70 oo70Var, ContinuationImpl continuationImpl) {
        OrdersPreferences$addClickedOrder$1 ordersPreferences$addClickedOrder$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        cne0 cne0Var = this.b;
        try {
            if (continuationImpl instanceof OrdersPreferences$addClickedOrder$1) {
                ordersPreferences$addClickedOrder$1 = (OrdersPreferences$addClickedOrder$1) continuationImpl;
                int i2 = ordersPreferences$addClickedOrder$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ordersPreferences$addClickedOrder$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = ordersPreferences$addClickedOrder$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ordersPreferences$addClickedOrder$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ordersPreferences$addClickedOrder$1.L$0 = str;
                        ordersPreferences$addClickedOrder$1.L$1 = oo70Var;
                        aVar = this.c;
                        ordersPreferences$addClickedOrder$1.L$2 = aVar;
                        ordersPreferences$addClickedOrder$1.label = 1;
                        if (aVar.a(ordersPreferences$addClickedOrder$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r8 = (g050) ordersPreferences$addClickedOrder$1.L$2;
                        oo70Var = (oo70) ordersPreferences$addClickedOrder$1.L$1;
                        String str2 = (String) ordersPreferences$addClickedOrder$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r8;
                        str = str2;
                    }
                    List m = cne0Var.m("ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str, ";");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : m) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    cne0Var.s("ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str, ";", kotlin.collections.a.o0(arrayList, ((xnt) this.a).e(oo70Var, oo70.Companion.serializer())));
                    aVar.d(null);
                    return zy11.a;
                }
            }
            List m2 = cne0Var.m("ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str, ";");
            ArrayList arrayList2 = new ArrayList();
            while (r2.hasNext()) {
            }
            cne0Var.s("ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str, ";", kotlin.collections.a.o0(arrayList2, ((xnt) this.a).e(oo70Var, oo70.Companion.serializer())));
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        ordersPreferences$addClickedOrder$1 = new OrdersPreferences$addClickedOrder$1(this, continuationImpl);
        Object obj3 = ordersPreferences$addClickedOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersPreferences$addClickedOrder$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:11:0x004c, B:12:0x006b, B:14:0x0071, B:17:0x0089, B:22:0x008f), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        OrdersPreferences$getClickedOrders$1 ordersPreferences$getClickedOrders$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Iterator it;
        try {
            if (continuationImpl instanceof OrdersPreferences$getClickedOrders$1) {
                ordersPreferences$getClickedOrders$1 = (OrdersPreferences$getClickedOrders$1) continuationImpl;
                int i2 = ordersPreferences$getClickedOrders$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ordersPreferences$getClickedOrders$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = ordersPreferences$getClickedOrders$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ordersPreferences$getClickedOrders$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ordersPreferences$getClickedOrders$1.L$0 = str;
                        aVar = this.c;
                        ordersPreferences$getClickedOrders$1.L$1 = aVar;
                        ordersPreferences$getClickedOrders$1.label = 1;
                        if (aVar.a(ordersPreferences$getClickedOrders$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r7 = (g050) ordersPreferences$getClickedOrders$1.L$1;
                        String str2 = (String) ordersPreferences$getClickedOrders$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r7;
                        str = str2;
                    }
                    List m = this.b.m("ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str, ";");
                    ArrayList arrayList = new ArrayList();
                    it = m.iterator();
                    while (it.hasNext()) {
                        oo70 oo70Var = (oo70) ((xnt) this.a).c((String) it.next(), oo70.Companion.serializer());
                        if (oo70Var != null) {
                            arrayList.add(oo70Var);
                        }
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList);
                    aVar.d(null);
                    return N0;
                }
            }
            List m2 = this.b.m("ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str, ";");
            ArrayList arrayList2 = new ArrayList();
            it = m2.iterator();
            while (it.hasNext()) {
            }
            Set N02 = kotlin.collections.a.N0(arrayList2);
            aVar.d(null);
            return N02;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        ordersPreferences$getClickedOrders$1 = new OrdersPreferences$getClickedOrders$1(this, continuationImpl);
        Object obj2 = ordersPreferences$getClickedOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersPreferences$getClickedOrders$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[Catch: all -> 0x00ad, TryCatch #0 {all -> 0x00ad, blocks: (B:11:0x0054, B:12:0x0083, B:14:0x0089, B:19:0x00a9, B:25:0x00af), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v4, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Collection collection, ContinuationImpl continuationImpl) {
        OrdersPreferences$removeClickedOrder$1 ordersPreferences$removeClickedOrder$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        cne0 cne0Var = this.b;
        try {
            if (continuationImpl instanceof OrdersPreferences$removeClickedOrder$1) {
                ordersPreferences$removeClickedOrder$1 = (OrdersPreferences$removeClickedOrder$1) continuationImpl;
                int i2 = ordersPreferences$removeClickedOrder$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ordersPreferences$removeClickedOrder$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = ordersPreferences$removeClickedOrder$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ordersPreferences$removeClickedOrder$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ordersPreferences$removeClickedOrder$1.L$0 = str;
                        ordersPreferences$removeClickedOrder$1.L$1 = collection;
                        aVar = this.c;
                        ordersPreferences$removeClickedOrder$1.L$2 = aVar;
                        ordersPreferences$removeClickedOrder$1.label = 1;
                        if (aVar.a(ordersPreferences$removeClickedOrder$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r8 = (g050) ordersPreferences$removeClickedOrder$1.L$2;
                        collection = (Collection) ordersPreferences$removeClickedOrder$1.L$1;
                        String str2 = (String) ordersPreferences$removeClickedOrder$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r8;
                        str = str2;
                    }
                    List<String> m = cne0Var.m("ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str, ";");
                    Set N0 = kotlin.collections.a.N0(collection);
                    String str3 = "ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str;
                    ArrayList arrayList = new ArrayList();
                    for (String str4 : m) {
                        if (N0.contains((oo70) ((xnt) this.a).c(str4, oo70.Companion.serializer()))) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            arrayList.add(str4);
                        }
                    }
                    cne0Var.s(str3, ";", arrayList);
                    aVar.d(null);
                    return zy11.a;
                }
            }
            List<String> m2 = cne0Var.m("ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str, ";");
            Set N02 = kotlin.collections.a.N0(collection);
            String str32 = "ru.yandex.taxi.shortcuts.preferences.OrdersPreferences." + str;
            ArrayList arrayList2 = new ArrayList();
            while (r2.hasNext()) {
            }
            cne0Var.s(str32, ";", arrayList2);
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        ordersPreferences$removeClickedOrder$1 = new OrdersPreferences$removeClickedOrder$1(this, continuationImpl);
        Object obj2 = ordersPreferences$removeClickedOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersPreferences$removeClickedOrder$1.label;
        if (i != 0) {
        }
    }
}
