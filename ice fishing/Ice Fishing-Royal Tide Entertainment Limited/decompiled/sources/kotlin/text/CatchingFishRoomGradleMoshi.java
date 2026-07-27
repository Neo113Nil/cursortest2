package kotlin.text;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class CatchingFishRoomGradleMoshi implements List, CatchingFishViewAndroidX {
    public final int CatchingFishDaggerWebsocket;
    public final CatchingFishViewPagerIntent CatchingFishReduxKtor;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishRoomGradleMoshi(CatchingFishViewPagerIntent catchingFishViewPagerIntent, int i, int i2) {
        this.CatchingFishReduxKtor = catchingFishViewPagerIntent;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
        this.CatchingFishViewModelScope = i2 - i;
    }

    public final void CatchingFishParcelableFAB() {
        if (CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(this.CatchingFishReduxKtor) != this.CatchingFishWorkManager) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        CatchingFishParcelableFAB();
        int i = this.CatchingFishDaggerWebsocket + this.CatchingFishViewModelScope;
        CatchingFishViewPagerIntent catchingFishViewPagerIntent = this.CatchingFishReduxKtor;
        catchingFishViewPagerIntent.add(i, obj);
        this.CatchingFishViewModelScope++;
        this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.CatchingFishViewModelScope, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.CatchingFishViewModelScope > 0) {
            CatchingFishParcelableFAB();
            int i = this.CatchingFishViewModelScope;
            int i2 = this.CatchingFishDaggerWebsocket;
            CatchingFishViewPagerIntent catchingFishViewPagerIntent = this.CatchingFishReduxKtor;
            catchingFishViewPagerIntent.CatchingFishDaggerWebsocket(i2, i + i2);
            this.CatchingFishViewModelScope = 0;
            this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public final Object get(int i) {
        CatchingFishParcelableFAB();
        CatchingFishXMLLayoutGlide.CatchingFishLayout(i, this.CatchingFishViewModelScope);
        return this.CatchingFishReduxKtor.get(this.CatchingFishDaggerWebsocket + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        CatchingFishParcelableFAB();
        int i = this.CatchingFishViewModelScope;
        int i2 = this.CatchingFishDaggerWebsocket;
        Iterator it = CatchingFishOkHttpFAB.CatchingFishMoshiDaggerHilt(i2, i + i2).iterator();
        while (it.hasNext()) {
            int nextInt = ((CatchingFishGradleView) it).nextInt();
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishViewModelScope == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        CatchingFishParcelableFAB();
        int i = this.CatchingFishViewModelScope;
        int i2 = this.CatchingFishDaggerWebsocket;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishReduxKtor.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        CatchingFishParcelable catchingFishParcelable;
        CatchingFishOkHttpStripeAPI CatchingFishCloudMessaging;
        boolean CatchingFishEspressoTesting;
        CatchingFishParcelableFAB();
        CatchingFishViewPagerIntent catchingFishViewPagerIntent = this.CatchingFishReduxKtor;
        int i2 = this.CatchingFishDaggerWebsocket;
        int i3 = this.CatchingFishViewModelScope + i2;
        int size = catchingFishViewPagerIntent.size();
        do {
            synchronized (CatchingFishXMLLayoutGlide.CatchingFishUnitTesting) {
                CatchingFishMockkOkHttp catchingFishMockkOkHttp = catchingFishViewPagerIntent.CatchingFishReduxKtor;
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMockkOkHttp, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                CatchingFishMockkOkHttp catchingFishMockkOkHttp2 = (CatchingFishMockkOkHttp) CatchingFishIntentBundle.CatchingFishLayout(catchingFishMockkOkHttp);
                i = catchingFishMockkOkHttp2.CatchingFishReduxKtor;
                catchingFishParcelable = catchingFishMockkOkHttp2.CatchingFishCoroutine;
            }
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishParcelable);
            CatchingFishMVPMoshi CatchingFishWorkManager = catchingFishParcelable.CatchingFishWorkManager();
            CatchingFishWorkManager.subList(i2, i3).retainAll(collection);
            CatchingFishParcelable CatchingFishCoroutine = CatchingFishWorkManager.CatchingFishCoroutine();
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(CatchingFishCoroutine, catchingFishParcelable)) {
                break;
            }
            CatchingFishMockkOkHttp catchingFishMockkOkHttp3 = catchingFishViewPagerIntent.CatchingFishReduxKtor;
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishMockkOkHttp3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                CatchingFishCloudMessaging = CatchingFishIntentBundle.CatchingFishCloudMessaging();
                CatchingFishEspressoTesting = CatchingFishXMLLayoutGlide.CatchingFishEspressoTesting((CatchingFishMockkOkHttp) CatchingFishIntentBundle.CatchingFishSpannableWidget(catchingFishMockkOkHttp3, catchingFishViewPagerIntent, CatchingFishCloudMessaging), i, CatchingFishCoroutine, true);
            }
            CatchingFishIntentBundle.CatchingFishUnitTesting(CatchingFishCloudMessaging, catchingFishViewPagerIntent);
        } while (!CatchingFishEspressoTesting);
        int size2 = size - catchingFishViewPagerIntent.size();
        if (size2 > 0) {
            this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(this.CatchingFishReduxKtor);
            this.CatchingFishViewModelScope -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        CatchingFishXMLLayoutGlide.CatchingFishLayout(i, this.CatchingFishViewModelScope);
        CatchingFishParcelableFAB();
        int i2 = i + this.CatchingFishDaggerWebsocket;
        CatchingFishViewPagerIntent catchingFishViewPagerIntent = this.CatchingFishReduxKtor;
        Object obj2 = catchingFishViewPagerIntent.set(i2, obj);
        this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.CatchingFishViewModelScope;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= this.CatchingFishViewModelScope)) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("fromIndex or toIndex are out of bounds");
        }
        CatchingFishParcelableFAB();
        int i3 = this.CatchingFishDaggerWebsocket;
        return new CatchingFishRoomGradleMoshi(this.CatchingFishReduxKtor, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        CatchingFishParcelableFAB();
        CatchingFishAdMobRoom catchingFishAdMobRoom = new CatchingFishAdMobRoom();
        catchingFishAdMobRoom.CatchingFishReduxKtor = i - 1;
        return new CatchingFishMVIJUnit(catchingFishAdMobRoom, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        CatchingFishParcelableFAB();
        int i2 = i + this.CatchingFishDaggerWebsocket;
        CatchingFishViewPagerIntent catchingFishViewPagerIntent = this.CatchingFishReduxKtor;
        boolean addAll = catchingFishViewPagerIntent.addAll(i2, collection);
        if (addAll) {
            this.CatchingFishViewModelScope = collection.size() + this.CatchingFishViewModelScope;
            this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        CatchingFishParcelableFAB();
        int i2 = this.CatchingFishDaggerWebsocket + i;
        CatchingFishViewPagerIntent catchingFishViewPagerIntent = this.CatchingFishReduxKtor;
        Object remove = catchingFishViewPagerIntent.remove(i2);
        this.CatchingFishViewModelScope--;
        this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        CatchingFishParcelableFAB();
        int i2 = this.CatchingFishDaggerWebsocket + i;
        CatchingFishViewPagerIntent catchingFishViewPagerIntent = this.CatchingFishReduxKtor;
        catchingFishViewPagerIntent.add(i2, obj);
        this.CatchingFishViewModelScope++;
        this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishJetpackCompose(catchingFishViewPagerIntent);
    }
}
