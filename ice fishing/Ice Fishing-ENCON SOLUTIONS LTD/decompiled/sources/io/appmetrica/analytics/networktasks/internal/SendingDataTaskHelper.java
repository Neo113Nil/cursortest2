package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes.dex */
public class SendingDataTaskHelper {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f7517a;

    /* renamed from: b, reason: collision with root package name */
    private final Compressor f7518b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeProvider f7519c;

    /* renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f7520d;

    /* renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f7521e;

    /* renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f7522f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f7522f.handle(this.f7521e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f7520d.applySendTime(this.f7519c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f7518b.compress(bArr);
            if (compress == null || (encrypt = this.f7517a.encrypt(compress)) == null) {
                return false;
            }
            this.f7520d.setPostData(encrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, TimeProvider timeProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f7517a = requestBodyEncrypter;
        this.f7518b = compressor;
        this.f7519c = timeProvider;
        this.f7520d = requestDataHolder;
        this.f7521e = responseDataHolder;
        this.f7522f = networkResponseHandler;
    }
}
