package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishAppCompatFlux implements Iterator {
    public final int CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor = 0;
    public final /* synthetic */ CatchingFishCameraXRealm CatchingFishWorkManager;

    public CatchingFishAppCompatFlux(CatchingFishCameraXRealm catchingFishCameraXRealm) {
        this.CatchingFishWorkManager = catchingFishCameraXRealm;
        this.CatchingFishDaggerWebsocket = catchingFishCameraXRealm.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.CatchingFishReduxKtor < this.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.CatchingFishReduxKtor;
        if (i >= this.CatchingFishDaggerWebsocket) {
            throw new NoSuchElementException();
        }
        this.CatchingFishReduxKtor = i + 1;
        return Byte.valueOf(this.CatchingFishWorkManager.CatchingFishViewModelScope(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
