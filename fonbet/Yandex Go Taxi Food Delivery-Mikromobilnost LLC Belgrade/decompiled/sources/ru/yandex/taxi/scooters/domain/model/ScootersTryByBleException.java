package ru.yandex.taxi.scooters.domain.model;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/yandex/taxi/scooters/domain/model/ScootersTryByBleException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "address", "Ljava/lang/String;", "a", "()Ljava/lang/String;", URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "b", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersTryByBleException extends RuntimeException {
    private final String address;
    private final String password;

    public ScootersTryByBleException(String str, String str2) {
        this.address = str;
        this.password = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final String getPassword() {
        return this.password;
    }
}
