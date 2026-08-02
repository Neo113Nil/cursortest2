package com.fidesmo.sec.delivery;

import com.fidesmo.sec.core.models.FidesmoBaseUrlKt;
import com.fidesmo.sec.delivery.models.ServiceDeliveryRequired;
import com.fidesmo.sec.utils.HexTypeAdapter;
import com.fidesmo.sec.utils.LanguageSelectionInterceptor;
import com.fidesmo.sec.utils.UserAgentInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\bH'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00112\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u0013"}, d2 = {"Lcom/fidesmo/sec/delivery/DeliverySecClient;", "", "connector", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/fidesmo/sec/delivery/SecResponse;", "request", "Lcom/fidesmo/sec/delivery/SecRequest;", "requestId", "", "serviceDeliver", "Lcom/fidesmo/sec/delivery/ServiceDeliveryResponse;", "Lcom/fidesmo/sec/delivery/models/ServiceDeliveryRequired;", "authorization", "serviceError", "Lcom/fidesmo/sec/delivery/ServiceErrorRequest;", "serviceFetch", "Lcom/fidesmo/sec/delivery/FetchOperationResponse;", "Lcom/fidesmo/sec/delivery/FetchOperationRequest;", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DeliverySecClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @POST("v3/connector/json")
    Observable<SecResponse> connector(@Body SecRequest request, @Header("X-Client-Request-Id") String requestId);

    @POST("v3/service/deliver")
    Observable<ServiceDeliveryResponse> serviceDeliver(@Body ServiceDeliveryRequired request, @Header("X-Client-Request-Id") String requestId);

    @POST("v3/service/deliver")
    Observable<ServiceDeliveryResponse> serviceDeliver(@Body ServiceDeliveryRequired request, @Header("X-Client-Request-Id") String requestId, @Header("Authorization") String authorization);

    @POST("v3/service/error")
    Observable<SecResponse> serviceError(@Body ServiceErrorRequest request, @Header("X-Client-Request-Id") String requestId);

    @POST("v3/service/fetch")
    Observable<FetchOperationResponse> serviceFetch(@Body FetchOperationRequest request, @Header("X-Client-Request-Id") String requestId);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/fidesmo/sec/delivery/DeliverySecClient$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "readTimeout", "", "getClient", "Lcom/fidesmo/sec/delivery/DeliverySecClient;", "locale", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "baseUrl", "getOkHttpClient", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Gson gson;
        private static final long readTimeout = 150;

        static {
            Gson create = new GsonBuilder().registerTypeAdapter(byte[].class, new HexTypeAdapter()).create();
            create.getClass();
            gson = create;
        }

        private Companion() {
        }

        public static /* synthetic */ DeliverySecClient getClient$default(Companion companion, String str, OkHttpClient okHttpClient, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                okHttpClient = null;
            }
            if ((i & 4) != 0) {
                str2 = FidesmoBaseUrlKt.fidesmoApiBaseUrl;
            }
            return companion.getClient(str, okHttpClient, str2);
        }

        private final OkHttpClient getOkHttpClient(String locale) {
            OkHttpClient.Builder newBuilder = new OkHttpClient().newBuilder();
            newBuilder.readTimeout(readTimeout, TimeUnit.SECONDS);
            UserAgentInterceptor userAgentInterceptor = new UserAgentInterceptor(null, 1, null);
            ArrayList arrayList = newBuilder.interceptors;
            arrayList.add(userAgentInterceptor);
            arrayList.add(new LanguageSelectionInterceptor(locale));
            return new OkHttpClient(newBuilder);
        }

        public final DeliverySecClient getClient(String locale, OkHttpClient okHttpClient, String baseUrl) {
            baseUrl.getClass();
            if (locale == null) {
                locale = Locale.getDefault().getLanguage();
            }
            if (okHttpClient == null) {
                locale.getClass();
                okHttpClient = getOkHttpClient(locale);
            }
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.baseUrl(baseUrl);
            ((ArrayList) builder.converterFactories).add(GsonConverterFactory.create(gson));
            builder.client(okHttpClient);
            ((ArrayList) builder.callAdapterFactories).add(new RxJava3CallAdapterFactory());
            Object create = builder.build().create(DeliverySecClient.class);
            create.getClass();
            return (DeliverySecClient) create;
        }

        public final DeliverySecClient getClient(String str) {
            return getClient$default(this, str, null, null, 6, null);
        }

        public final DeliverySecClient getClient(String str, OkHttpClient okHttpClient) {
            return getClient$default(this, str, okHttpClient, null, 4, null);
        }

        public final DeliverySecClient getClient() {
            return getClient$default(this, null, null, null, 7, null);
        }
    }
}
