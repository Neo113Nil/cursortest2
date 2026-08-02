package ru.yandex.taxi.scooters.domain.model;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/scooters/domain/model/ScootersCarControlFailedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", ErrorResponseData.JSON_ERROR_CODE, "Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "getErrorCode", "()Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCarControlFailedException extends RuntimeException {
    private final ScootersErrorCode errorCode;

    public ScootersCarControlFailedException(ScootersErrorCode scootersErrorCode) {
        this.errorCode = scootersErrorCode;
    }
}
