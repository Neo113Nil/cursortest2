package android.content.Context;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterResourcesFusionSpectra8224 extends FrostHunterToolbarMaxShadowStrike9802 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.FrostHunterCameraXPixelTurboCosmos9814).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.FrostHunterCameraXPixelTurboCosmos9814.iterator();
        it.getClass();
        FrostHunterLintPhantomTurbo6249 frostHunterLintPhantomTurbo6249 = this.FrostHunterFlowMaxDragonHero5809;
        frostHunterLintPhantomTurbo6249.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (frostHunterLintPhantomTurbo6249.apply(next)) {
                return next;
            }
        }
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new FrostHunterResourcesFusionSpectra8224(((SortedSet) this.FrostHunterCameraXPixelTurboCosmos9814).headSet(obj), this.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.FrostHunterCameraXPixelTurboCosmos9814;
        while (true) {
            Object last = sortedSet.last();
            if (this.FrostHunterFlowMaxDragonHero5809.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new FrostHunterResourcesFusionSpectra8224(((SortedSet) this.FrostHunterCameraXPixelTurboCosmos9814).subSet(obj, obj2), this.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new FrostHunterResourcesFusionSpectra8224(((SortedSet) this.FrostHunterCameraXPixelTurboCosmos9814).tailSet(obj), this.FrostHunterFlowMaxDragonHero5809);
    }
}
