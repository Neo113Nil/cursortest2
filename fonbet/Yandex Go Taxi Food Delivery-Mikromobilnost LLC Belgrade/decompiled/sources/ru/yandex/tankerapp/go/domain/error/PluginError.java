package ru.yandex.tankerapp.go.domain.error;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lru/yandex/tankerapp/go/domain/error/PluginError;", "", "", ErrorResponseData.JSON_ERROR_CODE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", ErrorResponseData.JSON_ERROR_MESSAGE, "b", "InvalidArguments", "Lru/yandex/tankerapp/go/domain/error/PluginError$InvalidArguments;", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PluginError extends Throwable {
    private final String errorCode = "1";
    private final String errorMessage = "Invalid arguments error";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/tankerapp/go/domain/error/PluginError$InvalidArguments;", "Lru/yandex/tankerapp/go/domain/error/PluginError;", "", "readResolve", "()Ljava/lang/Object;", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidArguments extends PluginError {
        public static final InvalidArguments a = new InvalidArguments();

        private final Object readResolve() {
            return a;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
