package ru.yandex.taxi.widgets.data.repository.widget_models;

import defpackage.bvf0;
import defpackage.lv6;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pu6;
import defpackage.pz40;
import defpackage.yaf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.widgets.domain.d;

/* loaded from: classes10.dex */
public final class c {
    public final lv6 a;
    public final d b;
    public final r0 c = bvf0.c(kotlin.collections.b.f());

    public c(lv6 lv6Var, d dVar) {
        this.a = lv6Var;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0079 -> B:10:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yaf0 yaf0Var, List list, List list2, ContinuationImpl continuationImpl) {
        WidgetModelsRepositoryImpl$updateWidgets$1 widgetModelsRepositoryImpl$updateWidgets$1;
        int i;
        List list3;
        n4u0 n4u0Var;
        WidgetModelsRepositoryImpl$updateWidgets$1 widgetModelsRepositoryImpl$updateWidgets$12;
        yaf0 yaf0Var2;
        List list4;
        Object b;
        Object value;
        Map map;
        ArrayList arrayList;
        c cVar = this;
        if (continuationImpl instanceof WidgetModelsRepositoryImpl$updateWidgets$1) {
            widgetModelsRepositoryImpl$updateWidgets$1 = (WidgetModelsRepositoryImpl$updateWidgets$1) continuationImpl;
            int i2 = widgetModelsRepositoryImpl$updateWidgets$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetModelsRepositoryImpl$updateWidgets$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetModelsRepositoryImpl$updateWidgets$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetModelsRepositoryImpl$updateWidgets$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    list3 = list2;
                    n4u0Var = cVar.c;
                    widgetModelsRepositoryImpl$updateWidgets$12 = widgetModelsRepositoryImpl$updateWidgets$1;
                    yaf0Var2 = yaf0Var;
                    list4 = list;
                    Object value2 = n4u0Var.getValue();
                    Map map2 = (Map) value2;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$0 = yaf0Var2;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$1 = list4;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$2 = list3;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$3 = n4u0Var;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$4 = value2;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$5 = map2;
                    widgetModelsRepositoryImpl$updateWidgets$12.label = i3;
                    b = cVar.b.b(yaf0Var2, list4, list3, widgetModelsRepositoryImpl$updateWidgets$12);
                    if (b != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map3 = (Map) widgetModelsRepositoryImpl$updateWidgets$1.L$5;
                    Object obj2 = widgetModelsRepositoryImpl$updateWidgets$1.L$4;
                    n4u0 n4u0Var2 = (pz40) widgetModelsRepositoryImpl$updateWidgets$1.L$3;
                    List list5 = (List) widgetModelsRepositoryImpl$updateWidgets$1.L$2;
                    List list6 = (List) widgetModelsRepositoryImpl$updateWidgets$1.L$1;
                    yaf0 yaf0Var3 = (yaf0) widgetModelsRepositoryImpl$updateWidgets$1.L$0;
                    kotlin.b.b(obj);
                    WidgetModelsRepositoryImpl$updateWidgets$1 widgetModelsRepositoryImpl$updateWidgets$13 = widgetModelsRepositoryImpl$updateWidgets$1;
                    list4 = list6;
                    n4u0 n4u0Var3 = n4u0Var2;
                    List list7 = (List) obj;
                    r0 r0Var = cVar.a.a;
                    do {
                        value = r0Var.getValue();
                        map = (Map) value;
                        arrayList = new ArrayList();
                        for (Object obj3 : list7) {
                            if (obj3 instanceof pu6) {
                                arrayList.add(obj3);
                            }
                        }
                    } while (!r0Var.k(value, kotlin.collections.b.o(map, new Pair(yaf0Var3, arrayList))));
                    Map o = kotlin.collections.b.o(map3, new Pair(yaf0Var3, list7));
                    r0 r0Var2 = (r0) n4u0Var3;
                    if (!r0Var2.k(obj2, o)) {
                        return zy11.a;
                    }
                    i3 = 1;
                    cVar = this;
                    widgetModelsRepositoryImpl$updateWidgets$12 = widgetModelsRepositoryImpl$updateWidgets$13;
                    list3 = list5;
                    n4u0Var = r0Var2;
                    yaf0Var2 = yaf0Var3;
                    Object value22 = n4u0Var.getValue();
                    Map map22 = (Map) value22;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$0 = yaf0Var2;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$1 = list4;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$2 = list3;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$3 = n4u0Var;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$4 = value22;
                    widgetModelsRepositoryImpl$updateWidgets$12.L$5 = map22;
                    widgetModelsRepositoryImpl$updateWidgets$12.label = i3;
                    b = cVar.b.b(yaf0Var2, list4, list3, widgetModelsRepositoryImpl$updateWidgets$12);
                    if (b != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    yaf0Var3 = yaf0Var2;
                    obj = b;
                    list5 = list3;
                    map3 = map22;
                    n4u0Var3 = n4u0Var;
                    widgetModelsRepositoryImpl$updateWidgets$13 = widgetModelsRepositoryImpl$updateWidgets$12;
                    obj2 = value22;
                    List list72 = (List) obj;
                    r0 r0Var3 = cVar.a.a;
                    do {
                        value = r0Var3.getValue();
                        map = (Map) value;
                        arrayList = new ArrayList();
                        while (r14.hasNext()) {
                        }
                    } while (!r0Var3.k(value, kotlin.collections.b.o(map, new Pair(yaf0Var3, arrayList))));
                    Map o2 = kotlin.collections.b.o(map3, new Pair(yaf0Var3, list72));
                    r0 r0Var22 = (r0) n4u0Var3;
                    if (!r0Var22.k(obj2, o2)) {
                    }
                }
            }
        }
        widgetModelsRepositoryImpl$updateWidgets$1 = new WidgetModelsRepositoryImpl$updateWidgets$1(cVar, continuationImpl);
        Object obj4 = widgetModelsRepositoryImpl$updateWidgets$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetModelsRepositoryImpl$updateWidgets$1.label;
        int i32 = 1;
        if (i != 0) {
        }
    }
}
