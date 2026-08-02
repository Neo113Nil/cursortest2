package ru.yandex.taxi.scooters.domain.model;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.lto0;
import defpackage.zzs;
import kotlin.Metadata;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/taxi/scooters/domain/model/ScootersEvolvingFailedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", "Lzzs;", "nearestParkingGeo", "Lzzs;", "c", "()Lzzs;", "Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", ErrorResponseData.JSON_ERROR_CODE, "Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "a", "()Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "", "isNearestParkingNavigationEnabled", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "Llto0;", "riskyParkingMessage", "Llto0;", "f", "()Llto0;", "evolveToCompletion", "Z", "b", "()Z", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersEvolvingFailedException extends RuntimeException {
    private final ScootersErrorCode errorCode;
    private final boolean evolveToCompletion;
    private final Boolean isNearestParkingNavigationEnabled;
    private final zzs nearestParkingGeo;
    private final lto0 riskyParkingMessage;
    private final String subtitle;
    private final String title;

    public ScootersEvolvingFailedException(String str, String str2, zzs zzsVar, ScootersErrorCode scootersErrorCode, Boolean bool, lto0 lto0Var, boolean z) {
        this.title = str;
        this.subtitle = str2;
        this.nearestParkingGeo = zzsVar;
        this.errorCode = scootersErrorCode;
        this.isNearestParkingNavigationEnabled = bool;
        this.riskyParkingMessage = lto0Var;
        this.evolveToCompletion = z;
    }

    /* renamed from: a, reason: from getter */
    public final ScootersErrorCode getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getEvolveToCompletion() {
        return this.evolveToCompletion;
    }

    /* renamed from: c, reason: from getter */
    public final zzs getNearestParkingGeo() {
        return this.nearestParkingGeo;
    }

    /* renamed from: f, reason: from getter */
    public final lto0 getRiskyParkingMessage() {
        return this.riskyParkingMessage;
    }

    /* renamed from: g, reason: from getter */
    public final Boolean getIsNearestParkingNavigationEnabled() {
        return this.isNearestParkingNavigationEnabled;
    }
}
