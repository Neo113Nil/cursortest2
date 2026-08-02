package ru.yandex.taxi.exception;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/taxi/exception/TokenRetrievalException;", "Ljava/io/IOException;", "go-client-android.libs:network_utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenRetrievalException extends IOException {
    public TokenRetrievalException(Exception exc) {
        super("Cannot retrieve oauth token", exc);
    }
}
