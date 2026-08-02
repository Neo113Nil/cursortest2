package ru.yandex.taxi;

import com.yandex.go.dynamic.api.DynamicFeature;
import defpackage.alw0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.j73;
import defpackage.ls2;
import defpackage.ma1;
import defpackage.na1;
import defpackage.pn90;
import defpackage.qn90;
import defpackage.rs2;
import defpackage.seu;
import defpackage.us2;
import defpackage.v0p;
import defpackage.v451;
import defpackage.w0p;
import defpackage.w451;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/BaseTaxiApplication;", "Lru/yandex/taxi/TaxiApplication;", "<init>", "()V", "Lrs2;", "appCredentials", "()Lrs2;", "Lma1;", "adjustCredentials", "()Lma1;", "Lv0p;", "externalProcessCredentials", "()Lv0p;", "Lls2;", "appComponentFactory", "()Lls2;", "Lw451;", "widgetsAppComponentFactory", "()Lw451;", "Lqn90;", "passportAppComponentFactory", "()Lqn90;", TariffOrderFlow.ORDER_FLOW_TAXI_KEY}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class BaseTaxiApplication extends TaxiApplication {
    public BaseTaxiApplication() {
        List W;
        W = evu0.W("tc.mobile.yandex.net", new String[]{"!!"}, (r2 & 4) != 0 ? 0 : 2);
        d6z.d = ((String[]) W.toArray(new String[0]))[0];
        List list = alw0.a;
        alw0.a = j73.d0(new DynamicFeature[]{DynamicFeature.INAPP_CALLS, DynamicFeature.CARTECH, DynamicFeature.QUARK, DynamicFeature.LITERT});
    }

    @Override // ru.yandex.taxi.TaxiApplication
    public ma1 adjustCredentials() {
        return na1.a;
    }

    @Override // ru.yandex.taxi.TaxiApplication
    public ls2 appComponentFactory() {
        return new seu(21);
    }

    @Override // ru.yandex.taxi.TaxiApplication
    public rs2 appCredentials() {
        return us2.a;
    }

    @Override // ru.yandex.taxi.TaxiApplication
    public v0p externalProcessCredentials() {
        return w0p.a;
    }

    @Override // ru.yandex.taxi.TaxiApplication
    public qn90 passportAppComponentFactory() {
        return pn90.a();
    }

    @Override // ru.yandex.taxi.TaxiApplication
    public w451 widgetsAppComponentFactory() {
        return v451.a();
    }
}
