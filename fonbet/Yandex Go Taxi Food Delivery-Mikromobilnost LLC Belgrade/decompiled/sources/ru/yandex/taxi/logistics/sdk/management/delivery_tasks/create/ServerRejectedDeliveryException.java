package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create;

import defpackage.ps50;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/management/delivery_tasks/create/ServerRejectedDeliveryException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lps50;", "networkError", "Lps50;", "b", "()Lps50;", "", "failureDescription", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "sdk-management-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ServerRejectedDeliveryException extends RuntimeException {
    private final String failureDescription;
    private final ps50 networkError;

    public ServerRejectedDeliveryException(ps50 ps50Var, String str, int i) {
        ps50Var = (i & 1) != 0 ? null : ps50Var;
        str = (i & 2) != 0 ? null : str;
        this.networkError = ps50Var;
        this.failureDescription = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getFailureDescription() {
        return this.failureDescription;
    }

    /* renamed from: b, reason: from getter */
    public final ps50 getNetworkError() {
        return this.networkError;
    }

    public ServerRejectedDeliveryException() {
        this(null, null, 3);
    }
}
