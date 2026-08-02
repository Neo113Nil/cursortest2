package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot;

import defpackage.cqs0;
import defpackage.eus0;
import defpackage.j6s;
import defpackage.nws0;
import defpackage.ny61;
import defpackage.xts0;
import defpackage.yg;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;

    public b(ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(eus0 eus0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        SlotWidgetMapper$map$1 slotWidgetMapper$map$1;
        int i;
        if (continuationImpl instanceof SlotWidgetMapper$map$1) {
            slotWidgetMapper$map$1 = (SlotWidgetMapper$map$1) continuationImpl;
            int i2 = slotWidgetMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slotWidgetMapper$map$1.label = i2 - Integer.MIN_VALUE;
                SlotWidgetMapper$map$1 slotWidgetMapper$map$12 = slotWidgetMapper$map$1;
                Object obj = slotWidgetMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slotWidgetMapper$map$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xts0 xts0Var = eus0Var.b;
                    yg ygVar = eus0Var.d;
                    String str = eus0Var.c;
                    slotWidgetMapper$map$12.L$0 = eus0Var;
                    slotWidgetMapper$map$12.L$1 = null;
                    slotWidgetMapper$map$12.label = 1;
                    obj = this.a.p(xts0Var, j6sVar, ygVar, str, slotWidgetMapper$map$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eus0Var = (eus0) slotWidgetMapper$map$12.L$0;
                    kotlin.b.b(obj);
                }
                return new nws0(eus0Var.a, (cqs0) obj);
            }
        }
        slotWidgetMapper$map$1 = new SlotWidgetMapper$map$1(this, continuationImpl);
        SlotWidgetMapper$map$1 slotWidgetMapper$map$122 = slotWidgetMapper$map$1;
        Object obj2 = slotWidgetMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slotWidgetMapper$map$122.label;
        if (i != 0) {
        }
        return new nws0(eus0Var.a, (cqs0) obj2);
    }
}
