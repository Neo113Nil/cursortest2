package kotlin.text;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishFragmentRoom extends CatchingFishRealm {
    public int CatchingFishLayout;
    public CatchingFishLayoutDataStore CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public final CatchingFishMVPMoshi CatchingFishWorkManager;

    public CatchingFishFragmentRoom(CatchingFishMVPMoshi catchingFishMVPMoshi, int i) {
        super(i, catchingFishMVPMoshi.CatchingFishCloudMessaging);
        this.CatchingFishWorkManager = catchingFishMVPMoshi;
        this.CatchingFishViewModelScope = catchingFishMVPMoshi.CatchingFishWorkManager();
        this.CatchingFishLayout = -1;
        CatchingFishSnackbar();
    }

    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishViewModelScope != this.CatchingFishWorkManager.CatchingFishWorkManager()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void CatchingFishSnackbar() {
        CatchingFishMVPMoshi catchingFishMVPMoshi = this.CatchingFishWorkManager;
        Object[] objArr = catchingFishMVPMoshi.CatchingFishLayout;
        if (objArr == null) {
            this.CatchingFishViewModelFAB = null;
            return;
        }
        int i = (catchingFishMVPMoshi.CatchingFishCloudMessaging - 1) & (-32);
        int i2 = this.CatchingFishReduxKtor;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (catchingFishMVPMoshi.CatchingFishViewModelScope / 5) + 1;
        CatchingFishLayoutDataStore catchingFishLayoutDataStore = this.CatchingFishViewModelFAB;
        if (catchingFishLayoutDataStore == null) {
            this.CatchingFishViewModelFAB = new CatchingFishLayoutDataStore(objArr, i2, i, i3);
            return;
        }
        catchingFishLayoutDataStore.CatchingFishReduxKtor = i2;
        catchingFishLayoutDataStore.CatchingFishDaggerWebsocket = i;
        catchingFishLayoutDataStore.CatchingFishWorkManager = i3;
        if (catchingFishLayoutDataStore.CatchingFishViewModelScope.length < i3) {
            catchingFishLayoutDataStore.CatchingFishViewModelScope = new Object[i3];
        }
        catchingFishLayoutDataStore.CatchingFishViewModelScope[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        catchingFishLayoutDataStore.CatchingFishViewModelFAB = r6;
        catchingFishLayoutDataStore.CatchingFishSnackbar(i2 - r6, 1);
    }

    @Override // kotlin.text.CatchingFishRealm, java.util.ListIterator
    public final void add(Object obj) {
        CatchingFishParcelableFAB();
        int i = this.CatchingFishReduxKtor;
        CatchingFishMVPMoshi catchingFishMVPMoshi = this.CatchingFishWorkManager;
        catchingFishMVPMoshi.add(i, obj);
        this.CatchingFishReduxKtor++;
        this.CatchingFishDaggerWebsocket = catchingFishMVPMoshi.CatchingFishParcelableFAB();
        this.CatchingFishViewModelScope = catchingFishMVPMoshi.CatchingFishWorkManager();
        this.CatchingFishLayout = -1;
        CatchingFishSnackbar();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        CatchingFishParcelableFAB();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.CatchingFishReduxKtor;
        this.CatchingFishLayout = i;
        CatchingFishLayoutDataStore catchingFishLayoutDataStore = this.CatchingFishViewModelFAB;
        CatchingFishMVPMoshi catchingFishMVPMoshi = this.CatchingFishWorkManager;
        if (catchingFishLayoutDataStore == null) {
            Object[] objArr = catchingFishMVPMoshi.CatchingFishFragmentHandler;
            this.CatchingFishReduxKtor = i + 1;
            return objArr[i];
        }
        if (catchingFishLayoutDataStore.hasNext()) {
            this.CatchingFishReduxKtor++;
            return catchingFishLayoutDataStore.next();
        }
        Object[] objArr2 = catchingFishMVPMoshi.CatchingFishFragmentHandler;
        int i2 = this.CatchingFishReduxKtor;
        this.CatchingFishReduxKtor = i2 + 1;
        return objArr2[i2 - catchingFishLayoutDataStore.CatchingFishDaggerWebsocket];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        CatchingFishParcelableFAB();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.CatchingFishReduxKtor;
        this.CatchingFishLayout = i - 1;
        CatchingFishLayoutDataStore catchingFishLayoutDataStore = this.CatchingFishViewModelFAB;
        CatchingFishMVPMoshi catchingFishMVPMoshi = this.CatchingFishWorkManager;
        if (catchingFishLayoutDataStore == null) {
            Object[] objArr = catchingFishMVPMoshi.CatchingFishFragmentHandler;
            int i2 = i - 1;
            this.CatchingFishReduxKtor = i2;
            return objArr[i2];
        }
        int i3 = catchingFishLayoutDataStore.CatchingFishDaggerWebsocket;
        if (i <= i3) {
            this.CatchingFishReduxKtor = i - 1;
            return catchingFishLayoutDataStore.previous();
        }
        Object[] objArr2 = catchingFishMVPMoshi.CatchingFishFragmentHandler;
        int i4 = i - 1;
        this.CatchingFishReduxKtor = i4;
        return objArr2[i4 - i3];
    }

    @Override // kotlin.text.CatchingFishRealm, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        CatchingFishParcelableFAB();
        int i = this.CatchingFishLayout;
        if (i == -1) {
            throw new IllegalStateException();
        }
        CatchingFishMVPMoshi catchingFishMVPMoshi = this.CatchingFishWorkManager;
        catchingFishMVPMoshi.CatchingFishSnackbar(i);
        int i2 = this.CatchingFishLayout;
        if (i2 < this.CatchingFishReduxKtor) {
            this.CatchingFishReduxKtor = i2;
        }
        this.CatchingFishDaggerWebsocket = catchingFishMVPMoshi.CatchingFishParcelableFAB();
        this.CatchingFishViewModelScope = catchingFishMVPMoshi.CatchingFishWorkManager();
        this.CatchingFishLayout = -1;
        CatchingFishSnackbar();
    }

    @Override // kotlin.text.CatchingFishRealm, java.util.ListIterator
    public final void set(Object obj) {
        CatchingFishParcelableFAB();
        int i = this.CatchingFishLayout;
        if (i == -1) {
            throw new IllegalStateException();
        }
        CatchingFishMVPMoshi catchingFishMVPMoshi = this.CatchingFishWorkManager;
        catchingFishMVPMoshi.set(i, obj);
        this.CatchingFishViewModelScope = catchingFishMVPMoshi.CatchingFishWorkManager();
        CatchingFishSnackbar();
    }
}
