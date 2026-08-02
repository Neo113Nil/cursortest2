package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u0006\u0010\u000bJ)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH'¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/plaid/internal/g7;", "", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishRequest;", "request", "Lcom/plaid/internal/i4;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishResponse;", "a", "(Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNATwilioFinishRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartRequest;", "Lretrofit2/Call;", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartResponse;", "(Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveStartRequest;)Lretrofit2/Call;", "", "id", "vfp", "Lcom/plaid/internal/core/protos/link/api/SilentNetworkAuth$LinkSNAProveFinishResponse;", "(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.plaid.internal.g7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC0178g7 {
    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @POST("/link/sna/twilio/finish")
    Object a(@Body SilentNetworkAuth$LinkSNATwilioFinishRequest silentNetworkAuth$LinkSNATwilioFinishRequest, Continuation<? super AbstractC0193i4<SilentNetworkAuth$LinkSNATwilioFinishResponse, ? extends Object>> continuation);

    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @POST("link/sna/prove/start")
    Call<SilentNetworkAuth$LinkSNAProveStartResponse> a(@Body SilentNetworkAuth$LinkSNAProveStartRequest request);

    @Headers({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf,application/json"})
    @GET("link/sna/prove/finish")
    Call<SilentNetworkAuth$LinkSNAProveFinishResponse> a(@Query("id") String id, @Query("vfp") String vfp);
}
