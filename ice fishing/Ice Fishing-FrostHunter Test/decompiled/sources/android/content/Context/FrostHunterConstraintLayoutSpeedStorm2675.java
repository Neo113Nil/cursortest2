package android.content.Context;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterConstraintLayoutSpeedStorm2675 extends AbstractCollection implements Serializable {
    public static final Object[] FrostHunterCameraXPixelTurboCosmos9814 = new Object[0];

    public abstract FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterAlphaAnimationNeoCosmos5761();

    public abstract int FrostHunterBundlePulseFusionHero2475(int i, Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: FrostHunterCameraXPixelTurboCosmos9814, reason: merged with bridge method [inline-methods] */
    public abstract FrostHunterMaterialButtonShadowStrikeOlympian8282 iterator();

    public int FrostHunterLevelListDrawableFusionDragonHero2232() {
        throw new UnsupportedOperationException();
    }

    public int FrostHunterLifecycleBlazeGammaElite2889() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean FrostHunterRemoteConfigSpeedSpeed8566();

    public Object[] FrostHunterServiceEliteCelestialThunder1757() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757();
            if (FrostHunterServiceEliteCelestialThunder1757 != null) {
                return Arrays.copyOfRange(FrostHunterServiceEliteCelestialThunder1757, FrostHunterLevelListDrawableFusionDragonHero2232(), FrostHunterLifecycleBlazeGammaElite2889(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        FrostHunterBundlePulseFusionHero2475(0, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(FrostHunterCameraXPixelTurboCosmos9814);
    }
}
