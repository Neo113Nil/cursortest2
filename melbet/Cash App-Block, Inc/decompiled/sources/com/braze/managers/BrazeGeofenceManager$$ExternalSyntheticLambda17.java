package com.braze.managers;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeGeofenceManager$$ExternalSyntheticLambda17 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeGeofenceManager f$0;

    public /* synthetic */ BrazeGeofenceManager$$ExternalSyntheticLambda17(BrazeGeofenceManager brazeGeofenceManager, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeGeofenceManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String configureFromServerConfig$lambda$1;
        String configureFromServerConfig$lambda$3;
        String registerGeofences$lambda$2$1;
        String registerGeofences$lambda$2$3;
        int i = this.$r8$classId;
        BrazeGeofenceManager brazeGeofenceManager = this.f$0;
        switch (i) {
            case 0:
                configureFromServerConfig$lambda$1 = BrazeGeofenceManager.configureFromServerConfig$lambda$1(brazeGeofenceManager);
                return configureFromServerConfig$lambda$1;
            case 1:
                configureFromServerConfig$lambda$3 = BrazeGeofenceManager.configureFromServerConfig$lambda$3(brazeGeofenceManager);
                return configureFromServerConfig$lambda$3;
            case 2:
                registerGeofences$lambda$2$1 = BrazeGeofenceManager.registerGeofences$lambda$2$1(brazeGeofenceManager);
                return registerGeofences$lambda$2$1;
            default:
                registerGeofences$lambda$2$3 = BrazeGeofenceManager.registerGeofences$lambda$2$3(brazeGeofenceManager);
                return registerGeofences$lambda$2$3;
        }
    }
}
