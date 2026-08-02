package com.squareup.cash.nearby.backend;

import android.app.Activity;
import android.os.Build;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.nearby.backend.ble.BleDeviceState;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.permissions.PermissionChecker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class RealNearbyPermissionStateProvider {
    public final Activity activity;
    public final RealBleManager bleManager;
    public final PermissionChecker permissionChecker;

    public RealNearbyPermissionStateProvider(RealBleManager realBleManager, PermissionChecker permissionChecker, Activity activity) {
        this.bleManager = realBleManager;
        this.permissionChecker = permissionChecker;
        this.activity = activity;
    }

    public static String[] getBtPermissions() {
        return Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"} : new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"};
    }

    public final FinishSetupTileBadgeCounter permissionState() {
        RealBleManager realBleManager = this.bleManager;
        Flow appLockMonitor$special$$inlined$map$2 = (!realBleManager.activity.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || realBleManager.btAdapter == null || realBleManager.btAdvertiser == null || realBleManager.btScanner == null) ? new AppLockMonitor$special$$inlined$map$2(BleDeviceState.UNAVAILABLE, 19) : FlowKt.callbackFlow(new MusicPresenter$models$2$1(realBleManager, null, 24));
        String[] btPermissions = getBtPermissions();
        PermissionChecker permissionChecker = this.permissionChecker;
        return FlowKt.combine(appLockMonitor$special$$inlined$map$2, permissionChecker.granted(btPermissions), permissionChecker.granted(new String[]{"android.permission.ACCESS_FINE_LOCATION"}), new RealNearbyPermissionStateProvider$permissionState$1(this, null));
    }
}
