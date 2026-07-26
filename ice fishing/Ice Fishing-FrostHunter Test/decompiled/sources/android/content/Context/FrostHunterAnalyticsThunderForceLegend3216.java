package android.content.Context;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnalyticsThunderForceLegend3216 extends AbstractSet {
    public final /* synthetic */ Set FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Set FrostHunterFlowMaxDragonHero5809;

    public FrostHunterAnalyticsThunderForceLegend3216(Set set, Set set2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = set;
        this.FrostHunterFlowMaxDragonHero5809 = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.contains(obj) && this.FrostHunterFlowMaxDragonHero5809.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.containsAll(collection) && this.FrostHunterFlowMaxDragonHero5809.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new FrostHunterLooperThreadTurboSolar7605(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.FrostHunterCameraXPixelTurboCosmos9814.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.FrostHunterFlowMaxDragonHero5809.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
