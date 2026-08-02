package com.fidesmo.sec.local;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.core.AppStoreClient;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.local.DeviceInfoClient;
import com.fidesmo.sec.local.models.Capabilities;
import com.fidesmo.sec.local.models.DeviceApp;
import com.fidesmo.sec.local.models.DeviceCinBatch;
import com.fidesmo.sec.local.models.DeviceDescription;
import com.fidesmo.sec.local.models.ImplicitDeviceCinBatch;
import com.fidesmo.sec.utils.Hex;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.rxjava3.internal.operators.single.SingleMap;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001aD\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t*\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0001\u001a\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0015"}, d2 = {"getCinAndBatch", "Lio/reactivex/rxjava3/core/Single;", "Lcom/fidesmo/sec/local/models/DeviceCinBatch;", "Lcom/fidesmo/sec/devices/Device;", "client", "Lcom/fidesmo/sec/local/DeviceInfoClient;", "getDescription", "Lcom/fidesmo/sec/local/models/DeviceDescription;", "getDeviceApps", "Lio/reactivex/rxjava3/core/Observable;", "", "Lcom/fidesmo/sec/local/models/DeviceApp;", "description", "deviceInfoClient", "appStoreClient", "Lcom/fidesmo/sec/core/AppStoreClient;", "authHeader", "", "getOfflineCinAndBatch", "getPv2CinBatch", "getPv3CinBatch", "sec-client-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceUtilsKt {
    public static final Single getCinAndBatch(final Device device, final DeviceInfoClient deviceInfoClient) {
        device.getClass();
        deviceInfoClient.getClass();
        Single offlineCinAndBatch = getOfflineCinAndBatch(device);
        Function function = new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getCinAndBatch$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final SingleSource mo39apply(final Throwable th) {
                th.getClass();
                Single implicitBatchingData$default = Utils.getImplicitBatchingData$default(Utils.INSTANCE, Device.this, deviceInfoClient, null, 4, null);
                Function function2 = new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getCinAndBatch$1.1
                    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final DeviceCinBatch mo39apply(ImplicitDeviceCinBatch implicitDeviceCinBatch) {
                        implicitDeviceCinBatch.getClass();
                        if (implicitDeviceCinBatch.getCin() == null) {
                            throw th;
                        }
                        byte[] decodeHex = Hex.decodeHex(implicitDeviceCinBatch.getCin());
                        decodeHex.getClass();
                        return new DeviceCinBatch(decodeHex, implicitDeviceCinBatch.getBatchId());
                    }
                };
                implicitBatchingData$default.getClass();
                return new SingleMap(implicitBatchingData$default, function2, 0);
            }
        };
        offlineCinAndBatch.getClass();
        return new SingleMap(offlineCinAndBatch, function, 2);
    }

    public static /* synthetic */ Single getCinAndBatch$default(Device device, DeviceInfoClient deviceInfoClient, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceInfoClient = DeviceInfoClient.Companion.getClient$default(DeviceInfoClient.INSTANCE, null, null, null, null, 15, null);
        }
        return getCinAndBatch(device, deviceInfoClient);
    }

    public static final Single getDescription(Device device, final DeviceInfoClient deviceInfoClient) {
        device.getClass();
        deviceInfoClient.getClass();
        Single cinAndBatch = getCinAndBatch(device, deviceInfoClient);
        Function function = new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getDescription$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final SingleSource mo39apply(DeviceCinBatch deviceCinBatch) {
                deviceCinBatch.getClass();
                DeviceInfoClient deviceInfoClient2 = DeviceInfoClient.this;
                String encodeHex = Hex.encodeHex(deviceCinBatch.getCin());
                encodeHex.getClass();
                return new ObservableSingleSingle(deviceInfoClient2.getDeviceDescription(encodeHex, Integer.valueOf(deviceCinBatch.getBatchId())).map(new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getDescription$1.1
                    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final DeviceDescription mo39apply(DeviceDescriptionResponse deviceDescriptionResponse) {
                        deviceDescriptionResponse.getClass();
                        return DeviceDescriptionResponseKt.toDeviceDescription(deviceDescriptionResponse);
                    }
                }), 1);
            }
        };
        cinAndBatch.getClass();
        return new SingleMap(cinAndBatch, function, 1);
    }

    public static /* synthetic */ Single getDescription$default(Device device, DeviceInfoClient deviceInfoClient, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceInfoClient = DeviceInfoClient.Companion.getClient$default(DeviceInfoClient.INSTANCE, null, null, null, null, 15, null);
        }
        return getDescription(device, deviceInfoClient);
    }

    public static final Observable<List<DeviceApp>> getDeviceApps(Device device, DeviceDescription deviceDescription, DeviceInfoClient deviceInfoClient, AppStoreClient appStoreClient, Single single) {
        device.getClass();
        deviceDescription.getClass();
        deviceInfoClient.getClass();
        appStoreClient.getClass();
        Capabilities capabilities = deviceDescription.getCapabilities();
        long platformVersion = capabilities != null ? capabilities.getPlatformVersion() : 0L;
        String cin = deviceDescription.getCin();
        if (cin == null) {
            a$$ExternalSyntheticBUOutline0.m$3("The device description needs to contain the device's CIN");
            return null;
        }
        if (platformVersion < 3) {
            return Utils.INSTANCE.getDeviceAppsFromDevice(device);
        }
        Utils utils2 = Utils.INSTANCE;
        return utils2.checkAppStatus(utils2.getDeviceAppsFromServer(cin, deviceInfoClient, single), cin, appStoreClient);
    }

    public static /* synthetic */ Observable getDeviceApps$default(Device device, DeviceDescription deviceDescription, DeviceInfoClient deviceInfoClient, AppStoreClient appStoreClient, Single single, int i, Object obj) {
        if ((i & 2) != 0) {
            deviceInfoClient = DeviceInfoClient.Companion.getClient$default(DeviceInfoClient.INSTANCE, null, null, null, null, 15, null);
        }
        if ((i & 4) != 0) {
            appStoreClient = AppStoreClient.Companion.getClient$default(AppStoreClient.INSTANCE, null, null, null, null, 15, null);
        }
        if ((i & 8) != 0) {
            single = null;
        }
        return getDeviceApps(device, deviceDescription, deviceInfoClient, appStoreClient, single);
    }

    public static final Single getOfflineCinAndBatch(final Device device) {
        device.getClass();
        Single pv2CinBatch = getPv2CinBatch(device);
        Function function = new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getOfflineCinAndBatch$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final SingleSource mo39apply(Throwable th) {
                th.getClass();
                return DeviceUtilsKt.getPv3CinBatch(Device.this);
            }
        };
        pv2CinBatch.getClass();
        return new SingleMap(pv2CinBatch, function, 2);
    }

    public static final Single getPv2CinBatch(final Device device) {
        device.getClass();
        Single pv2Batch$sec_client_core_release = Utils.INSTANCE.getPv2Batch$sec_client_core_release(device);
        Function function = new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getPv2CinBatch$1
            public final SingleSource apply(final int i) {
                return new ObservableSingleSingle(ApduUtils.transceive(Device.this, Utils.INSTANCE.getSelectIsd$sec_client_core_release(), "Select isd", new int[]{36864}).map(new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getPv2CinBatch$1.1
                    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final Integer mo39apply(byte[] bArr) {
                        bArr.getClass();
                        return Integer.valueOf(i);
                    }
                }), 1);
            }

            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply */
            public /* bridge */ /* synthetic */ Object mo39apply(Object obj) {
                return apply(((Number) obj).intValue());
            }
        };
        pv2Batch$sec_client_core_release.getClass();
        int i = 1;
        return new SingleMap(new SingleMap(pv2Batch$sec_client_core_release, function, i), new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getPv2CinBatch$2
            public final SingleSource apply(final int i2) {
                Single pv2Cin$sec_client_core_release = Utils.INSTANCE.getPv2Cin$sec_client_core_release(Device.this);
                Function function2 = new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getPv2CinBatch$2.1
                    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final DeviceCinBatch mo39apply(byte[] bArr) {
                        bArr.getClass();
                        return new DeviceCinBatch(bArr, i2);
                    }
                };
                pv2Cin$sec_client_core_release.getClass();
                return new SingleMap(pv2Cin$sec_client_core_release, function2, 0);
            }

            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply */
            public /* bridge */ /* synthetic */ Object mo39apply(Object obj) {
                return apply(((Number) obj).intValue());
            }
        }, i);
    }

    public static final Single getPv3CinBatch(Device device) {
        device.getClass();
        Observable<byte[]> transceive = ApduUtils.transceive(device, Utils.INSTANCE.getSelectPlatformApplet$sec_client_core_release(), "Query platform applet", new int[]{36864});
        transceive.getClass();
        ObservableSingleSingle observableSingleSingle = new ObservableSingleSingle(transceive, 1);
        Function function = new Function() { // from class: com.fidesmo.sec.local.DeviceUtilsKt$getPv3CinBatch$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final DeviceCinBatch mo39apply(byte[] bArr) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte[] bArr2 = null;
                Integer num = null;
                while (wrap.remaining() > 2) {
                    int tlvTag = ApduUtils.getTlvTag(wrap);
                    byte[] tlvData = ApduUtils.getTlvData(wrap);
                    if (tlvTag == 66) {
                        num = Integer.valueOf((int) ApduUtils.parseLong(tlvData, tlvData.length));
                    } else if (tlvTag == 69) {
                        bArr2 = tlvData;
                    }
                }
                bArr2.getClass();
                num.getClass();
                return new DeviceCinBatch(bArr2, num.intValue());
            }
        };
        Objects.requireNonNull(function, "mapper is null");
        return new SingleMap(observableSingleSingle, function, 0);
    }
}
