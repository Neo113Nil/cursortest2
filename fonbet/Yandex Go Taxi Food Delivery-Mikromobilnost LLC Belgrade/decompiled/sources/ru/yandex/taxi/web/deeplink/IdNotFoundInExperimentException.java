package ru.yandex.taxi.web.deeplink;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/web/deeplink/IdNotFoundInExperimentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "id", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IdNotFoundInExperimentException extends Exception {
    private final String id;

    public IdNotFoundInExperimentException(String str) {
        super("Id not found in experiment");
        this.id = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }
}
