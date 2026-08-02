package org.altbeacon.beacon.service.scanner;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.os.SystemClock;
import defpackage.aye0;
import defpackage.mlm0;
import defpackage.n66;
import defpackage.vof;
import java.util.List;

/* loaded from: classes4.dex */
class CycledLeScannerForLollipop$4 extends ScanCallback {
    final /* synthetic */ b this$0;

    public CycledLeScannerForLollipop$4(b bVar) {
        this.this$0 = bVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(List<ScanResult> list) {
        for (ScanResult scanResult : list) {
            vof vofVar = this.this$0.t;
            BluetoothDevice device = scanResult.getDevice();
            int rssi = scanResult.getRssi();
            byte[] bytes = scanResult.getScanRecord().getBytes();
            ((mlm0) ((aye0) vofVar).b).b(rssi, (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.getTimestampNanos() / 1000000), device, bytes);
        }
        long j = this.this$0.A;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i) {
        n66.a().getClass();
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i, ScanResult scanResult) {
        vof vofVar = this.this$0.t;
        BluetoothDevice device = scanResult.getDevice();
        int rssi = scanResult.getRssi();
        byte[] bytes = scanResult.getScanRecord().getBytes();
        ((mlm0) ((aye0) vofVar).b).b(rssi, (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.getTimestampNanos() / 1000000), device, bytes);
        long j = this.this$0.A;
    }
}
