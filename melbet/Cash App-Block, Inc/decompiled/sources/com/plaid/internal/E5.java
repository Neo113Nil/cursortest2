package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.protobuf.ProtoConverterFactory;

/* loaded from: classes4.dex */
public final class E5 {
    public static final a c = new a();
    public static volatile E5 d;
    public final String a;
    public final LinkedHashMap b = new LinkedHashMap();

    public static final class a {
        public final E5 a(String str) {
            E5 e5;
            E5 e52 = E5.d;
            if (e52 != null) {
                return e52;
            }
            synchronized (this) {
                e5 = E5.d;
                if (e5 == null) {
                    e5 = new E5(str);
                    E5.d = e5;
                }
            }
            return e5;
        }
    }

    public E5(String str) {
        this.a = str;
    }

    public final Retrofit a(String str, G5 g5) {
        str.getClass();
        g5.getClass();
        Retrofit retrofit = (Retrofit) this.b.get(str);
        if (retrofit != null) {
            return retrofit;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors.add(new F5(this));
        builder.readTimeout(10L, TimeUnit.MINUTES);
        SocketFactory socketFactory = g5.b;
        if (socketFactory != null) {
            if (socketFactory instanceof SSLSocketFactory) {
                a$$ExternalSyntheticBUOutline0.m$3("socketFactory instanceof SSLSocketFactory");
                return null;
            }
            if (!socketFactory.equals(builder.socketFactory)) {
                builder.routeDatabase = null;
            }
            builder.socketFactory = socketFactory;
        }
        OkHttpClient okHttpClient = new OkHttpClient(builder);
        Gson gson = g5.a;
        GsonConverterFactory create = gson == null ? GsonConverterFactory.create(new Gson()) : GsonConverterFactory.create(gson);
        Retrofit.Builder builder2 = new Retrofit.Builder();
        ArrayList arrayList = (ArrayList) builder2.converterFactories;
        builder2.callFactory = okHttpClient;
        ((ArrayList) builder2.callAdapterFactories).add(new T());
        builder2.baseUrl(str);
        arrayList.add(new ProtoConverterFactory());
        arrayList.add(create);
        Retrofit build = builder2.build();
        this.b.put(str, build);
        return build;
    }
}
