package android.content.Context;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterColorStateListGammaAurora6807 extends FrostHunterAlertDialogMasterStrike8440 implements NavigableSet {
    public final /* synthetic */ FrostHunterFCMCelestialBlazeShadow9371 FrostHunterKeyframeGammaGamma1197;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterColorStateListGammaAurora6807(FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371, NavigableMap navigableMap) {
        super(frostHunterFCMCelestialBlazeShadow9371, navigableMap);
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterFCMCelestialBlazeShadow9371;
    }

    @Override // android.content.Context.FrostHunterAlertDialogMasterStrike8440
    /* renamed from: FrostHunterBundlePulseFusionHero2475, reason: merged with bridge method [inline-methods] */
    public final NavigableMap FrostHunterAlphaAnimationNeoCosmos5761() {
        return (NavigableMap) ((SortedMap) this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return FrostHunterAlphaAnimationNeoCosmos5761().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((FrostHunterFaceDetectionOlympianForceTurbo7659) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new FrostHunterColorStateListGammaAurora6807(this.FrostHunterKeyframeGammaGamma1197, FrostHunterAlphaAnimationNeoCosmos5761().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return FrostHunterAlphaAnimationNeoCosmos5761().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new FrostHunterColorStateListGammaAurora6807(this.FrostHunterKeyframeGammaGamma1197, FrostHunterAlphaAnimationNeoCosmos5761().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return FrostHunterAlphaAnimationNeoCosmos5761().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return FrostHunterAlphaAnimationNeoCosmos5761().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        FrostHunterThreadCelestialElite3598 frostHunterThreadCelestialElite3598 = (FrostHunterThreadCelestialElite3598) iterator();
        if (!frostHunterThreadCelestialElite3598.hasNext()) {
            return null;
        }
        Object next = frostHunterThreadCelestialElite3598.next();
        frostHunterThreadCelestialElite3598.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new FrostHunterColorStateListGammaAurora6807(this.FrostHunterKeyframeGammaGamma1197, FrostHunterAlphaAnimationNeoCosmos5761().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new FrostHunterColorStateListGammaAurora6807(this.FrostHunterKeyframeGammaGamma1197, FrostHunterAlphaAnimationNeoCosmos5761().tailMap(obj, z));
    }

    @Override // android.content.Context.FrostHunterAlertDialogMasterStrike8440, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // android.content.Context.FrostHunterAlertDialogMasterStrike8440, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // android.content.Context.FrostHunterAlertDialogMasterStrike8440, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
