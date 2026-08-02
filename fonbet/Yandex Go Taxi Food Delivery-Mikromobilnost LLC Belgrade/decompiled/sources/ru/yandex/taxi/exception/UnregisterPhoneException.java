package ru.yandex.taxi.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/exception/UnregisterPhoneException;", "Lru/yandex/taxi/exception/ApiException;", "", "sharingText", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UnregisterPhoneException extends ApiException {
    private final String sharingText;

    public UnregisterPhoneException(String str, String str2) {
        super(str);
        this.sharingText = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getSharingText() {
        return this.sharingText;
    }
}
