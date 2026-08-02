package io.appmetrica.analytics.blewrapper.impl;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Context;
import defpackage.gs51;
import defpackage.tls;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* loaded from: classes9.dex */
public final class f {
    public final Context a;

    public f(Context context) {
        this.a = context;
    }

    public static final Object a(f fVar, tls tlsVar, BluetoothManager bluetoothManager) {
        BluetoothLeScanner bluetoothLeScanner;
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        if (adapter == null || !adapter.isEnabled() || (bluetoothLeScanner = adapter.getBluetoothLeScanner()) == null) {
            return null;
        }
        return tlsVar.invoke(bluetoothLeScanner);
    }

    public final Object a(String str, tls tlsVar) {
        return SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "bluetooth", str, "BluetoothManager", new gs51(5, this, tlsVar));
    }
}
