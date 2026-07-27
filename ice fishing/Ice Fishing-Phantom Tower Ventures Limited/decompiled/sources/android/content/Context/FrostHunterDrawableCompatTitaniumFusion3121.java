package android.content.Context;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDrawableCompatTitaniumFusion3121 implements Map {
    public final Map FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterDrawableCompatTitaniumFusion3121(Map map) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.FrostHunterCameraXPixelTurboCosmos9814.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.FrostHunterCameraXPixelTurboCosmos9814.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((FrostHunterToolbarMaxShadowStrike9802) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterBundlePulseFusionHero2475(this.FrostHunterCameraXPixelTurboCosmos9814.entrySet(), new FrostHunterTransformLegendFusionHero7540(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && FrostHunterCardViewHyperionAurora3829.FrostHunterDialogFragmentTurboPhoenixDragon7627(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.FrostHunterCameraXPixelTurboCosmos9814.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterLevelListDrawableFusionDragonHero2232(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.FrostHunterCameraXPixelTurboCosmos9814;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterBundlePulseFusionHero2475(this.FrostHunterCameraXPixelTurboCosmos9814.keySet(), new FrostHunterTransformLegendFusionHero7540(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.FrostHunterCameraXPixelTurboCosmos9814.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.FrostHunterCameraXPixelTurboCosmos9814;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.values();
    }
}
