package kotlin.text;

import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.presentation.info.GameInfoActivity;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishFluxPicasso implements CatchingFishJUnitGlide {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFluxPicasso(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        CatchingFishGsonLiveData CatchingFishDaggerHiltFAB;
        CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX;
        CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX2;
        CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX3;
        int i;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                GameInfoActivity gameInfoActivity = (GameInfoActivity) this.CatchingFishDaggerWebsocket;
                int i2 = GameInfoActivity.CatchingFishPayPalService;
                return CatchingFishAdMobFAB.CatchingFishGsonAppCompat(gameInfoActivity);
            case 1:
                return ((MainActivity) this.CatchingFishDaggerWebsocket).CatchingFishCardViewRealm.CatchingFishLayout();
            case 2:
                ((CatchingFishHiltManifest) this.CatchingFishDaggerWebsocket).CatchingFishCoroutine = null;
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 3:
                return new CatchingFishBundleFragment((CatchingFishFluxCameraX) this.CatchingFishDaggerWebsocket);
            case 4:
                CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt = (CatchingFishMVIHandlerHilt) this.CatchingFishDaggerWebsocket;
                synchronized (catchingFishMVIHandlerHilt.CatchingFishSnackbar) {
                    CatchingFishDaggerHiltFAB = catchingFishMVIHandlerHilt.CatchingFishDaggerHiltFAB();
                    if (((CatchingFishContextAndroidX) catchingFishMVIHandlerHilt.CatchingFishJetpackCompose.getValue()).compareTo(CatchingFishContextAndroidX.CatchingFishDaggerWebsocket) <= 0) {
                        Throwable th = catchingFishMVIHandlerHilt.CatchingFishReduxKtor;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (CatchingFishDaggerHiltFAB != null) {
                    ((CatchingFishKtorMockk) CatchingFishDaggerHiltFAB).CatchingFishViewModelFAB(CatchingFishRealmContext.CatchingFishParcelableFAB);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return CatchingFishFirebaseDagger.CatchingFishFragmentFactory((CatchingFishDataStoreFlux) this.CatchingFishDaggerWebsocket);
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishJUnitLiveData catchingFishJUnitLiveData = (CatchingFishJUnitLiveData) this.CatchingFishDaggerWebsocket;
                catchingFishJUnitLiveData.CatchingFishDaggerWebsocket().CatchingFishParcelableFAB(new CatchingFishMoshiMVI(0, catchingFishJUnitLiveData));
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return (ViewParent) this.CatchingFishDaggerWebsocket;
            default:
                CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX4 = (CatchingFishViewMVPAndroidX) this.CatchingFishDaggerWebsocket;
                while (true) {
                    synchronized (catchingFishViewMVPAndroidX4.CatchingFishViewModelScope) {
                        try {
                            if (catchingFishViewMVPAndroidX4.CatchingFishCoroutine) {
                                catchingFishViewMVPAndroidX = catchingFishViewMVPAndroidX4;
                            } else {
                                catchingFishViewMVPAndroidX4.CatchingFishCoroutine = true;
                                try {
                                    CatchingFishFABToast catchingFishFABToast = catchingFishViewMVPAndroidX4.CatchingFishWorkManager;
                                    Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
                                    int i3 = catchingFishFABToast.CatchingFishWorkManager;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        try {
                                            CatchingFishHandlerRedux catchingFishHandlerRedux = (CatchingFishHandlerRedux) objArr[i4];
                                            CatchingFishServiceBundle catchingFishServiceBundle = catchingFishHandlerRedux.CatchingFishViewModelScope;
                                            CatchingFishServiceHandler catchingFishServiceHandler = catchingFishHandlerRedux.CatchingFishParcelableFAB;
                                            Object[] objArr2 = catchingFishServiceBundle.CatchingFishSnackbar;
                                            long[] jArr = catchingFishServiceBundle.CatchingFishParcelableFAB;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i5 = 0;
                                                while (true) {
                                                    long j = jArr[i5];
                                                    catchingFishViewMVPAndroidX3 = catchingFishViewMVPAndroidX4;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i6 = 8;
                                                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                        int i8 = 0;
                                                        while (i8 < i7) {
                                                            if ((j & 255) < 128) {
                                                                i = i6;
                                                                try {
                                                                    catchingFishServiceHandler.CatchingFishFragmentHandler(objArr2[(i5 << 3) + i8]);
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    catchingFishViewMVPAndroidX2 = catchingFishViewMVPAndroidX3;
                                                                    catchingFishViewMVPAndroidX2.CatchingFishCoroutine = false;
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i = i6;
                                                            }
                                                            j >>= i;
                                                            i8++;
                                                            i6 = i;
                                                        }
                                                        if (i7 != i6) {
                                                        }
                                                    }
                                                    if (i5 != length) {
                                                        i5++;
                                                        catchingFishViewMVPAndroidX4 = catchingFishViewMVPAndroidX3;
                                                    }
                                                }
                                            } else {
                                                catchingFishViewMVPAndroidX3 = catchingFishViewMVPAndroidX4;
                                            }
                                            catchingFishServiceBundle.CatchingFishSnackbar();
                                            i4++;
                                            catchingFishViewMVPAndroidX4 = catchingFishViewMVPAndroidX3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            catchingFishViewMVPAndroidX3 = catchingFishViewMVPAndroidX4;
                                        }
                                    }
                                    catchingFishViewMVPAndroidX = catchingFishViewMVPAndroidX4;
                                    catchingFishViewMVPAndroidX.CatchingFishCoroutine = false;
                                } catch (Throwable th4) {
                                    th = th4;
                                    catchingFishViewMVPAndroidX2 = catchingFishViewMVPAndroidX4;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (!catchingFishViewMVPAndroidX.CatchingFishParcelableFAB()) {
                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                    }
                    catchingFishViewMVPAndroidX4 = catchingFishViewMVPAndroidX;
                }
        }
    }
}
