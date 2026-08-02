package ru.yandex.taxi.persuggest.fingerprint;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import defpackage.sm21;
import defpackage.tm21;
import defpackage.zp7;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/persuggest/fingerprint/UserFingerprintGnssSession$start$measCallback$1", "Landroid/location/GnssMeasurementsEvent$Callback;", "Landroid/location/GnssMeasurementsEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "onGnssMeasurementsReceived", "(Landroid/location/GnssMeasurementsEvent;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserFingerprintGnssSession$start$measCallback$1 extends GnssMeasurementsEvent.Callback {
    final /* synthetic */ tm21 this$0;

    public UserFingerprintGnssSession$start$measCallback$1(tm21 tm21Var) {
        this.this$0 = tm21Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sm21 onGnssMeasurementsReceived$lambda$0(GnssMeasurementsEvent gnssMeasurementsEvent, sm21 sm21Var) {
        GnssStatus gnssStatus = sm21Var.b;
        sm21Var.getClass();
        return new sm21(gnssMeasurementsEvent, gnssStatus);
    }

    @Override // android.location.GnssMeasurementsEvent.Callback
    public void onGnssMeasurementsReceived(GnssMeasurementsEvent event) {
        this.this$0.d.updateAndGet(new zp7(5, event));
    }
}
