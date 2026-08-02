package com.fidesmo.sec.local;

import android.net.Uri;
import android.util.Log;
import com.fidesmo.sec.core.AppStoreClient;
import com.fidesmo.sec.core.models.InstanceElement;
import com.fidesmo.sec.core.models.InstanceElementsResponse;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.local.DeviceInfoClient;
import com.fidesmo.sec.local.models.DeviceApp;
import com.fidesmo.sec.local.models.DeviceAppStatus;
import com.fidesmo.sec.local.models.DeviceDescription;
import com.fidesmo.sec.local.models.ImplicitDeviceCinBatch;
import com.fidesmo.sec.utils.Hex;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFilter;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleSingle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import retrofit2.adapter.rxjava3.CallEnqueueObservable;
import retrofit2.adapter.rxjava3.Result;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u0004J,\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00140\u00132\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010#\u001a\u00020$H\u0002J\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010#\u001a\u00020$J6\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020(2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\"J/\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\"2\b\b\u0002\u0010,\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010.J9\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00132\b\u00101\u001a\u0004\u0018\u00010\u00182\b\u00102\u001a\u0004\u0018\u00010\u00182\u0006\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u00103J/\u00104\u001a\b\u0012\u0004\u0012\u0002000\"2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020(2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00105J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010#\u001a\u00020$H\u0002J\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\"2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b7J\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b9R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/fidesmo/sec/local/Utils;", "", "()V", "BATCH_TLV_ID", "", "getCplcData", "", "kotlin.jvm.PlatformType", "getIsdCert", "selectIsd", "getSelectIsd$sec_client_core_release", "()[B", "selectPlatformApplet", "getSelectPlatformApplet$sec_client_core_release", "selectStorageApplet", "tagBatchIdV3", "tagCin", "tagCinV3", "checkAppStatus", "Lio/reactivex/rxjava3/core/Observable;", "", "Lcom/fidesmo/sec/local/models/DeviceApp;", "appListObservable", "cin", "", "appStoreClient", "Lcom/fidesmo/sec/core/AppStoreClient;", "customBatchingUrl", "batchingUrl", "newBatchId", "getAppInstanceElements", "Lcom/fidesmo/sec/core/models/InstanceElement;", "appId", "getCplc", "Lio/reactivex/rxjava3/core/Single;", "device", "Lcom/fidesmo/sec/devices/Device;", "getDeviceAppsFromDevice", "getDeviceAppsFromServer", "deviceInfoClient", "Lcom/fidesmo/sec/local/DeviceInfoClient;", "authHeader", "getDeviceDescription", "Lcom/fidesmo/sec/local/models/DeviceDescription;", "client", "batchId", "(Lcom/fidesmo/sec/local/DeviceInfoClient;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "getImplicitBatch", "Lcom/fidesmo/sec/local/models/ImplicitDeviceCinBatch;", "cplc", "cert", "(Ljava/lang/String;Ljava/lang/String;Lcom/fidesmo/sec/local/DeviceInfoClient;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Observable;", "getImplicitBatchingData", "(Lcom/fidesmo/sec/devices/Device;Lcom/fidesmo/sec/local/DeviceInfoClient;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/Single;", "getPv2Batch", "getPv2Batch$sec_client_core_release", "getPv2Cin", "getPv2Cin$sec_client_core_release", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Utils {
    private static final int BATCH_TLV_ID = 66;
    public static final int tagBatchIdV3 = 66;
    private static final int tagCin = 69;
    public static final int tagCinV3 = 69;
    public static final Utils INSTANCE = new Utils();
    private static final byte[] selectIsd = Hex.decodeHex("00A4040000");
    private static final byte[] getCplcData = Hex.decodeHex("00CA9F7F00");
    private static final byte[] getIsdCert = Hex.decodeHex("80CABF2106A6048302151800");
    private static final byte[] selectPlatformApplet = Hex.decodeHex("00A404000CA0000006170200090001010100");
    private static final byte[] selectStorageApplet = Hex.decodeHex("00A404000BA00000061702000200000200");

    private Utils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<List<InstanceElement>> getAppInstanceElements(String appId, String cin, AppStoreClient appStoreClient) {
        return AppStoreClient.DefaultImpls.getInstanceElements$default(appStoreClient, appId, cin, null, 4, null).map(new Function() { // from class: com.fidesmo.sec.local.Utils$getAppInstanceElements$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final List<InstanceElement> mo39apply(Result<InstanceElementsResponse> result) {
                InstanceElementsResponse instanceElementsResponse;
                List<InstanceElement> instanceElements;
                result.getClass();
                if (result.error != null) {
                    return EmptyList.INSTANCE;
                }
                Response response = result.response;
                return (response == null || (instanceElementsResponse = (InstanceElementsResponse) response.body) == null || (instanceElements = instanceElementsResponse.getInstanceElements()) == null) ? EmptyList.INSTANCE : instanceElements;
            }
        });
    }

    private final Single getCplc(final Device device) {
        return new ObservableSingleSingle(device.transceive(selectIsd).flatMap(new Function() { // from class: com.fidesmo.sec.local.Utils$getCplc$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final ObservableSource mo39apply(byte[] bArr) {
                byte[] bArr2;
                bArr.getClass();
                Device device2 = Device.this;
                bArr2 = Utils.getCplcData;
                return device2.transceive(bArr2);
            }
        }), 1);
    }

    public static /* synthetic */ Observable getDeviceAppsFromServer$default(Utils utils2, String str, DeviceInfoClient deviceInfoClient, Single single, int i, Object obj) {
        if ((i & 2) != 0) {
            deviceInfoClient = DeviceInfoClient.Companion.getClient$default(DeviceInfoClient.INSTANCE, null, null, null, null, 15, null);
        }
        if ((i & 4) != 0) {
            single = null;
        }
        return utils2.getDeviceAppsFromServer(str, deviceInfoClient, single);
    }

    public static /* synthetic */ Single getDeviceDescription$default(Utils utils2, DeviceInfoClient deviceInfoClient, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceInfoClient = DeviceInfoClient.Companion.getClient$default(DeviceInfoClient.INSTANCE, null, null, null, null, 15, null);
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return utils2.getDeviceDescription(deviceInfoClient, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<ImplicitDeviceCinBatch> getImplicitBatch(String cplc, String cert, DeviceInfoClient client, final Integer batchId) {
        return client.getImplicitBatch(cplc, cert).map(new Function() { // from class: com.fidesmo.sec.local.Utils$getImplicitBatch$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final ImplicitDeviceCinBatch mo39apply(ImplicitDeviceCinBatch implicitDeviceCinBatch) {
                implicitDeviceCinBatch.getClass();
                if (batchId != null) {
                    Log.d("DeviceUtils", "Implicit batching data was requested for a specific batch " + batchId);
                    String customBatchingUrl = Utils.INSTANCE.customBatchingUrl(implicitDeviceCinBatch.getBatchingUrl(), batchId.intValue());
                    if (customBatchingUrl != null) {
                        return new ImplicitDeviceCinBatch(implicitDeviceCinBatch.getCin(), batchId.intValue(), customBatchingUrl);
                    }
                    Log.d("DeviceUtils", "Batching url could not be customized. Returning default data");
                }
                return implicitDeviceCinBatch;
            }
        });
    }

    public static /* synthetic */ Single getImplicitBatchingData$default(Utils utils2, Device device, DeviceInfoClient deviceInfoClient, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            deviceInfoClient = DeviceInfoClient.Companion.getClient$default(DeviceInfoClient.INSTANCE, null, null, null, null, 15, null);
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return utils2.getImplicitBatchingData(device, deviceInfoClient, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single getIsdCert(final Device device) {
        return new ObservableSingleSingle(device.transceive(selectIsd).flatMap(new Function() { // from class: com.fidesmo.sec.local.Utils$getIsdCert$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final ObservableSource mo39apply(byte[] bArr) {
                byte[] bArr2;
                bArr.getClass();
                Device device2 = Device.this;
                bArr2 = Utils.getIsdCert;
                return device2.transceive(bArr2);
            }
        }), 1);
    }

    public final Observable<List<DeviceApp>> checkAppStatus(Observable<List<DeviceApp>> appListObservable, final String cin, final AppStoreClient appStoreClient) {
        appListObservable.getClass();
        cin.getClass();
        appStoreClient.getClass();
        final String[] strArr = {"f374c57e", "af1cc990", "c1df74d2"};
        return appListObservable.flatMap(new Function() { // from class: com.fidesmo.sec.local.Utils$checkAppStatus$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final ObservableSource mo39apply(List<DeviceApp> list) {
                list.getClass();
                List<DeviceApp> list2 = list;
                String[] strArr2 = strArr;
                String str = cin;
                AppStoreClient appStoreClient2 = appStoreClient;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (DeviceApp deviceApp : list2) {
                    arrayList.add((ArraysKt___ArraysKt.contains(strArr2, deviceApp.getAppId()) && deviceApp.getStatus() == DeviceAppStatus.Installing) ? Utils.INSTANCE.getAppInstanceElements(deviceApp.getAppId(), str, appStoreClient2) : Observable.just(EmptyList.INSTANCE));
                }
                ArrayList zip = CollectionsKt.zip(list2, arrayList);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(zip, 10));
                Iterator it = zip.iterator();
                while (it.hasNext()) {
                    final Pair pair = (Pair) it.next();
                    arrayList2.add(((Observable) pair.second).map(new Function() { // from class: com.fidesmo.sec.local.Utils$checkAppStatus$1$updatedApps$1$1
                        @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                        /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                        public final DeviceApp mo39apply(List<InstanceElement> list3) {
                            list3.getClass();
                            boolean isEmpty = list3.isEmpty();
                            Pair<DeviceApp, Observable<List<InstanceElement>>> pair2 = pair;
                            return isEmpty ? (DeviceApp) pair2.first : DeviceApp.copy$default((DeviceApp) pair2.first, null, DeviceAppStatus.Installed, 1, null);
                        }
                    }));
                }
                Observable flatMap = new CallEnqueueObservable(arrayList2, 3).flatMap(Functions.IDENTITY);
                Functions.verifyPositive(16, "capacityHint");
                return new ObservableFilter(flatMap, new Functions.ArrayListCapacityCallable(), 3);
            }
        });
    }

    public final String customBatchingUrl(String batchingUrl, int newBatchId) {
        if (batchingUrl == null) {
            Log.d("DeviceUtils", "The implicit batching url could not be customized because it was null");
            return null;
        }
        Uri parse = Uri.parse(batchingUrl);
        Uri.Builder clearQuery = Uri.parse(batchingUrl).buildUpon().clearQuery();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        queryParameterNames.getClass();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!Intrinsics.areEqual((String) obj, "batchId")) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            List<String> queryParameters = parse.getQueryParameters(str);
            queryParameters.getClass();
            Iterator<T> it = queryParameters.iterator();
            while (it.hasNext()) {
                clearQuery.appendQueryParameter(str, (String) it.next());
            }
        }
        return clearQuery.appendQueryParameter("batchId", String.valueOf(newBatchId)).build().toString();
    }

    public final Observable<List<DeviceApp>> getDeviceAppsFromDevice(Device device) {
        device.getClass();
        return ApduUtils.enumerateApplets(device, "A00000061701").map(new Function() { // from class: com.fidesmo.sec.local.Utils$getDeviceAppsFromDevice$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final List<DeviceApp> mo39apply(List<byte[]> list) {
                list.getClass();
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(new DeviceApp(ApduUtils.readCardletEntry(list.get(i)).getAppId(), DeviceAppStatus.Installed));
                }
                return arrayList;
            }
        });
    }

    public final Observable<List<DeviceApp>> getDeviceAppsFromServer(final String cin, final DeviceInfoClient deviceInfoClient, Single authHeader) {
        cin.getClass();
        deviceInfoClient.getClass();
        Observable singleFlatMapObservable = authHeader != null ? new SingleFlatMapObservable(authHeader, new Function() { // from class: com.fidesmo.sec.local.Utils$getDeviceAppsFromServer$installedAppsRequest$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final ObservableSource mo39apply(String str) {
                str.getClass();
                return DeviceInfoClient.this.getInstalledApps(cin, str);
            }
        }, 0) : null;
        if (singleFlatMapObservable == null) {
            singleFlatMapObservable = DeviceInfoClient.DefaultImpls.getInstalledApps$default(deviceInfoClient, cin, null, 2, null);
        }
        return singleFlatMapObservable.map(new Function() { // from class: com.fidesmo.sec.local.Utils$getDeviceAppsFromServer$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final List<DeviceApp> mo39apply(InstalledAppsResponse installedAppsResponse) {
                installedAppsResponse.getClass();
                return installedAppsResponse.getApps();
            }
        });
    }

    public final Single getDeviceDescription(DeviceInfoClient client, String cin, Integer batchId) {
        client.getClass();
        cin.getClass();
        return new ObservableSingleSingle(client.getDeviceDescription(cin, batchId).map(new Function() { // from class: com.fidesmo.sec.local.Utils$getDeviceDescription$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final DeviceDescription mo39apply(DeviceDescriptionResponse deviceDescriptionResponse) {
                deviceDescriptionResponse.getClass();
                return DeviceDescriptionResponseKt.toDeviceDescription(deviceDescriptionResponse);
            }
        }), 1);
    }

    public final Single getImplicitBatchingData(final Device device, final DeviceInfoClient client, final Integer batchId) {
        device.getClass();
        client.getClass();
        Single cplc = getCplc(device);
        Function function = new Function() { // from class: com.fidesmo.sec.local.Utils$getImplicitBatchingData$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final ObservableSource mo39apply(byte[] bArr) {
                Observable implicitBatch;
                bArr.getClass();
                if (ApduUtils.succesfulStatus(Hex.encodeHex(bArr)).booleanValue()) {
                    implicitBatch = Utils.INSTANCE.getImplicitBatch(Hex.encodeHex(bArr), null, DeviceInfoClient.this, batchId);
                    return implicitBatch;
                }
                return Observable.error(new Exception("Invalid get CPLC Response: " + Hex.encodeHex(bArr)));
            }
        };
        cplc.getClass();
        SingleFlatMapObservable singleFlatMapObservable = new SingleFlatMapObservable(cplc, function, 0);
        Function function2 = new Function() { // from class: com.fidesmo.sec.local.Utils$getImplicitBatchingData$2
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final ObservableSource mo39apply(Throwable th) {
                Single isdCert;
                th.getClass();
                isdCert = Utils.INSTANCE.getIsdCert(Device.this);
                final DeviceInfoClient deviceInfoClient = client;
                final Integer num = batchId;
                Function function3 = new Function() { // from class: com.fidesmo.sec.local.Utils$getImplicitBatchingData$2.1
                    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                    /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final ObservableSource mo39apply(byte[] bArr) {
                        Observable implicitBatch;
                        bArr.getClass();
                        if (ApduUtils.succesfulStatus(Hex.encodeHex(bArr)).booleanValue()) {
                            implicitBatch = Utils.INSTANCE.getImplicitBatch(null, Hex.encodeHex(bArr), DeviceInfoClient.this, num);
                            return implicitBatch;
                        }
                        return Observable.error(new Exception("Invalid get ISD Cert Response: " + Hex.encodeHex(bArr)));
                    }
                };
                isdCert.getClass();
                return new SingleFlatMapObservable(isdCert, function3, 0);
            }
        };
        int i = 1;
        return new ObservableSingleSingle(new ObservableMap(singleFlatMapObservable, function2, i), i);
    }

    public final Single getPv2Batch$sec_client_core_release(Device device) {
        device.getClass();
        return new ObservableSingleSingle(ApduUtils.transceive(device, selectStorageApplet, "Select batch AID", new int[]{36864}).map(new Function() { // from class: com.fidesmo.sec.local.Utils$getPv2Batch$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final Integer mo39apply(byte[] bArr) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                while (ApduUtils.getTlvTag(wrap) != 66) {
                    ApduUtils.getTlvData(wrap);
                }
                byte[] tlvData = ApduUtils.getTlvData(wrap);
                return Integer.valueOf((int) ApduUtils.parseLong(tlvData, tlvData.length));
            }
        }), 1);
    }

    public final Single getPv2Cin$sec_client_core_release(Device device) {
        device.getClass();
        Observable<byte[]> transceiveGetData = ApduUtils.transceiveGetData(device, 69, "Query device image number");
        transceiveGetData.getClass();
        return new ObservableSingleSingle(transceiveGetData, 1);
    }

    public final byte[] getSelectIsd$sec_client_core_release() {
        return selectIsd;
    }

    public final byte[] getSelectPlatformApplet$sec_client_core_release() {
        return selectPlatformApplet;
    }
}
