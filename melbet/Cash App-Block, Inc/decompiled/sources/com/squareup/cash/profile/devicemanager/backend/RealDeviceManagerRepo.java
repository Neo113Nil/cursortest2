package com.squareup.cash.profile.devicemanager.backend;

import android.os.Build;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.cdf.trusteddevice.TrustedDeviceLoadDevicesFinished;
import com.squareup.cash.cdf.trusteddevice.TrustedDeviceLoadDevicesStarted;
import com.squareup.cash.cdf.trusteddevice.TrustedDeviceRemoveConfirmation;
import com.squareup.cash.devicegrip.service.DeviceGripAppApi;
import com.squareup.cash.devicegrip.service.GetDevicesRequest;
import com.squareup.cash.devicegrip.service.GetDevicesResponse;
import com.squareup.cash.devicegrip.service.RemoveDevicesRequest;
import com.squareup.cash.devicegrip.service.RemoveDevicesResponse;
import com.squareup.cash.devicegrip.service.UpdateDeviceDetailsRequest;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.profile.devicemanager.backend.DeviceDetailsUpdater$UpdateDeviceResult;
import com.squareup.cash.profile.devicemanager.backend.DeviceManagerRepo$DeleteDeviceResult;
import com.squareup.cash.profile.devicemanager.backend.DeviceManagerRepo$FetchDeviceResult;
import com.squareup.cash.profile.devicemanager.backend.DeviceManagerRepo$FetchDevicesResult;
import com.squareup.cash.profile.devicemanager.backend.LoggedInDevice;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.access.sync_values.DeviceInfo;
import com.squareup.protos.cash.devicegrip.api.DeviceSyncValue$DeviceType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.internal.Symbol;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealDeviceManagerRepo {
    public static final long CACHE_TTL_DURATION;
    public final RealDeviceManagerAnalytics analytics;
    public DeviceManagerRepo$FetchDevicesResult.DevicesLoaded cachedResult;
    public final AndroidClock clock;
    public final KeyValue deviceInfoHash;
    public final Symbol deviceInfoProvider;
    public Duration lastFetchTimestamp;
    public final DeviceGripAppApi service;

    static {
        Duration.Companion companion = Duration.Companion;
        CACHE_TTL_DURATION = DurationKt.toDuration(15, DurationUnit.MINUTES);
    }

    public RealDeviceManagerRepo(KeyValue keyValue, DeviceGripAppApi deviceGripAppApi, Symbol symbol, RealDeviceManagerAnalytics realDeviceManagerAnalytics, AndroidClock androidClock) {
        this.deviceInfoHash = keyValue;
        this.service = deviceGripAppApi;
        this.deviceInfoProvider = symbol;
        this.analytics = realDeviceManagerAnalytics;
        this.clock = androidClock;
    }

    public static DeviceManagerRepo$DeleteDeviceResult toResponse(ApiResult apiResult, List list) {
        if (apiResult instanceof ApiResult.Failure) {
            return new DeviceManagerRepo$DeleteDeviceResult.NetworkFailure((ApiResult.Failure) apiResult, list);
        }
        if (!(apiResult instanceof ApiResult.Success)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        RemoveDevicesResponse removeDevicesResponse = (RemoveDevicesResponse) ((ApiResult.Success) apiResult).response;
        List list2 = removeDevicesResponse.failed_hashed_app_tokens;
        if (list2.isEmpty()) {
            return new DeviceManagerRepo$DeleteDeviceResult.Successful(list);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!list2.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return new DeviceManagerRepo$DeleteDeviceResult.NotSuccessful(list2, arrayList, removeDevicesResponse.response_context, removeDevicesResponse.error_reason);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteDevice(String str, ContinuationImpl continuationImpl) {
        RealDeviceManagerRepo$deleteDevice$1 realDeviceManagerRepo$deleteDevice$1;
        int i;
        String str2;
        RealDeviceManagerRepo realDeviceManagerRepo;
        DeviceManagerRepo$DeleteDeviceResult response;
        if (continuationImpl instanceof RealDeviceManagerRepo$deleteDevice$1) {
            realDeviceManagerRepo$deleteDevice$1 = (RealDeviceManagerRepo$deleteDevice$1) continuationImpl;
            int i2 = realDeviceManagerRepo$deleteDevice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceManagerRepo$deleteDevice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDeviceManagerRepo$deleteDevice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceManagerRepo$deleteDevice$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RemoveDevicesRequest removeDevicesRequest = new RemoveDevicesRequest(CollectionsKt__CollectionsJVMKt.listOf(str));
                    realDeviceManagerRepo$deleteDevice$1.L$0 = str;
                    realDeviceManagerRepo$deleteDevice$1.L$1 = this;
                    realDeviceManagerRepo$deleteDevice$1.label = 1;
                    obj = this.service.removeDevices(removeDevicesRequest, realDeviceManagerRepo$deleteDevice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    realDeviceManagerRepo = this;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realDeviceManagerRepo = realDeviceManagerRepo$deleteDevice$1.L$1;
                    str2 = realDeviceManagerRepo$deleteDevice$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(str2);
                realDeviceManagerRepo.getClass();
                response = toResponse((ApiResult) obj, listOf);
                trackAnalytics(response);
                if (response instanceof DeviceManagerRepo$DeleteDeviceResult.Successful) {
                    this.cachedResult = null;
                    this.lastFetchTimestamp = null;
                }
                return response;
            }
        }
        realDeviceManagerRepo$deleteDevice$1 = new RealDeviceManagerRepo$deleteDevice$1(this, continuationImpl);
        Object obj2 = realDeviceManagerRepo$deleteDevice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceManagerRepo$deleteDevice$1.label;
        if (i != 0) {
        }
        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(str2);
        realDeviceManagerRepo.getClass();
        response = toResponse((ApiResult) obj2, listOf2);
        trackAnalytics(response);
        if (response instanceof DeviceManagerRepo$DeleteDeviceResult.Successful) {
        }
        return response;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0044, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[LOOP:0: B:23:0x0093->B:25:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteOtherDevices(ContinuationImpl continuationImpl) {
        RealDeviceManagerRepo$deleteOtherDevices$1 realDeviceManagerRepo$deleteOtherDevices$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        DeviceManagerRepo$FetchDevicesResult deviceManagerRepo$FetchDevicesResult;
        Iterable iterable;
        Iterator it;
        RealDeviceManagerRepo realDeviceManagerRepo;
        ArrayList arrayList;
        DeviceManagerRepo$DeleteDeviceResult response;
        if (continuationImpl instanceof RealDeviceManagerRepo$deleteOtherDevices$1) {
            realDeviceManagerRepo$deleteOtherDevices$1 = (RealDeviceManagerRepo$deleteOtherDevices$1) continuationImpl;
            int i2 = realDeviceManagerRepo$deleteOtherDevices$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceManagerRepo$deleteOtherDevices$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realDeviceManagerRepo$deleteOtherDevices$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceManagerRepo$deleteOtherDevices$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realDeviceManagerRepo$deleteOtherDevices$1.label = 1;
                    obj = getAllDevices(false, realDeviceManagerRepo$deleteOtherDevices$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        realDeviceManagerRepo = realDeviceManagerRepo$deleteOtherDevices$1.L$1;
                        arrayList = realDeviceManagerRepo$deleteOtherDevices$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        realDeviceManagerRepo.getClass();
                        response = toResponse((ApiResult) obj, arrayList);
                        trackAnalytics(response);
                        if (response instanceof DeviceManagerRepo$DeleteDeviceResult.Successful) {
                            this.cachedResult = null;
                            this.lastFetchTimestamp = null;
                        }
                        return response;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                deviceManagerRepo$FetchDevicesResult = (DeviceManagerRepo$FetchDevicesResult) obj;
                if (!Intrinsics.areEqual(deviceManagerRepo$FetchDevicesResult, DeviceManagerRepo$FetchDevicesResult.DevicesError.INSTANCE)) {
                    iterable = EmptyList.INSTANCE;
                } else {
                    if (!(deviceManagerRepo$FetchDevicesResult instanceof DeviceManagerRepo$FetchDevicesResult.DevicesLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List devices = ((DeviceManagerRepo$FetchDevicesResult.DevicesLoaded) deviceManagerRepo$FetchDevicesResult).getDevices();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : devices) {
                        if (!((LoggedInDevice) obj2).isThisDevice()) {
                            arrayList2.add(obj2);
                        }
                    }
                    iterable = arrayList2;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((LoggedInDevice) it.next()).getAppToken());
                }
                RemoveDevicesRequest removeDevicesRequest = new RemoveDevicesRequest(arrayList3);
                realDeviceManagerRepo$deleteOtherDevices$1.L$0 = arrayList3;
                realDeviceManagerRepo$deleteOtherDevices$1.L$1 = this;
                realDeviceManagerRepo$deleteOtherDevices$1.label = 2;
                obj = this.service.removeDevices(removeDevicesRequest, realDeviceManagerRepo$deleteOtherDevices$1);
                if (obj != coroutineSingletons) {
                    realDeviceManagerRepo = this;
                    arrayList = arrayList3;
                    realDeviceManagerRepo.getClass();
                    response = toResponse((ApiResult) obj, arrayList);
                    trackAnalytics(response);
                    if (response instanceof DeviceManagerRepo$DeleteDeviceResult.Successful) {
                    }
                    return response;
                }
                return coroutineSingletons;
            }
        }
        realDeviceManagerRepo$deleteOtherDevices$1 = new RealDeviceManagerRepo$deleteOtherDevices$1(this, continuationImpl);
        obj = realDeviceManagerRepo$deleteOtherDevices$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceManagerRepo$deleteOtherDevices$1.label;
        if (i != 0) {
        }
        deviceManagerRepo$FetchDevicesResult = (DeviceManagerRepo$FetchDevicesResult) obj;
        if (!Intrinsics.areEqual(deviceManagerRepo$FetchDevicesResult, DeviceManagerRepo$FetchDevicesResult.DevicesError.INSTANCE)) {
        }
        Iterable iterable22 = iterable;
        ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable22, 10));
        it = iterable22.iterator();
        while (it.hasNext()) {
        }
        RemoveDevicesRequest removeDevicesRequest2 = new RemoveDevicesRequest(arrayList32);
        realDeviceManagerRepo$deleteOtherDevices$1.L$0 = arrayList32;
        realDeviceManagerRepo$deleteOtherDevices$1.L$1 = this;
        realDeviceManagerRepo$deleteOtherDevices$1.label = 2;
        obj = this.service.removeDevices(removeDevicesRequest2, realDeviceManagerRepo$deleteOtherDevices$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAllDevices(boolean z, ContinuationImpl continuationImpl) {
        RealDeviceManagerRepo$getAllDevices$1 realDeviceManagerRepo$getAllDevices$1;
        int i;
        DeviceManagerRepo$FetchDevicesResult.DevicesLoaded devicesLoaded;
        boolean z2;
        Object obj;
        if (continuationImpl instanceof RealDeviceManagerRepo$getAllDevices$1) {
            realDeviceManagerRepo$getAllDevices$1 = (RealDeviceManagerRepo$getAllDevices$1) continuationImpl;
            int i2 = realDeviceManagerRepo$getAllDevices$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceManagerRepo$getAllDevices$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realDeviceManagerRepo$getAllDevices$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceManagerRepo$getAllDevices$1.label;
                AndroidClock androidClock = this.clock;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (!z) {
                        Duration duration = this.lastFetchTimestamp;
                        if (duration != null) {
                            if (Duration.m4164compareToLRDsOJo(Duration.m4172minusLRDsOJo(DimensionKt.elapsedRealtimeDuration(androidClock), duration.rawValue), CACHE_TTL_DURATION) < 0) {
                                devicesLoaded = this.cachedResult;
                                if (devicesLoaded != null) {
                                    return devicesLoaded;
                                }
                            }
                        }
                        devicesLoaded = null;
                        if (devicesLoaded != null) {
                        }
                    }
                    realDeviceManagerRepo$getAllDevices$1.label = 1;
                    obj2 = loadDevicesFromNetwork(z, realDeviceManagerRepo$getAllDevices$1);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                ApiResult apiResult = (ApiResult) obj2;
                z2 = apiResult instanceof ApiResult.Success;
                obj = DeviceManagerRepo$FetchDevicesResult.DevicesError.INSTANCE;
                if (!z2) {
                    List list = (List) ((ApiResult.Success) apiResult).response;
                    if (!list.isEmpty()) {
                        obj = new DeviceManagerRepo$FetchDevicesResult.DevicesLoaded(list);
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (obj instanceof DeviceManagerRepo$FetchDevicesResult.DevicesLoaded) {
                    this.cachedResult = (DeviceManagerRepo$FetchDevicesResult.DevicesLoaded) obj;
                    this.lastFetchTimestamp = new Duration(DimensionKt.elapsedRealtimeDuration(androidClock));
                }
                return obj;
            }
        }
        realDeviceManagerRepo$getAllDevices$1 = new RealDeviceManagerRepo$getAllDevices$1(this, continuationImpl);
        Object obj22 = realDeviceManagerRepo$getAllDevices$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceManagerRepo$getAllDevices$1.label;
        AndroidClock androidClock2 = this.clock;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj22;
        z2 = apiResult2 instanceof ApiResult.Success;
        obj = DeviceManagerRepo$FetchDevicesResult.DevicesError.INSTANCE;
        if (!z2) {
        }
        if (obj instanceof DeviceManagerRepo$FetchDevicesResult.DevicesLoaded) {
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDeviceById(String str, ContinuationImpl continuationImpl) {
        RealDeviceManagerRepo$getDeviceById$1 realDeviceManagerRepo$getDeviceById$1;
        int i;
        DeviceManagerRepo$FetchDevicesResult deviceManagerRepo$FetchDevicesResult;
        if (continuationImpl instanceof RealDeviceManagerRepo$getDeviceById$1) {
            realDeviceManagerRepo$getDeviceById$1 = (RealDeviceManagerRepo$getDeviceById$1) continuationImpl;
            int i2 = realDeviceManagerRepo$getDeviceById$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceManagerRepo$getDeviceById$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDeviceManagerRepo$getDeviceById$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceManagerRepo$getDeviceById$1.label;
                LoggedInDevice loggedInDevice = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realDeviceManagerRepo$getDeviceById$1.L$0 = str;
                    realDeviceManagerRepo$getDeviceById$1.label = 1;
                    obj = getAllDevices(false, realDeviceManagerRepo$getDeviceById$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realDeviceManagerRepo$getDeviceById$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                deviceManagerRepo$FetchDevicesResult = (DeviceManagerRepo$FetchDevicesResult) obj;
                if (!Intrinsics.areEqual(deviceManagerRepo$FetchDevicesResult, DeviceManagerRepo$FetchDevicesResult.DevicesError.INSTANCE)) {
                    if (!(deviceManagerRepo$FetchDevicesResult instanceof DeviceManagerRepo$FetchDevicesResult.DevicesLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Iterator it = ((DeviceManagerRepo$FetchDevicesResult.DevicesLoaded) deviceManagerRepo$FetchDevicesResult).getDevices().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((LoggedInDevice) next).getAppToken().equals(str)) {
                            loggedInDevice = next;
                            break;
                        }
                    }
                    loggedInDevice = loggedInDevice;
                }
                return loggedInDevice == null ? new DeviceManagerRepo$FetchDeviceResult.DeviceLoaded(loggedInDevice) : DeviceManagerRepo$FetchDeviceResult.DeviceError.INSTANCE;
            }
        }
        realDeviceManagerRepo$getDeviceById$1 = new RealDeviceManagerRepo$getDeviceById$1(this, continuationImpl);
        Object obj3 = realDeviceManagerRepo$getDeviceById$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceManagerRepo$getDeviceById$1.label;
        LoggedInDevice loggedInDevice2 = null;
        if (i != 0) {
        }
        deviceManagerRepo$FetchDevicesResult = (DeviceManagerRepo$FetchDevicesResult) obj3;
        if (!Intrinsics.areEqual(deviceManagerRepo$FetchDevicesResult, DeviceManagerRepo$FetchDevicesResult.DevicesError.INSTANCE)) {
        }
        if (loggedInDevice2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadDevicesFromNetwork(boolean z, ContinuationImpl continuationImpl) {
        RealDeviceManagerRepo$loadDevicesFromNetwork$1 realDeviceManagerRepo$loadDevicesFromNetwork$1;
        int i;
        Object obj;
        Long l;
        String str;
        LoggedInDevice.DeviceType deviceType;
        LoggedInDevice.Status status;
        String str2;
        String str3;
        Long l2;
        Long l3;
        DeviceInfo.Status status2;
        DeviceInfo.DeviceType deviceType2;
        String str4;
        Analytics analytics = this.analytics.analytics;
        if (continuationImpl instanceof RealDeviceManagerRepo$loadDevicesFromNetwork$1) {
            realDeviceManagerRepo$loadDevicesFromNetwork$1 = (RealDeviceManagerRepo$loadDevicesFromNetwork$1) continuationImpl;
            int i2 = realDeviceManagerRepo$loadDevicesFromNetwork$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceManagerRepo$loadDevicesFromNetwork$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realDeviceManagerRepo$loadDevicesFromNetwork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceManagerRepo$loadDevicesFromNetwork$1.label;
                int i3 = 1;
                String str5 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    analytics.track(new TrustedDeviceLoadDevicesStarted(z ? TrustedDeviceLoadDevicesStarted.Reason.REFRESH : TrustedDeviceLoadDevicesStarted.Reason.INITIAL_LOAD), null);
                    GetDevicesRequest getDevicesRequest = new GetDevicesRequest(ByteString.EMPTY);
                    realDeviceManagerRepo$loadDevicesFromNetwork$1.label = 1;
                    obj2 = this.service.getDevices(getDevicesRequest, realDeviceManagerRepo$loadDevicesFromNetwork$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                obj = (ApiResult) obj2;
                if (!(obj instanceof ApiResult.Success)) {
                    List<GetDevicesResponse.Device> list = ((GetDevicesResponse) ((ApiResult.Success) obj).response).devices;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (GetDevicesResponse.Device device : list) {
                        DeviceInfo deviceInfo = device.info;
                        String str6 = "";
                        if (deviceInfo == null || (str = deviceInfo.hashed_app_token) == null) {
                            str = "";
                        }
                        if (deviceInfo != null && (str4 = deviceInfo.device_name) != null) {
                            str6 = str4;
                        }
                        if (deviceInfo != null && (deviceType2 = deviceInfo.device_type) != null) {
                            switch (deviceType2.ordinal()) {
                                case 0:
                                    deviceType = LoggedInDevice.DeviceType.MAC;
                                    break;
                                case 1:
                                    deviceType = LoggedInDevice.DeviceType.WINDOWS;
                                    break;
                                case 2:
                                    deviceType = LoggedInDevice.DeviceType.ANDROID;
                                    break;
                                case 3:
                                    deviceType = LoggedInDevice.DeviceType.IPHONE;
                                    break;
                                case 4:
                                    deviceType = LoggedInDevice.DeviceType.IPAD;
                                    break;
                                case 5:
                                    deviceType = LoggedInDevice.DeviceType.IPOD_TOUCH;
                                    break;
                                case 6:
                                    deviceType = LoggedInDevice.DeviceType.OTHER;
                                    break;
                                default:
                                    deviceType = LoggedInDevice.DeviceType.BROWSER;
                                    break;
                            }
                        } else {
                            deviceType = LoggedInDevice.DeviceType.BROWSER;
                        }
                        if (deviceInfo == null || (status2 = deviceInfo.status) == null) {
                            status = LoggedInDevice.Status.LOGGED_OUT;
                        } else {
                            int ordinal = status2.ordinal();
                            status = ordinal != 0 ? ordinal != i3 ? ordinal != 2 ? LoggedInDevice.Status.LOGGED_OUT : LoggedInDevice.Status.LOGGED_OUT : LoggedInDevice.Status.LOGGED_OUT : LoggedInDevice.Status.LOGGED_IN;
                        }
                        LoggedInDevice.LastLogin lastLogin = new LoggedInDevice.LastLogin((deviceInfo == null || (l3 = deviceInfo.last_login_at) == null) ? this.clock.millis() : l3.longValue(), deviceInfo != null ? deviceInfo.last_login_location : str5, deviceInfo != null ? deviceInfo.last_login_location_image_url : null);
                        Boolean bool = device.is_current_device;
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        if (deviceInfo != null) {
                            String str7 = str;
                            str2 = str6;
                            str3 = str7;
                            l2 = deviceInfo.verified_at;
                        } else {
                            String str8 = str;
                            str2 = str6;
                            str3 = str8;
                            l2 = null;
                        }
                        arrayList.add(new LoggedInDevice(str3, str2, deviceType, status, lastLogin, booleanValue, l2));
                        i3 = 1;
                        str5 = null;
                    }
                    obj = new ApiResult.Success(CollectionsKt.sortedWith(arrayList, new LinkedHashTreeMap.AnonymousClass1(7)));
                } else if (!(obj instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (obj instanceof ApiResult.Success) {
                    l = null;
                } else {
                    TrustedDeviceLoadDevicesFinished.Status status3 = TrustedDeviceLoadDevicesFinished.Status.SUCCESSFUL;
                    l = null;
                    analytics.track(new TrustedDeviceLoadDevicesFinished(), null);
                }
                if (obj instanceof ApiResult.Failure) {
                    analytics.track(new TrustedDeviceLoadDevicesFinished(TrustedDeviceLoadDevicesFinished.Status.FAILED, ((ApiResult.Failure) obj).toString()), l);
                }
                return obj;
            }
        }
        realDeviceManagerRepo$loadDevicesFromNetwork$1 = new RealDeviceManagerRepo$loadDevicesFromNetwork$1(this, continuationImpl);
        Object obj22 = realDeviceManagerRepo$loadDevicesFromNetwork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceManagerRepo$loadDevicesFromNetwork$1.label;
        int i32 = 1;
        String str52 = null;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        if (!(obj instanceof ApiResult.Success)) {
        }
        if (obj instanceof ApiResult.Success) {
        }
        if (obj instanceof ApiResult.Failure) {
        }
        return obj;
    }

    public final void trackAnalytics(DeviceManagerRepo$DeleteDeviceResult deviceManagerRepo$DeleteDeviceResult) {
        int size;
        int i = 0;
        if (deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.Successful) {
            size = ((DeviceManagerRepo$DeleteDeviceResult.Successful) deviceManagerRepo$DeleteDeviceResult).getSuccessfulTokens().size();
        } else if (deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.NetworkFailure) {
            i = ((DeviceManagerRepo$DeleteDeviceResult.NetworkFailure) deviceManagerRepo$DeleteDeviceResult).getFailedTokens().size();
            size = 0;
        } else if (!(deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.NotSuccessful)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else {
            DeviceManagerRepo$DeleteDeviceResult.NotSuccessful notSuccessful = (DeviceManagerRepo$DeleteDeviceResult.NotSuccessful) deviceManagerRepo$DeleteDeviceResult;
            i = notSuccessful.getFailedTokens().size();
            size = ((ArrayList) notSuccessful.getSuccessfulTokens()).size();
        }
        this.analytics.analytics.track(new TrustedDeviceRemoveConfirmation(Integer.valueOf(size), Integer.valueOf(i)), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateDeviceDetails(ContinuationImpl continuationImpl) {
        RealDeviceManagerRepo$updateDeviceDetails$1 realDeviceManagerRepo$updateDeviceDetails$1;
        int i;
        String str;
        UpdateDeviceDetailsRequest updateDeviceDetailsRequest;
        String str2;
        Object obj;
        if (continuationImpl instanceof RealDeviceManagerRepo$updateDeviceDetails$1) {
            realDeviceManagerRepo$updateDeviceDetails$1 = (RealDeviceManagerRepo$updateDeviceDetails$1) continuationImpl;
            int i2 = realDeviceManagerRepo$updateDeviceDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceManagerRepo$updateDeviceDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realDeviceManagerRepo$updateDeviceDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceManagerRepo$updateDeviceDetails$1.label;
                KeyValue keyValue = this.deviceInfoHash;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    String str3 = this.deviceInfoProvider.symbol;
                    String str4 = Build.MANUFACTURER;
                    str4.getClass();
                    String str5 = Build.MODEL;
                    str5.getClass();
                    UpdateDeviceDetailsRequest updateDeviceDetailsRequest2 = new UpdateDeviceDetailsRequest(str3, DeviceSyncValue$DeviceType.ANDROID, str4 + " " + str5, ByteString.EMPTY);
                    String byteString = updateDeviceDetailsRequest2.encodeByteString().toString();
                    realDeviceManagerRepo$updateDeviceDetails$1.L$0 = updateDeviceDetailsRequest2;
                    realDeviceManagerRepo$updateDeviceDetails$1.L$1 = byteString;
                    realDeviceManagerRepo$updateDeviceDetails$1.label = 1;
                    Object obj3 = keyValue.get(realDeviceManagerRepo$updateDeviceDetails$1);
                    if (obj3 != coroutineSingletons) {
                        str = byteString;
                        obj2 = obj3;
                        updateDeviceDetailsRequest = updateDeviceDetailsRequest2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        DeviceDetailsUpdater$UpdateDeviceResult deviceDetailsUpdater$UpdateDeviceResult = (DeviceDetailsUpdater$UpdateDeviceResult) realDeviceManagerRepo$updateDeviceDetails$1.L$2;
                        SafeTrace.throwOnFailure(obj2);
                        return deviceDetailsUpdater$UpdateDeviceResult;
                    }
                    this = (RealDeviceManagerRepo) realDeviceManagerRepo$updateDeviceDetails$1.L$2;
                    str = realDeviceManagerRepo$updateDeviceDetails$1.L$1;
                    SafeTrace.throwOnFailure(obj2);
                    ApiResult apiResult = (ApiResult) obj2;
                    this.getClass();
                    if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                        obj = new DeviceDetailsUpdater$UpdateDeviceResult.NetworkFailure((ApiResult.Failure) apiResult);
                    } else if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                        obj = new DeviceDetailsUpdater$UpdateDeviceResult.NotSuccessful(String.valueOf(((ApiResult.Failure.HttpFailure) apiResult).code));
                    } else {
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        obj = DeviceDetailsUpdater$UpdateDeviceResult.Successful.INSTANCE;
                    }
                    if (obj instanceof DeviceDetailsUpdater$UpdateDeviceResult.Successful) {
                        str.getClass();
                        DeviceInfoHash deviceInfoHash = new DeviceInfoHash(str);
                        realDeviceManagerRepo$updateDeviceDetails$1.L$0 = null;
                        realDeviceManagerRepo$updateDeviceDetails$1.L$1 = null;
                        realDeviceManagerRepo$updateDeviceDetails$1.L$2 = obj;
                        realDeviceManagerRepo$updateDeviceDetails$1.label = 3;
                        if (keyValue.set(deviceInfoHash, realDeviceManagerRepo$updateDeviceDetails$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return obj;
                }
                str = realDeviceManagerRepo$updateDeviceDetails$1.L$1;
                updateDeviceDetailsRequest = realDeviceManagerRepo$updateDeviceDetails$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                DeviceInfoHash deviceInfoHash2 = (DeviceInfoHash) obj2;
                str2 = deviceInfoHash2 == null ? deviceInfoHash2.deviceInfoHash : null;
                if (str2 == null) {
                    str2 = null;
                }
                if (!Intrinsics.areEqual(str2, str)) {
                    return new DeviceDetailsUpdater$UpdateDeviceResult.NotSuccessful("Update not needed");
                }
                realDeviceManagerRepo$updateDeviceDetails$1.L$0 = null;
                realDeviceManagerRepo$updateDeviceDetails$1.L$1 = str;
                realDeviceManagerRepo$updateDeviceDetails$1.L$2 = this;
                realDeviceManagerRepo$updateDeviceDetails$1.label = 2;
                obj2 = this.service.updateDeviceDetails(updateDeviceDetailsRequest, realDeviceManagerRepo$updateDeviceDetails$1);
            }
        }
        realDeviceManagerRepo$updateDeviceDetails$1 = new RealDeviceManagerRepo$updateDeviceDetails$1(this, continuationImpl);
        Object obj22 = realDeviceManagerRepo$updateDeviceDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceManagerRepo$updateDeviceDetails$1.label;
        KeyValue keyValue2 = this.deviceInfoHash;
        if (i != 0) {
        }
        DeviceInfoHash deviceInfoHash22 = (DeviceInfoHash) obj22;
        if (deviceInfoHash22 == null) {
        }
        if (str2 == null) {
        }
        if (!Intrinsics.areEqual(str2, str)) {
        }
    }
}
