package android.content.Context;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCombineEliteEpic6306 {
    public final LinkedHashMap FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterCombineEliteEpic6306(LinkedHashMap linkedHashMap, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = linkedHashMap;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterLayoutInflaterTurboHyperion3832(z);
    }

    public final Map FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce4010;
        Set<Map.Entry> entrySet = this.FrostHunterAlphaAnimationNeoCosmos5761.entrySet();
        int FrostHunterSoundPoolNovaTitanTitan5784 = FrostHunterBroadcastHeroSpectra7879.FrostHunterSoundPoolNovaTitanTitan5784(FrostHunterGroupRogueDeltaMega4192.FrostHunterNestedScrollViewPixelPhantom8605(entrySet));
        if (FrostHunterSoundPoolNovaTitanTitan5784 < 16) {
            FrostHunterSoundPoolNovaTitanTitan5784 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(FrostHunterSoundPoolNovaTitanTitan5784);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                frostHunterLaunchHeroForce4010 = new FrostHunterLaunchHeroForce4010(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                frostHunterLaunchHeroForce4010 = new FrostHunterLaunchHeroForce4010(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(frostHunterLaunchHeroForce4010.FrostHunterCameraXPixelTurboCosmos9814, frostHunterLaunchHeroForce4010.FrostHunterFlowMaxDragonHero5809);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterAdapterCelestialPhantomSpectra4785 frostHunterAdapterCelestialPhantomSpectra4785, Object obj) {
        frostHunterAdapterCelestialPhantomSpectra4785.getClass();
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        LinkedHashMap linkedHashMap = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (obj == null) {
            FrostHunterConstraintSetCloneMasterUltraRogue2633();
            linkedHashMap.remove(frostHunterAdapterCelestialPhantomSpectra4785);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(frostHunterAdapterCelestialPhantomSpectra4785, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(frostHunterAdapterCelestialPhantomSpectra4785, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(frostHunterAdapterCelestialPhantomSpectra4785, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (((AtomicBoolean) this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterFlowMaxDragonHero5809).get()) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof FrostHunterCombineEliteEpic6306) {
            LinkedHashMap linkedHashMap = ((FrostHunterCombineEliteEpic6306) obj).FrostHunterAlphaAnimationNeoCosmos5761;
            LinkedHashMap linkedHashMap2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.FrostHunterAlphaAnimationNeoCosmos5761.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterTransformNovaBetaNovaX5251(this.FrostHunterAlphaAnimationNeoCosmos5761.entrySet(), ",\n", "{\n", "\n}", new FrostHunterResourceUltraUltraLegend1377(20), 24);
    }

    public /* synthetic */ FrostHunterCombineEliteEpic6306(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
