package com.plaid.internal;

import com.plaid.internal.AbstractC0193i4;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class U<S, E> implements Call<AbstractC0193i4<? extends S, ? extends E>> {
    public final Call<S> a;
    public final Converter b;

    public static final class a implements Callback {
        public final /* synthetic */ Callback a;
        public final /* synthetic */ U<S, E> b;

        public a(Callback callback, U<S, E> u) {
            this.a = callback;
            this.b = u;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<S> call, Throwable th) {
            call.getClass();
            th.getClass();
            this.a.onResponse(this.b, Response.success(th instanceof IOException ? new AbstractC0193i4.b((IOException) th) : new AbstractC0193i4.d(th)));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        @Override // retrofit2.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onResponse(Call<S> call, Response<S> response) {
            Object obj;
            call.getClass();
            response.getClass();
            Object obj2 = response.body;
            okhttp3.Response response2 = response.rawResponse;
            int i = response2.code;
            ResponseBody responseBody = response.errorBody;
            if (response2.isSuccessful) {
                Callback callback = this.a;
                U<S, E> u = this.b;
                if (obj2 != null) {
                    callback.onResponse(u, Response.success(new AbstractC0193i4.c(obj2)));
                    return;
                } else {
                    callback.onResponse(u, Response.success(new AbstractC0193i4.d(null)));
                    return;
                }
            }
            if (responseBody != null && responseBody.contentLength() != 0) {
                try {
                    obj = this.b.b.convert(responseBody);
                } catch (Exception unused) {
                }
                Callback callback2 = this.a;
                U<S, E> u2 = this.b;
                if (obj == null) {
                    callback2.onResponse(u2, Response.success(new AbstractC0193i4.a(obj, i)));
                    return;
                } else {
                    callback2.onResponse(u2, Response.success(new AbstractC0193i4.d(null)));
                    return;
                }
            }
            obj = null;
            Callback callback22 = this.a;
            U<S, E> u22 = this.b;
            if (obj == null) {
            }
        }
    }

    public U(Call<S> call, Converter converter) {
        call.getClass();
        converter.getClass();
        this.a = call;
        this.b = converter;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.a.cancel();
    }

    @Override // retrofit2.Call
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final U<S, E> m2176clone() {
        Call m2176clone = this.a.m2176clone();
        m2176clone.getClass();
        return new U<>(m2176clone, this.b);
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) {
        callback.getClass();
        this.a.enqueue(new a(callback, this));
    }

    @Override // retrofit2.Call
    public final Response<AbstractC0193i4<S, E>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.a.isExecuted();
    }

    @Override // retrofit2.Call
    public final Request request() {
        Request request = this.a.request();
        request.getClass();
        return request;
    }

    @Override // retrofit2.Call
    public final Timeout timeout() {
        Timeout timeout = this.a.timeout();
        timeout.getClass();
        return timeout;
    }
}
