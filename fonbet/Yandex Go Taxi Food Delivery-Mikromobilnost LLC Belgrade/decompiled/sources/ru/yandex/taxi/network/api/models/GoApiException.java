package ru.yandex.taxi.network.api.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/network/api/models/GoApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lru/yandex/taxi/network/api/models/GoApiHttpException;", "Lru/yandex/taxi/network/api/models/GoApiOtherException;", "Lru/yandex/taxi/network/api/models/GoCheckException;", "Lru/yandex/taxi/network/api/models/GoParsingException;", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class GoApiException extends RuntimeException {
    public GoApiException(String str, Throwable th, int i) {
        super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }
}
