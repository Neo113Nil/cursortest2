package ru.yandex.taxi.network.api.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/network/api/models/GoApiOtherException;", "Lru/yandex/taxi/network/api/models/GoApiException;", "", "original", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GoApiOtherException extends GoApiException {
    private final Throwable original;

    public GoApiOtherException(Throwable th) {
        super(null, th, 1);
        this.original = th;
    }

    /* renamed from: a, reason: from getter */
    public final Throwable getOriginal() {
        return this.original;
    }
}
