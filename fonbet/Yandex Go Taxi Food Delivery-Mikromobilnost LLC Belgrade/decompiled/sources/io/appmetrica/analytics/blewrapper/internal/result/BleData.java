package io.appmetrica.analytics.blewrapper.internal.result;

import android.os.ParcelUuid;
import android.util.SparseArray;
import defpackage.vfc;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000200\u0018\u00010/\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010>\u001a\n\u0012\u0004\u0012\u000200\u0018\u000109\u0012\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u000200\u0018\u00010/\u0012\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010C\u0012\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010C\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010.\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R%\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u00108\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b7\u0010(R\u001f\u0010>\u001a\n\u0012\u0004\u0012\u000200\u0018\u0001098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R%\u0010B\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u00104R\u001f\u0010H\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001f\u0010K\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010C8\u0006¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010GR\u0019\u0010N\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bL\u0010+\u001a\u0004\bM\u0010-¨\u0006Q"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/result/BleData;", "", "", "toString", "", "a", CA20Status.STATUS_USER_I, "getCallbackType", "()I", "callbackType", "b", "getAdvertisingSid", "advertisingSid", "c", "getDataStatus", "dataStatus", "d", "getPeriodicAdvertisingInterval", "periodicAdvertisingInterval", "e", "getPrimaryPhy", "primaryPhy", "f", "getRssi", "rssi", "g", "getSecondaryPhy", "secondaryPhy", "", "h", "J", "getTimestampNanos", "()J", "timestampNanos", CoreConstants.PushMessage.SERVICE_TYPE, "getTxPower", "txPower", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "address", "k", "Ljava/lang/Integer;", "getAdvertiseFlags", "()Ljava/lang/Integer;", "advertiseFlags", "", "", "l", "Ljava/util/Map;", "getAdvertisingDataMap", "()Ljava/util/Map;", "advertisingDataMap", "m", "getDeviceName", "deviceName", "Landroid/util/SparseArray;", "n", "Landroid/util/SparseArray;", "getManufacturerSpecificData", "()Landroid/util/SparseArray;", "manufacturerSpecificData", "Landroid/os/ParcelUuid;", "o", "getServiceData", "serviceData", "", "p", "Ljava/util/List;", "getServiceSolicitationUuids", "()Ljava/util/List;", "serviceSolicitationUuids", "q", "getServiceUuids", "serviceUuids", "r", "getTxPowerLevel", "txPowerLevel", "<init>", "(IIIIIIIJILjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Landroid/util/SparseArray;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BleData {

    /* renamed from: a, reason: from kotlin metadata */
    private final int callbackType;

    /* renamed from: b, reason: from kotlin metadata */
    private final int advertisingSid;

    /* renamed from: c, reason: from kotlin metadata */
    private final int dataStatus;

    /* renamed from: d, reason: from kotlin metadata */
    private final int periodicAdvertisingInterval;

    /* renamed from: e, reason: from kotlin metadata */
    private final int primaryPhy;

    /* renamed from: f, reason: from kotlin metadata */
    private final int rssi;

    /* renamed from: g, reason: from kotlin metadata */
    private final int secondaryPhy;

    /* renamed from: h, reason: from kotlin metadata */
    private final long timestampNanos;

    /* renamed from: i, reason: from kotlin metadata */
    private final int txPower;

    /* renamed from: j, reason: from kotlin metadata */
    private final String address;

    /* renamed from: k, reason: from kotlin metadata */
    private final Integer advertiseFlags;

    /* renamed from: l, reason: from kotlin metadata */
    private final Map advertisingDataMap;

    /* renamed from: m, reason: from kotlin metadata */
    private final String deviceName;

    /* renamed from: n, reason: from kotlin metadata */
    private final SparseArray manufacturerSpecificData;

    /* renamed from: o, reason: from kotlin metadata */
    private final Map serviceData;

    /* renamed from: p, reason: from kotlin metadata */
    private final List serviceSolicitationUuids;

    /* renamed from: q, reason: from kotlin metadata */
    private final List serviceUuids;

    /* renamed from: r, reason: from kotlin metadata */
    private final Integer txPowerLevel;

    public BleData(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, String str, Integer num, Map<Integer, byte[]> map, String str2, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map2, List<ParcelUuid> list, List<ParcelUuid> list2, Integer num2) {
        this.callbackType = i;
        this.advertisingSid = i2;
        this.dataStatus = i3;
        this.periodicAdvertisingInterval = i4;
        this.primaryPhy = i5;
        this.rssi = i6;
        this.secondaryPhy = i7;
        this.timestampNanos = j;
        this.txPower = i8;
        this.address = str;
        this.advertiseFlags = num;
        this.advertisingDataMap = map;
        this.deviceName = str2;
        this.manufacturerSpecificData = sparseArray;
        this.serviceData = map2;
        this.serviceSolicitationUuids = list;
        this.serviceUuids = list2;
        this.txPowerLevel = num2;
    }

    public final String getAddress() {
        return this.address;
    }

    public final Integer getAdvertiseFlags() {
        return this.advertiseFlags;
    }

    public final Map<Integer, byte[]> getAdvertisingDataMap() {
        return this.advertisingDataMap;
    }

    public final int getAdvertisingSid() {
        return this.advertisingSid;
    }

    public final int getCallbackType() {
        return this.callbackType;
    }

    public final int getDataStatus() {
        return this.dataStatus;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final SparseArray<byte[]> getManufacturerSpecificData() {
        return this.manufacturerSpecificData;
    }

    public final int getPeriodicAdvertisingInterval() {
        return this.periodicAdvertisingInterval;
    }

    public final int getPrimaryPhy() {
        return this.primaryPhy;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final int getSecondaryPhy() {
        return this.secondaryPhy;
    }

    public final Map<ParcelUuid, byte[]> getServiceData() {
        return this.serviceData;
    }

    public final List<ParcelUuid> getServiceSolicitationUuids() {
        return this.serviceSolicitationUuids;
    }

    public final List<ParcelUuid> getServiceUuids() {
        return this.serviceUuids;
    }

    public final long getTimestampNanos() {
        return this.timestampNanos;
    }

    public final int getTxPower() {
        return this.txPower;
    }

    public final Integer getTxPowerLevel() {
        return this.txPowerLevel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BleData(callbackType=");
        sb.append(this.callbackType);
        sb.append(", advertisingSid=");
        sb.append(this.advertisingSid);
        sb.append(", dataStatus=");
        sb.append(this.dataStatus);
        sb.append(", periodicAdvertisingInterval=");
        sb.append(this.periodicAdvertisingInterval);
        sb.append(", primaryPhy=");
        sb.append(this.primaryPhy);
        sb.append(", rssi=");
        sb.append(this.rssi);
        sb.append(", secondaryPhy=");
        sb.append(this.secondaryPhy);
        sb.append(", timestampNanos=");
        sb.append(this.timestampNanos);
        sb.append(", txPower=");
        sb.append(this.txPower);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", advertiseFlags=");
        sb.append(this.advertiseFlags);
        sb.append(", advertisingDataMap=");
        sb.append(this.advertisingDataMap);
        sb.append(", deviceName=");
        sb.append(this.deviceName);
        sb.append(", manufacturerSpecificData=");
        sb.append(this.manufacturerSpecificData);
        sb.append(", serviceData=");
        sb.append(this.serviceData);
        sb.append(", serviceSolicitationUuids=");
        sb.append(this.serviceSolicitationUuids);
        sb.append(", serviceUuids=");
        sb.append(this.serviceUuids);
        sb.append(", txPowerLevel=");
        return vfc.o(sb, this.txPowerLevel, ')');
    }
}
