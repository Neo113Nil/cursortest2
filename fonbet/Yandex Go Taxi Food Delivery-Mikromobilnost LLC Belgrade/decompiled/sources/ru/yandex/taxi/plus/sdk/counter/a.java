package ru.yandex.taxi.plus.sdk.counter;

import defpackage.fze;
import defpackage.g4u0;
import defpackage.ny61;
import defpackage.pm4;
import defpackage.vpr;
import defpackage.x1d0;
import defpackage.y1d0;
import defpackage.znp0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ x1d0 b;

    public a(vpr vprVar, x1d0 x1d0Var) {
        this.a = vprVar;
        this.b = x1d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1 plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1;
        int i;
        y1d0 y1d0Var;
        pm4 pm4Var;
        if (continuation instanceof PlusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1) {
            plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1 = (PlusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1) continuation;
            int i2 = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    znp0 znp0Var = (znp0) obj;
                    if (znp0Var != null) {
                        x1d0 x1d0Var = this.b;
                        x1d0Var.getClass();
                        fze fzeVar = znp0Var.f;
                        boolean z = false;
                        int i3 = x1d0Var.a.a.getInt("ru.yandex.taxi.plus.counter.CounterPreferences.FIELD_LAST_OPENED_VALUE", 0);
                        int i4 = fzeVar.a;
                        g4u0 g4u0Var = znp0Var.c;
                        String str = (g4u0Var == null || (pm4Var = g4u0Var.e) == null) ? null : pm4Var.a;
                        int i5 = i4 - i3;
                        if (fzeVar.b && i4 > i3 && i5 > 0) {
                            z = true;
                        }
                        y1d0Var = new y1d0(i5, str, z);
                    } else {
                        y1d0Var = y1d0.d;
                    }
                    plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.L$0 = null;
                    plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.L$1 = null;
                    plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.L$2 = null;
                    plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.L$3 = null;
                    plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(y1d0Var, plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1 = new PlusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusCounterInteractor$plusCounterModelFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
