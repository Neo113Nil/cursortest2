package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/management/delivery_tasks/create/UnknownResponseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "response", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "sdk-management-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnknownResponseException extends RuntimeException {
    private final Object response;

    public UnknownResponseException(Object obj) {
        this.response = obj;
    }

    /* renamed from: a, reason: from getter */
    public final Object getResponse() {
        return this.response;
    }
}
