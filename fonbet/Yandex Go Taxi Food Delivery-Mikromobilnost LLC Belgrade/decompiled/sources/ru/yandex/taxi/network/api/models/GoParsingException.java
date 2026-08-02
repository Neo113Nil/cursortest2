package ru.yandex.taxi.network.api.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/taxi/network/api/models/GoParsingException;", "Lru/yandex/taxi/network/api/models/GoApiException;", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GoParsingException extends GoApiException {
    public GoParsingException(Exception exc) {
        super("Processing the request result failed with an error", exc);
    }
}
