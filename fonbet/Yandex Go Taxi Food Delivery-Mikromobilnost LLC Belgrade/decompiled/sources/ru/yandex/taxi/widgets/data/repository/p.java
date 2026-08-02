package ru.yandex.taxi.widgets.data.repository;

import defpackage.ny61;
import defpackage.o801;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yaf0 b;

    public p(vpr vprVar, yaf0 yaf0Var) {
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
        WidgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1 widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof WidgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1) {
            widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1 = (WidgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = ((Map) obj).get(new o801(vez0.D(this.b)));
                    if (obj3 != null) {
                        widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.L$0 = null;
                        widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.L$1 = null;
                        widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.L$2 = null;
                        widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.L$3 = null;
                        widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.L$4 = null;
                        widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(obj3, widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1 = new WidgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
