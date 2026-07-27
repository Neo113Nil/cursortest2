package android.content.Context;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInAppPurchaseCelestialCyber1719 extends FrostHunterKaptTitanMegaPhoenix5095 {
    public final /* synthetic */ FrostHunterFocusMeteringActionDragonMax2884 FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterInAppPurchaseCelestialCyber1719(FrostHunterFocusMeteringActionDragonMax2884 frostHunterFocusMeteringActionDragonMax2884) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterFocusMeteringActionDragonMax2884;
    }

    public final Map FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        FrostHunterAlphaAnimationNeoCosmos5761().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlertDialogAuroraDelta3200.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return FrostHunterAlphaAnimationNeoCosmos5761().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new FrostHunterThreadCelestialElite3598(this.FrostHunterCameraXPixelTurboCosmos9814);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        FrostHunterFCMCelestialBlazeShadow9371 frostHunterFCMCelestialBlazeShadow9371 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterKeyframeGammaGamma1197;
        Object key = entry.getKey();
        Map map = frostHunterFCMCelestialBlazeShadow9371.FrostHunterKeyframeGammaGamma1197;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        frostHunterFCMCelestialBlazeShadow9371.FrostHunterFragmentBetaMegaVortex6025 -= size;
        return true;
    }

    @Override // android.content.Context.FrostHunterKaptTitanMegaPhoenix5095, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= this.remove(it.next());
            }
            return z;
        }
    }

    @Override // android.content.Context.FrostHunterKaptTitanMegaPhoenix5095, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterKeyframeGammaGamma1197("expectedSize", size);
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (this.contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.FrostHunterAlphaAnimationNeoCosmos5761().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return FrostHunterAlphaAnimationNeoCosmos5761().size();
    }
}
