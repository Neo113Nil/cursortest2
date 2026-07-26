package android.content.Context;

import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterTransitionListenerBetaUltra3918 implements Runnable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ComponentActivity FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterTransitionListenerBetaUltra3918(ComponentActivity componentActivity, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        ComponentActivity componentActivity = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ComponentActivity.FrostHunterCameraXPixelTurboCosmos9814(componentActivity);
                break;
            default:
                int i2 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                componentActivity.invalidateOptionsMenu();
                break;
        }
    }
}
