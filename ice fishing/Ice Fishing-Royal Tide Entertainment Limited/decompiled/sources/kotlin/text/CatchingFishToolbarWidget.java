package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishToolbarWidget {
    public boolean CatchingFishCoroutine;
    public int CatchingFishEspressoTesting;
    public final CatchingFishSharedFlowMVI CatchingFishParcelableFAB;
    public CatchingFishMoshiEspresso CatchingFishSnackbar;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;
    public final CatchingFishWidgetToolbar CatchingFishReduxKtor = new CatchingFishWidgetToolbar(1, false);
    public boolean CatchingFishDaggerWebsocket = true;
    public final ArrayList CatchingFishViewModelFAB = new ArrayList();
    public int CatchingFishLayout = -1;
    public int CatchingFishFragmentHandler = -1;
    public int CatchingFishCloudMessaging = -1;

    public CatchingFishToolbarWidget(CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, CatchingFishMoshiEspresso catchingFishMoshiEspresso) {
        this.CatchingFishParcelableFAB = catchingFishSharedFlowMVI;
        this.CatchingFishSnackbar = catchingFishMoshiEspresso;
    }

    public final void CatchingFishCoroutine() {
        int i = this.CatchingFishEspressoTesting;
        if (i > 0) {
            int i2 = this.CatchingFishLayout;
            if (i2 >= 0) {
                CatchingFishSnackbar();
                CatchingFishSpannableMVIFAB catchingFishSpannableMVIFAB = this.CatchingFishSnackbar.CatchingFishParcelableFAB;
                catchingFishSpannableMVIFAB.CatchingFishStripeAPI(CatchingFishAndroidXFlux.CatchingFishCoroutine);
                int i3 = catchingFishSpannableMVIFAB.CatchingFishReduxKtor - catchingFishSpannableMVIFAB.CatchingFishParcelableFAB[catchingFishSpannableMVIFAB.CatchingFishSnackbar - 1].CatchingFishParcelableFAB;
                int[] iArr = catchingFishSpannableMVIFAB.CatchingFishCoroutine;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.CatchingFishLayout = -1;
            } else {
                int i4 = this.CatchingFishCloudMessaging;
                int i5 = this.CatchingFishFragmentHandler;
                CatchingFishSnackbar();
                CatchingFishSpannableMVIFAB catchingFishSpannableMVIFAB2 = this.CatchingFishSnackbar.CatchingFishParcelableFAB;
                catchingFishSpannableMVIFAB2.CatchingFishStripeAPI(CatchingFishFluxViewPager.CatchingFishCoroutine);
                int i6 = catchingFishSpannableMVIFAB2.CatchingFishReduxKtor - catchingFishSpannableMVIFAB2.CatchingFishParcelableFAB[catchingFishSpannableMVIFAB2.CatchingFishSnackbar - 1].CatchingFishParcelableFAB;
                int[] iArr2 = catchingFishSpannableMVIFAB2.CatchingFishCoroutine;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.CatchingFishFragmentHandler = -1;
                this.CatchingFishCloudMessaging = -1;
            }
            this.CatchingFishEspressoTesting = 0;
        }
    }

    public final void CatchingFishDaggerWebsocket(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                CatchingFishUnitTestingFlux.CatchingFishCoroutine("Invalid remove index " + i);
            }
            if (this.CatchingFishLayout == i) {
                this.CatchingFishEspressoTesting += i2;
                return;
            }
            CatchingFishCoroutine();
            this.CatchingFishLayout = i;
            this.CatchingFishEspressoTesting = i2;
        }
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishCoroutine();
        ArrayList arrayList = this.CatchingFishViewModelFAB;
        if (arrayList.isEmpty()) {
            this.CatchingFishViewModelScope++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void CatchingFishReduxKtor(boolean z) {
        CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = this.CatchingFishParcelableFAB;
        int i = z ? catchingFishSharedFlowMVI.CatchingFishMutableLiveData.CatchingFishLayout : catchingFishSharedFlowMVI.CatchingFishMutableLiveData.CatchingFishViewModelScope;
        int i2 = i - this.CatchingFishWorkManager;
        if (i2 < 0) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Tried to seek backward");
        }
        if (i2 > 0) {
            CatchingFishSpannableMVIFAB catchingFishSpannableMVIFAB = this.CatchingFishSnackbar.CatchingFishParcelableFAB;
            catchingFishSpannableMVIFAB.CatchingFishStripeAPI(CatchingFishViewHandler.CatchingFishCoroutine);
            catchingFishSpannableMVIFAB.CatchingFishCoroutine[catchingFishSpannableMVIFAB.CatchingFishReduxKtor - catchingFishSpannableMVIFAB.CatchingFishParcelableFAB[catchingFishSpannableMVIFAB.CatchingFishSnackbar - 1].CatchingFishParcelableFAB] = i2;
            this.CatchingFishWorkManager = i;
        }
    }

    public final void CatchingFishSnackbar() {
        int i = this.CatchingFishViewModelScope;
        if (i > 0) {
            CatchingFishSpannableMVIFAB catchingFishSpannableMVIFAB = this.CatchingFishSnackbar.CatchingFishParcelableFAB;
            catchingFishSpannableMVIFAB.CatchingFishStripeAPI(CatchingFishToastStateFlow.CatchingFishCoroutine);
            catchingFishSpannableMVIFAB.CatchingFishCoroutine[catchingFishSpannableMVIFAB.CatchingFishReduxKtor - catchingFishSpannableMVIFAB.CatchingFishParcelableFAB[catchingFishSpannableMVIFAB.CatchingFishSnackbar - 1].CatchingFishParcelableFAB] = i;
            this.CatchingFishViewModelScope = 0;
        }
        ArrayList arrayList = this.CatchingFishViewModelFAB;
        if (arrayList.isEmpty()) {
            return;
        }
        CatchingFishMoshiEspresso catchingFishMoshiEspresso = this.CatchingFishSnackbar;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        catchingFishMoshiEspresso.getClass();
        if (size != 0) {
            CatchingFishSpannableMVIFAB catchingFishSpannableMVIFAB2 = catchingFishMoshiEspresso.CatchingFishParcelableFAB;
            catchingFishSpannableMVIFAB2.CatchingFishStripeAPI(CatchingFishHiltContextMVVM.CatchingFishCoroutine);
            CatchingFishLayoutRoom.CatchingFishCustomView(catchingFishSpannableMVIFAB2, 0, objArr);
        }
        arrayList.clear();
    }
}
