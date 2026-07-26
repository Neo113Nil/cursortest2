package android.content.Context;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterFaceDetectionOlympianForceTurbo7659 extends FrostHunterKaptTitanMegaPhoenix5095 {
    public final Map FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterFCMCelestialBlazeShadow9371 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterFaceDetectionOlympianForceTurbo7659(FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371, Map map) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFCMCelestialBlazeShadow9371;
        map.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            FrostHunterThreadCelestialElite3598 frostHunterThreadCelestialElite3598 = (FrostHunterThreadCelestialElite3598) it;
            if (!frostHunterThreadCelestialElite3598.hasNext()) {
                return;
            }
            frostHunterThreadCelestialElite3598.next();
            frostHunterThreadCelestialElite3598.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.FrostHunterCameraXPixelTurboCosmos9814.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.FrostHunterCameraXPixelTurboCosmos9814.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new FrostHunterThreadCelestialElite3598(this, this.FrostHunterCameraXPixelTurboCosmos9814.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.FrostHunterCameraXPixelTurboCosmos9814.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.FrostHunterFlowMaxDragonHero5809.FrostHunterFragmentBetaMegaVortex6025 -= i;
        } else {
            i = 0;
        }
        return i > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.size();
    }
}
