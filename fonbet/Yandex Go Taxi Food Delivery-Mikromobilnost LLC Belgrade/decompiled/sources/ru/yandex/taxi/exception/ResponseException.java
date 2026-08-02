package ru.yandex.taxi.exception;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/exception/ResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "body", "Ljava/lang/String;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "go-client-android.libs:network_utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ResponseException extends Exception {
    private String body;
    private int code = -1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i = this.code;
        if (i != -1) {
            return oyr.k(i, "code=", ", data=", this.body);
        }
        String message = super.getMessage();
        return message == null ? "" : message;
    }
}
