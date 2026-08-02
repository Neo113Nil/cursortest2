package com.braze;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.ui.inappmessage.InAppMessageManagerBase;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowUserDismissMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda34 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda34(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String syncPolicyOfflineStatus$lambda$0;
        String requestGeofenceRefresh$lambda$2;
        String syncPolicyOfflineStatus$lambda$1$0;
        String offline$lambda$0;
        String upGeofences$lambda$1;
        String configureFromServerConfig$lambda$0;
        String _set_shouldNextUnregisterBeSkipped_$lambda$0;
        int i = this.$r8$classId;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                syncPolicyOfflineStatus$lambda$0 = Braze.setSyncPolicyOfflineStatus$lambda$0(z);
                return syncPolicyOfflineStatus$lambda$0;
            case 1:
                return Updater.mutableStateOf$default(Boolean.valueOf(z));
            case 2:
                return Updater.mutableStateOf$default(Boolean.valueOf(z));
            case 3:
                return Updater.mutableStateOf$default(Boolean.valueOf(z));
            case 4:
                requestGeofenceRefresh$lambda$2 = Braze.requestGeofenceRefresh$lambda$2(z);
                return requestGeofenceRefresh$lambda$2;
            case 5:
                syncPolicyOfflineStatus$lambda$1$0 = Braze.setSyncPolicyOfflineStatus$lambda$1$0(z);
                return syncPolicyOfflineStatus$lambda$1$0;
            case 6:
                offline$lambda$0 = DefaultBrazeImageLoader.setOffline$lambda$0(z);
                return offline$lambda$0;
            case 7:
                upGeofences$lambda$1 = BrazeGeofenceManager.setUpGeofences$lambda$1(z);
                return upGeofences$lambda$1;
            case 8:
                configureFromServerConfig$lambda$0 = BrazeGeofenceManager.configureFromServerConfig$lambda$0(z);
                return configureFromServerConfig$lambda$0;
            case 9:
                _set_shouldNextUnregisterBeSkipped_$lambda$0 = InAppMessageManagerBase._set_shouldNextUnregisterBeSkipped_$lambda$0(z);
                return _set_shouldNextUnregisterBeSkipped_$lambda$0;
            case 10:
                return new CoreFlowRealSheetState(null, CoreFlowUserDismissMode.All, z, 4);
            case 11:
                return Updater.mutableStateOf$default(Boolean.valueOf(!z));
            default:
                return new ParcelableSnapshotMutableFloatState(z ? RecyclerView.DECELERATION_RATE : 1.0f);
        }
    }
}
