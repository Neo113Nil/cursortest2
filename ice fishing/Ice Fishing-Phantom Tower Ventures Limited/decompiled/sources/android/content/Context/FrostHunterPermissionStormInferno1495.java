package android.content.Context;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPermissionStormInferno1495 implements FrostHunterGuidelineTitaniumForceAurora8448 {
    public final ConnectivityManager FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterPermissionStormInferno1495(ConnectivityManager connectivityManager) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = connectivityManager;
    }

    @Override // android.content.Context.FrostHunterGuidelineTitaniumForceAurora8448
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        ConnectivityManager connectivityManager = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
