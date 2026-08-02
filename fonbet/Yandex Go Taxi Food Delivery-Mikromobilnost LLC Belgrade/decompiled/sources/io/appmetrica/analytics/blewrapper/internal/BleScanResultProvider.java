package io.appmetrica.analytics.blewrapper.internal;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.util.SparseArray;
import defpackage.tcc;
import io.appmetrica.analytics.blewrapper.impl.a;
import io.appmetrica.analytics.blewrapper.impl.g;
import io.appmetrica.analytics.blewrapper.impl.j;
import io.appmetrica.analytics.blewrapper.internal.config.ScanFilterConfig;
import io.appmetrica.analytics.blewrapper.internal.result.BleData;
import io.appmetrica.analytics.blewrapper.internal.result.BleScanResult;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000e"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/BleScanResultProvider;", "", "Landroid/os/Bundle;", Constants.KEY_DATA, "", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanFilterConfig;", "scanFilters", "Lio/appmetrica/analytics/blewrapper/internal/result/BleScanResult;", "getFilteredScanResult", "Lio/appmetrica/analytics/blewrapper/impl/g;", "scanFiltersConverter", "<init>", "(Lio/appmetrica/analytics/blewrapper/impl/g;)V", "()V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BleScanResultProvider {
    private final g a;

    public BleScanResultProvider() {
        this(new g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public final BleScanResult getFilteredScanResult(Bundle data, Set<ScanFilterConfig> scanFilters) {
        ?? r1;
        ArrayList parcelableArrayList = data.getParcelableArrayList("android.bluetooth.le.extra.LIST_SCAN_RESULT");
        int i = data.getInt("android.bluetooth.le.extra.CALLBACK_TYPE", Integer.MIN_VALUE);
        Integer valueOf = data.containsKey("android.bluetooth.le.extra.ERROR_CODE") ? Integer.valueOf(data.getInt("android.bluetooth.le.extra.ERROR_CODE", Integer.MIN_VALUE)) : null;
        this.a.getClass();
        ArrayList a = g.a(scanFilters);
        if (parcelableArrayList != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : parcelableArrayList) {
                ScanResult scanResult = (ScanResult) obj;
                if (!a.isEmpty()) {
                    Iterator it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((ScanFilter) it.next()).matches(scanResult)) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            r1 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ScanResult scanResult2 = (ScanResult) it2.next();
                int advertisingSid = scanResult2.getAdvertisingSid();
                int dataStatus = scanResult2.getDataStatus();
                int periodicAdvertisingInterval = scanResult2.getPeriodicAdvertisingInterval();
                int primaryPhy = scanResult2.getPrimaryPhy();
                int rssi = scanResult2.getRssi();
                int secondaryPhy = scanResult2.getSecondaryPhy();
                long timestampNanos = scanResult2.getTimestampNanos();
                int txPower = scanResult2.getTxPower();
                BluetoothDevice device = scanResult2.getDevice();
                String address = device != null ? device.getAddress() : null;
                ScanRecord scanRecord = scanResult2.getScanRecord();
                Integer valueOf2 = scanRecord != null ? Integer.valueOf(scanRecord.getAdvertiseFlags()) : null;
                Iterator it3 = it2;
                Map<Integer, byte[]> map = new a(scanResult2).get();
                ScanRecord scanRecord2 = scanResult2.getScanRecord();
                String deviceName = scanRecord2 != null ? scanRecord2.getDeviceName() : null;
                ScanRecord scanRecord3 = scanResult2.getScanRecord();
                SparseArray<byte[]> manufacturerSpecificData = scanRecord3 != null ? scanRecord3.getManufacturerSpecificData() : null;
                ScanRecord scanRecord4 = scanResult2.getScanRecord();
                Map<ParcelUuid, byte[]> serviceData = scanRecord4 != null ? scanRecord4.getServiceData() : null;
                List<ParcelUuid> list = new j(scanResult2).get();
                ScanRecord scanRecord5 = scanResult2.getScanRecord();
                List<ParcelUuid> serviceUuids = scanRecord5 != null ? scanRecord5.getServiceUuids() : null;
                ScanRecord scanRecord6 = scanResult2.getScanRecord();
                r1.add(new BleData(i, advertisingSid, dataStatus, periodicAdvertisingInterval, primaryPhy, rssi, secondaryPhy, timestampNanos, txPower, address, valueOf2, map, deviceName, manufacturerSpecificData, serviceData, list, serviceUuids, scanRecord6 != null ? Integer.valueOf(scanRecord6.getTxPowerLevel()) : null));
                it2 = it3;
            }
        } else {
            r1 = EmptyList.a;
        }
        return new BleScanResult(r1, valueOf);
    }

    public BleScanResultProvider(g gVar) {
        this.a = gVar;
    }
}
