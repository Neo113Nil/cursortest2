package io.appmetrica.analytics.blewrapper.impl;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lio/appmetrica/analytics/blewrapper/impl/c;", "Lio/appmetrica/analytics/coreapi/internal/backport/Provider;", "", "", "", "a", "Landroid/bluetooth/le/ScanResult;", "Landroid/bluetooth/le/ScanResult;", "value", "<init>", "(Landroid/bluetooth/le/ScanResult;)V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class c implements Provider<Map<Integer, ? extends byte[]>> {

    /* renamed from: a, reason: from kotlin metadata */
    private final ScanResult value;

    public c(ScanResult scanResult) {
        this.value = scanResult;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<Integer, byte[]> get() {
        Map<Integer, byte[]> advertisingDataMap;
        ScanRecord scanRecord = this.value.getScanRecord();
        if (scanRecord == null) {
            return null;
        }
        advertisingDataMap = scanRecord.getAdvertisingDataMap();
        return advertisingDataMap;
    }
}
