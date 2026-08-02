package ru.yandex.taxi.scooters.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/scooters/domain/model/ScootersBleIsNotAvailableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersBleIsNotAvailableException extends RuntimeException {
    private final Throwable cause;

    public ScootersBleIsNotAvailableException(IllegalArgumentException illegalArgumentException) {
        super(illegalArgumentException);
        this.cause = illegalArgumentException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public ScootersBleIsNotAvailableException() {
        this(null);
    }
}
