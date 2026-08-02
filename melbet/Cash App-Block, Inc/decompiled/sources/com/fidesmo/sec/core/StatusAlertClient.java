package com.fidesmo.sec.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.core.models.Translations;
import com.fidesmo.sec.utils.TranslationsAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'¨\u0006\b"}, d2 = {"Lcom/fidesmo/sec/core/StatusAlertClient;", "", "getStatusAlert", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/fidesmo/sec/core/models/Translations;", "path", "", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StatusAlertClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/fidesmo/sec/core/StatusAlertClient$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getClient", "Lcom/fidesmo/sec/core/StatusAlertClient;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Gson gson = new GsonBuilder().registerTypeAdapter(Translations.class, new TranslationsAdapter()).create();

        private Companion() {
        }

        public final StatusAlertClient getClient() {
            OkHttpClient.Builder newBuilder = new OkHttpClient().newBuilder();
            newBuilder.readTimeout(120L, TimeUnit.SECONDS);
            OkHttpClient okHttpClient = new OkHttpClient(newBuilder);
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.baseUrl("https://fidesmo.com/");
            ((ArrayList) builder.converterFactories).add(GsonConverterFactory.create(gson));
            builder.callFactory = okHttpClient;
            ((ArrayList) builder.callAdapterFactories).add(new RxJava3CallAdapterFactory());
            Object create = builder.build().create(StatusAlertClient.class);
            create.getClass();
            return (StatusAlertClient) create;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Observable getStatusAlert$default(StatusAlertClient statusAlertClient, String str, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getStatusAlert");
                return null;
            }
            if ((i & 1) != 0) {
                str = "status.json";
            }
            return statusAlertClient.getStatusAlert(str);
        }
    }

    @GET("{path}")
    Observable<Translations> getStatusAlert(@Path("path") String path);
}
