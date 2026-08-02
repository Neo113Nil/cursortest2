package com.fidesmo.sec.utils;

import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class LanguageSelectionInterceptor implements Interceptor {
    private final String localeString;

    public LanguageSelectionInterceptor() {
        this.localeString = Locale.getDefault().getLanguage();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.header("Accept-Language", this.localeString);
        return chain.proceed(new Request(newBuilder));
    }

    public LanguageSelectionInterceptor(String str) {
        this.localeString = str;
    }
}
