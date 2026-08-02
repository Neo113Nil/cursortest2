package ru.yandex.taxi.network.api.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/network/api/models/GoCheckException;", "Lru/yandex/taxi/network/api/models/GoApiException;", "Lru/yandex/taxi/network/api/models/CheckType;", "checkType", "Lru/yandex/taxi/network/api/models/CheckType;", "getCheckType", "()Lru/yandex/taxi/network/api/models/CheckType;", "", "userFinished", "Z", "a", "()Z", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GoCheckException extends GoApiException {
    private final CheckType checkType;
    private final boolean userFinished;

    public GoCheckException(CheckType checkType, boolean z) {
        super("User failed verification: " + checkType, null, 2);
        this.checkType = checkType;
        this.userFinished = z;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getUserFinished() {
        return this.userFinished;
    }
}
