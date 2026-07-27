package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class CatchingFishLayoutExoPlayer {
    public final CatchingFishRealmManifest CatchingFishReduxKtor;
    public CatchingFishHandlerGson CatchingFishParcelableFAB = null;
    public float CatchingFishSnackbar = 0.0f;
    public final ArrayList CatchingFishCoroutine = new ArrayList();
    public boolean CatchingFishDaggerWebsocket = false;

    public CatchingFishLayoutExoPlayer(CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger) {
        this.CatchingFishReduxKtor = new CatchingFishRealmManifest(this, catchingFishAsyncTaskDagger);
    }

    public final void CatchingFishCoroutine(CatchingFishHandlerGson catchingFishHandlerGson, CatchingFishHandlerGson catchingFishHandlerGson2, CatchingFishHandlerGson catchingFishHandlerGson3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.CatchingFishSnackbar = i;
        }
        if (z) {
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, 1.0f);
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, -1.0f);
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson3, 1.0f);
        } else {
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, -1.0f);
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, 1.0f);
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson3, -1.0f);
        }
    }

    public boolean CatchingFishDaggerWebsocket() {
        return this.CatchingFishParcelableFAB == null && this.CatchingFishSnackbar == 0.0f && this.CatchingFishReduxKtor.CatchingFishReduxKtor() == 0;
    }

    public void CatchingFishLayout(CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer, boolean z) {
        CatchingFishRealmManifest catchingFishRealmManifest = this.CatchingFishReduxKtor;
        catchingFishRealmManifest.getClass();
        float CatchingFishCoroutine = catchingFishRealmManifest.CatchingFishCoroutine(catchingFishLayoutExoPlayer.CatchingFishParcelableFAB);
        catchingFishRealmManifest.CatchingFishViewModelFAB(catchingFishLayoutExoPlayer.CatchingFishParcelableFAB, z);
        CatchingFishRealmManifest catchingFishRealmManifest2 = catchingFishLayoutExoPlayer.CatchingFishReduxKtor;
        int CatchingFishReduxKtor = catchingFishRealmManifest2.CatchingFishReduxKtor();
        for (int i = 0; i < CatchingFishReduxKtor; i++) {
            CatchingFishHandlerGson CatchingFishDaggerWebsocket = catchingFishRealmManifest2.CatchingFishDaggerWebsocket(i);
            catchingFishRealmManifest.CatchingFishParcelableFAB(CatchingFishDaggerWebsocket, catchingFishRealmManifest2.CatchingFishCoroutine(CatchingFishDaggerWebsocket) * CatchingFishCoroutine, z);
        }
        this.CatchingFishSnackbar = (catchingFishLayoutExoPlayer.CatchingFishSnackbar * CatchingFishCoroutine) + this.CatchingFishSnackbar;
        if (z) {
            catchingFishLayoutExoPlayer.CatchingFishParcelableFAB.CatchingFishSnackbar(this);
        }
        if (this.CatchingFishParcelableFAB == null || this.CatchingFishReduxKtor.CatchingFishReduxKtor() != 0) {
            return;
        }
        this.CatchingFishDaggerWebsocket = true;
        catchingFishHandlerOkHttp.CatchingFishSnackbar = true;
    }

    public final void CatchingFishParcelableFAB(CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, int i) {
        this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerOkHttp.CatchingFishFragmentHandler(i), 1.0f);
        this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerOkHttp.CatchingFishFragmentHandler(i), -1.0f);
    }

    public CatchingFishHandlerGson CatchingFishReduxKtor(boolean[] zArr) {
        return CatchingFishWorkManager(zArr, null);
    }

    public final void CatchingFishSnackbar(CatchingFishHandlerGson catchingFishHandlerGson, CatchingFishHandlerGson catchingFishHandlerGson2, CatchingFishHandlerGson catchingFishHandlerGson3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.CatchingFishSnackbar = i;
        }
        if (z) {
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, 1.0f);
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, -1.0f);
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson3, -1.0f);
        } else {
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson, -1.0f);
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, 1.0f);
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson3, 1.0f);
        }
    }

    public final void CatchingFishViewModelFAB(CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, CatchingFishHandlerGson catchingFishHandlerGson, boolean z) {
        if (catchingFishHandlerGson.CatchingFishLayout) {
            float CatchingFishCoroutine = this.CatchingFishReduxKtor.CatchingFishCoroutine(catchingFishHandlerGson);
            this.CatchingFishSnackbar = (catchingFishHandlerGson.CatchingFishViewModelFAB * CatchingFishCoroutine) + this.CatchingFishSnackbar;
            this.CatchingFishReduxKtor.CatchingFishViewModelFAB(catchingFishHandlerGson, z);
            if (z) {
                catchingFishHandlerGson.CatchingFishSnackbar(this);
            }
            if (this.CatchingFishReduxKtor.CatchingFishReduxKtor() == 0) {
                this.CatchingFishDaggerWebsocket = true;
                catchingFishHandlerOkHttp.CatchingFishSnackbar = true;
            }
        }
    }

    public final void CatchingFishViewModelScope(CatchingFishHandlerGson catchingFishHandlerGson) {
        CatchingFishHandlerGson catchingFishHandlerGson2 = this.CatchingFishParcelableFAB;
        if (catchingFishHandlerGson2 != null) {
            this.CatchingFishReduxKtor.CatchingFishViewModelScope(catchingFishHandlerGson2, -1.0f);
            this.CatchingFishParcelableFAB.CatchingFishWorkManager = -1;
            this.CatchingFishParcelableFAB = null;
        }
        float CatchingFishViewModelFAB = this.CatchingFishReduxKtor.CatchingFishViewModelFAB(catchingFishHandlerGson, true) * (-1.0f);
        this.CatchingFishParcelableFAB = catchingFishHandlerGson;
        if (CatchingFishViewModelFAB == 1.0f) {
            return;
        }
        this.CatchingFishSnackbar /= CatchingFishViewModelFAB;
        CatchingFishRealmManifest catchingFishRealmManifest = this.CatchingFishReduxKtor;
        int i = catchingFishRealmManifest.CatchingFishViewModelFAB;
        for (int i2 = 0; i != -1 && i2 < catchingFishRealmManifest.CatchingFishParcelableFAB; i2++) {
            float[] fArr = catchingFishRealmManifest.CatchingFishViewModelScope;
            fArr[i] = fArr[i] / CatchingFishViewModelFAB;
            i = catchingFishRealmManifest.CatchingFishWorkManager[i];
        }
    }

    public final CatchingFishHandlerGson CatchingFishWorkManager(boolean[] zArr, CatchingFishHandlerGson catchingFishHandlerGson) {
        int i;
        int CatchingFishReduxKtor = this.CatchingFishReduxKtor.CatchingFishReduxKtor();
        CatchingFishHandlerGson catchingFishHandlerGson2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < CatchingFishReduxKtor; i2++) {
            float CatchingFishWorkManager = this.CatchingFishReduxKtor.CatchingFishWorkManager(i2);
            if (CatchingFishWorkManager < 0.0f) {
                CatchingFishHandlerGson CatchingFishDaggerWebsocket = this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i2);
                if ((zArr == null || !zArr[CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket]) && CatchingFishDaggerWebsocket != catchingFishHandlerGson && (((i = CatchingFishDaggerWebsocket.CatchingFishAnimationMockk) == 3 || i == 4) && CatchingFishWorkManager < f)) {
                    f = CatchingFishWorkManager;
                    catchingFishHandlerGson2 = CatchingFishDaggerWebsocket;
                }
            }
        }
        return catchingFishHandlerGson2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String CatchingFishEspressoTesting = CatchingFishMVPLiveData.CatchingFishEspressoTesting(this.CatchingFishParcelableFAB == null ? "0" : "" + this.CatchingFishParcelableFAB, " = ");
        if (this.CatchingFishSnackbar != 0.0f) {
            CatchingFishEspressoTesting = CatchingFishEspressoTesting + this.CatchingFishSnackbar;
            z = true;
        } else {
            z = false;
        }
        int CatchingFishReduxKtor = this.CatchingFishReduxKtor.CatchingFishReduxKtor();
        for (int i = 0; i < CatchingFishReduxKtor; i++) {
            CatchingFishHandlerGson CatchingFishDaggerWebsocket = this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i);
            if (CatchingFishDaggerWebsocket != null) {
                float CatchingFishWorkManager = this.CatchingFishReduxKtor.CatchingFishWorkManager(i);
                if (CatchingFishWorkManager != 0.0f) {
                    String catchingFishHandlerGson = CatchingFishDaggerWebsocket.toString();
                    if (!z) {
                        if (CatchingFishWorkManager < 0.0f) {
                            CatchingFishEspressoTesting = CatchingFishMVPLiveData.CatchingFishEspressoTesting(CatchingFishEspressoTesting, "- ");
                            CatchingFishWorkManager *= -1.0f;
                        }
                        CatchingFishEspressoTesting = CatchingFishWorkManager == 1.0f ? CatchingFishMVPLiveData.CatchingFishEspressoTesting(CatchingFishEspressoTesting, catchingFishHandlerGson) : CatchingFishEspressoTesting + CatchingFishWorkManager + " " + catchingFishHandlerGson;
                        z = true;
                    } else if (CatchingFishWorkManager > 0.0f) {
                        CatchingFishEspressoTesting = CatchingFishMVPLiveData.CatchingFishEspressoTesting(CatchingFishEspressoTesting, " + ");
                        if (CatchingFishWorkManager == 1.0f) {
                        }
                        z = true;
                    } else {
                        CatchingFishEspressoTesting = CatchingFishMVPLiveData.CatchingFishEspressoTesting(CatchingFishEspressoTesting, " - ");
                        CatchingFishWorkManager *= -1.0f;
                        if (CatchingFishWorkManager == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? CatchingFishMVPLiveData.CatchingFishEspressoTesting(CatchingFishEspressoTesting, "0.0") : CatchingFishEspressoTesting;
    }
}
