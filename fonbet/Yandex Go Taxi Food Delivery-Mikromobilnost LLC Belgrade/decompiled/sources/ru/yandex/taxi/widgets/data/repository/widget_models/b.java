package ru.yandex.taxi.widgets.data.repository.widget_models;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ yaf0 b;

    public b(r0 r0Var, yaf0 yaf0Var) {
        this.a = r0Var;
        this.b = yaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WidgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1 widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof WidgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1) {
            widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1 = (WidgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1) continuation;
            int i2 = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.L$0 = null;
                    widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.L$1 = null;
                    widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.L$2 = null;
                    widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1 = new WidgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetModelsRepositoryImpl$getWidgetsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
