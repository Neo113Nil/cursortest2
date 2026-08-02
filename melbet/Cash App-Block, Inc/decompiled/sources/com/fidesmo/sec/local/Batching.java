package com.fidesmo.sec.local;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.fidesmo.sec.core.models.ClientInfo;
import com.fidesmo.sec.delivery.DeliverySecClient;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.fidesmo.sec.delivery.models.DeliveryUpdate;
import com.fidesmo.sec.delivery.models.ServiceDeliveryRequiredBuilder;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.local.Batching;
import com.fidesmo.sec.local.WebSocketResult;
import com.fidesmo.sec.local.models.ImplicitDeviceCinBatch;
import com.fidesmo.sec.utils.Hex;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJust;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMap;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017J0\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u001e"}, d2 = {"Lcom/fidesmo/sec/local/Batching;", "", "()V", "deliverService", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/fidesmo/sec/delivery/models/DeliveryUpdate;", "device", "Lcom/fidesmo/sec/devices/Device;", "appId", "", "serviceId", "cin", "", "deliveryClient", "Lcom/fidesmo/sec/delivery/DeliverySecClient;", "clientInfo", "Lcom/fidesmo/sec/core/models/ClientInfo;", "deliverWebsocketService", "Lcom/fidesmo/sec/local/Batching$BatchingResult;", "uri", "Ljava/net/URI;", "parseDeliveryUri", "Lcom/fidesmo/sec/local/Batching$AppAndServiceIds;", "parseDeliveryUri$sec_client_core_release", "run", "client", "batchingInfo", "Lcom/fidesmo/sec/local/models/ImplicitDeviceCinBatch;", "AppAndServiceIds", "BatchingResult", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Batching {
    public static final Batching INSTANCE = new Batching();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/fidesmo/sec/local/Batching$AppAndServiceIds;", "", "appId", "", "serviceId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getServiceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AppAndServiceIds {
        private final String appId;
        private final String serviceId;

        public AppAndServiceIds(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.appId = str;
            this.serviceId = str2;
        }

        public static /* synthetic */ AppAndServiceIds copy$default(AppAndServiceIds appAndServiceIds, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = appAndServiceIds.appId;
            }
            if ((i & 2) != 0) {
                str2 = appAndServiceIds.serviceId;
            }
            return appAndServiceIds.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getServiceId() {
            return this.serviceId;
        }

        public final AppAndServiceIds copy(String appId, String serviceId) {
            appId.getClass();
            serviceId.getClass();
            return new AppAndServiceIds(appId, serviceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppAndServiceIds)) {
                return false;
            }
            AppAndServiceIds appAndServiceIds = (AppAndServiceIds) other;
            return Intrinsics.areEqual(this.appId, appAndServiceIds.appId) && Intrinsics.areEqual(this.serviceId, appAndServiceIds.serviceId);
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getServiceId() {
            return this.serviceId;
        }

        public int hashCode() {
            return this.serviceId.hashCode() + (this.appId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AppAndServiceIds(appId=");
            sb.append(this.appId);
            sb.append(", serviceId=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.serviceId, ')');
        }
    }

    private Batching() {
    }

    private final Observable<DeliveryUpdate> deliverService(final Device device, String appId, String serviceId, byte[] cin, DeliverySecClient deliveryClient, ClientInfo clientInfo) {
        ObservableJust just = Observable.just(device);
        return new ObservableMap((deliveryClient != null ? new ServiceDeliveryClient(just, deliveryClient) : new ServiceDeliveryClient(just)).deliverUsingHandlers(new ServiceDeliveryRequiredBuilder(appId, serviceId, cin).setClientInfo(clientInfo).build()).map(new Function() { // from class: com.fidesmo.sec.local.Batching$deliverService$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final DeliveryUpdate mo39apply(DeliveryUpdate deliveryUpdate) {
                deliveryUpdate.getClass();
                if (deliveryUpdate instanceof DeliveryUpdate.Finished) {
                    Device.this.close();
                }
                return deliveryUpdate;
            }
        }), new Function() { // from class: com.fidesmo.sec.local.Batching$deliverService$2
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final DeliveryUpdate mo39apply(Throwable th) {
                th.getClass();
                Device.this.close();
                throw th;
            }
        }, 2);
    }

    public static /* synthetic */ Observable deliverService$default(Batching batching, Device device, String str, String str2, byte[] bArr, DeliverySecClient deliverySecClient, ClientInfo clientInfo, int i, Object obj) {
        if ((i & 16) != 0) {
            deliverySecClient = null;
        }
        return batching.deliverService(device, str, str2, bArr, deliverySecClient, clientInfo);
    }

    private final Observable<BatchingResult> deliverWebsocketService(Device device, URI uri) {
        WebSocketManager webSocketManager = new WebSocketManager();
        String uri2 = uri.toString();
        uri2.getClass();
        return WebSocketManager.initiateWebSocket$default(webSocketManager, device, uri2, null, 4, null).map(new Function() { // from class: com.fidesmo.sec.local.Batching$deliverWebsocketService$1
            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final Batching.BatchingResult mo39apply(WebSocketResult webSocketResult) {
                webSocketResult.getClass();
                if (webSocketResult instanceof WebSocketResult.Succeeded) {
                    return Batching.BatchingResult.Succeeded.INSTANCE;
                }
                if (!(webSocketResult instanceof WebSocketResult.Failed)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                WebSocketResult.Failed failed = (WebSocketResult.Failed) webSocketResult;
                Throwable error = failed.getError();
                if (error == null) {
                    error = new Throwable("Batching process failed with error code " + failed.getCode() + " and message " + failed.getMessage());
                }
                return new Batching.BatchingResult.Failed(error);
            }
        });
    }

    public static /* synthetic */ Observable run$default(Batching batching, Device device, DeliverySecClient deliverySecClient, ImplicitDeviceCinBatch implicitDeviceCinBatch, ClientInfo clientInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            deliverySecClient = null;
        }
        return batching.run(device, deliverySecClient, implicitDeviceCinBatch, clientInfo);
    }

    public final AppAndServiceIds parseDeliveryUri$sec_client_core_release(URI uri) {
        List split$default;
        uri.getClass();
        String path = uri.getPath();
        String path2 = uri.getPath();
        path2.getClass();
        split$default = StringsKt__StringsKt.split$default(path2, new String[]{"/"}, false, 0, 6, null);
        path.getClass();
        if (new Regex("/([A-Za-z0-9_-]+)/services/([A-Za-z0-9_-]+)").matches(path) && (Intrinsics.areEqual(uri.getHost(), "apps.fidesmo.com") || Intrinsics.areEqual(uri.getHost(), "apps-staging.fidesmo.com"))) {
            return new AppAndServiceIds((String) split$default.get(1), (String) split$default.get(3));
        }
        throw new MalformedURLException("The URL was not a fidesmo service URL");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r0.equals("wss") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        return deliverWebsocketService(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (r0.equals("ws") == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Observable<BatchingResult> run(Device device, DeliverySecClient client, ImplicitDeviceCinBatch batchingInfo, ClientInfo clientInfo) {
        Device device2;
        device.getClass();
        batchingInfo.getClass();
        clientInfo.getClass();
        String batchingUrl = batchingInfo.getBatchingUrl();
        if (batchingUrl == null || batchingUrl.length() == 0) {
            return Observable.just(BatchingResult.NoBatchingUrlProvided.INSTANCE);
        }
        try {
            URI uri = new URI(batchingUrl);
            String scheme = uri.getScheme();
            if (scheme != null) {
                int hashCode = scheme.hashCode();
                if (hashCode == 3804) {
                    device2 = device;
                } else if (hashCode == 118039) {
                    device2 = device;
                } else if (hashCode == 3213448 ? scheme.equals("http") : hashCode == 99617003 && scheme.equals("https")) {
                    try {
                        AppAndServiceIds parseDeliveryUri$sec_client_core_release = parseDeliveryUri$sec_client_core_release(uri);
                        if (batchingInfo.getCin() == null) {
                            return Observable.just(new BatchingResult.Failed(new IllegalArgumentException("Service delivery batching URL was sent with no CIN")));
                        }
                        byte[] decodeHex = Hex.decodeHex(batchingInfo.getCin());
                        String appId = parseDeliveryUri$sec_client_core_release.getAppId();
                        String serviceId = parseDeliveryUri$sec_client_core_release.getServiceId();
                        decodeHex.getClass();
                        Observable flatMap = deliverService(device, appId, serviceId, decodeHex, client, clientInfo).flatMap(new Function() { // from class: com.fidesmo.sec.local.Batching$run$1
                            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                            public final ObservableSource mo39apply(DeliveryUpdate deliveryUpdate) {
                                deliveryUpdate.getClass();
                                if (!(deliveryUpdate instanceof DeliveryUpdate.Finished)) {
                                    return ObservableEmpty.INSTANCE;
                                }
                                DeliveryUpdate.Finished finished = (DeliveryUpdate.Finished) deliveryUpdate;
                                if (Intrinsics.areEqual(finished.getStatus().getSuccess(), Boolean.TRUE)) {
                                    return Observable.just(Batching.BatchingResult.Succeeded.INSTANCE);
                                }
                                return Observable.just(new Batching.BatchingResult.Failed(new Exception("Delivery failed: " + finished.getStatus().getMessage())));
                            }
                        });
                        Function function = new Function() { // from class: com.fidesmo.sec.local.Batching$run$2
                            @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
                            public final Batching.BatchingResult mo39apply(Throwable th) {
                                th.getClass();
                                return new Batching.BatchingResult.Failed(th);
                            }
                        };
                        Objects.requireNonNull(function, "itemSupplier is null");
                        return new ObservableMap(flatMap, function, 2);
                    } catch (MalformedURLException e) {
                        return Observable.just(new BatchingResult.Failed(e));
                    }
                }
            }
            return Observable.just(new BatchingResult.Failed(new MalformedURLException("Protocol on batching url was not http(s) nor wss")));
        } catch (MalformedURLException e2) {
            return Observable.just(new BatchingResult.Failed(e2));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/fidesmo/sec/local/Batching$BatchingResult;", "", "()V", "Failed", "NoBatchingUrlProvided", "Succeeded", "Lcom/fidesmo/sec/local/Batching$BatchingResult$Failed;", "Lcom/fidesmo/sec/local/Batching$BatchingResult$NoBatchingUrlProvided;", "Lcom/fidesmo/sec/local/Batching$BatchingResult$Succeeded;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class BatchingResult {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/fidesmo/sec/local/Batching$BatchingResult$Failed;", "Lcom/fidesmo/sec/local/Batching$BatchingResult;", BreadcrumbHelper.Category.ERROR, "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Failed extends BatchingResult {
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Throwable th) {
                super(null);
                th.getClass();
                this.error = th;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = failed.error;
                }
                return failed.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final Failed copy(Throwable error) {
                error.getClass();
                return new Failed(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) other).error);
            }

            public final Throwable getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fidesmo/sec/local/Batching$BatchingResult$NoBatchingUrlProvided;", "Lcom/fidesmo/sec/local/Batching$BatchingResult;", "()V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NoBatchingUrlProvided extends BatchingResult {
            public static final NoBatchingUrlProvided INSTANCE = new NoBatchingUrlProvided();

            private NoBatchingUrlProvided() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/fidesmo/sec/local/Batching$BatchingResult$Succeeded;", "Lcom/fidesmo/sec/local/Batching$BatchingResult;", "()V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Succeeded extends BatchingResult {
            public static final Succeeded INSTANCE = new Succeeded();

            private Succeeded() {
                super(null);
            }
        }

        public /* synthetic */ BatchingResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BatchingResult() {
        }
    }
}
