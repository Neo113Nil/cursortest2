package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterVideoCaptureCosmosDragonPrime1103 extends AbstractCollection {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterVideoCaptureCosmosDragonPrime1103(AbstractMap abstractMap) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        this.FrostHunterFlowMaxDragonHero5809 = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((FrostHunterFCMCelestialBlazeShadow9371) obj).FrostHunterServiceEliteCelestialThunder1757();
                break;
            case 1:
                ((FrostHunterGradientDrawablePrimeUltraNeo5802) obj).clear();
                break;
            default:
                ((AbstractMap) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Iterator it = ((FrostHunterFCMCelestialBlazeShadow9371) obj2).FrostHunterAlphaAnimationNeoCosmos5761().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((AbstractMap) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 2:
                return ((AbstractMap) this.FrostHunterFlowMaxDragonHero5809).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new FrostHunterViewBindingBetaPhantom6699((FrostHunterFCMCelestialBlazeShadow9371) obj);
            case 1:
                FrostHunterGradientDrawablePrimeUltraNeo5802 frostHunterGradientDrawablePrimeUltraNeo5802 = (FrostHunterGradientDrawablePrimeUltraNeo5802) obj;
                Map FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterGradientDrawablePrimeUltraNeo5802.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                return FrostHunterConstraintSetCloneMasterUltraRogue2633 != null ? FrostHunterConstraintSetCloneMasterUltraRogue2633.values().iterator() : new FrostHunterGestureDetectorPhantomForceAurora5134(frostHunterGradientDrawablePrimeUltraNeo5802, 2);
            default:
                return new FrostHunterFontFamilyOlympianDelta2902(((AbstractMap) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.FrostHunterFlowMaxDragonHero5809;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(obj, entry.getValue())) {
                            abstractMap.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.FrostHunterFlowMaxDragonHero5809;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.FrostHunterFlowMaxDragonHero5809;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((FrostHunterFCMCelestialBlazeShadow9371) obj).FrostHunterFragmentBetaMegaVortex6025;
            case 1:
                return ((FrostHunterGradientDrawablePrimeUltraNeo5802) obj).size();
            default:
                return ((AbstractMap) obj).size();
        }
    }

    public /* synthetic */ FrostHunterVideoCaptureCosmosDragonPrime1103(int i, Serializable serializable) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = serializable;
    }
}
