package ru.yandex.taxi.masstransit.geopayment.adapter;

import defpackage.bvf0;
import defpackage.ny61;
import defpackage.v7j0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class a {
    public final v7j0 a;
    public final r0 b;
    public final r0 c;

    public a(v7j0 v7j0Var) {
        this.a = v7j0Var;
        com.yandex.go.permission.b bVar = (com.yandex.go.permission.b) v7j0Var;
        this.b = bvf0.c(Boolean.valueOf(bVar.a(1)));
        this.c = bvf0.c(Boolean.valueOf(bVar.a(11)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r3 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        BlePermissionsInteractorImpl$refreshPermissionState$1 blePermissionsInteractorImpl$refreshPermissionState$1;
        int i;
        if (continuationImpl instanceof BlePermissionsInteractorImpl$refreshPermissionState$1) {
            blePermissionsInteractorImpl$refreshPermissionState$1 = (BlePermissionsInteractorImpl$refreshPermissionState$1) continuationImpl;
            int i2 = blePermissionsInteractorImpl$refreshPermissionState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blePermissionsInteractorImpl$refreshPermissionState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = blePermissionsInteractorImpl$refreshPermissionState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = blePermissionsInteractorImpl$refreshPermissionState$1.label;
                zy11 zy11Var = zy11.a;
                v7j0 v7j0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Boolean valueOf = Boolean.valueOf(((com.yandex.go.permission.b) v7j0Var).a(1));
                    blePermissionsInteractorImpl$refreshPermissionState$1.label = 1;
                    this.b.emit(valueOf, blePermissionsInteractorImpl$refreshPermissionState$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Boolean valueOf2 = Boolean.valueOf(((com.yandex.go.permission.b) v7j0Var).a(11));
                blePermissionsInteractorImpl$refreshPermissionState$1.label = 2;
                this.c.emit(valueOf2, blePermissionsInteractorImpl$refreshPermissionState$1);
                return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        blePermissionsInteractorImpl$refreshPermissionState$1 = new BlePermissionsInteractorImpl$refreshPermissionState$1(this, continuationImpl);
        Object obj2 = blePermissionsInteractorImpl$refreshPermissionState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = blePermissionsInteractorImpl$refreshPermissionState$1.label;
        zy11 zy11Var2 = zy11.a;
        v7j0 v7j0Var2 = this.a;
        if (i != 0) {
        }
        Boolean valueOf22 = Boolean.valueOf(((com.yandex.go.permission.b) v7j0Var2).a(11));
        blePermissionsInteractorImpl$refreshPermissionState$1.label = 2;
        this.c.emit(valueOf22, blePermissionsInteractorImpl$refreshPermissionState$1);
        if (zy11Var2 != coroutineSingletons2) {
        }
    }
}
