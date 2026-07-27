package android.content.Context;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterFocusMeteringActionDragonMax2884 extends AbstractMap {
    public final transient Map FrostHunterAlertDialogAuroraDelta3200;
    public transient FrostHunterInAppPurchaseCelestialCyber1719 FrostHunterCameraXPixelTurboCosmos9814;
    public transient FrostHunterVideoCaptureCosmosDragonPrime1103 FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ FrostHunterFCMCelestialBlazeShadow9371 FrostHunterKeyframeGammaGamma1197;

    public FrostHunterFocusMeteringActionDragonMax2884(FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371, Map map) {
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterFCMCelestialBlazeShadow9371;
        this.FrostHunterAlertDialogAuroraDelta3200 = map;
    }

    public final FrostHunterInterpolatorBlazeBetaSolar3346 FrostHunterAlphaAnimationNeoCosmos5761(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterKeyframeGammaGamma1197;
        return new FrostHunterInterpolatorBlazeBetaSolar3346(key, z ? new FrostHunterAccelerometerOlympianFusion1732(frostHunterFCMCelestialBlazeShadow9371, key, list, null) : new FrostHunterRemoteConfigSpectraGammaPhantom2481(frostHunterFCMCelestialBlazeShadow9371, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterKeyframeGammaGamma1197;
        if (this.FrostHunterAlertDialogAuroraDelta3200 == frostHunterFCMCelestialBlazeShadow9371.FrostHunterKeyframeGammaGamma1197) {
            frostHunterFCMCelestialBlazeShadow9371.FrostHunterServiceEliteCelestialThunder1757();
            return;
        }
        FrostHunterThreadCelestialElite3598 frostHunterThreadCelestialElite3598 = new FrostHunterThreadCelestialElite3598(this);
        while (frostHunterThreadCelestialElite3598.hasNext()) {
            frostHunterThreadCelestialElite3598.next();
            frostHunterThreadCelestialElite3598.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.FrostHunterAlertDialogAuroraDelta3200;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        FrostHunterInAppPurchaseCelestialCyber1719 frostHunterInAppPurchaseCelestialCyber1719 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterInAppPurchaseCelestialCyber1719 != null) {
            return frostHunterInAppPurchaseCelestialCyber1719;
        }
        FrostHunterInAppPurchaseCelestialCyber1719 frostHunterInAppPurchaseCelestialCyber17192 = new FrostHunterInAppPurchaseCelestialCyber1719(this);
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterInAppPurchaseCelestialCyber17192;
        return frostHunterInAppPurchaseCelestialCyber17192;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.FrostHunterAlertDialogAuroraDelta3200.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.FrostHunterAlertDialogAuroraDelta3200;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterKeyframeGammaGamma1197;
        return z ? new FrostHunterAccelerometerOlympianFusion1732(frostHunterFCMCelestialBlazeShadow9371, obj, list, null) : new FrostHunterRemoteConfigSpectraGammaPhantom2481(frostHunterFCMCelestialBlazeShadow9371, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.FrostHunterAlertDialogAuroraDelta3200.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterKeyframeGammaGamma1197;
        Set set = frostHunterFCMCelestialBlazeShadow9371.FrostHunterCameraXPixelTurboCosmos9814;
        if (set != null) {
            return set;
        }
        Set FrostHunterBundlePulseFusionHero2475 = frostHunterFCMCelestialBlazeShadow9371.FrostHunterBundlePulseFusionHero2475();
        frostHunterFCMCelestialBlazeShadow9371.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterBundlePulseFusionHero2475;
        return FrostHunterBundlePulseFusionHero2475;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.FrostHunterAlertDialogAuroraDelta3200.remove(obj);
        if (collection == null) {
            return null;
        }
        FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterKeyframeGammaGamma1197;
        List list = (List) frostHunterFCMCelestialBlazeShadow9371.FrostHunterServiceConnectionTurboPhoenixOmega6719.get();
        list.addAll(collection);
        frostHunterFCMCelestialBlazeShadow9371.FrostHunterFragmentBetaMegaVortex6025 -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.FrostHunterAlertDialogAuroraDelta3200.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.FrostHunterAlertDialogAuroraDelta3200.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        FrostHunterVideoCaptureCosmosDragonPrime1103 frostHunterVideoCaptureCosmosDragonPrime1103 = this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterVideoCaptureCosmosDragonPrime1103 != null) {
            return frostHunterVideoCaptureCosmosDragonPrime1103;
        }
        FrostHunterVideoCaptureCosmosDragonPrime1103 frostHunterVideoCaptureCosmosDragonPrime11032 = new FrostHunterVideoCaptureCosmosDragonPrime1103(this);
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterVideoCaptureCosmosDragonPrime11032;
        return frostHunterVideoCaptureCosmosDragonPrime11032;
    }
}
