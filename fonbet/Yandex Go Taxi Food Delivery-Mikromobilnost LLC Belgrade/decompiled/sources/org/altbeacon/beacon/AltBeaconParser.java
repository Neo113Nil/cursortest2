package org.altbeacon.beacon;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes4.dex */
public class AltBeaconParser extends BeaconParser {
    public AltBeaconParser() {
        this.mHardwareAssistManufacturers = new int[]{280};
        p("m:2-3=beac,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25");
        this.mIdentifier = "altbeacon";
    }

    @Override // org.altbeacon.beacon.BeaconParser
    public final Beacon c(int i, long j, BluetoothDevice bluetoothDevice, byte[] bArr) {
        return f(bArr, i, bluetoothDevice, j, new AltBeacon());
    }
}
