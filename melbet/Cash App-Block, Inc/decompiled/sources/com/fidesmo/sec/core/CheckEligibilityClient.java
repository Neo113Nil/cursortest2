package com.fidesmo.sec.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.core.models.FidesmoBaseUrlKt;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\r"}, d2 = {"Lcom/fidesmo/sec/core/CheckEligibilityClient;", "", "checkCardEligibility", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/fidesmo/sec/core/EligibilityResponse;", "version", "", "request", "Lcom/fidesmo/sec/core/EligibilityCheckRequest;", "checkEligibility", "getCertificateKeySet", "Lcom/fidesmo/sec/core/CertificateKeySet;", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CheckEligibilityClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/fidesmo/sec/core/CheckEligibilityClient$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getClient", "Lcom/fidesmo/sec/core/CheckEligibilityClient;", "url", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Gson gson = new GsonBuilder().create();

        private Companion() {
        }

        public static /* synthetic */ CheckEligibilityClient getClient$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = FidesmoBaseUrlKt.fidesmoApiBaseUrl;
            }
            return companion.getClient(str);
        }

        public final CheckEligibilityClient getClient(String url) {
            OkHttpClient.Builder newBuilder = new OkHttpClient().newBuilder();
            newBuilder.readTimeout(120L, TimeUnit.SECONDS);
            OkHttpClient okHttpClient = new OkHttpClient(newBuilder);
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.baseUrl(url);
            ((ArrayList) builder.converterFactories).add(GsonConverterFactory.create(gson));
            builder.callFactory = okHttpClient;
            ((ArrayList) builder.callAdapterFactories).add(new RxJava3CallAdapterFactory());
            Object create = builder.build().create(CheckEligibilityClient.class);
            create.getClass();
            return (CheckEligibilityClient) create;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Observable checkCardEligibility$default(CheckEligibilityClient checkEligibilityClient, String str, EligibilityCheckRequest eligibilityCheckRequest, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: checkCardEligibility");
                return null;
            }
            if ((i & 1) != 0) {
                str = "v2";
            }
            return checkEligibilityClient.checkCardEligibility(str, eligibilityCheckRequest);
        }
    }

    @POST("pay/{version}/eligibility-check")
    Observable<EligibilityResponse> checkCardEligibility(@Path("version") String version, @Body EligibilityCheckRequest request);

    @Deprecated
    @POST("pay/{version}/eligibility-check")
    Observable<EligibilityResponse> checkEligibility(@Path("version") String version, @Body EligibilityCheckRequest request);

    @GET("pay/{version}/certs")
    Observable<CertificateKeySet> getCertificateKeySet(@Path("version") String version);
}
