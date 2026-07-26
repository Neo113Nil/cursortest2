package android.content.Context;

import java.util.ListIterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterConfigurationTitanHero4370 implements ListIterator, FrostHunterContextBlazePrimeMax4967 {
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;

    public FrostHunterConfigurationTitanHero4370(int i, int i2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.FrostHunterCameraXPixelTurboCosmos9814 < this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.FrostHunterCameraXPixelTurboCosmos9814 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.FrostHunterCameraXPixelTurboCosmos9814 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
