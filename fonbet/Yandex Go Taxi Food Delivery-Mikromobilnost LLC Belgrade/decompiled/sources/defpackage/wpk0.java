package defpackage;

import ru.yandex.taxi.data.api.RideHistoryApi;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes5.dex */
public interface wpk0 {
    static RideHistoryApi a(on2 on2Var) {
        on2Var.getClass();
        return (RideHistoryApi) on2Var.a(GoApiName.TaxiV4, RideHistoryApi.class);
    }
}
