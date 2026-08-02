package ru.yandex.taxi.widgets.domain;

import com.yandex.go.dto.response.OrderCardDto;
import defpackage.cb80;
import defpackage.jl40;
import defpackage.kv6;
import defpackage.lia1;
import defpackage.m521;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.txw0;
import defpackage.vez0;
import defpackage.w201;
import defpackage.w511;
import defpackage.x251;
import defpackage.yaf0;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class d {
    public final c a;
    public final a b;

    public d(c cVar, a aVar) {
        this.a = cVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d9 -> B:10:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cb80 cb80Var, List list, yaf0 yaf0Var, ContinuationImpl continuationImpl) {
        WidgetModelMapperImpl$mapOrderWidgetModel$1 widgetModelMapperImpl$mapOrderWidgetModel$1;
        int i;
        Iterator it;
        cb80 cb80Var2;
        Collection collection;
        if (continuationImpl instanceof WidgetModelMapperImpl$mapOrderWidgetModel$1) {
            widgetModelMapperImpl$mapOrderWidgetModel$1 = (WidgetModelMapperImpl$mapOrderWidgetModel$1) continuationImpl;
            int i2 = widgetModelMapperImpl$mapOrderWidgetModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetModelMapperImpl$mapOrderWidgetModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetModelMapperImpl$mapOrderWidgetModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetModelMapperImpl$mapOrderWidgetModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (jl40.l(lia1.e((w201) obj2), cb80Var.getA().getC())) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    cb80Var2 = cb80Var;
                    collection = arrayList2;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) widgetModelMapperImpl$mapOrderWidgetModel$1.L$9;
                    Iterator it2 = (Iterator) widgetModelMapperImpl$mapOrderWidgetModel$1.L$6;
                    Collection collection2 = (Collection) widgetModelMapperImpl$mapOrderWidgetModel$1.L$5;
                    yaf0 yaf0Var2 = (yaf0) widgetModelMapperImpl$mapOrderWidgetModel$1.L$2;
                    cb80 cb80Var3 = (cb80) widgetModelMapperImpl$mapOrderWidgetModel$1.L$0;
                    kotlin.b.b(obj);
                    WidgetModelMapperImpl$mapOrderWidgetModel$1 widgetModelMapperImpl$mapOrderWidgetModel$12 = widgetModelMapperImpl$mapOrderWidgetModel$1;
                    Iterator it3 = it2;
                    cb80Var2 = cb80Var3;
                    WidgetModelMapperImpl$mapOrderWidgetModel$1 widgetModelMapperImpl$mapOrderWidgetModel$13 = widgetModelMapperImpl$mapOrderWidgetModel$12;
                    collection.add((w201) obj);
                    collection = collection2;
                    it = it3;
                    yaf0Var = yaf0Var2;
                    widgetModelMapperImpl$mapOrderWidgetModel$1 = widgetModelMapperImpl$mapOrderWidgetModel$13;
                    if (it.hasNext()) {
                        w201 w201Var = (w201) it.next();
                        String D = vez0.D(yaf0Var);
                        OrderCardDto d = cb80Var2.getA().getD();
                        txw0 a = d != null ? d.getA() : null;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$0 = cb80Var2;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$1 = null;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$2 = yaf0Var;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$3 = null;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$4 = null;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$5 = collection;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$6 = it;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$7 = null;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$8 = null;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.L$9 = collection;
                        widgetModelMapperImpl$mapOrderWidgetModel$1.label = 1;
                        Object a2 = this.a.a(w201Var, D, a, widgetModelMapperImpl$mapOrderWidgetModel$1);
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        widgetModelMapperImpl$mapOrderWidgetModel$13 = widgetModelMapperImpl$mapOrderWidgetModel$1;
                        it3 = it;
                        obj = a2;
                        yaf0Var2 = yaf0Var;
                        collection2 = collection;
                        collection.add((w201) obj);
                        collection = collection2;
                        it = it3;
                        yaf0Var = yaf0Var2;
                        widgetModelMapperImpl$mapOrderWidgetModel$1 = widgetModelMapperImpl$mapOrderWidgetModel$13;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        widgetModelMapperImpl$mapOrderWidgetModel$1 = new WidgetModelMapperImpl$mapOrderWidgetModel$1(this, continuationImpl);
        Object obj3 = widgetModelMapperImpl$mapOrderWidgetModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetModelMapperImpl$mapOrderWidgetModel$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ru.yandex.taxi.widgets.domain.d] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0097 -> B:13:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ec -> B:11:0x00f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(yaf0 yaf0Var, List list, List list2, ContinuationImpl continuationImpl) {
        WidgetModelMapperImpl$mapWidgetModels$1 widgetModelMapperImpl$mapWidgetModels$1;
        int i;
        ArrayList arrayList;
        yaf0 yaf0Var2;
        Iterator it;
        yaf0 yaf0Var3;
        ?? r10;
        List list3;
        List list4;
        if (continuationImpl instanceof WidgetModelMapperImpl$mapWidgetModels$1) {
            widgetModelMapperImpl$mapWidgetModels$1 = (WidgetModelMapperImpl$mapWidgetModels$1) continuationImpl;
            int i2 = widgetModelMapperImpl$mapWidgetModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetModelMapperImpl$mapWidgetModels$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetModelMapperImpl$mapWidgetModels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetModelMapperImpl$mapWidgetModels$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    yaf0Var2 = yaf0Var;
                    it = it2;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    it = (Iterator) widgetModelMapperImpl$mapWidgetModels$1.L$6;
                    r10 = (Collection) widgetModelMapperImpl$mapWidgetModels$1.L$5;
                    yaf0Var3 = (yaf0) widgetModelMapperImpl$mapWidgetModels$1.L$2;
                    list3 = (List) widgetModelMapperImpl$mapWidgetModels$1.L$1;
                    kotlin.b.b(obj);
                    list4 = (List) obj;
                    List list5 = list4;
                    arrayList = r10;
                    yaf0Var2 = yaf0Var3;
                    list2 = list3;
                    List list6 = list5;
                    ycc.r(list6, arrayList);
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) widgetModelMapperImpl$mapWidgetModels$1.L$6;
                    Collection collection = (Collection) widgetModelMapperImpl$mapWidgetModels$1.L$5;
                    yaf0Var3 = (yaf0) widgetModelMapperImpl$mapWidgetModels$1.L$2;
                    list3 = (List) widgetModelMapperImpl$mapWidgetModels$1.L$1;
                    kotlin.b.b(obj);
                    r10 = collection;
                    list4 = (List) obj;
                    List list52 = list4;
                    arrayList = r10;
                    yaf0Var2 = yaf0Var3;
                    list2 = list3;
                    List list62 = list52;
                    ycc.r(list62, arrayList);
                    if (!it.hasNext()) {
                        x251 x251Var = (x251) it.next();
                        if (!(x251Var instanceof m521)) {
                            if (x251Var instanceof cb80) {
                                widgetModelMapperImpl$mapWidgetModels$1.L$0 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.L$1 = list2;
                                widgetModelMapperImpl$mapWidgetModels$1.L$2 = yaf0Var2;
                                widgetModelMapperImpl$mapWidgetModels$1.L$3 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.L$4 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.L$5 = arrayList;
                                widgetModelMapperImpl$mapWidgetModels$1.L$6 = it;
                                widgetModelMapperImpl$mapWidgetModels$1.L$7 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.L$8 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.label = 1;
                                Object a = a((cb80) x251Var, list2, yaf0Var2, widgetModelMapperImpl$mapWidgetModels$1);
                                if (a != coroutineSingletons) {
                                    List list7 = list2;
                                    yaf0Var3 = yaf0Var2;
                                    r10 = arrayList;
                                    list3 = list7;
                                    list4 = (List) a;
                                    List list522 = list4;
                                    arrayList = r10;
                                    yaf0Var2 = yaf0Var3;
                                    list2 = list3;
                                    List list622 = list522;
                                    ycc.r(list622, arrayList);
                                    if (!it.hasNext()) {
                                    }
                                }
                            } else {
                                if (!(x251Var instanceof kv6)) {
                                    w511.b();
                                    return null;
                                }
                                widgetModelMapperImpl$mapWidgetModels$1.L$0 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.L$1 = list2;
                                widgetModelMapperImpl$mapWidgetModels$1.L$2 = yaf0Var2;
                                widgetModelMapperImpl$mapWidgetModels$1.L$3 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.L$4 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.L$5 = arrayList;
                                widgetModelMapperImpl$mapWidgetModels$1.L$6 = it;
                                widgetModelMapperImpl$mapWidgetModels$1.L$7 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.L$8 = null;
                                widgetModelMapperImpl$mapWidgetModels$1.label = 2;
                                Object b = this.b.b(list2, (kv6) x251Var, yaf0Var2, widgetModelMapperImpl$mapWidgetModels$1);
                                if (b != coroutineSingletons) {
                                    List list8 = list2;
                                    yaf0Var3 = yaf0Var2;
                                    r10 = arrayList;
                                    obj = b;
                                    list3 = list8;
                                    list4 = (List) obj;
                                    List list5222 = list4;
                                    arrayList = r10;
                                    yaf0Var2 = yaf0Var3;
                                    list2 = list3;
                                    List list6222 = list5222;
                                    ycc.r(list6222, arrayList);
                                    if (!it.hasNext()) {
                                        return arrayList;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        list6222 = EmptyList.a;
                        ycc.r(list6222, arrayList);
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        widgetModelMapperImpl$mapWidgetModels$1 = new WidgetModelMapperImpl$mapWidgetModels$1(this, continuationImpl);
        Object obj2 = widgetModelMapperImpl$mapWidgetModels$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetModelMapperImpl$mapWidgetModels$1.label;
        if (i != 0) {
        }
    }
}
