package ru.yandex.taxi.widgets.data.repository;

import defpackage.kx70;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wx70;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;

    public r(vpr vprVar, t tVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WidgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1 widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WidgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1) {
            widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1 = (WidgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List<kx70> list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (kx70 kx70Var : list) {
                        arrayList.add(new wx70(kx70Var.f().getAlias(), kx70Var.b(), kx70Var.e(), kx70Var.a(), kx70Var.c()));
                    }
                    widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1 = new WidgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsDtoRepository$knownOrdersFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
