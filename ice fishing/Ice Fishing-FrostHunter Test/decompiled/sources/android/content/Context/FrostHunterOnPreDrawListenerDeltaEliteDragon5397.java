package android.content.Context;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterOnPreDrawListenerDeltaEliteDragon5397 extends FrostHunterAnimationSetHyperionAurora2108 {
    public abstract FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterBundlePulseFusionHero2475(int i, Object obj);

    public abstract FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterCameraXPixelTurboCosmos9814(int i);

    public abstract FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterFlowMaxDragonHero5809(int i, Object obj);

    public abstract FrostHunterLiveDataShadowStrike4842 FrostHunterLevelListDrawableFusionDragonHero2232();

    public FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterLifecycleBlazeGammaElite2889(Collection collection) {
        FrostHunterLiveDataShadowStrike4842 FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232();
        FrostHunterLevelListDrawableFusionDragonHero2232.addAll(collection);
        return FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterServiceEliteCelestialThunder1757();
    }

    public abstract FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterGraphVortexLegendNovaX9071 frostHunterGraphVortexLegendNovaX9071);

    public abstract FrostHunterOnPreDrawListenerDeltaEliteDragon5397 FrostHunterServiceEliteCelestialThunder1757(Object obj);

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // android.content.Context.FrostHunterHandlerThreadNovaXStorm1704, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // android.content.Context.FrostHunterAnimationSetHyperionAurora2108, java.util.List
    public final List subList(int i, int i2) {
        return new FrostHunterZipSolarBlazeMax7129(this, i, i2);
    }
}
