package com.squareup.cash.gps.backend.real;

import android.location.Location;
import android.os.Build;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancelledContinuation;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class AndroidLocationProvider$currentLocation$2$1 implements Function1 {
    public final /* synthetic */ CancellableContinuationImpl $continuation;

    public AndroidLocationProvider$currentLocation$2$1(CancellableContinuationImpl cancellableContinuationImpl) {
        this.$continuation = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        CancellableContinuationImpl cancellableContinuationImpl = this.$continuation;
        if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
            if (location != null) {
                Result.Companion companion = Result.Companion;
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                float accuracy = location.getAccuracy();
                Double valueOf = Double.valueOf(location.getAltitude());
                int i = Build.VERSION.SDK_INT;
                cancellableContinuationImpl.resumeWith(new com.squareup.cash.gps.backend.api.Location(latitude, longitude, accuracy, valueOf, (i < 34 || !location.hasMslAltitudeAccuracy()) ? null : Float.valueOf(location.getMslAltitudeAccuracyMeters()), Float.valueOf(location.getSpeed()), Float.valueOf(location.getSpeedAccuracyMetersPerSecond()), Float.valueOf(location.getBearing()), Float.valueOf(location.getBearingAccuracyDegrees()), Boolean.valueOf(i >= 31 ? location.isMock() : location.isFromMockProvider()), Long.valueOf(location.getTime()), i >= 33 ? Long.valueOf(location.getElapsedRealtimeMillis()) : null));
            } else {
                Timber.Forest.d("Device location could not be determined in reasonable amount of time", new Object[0]);
                Result.Companion companion2 = Result.Companion;
                cancellableContinuationImpl.resumeWith(null);
            }
        }
        return Unit.INSTANCE;
    }
}
