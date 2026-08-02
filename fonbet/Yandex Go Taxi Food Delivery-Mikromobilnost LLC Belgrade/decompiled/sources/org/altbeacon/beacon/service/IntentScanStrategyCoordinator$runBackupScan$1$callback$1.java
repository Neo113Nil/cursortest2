package org.altbeacon.beacon.service;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.d8w;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u000b\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"org/altbeacon/beacon/service/IntentScanStrategyCoordinator$runBackupScan$1$callback$1", "Landroid/bluetooth/le/ScanCallback;", "", "callbackType", "Landroid/bluetooth/le/ScanResult;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "onScanResult", "(ILandroid/bluetooth/le/ScanResult;)V", "", "results", "onBatchScanResults", "(Ljava/util/List;)V", ErrorResponseData.JSON_ERROR_CODE, "onScanFailed", "(I)V", "android-beacon-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IntentScanStrategyCoordinator$runBackupScan$1$callback$1 extends ScanCallback {
    final /* synthetic */ Ref$BooleanRef $beaconDetected;
    final /* synthetic */ BluetoothLeScanner $scanner;
    final /* synthetic */ d8w this$0;

    public IntentScanStrategyCoordinator$runBackupScan$1$callback$1(d8w d8wVar, Ref$BooleanRef ref$BooleanRef, BluetoothLeScanner bluetoothLeScanner) {
        this.$beaconDetected = ref$BooleanRef;
        this.$scanner = bluetoothLeScanner;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(List<ScanResult> results) {
        super.onBatchScanResults(results);
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int errorCode) {
        super.onScanFailed(errorCode);
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int callbackType, ScanResult result) {
        super.onScanResult(callbackType, result);
        throw null;
    }
}
