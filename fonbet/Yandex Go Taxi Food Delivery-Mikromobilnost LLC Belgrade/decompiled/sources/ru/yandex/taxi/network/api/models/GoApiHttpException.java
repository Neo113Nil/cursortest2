package ru.yandex.taxi.network.api.models;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.oeu;
import defpackage.oyr;
import java.io.BufferedInputStream;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/network/api/models/GoApiHttpException;", "Lru/yandex/taxi/network/api/models/GoApiException;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "b", "()I", "Loeu;", "headers", "Loeu;", "c", "()Loeu;", "", "requestUrl", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/io/BufferedInputStream;", "body", "Ljava/io/BufferedInputStream;", "a", "()Ljava/io/BufferedInputStream;", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GoApiHttpException extends GoApiException {
    private final BufferedInputStream body;
    private final int code;
    private final oeu headers;
    private final String requestUrl;

    public GoApiHttpException(int i, oeu oeuVar, String str, BufferedInputStream bufferedInputStream) {
        super(oyr.l(i, "Http error with code [", "] for request [", str, "]"), null, 2);
        this.code = i;
        this.headers = oeuVar;
        this.requestUrl = str;
        this.body = bufferedInputStream;
    }

    /* renamed from: a, reason: from getter */
    public final BufferedInputStream getBody() {
        return this.body;
    }

    /* renamed from: b, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: c, reason: from getter */
    public final oeu getHeaders() {
        return this.headers;
    }

    /* renamed from: f, reason: from getter */
    public final String getRequestUrl() {
        return this.requestUrl;
    }
}
