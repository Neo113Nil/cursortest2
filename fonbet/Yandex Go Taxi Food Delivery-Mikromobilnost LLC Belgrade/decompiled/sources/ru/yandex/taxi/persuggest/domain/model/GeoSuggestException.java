package ru.yandex.taxi.persuggest.domain.model;

import defpackage.z7l0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/persuggest/domain/model/GeoSuggestException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "Lz7l0;", "routePointType", "Lz7l0;", "getRoutePointType", "()Lz7l0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeoSuggestException extends RuntimeException {
    private final z7l0 routePointType;
    private final Throwable throwable;

    public GeoSuggestException(Throwable th, z7l0 z7l0Var) {
        super(th);
        this.throwable = th;
        this.routePointType = z7l0Var;
    }
}
