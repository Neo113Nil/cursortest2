package android.content.Context;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterLinearLayoutFusionNovaX8650 extends FrostHunterFocusMeteringActionDragonMax2884 implements SortedMap {
    public SortedSet FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ FrostHunterFCMCelestialBlazeShadow9371 FrostHunterServiceConnectionTurboPhoenixOmega6719;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterLinearLayoutFusionNovaX8650(FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371, SortedMap sortedMap) {
        super(frostHunterFCMCelestialBlazeShadow9371, sortedMap);
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterFCMCelestialBlazeShadow9371;
    }

    @Override // android.content.Context.FrostHunterFocusMeteringActionDragonMax2884, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: FrostHunterBundlePulseFusionHero2475, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.FrostHunterFragmentBetaMegaVortex6025;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633();
        this.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public SortedSet FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return new FrostHunterAlertDialogMasterStrike8440(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, FrostHunterServiceEliteCelestialThunder1757());
    }

    public SortedMap FrostHunterServiceEliteCelestialThunder1757() {
        return (SortedMap) this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return FrostHunterServiceEliteCelestialThunder1757().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return FrostHunterServiceEliteCelestialThunder1757().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new FrostHunterLinearLayoutFusionNovaX8650(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, FrostHunterServiceEliteCelestialThunder1757().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return FrostHunterServiceEliteCelestialThunder1757().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new FrostHunterLinearLayoutFusionNovaX8650(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, FrostHunterServiceEliteCelestialThunder1757().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new FrostHunterLinearLayoutFusionNovaX8650(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, FrostHunterServiceEliteCelestialThunder1757().tailMap(obj));
    }
}
