package android.content.Context;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterActionBarOmegaNebulaCyber1524 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterOnGlobalLayoutListenerCelestialTurboDragon8761 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterActionBarOmegaNebulaCyber1524(Configuration configuration, FrostHunterOnGlobalLayoutListenerCelestialTurboDragon8761 frostHunterOnGlobalLayoutListenerCelestialTurboDragon8761) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = configuration;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterOnGlobalLayoutListenerCelestialTurboDragon8761;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        configuration2.updateFrom(configuration);
        Iterator it = this.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761.entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() != null) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                return;
            }
            it.remove();
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761.clear();
    }
}
