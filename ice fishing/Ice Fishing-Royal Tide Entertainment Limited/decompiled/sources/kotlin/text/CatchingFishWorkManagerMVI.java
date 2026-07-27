package kotlin.text;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishWorkManagerMVI implements Iterator {
    public boolean CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor = -1;
    public final /* synthetic */ CatchingFishDaggerHiltToast CatchingFishViewModelScope;
    public Iterator CatchingFishWorkManager;

    public CatchingFishWorkManagerMVI(CatchingFishDaggerHiltToast catchingFishDaggerHiltToast) {
        this.CatchingFishViewModelScope = catchingFishDaggerHiltToast;
    }

    public final Iterator CatchingFishParcelableFAB() {
        if (this.CatchingFishWorkManager == null) {
            this.CatchingFishWorkManager = this.CatchingFishViewModelScope.CatchingFishDaggerWebsocket.entrySet().iterator();
        }
        return this.CatchingFishWorkManager;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.CatchingFishReduxKtor + 1;
        CatchingFishDaggerHiltToast catchingFishDaggerHiltToast = this.CatchingFishViewModelScope;
        return i < catchingFishDaggerHiltToast.CatchingFishReduxKtor.size() || (!catchingFishDaggerHiltToast.CatchingFishDaggerWebsocket.isEmpty() && CatchingFishParcelableFAB().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.CatchingFishDaggerWebsocket = true;
        int i = this.CatchingFishReduxKtor + 1;
        this.CatchingFishReduxKtor = i;
        CatchingFishDaggerHiltToast catchingFishDaggerHiltToast = this.CatchingFishViewModelScope;
        return i < catchingFishDaggerHiltToast.CatchingFishReduxKtor.size() ? (Map.Entry) catchingFishDaggerHiltToast.CatchingFishReduxKtor.get(this.CatchingFishReduxKtor) : (Map.Entry) CatchingFishParcelableFAB().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.CatchingFishDaggerWebsocket = false;
        int i = CatchingFishDaggerHiltToast.CatchingFishLayout;
        CatchingFishDaggerHiltToast catchingFishDaggerHiltToast = this.CatchingFishViewModelScope;
        catchingFishDaggerHiltToast.CatchingFishSnackbar();
        if (this.CatchingFishReduxKtor >= catchingFishDaggerHiltToast.CatchingFishReduxKtor.size()) {
            CatchingFishParcelableFAB().remove();
            return;
        }
        int i2 = this.CatchingFishReduxKtor;
        this.CatchingFishReduxKtor = i2 - 1;
        catchingFishDaggerHiltToast.CatchingFishViewModelFAB(i2);
    }
}
