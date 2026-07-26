package android.content.Context;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterChipGroupOmegaStrike6540 extends FrostHunterLinearLayoutFusionNovaX8650 implements NavigableMap {
    public final /* synthetic */ FrostHunterFCMCelestialBlazeShadow9371 FrostHunterLightSensorForceFusion4241;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterChipGroupOmegaStrike6540(FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371, NavigableMap navigableMap) {
        super(frostHunterFCMCelestialBlazeShadow9371, navigableMap);
        this.FrostHunterLightSensorForceFusion4241 = frostHunterFCMCelestialBlazeShadow9371;
    }

    @Override // android.content.Context.FrostHunterLinearLayoutFusionNovaX8650
    /* renamed from: FrostHunterBundlePulseFusionHero2475 */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // android.content.Context.FrostHunterLinearLayoutFusionNovaX8650
    public final SortedSet FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return new FrostHunterColorStateListGammaAurora6807(this.FrostHunterLightSensorForceFusion4241, FrostHunterServiceEliteCelestialThunder1757());
    }

    @Override // android.content.Context.FrostHunterLinearLayoutFusionNovaX8650
    /* renamed from: FrostHunterLevelListDrawableFusionDragonHero2232, reason: merged with bridge method [inline-methods] */
    public final NavigableMap FrostHunterServiceEliteCelestialThunder1757() {
        return (NavigableMap) ((SortedMap) this.FrostHunterAlertDialogAuroraDelta3200);
    }

    public final FrostHunterInterpolatorBlazeBetaSolar3346 FrostHunterLifecycleBlazeGammaElite2889(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.FrostHunterLightSensorForceFusion4241.FrostHunterServiceConnectionTurboPhoenixOmega6719.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new FrostHunterInterpolatorBlazeBetaSolar3346(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = FrostHunterServiceEliteCelestialThunder1757().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return FrostHunterAlphaAnimationNeoCosmos5761(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return FrostHunterServiceEliteCelestialThunder1757().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new FrostHunterChipGroupOmegaStrike6540(this.FrostHunterLightSensorForceFusion4241, FrostHunterServiceEliteCelestialThunder1757().descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = FrostHunterServiceEliteCelestialThunder1757().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return FrostHunterAlphaAnimationNeoCosmos5761(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = FrostHunterServiceEliteCelestialThunder1757().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return FrostHunterAlphaAnimationNeoCosmos5761(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return FrostHunterServiceEliteCelestialThunder1757().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new FrostHunterChipGroupOmegaStrike6540(this.FrostHunterLightSensorForceFusion4241, FrostHunterServiceEliteCelestialThunder1757().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = FrostHunterServiceEliteCelestialThunder1757().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return FrostHunterAlphaAnimationNeoCosmos5761(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return FrostHunterServiceEliteCelestialThunder1757().higherKey(obj);
    }

    @Override // android.content.Context.FrostHunterLinearLayoutFusionNovaX8650, android.content.Context.FrostHunterFocusMeteringActionDragonMax2884, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = FrostHunterServiceEliteCelestialThunder1757().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return FrostHunterAlphaAnimationNeoCosmos5761(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = FrostHunterServiceEliteCelestialThunder1757().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return FrostHunterAlphaAnimationNeoCosmos5761(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return FrostHunterServiceEliteCelestialThunder1757().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return FrostHunterLifecycleBlazeGammaElite2889(((FrostHunterInAppPurchaseCelestialCyber1719) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return FrostHunterLifecycleBlazeGammaElite2889(((FrostHunterInAppPurchaseCelestialCyber1719) ((FrostHunterFocusMeteringActionDragonMax2884) descendingMap()).entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new FrostHunterChipGroupOmegaStrike6540(this.FrostHunterLightSensorForceFusion4241, FrostHunterServiceEliteCelestialThunder1757().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new FrostHunterChipGroupOmegaStrike6540(this.FrostHunterLightSensorForceFusion4241, FrostHunterServiceEliteCelestialThunder1757().tailMap(obj, z));
    }

    @Override // android.content.Context.FrostHunterLinearLayoutFusionNovaX8650, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // android.content.Context.FrostHunterLinearLayoutFusionNovaX8650, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // android.content.Context.FrostHunterLinearLayoutFusionNovaX8650, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
