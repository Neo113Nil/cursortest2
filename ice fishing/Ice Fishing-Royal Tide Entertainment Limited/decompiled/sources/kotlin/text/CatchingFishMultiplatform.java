package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class CatchingFishMultiplatform implements Iterator, CatchingFishCardViewFAB {
    public int CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 0;
    public final Object CatchingFishWorkManager;

    public CatchingFishMultiplatform(Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        this.CatchingFishWorkManager = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.CatchingFishDaggerWebsocket < ((CatchingFishRealmHilt) this.CatchingFishWorkManager).CatchingFishParcelableFAB()) {
                }
                break;
            default:
                if (this.CatchingFishDaggerWebsocket < ((Object[]) this.CatchingFishWorkManager).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                CatchingFishRealmHilt catchingFishRealmHilt = (CatchingFishRealmHilt) this.CatchingFishWorkManager;
                int i = this.CatchingFishDaggerWebsocket;
                this.CatchingFishDaggerWebsocket = i + 1;
                return catchingFishRealmHilt.get(i);
            default:
                try {
                    Object[] objArr = (Object[]) this.CatchingFishWorkManager;
                    int i2 = this.CatchingFishDaggerWebsocket;
                    this.CatchingFishDaggerWebsocket = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.CatchingFishDaggerWebsocket--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public CatchingFishMultiplatform(CatchingFishRealmHilt catchingFishRealmHilt) {
        this.CatchingFishWorkManager = catchingFishRealmHilt;
    }
}
