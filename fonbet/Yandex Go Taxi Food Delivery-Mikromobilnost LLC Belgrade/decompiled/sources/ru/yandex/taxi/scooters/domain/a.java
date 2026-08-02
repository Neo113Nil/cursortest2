package ru.yandex.taxi.scooters.domain;

import com.yandex.go.scooters.ble.api.exceptions.ScootersBluetoothNotGrantedException;
import defpackage.jqm0;
import defpackage.ny61;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a implements jqm0 {
    public final n a;
    public final v7j0 b;

    public a(n nVar, v7j0 v7j0Var) {
        this.a = nVar;
        this.b = v7j0Var;
    }

    @Override // defpackage.jqm0
    public final Object a(wls wlsVar, Continuation continuation) {
        Object invoke = wlsVar.invoke(this.a, continuation);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.jqm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        ScootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1 scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1;
        Object obj;
        int i;
        if (continuation instanceof ScootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1) {
            scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1 = (ScootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1) continuation;
            int i2 = scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1.label = 1;
                    obj = ((com.yandex.go.permission.b) this.b).d(10, scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new ScootersBluetoothNotGrantedException();
                }
                return zy11.a;
            }
        }
        scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1 = new ScootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1(this, (ContinuationImpl) continuation);
        obj = scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActiveOrderBleInteractorImpl$requestBlePermissionIfNeeded$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.jqm0
    public final boolean c() {
        return true;
    }
}
