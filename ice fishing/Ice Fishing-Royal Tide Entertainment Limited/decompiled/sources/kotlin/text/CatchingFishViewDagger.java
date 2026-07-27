package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishViewDagger implements Iterator, CatchingFishWebsocketGradle, CatchingFishCardViewFAB {
    public Object CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public CatchingFishWebsocketGradle CatchingFishWorkManager;

    public final RuntimeException CatchingFishParcelableFAB() {
        int i = this.CatchingFishReduxKtor;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.CatchingFishReduxKtor);
    }

    public final void CatchingFishSnackbar(Object obj, CatchingFishRoomDatabinding catchingFishRoomDatabinding) {
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishReduxKtor = 3;
        this.CatchingFishWorkManager = catchingFishRoomDatabinding;
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final void CatchingFishViewModelFAB(Object obj) {
        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
        this.CatchingFishReduxKtor = 4;
    }

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final CatchingFishManifestMockk getContext() {
        return CatchingFishPayPalDataStore.CatchingFishReduxKtor;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.CatchingFishReduxKtor;
            if (i != 0) {
                break;
            }
            this.CatchingFishReduxKtor = 5;
            CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishWorkManager;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishWebsocketGradle);
            this.CatchingFishWorkManager = null;
            catchingFishWebsocketGradle.CatchingFishViewModelFAB(CatchingFishRealmContext.CatchingFishParcelableFAB);
        }
        if (i == 1) {
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw CatchingFishParcelableFAB();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.CatchingFishReduxKtor;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.CatchingFishReduxKtor = 1;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(null);
            throw null;
        }
        if (i != 3) {
            throw CatchingFishParcelableFAB();
        }
        this.CatchingFishReduxKtor = 0;
        Object obj = this.CatchingFishDaggerWebsocket;
        this.CatchingFishDaggerWebsocket = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
