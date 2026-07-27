package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishAnimationMVP {
    public int CatchingFishCloudMessaging;
    public final int CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public final CatchingFishWidgetToolbar CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public int CatchingFishOkHttp;
    public final CatchingFishMVVMMVIRoom CatchingFishParcelableFAB;
    public Object[] CatchingFishReduxKtor;
    public final int[] CatchingFishSnackbar;
    public boolean CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishAnimationMVP(CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom) {
        this.CatchingFishParcelableFAB = catchingFishMVVMMVIRoom;
        this.CatchingFishSnackbar = catchingFishMVVMMVIRoom.CatchingFishReduxKtor;
        int i = catchingFishMVVMMVIRoom.CatchingFishDaggerWebsocket;
        this.CatchingFishCoroutine = i;
        this.CatchingFishReduxKtor = catchingFishMVVMMVIRoom.CatchingFishWorkManager;
        this.CatchingFishDaggerWebsocket = catchingFishMVVMMVIRoom.CatchingFishViewModelScope;
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishLayout = -1;
        this.CatchingFishFragmentHandler = new CatchingFishWidgetToolbar(1, false);
    }

    public final int CatchingFish() {
        if (!(this.CatchingFishCloudMessaging == 0)) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Cannot skip while in an empty region");
        }
        int i = this.CatchingFishViewModelScope;
        int[] iArr = this.CatchingFishSnackbar;
        int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.CatchingFishViewModelScope = CatchingFishMockkKtorGlide.CatchingFishParcelableFAB(iArr, i) + i;
        return i2;
    }

    public final int CatchingFishAnimationMockk(int i) {
        return this.CatchingFishSnackbar[(i * 5) + 1] & 67108863;
    }

    public final boolean CatchingFishCloudMessaging(int i) {
        return (this.CatchingFishSnackbar[(i * 5) + 1] & 536870912) != 0;
    }

    public final void CatchingFishCoroutine() {
        this.CatchingFishWorkManager = true;
        CatchingFishMVVMMVIRoom catchingFishMVVMMVIRoom = this.CatchingFishParcelableFAB;
        catchingFishMVVMMVIRoom.getClass();
        if (this.CatchingFishParcelableFAB != catchingFishMVVMMVIRoom || catchingFishMVVMMVIRoom.CatchingFishViewModelFAB <= 0) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Unexpected reader close()");
        }
        catchingFishMVVMMVIRoom.CatchingFishViewModelFAB--;
        this.CatchingFishReduxKtor = new Object[0];
    }

    public final void CatchingFishCoroutineFlow() {
        if (this.CatchingFishCloudMessaging <= 0) {
            int i = this.CatchingFishLayout;
            int i2 = this.CatchingFishViewModelScope;
            int[] iArr = this.CatchingFishSnackbar;
            if (!(iArr[(i2 * 5) + 2] == i)) {
                CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("Invalid slot table detected");
            }
            int i3 = this.CatchingFishEspressoTesting;
            int i4 = this.CatchingFishOkHttp;
            CatchingFishWidgetToolbar catchingFishWidgetToolbar = this.CatchingFishFragmentHandler;
            if (i3 == 0 && i4 == 0) {
                catchingFishWidgetToolbar.CatchingFishReduxKtor(-1);
            } else {
                catchingFishWidgetToolbar.CatchingFishReduxKtor(i3);
            }
            this.CatchingFishLayout = i2;
            this.CatchingFishViewModelFAB = CatchingFishMockkKtorGlide.CatchingFishParcelableFAB(iArr, i2) + i2;
            int i5 = i2 + 1;
            this.CatchingFishViewModelScope = i5;
            this.CatchingFishEspressoTesting = CatchingFishMockkKtorGlide.CatchingFishCoroutine(iArr, i2);
            this.CatchingFishOkHttp = i2 >= this.CatchingFishCoroutine - 1 ? this.CatchingFishDaggerWebsocket : iArr[(i5 * 5) + 4];
        }
    }

    public final void CatchingFishDaggerWebsocket() {
        if (this.CatchingFishCloudMessaging == 0) {
            if (!(this.CatchingFishViewModelScope == this.CatchingFishViewModelFAB)) {
                CatchingFishUnitTestingFlux.CatchingFishCoroutine("endGroup() not called at the end of a group");
            }
            int i = (this.CatchingFishLayout * 5) + 2;
            int[] iArr = this.CatchingFishSnackbar;
            int i2 = iArr[i];
            this.CatchingFishLayout = i2;
            int i3 = this.CatchingFishCoroutine;
            this.CatchingFishViewModelFAB = i2 < 0 ? i3 : CatchingFishMockkKtorGlide.CatchingFishParcelableFAB(iArr, i2) + i2;
            int CatchingFishCoroutine = this.CatchingFishFragmentHandler.CatchingFishCoroutine();
            if (CatchingFishCoroutine < 0) {
                this.CatchingFishEspressoTesting = 0;
                this.CatchingFishOkHttp = 0;
            } else {
                this.CatchingFishEspressoTesting = CatchingFishCoroutine;
                this.CatchingFishOkHttp = i2 >= i3 - 1 ? this.CatchingFishDaggerWebsocket : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final boolean CatchingFishEspressoTesting(int i) {
        return (this.CatchingFishSnackbar[(i * 5) + 1] & 1073741824) != 0;
    }

    public final boolean CatchingFishFragmentHandler(int i) {
        return (this.CatchingFishSnackbar[(i * 5) + 1] & 134217728) != 0;
    }

    public final void CatchingFishJetpackCompose() {
        if (!(this.CatchingFishCloudMessaging == 0)) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Cannot skip the enclosing group while in an empty region");
        }
        this.CatchingFishViewModelScope = this.CatchingFishViewModelFAB;
        this.CatchingFishEspressoTesting = 0;
        this.CatchingFishOkHttp = 0;
    }

    public final int CatchingFishLayout(int i) {
        return this.CatchingFishSnackbar[i * 5];
    }

    public final void CatchingFishNavigation(int i) {
        if (!(this.CatchingFishCloudMessaging == 0)) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Cannot reposition while in an empty region");
        }
        this.CatchingFishViewModelScope = i;
        int[] iArr = this.CatchingFishSnackbar;
        int i2 = this.CatchingFishCoroutine;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.CatchingFishLayout) {
            this.CatchingFishLayout = i3;
            if (i3 < 0) {
                this.CatchingFishViewModelFAB = i2;
            } else {
                this.CatchingFishViewModelFAB = CatchingFishMockkKtorGlide.CatchingFishParcelableFAB(iArr, i3) + i3;
            }
            this.CatchingFishEspressoTesting = 0;
            this.CatchingFishOkHttp = 0;
        }
    }

    public final Object CatchingFishOkHttp() {
        int i;
        if (this.CatchingFishCloudMessaging > 0 || (i = this.CatchingFishEspressoTesting) >= this.CatchingFishOkHttp) {
            this.CatchingFishUnitTesting = false;
            return CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
        }
        this.CatchingFishUnitTesting = true;
        Object[] objArr = this.CatchingFishReduxKtor;
        this.CatchingFishEspressoTesting = i + 1;
        return objArr[i];
    }

    public final CatchingFishMockkPicasso CatchingFishParcelableFAB(int i) {
        ArrayList arrayList = this.CatchingFishParcelableFAB.CatchingFishEspressoTesting;
        int CatchingFishDaggerWebsocket = CatchingFishMockkKtorGlide.CatchingFishDaggerWebsocket(arrayList, i, this.CatchingFishCoroutine);
        if (CatchingFishDaggerWebsocket >= 0) {
            return (CatchingFishMockkPicasso) arrayList.get(CatchingFishDaggerWebsocket);
        }
        CatchingFishMockkPicasso catchingFishMockkPicasso = new CatchingFishMockkPicasso(i);
        arrayList.add(-(CatchingFishDaggerWebsocket + 1), catchingFishMockkPicasso);
        return catchingFishMockkPicasso;
    }

    public final boolean CatchingFishReduxKtor(int i) {
        return (this.CatchingFishSnackbar[(i * 5) + 1] & 67108864) != 0;
    }

    public final int CatchingFishRoomDatabase(int i) {
        return this.CatchingFishSnackbar[(i * 5) + 2];
    }

    public final Object CatchingFishSnackbar(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.CatchingFishReduxKtor[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
    }

    public final Object CatchingFishStateLiveData(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.CatchingFishReduxKtor[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final Object CatchingFishUnitTesting(int i) {
        int i2 = i * 5;
        int[] iArr = this.CatchingFishSnackbar;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.CatchingFishReduxKtor[iArr[i2 + 4]] : CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
        }
        return null;
    }

    public final Object CatchingFishViewModelFAB(int i, int i2) {
        int[] iArr = this.CatchingFishSnackbar;
        int CatchingFishCoroutine = CatchingFishMockkKtorGlide.CatchingFishCoroutine(iArr, i);
        int i3 = i + 1;
        int i4 = CatchingFishCoroutine + i2;
        return i4 < (i3 < this.CatchingFishCoroutine ? iArr[(i3 * 5) + 4] : this.CatchingFishDaggerWebsocket) ? this.CatchingFishReduxKtor[i4] : CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
    }

    public final int CatchingFishViewModelScope() {
        int i = this.CatchingFishViewModelScope;
        if (i >= this.CatchingFishViewModelFAB) {
            return 0;
        }
        return this.CatchingFishSnackbar[i * 5];
    }

    public final Object CatchingFishWorkManager() {
        int i = this.CatchingFishViewModelScope;
        if (i < this.CatchingFishViewModelFAB) {
            return CatchingFishSnackbar(this.CatchingFishSnackbar, i);
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.CatchingFishViewModelScope);
        sb.append(", key=");
        sb.append(CatchingFishViewModelScope());
        sb.append(", parent=");
        sb.append(this.CatchingFishLayout);
        sb.append(", end=");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, this.CatchingFishViewModelFAB, ')');
    }
}
