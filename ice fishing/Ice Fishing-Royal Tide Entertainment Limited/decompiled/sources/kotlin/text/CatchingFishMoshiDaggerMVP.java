package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMoshiDaggerMVP {
    public int CatchingFishCoroutine;
    public final boolean CatchingFishDaggerWebsocket;
    public final byte[] CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public CatchingFishMoshiDaggerMVP CatchingFishViewModelScope;
    public CatchingFishMoshiDaggerMVP CatchingFishWorkManager;

    public CatchingFishMoshiDaggerMVP() {
        this.CatchingFishParcelableFAB = new byte[8192];
        this.CatchingFishDaggerWebsocket = true;
        this.CatchingFishReduxKtor = false;
    }

    public final CatchingFishMoshiDaggerMVP CatchingFishCoroutine() {
        this.CatchingFishReduxKtor = true;
        return new CatchingFishMoshiDaggerMVP(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, this.CatchingFishCoroutine, true, false);
    }

    public final CatchingFishMoshiDaggerMVP CatchingFishParcelableFAB() {
        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP = this.CatchingFishWorkManager;
        if (catchingFishMoshiDaggerMVP == this) {
            catchingFishMoshiDaggerMVP = null;
        }
        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP2 = this.CatchingFishViewModelScope;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP2);
        catchingFishMoshiDaggerMVP2.CatchingFishWorkManager = this.CatchingFishWorkManager;
        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP3 = this.CatchingFishWorkManager;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP3);
        catchingFishMoshiDaggerMVP3.CatchingFishViewModelScope = this.CatchingFishViewModelScope;
        this.CatchingFishWorkManager = null;
        this.CatchingFishViewModelScope = null;
        return catchingFishMoshiDaggerMVP;
    }

    public final void CatchingFishReduxKtor(CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP, int i) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMoshiDaggerMVP, "sink");
        byte[] bArr = catchingFishMoshiDaggerMVP.CatchingFishParcelableFAB;
        if (!catchingFishMoshiDaggerMVP.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = catchingFishMoshiDaggerMVP.CatchingFishCoroutine;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (catchingFishMoshiDaggerMVP.CatchingFishReduxKtor) {
                throw new IllegalArgumentException();
            }
            int i4 = catchingFishMoshiDaggerMVP.CatchingFishSnackbar;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            CatchingFishMVVMHilt.CatchingFishLayoutInflater(0, i4, i2, bArr, bArr);
            catchingFishMoshiDaggerMVP.CatchingFishCoroutine -= catchingFishMoshiDaggerMVP.CatchingFishSnackbar;
            catchingFishMoshiDaggerMVP.CatchingFishSnackbar = 0;
        }
        int i5 = catchingFishMoshiDaggerMVP.CatchingFishCoroutine;
        int i6 = this.CatchingFishSnackbar;
        CatchingFishMVVMHilt.CatchingFishLayoutInflater(i5, i6, i6 + i, this.CatchingFishParcelableFAB, bArr);
        catchingFishMoshiDaggerMVP.CatchingFishCoroutine += i;
        this.CatchingFishSnackbar += i;
    }

    public final void CatchingFishSnackbar(CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMoshiDaggerMVP, "segment");
        catchingFishMoshiDaggerMVP.CatchingFishViewModelScope = this;
        catchingFishMoshiDaggerMVP.CatchingFishWorkManager = this.CatchingFishWorkManager;
        CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP2 = this.CatchingFishWorkManager;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP2);
        catchingFishMoshiDaggerMVP2.CatchingFishViewModelScope = catchingFishMoshiDaggerMVP;
        this.CatchingFishWorkManager = catchingFishMoshiDaggerMVP;
    }

    public CatchingFishMoshiDaggerMVP(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "data");
        this.CatchingFishParcelableFAB = bArr;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = i2;
        this.CatchingFishReduxKtor = z;
        this.CatchingFishDaggerWebsocket = z2;
    }
}
