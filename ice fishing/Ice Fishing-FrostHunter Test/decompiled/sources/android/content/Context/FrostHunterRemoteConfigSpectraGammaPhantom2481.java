package android.content.Context;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterRemoteConfigSpectraGammaPhantom2481 extends AbstractCollection implements List {
    public final FrostHunterRemoteConfigSpectraGammaPhantom2481 FrostHunterAlertDialogAuroraDelta3200;
    public final Object FrostHunterCameraXPixelTurboCosmos9814;
    public Collection FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ FrostHunterFCMCelestialBlazeShadow9371 FrostHunterFragmentBetaMegaVortex6025;
    public final Collection FrostHunterKeyframeGammaGamma1197;
    public final /* synthetic */ FrostHunterFCMCelestialBlazeShadow9371 FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterRemoteConfigSpectraGammaPhantom2481(FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371, Object obj, List list, FrostHunterRemoteConfigSpectraGammaPhantom2481 frostHunterRemoteConfigSpectraGammaPhantom2481) {
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterFCMCelestialBlazeShadow9371;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterFCMCelestialBlazeShadow9371;
        this.FrostHunterCameraXPixelTurboCosmos9814 = obj;
        this.FrostHunterFlowMaxDragonHero5809 = list;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterRemoteConfigSpectraGammaPhantom2481;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterRemoteConfigSpectraGammaPhantom2481 == null ? null : frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterFlowMaxDragonHero5809;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterRemoteConfigSpectraGammaPhantom2481 frostHunterRemoteConfigSpectraGammaPhantom2481 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterRemoteConfigSpectraGammaPhantom2481 != null) {
            frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterAlphaAnimationNeoCosmos5761();
        } else {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterKeyframeGammaGamma1197.put(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809);
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
        Collection collection;
        FrostHunterRemoteConfigSpectraGammaPhantom2481 frostHunterRemoteConfigSpectraGammaPhantom2481 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterRemoteConfigSpectraGammaPhantom2481 != null) {
            frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterBundlePulseFusionHero2475();
            if (frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterFlowMaxDragonHero5809 == this.FrostHunterKeyframeGammaGamma1197) {
                return;
            }
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
            return;
        }
        if (!this.FrostHunterFlowMaxDragonHero5809.isEmpty() || (collection = (Collection) this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterKeyframeGammaGamma1197.get(this.FrostHunterCameraXPixelTurboCosmos9814)) == null) {
            return;
        }
        this.FrostHunterFlowMaxDragonHero5809 = collection;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterRemoteConfigSpectraGammaPhantom2481 frostHunterRemoteConfigSpectraGammaPhantom2481 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterRemoteConfigSpectraGammaPhantom2481 != null) {
            frostHunterRemoteConfigSpectraGammaPhantom2481.FrostHunterServiceEliteCelestialThunder1757();
        } else if (this.FrostHunterFlowMaxDragonHero5809.isEmpty()) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterKeyframeGammaGamma1197.remove(this.FrostHunterCameraXPixelTurboCosmos9814);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        boolean isEmpty = this.FrostHunterFlowMaxDragonHero5809.isEmpty();
        boolean add = this.FrostHunterFlowMaxDragonHero5809.add(obj);
        if (add) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterFragmentBetaMegaVortex6025++;
            if (isEmpty) {
                FrostHunterAlphaAnimationNeoCosmos5761();
            }
        }
        return add;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.FrostHunterFlowMaxDragonHero5809).addAll(i, collection);
        if (addAll) {
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterFragmentBetaMegaVortex6025 += this.FrostHunterFlowMaxDragonHero5809.size() - size;
            if (size == 0) {
                FrostHunterAlphaAnimationNeoCosmos5761();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.FrostHunterFlowMaxDragonHero5809.clear();
        this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterFragmentBetaMegaVortex6025 -= size;
        FrostHunterServiceEliteCelestialThunder1757();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        return this.FrostHunterFlowMaxDragonHero5809.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        FrostHunterBundlePulseFusionHero2475();
        return this.FrostHunterFlowMaxDragonHero5809.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        FrostHunterBundlePulseFusionHero2475();
        return this.FrostHunterFlowMaxDragonHero5809.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        FrostHunterBundlePulseFusionHero2475();
        return ((List) this.FrostHunterFlowMaxDragonHero5809).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        FrostHunterBundlePulseFusionHero2475();
        return this.FrostHunterFlowMaxDragonHero5809.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        return ((List) this.FrostHunterFlowMaxDragonHero5809).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        FrostHunterBundlePulseFusionHero2475();
        return new FrostHunterThreadCelestialElite3598(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        return ((List) this.FrostHunterFlowMaxDragonHero5809).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        FrostHunterBundlePulseFusionHero2475();
        return new FrostHunterPropertyValuesHolderPixelPhantom9510(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        boolean remove = this.FrostHunterFlowMaxDragonHero5809.remove(obj);
        if (remove) {
            FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterFragmentBetaMegaVortex6025;
            frostHunterFCMCelestialBlazeShadow9371.FrostHunterFragmentBetaMegaVortex6025--;
            FrostHunterServiceEliteCelestialThunder1757();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.FrostHunterFlowMaxDragonHero5809.removeAll(collection);
        if (removeAll) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterFragmentBetaMegaVortex6025 += this.FrostHunterFlowMaxDragonHero5809.size() - size;
            FrostHunterServiceEliteCelestialThunder1757();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.FrostHunterFlowMaxDragonHero5809.retainAll(collection);
        if (retainAll) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterFragmentBetaMegaVortex6025 += this.FrostHunterFlowMaxDragonHero5809.size() - size;
            FrostHunterServiceEliteCelestialThunder1757();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        return ((List) this.FrostHunterFlowMaxDragonHero5809).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        FrostHunterBundlePulseFusionHero2475();
        return this.FrostHunterFlowMaxDragonHero5809.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        FrostHunterBundlePulseFusionHero2475();
        List subList = ((List) this.FrostHunterFlowMaxDragonHero5809).subList(i, i2);
        FrostHunterRemoteConfigSpectraGammaPhantom2481 frostHunterRemoteConfigSpectraGammaPhantom2481 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterRemoteConfigSpectraGammaPhantom2481 == null) {
            frostHunterRemoteConfigSpectraGammaPhantom2481 = this;
        }
        boolean z = subList instanceof RandomAccess;
        FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        Object obj = this.FrostHunterCameraXPixelTurboCosmos9814;
        return z ? new FrostHunterAccelerometerOlympianFusion1732(frostHunterFCMCelestialBlazeShadow9371, obj, subList, frostHunterRemoteConfigSpectraGammaPhantom2481) : new FrostHunterRemoteConfigSpectraGammaPhantom2481(frostHunterFCMCelestialBlazeShadow9371, obj, subList, frostHunterRemoteConfigSpectraGammaPhantom2481);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        FrostHunterBundlePulseFusionHero2475();
        return this.FrostHunterFlowMaxDragonHero5809.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        FrostHunterBundlePulseFusionHero2475();
        return new FrostHunterPropertyValuesHolderPixelPhantom9510(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        FrostHunterBundlePulseFusionHero2475();
        Object remove = ((List) this.FrostHunterFlowMaxDragonHero5809).remove(i);
        FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        frostHunterFCMCelestialBlazeShadow9371.FrostHunterFragmentBetaMegaVortex6025--;
        FrostHunterServiceEliteCelestialThunder1757();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        FrostHunterBundlePulseFusionHero2475();
        boolean isEmpty = this.FrostHunterFlowMaxDragonHero5809.isEmpty();
        ((List) this.FrostHunterFlowMaxDragonHero5809).add(i, obj);
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterFragmentBetaMegaVortex6025++;
        if (isEmpty) {
            FrostHunterAlphaAnimationNeoCosmos5761();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.FrostHunterFlowMaxDragonHero5809.addAll(collection);
        if (addAll) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterFragmentBetaMegaVortex6025 += this.FrostHunterFlowMaxDragonHero5809.size() - size;
            if (size == 0) {
                FrostHunterAlphaAnimationNeoCosmos5761();
            }
        }
        return addAll;
    }
}
