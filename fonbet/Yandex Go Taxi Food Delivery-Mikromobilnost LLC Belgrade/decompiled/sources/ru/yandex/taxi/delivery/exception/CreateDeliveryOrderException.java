package ru.yandex.taxi.delivery.exception;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/delivery/exception/CreateDeliveryOrderException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", ErrorResponseData.JSON_ERROR_MESSAGE, "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "Lru/yandex/taxi/delivery/exception/CreateDeliveryOrderCancelledError;", "Lru/yandex/taxi/delivery/exception/CreateDeliveryOrderIllegalStateError;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CreateDeliveryOrderException extends IllegalStateException {
    private final String errorMessage;

    public CreateDeliveryOrderException(String str) {
        super(str);
        this.errorMessage = str;
    }
}
