package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline;

import defpackage.aif;
import defpackage.dqb1;
import defpackage.izt0;
import defpackage.ny61;
import defpackage.s9n;
import defpackage.tcc;
import defpackage.u9n;
import defpackage.vpr;
import defpackage.x8n;
import defpackage.zcz0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public b(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1 dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1;
        int i;
        u9n u9nVar;
        if (continuation instanceof DynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1) {
            dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1 = (DynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1) continuation;
            int i2 = dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    aif aifVar = (aif) obj;
                    if (aifVar != null) {
                        s9n s9nVar = this.b.a;
                        x8n x8nVar = aifVar.a;
                        long j = aifVar.b;
                        s9nVar.getClass();
                        ArrayList<zcz0> arrayList = x8nVar.a;
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        for (zcz0 zcz0Var : arrayList) {
                            long j2 = zcz0Var.a;
                            String str = zcz0Var.b;
                            dqb1 dqb1Var = zcz0Var.c;
                            arrayList2.add(new izt0(j2, 0.0f, str, dqb1Var != null ? s9nVar.a(dqb1Var) : null));
                        }
                        u9nVar = new u9n(j, arrayList2);
                    } else {
                        u9nVar = null;
                    }
                    dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.L$0 = null;
                    dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.L$1 = null;
                    dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.L$2 = null;
                    dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.L$3 = null;
                    dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.I$0 = 0;
                    dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(u9nVar, dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1 = new DynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dynamicTimelineStateHolder$mapToWidgetFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
