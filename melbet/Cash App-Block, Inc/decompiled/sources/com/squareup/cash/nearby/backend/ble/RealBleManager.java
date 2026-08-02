package com.squareup.cash.nearby.backend.ble;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import com.squareup.cash.permissions.AndroidPermissionManager;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class RealBleManager {
    public final Activity activity;
    public final BluetoothAdapter btAdapter;
    public final BluetoothLeAdvertiser btAdvertiser;
    public final BluetoothLeScanner btScanner;
    public final LinkedHashMap scanCallbacks;

    public RealBleManager(AndroidPermissionManager androidPermissionManager, Activity activity) {
        this.activity = activity;
        Object systemService = activity.getSystemService("bluetooth");
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        this.btAdapter = adapter;
        this.btAdvertiser = adapter != null ? adapter.getBluetoothLeAdvertiser() : null;
        this.btScanner = adapter != null ? adapter.getBluetoothLeScanner() : null;
        this.scanCallbacks = new LinkedHashMap();
    }
}
