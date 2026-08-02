package com.datadog.android.core.internal.data.upload;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import kotlin.collections.CollectionsKt__CollectionsKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import okio.BufferedSink;
import okio.GzipSink;
import okio.RealBufferedSink;

/* loaded from: classes4.dex */
public final class GzipRequestInterceptor implements Interceptor {
    public final InternalLogger internalLogger;

    public GzipRequestInterceptor(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request;
        final RequestBody requestBody = request.body;
        if (requestBody == null || request.headers.get("Content-Encoding") != null || (requestBody instanceof MultipartBody)) {
            return realInterceptorChain.proceed(request);
        }
        try {
            Request.Builder newBuilder = request.newBuilder();
            newBuilder.header("Content-Encoding", "gzip");
            newBuilder.method(request.method, new RequestBody() { // from class: com.datadog.android.core.internal.data.upload.GzipRequestInterceptor$gzip$1
                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    return -1L;
                }

                @Override // okhttp3.RequestBody
                public final MediaType contentType() {
                    return RequestBody.this.contentType();
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(BufferedSink bufferedSink) {
                    RealBufferedSink realBufferedSink = new RealBufferedSink(new GzipSink(bufferedSink));
                    RequestBody.this.writeTo(realBufferedSink);
                    realBufferedSink.close();
                }
            });
            request = new Request(newBuilder);
        } catch (Exception e) {
            DBUtil.log$default(this.internalLogger, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), DataOkHttpUploader$upload$request$1.INSTANCE$4, e, 48);
        }
        return realInterceptorChain.proceed(request);
    }
}
