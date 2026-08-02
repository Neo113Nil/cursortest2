package ru.yandex.taxi.widgets.data.repository.widget_models;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yaf0 b;

    public a(vpr vprVar, yaf0 yaf0Var) {
        this.a = vprVar;
        this.b = yaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WidgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1 widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WidgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1) {
            widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1 = (WidgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1) continuation;
            int i2 = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = (List) ((Map) obj).get(this.b);
                    if (obj3 == null) {
                        obj3 = EmptyList.a;
                    }
                    widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.L$0 = null;
                    widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.L$1 = null;
                    widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.L$2 = null;
                    widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.L$3 = null;
                    widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1 = new WidgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
