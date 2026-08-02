package com.squareup.cash.api;

import com.google.crypto.tink.KeysetHandle;
import okhttp3.Request;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.CompletableFutureCallAdapterFactory;
import retrofit2.Response;

/* loaded from: classes.dex */
public final class ApiResultCallAdapterFactory$get$3$adapt$1 implements Call {
    public final /* synthetic */ Call $delegateCall;
    public final ApiResultCallAdapterFactory$get$3$adapt$1 newCall = this;
    public final /* synthetic */ CompletableFutureCallAdapterFactory this$0;

    public ApiResultCallAdapterFactory$get$3$adapt$1(Call call, CompletableFutureCallAdapterFactory completableFutureCallAdapterFactory) {
        this.$delegateCall = call;
        this.this$0 = completableFutureCallAdapterFactory;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.$delegateCall.cancel();
    }

    public final Object clone() {
        throw new UnsupportedOperationException();
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) {
        this.$delegateCall.enqueue(new KeysetHandle(callback, this, this.this$0));
    }

    @Override // retrofit2.Call
    public final Response execute() {
        throw new UnsupportedOperationException();
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.$delegateCall.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.$delegateCall.isExecuted();
    }

    @Override // retrofit2.Call
    public final Request request() {
        Request request = this.$delegateCall.request();
        request.getClass();
        return request;
    }

    @Override // retrofit2.Call
    public final Timeout timeout() {
        Timeout timeout = this.$delegateCall.timeout();
        timeout.getClass();
        return timeout;
    }

    @Override // retrofit2.Call
    /* renamed from: clone, reason: collision with other method in class */
    public final Call m2176clone() {
        throw new UnsupportedOperationException();
    }
}
