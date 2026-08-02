package com.squareup.cash.beacondetection.real;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import androidx.emoji2.text.MetadataRepo;
import com.squareup.cash.beacondetection.api.IBeaconDevice;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class BeaconScanner$startScanning$callback$1 extends ScanCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ BeaconScanner$startScanning$callback$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onBatchScanResults(List list) {
        Function1 function1;
        switch (this.$r8$classId) {
            case 0:
                if (list != null) {
                    MetadataRepo metadataRepo = (MetadataRepo) this.this$0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        IBeaconDevice parse = IBeaconParser.parse((ScanResult) it.next());
                        if (parse != null && (function1 = (Function1) metadataRepo.mTypeface) != null) {
                            function1.invoke(parse);
                        }
                    }
                    break;
                }
                break;
            default:
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        onScanResult(1, (ScanResult) it2.next());
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
        switch (this.$r8$classId) {
            case 0:
                Timber.Forest.e("BeaconDetection: scan failed with error code %d", Integer.valueOf(i));
                break;
            default:
                Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "NEARBY - scan failed with error code: "), new Object[0]);
                break;
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        Function1 function1;
        int i2 = this.$r8$classId;
        Object obj = this.this$0;
        switch (i2) {
            case 0:
                if (scanResult != null) {
                    MetadataRepo metadataRepo = (MetadataRepo) obj;
                    IBeaconDevice parse = IBeaconParser.parse(scanResult);
                    if (parse != null && (function1 = (Function1) metadataRepo.mTypeface) != null) {
                        function1.invoke(parse);
                        break;
                    }
                }
                break;
            default:
                if (scanResult != null) {
                    ((Overlay$$ExternalSyntheticLambda0) obj).invoke(scanResult);
                    break;
                }
                break;
        }
    }
}
