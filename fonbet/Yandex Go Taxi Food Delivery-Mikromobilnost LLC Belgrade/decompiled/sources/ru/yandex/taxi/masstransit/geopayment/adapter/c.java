package ru.yandex.taxi.masstransit.geopayment.adapter;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;

    public c(n0 n0Var) {
        this.a = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1 bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof BleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1) {
            bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1 = (BleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1) continuation;
            int i2 = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.L$0 = null;
                    bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.L$1 = null;
                    bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.L$2 = null;
                    bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1 = new BleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bleSettingsInteractorImpl$activityResultFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
