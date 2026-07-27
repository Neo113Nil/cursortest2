package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishAppCompatHilt implements CatchingFishContextMVP, Set, CatchingFishCardViewFAB {
    public final CatchingFishServiceBundle CatchingFishDaggerWebsocket;
    public final CatchingFishServiceBundle CatchingFishReduxKtor;

    public CatchingFishAppCompatHilt(CatchingFishServiceBundle catchingFishServiceBundle) {
        this.CatchingFishReduxKtor = catchingFishServiceBundle;
        this.CatchingFishDaggerWebsocket = catchingFishServiceBundle;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishServiceBundle catchingFishServiceBundle = this.CatchingFishDaggerWebsocket;
        int i = catchingFishServiceBundle.CatchingFishReduxKtor;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            catchingFishServiceBundle.CatchingFishLayout(it.next());
        }
        return i != catchingFishServiceBundle.CatchingFishReduxKtor;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.CatchingFishDaggerWebsocket.CatchingFishSnackbar();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.CatchingFishReduxKtor.CatchingFishCoroutine(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.CatchingFishReduxKtor.CatchingFishCoroutine(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CatchingFishAppCompatHilt.class != obj.getClass()) {
            return false;
        }
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, ((CatchingFishAppCompatHilt) obj).CatchingFishReduxKtor);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.CatchingFishReduxKtor.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor.CatchingFishViewModelScope();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new CatchingFishRetrofitLayout(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.CatchingFishDaggerWebsocket.CatchingFishCloudMessaging(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishServiceBundle catchingFishServiceBundle = this.CatchingFishDaggerWebsocket;
        catchingFishServiceBundle.getClass();
        int i2 = catchingFishServiceBundle.CatchingFishReduxKtor;
        Iterator it = collection.iterator();
        while (true) {
            int i3 = 1;
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 & 127;
            int i7 = catchingFishServiceBundle.CatchingFishCoroutine;
            int i8 = (i5 >>> 7) & i7;
            while (true) {
                long[] jArr = catchingFishServiceBundle.CatchingFishParcelableFAB;
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                int i11 = i3;
                int i12 = i4;
                long j = (((-i10) >> 63) & (jArr[i9 + i3] << (64 - i10))) | (jArr[i9] >>> i10);
                long j2 = (i6 * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j4) >> 3) + i8) & i7;
                    long j5 = j3;
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishServiceBundle.CatchingFishSnackbar[i], next)) {
                        break;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i4 = i12 + 8;
                i8 = (i8 + i4) & i7;
                i3 = i11;
            }
            if (i >= 0) {
                catchingFishServiceBundle.CatchingFishEspressoTesting(i);
            }
        }
        return i2 != catchingFishServiceBundle.CatchingFishReduxKtor;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z;
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishServiceBundle catchingFishServiceBundle = this.CatchingFishDaggerWebsocket;
        catchingFishServiceBundle.getClass();
        Object[] objArr = catchingFishServiceBundle.CatchingFishSnackbar;
        int i = catchingFishServiceBundle.CatchingFishReduxKtor;
        long[] jArr = catchingFishServiceBundle.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CatchingFishCameraXCameraX.CatchingFishDataStoreIntent(collection, objArr[i5])) {
                                catchingFishServiceBundle.CatchingFishEspressoTesting(i5);
                            }
                        }
                        j >>= 8;
                    }
                    z = false;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    z = false;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        } else {
            z = false;
        }
        if (i != catchingFishServiceBundle.CatchingFishReduxKtor) {
            return true;
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.CatchingFishReduxKtor.CatchingFishReduxKtor;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    public final String toString() {
        return this.CatchingFishReduxKtor.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }
}
