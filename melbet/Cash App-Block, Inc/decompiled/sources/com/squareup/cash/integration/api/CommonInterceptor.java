package com.squareup.cash.integration.api;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes.dex */
public final class CommonInterceptor implements Interceptor {
    public final String userAgent;

    public CommonInterceptor(String str) {
        this.userAgent = str;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request.Builder newBuilder = realInterceptorChain.request.newBuilder();
        newBuilder.header("User-Agent", this.userAgent);
        return realInterceptorChain.proceed(new Request(newBuilder));
    }
}
