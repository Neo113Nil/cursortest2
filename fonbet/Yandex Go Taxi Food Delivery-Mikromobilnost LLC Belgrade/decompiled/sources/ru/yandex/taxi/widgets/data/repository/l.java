package ru.yandex.taxi.widgets.data.repository;

import defpackage.c551;
import defpackage.ny61;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yaf0 b;

    public l(vpr vprVar, yaf0 yaf0Var) {
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
        WidgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1 widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WidgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1) {
            widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1 = (WidgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1) continuation;
            int i2 = widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    yaf0 yaf0Var = this.b;
                    c551 c551Var = new c551(yaf0Var != null ? vez0.D(yaf0Var) : null, list);
                    widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.L$0 = null;
                    widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.L$1 = null;
                    widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.L$2 = null;
                    widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.L$3 = null;
                    widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(c551Var, widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1 = new WidgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsDtoRepository$createWidgetsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
