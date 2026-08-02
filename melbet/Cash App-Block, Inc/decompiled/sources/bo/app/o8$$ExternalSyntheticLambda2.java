package bo.app;

import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.BrazeGeofence;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class o8$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeGeofence f$0;

    public /* synthetic */ o8$$ExternalSyntheticLambda2(BrazeGeofence brazeGeofence, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeGeofence;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String registerGeofences$lambda$2$2;
        int i = this.$r8$classId;
        BrazeGeofence brazeGeofence = this.f$0;
        switch (i) {
            case 0:
                return o8.a(brazeGeofence);
            default:
                registerGeofences$lambda$2$2 = BrazeGeofenceManager.registerGeofences$lambda$2$2(brazeGeofence);
                return registerGeofences$lambda$2$2;
        }
    }
}
