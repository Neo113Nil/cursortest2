package com.plaid.internal;

import com.plaid.internal.C0095a6;
import com.plaid.internal.core.networking.models.NetworkException;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class F5 implements Interceptor {
    public final /* synthetic */ E5 a;

    public F5(E5 e5) {
        this.a = e5;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder newBuilder = chain.request().newBuilder();
        String str = this.a.a;
        if (str != null) {
            newBuilder.addHeader("User-Agent", str);
        }
        Request request = new Request(newBuilder);
        Response proceed = chain.proceed(request);
        if (!proceed.isSuccessful && !StringsKt.contains((CharSequence) request.url.encodedPath(), (CharSequence) "sentry", false)) {
            int i = NetworkException.c;
            NetworkException a = NetworkException.a.a(request, proceed);
            C0095a6.a.a(C0095a6.a, a, a.a);
        }
        return proceed;
    }
}
