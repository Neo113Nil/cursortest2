package com.google.common.collect;

import com.squareup.cash.fidesmo.views.ScanningShapePulseKt;
import com.squareup.cash.filament.util.MeshLoaderKt;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class Sets$ImprovedAbstractSet extends AbstractSet {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Sets$ImprovedAbstractSet(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                collection.getClass();
                if (collection instanceof RegularImmutableMultiset) {
                    collection = ((RegularImmutableMultiset) collection).elementSet();
                }
                boolean z = false;
                if (!(collection instanceof Set) || collection.size() <= size()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        z |= remove(it.next());
                    }
                } else {
                    Iterator<E> it2 = iterator();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            z = true;
                        }
                    }
                }
                return z;
            case 1:
                return CustomizeUtils.zzc(this, collection);
            case 2:
                return ScanningShapePulseKt.zzb(this, collection);
            default:
                return MeshLoaderKt.zzb(this, collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                collection.getClass();
                break;
            case 1:
                collection.getClass();
                break;
            case 2:
                collection.getClass();
                break;
            default:
                collection.getClass();
                break;
        }
        return super.retainAll(collection);
    }
}
