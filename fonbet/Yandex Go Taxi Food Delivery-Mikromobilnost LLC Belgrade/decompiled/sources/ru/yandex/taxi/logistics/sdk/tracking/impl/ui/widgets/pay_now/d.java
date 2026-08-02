package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now;

import defpackage.cx;
import defpackage.j00;
import defpackage.ny61;
import defpackage.qt90;
import defpackage.t701;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qt90 b;

    public d(vpr vprVar, qt90 qt90Var) {
        this.a = vprVar;
        this.b = qt90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PayNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1 payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PayNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1) {
            payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1 = (PayNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1) continuation;
            int i2 = payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.c.getClass();
                    List c = j00.c((t701) obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null ? next instanceof cx : true) {
                            arrayList.add(next);
                        }
                    }
                    Object R = kotlin.collections.a.R(arrayList);
                    payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.L$0 = null;
                    payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.L$1 = null;
                    payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.L$2 = null;
                    payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.L$3 = null;
                    payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.I$0 = 0;
                    payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(R, payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1 = new PayNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payNowWidgetStateHolder$payNowInteractor$1$actionPayNowFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
