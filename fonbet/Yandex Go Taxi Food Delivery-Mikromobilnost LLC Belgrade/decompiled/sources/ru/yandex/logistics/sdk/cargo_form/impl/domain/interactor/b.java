package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.c0i0;
import defpackage.fza0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qej;
import defpackage.rzh0;
import defpackage.vej;
import defpackage.w511;
import defpackage.wej;
import defpackage.xej;
import defpackage.y30;
import defpackage.yej;
import defpackage.yuj0;
import defpackage.zej;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

/* loaded from: classes5.dex */
public final class b {
    public final fza0 a;
    public final yuj0 b;
    public final com.yandex.delivery.utils.dialogmanager.impl.b c;
    public final y30 d;

    public b(fza0 fza0Var, yuj0 yuj0Var, com.yandex.delivery.utils.dialogmanager.impl.b bVar, y30 y30Var) {
        this.a = fza0Var;
        this.b = yuj0Var;
        this.c = bVar;
        this.d = y30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (b(r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CameraPermissionInteractor$requestCameraPermission$1 cameraPermissionInteractor$requestCameraPermission$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof CameraPermissionInteractor$requestCameraPermission$1) {
            cameraPermissionInteractor$requestCameraPermission$1 = (CameraPermissionInteractor$requestCameraPermission$1) continuationImpl;
            int i2 = cameraPermissionInteractor$requestCameraPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraPermissionInteractor$requestCameraPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraPermissionInteractor$requestCameraPermission$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraPermissionInteractor$requestCameraPermission$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Permission permission = Permission.CAMERA;
                    cameraPermissionInteractor$requestCameraPermission$1.label = 1;
                    obj = this.a.a(permission, cameraPermissionInteractor$requestCameraPermission$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return Boolean.FALSE;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return Boolean.TRUE;
                }
                cameraPermissionInteractor$requestCameraPermission$1.Z$0 = booleanValue;
                cameraPermissionInteractor$requestCameraPermission$1.label = 2;
            }
        }
        cameraPermissionInteractor$requestCameraPermission$1 = new CameraPermissionInteractor$requestCameraPermission$1(this, continuationImpl);
        Object obj3 = cameraPermissionInteractor$requestCameraPermission$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraPermissionInteractor$requestCameraPermission$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        CameraPermissionInteractor$showPermissionDeniedForeverDialog$1 cameraPermissionInteractor$showPermissionDeniedForeverDialog$1;
        int i;
        zej zejVar;
        if (continuationImpl instanceof CameraPermissionInteractor$showPermissionDeniedForeverDialog$1) {
            cameraPermissionInteractor$showPermissionDeniedForeverDialog$1 = (CameraPermissionInteractor$showPermissionDeniedForeverDialog$1) continuationImpl;
            int i2 = cameraPermissionInteractor$showPermissionDeniedForeverDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraPermissionInteractor$showPermissionDeniedForeverDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraPermissionInteractor$showPermissionDeniedForeverDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraPermissionInteractor$showPermissionDeniedForeverDialog$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yuj0 yuj0Var = this.b;
                    qej qejVar = new qej(null, yuj0Var.a(c0i0.delivery_camera_permission_dialog_title, new Object[0]), yuj0Var.a(rzh0.delivery_settings_button, new Object[0]), yuj0Var.a(rzh0.logistics_cancel_button, new Object[0]), null, false, null, null, 241);
                    cameraPermissionInteractor$showPermissionDeniedForeverDialog$1.L$0 = null;
                    cameraPermissionInteractor$showPermissionDeniedForeverDialog$1.label = 1;
                    obj = this.c.a(qejVar, cameraPermissionInteractor$showPermissionDeniedForeverDialog$1);
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
                zejVar = (zej) obj;
                if (!jl40.l(zejVar, yej.a)) {
                    Context a = this.d.a();
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", a.getPackageName(), null));
                    if (intent.resolveActivity(a.getPackageManager()) != null) {
                        try {
                            a.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            intent.toString();
                        }
                    }
                } else if (!jl40.l(zejVar, vej.a) && !jl40.l(zejVar, wej.a) && !jl40.l(zejVar, xej.a)) {
                    w511.b();
                    return null;
                }
                return zy11.a;
            }
        }
        cameraPermissionInteractor$showPermissionDeniedForeverDialog$1 = new CameraPermissionInteractor$showPermissionDeniedForeverDialog$1(this, continuationImpl);
        Object obj2 = cameraPermissionInteractor$showPermissionDeniedForeverDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraPermissionInteractor$showPermissionDeniedForeverDialog$1.label;
        if (i != 0) {
        }
        zejVar = (zej) obj2;
        if (!jl40.l(zejVar, yej.a)) {
        }
        return zy11.a;
    }
}
