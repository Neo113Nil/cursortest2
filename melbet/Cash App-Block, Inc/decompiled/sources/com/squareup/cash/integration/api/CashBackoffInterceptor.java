package com.squareup.cash.integration.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AndroidCashBackoffInterceptor;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.TrailersSource;
import okhttp3.internal.http.RealInterceptorChain;
import okio.Path$$ExternalSyntheticBUOutline0;
import retrofit2.Invocation;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CashBackoffInterceptor implements Interceptor {
    public static final long DEFAULT_EVENT_TIME_TO_LIVE;
    public final AndroidClock clock;
    public final FeatureFlagManager featureFlagManager;
    public final LinkedBlockingDeque networkEvents = new LinkedBlockingDeque();
    public final RealObservabilityManager observabilityManager;

    public final class NetworkEvent {
        public final long expiresAt;
        public final String invocationMethodName;
        public final Class invocationServiceClass;
        public final int originalResponseCode;

        public NetworkEvent(int i, long j, Class cls, String str) {
            str.getClass();
            this.originalResponseCode = i;
            this.expiresAt = j;
            this.invocationServiceClass = cls;
            this.invocationMethodName = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkEvent)) {
                return false;
            }
            NetworkEvent networkEvent = (NetworkEvent) obj;
            return this.originalResponseCode == networkEvent.originalResponseCode && Duration.m4166equalsimpl0(this.expiresAt, networkEvent.expiresAt) && this.invocationServiceClass.equals(networkEvent.invocationServiceClass) && Intrinsics.areEqual(this.invocationMethodName, networkEvent.invocationMethodName);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.originalResponseCode) * 31;
            Duration.Companion companion = Duration.Companion;
            return this.invocationMethodName.hashCode() + ((this.invocationServiceClass.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.expiresAt)) * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("NetworkEvent(originalResponseCode=", this.originalResponseCode, ", expiresAt=", Duration.m4177toStringimpl(this.expiresAt), ", invocationServiceClass=");
            m.append(this.invocationServiceClass);
            m.append(", invocationMethodName=");
            m.append(this.invocationMethodName);
            m.append(")");
            return m.toString();
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        DEFAULT_EVENT_TIME_TO_LIVE = DurationKt.toDuration(60, DurationUnit.SECONDS);
    }

    public CashBackoffInterceptor(AndroidClock androidClock, FeatureFlagManager featureFlagManager, RealObservabilityManager realObservabilityManager) {
        this.clock = androidClock;
        this.featureFlagManager = featureFlagManager;
        this.observabilityManager = realObservabilityManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01b5  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain;
        int i;
        AndroidClock androidClock;
        Class cls;
        NetworkEvent networkEvent;
        LinkedBlockingDeque linkedBlockingDeque;
        int i2;
        Response response;
        RealInterceptorChain realInterceptorChain2;
        Class cls2;
        int i3;
        long j;
        NetworkEvent networkEvent2;
        Integer intOrNull;
        if (!((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AndroidCashBackoffInterceptor.INSTANCE)).enabled()) {
            RealInterceptorChain realInterceptorChain3 = (RealInterceptorChain) chain;
            return realInterceptorChain3.proceed(realInterceptorChain3.request);
        }
        AndroidClock androidClock2 = this.clock;
        long elapsedRealtimeDuration = DimensionKt.elapsedRealtimeDuration(androidClock2);
        RealInterceptorChain realInterceptorChain4 = (RealInterceptorChain) chain;
        Request request = realInterceptorChain4.request;
        Invocation invocation = (Invocation) request.tag(Reflection.factory.getOrCreateKotlinClass(Invocation.class));
        LinkedBlockingDeque linkedBlockingDeque2 = this.networkEvents;
        if (invocation == null) {
            androidClock = androidClock2;
            realInterceptorChain = realInterceptorChain4;
            cls = Invocation.class;
            linkedBlockingDeque = linkedBlockingDeque2;
            i2 = 0;
            networkEvent = null;
            i = 600;
        } else {
            String name = invocation.method.getName();
            Class cls3 = invocation.service;
            Iterator it = linkedBlockingDeque2.iterator();
            it.getClass();
            int i4 = 0;
            int i5 = 0;
            NetworkEvent networkEvent3 = null;
            NetworkEvent networkEvent4 = null;
            while (it.hasNext()) {
                NetworkEvent networkEvent5 = (NetworkEvent) it.next();
                Class cls4 = networkEvent5.invocationServiceClass;
                int i6 = networkEvent5.originalResponseCode;
                if (cls4.equals(cls3) && Intrinsics.areEqual(networkEvent5.invocationMethodName, name)) {
                    realInterceptorChain2 = realInterceptorChain4;
                    cls2 = cls3;
                    if (Duration.m4164compareToLRDsOJo(networkEvent5.expiresAt, elapsedRealtimeDuration) > 0) {
                        if (i6 == 429 || i6 == 503) {
                            i4++;
                            cls3 = cls2;
                            networkEvent4 = networkEvent5;
                        } else if (i6 != 429 && i6 != 503 && 500 <= i6) {
                            if (i6 < 600) {
                                i5++;
                                cls3 = cls2;
                                networkEvent3 = networkEvent5;
                            }
                            cls3 = cls2;
                        }
                        realInterceptorChain4 = realInterceptorChain2;
                    }
                } else {
                    realInterceptorChain2 = realInterceptorChain4;
                    cls2 = cls3;
                }
                cls3 = cls2;
                realInterceptorChain4 = realInterceptorChain2;
            }
            realInterceptorChain = realInterceptorChain4;
            Class cls5 = cls3;
            i = 600;
            if (i4 >= 1 || i5 >= 3) {
                NetworkEvent networkEvent6 = networkEvent4 == null ? networkEvent3 : networkEvent4;
                networkEvent6.getClass();
                int i7 = networkEvent6.originalResponseCode;
                androidClock = androidClock2;
                this.observabilityManager.logEvent("cash_backoff_interceptor_backoff_response_created", MapsKt__MapsKt.mapOf(new Pair("invocation_method_name", name), new Pair("invocation_service_class", cls5.getSimpleName()), new Pair("request_url", request.url), new Pair("original_response_code", Integer.valueOf(i7)), new Pair("expires_at", new Duration(networkEvent6.expiresAt)), new Pair("backoff_count", Integer.valueOf(i4)), new Pair("degraded_count", Integer.valueOf(i5))));
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
                Headers.Builder builder = new Headers.Builder();
                cls = Invocation.class;
                Protocol protocol = Protocol.HTTP_1_1;
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$12 = ResponseBody.EMPTY;
                networkEvent = null;
                ResponseBody$Companion$asResponseBody$1 create = DurationKt.create("failed by " + Reflection.factory.getOrCreateKotlinClass(CashBackoffInterceptor.class), null);
                builder.add("Backoff-Reason", Recorder$$ExternalSyntheticOutline2.m(i4, i5, "observed ", " backoffs and ", " degraded events recently"));
                if (i7 < 0) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i7, "code < 0: "));
                    return null;
                }
                i = 600;
                linkedBlockingDeque = linkedBlockingDeque2;
                i2 = 0;
                response = new Response(request, protocol, "Backoff", i7, null, builder.build(), create, null, null, null, null, 0L, 0L, null, TrailersSource.EMPTY);
                if (response == null) {
                    Timber.Forest.d("Returning backoff response: " + response, new Object[i2]);
                    return response;
                }
                Response proceed = realInterceptorChain.proceed(request);
                long elapsedRealtimeDuration2 = DimensionKt.elapsedRealtimeDuration(androidClock);
                while (true) {
                    NetworkEvent networkEvent7 = (NetworkEvent) linkedBlockingDeque.peekFirst();
                    if (networkEvent7 != null && Duration.m4164compareToLRDsOJo(networkEvent7.expiresAt, elapsedRealtimeDuration2) <= 0) {
                        linkedBlockingDeque.removeFirstOccurrence(networkEvent7);
                    }
                }
                Invocation invocation2 = (Invocation) proceed.request.tag(Reflection.factory.getOrCreateKotlinClass(cls));
                if (invocation2 != null && 400 <= (i3 = proceed.code) && i3 < i) {
                    String str = proceed.headers.get("Retry-After");
                    if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                        j = DEFAULT_EVENT_TIME_TO_LIVE;
                    } else {
                        Duration.Companion companion = Duration.Companion;
                        j = DurationKt.toDuration(intOrNull.intValue(), DurationUnit.SECONDS);
                    }
                    long m4173plusLRDsOJo = Duration.m4173plusLRDsOJo(elapsedRealtimeDuration2, j);
                    int i8 = proceed.code;
                    String name2 = invocation2.method.getName();
                    name2.getClass();
                    networkEvent2 = new NetworkEvent(i8, m4173plusLRDsOJo, invocation2.service, name2);
                } else {
                    networkEvent2 = networkEvent;
                }
                if (networkEvent2 != null) {
                    linkedBlockingDeque.add(networkEvent2);
                }
                return proceed;
            }
            androidClock = androidClock2;
            cls = Invocation.class;
            linkedBlockingDeque = linkedBlockingDeque2;
            i2 = 0;
            networkEvent = null;
        }
        response = null;
        if (response == null) {
        }
    }
}
