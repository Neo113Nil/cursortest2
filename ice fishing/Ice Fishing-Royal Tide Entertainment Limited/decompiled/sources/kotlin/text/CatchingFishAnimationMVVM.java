package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAnimationMVVM extends CatchingFishRetrofitHandler {
    public int CatchingFishKtorService;
    public int CatchingFishStateFlowIntent;
    public boolean CatchingFishWebSocketMockk;
    public boolean CatchingFishWidget;

    public final boolean CatchingFishAppCompat() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.CatchingFishGraphQLGlide;
            if (i4 >= i) {
                break;
            }
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = this.CatchingFishFABLayout[i4];
            if ((this.CatchingFishWidget || catchingFishDaggerRetrofit.CatchingFishCoroutine()) && ((((i2 = this.CatchingFishStateFlowIntent) == 0 || i2 == 1) && !catchingFishDaggerRetrofit.CatchingFishPayPal()) || (((i3 = this.CatchingFishStateFlowIntent) == 2 || i3 == 3) && !catchingFishDaggerRetrofit.CatchingFishCardViewView()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.CatchingFishGraphQLGlide; i6++) {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = this.CatchingFishFABLayout[i6];
            if (this.CatchingFishWidget || catchingFishDaggerRetrofit2.CatchingFishCoroutine()) {
                if (!z2) {
                    int i7 = this.CatchingFishStateFlowIntent;
                    if (i7 == 0) {
                        i5 = catchingFishDaggerRetrofit2.CatchingFishLayout(2).CatchingFishReduxKtor();
                    } else if (i7 == 1) {
                        i5 = catchingFishDaggerRetrofit2.CatchingFishLayout(4).CatchingFishReduxKtor();
                    } else if (i7 == 2) {
                        i5 = catchingFishDaggerRetrofit2.CatchingFishLayout(3).CatchingFishReduxKtor();
                    } else if (i7 == 3) {
                        i5 = catchingFishDaggerRetrofit2.CatchingFishLayout(5).CatchingFishReduxKtor();
                    }
                    z2 = true;
                }
                int i8 = this.CatchingFishStateFlowIntent;
                if (i8 == 0) {
                    i5 = Math.min(i5, catchingFishDaggerRetrofit2.CatchingFishLayout(2).CatchingFishReduxKtor());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, catchingFishDaggerRetrofit2.CatchingFishLayout(4).CatchingFishReduxKtor());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, catchingFishDaggerRetrofit2.CatchingFishLayout(3).CatchingFishReduxKtor());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, catchingFishDaggerRetrofit2.CatchingFishLayout(5).CatchingFishReduxKtor());
                }
            }
        }
        int i9 = i5 + this.CatchingFishKtorService;
        int i10 = this.CatchingFishStateFlowIntent;
        if (i10 == 0 || i10 == 1) {
            CatchingFishEspressoMockk(i9, i9);
        } else {
            CatchingFishDagger(i9, i9);
        }
        this.CatchingFishWebSocketMockk = true;
        return true;
    }

    @Override // kotlin.text.CatchingFishDaggerRetrofit
    public final boolean CatchingFishCardViewView() {
        return this.CatchingFishWebSocketMockk;
    }

    @Override // kotlin.text.CatchingFishDaggerRetrofit
    public final boolean CatchingFishCoroutine() {
        return true;
    }

    public final int CatchingFishDataStoreIntent() {
        int i = this.CatchingFishStateFlowIntent;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // kotlin.text.CatchingFishDaggerRetrofit
    public final boolean CatchingFishPayPal() {
        return this.CatchingFishWebSocketMockk;
    }

    @Override // kotlin.text.CatchingFishDaggerRetrofit
    public final void CatchingFishSnackbar(CatchingFishHandlerOkHttp catchingFishHandlerOkHttp, boolean z) {
        boolean z2;
        int i;
        int i2;
        CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr = this.CatchingFishLayoutInflater;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = this.CatchingFishSensorManager;
        catchingFishStripeAPIJUnitArr[0] = catchingFishStripeAPIJUnit;
        int i3 = 2;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit2 = this.CatchingFishEspressoMockk;
        catchingFishStripeAPIJUnitArr[2] = catchingFishStripeAPIJUnit2;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit3 = this.CatchingFishDagger;
        catchingFishStripeAPIJUnitArr[1] = catchingFishStripeAPIJUnit3;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit4 = this.CatchingFishCameraXIntent;
        catchingFishStripeAPIJUnitArr[3] = catchingFishStripeAPIJUnit4;
        for (CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit5 : catchingFishStripeAPIJUnitArr) {
            catchingFishStripeAPIJUnit5.CatchingFishLayout = catchingFishHandlerOkHttp.CatchingFishCloudMessaging(catchingFishStripeAPIJUnit5);
        }
        int i4 = this.CatchingFishStateFlowIntent;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit6 = catchingFishStripeAPIJUnitArr[i4];
        if (!this.CatchingFishWebSocketMockk) {
            CatchingFishAppCompat();
        }
        if (this.CatchingFishWebSocketMockk) {
            this.CatchingFishWebSocketMockk = false;
            int i5 = this.CatchingFishStateFlowIntent;
            if (i5 == 0 || i5 == 1) {
                catchingFishHandlerOkHttp.CatchingFishReduxKtor(catchingFishStripeAPIJUnit.CatchingFishLayout, this.CatchingFishMVVMAppCompat);
                catchingFishHandlerOkHttp.CatchingFishReduxKtor(catchingFishStripeAPIJUnit3.CatchingFishLayout, this.CatchingFishMVVMAppCompat);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    catchingFishHandlerOkHttp.CatchingFishReduxKtor(catchingFishStripeAPIJUnit2.CatchingFishLayout, this.CatchingFishStripeAPI);
                    catchingFishHandlerOkHttp.CatchingFishReduxKtor(catchingFishStripeAPIJUnit4.CatchingFishLayout, this.CatchingFishStripeAPI);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.CatchingFishGraphQLGlide; i6++) {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = this.CatchingFishFABLayout[i6];
            if ((this.CatchingFishWidget || catchingFishDaggerRetrofit.CatchingFishCoroutine()) && ((((i2 = this.CatchingFishStateFlowIntent) == 0 || i2 == 1) && catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor[0] == 3 && catchingFishDaggerRetrofit.CatchingFishSensorManager.CatchingFishWorkManager != null && catchingFishDaggerRetrofit.CatchingFishDagger.CatchingFishWorkManager != null) || ((i2 == 2 || i2 == 3) && catchingFishDaggerRetrofit.CatchingFishGlideWidgetKtor[1] == 3 && catchingFishDaggerRetrofit.CatchingFishEspressoMockk.CatchingFishWorkManager != null && catchingFishDaggerRetrofit.CatchingFishCameraXIntent.CatchingFishWorkManager != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = catchingFishStripeAPIJUnit.CatchingFishViewModelScope() || catchingFishStripeAPIJUnit3.CatchingFishViewModelScope();
        boolean z4 = catchingFishStripeAPIJUnit2.CatchingFishViewModelScope() || catchingFishStripeAPIJUnit4.CatchingFishViewModelScope();
        int i7 = !(!z2 && (((i = this.CatchingFishStateFlowIntent) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.CatchingFishGraphQLGlide) {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit2 = this.CatchingFishFABLayout[i8];
            if (this.CatchingFishWidget || catchingFishDaggerRetrofit2.CatchingFishCoroutine()) {
                CatchingFishHandlerGson CatchingFishCloudMessaging = catchingFishHandlerOkHttp.CatchingFishCloudMessaging(catchingFishDaggerRetrofit2.CatchingFishLayoutInflater[this.CatchingFishStateFlowIntent]);
                CatchingFishStripeAPIJUnit[] catchingFishStripeAPIJUnitArr2 = catchingFishDaggerRetrofit2.CatchingFishLayoutInflater;
                int i9 = this.CatchingFishStateFlowIntent;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit7 = catchingFishStripeAPIJUnitArr2[i9];
                catchingFishStripeAPIJUnit7.CatchingFishLayout = CatchingFishCloudMessaging;
                CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit8 = catchingFishStripeAPIJUnit7.CatchingFishWorkManager;
                int i10 = (catchingFishStripeAPIJUnit8 == null || catchingFishStripeAPIJUnit8.CatchingFishReduxKtor != this) ? 0 : catchingFishStripeAPIJUnit7.CatchingFishViewModelScope;
                if (i9 == 0 || i9 == i3) {
                    CatchingFishHandlerGson catchingFishHandlerGson = catchingFishStripeAPIJUnit6.CatchingFishLayout;
                    int i11 = this.CatchingFishKtorService - i10;
                    CatchingFishLayoutExoPlayer CatchingFishEspressoTesting = catchingFishHandlerOkHttp.CatchingFishEspressoTesting();
                    CatchingFishHandlerGson CatchingFishOkHttp = catchingFishHandlerOkHttp.CatchingFishOkHttp();
                    CatchingFishOkHttp.CatchingFishViewModelScope = 0;
                    CatchingFishEspressoTesting.CatchingFishCoroutine(catchingFishHandlerGson, CatchingFishCloudMessaging, CatchingFishOkHttp, i11);
                    catchingFishHandlerOkHttp.CatchingFishCoroutine(CatchingFishEspressoTesting);
                } else {
                    CatchingFishHandlerGson catchingFishHandlerGson2 = catchingFishStripeAPIJUnit6.CatchingFishLayout;
                    int i12 = this.CatchingFishKtorService + i10;
                    CatchingFishLayoutExoPlayer CatchingFishEspressoTesting2 = catchingFishHandlerOkHttp.CatchingFishEspressoTesting();
                    CatchingFishHandlerGson CatchingFishOkHttp2 = catchingFishHandlerOkHttp.CatchingFishOkHttp();
                    CatchingFishOkHttp2.CatchingFishViewModelScope = 0;
                    CatchingFishEspressoTesting2.CatchingFishSnackbar(catchingFishHandlerGson2, CatchingFishCloudMessaging, CatchingFishOkHttp2, i12);
                    catchingFishHandlerOkHttp.CatchingFishCoroutine(CatchingFishEspressoTesting2);
                }
                catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit6.CatchingFishLayout, CatchingFishCloudMessaging, this.CatchingFishKtorService + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.CatchingFishStateFlowIntent;
        if (i13 == 0) {
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit3.CatchingFishLayout, catchingFishStripeAPIJUnit.CatchingFishLayout, 0, 8);
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit.CatchingFishLayout, this.CatchingFishAppCompat.CatchingFishDagger.CatchingFishLayout, 0, 4);
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit.CatchingFishLayout, this.CatchingFishAppCompat.CatchingFishSensorManager.CatchingFishLayout, 0, 0);
            return;
        }
        if (i13 == 1) {
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit.CatchingFishLayout, catchingFishStripeAPIJUnit3.CatchingFishLayout, 0, 8);
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit.CatchingFishLayout, this.CatchingFishAppCompat.CatchingFishSensorManager.CatchingFishLayout, 0, 4);
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit.CatchingFishLayout, this.CatchingFishAppCompat.CatchingFishDagger.CatchingFishLayout, 0, 0);
        } else if (i13 == 2) {
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit4.CatchingFishLayout, catchingFishStripeAPIJUnit2.CatchingFishLayout, 0, 8);
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit2.CatchingFishLayout, this.CatchingFishAppCompat.CatchingFishCameraXIntent.CatchingFishLayout, 0, 4);
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit2.CatchingFishLayout, this.CatchingFishAppCompat.CatchingFishEspressoMockk.CatchingFishLayout, 0, 0);
        } else if (i13 == 3) {
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit2.CatchingFishLayout, catchingFishStripeAPIJUnit4.CatchingFishLayout, 0, 8);
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit2.CatchingFishLayout, this.CatchingFishAppCompat.CatchingFishEspressoMockk.CatchingFishLayout, 0, 4);
            catchingFishHandlerOkHttp.CatchingFishDaggerWebsocket(catchingFishStripeAPIJUnit2.CatchingFishLayout, this.CatchingFishAppCompat.CatchingFishCameraXIntent.CatchingFishLayout, 0, 0);
        }
    }

    @Override // kotlin.text.CatchingFishDaggerRetrofit
    public final String toString() {
        String CatchingFishStateLiveData = CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder("[Barrier] "), this.CatchingFishReduxMoshi, " {");
        for (int i = 0; i < this.CatchingFishGraphQLGlide; i++) {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = this.CatchingFishFABLayout[i];
            if (i > 0) {
                CatchingFishStateLiveData = CatchingFishMVPLiveData.CatchingFishEspressoTesting(CatchingFishStateLiveData, ", ");
            }
            CatchingFishStateLiveData = CatchingFishStateLiveData + catchingFishDaggerRetrofit.CatchingFishReduxMoshi;
        }
        return CatchingFishMVPLiveData.CatchingFishEspressoTesting(CatchingFishStateLiveData, "}");
    }
}
