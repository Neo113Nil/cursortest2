package android.content.Context;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterToolbarMaxShadowStrike9802 extends AbstractCollection implements Set {
    public final Set FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterLintPhantomTurbo6249 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterToolbarMaxShadowStrike9802(Set set, FrostHunterLintPhantomTurbo6249 frostHunterLintPhantomTurbo6249) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = set;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterLintPhantomTurbo6249;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(this.FrostHunterFlowMaxDragonHero5809.apply(obj));
        return this.FrostHunterCameraXPixelTurboCosmos9814.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(this.FrostHunterFlowMaxDragonHero5809.apply(it.next()));
        }
        return this.FrostHunterCameraXPixelTurboCosmos9814.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.FrostHunterCameraXPixelTurboCosmos9814;
        boolean z = set instanceof RandomAccess;
        FrostHunterLintPhantomTurbo6249 frostHunterLintPhantomTurbo6249 = this.FrostHunterFlowMaxDragonHero5809;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            frostHunterLintPhantomTurbo6249.getClass();
            while (it.hasNext()) {
                if (frostHunterLintPhantomTurbo6249.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        frostHunterLintPhantomTurbo6249.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!frostHunterLintPhantomTurbo6249.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterPagingSourceEclipseDelta8255(list, frostHunterLintPhantomTurbo6249, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterPagingSourceEclipseDelta8255(list, frostHunterLintPhantomTurbo6249, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        Set set = this.FrostHunterCameraXPixelTurboCosmos9814;
        set.getClass();
        try {
            z = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.FrostHunterFlowMaxDragonHero5809.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterConstraintSetCloneMasterUltraRogue2633(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterLevelListDrawableFusionDragonHero2232(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.FrostHunterCameraXPixelTurboCosmos9814.iterator();
        FrostHunterLintPhantomTurbo6249 frostHunterLintPhantomTurbo6249 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterCanvasInfernoVortex4700.FrostHunterServiceInfoHyperionSparkMax9966(frostHunterLintPhantomTurbo6249, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (frostHunterLintPhantomTurbo6249.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.FrostHunterCameraXPixelTurboCosmos9814.iterator();
        it.getClass();
        FrostHunterLintPhantomTurbo6249 frostHunterLintPhantomTurbo6249 = this.FrostHunterFlowMaxDragonHero5809;
        frostHunterLintPhantomTurbo6249.getClass();
        return new FrostHunterLooperThreadTurboSolar7605(it, frostHunterLintPhantomTurbo6249);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.FrostHunterCameraXPixelTurboCosmos9814.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.FrostHunterCameraXPixelTurboCosmos9814.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.FrostHunterFlowMaxDragonHero5809.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.FrostHunterCameraXPixelTurboCosmos9814.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.FrostHunterFlowMaxDragonHero5809.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.FrostHunterCameraXPixelTurboCosmos9814.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.FrostHunterFlowMaxDragonHero5809.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return FrostHunterRemoteConfigPhantomDelta1739.FrostHunterMagnetometerFusionTitanium8202(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return FrostHunterRemoteConfigPhantomDelta1739.FrostHunterMagnetometerFusionTitanium8202(iterator()).toArray(objArr);
    }
}
