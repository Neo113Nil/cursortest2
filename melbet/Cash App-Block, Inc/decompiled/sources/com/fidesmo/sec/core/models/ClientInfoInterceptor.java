package com.fidesmo.sec.core.models;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/fidesmo/sec/core/models/ClientInfoInterceptor;", "Lokhttp3/Interceptor;", "clientInfo", "Lcom/fidesmo/sec/core/models/ClientInfo;", "(Lcom/fidesmo/sec/core/models/ClientInfo;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientInfoInterceptor implements Interceptor {
    private final ClientInfo clientInfo;

    public /* synthetic */ ClientInfoInterceptor(ClientInfo clientInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientInfo.INSTANCE.defaultClientInfo() : clientInfo);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.addHeader("Fidesmo-Client-Description", this.clientInfo.getDescription());
        newBuilder.addHeader("Fidesmo-Client-Capabilities", CollectionsKt.joinToString$default(this.clientInfo.getCapabilities(), ",", null, null, 0, null, null, 62));
        return chain.proceed(new Request(newBuilder));
    }

    public ClientInfoInterceptor(ClientInfo clientInfo) {
        clientInfo.getClass();
        this.clientInfo = clientInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClientInfoInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
