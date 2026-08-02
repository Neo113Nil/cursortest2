package ru.yandex.taxi.scooters.domain;

import defpackage.ny61;
import defpackage.ugo0;
import defpackage.v7j0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.model.ScootersPermissionsNotGranted;

/* loaded from: classes6.dex */
public final class o {
    public final v7j0 a;
    public final ugo0 b;

    public o(v7j0 v7j0Var, ugo0 ugo0Var) {
        this.a = v7j0Var;
        this.b = ugo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersPermissionsInteractor$requestCameraPermissionIfNeeded$1 scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersPermissionsInteractor$requestCameraPermissionIfNeeded$1) {
            scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1 = (ScootersPermissionsInteractor$requestCameraPermissionIfNeeded$1) continuationImpl;
            int i2 = scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1.label = 1;
                    obj = ((com.yandex.go.permission.b) this.a).d(3, scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1);
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
                    throw new ScootersPermissionsNotGranted();
                }
                return zy11.a;
            }
        }
        scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1 = new ScootersPermissionsInteractor$requestCameraPermissionIfNeeded$1(this, continuationImpl);
        obj = scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPermissionsInteractor$requestCameraPermissionIfNeeded$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersPermissionsInteractor$requestLocationPermissionIfNeeded$1 scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersPermissionsInteractor$requestLocationPermissionIfNeeded$1) {
            scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1 = (ScootersPermissionsInteractor$requestLocationPermissionIfNeeded$1) continuationImpl;
            int i2 = scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1.label = 1;
                    obj = ((com.yandex.go.permission.b) this.a).d(1, scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1);
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
                    throw new ScootersPermissionsNotGranted();
                }
                return zy11.a;
            }
        }
        scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1 = new ScootersPermissionsInteractor$requestLocationPermissionIfNeeded$1(this, continuationImpl);
        obj = scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPermissionsInteractor$requestLocationPermissionIfNeeded$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
