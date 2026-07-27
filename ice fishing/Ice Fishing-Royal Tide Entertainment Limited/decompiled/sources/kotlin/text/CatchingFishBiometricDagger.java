package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishBiometricDagger {
    public final CatchingFishFluxFluxBundle CatchingFishCoroutine;
    public final CatchingFishReduxBundleMVP CatchingFishDaggerWebsocket;
    public int CatchingFishFragmentHandler;
    public final int CatchingFishLayout;
    public final ArrayList CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final CatchingFishDaggerHiltRedux CatchingFishSnackbar;
    public final int CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final CatchingFishDaggerWebSocket CatchingFishWorkManager;

    public CatchingFishBiometricDagger(ArrayList arrayList, CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, int i, CatchingFishReduxBundleMVP catchingFishReduxBundleMVP, CatchingFishDaggerWebSocket catchingFishDaggerWebSocket, int i2, int i3, int i4) {
        this.CatchingFishParcelableFAB = arrayList;
        this.CatchingFishSnackbar = catchingFishDaggerHiltRedux;
        this.CatchingFishCoroutine = catchingFishFluxFluxBundle;
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishReduxBundleMVP;
        this.CatchingFishWorkManager = catchingFishDaggerWebSocket;
        this.CatchingFishViewModelScope = i2;
        this.CatchingFishViewModelFAB = i3;
        this.CatchingFishLayout = i4;
    }

    public final CatchingFishLayoutRedux CatchingFishParcelableFAB(CatchingFishReduxBundleMVP catchingFishReduxBundleMVP) {
        return CatchingFishSnackbar(catchingFishReduxBundleMVP, this.CatchingFishSnackbar, this.CatchingFishCoroutine);
    }

    public final CatchingFishLayoutRedux CatchingFishSnackbar(CatchingFishReduxBundleMVP catchingFishReduxBundleMVP, CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle) {
        ArrayList arrayList = this.CatchingFishParcelableFAB;
        int size = arrayList.size();
        int i = this.CatchingFishReduxKtor;
        if (i >= size) {
            throw new AssertionError();
        }
        this.CatchingFishFragmentHandler++;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = this.CatchingFishCoroutine;
        if (catchingFishFluxFluxBundle2 != null && !((CatchingFishFragmentFlux) catchingFishFluxFluxBundle2.CatchingFishViewModelScope).CatchingFishViewModelFAB().CatchingFishFragmentHandler(catchingFishReduxBundleMVP.CatchingFishParcelableFAB)) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
        }
        if (catchingFishFluxFluxBundle2 != null && this.CatchingFishFragmentHandler > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
        }
        int i2 = i + 1;
        CatchingFishBiometricDagger catchingFishBiometricDagger = new CatchingFishBiometricDagger(arrayList, catchingFishDaggerHiltRedux, catchingFishFluxFluxBundle, i2, catchingFishReduxBundleMVP, this.CatchingFishWorkManager, this.CatchingFishViewModelScope, this.CatchingFishViewModelFAB, this.CatchingFishLayout);
        CatchingFishDaggerGson catchingFishDaggerGson = (CatchingFishDaggerGson) arrayList.get(i);
        CatchingFishLayoutRedux CatchingFishParcelableFAB = catchingFishDaggerGson.CatchingFishParcelableFAB(catchingFishBiometricDagger);
        if (catchingFishFluxFluxBundle != null && i2 < arrayList.size() && catchingFishBiometricDagger.CatchingFishFragmentHandler != 1) {
            throw new IllegalStateException("network interceptor " + catchingFishDaggerGson + " must call proceed() exactly once");
        }
        if (CatchingFishParcelableFAB == null) {
            throw new NullPointerException("interceptor " + catchingFishDaggerGson + " returned null");
        }
        if (CatchingFishParcelableFAB.CatchingFishFragmentHandler != null) {
            return CatchingFishParcelableFAB;
        }
        throw new IllegalStateException("interceptor " + catchingFishDaggerGson + " returned a response with no body");
    }
}
