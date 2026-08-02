package ru.yandex.taxi.systemrequeirements.location;

import defpackage.ny61;
import defpackage.v7j0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class c {
    public final v7j0 a;

    public c(v7j0 v7j0Var) {
        this.a = v7j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationPermissionInteractorImpl$ensureLocationPermission$1 locationPermissionInteractorImpl$ensureLocationPermission$1;
        Object obj;
        int i;
        if (continuationImpl instanceof LocationPermissionInteractorImpl$ensureLocationPermission$1) {
            locationPermissionInteractorImpl$ensureLocationPermission$1 = (LocationPermissionInteractorImpl$ensureLocationPermission$1) continuationImpl;
            int i2 = locationPermissionInteractorImpl$ensureLocationPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationPermissionInteractorImpl$ensureLocationPermission$1.label = i2 - Integer.MIN_VALUE;
                obj = locationPermissionInteractorImpl$ensureLocationPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationPermissionInteractorImpl$ensureLocationPermission$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationPermissionInteractorImpl$ensureLocationPermission$1.label = 1;
                    obj = ((com.yandex.go.permission.b) this.a).d(1, locationPermissionInteractorImpl$ensureLocationPermission$1);
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
                if (!((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
                LocationRequirementsException.Companion.getClass();
                throw e.d();
            }
        }
        locationPermissionInteractorImpl$ensureLocationPermission$1 = new LocationPermissionInteractorImpl$ensureLocationPermission$1(this, continuationImpl);
        obj = locationPermissionInteractorImpl$ensureLocationPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationPermissionInteractorImpl$ensureLocationPermission$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
