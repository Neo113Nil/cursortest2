package kotlin.text;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXIntent implements Iterator, Map.Entry {
    public int CatchingFishDaggerWebsocket = -1;
    public int CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishCameraXRetrofit CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishAndroidXIntent(CatchingFishCameraXRetrofit catchingFishCameraXRetrofit) {
        this.CatchingFishViewModelScope = catchingFishCameraXRetrofit;
        this.CatchingFishReduxKtor = catchingFishCameraXRetrofit.CatchingFishWorkManager - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.CatchingFishWorkManager) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.CatchingFishDaggerWebsocket;
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishViewModelScope;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(key, catchingFishCameraXRetrofit.CatchingFishWorkManager(i)) && CatchingFishFirebaseDagger.CatchingFishOkHttp(entry.getValue(), catchingFishCameraXRetrofit.CatchingFishLayout(this.CatchingFishDaggerWebsocket));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.CatchingFishWorkManager) {
            return this.CatchingFishViewModelScope.CatchingFishWorkManager(this.CatchingFishDaggerWebsocket);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.CatchingFishWorkManager) {
            return this.CatchingFishViewModelScope.CatchingFishLayout(this.CatchingFishDaggerWebsocket);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.CatchingFishDaggerWebsocket < this.CatchingFishReduxKtor;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.CatchingFishWorkManager) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.CatchingFishDaggerWebsocket;
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishViewModelScope;
        Object CatchingFishWorkManager = catchingFishCameraXRetrofit.CatchingFishWorkManager(i);
        Object CatchingFishLayout = catchingFishCameraXRetrofit.CatchingFishLayout(this.CatchingFishDaggerWebsocket);
        return (CatchingFishWorkManager == null ? 0 : CatchingFishWorkManager.hashCode()) ^ (CatchingFishLayout != null ? CatchingFishLayout.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.CatchingFishDaggerWebsocket++;
        this.CatchingFishWorkManager = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.CatchingFishWorkManager) {
            throw new IllegalStateException();
        }
        this.CatchingFishViewModelScope.CatchingFishViewModelScope(this.CatchingFishDaggerWebsocket);
        this.CatchingFishDaggerWebsocket--;
        this.CatchingFishReduxKtor--;
        this.CatchingFishWorkManager = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.CatchingFishWorkManager) {
            return this.CatchingFishViewModelScope.CatchingFishViewModelFAB(this.CatchingFishDaggerWebsocket, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
