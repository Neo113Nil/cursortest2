package ru.yandex.taxi.logistics.sdk.permissions.impl;

import android.util.Log;
import defpackage.ffx;
import defpackage.fza0;
import defpackage.fzw;
import defpackage.ny61;
import defpackage.wza0;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

/* loaded from: classes5.dex */
public final class b implements fza0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.fza0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Permission permission, ContinuationImpl continuationImpl) {
        PermissionRepositoryImpl$request$1 permissionRepositoryImpl$request$1;
        int i;
        if (continuationImpl instanceof PermissionRepositoryImpl$request$1) {
            permissionRepositoryImpl$request$1 = (PermissionRepositoryImpl$request$1) continuationImpl;
            int i2 = permissionRepositoryImpl$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                permissionRepositoryImpl$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = permissionRepositoryImpl$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = permissionRepositoryImpl$request$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    wza0 wza0Var = (wza0) this.a.get(permission);
                    if (wza0Var == null) {
                        Log.e("PermissionRepository", "Didn't you forget one of the following?\n- add permission into your AndroidManifest\n- call @Composable Permission() in your screen's @Composable method\n- use one instance of PermissionRepository here and in @Composable Permission");
                        return Boolean.FALSE;
                    }
                    if (wza0Var.b()) {
                        return Boolean.TRUE;
                    }
                    wza0Var.a();
                    fzw fzwVar = new fzw(17, this.b, permission);
                    permissionRepositoryImpl$request$1.L$0 = null;
                    permissionRepositoryImpl$request$1.L$1 = null;
                    permissionRepositoryImpl$request$1.label = 1;
                    obj = e.y(fzwVar, permissionRepositoryImpl$request$1);
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
                return Boolean.valueOf(b((Permission) obj));
            }
        }
        permissionRepositoryImpl$request$1 = new PermissionRepositoryImpl$request$1(this, continuationImpl);
        Object obj2 = permissionRepositoryImpl$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = permissionRepositoryImpl$request$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(b((Permission) obj2));
    }

    @Override // defpackage.fza0
    public final boolean b(Permission permission) {
        wza0 wza0Var = (wza0) this.a.get(permission);
        if (wza0Var != null) {
            return wza0Var.b();
        }
        return false;
    }
}
