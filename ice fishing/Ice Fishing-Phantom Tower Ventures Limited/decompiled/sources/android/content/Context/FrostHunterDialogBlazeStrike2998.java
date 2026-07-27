package android.content.Context;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterDialogBlazeStrike2998 implements Map, FrostHunterContextBlazePrimeMax4967 {
    public static final FrostHunterDialogBlazeStrike2998 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterDialogBlazeStrike2998(FrostHunterViewBindingEpicEpicLegend9995.FrostHunterLifecycleBlazeGammaElite2889, 0);
    public final FrostHunterViewBindingEpicEpicLegend9995 FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterDialogBlazeStrike2998(FrostHunterViewBindingEpicEpicLegend9995 frostHunterViewBindingEpicEpicLegend9995, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterViewBindingEpicEpicLegend9995;
        this.FrostHunterFlowMaxDragonHero5809 = i;
    }

    public final FrostHunterDialogBlazeStrike2998 FrostHunterAlphaAnimationNeoCosmos5761(Object obj, FrostHunterDrawableOmegaAlpha9484 frostHunterDrawableOmegaAlpha9484) {
        FrostHunterNestedScrollViewMaxEpicEpic6844 FrostHunterLooperThreadBetaHyperionMax1000 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000(obj != null ? obj.hashCode() : 0, 0, obj, frostHunterDrawableOmegaAlpha9484);
        return FrostHunterLooperThreadBetaHyperionMax1000 == null ? this : new FrostHunterDialogBlazeStrike2998((FrostHunterViewBindingEpicEpicLegend9995) FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterFlowMaxDragonHero5809 + FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceEliteCelestialThunder1757(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new FrostHunterMaterialButtonHyperionEclipse7219(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.FrostHunterFlowMaxDragonHero5809 != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.FrostHunterFlowMaxDragonHero5809 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new FrostHunterMaterialButtonHyperionEclipse7219(this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    public final String toString() {
        return FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterTransformNovaBetaNovaX5251(entrySet(), ", ", "{", "}", new FrostHunterDatabaseMasterPrimeSpeed8049(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new FrostHunterPushNotificationDragonVision6411(1, this);
    }
}
