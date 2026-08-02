package com.fidesmo.sec.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/fidesmo/sec/utils/UserAgentInterceptor;", "Lokhttp3/Interceptor;", "userAgent", "", "(Ljava/lang/String;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserAgentInterceptor implements Interceptor {
    private final String userAgent;

    public /* synthetic */ UserAgentInterceptor(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "sec-client-core" : str);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.header("User-Agent", this.userAgent + ' ' + System.getProperty("http.agent"));
        return chain.proceed(new Request(newBuilder));
    }

    public UserAgentInterceptor(String str) {
        str.getClass();
        this.userAgent = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAgentInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
