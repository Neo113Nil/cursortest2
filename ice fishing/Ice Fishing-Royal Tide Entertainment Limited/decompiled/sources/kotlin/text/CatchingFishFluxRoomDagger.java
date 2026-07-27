package kotlin.text;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class CatchingFishFluxRoomDagger extends com.google.android.gms.common.internal.CatchingFishPagingLibrary {
    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final String CatchingFishCloudMessaging() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final IInterface CatchingFishCoroutine(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return queryLocalInterface instanceof CatchingFishIntentRetrofit ? (CatchingFishIntentRetrofit) queryLocalInterface : new CatchingFishIntentRetrofit(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final boolean CatchingFishEspressoTesting() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final String CatchingFishFragmentHandler() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // kotlin.text.CatchingFishMVPUnitTesting
    public final int CatchingFishParcelableFAB() {
        return 253600000;
    }

    @Override // com.google.android.gms.common.internal.CatchingFishPagingLibrary
    public final CatchingFishAppCompatPayPal[] CatchingFishWorkManager() {
        return CatchingFishBiometricBundle.CatchingFishUnitTesting;
    }
}
