package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishReduxCustomView extends CatchingFishRealm {
    public final Object CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager = 1;

    public CatchingFishReduxCustomView(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.CatchingFishViewModelScope = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.CatchingFishViewModelScope;
                int i = this.CatchingFishReduxKtor;
                this.CatchingFishReduxKtor = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.CatchingFishReduxKtor++;
                return this.CatchingFishViewModelScope;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.CatchingFishViewModelScope;
                int i = this.CatchingFishReduxKtor - 1;
                this.CatchingFishReduxKtor = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.CatchingFishReduxKtor--;
                return this.CatchingFishViewModelScope;
        }
    }

    public CatchingFishReduxCustomView(int i, Object obj) {
        super(i, 1);
        this.CatchingFishViewModelScope = obj;
    }
}
