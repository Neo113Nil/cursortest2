package ru.yandex.taxi.persuggest.fingerprint;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import defpackage.sm21;
import defpackage.tm21;
import defpackage.zp7;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/persuggest/fingerprint/UserFingerprintGnssSession$start$statusCallback$1", "Landroid/location/GnssStatus$Callback;", "Landroid/location/GnssStatus;", ACSPConstants.STATUS, "Lzy11;", "onSatelliteStatusChanged", "(Landroid/location/GnssStatus;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserFingerprintGnssSession$start$statusCallback$1 extends GnssStatus.Callback {
    final /* synthetic */ tm21 this$0;

    public UserFingerprintGnssSession$start$statusCallback$1(tm21 tm21Var) {
        this.this$0 = tm21Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sm21 onSatelliteStatusChanged$lambda$0(GnssStatus gnssStatus, sm21 sm21Var) {
        GnssMeasurementsEvent gnssMeasurementsEvent = sm21Var.a;
        sm21Var.getClass();
        return new sm21(gnssMeasurementsEvent, gnssStatus);
    }

    @Override // android.location.GnssStatus.Callback
    public void onSatelliteStatusChanged(GnssStatus status) {
        this.this$0.d.updateAndGet(new zp7(6, status));
    }
}
