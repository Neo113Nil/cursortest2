package com.fidesmo.sec.core;

import com.fidesmo.sec.core.models.Card;
import com.fidesmo.sec.core.models.FidesmoBaseUrlKt;
import com.fidesmo.sec.utils.LanguageSelectionInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0018\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003H'J\"\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\n"}, d2 = {"Lcom/fidesmo/sec/core/BankListClient;", "", "getBankList", "Lio/reactivex/rxjava3/core/Observable;", "", "Lcom/fidesmo/sec/core/models/Card;", "Lcom/fidesmo/sec/core/BankList;", "version", "", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BankListClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/fidesmo/sec/core/BankListClient$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getClient", "Lcom/fidesmo/sec/core/BankListClient;", "locale", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Gson gson = new GsonBuilder().create();

        private Companion() {
        }

        public static /* synthetic */ BankListClient getClient$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = Locale.getDefault().getLanguage();
                str.getClass();
            }
            return companion.getClient(str);
        }

        public final BankListClient getClient(String locale) {
            locale.getClass();
            OkHttpClient.Builder newBuilder = new OkHttpClient().newBuilder();
            newBuilder.readTimeout(120L, TimeUnit.SECONDS);
            newBuilder.interceptors.add(new LanguageSelectionInterceptor(locale));
            OkHttpClient okHttpClient = new OkHttpClient(newBuilder);
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.baseUrl(FidesmoBaseUrlKt.fidesmoApiBaseUrl);
            ((ArrayList) builder.converterFactories).add(GsonConverterFactory.create(gson));
            builder.callFactory = okHttpClient;
            ((ArrayList) builder.callAdapterFactories).add(new RxJava3CallAdapterFactory());
            Object create = builder.build().create(BankListClient.class);
            create.getClass();
            return (BankListClient) create;
        }
    }

    @GET("pay/v2/supported_banks.json")
    Observable<List<Card>> getBankList();

    @Deprecated
    @GET("{version}/supported_banks.json")
    Observable<List<Card>> getBankList(@Path("version") String version);
}
