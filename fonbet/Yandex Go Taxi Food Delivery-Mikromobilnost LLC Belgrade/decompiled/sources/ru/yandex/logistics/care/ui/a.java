package ru.yandex.logistics.care.ui;

import defpackage.fza0;
import defpackage.ny61;
import defpackage.vr7;
import defpackage.wr7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

/* loaded from: classes4.dex */
public final class a {
    public final fza0 a;

    public a(fza0 fza0Var) {
        this.a = fza0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CameraPermissionCheckerImpl$checkAndRequestPermission$1 cameraPermissionCheckerImpl$checkAndRequestPermission$1;
        Object obj;
        int i;
        if (continuationImpl instanceof CameraPermissionCheckerImpl$checkAndRequestPermission$1) {
            cameraPermissionCheckerImpl$checkAndRequestPermission$1 = (CameraPermissionCheckerImpl$checkAndRequestPermission$1) continuationImpl;
            int i2 = cameraPermissionCheckerImpl$checkAndRequestPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraPermissionCheckerImpl$checkAndRequestPermission$1.label = i2 - Integer.MIN_VALUE;
                obj = cameraPermissionCheckerImpl$checkAndRequestPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraPermissionCheckerImpl$checkAndRequestPermission$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Permission permission = Permission.CAMERA;
                    fza0 fza0Var = this.a;
                    if (!fza0Var.b(permission)) {
                        cameraPermissionCheckerImpl$checkAndRequestPermission$1.label = 1;
                        obj = fza0Var.a(permission, cameraPermissionCheckerImpl$checkAndRequestPermission$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return wr7.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return vr7.a;
                }
                return wr7.a;
            }
        }
        cameraPermissionCheckerImpl$checkAndRequestPermission$1 = new CameraPermissionCheckerImpl$checkAndRequestPermission$1(this, continuationImpl);
        obj = cameraPermissionCheckerImpl$checkAndRequestPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraPermissionCheckerImpl$checkAndRequestPermission$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return wr7.a;
    }
}
