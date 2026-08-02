package com.squareup.cash.nearby.backend;

import com.squareup.cash.nearby.backend.ble.BleDeviceState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealNearbyPermissionStateProvider$permissionState$1 extends SuspendLambda implements Function4 {
    public /* synthetic */ BleDeviceState L$0;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public final /* synthetic */ RealNearbyPermissionStateProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealNearbyPermissionStateProvider$permissionState$1(RealNearbyPermissionStateProvider realNearbyPermissionStateProvider, Continuation continuation) {
        super(4, continuation);
        this.this$0 = realNearbyPermissionStateProvider;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        RealNearbyPermissionStateProvider$permissionState$1 realNearbyPermissionStateProvider$permissionState$1 = new RealNearbyPermissionStateProvider$permissionState$1(this.this$0, (Continuation) obj4);
        realNearbyPermissionStateProvider$permissionState$1.L$0 = (BleDeviceState) obj;
        realNearbyPermissionStateProvider$permissionState$1.Z$0 = booleanValue;
        realNearbyPermissionStateProvider$permissionState$1.Z$1 = booleanValue2;
        return realNearbyPermissionStateProvider$permissionState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        BleDeviceState bleDeviceState = this.L$0;
        boolean z2 = this.Z$0;
        boolean z3 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        RealNearbyPermissionStateProvider realNearbyPermissionStateProvider = this.this$0;
        boolean z4 = false;
        if (!z2) {
            realNearbyPermissionStateProvider.getClass();
            for (String str : RealNearbyPermissionStateProvider.getBtPermissions()) {
                if (realNearbyPermissionStateProvider.activity.shouldShowRequestPermissionRationale(str)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        PermissionState permissionState = new PermissionState(z2, z);
        if (!z3) {
            realNearbyPermissionStateProvider.getClass();
            z4 = realNearbyPermissionStateProvider.activity.shouldShowRequestPermissionRationale(new String[]{"android.permission.ACCESS_FINE_LOCATION"}[0]);
        }
        return new NearbyPermissionState(bleDeviceState, permissionState, new PermissionState(z3, z4));
    }
}
