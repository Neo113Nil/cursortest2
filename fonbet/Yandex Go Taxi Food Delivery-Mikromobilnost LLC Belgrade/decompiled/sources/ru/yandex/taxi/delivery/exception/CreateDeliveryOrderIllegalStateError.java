package ru.yandex.taxi.delivery.exception;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/delivery/exception/CreateDeliveryOrderIllegalStateError;", "Lru/yandex/taxi/delivery/exception/CreateDeliveryOrderException;", "", ErrorResponseData.JSON_ERROR_MESSAGE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreateDeliveryOrderIllegalStateError extends CreateDeliveryOrderException {
    private final String errorMessage;

    public CreateDeliveryOrderIllegalStateError(String str) {
        super(str);
        this.errorMessage = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
