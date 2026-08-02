package ru.yandex.taxi.widgets.data.repository;

import defpackage.eci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class q implements tpr {
    public final /* synthetic */ eci0 a;
    public final /* synthetic */ yaf0 b;

    public q(eci0 eci0Var, yaf0 yaf0Var) {
        this.a = eci0Var;
        this.b = yaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WidgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1 widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof WidgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1) {
            widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1 = (WidgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1) continuation;
            int i2 = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar, this.b);
                    widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.L$0 = null;
                    widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.L$1 = null;
                    widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.L$2 = null;
                    widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.a.collect(pVar, widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1 = new WidgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsDtoRepository$getWidgetListFlow$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
