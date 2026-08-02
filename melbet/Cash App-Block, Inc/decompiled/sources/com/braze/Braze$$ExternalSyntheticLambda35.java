package com.braze;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda35 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda35(Braze braze, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit syncPolicyOfflineStatus$lambda$1;
        Unit requestGeofenceRefresh$lambda$3;
        int i = this.$r8$classId;
        boolean z = this.f$1;
        Braze braze = this.f$0;
        switch (i) {
            case 0:
                syncPolicyOfflineStatus$lambda$1 = Braze.setSyncPolicyOfflineStatus$lambda$1(braze, z);
                return syncPolicyOfflineStatus$lambda$1;
            default:
                requestGeofenceRefresh$lambda$3 = Braze.requestGeofenceRefresh$lambda$3(braze, z);
                return requestGeofenceRefresh$lambda$3;
        }
    }
}
