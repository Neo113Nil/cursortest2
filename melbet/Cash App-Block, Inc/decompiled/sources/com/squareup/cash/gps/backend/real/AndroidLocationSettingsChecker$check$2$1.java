package com.squareup.cash.gps.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.libraries.places.api.net.zzf;
import com.google.android.libraries.places.api.net.zzl;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.integrity.bw;
import com.google.android.play.core.integrity.bx;
import com.squareup.cash.appupdate.backend.api.AppUpdateAvailability;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancelledContinuation;
import kotlinx.coroutines.NotCompleted;

/* loaded from: classes4.dex */
public final class AndroidLocationSettingsChecker$check$2$1 implements Function1 {
    public final /* synthetic */ CancellableContinuationImpl $continuation;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AndroidLocationSettingsChecker$check$2$1(CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.$r8$classId = i;
        this.$continuation = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AppUpdateAvailability appUpdateAvailability;
        int i = this.$r8$classId;
        boolean z = true;
        CancellableContinuationImpl cancellableContinuationImpl = this.$continuation;
        switch (i) {
            case 0:
                LocationSettingsStates locationSettingsStates = ((LocationSettingsResponse) obj).zza.zzb;
                boolean z2 = false;
                if (locationSettingsStates != null) {
                    if (!locationSettingsStates.zzd && !locationSettingsStates.zze) {
                        z = false;
                    }
                    z2 = z;
                }
                if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Boolean.valueOf(z2));
                }
                break;
            case 1:
                zzf zzfVar = (zzf) obj;
                if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(zzfVar);
                }
                break;
            case 2:
                zzl zzlVar = (zzl) obj;
                if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
                    Result.Companion companion3 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(zzlVar);
                }
                break;
            case 3:
                Result.Companion companion4 = Result.Companion;
                int i2 = ((AppUpdateInfo) obj).zzc;
                if (i2 == 0) {
                    appUpdateAvailability = AppUpdateAvailability.UNKNOWN;
                } else if (i2 == 1) {
                    appUpdateAvailability = AppUpdateAvailability.UPDATE_NOT_AVAILABLE;
                } else if (i2 == 2) {
                    appUpdateAvailability = AppUpdateAvailability.UPDATE_AVAILABLE;
                } else if (i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$3("non @UpdateAvailability type found");
                    break;
                } else {
                    appUpdateAvailability = AppUpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS;
                }
                cancellableContinuationImpl.resumeWith(appUpdateAvailability);
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
                    Result.Companion companion5 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(bool);
                }
                break;
            case 5:
                Result.Companion companion6 = Result.Companion;
                cancellableContinuationImpl.resumeWith(((bw) obj).a);
                break;
            case 6:
                cancellableContinuationImpl.resumeWith(new Result((bx) obj));
                break;
            default:
                cancellableContinuationImpl.resumeWith(new Result((LocationSettingsResponse) obj));
                break;
        }
        return Unit.INSTANCE;
    }
}
