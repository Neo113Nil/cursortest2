package android.content.Context;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterWithContextInfernoStormSolar9419 extends AbstractList implements RandomAccess, Serializable {
    public final List FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterFragmentManagerEclipseTurboUltra1848 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterWithContextInfernoStormSolar9419(List list, FrostHunterFragmentManagerEclipseTurboUltra1848 frostHunterFragmentManagerEclipseTurboUltra1848) {
        list.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = list;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFragmentManagerEclipseTurboUltra1848;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.FrostHunterFlowMaxDragonHero5809.apply(this.FrostHunterCameraXPixelTurboCosmos9814.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new FrostHunterTextureViewForceSpeedSpeed9867(this, this.FrostHunterCameraXPixelTurboCosmos9814.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.FrostHunterFlowMaxDragonHero5809.apply(this.FrostHunterCameraXPixelTurboCosmos9814.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.FrostHunterCameraXPixelTurboCosmos9814.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.size();
    }
}
