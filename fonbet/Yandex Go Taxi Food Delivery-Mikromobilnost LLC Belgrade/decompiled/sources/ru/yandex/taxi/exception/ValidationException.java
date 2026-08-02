package ru.yandex.taxi.exception;

import defpackage.jz21;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/yandex/taxi/exception/ValidationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Ljz21;", "errors", "Ljava/util/List;", "a", "()Ljava/util/List;", "r991", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidationException extends RuntimeException {
    private final List<jz21> errors;

    public ValidationException(List list) {
        this.errors = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getErrors() {
        return this.errors;
    }
}
