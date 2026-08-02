package defpackage;

import com.yandex.go.logistics.cargo_flow.experiment.DeliveryOrderFormPersistentSettingsExperiment;
import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementExperiment;
import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementV2Experiment;
import ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class rwp implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ rwp(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ScreenModeMapProvidersExperiment.Companion.serializer();
            case 1:
                return zxx.Companion.serializer();
            case 2:
                return bny.Companion.serializer();
            case 3:
                return s3u.Companion.serializer();
            case 4:
                return qk0.Companion.serializer();
            case 5:
                return o7y.Companion.serializer();
            case 6:
                return y7z.Companion.serializer();
            case 7:
                return m72.Companion.serializer();
            case 8:
                return f9z.Companion.serializer();
            case 9:
                return ExplainingLocationPermissionScreenWithAgreementV2Experiment.Companion.serializer();
            case 10:
                return ExplainingLocationPermissionScreenWithAgreementExperiment.Companion.serializer();
            case 11:
                return xs8.Companion.serializer();
            case 12:
                return DeliveryOrderFormPersistentSettingsExperiment.Companion.serializer();
            case 13:
                return ohi.Companion.serializer();
            case 14:
                return DeliveryPvzExperiment.Companion.serializer();
            case 15:
                return ndi.Companion.serializer();
            case 16:
                return k7i.Companion.serializer();
            case 17:
                return tt90.Companion.serializer();
            case 18:
                return n4i.Companion.serializer();
            case 19:
                return adi.Companion.serializer();
            case 20:
                return lii.Companion.serializer();
            case 21:
                return vfi.Companion.serializer();
            case 22:
                return d8i.Companion.serializer();
            case 23:
                return sni.Companion.serializer();
            case 24:
                return kfi.Companion.serializer();
            case 25:
                return z9i.Companion.serializer();
            case 26:
                return vii.Companion.serializer();
            case 27:
                return jbi.Companion.serializer();
            case 28:
                return yuh.Companion.serializer();
            default:
                return vmi.Companion.serializer();
        }
    }
}
