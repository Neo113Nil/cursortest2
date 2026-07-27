package android.content.Context;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLifecycleCameraControllerGammaFusionShadow8317 extends AbstractMap {
    public static final /* synthetic */ int FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
    public boolean FrostHunterAlertDialogAuroraDelta3200;
    public List FrostHunterCameraXPixelTurboCosmos9814;
    public Map FrostHunterFlowMaxDragonHero5809;
    public Map FrostHunterFragmentBetaMegaVortex6025;
    public volatile FrostHunterLicensingNebulaOlympianPulse9341 FrostHunterKeyframeGammaGamma1197;

    public static FrostHunterLifecycleCameraControllerGammaFusionShadow8317 FrostHunterLevelListDrawableFusionDragonHero2232() {
        FrostHunterLifecycleCameraControllerGammaFusionShadow8317 frostHunterLifecycleCameraControllerGammaFusionShadow8317 = new FrostHunterLifecycleCameraControllerGammaFusionShadow8317();
        frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterCameraXPixelTurboCosmos9814 = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterFlowMaxDragonHero5809 = map;
        frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterFragmentBetaMegaVortex6025 = map;
        return frostHunterLifecycleCameraControllerGammaFusionShadow8317;
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(Comparable comparable) {
        int i;
        int size = this.FrostHunterCameraXPixelTurboCosmos9814.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((FrostHunterTextViewNebulaUltra2645) this.FrostHunterCameraXPixelTurboCosmos9814.get(i2)).FrostHunterCameraXPixelTurboCosmos9814);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((FrostHunterTextViewNebulaUltra2645) this.FrostHunterCameraXPixelTurboCosmos9814.get(i4)).FrostHunterCameraXPixelTurboCosmos9814);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final Map.Entry FrostHunterBundlePulseFusionHero2475(int i) {
        return (Map.Entry) this.FrostHunterCameraXPixelTurboCosmos9814.get(i);
    }

    public final Object FrostHunterCameraXPixelTurboCosmos9814(int i) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        Object obj = ((FrostHunterTextViewNebulaUltra2645) this.FrostHunterCameraXPixelTurboCosmos9814.remove(i)).FrostHunterFlowMaxDragonHero5809;
        if (!this.FrostHunterFlowMaxDragonHero5809.isEmpty()) {
            Iterator it = FrostHunterLifecycleBlazeGammaElite2889().entrySet().iterator();
            List list = this.FrostHunterCameraXPixelTurboCosmos9814;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new FrostHunterTextViewNebulaUltra2645(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterAlertDialogAuroraDelta3200) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap FrostHunterLifecycleBlazeGammaElite2889() {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (this.FrostHunterFlowMaxDragonHero5809.isEmpty() && !(this.FrostHunterFlowMaxDragonHero5809 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.FrostHunterFlowMaxDragonHero5809 = treeMap;
            this.FrostHunterFragmentBetaMegaVortex6025 = treeMap.descendingMap();
        }
        return (SortedMap) this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: FrostHunterRemoteConfigSpeedSpeed8566, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(comparable);
        if (FrostHunterAlphaAnimationNeoCosmos5761 >= 0) {
            return ((FrostHunterTextViewNebulaUltra2645) this.FrostHunterCameraXPixelTurboCosmos9814.get(FrostHunterAlphaAnimationNeoCosmos5761)).setValue(obj);
        }
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (this.FrostHunterCameraXPixelTurboCosmos9814.isEmpty() && !(this.FrostHunterCameraXPixelTurboCosmos9814 instanceof ArrayList)) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = new ArrayList(16);
        }
        int i = -(FrostHunterAlphaAnimationNeoCosmos5761 + 1);
        if (i >= 16) {
            return FrostHunterLifecycleBlazeGammaElite2889().put(comparable, obj);
        }
        if (this.FrostHunterCameraXPixelTurboCosmos9814.size() == 16) {
            FrostHunterTextViewNebulaUltra2645 frostHunterTextViewNebulaUltra2645 = (FrostHunterTextViewNebulaUltra2645) this.FrostHunterCameraXPixelTurboCosmos9814.remove(15);
            FrostHunterLifecycleBlazeGammaElite2889().put(frostHunterTextViewNebulaUltra2645.FrostHunterCameraXPixelTurboCosmos9814, frostHunterTextViewNebulaUltra2645.FrostHunterFlowMaxDragonHero5809);
        }
        this.FrostHunterCameraXPixelTurboCosmos9814.add(i, new FrostHunterTextViewNebulaUltra2645(this, comparable, obj));
        return null;
    }

    public final Set FrostHunterServiceEliteCelestialThunder1757() {
        return this.FrostHunterFlowMaxDragonHero5809.isEmpty() ? Collections.EMPTY_SET : this.FrostHunterFlowMaxDragonHero5809.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (!this.FrostHunterCameraXPixelTurboCosmos9814.isEmpty()) {
            this.FrostHunterCameraXPixelTurboCosmos9814.clear();
        }
        if (this.FrostHunterFlowMaxDragonHero5809.isEmpty()) {
            return;
        }
        this.FrostHunterFlowMaxDragonHero5809.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return FrostHunterAlphaAnimationNeoCosmos5761(comparable) >= 0 || this.FrostHunterFlowMaxDragonHero5809.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.FrostHunterKeyframeGammaGamma1197 == null) {
            this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterLicensingNebulaOlympianPulse9341(this, 1);
        }
        return this.FrostHunterKeyframeGammaGamma1197;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterLifecycleCameraControllerGammaFusionShadow8317)) {
            return super.equals(obj);
        }
        FrostHunterLifecycleCameraControllerGammaFusionShadow8317 frostHunterLifecycleCameraControllerGammaFusionShadow8317 = (FrostHunterLifecycleCameraControllerGammaFusionShadow8317) obj;
        int size = size();
        if (size == frostHunterLifecycleCameraControllerGammaFusionShadow8317.size()) {
            int size2 = this.FrostHunterCameraXPixelTurboCosmos9814.size();
            if (size2 != frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterCameraXPixelTurboCosmos9814.size()) {
                return ((AbstractSet) entrySet()).equals(frostHunterLifecycleCameraControllerGammaFusionShadow8317.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (FrostHunterBundlePulseFusionHero2475(i).equals(frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterBundlePulseFusionHero2475(i))) {
                }
            }
            if (size2 != size) {
                return this.FrostHunterFlowMaxDragonHero5809.equals(frostHunterLifecycleCameraControllerGammaFusionShadow8317.FrostHunterFlowMaxDragonHero5809);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(comparable);
        return FrostHunterAlphaAnimationNeoCosmos5761 >= 0 ? ((FrostHunterTextViewNebulaUltra2645) this.FrostHunterCameraXPixelTurboCosmos9814.get(FrostHunterAlphaAnimationNeoCosmos5761)).FrostHunterFlowMaxDragonHero5809 : this.FrostHunterFlowMaxDragonHero5809.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.FrostHunterCameraXPixelTurboCosmos9814.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((FrostHunterTextViewNebulaUltra2645) this.FrostHunterCameraXPixelTurboCosmos9814.get(i2)).hashCode();
        }
        return this.FrostHunterFlowMaxDragonHero5809.size() > 0 ? this.FrostHunterFlowMaxDragonHero5809.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        Comparable comparable = (Comparable) obj;
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(comparable);
        if (FrostHunterAlphaAnimationNeoCosmos5761 >= 0) {
            return FrostHunterCameraXPixelTurboCosmos9814(FrostHunterAlphaAnimationNeoCosmos5761);
        }
        if (this.FrostHunterFlowMaxDragonHero5809.isEmpty()) {
            return null;
        }
        return this.FrostHunterFlowMaxDragonHero5809.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.FrostHunterFlowMaxDragonHero5809.size() + this.FrostHunterCameraXPixelTurboCosmos9814.size();
    }
}
