package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class CatchingFishParcelable extends CatchingFishRealmHilt implements List, Collection, CatchingFishCardViewFAB {
    public abstract CatchingFishParcelable CatchingFishCoroutine(Object obj);

    public CatchingFishParcelable CatchingFishDaggerWebsocket(Collection collection) {
        CatchingFishMVPMoshi CatchingFishWorkManager = CatchingFishWorkManager();
        CatchingFishWorkManager.addAll(collection);
        return CatchingFishWorkManager.CatchingFishCoroutine();
    }

    public abstract CatchingFishParcelable CatchingFishLayout(int i, Object obj);

    public abstract CatchingFishParcelable CatchingFishSnackbar(int i, Object obj);

    public abstract CatchingFishParcelable CatchingFishViewModelFAB(int i);

    public abstract CatchingFishParcelable CatchingFishViewModelScope(CatchingFishMVPPicasso catchingFishMVPPicasso);

    public abstract CatchingFishMVPMoshi CatchingFishWorkManager();

    @Override // kotlin.text.CatchingFishFirebase, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.text.CatchingFishFirebase, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.text.CatchingFishRealmHilt, java.util.List
    public final List subList(int i, int i2) {
        return new CatchingFishMockkMockk(this, i, i2);
    }
}
