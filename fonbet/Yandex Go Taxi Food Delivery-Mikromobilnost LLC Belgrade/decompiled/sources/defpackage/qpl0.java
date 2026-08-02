package defpackage;

import com.yandex.go.safety.center.SafetyCenterApi;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes13.dex */
public interface qpl0 {
    static SafetyCenterApi a(on2 on2Var) {
        on2Var.getClass();
        return (SafetyCenterApi) on2Var.a(GoApiName.TaxiV4, SafetyCenterApi.class);
    }
}
