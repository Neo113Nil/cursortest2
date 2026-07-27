package android.content.Context;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewBindingBetaPhantom6699 implements Iterator {
    public final Iterator FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterFCMCelestialBlazeShadow9371 FrostHunterFragmentBetaMegaVortex6025;
    public Object FrostHunterFlowMaxDragonHero5809 = null;
    public Collection FrostHunterAlertDialogAuroraDelta3200 = null;
    public Iterator FrostHunterKeyframeGammaGamma1197 = FrostHunterTransitionListenerEliteHeroNebula7317.FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterViewBindingBetaPhantom6699(FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371) {
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterFCMCelestialBlazeShadow9371;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterFCMCelestialBlazeShadow9371.FrostHunterKeyframeGammaGamma1197.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.hasNext() || this.FrostHunterKeyframeGammaGamma1197.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.FrostHunterKeyframeGammaGamma1197.hasNext()) {
            Map.Entry entry = (Map.Entry) this.FrostHunterCameraXPixelTurboCosmos9814.next();
            this.FrostHunterFlowMaxDragonHero5809 = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.FrostHunterAlertDialogAuroraDelta3200 = collection;
            this.FrostHunterKeyframeGammaGamma1197 = collection.iterator();
        }
        return this.FrostHunterKeyframeGammaGamma1197.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.FrostHunterKeyframeGammaGamma1197.remove();
        Collection collection = this.FrostHunterAlertDialogAuroraDelta3200;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.FrostHunterCameraXPixelTurboCosmos9814.remove();
        }
        FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterFragmentBetaMegaVortex6025;
        frostHunterFCMCelestialBlazeShadow9371.FrostHunterFragmentBetaMegaVortex6025--;
    }
}
