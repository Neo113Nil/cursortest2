package ru.yandex.taxi.masstransit.geopayment.adapter;

import defpackage.ny61;
import defpackage.r16;
import defpackage.r40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1 bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1) {
            bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1 = (BleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1) continuation;
            int i2 = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r16 r16Var = new r16(((r40) obj).b);
                    bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.L$0 = null;
                    bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.L$1 = null;
                    bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.L$2 = null;
                    bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.L$3 = null;
                    bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(r16Var, bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1 = new BleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
