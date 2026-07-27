package android.content.Context;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterExoPlayerBlazeAuroraPixel5681 implements ListIterator, FrostHunterContextBlazePrimeMax4967 {
    public final List FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterExoPlayerBlazeAuroraPixel5681(int i, List list) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = list;
        this.FrostHunterFlowMaxDragonHero5809 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814.add(this.FrostHunterFlowMaxDragonHero5809, obj);
        this.FrostHunterFlowMaxDragonHero5809++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.FrostHunterFlowMaxDragonHero5809 < this.FrostHunterCameraXPixelTurboCosmos9814.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.FrostHunterFlowMaxDragonHero5809 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterFlowMaxDragonHero5809 = i + 1;
        return this.FrostHunterCameraXPixelTurboCosmos9814.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.FrostHunterFlowMaxDragonHero5809 - 1;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        return this.FrostHunterCameraXPixelTurboCosmos9814.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.FrostHunterFlowMaxDragonHero5809 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.FrostHunterFlowMaxDragonHero5809 - 1;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterCameraXPixelTurboCosmos9814.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814.set(this.FrostHunterFlowMaxDragonHero5809, obj);
    }
}
