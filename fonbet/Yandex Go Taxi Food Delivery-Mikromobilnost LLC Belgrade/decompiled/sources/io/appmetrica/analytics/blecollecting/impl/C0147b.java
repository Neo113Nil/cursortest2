package io.appmetrica.analytics.blecollecting.impl;

import android.os.ParcelUuid;
import android.util.SparseArray;
import defpackage.c6w;
import defpackage.tcc;
import defpackage.y6i0;
import io.appmetrica.analytics.blewrapper.internal.result.BleData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeOffsetProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0147b implements N {
    public final SystemTimeOffsetProvider a;

    public /* synthetic */ C0147b(SystemTimeOffsetProvider systemTimeOffsetProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SystemTimeOffsetProvider() : systemTimeOffsetProvider);
    }

    public final String a(BleData bleData, long j, long j2, long j3) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray;
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("callback_type", bleData.getCallbackType());
        jSONObject5.put("observed_scan_result_offset", this.a.elapsedRealtimeOffsetInSeconds(bleData.getTimestampNanos(), TimeUnit.NANOSECONDS));
        jSONObject5.put("advertisingSid", bleData.getAdvertisingSid());
        jSONObject5.put("dataStatus", bleData.getDataStatus());
        jSONObject5.put("periodicAdvertisingInterval", bleData.getPeriodicAdvertisingInterval());
        jSONObject5.put("primaryPhy", bleData.getPrimaryPhy());
        jSONObject5.put("rssi", bleData.getRssi());
        jSONObject5.put("secondaryPhy", bleData.getSecondaryPhy());
        jSONObject5.put("timestampNanos", bleData.getTimestampNanos());
        jSONObject5.put("txPower", bleData.getTxPower());
        jSONObject5.put("address", bleData.getAddress());
        jSONObject5.put("advertiseFlags", bleData.getAdvertiseFlags());
        Map<Integer, byte[]> advertisingDataMap = bleData.getAdvertisingDataMap();
        JSONArray jSONArray2 = null;
        if (advertisingDataMap != null) {
            jSONObject = new JSONObject();
            Iterator<T> it = advertisingDataMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jSONObject.put(entry.getKey().toString(), StringUtils.toHexString((byte[]) entry.getValue()));
            }
        } else {
            jSONObject = null;
        }
        jSONObject5.put("advertisingDataMap", jSONObject);
        jSONObject5.put("deviceName", bleData.getDeviceName());
        SparseArray<byte[]> manufacturerSpecificData = bleData.getManufacturerSpecificData();
        if (manufacturerSpecificData != null) {
            jSONObject2 = new JSONObject();
            c6w it2 = y6i0.n(0, manufacturerSpecificData.size()).iterator();
            while (it2.c) {
                int nextInt = it2.nextInt();
                jSONObject2.put(String.valueOf(manufacturerSpecificData.keyAt(nextInt)), StringUtils.toHexString(manufacturerSpecificData.valueAt(nextInt)));
            }
        } else {
            jSONObject2 = null;
        }
        jSONObject5.put("manufacturerSpecificData", jSONObject2);
        Map<ParcelUuid, byte[]> serviceData = bleData.getServiceData();
        if (serviceData != null) {
            jSONObject3 = new JSONObject();
            Iterator<T> it3 = serviceData.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                jSONObject3.put(entry2.getKey().toString(), StringUtils.toHexString((byte[]) entry2.getValue()));
            }
        } else {
            jSONObject3 = null;
        }
        jSONObject5.put("serviceData", jSONObject3);
        List<ParcelUuid> serviceSolicitationUuids = bleData.getServiceSolicitationUuids();
        if (serviceSolicitationUuids != null) {
            ArrayList arrayList = new ArrayList(tcc.n(serviceSolicitationUuids, 10));
            Iterator<T> it4 = serviceSolicitationUuids.iterator();
            while (it4.hasNext()) {
                arrayList.add(((ParcelUuid) it4.next()).toString());
            }
            jSONArray = new JSONArray((Collection) arrayList);
        } else {
            jSONArray = null;
        }
        jSONObject5.put("serviceSolicitationUuids", jSONArray);
        List<ParcelUuid> serviceUuids = bleData.getServiceUuids();
        if (serviceUuids != null) {
            ArrayList arrayList2 = new ArrayList(tcc.n(serviceUuids, 10));
            Iterator<T> it5 = serviceUuids.iterator();
            while (it5.hasNext()) {
                arrayList2.add(((ParcelUuid) it5.next()).toString());
            }
            jSONArray2 = new JSONArray((Collection) arrayList2);
        }
        jSONObject5.put("serviceUuids", jSONArray2);
        jSONObject5.put("txPowerLevel", bleData.getTxPowerLevel());
        jSONObject4.put("scanResult", jSONObject5);
        jSONObject4.put(ClidProvider.TIMESTAMP, j);
        jSONObject4.put("reportIndex", j2);
        jSONObject4.put("reporterReportIndex", j3);
        return jSONObject4.toString();
    }

    public C0147b(SystemTimeOffsetProvider systemTimeOffsetProvider) {
        this.a = systemTimeOffsetProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0147b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a(int i, long j, long j2, long j3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_code", i);
        jSONObject.put(ClidProvider.TIMESTAMP, j);
        jSONObject.put("reportIndex", j2);
        jSONObject.put("reporterReportIndex", j3);
        return jSONObject.toString();
    }
}
