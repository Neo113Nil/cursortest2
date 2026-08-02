package com.fidesmo.sec.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.core.models.AppDescription;
import com.fidesmo.sec.core.models.ClientInfo;
import com.fidesmo.sec.core.models.ClientInfoInterceptor;
import com.fidesmo.sec.core.models.FidesmoBaseUrlKt;
import com.fidesmo.sec.core.models.InstanceElementsResponse;
import com.fidesmo.sec.core.models.ServiceDescriptionResponse;
import com.fidesmo.sec.utils.HexTypeAdapter;
import com.fidesmo.sec.utils.LanguageSelectionInterceptor;
import com.fidesmo.sec.utils.UserAgentInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.Result;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0002\u0010\fJ8\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H'J.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'J6\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006H'¨\u0006\u0016"}, d2 = {"Lcom/fidesmo/sec/core/AppStoreClient;", "", "getAppDescription", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/fidesmo/sec/core/models/AppDescription;", "appId", "", "cin", "getAppDescriptions", "", "development", "", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/Observable;", "getInstanceElements", "Lretrofit2/adapter/rxjava3/Result;", "Lcom/fidesmo/sec/core/models/InstanceElementsResponse;", "authorization", "getServiceDescription", "Lcom/fidesmo/sec/core/models/ServiceDescriptionResponse;", "serviceId", "getServiceDescriptions", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AppStoreClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\fJ\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/fidesmo/sec/core/AppStoreClient$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "readTimeout", "", "getClient", "Lcom/fidesmo/sec/core/AppStoreClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "baseUrl", "", "clientInfo", "Lcom/fidesmo/sec/core/models/ClientInfo;", "locale", "getOkHttpClient", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        public static /* synthetic */ AppStoreClient getClient$default(Companion companion, OkHttpClient okHttpClient, String str, ClientInfo clientInfo, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                okHttpClient = null;
            }
            if ((i & 2) != 0) {
                str = FidesmoBaseUrlKt.fidesmoApiBaseUrl;
            }
            if ((i & 4) != 0) {
                clientInfo = ClientInfo.INSTANCE.defaultClientInfo();
            }
            if ((i & 8) != 0) {
                str2 = Locale.getDefault().getLanguage();
                str2.getClass();
            }
            return companion.getClient(okHttpClient, str, clientInfo, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final OkHttpClient getOkHttpClient(ClientInfo clientInfo, String locale) {
            OkHttpClient.Builder newBuilder = new OkHttpClient().newBuilder();
            newBuilder.readTimeout(readTimeout, TimeUnit.SECONDS);
            UserAgentInterceptor userAgentInterceptor = new UserAgentInterceptor(null, 1, 0 == true ? 1 : 0);
            ArrayList arrayList = newBuilder.interceptors;
            arrayList.add(userAgentInterceptor);
            arrayList.add(new ClientInfoInterceptor(clientInfo));
            arrayList.add(new LanguageSelectionInterceptor(locale));
            return new OkHttpClient(newBuilder);
        }

        public final AppStoreClient getClient(OkHttpClient okHttpClient, String baseUrl, ClientInfo clientInfo, String locale) {
            baseUrl.getClass();
            clientInfo.getClass();
            locale.getClass();
            if (okHttpClient == null) {
                okHttpClient = getOkHttpClient(clientInfo, locale);
            }
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.baseUrl(baseUrl);
            ((ArrayList) builder.converterFactories).add(GsonConverterFactory.create(gson));
            builder.client(okHttpClient);
            ((ArrayList) builder.callAdapterFactories).add(new RxJava3CallAdapterFactory());
            Object create = builder.build().create(AppStoreClient.class);
            create.getClass();
            return (AppStoreClient) create;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Observable getInstanceElements$default(AppStoreClient appStoreClient, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getInstanceElements");
                return null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return appStoreClient.getInstanceElements(str, str2, str3);
        }

        public static /* synthetic */ Observable getServiceDescriptions$default(AppStoreClient appStoreClient, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getServiceDescriptions");
                return null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return appStoreClient.getServiceDescriptions(str, str2, str3);
        }
    }

    @GET("v3/apps/{appId}")
    Observable<AppDescription> getAppDescription(@Path("appId") String appId, @Query("cin") String cin);

    @GET("v3/apps?fields=all")
    Observable<List<AppDescription>> getAppDescriptions(@Query("cin") String cin, @Query("development") Boolean development);

    @GET("v3/apps/{appId}/instance-elements/{cin}")
    Observable<Result<InstanceElementsResponse>> getInstanceElements(@Path("appId") String appId, @Path("cin") String cin, @Header("Authorization") String authorization);

    @GET("v3/apps/{appId}/services/{serviceId}")
    Observable<ServiceDescriptionResponse> getServiceDescription(@Path("appId") String appId, @Path("serviceId") String serviceId, @Query("cin") String cin);

    @GET("v3/apps/{appId}/services?fields=all")
    Observable<List<ServiceDescriptionResponse>> getServiceDescriptions(@Path("appId") String appId, @Query("cin") String cin, @Header("Authorization") String authorization);
}
