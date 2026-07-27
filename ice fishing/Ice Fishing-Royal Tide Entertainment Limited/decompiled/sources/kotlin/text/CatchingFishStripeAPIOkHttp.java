package kotlin.text;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIOkHttp implements List, CatchingFishCardViewFAB {
    public final CatchingFishBundleGradle CatchingFishReduxKtor = new CatchingFishBundleGradle(16);
    public final CatchingFishViewFAB CatchingFishDaggerWebsocket = new CatchingFishViewFAB(16);
    public int CatchingFishWorkManager = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long CatchingFishParcelableFAB() {
        long CatchingFishSnackbar = CatchingFishLayoutRoomFAB.CatchingFishSnackbar(Float.POSITIVE_INFINITY, false, false);
        int i = this.CatchingFishWorkManager + 1;
        int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(this);
        if (i > CatchingFishMotionLayout) {
            return CatchingFishSnackbar;
        }
        while (true) {
            CatchingFishViewFAB catchingFishViewFAB = this.CatchingFishDaggerWebsocket;
            if (i < 0) {
                catchingFishViewFAB.getClass();
                break;
            }
            if (i >= catchingFishViewFAB.CatchingFishSnackbar) {
                break;
            }
            long j = catchingFishViewFAB.CatchingFishParcelableFAB[i];
            if (CatchingFishRobolectricHilt.CatchingFishUnitTesting(j, CatchingFishSnackbar) < 0) {
                CatchingFishSnackbar = j;
            }
            if ((CatchingFishRobolectricHilt.CatchingFishDaggerHiltFAB(CatchingFishSnackbar) >= 0.0f || !CatchingFishRobolectricHilt.CatchingFishMutableLiveData(CatchingFishSnackbar)) && i != CatchingFishMotionLayout) {
                i++;
            }
        }
        CatchingFishHiltMVPToast.CatchingFishGradleManifest("Index must be between 0 and size");
        throw null;
    }

    public final void CatchingFishSnackbar(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.CatchingFishReduxKtor.CatchingFishCloudMessaging(i, i2);
        CatchingFishViewFAB catchingFishViewFAB = this.CatchingFishDaggerWebsocket;
        if (i >= 0) {
            int i3 = catchingFishViewFAB.CatchingFishSnackbar;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("The end index must be < start index");
                    throw null;
                }
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = catchingFishViewFAB.CatchingFishParcelableFAB;
                        CatchingFishMVVMHilt.CatchingFishRecyclerView(jArr, jArr, i, i2, i3);
                    }
                    catchingFishViewFAB.CatchingFishSnackbar -= i2 - i;
                    return;
                }
                return;
            }
        } else {
            catchingFishViewFAB.getClass();
        }
        CatchingFishHiltMVPToast.CatchingFishGradleManifest("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.CatchingFishWorkManager = -1;
        this.CatchingFishReduxKtor.CatchingFishCoroutine();
        this.CatchingFishDaggerWebsocket.CatchingFishSnackbar = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof CatchingFishFABStripeAPIFAB) && indexOf((CatchingFishFABStripeAPIFAB) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((CatchingFishFABStripeAPIFAB) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object CatchingFishDaggerWebsocket = this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i);
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(CatchingFishDaggerWebsocket, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (CatchingFishFABStripeAPIFAB) CatchingFishDaggerWebsocket;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof CatchingFishFABStripeAPIFAB)) {
            return -1;
        }
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) obj;
        int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(this);
        if (CatchingFishMotionLayout >= 0) {
            int i = 0;
            while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i), catchingFishFABStripeAPIFAB)) {
                if (i != CatchingFishMotionLayout) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor.CatchingFishViewModelScope();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new CatchingFishEspressoMVI(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof CatchingFishFABStripeAPIFAB)) {
            return -1;
        }
        CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) obj;
        for (int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(this); -1 < CatchingFishMotionLayout; CatchingFishMotionLayout--) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(CatchingFishMotionLayout), catchingFishFABStripeAPIFAB)) {
                return CatchingFishMotionLayout;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new CatchingFishEspressoMVI(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.CatchingFishReduxKtor.CatchingFishSnackbar;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new CatchingFishAndroidXCameraX(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new CatchingFishEspressoMVI(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }
}
