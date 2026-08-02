package io.appmetrica.analytics.blewrapper.impl;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanFilter;
import io.appmetrica.analytics.blewrapper.internal.config.ManufacturerData;
import io.appmetrica.analytics.blewrapper.internal.config.ScanFilterConfig;
import io.appmetrica.analytics.blewrapper.internal.config.ServiceData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes9.dex */
public final class g {
    public static ArrayList a(Set set) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ScanFilterConfig scanFilterConfig = (ScanFilterConfig) it.next();
            ScanFilter.Builder builder = new ScanFilter.Builder();
            String deviceAddress = scanFilterConfig.getDeviceAddress();
            boolean z4 = true;
            boolean z5 = false;
            if (deviceAddress == null || deviceAddress.length() == 0 || !BluetoothAdapter.checkBluetoothAddress(scanFilterConfig.getDeviceAddress().toUpperCase(Locale.US))) {
                z = true;
            } else {
                builder.setDeviceAddress(scanFilterConfig.getDeviceAddress());
                z = false;
            }
            String deviceName = scanFilterConfig.getDeviceName();
            if (deviceName != null && deviceName.length() != 0) {
                builder.setDeviceName(scanFilterConfig.getDeviceName());
                z = false;
            }
            if (scanFilterConfig.getManufacturerData() != null) {
                ManufacturerData manufacturerData = scanFilterConfig.getManufacturerData();
                if (manufacturerData.getManufacturerId() >= 0 && (manufacturerData.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String() != null || manufacturerData.getDataMask() == null)) {
                    byte[] bArr = manufacturerData.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String();
                    byte[] dataMask = manufacturerData.getDataMask();
                    if (bArr == null || dataMask == null || bArr.length == dataMask.length) {
                        builder.setManufacturerData(manufacturerData.getManufacturerId(), manufacturerData.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String(), manufacturerData.getDataMask());
                        z3 = true;
                        z2 = false;
                    }
                }
                z3 = false;
                z2 = false;
            } else {
                z2 = z;
                z3 = true;
            }
            if (scanFilterConfig.getServiceData() != null) {
                if (z3) {
                    ServiceData serviceData = scanFilterConfig.getServiceData();
                    if (serviceData.getUuid() != null && (serviceData.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String() != null || serviceData.getDataMask() == null)) {
                        byte[] bArr2 = serviceData.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String();
                        byte[] dataMask2 = serviceData.getDataMask();
                        if (bArr2 == null || dataMask2 == null || bArr2.length == dataMask2.length) {
                            builder.setServiceData(serviceData.getUuid(), serviceData.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String(), serviceData.getDataMask());
                            z3 = z4;
                            z2 = false;
                        }
                    }
                }
                z4 = false;
                z3 = z4;
                z2 = false;
            }
            if (scanFilterConfig.getServiceUuid() != null) {
                builder.setServiceUuid(scanFilterConfig.getServiceUuid().getUuid(), scanFilterConfig.getServiceUuid().getUuidMask());
            } else {
                z5 = z2;
            }
            ScanFilter build = (!z3 || z5) ? null : builder.build();
            if (build != null) {
                arrayList.add(build);
            }
        }
        return arrayList;
    }
}
