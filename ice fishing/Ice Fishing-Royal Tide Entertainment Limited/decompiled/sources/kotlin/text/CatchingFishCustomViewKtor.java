package kotlin.text;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.presentation.play.PlayActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishCustomViewKtor extends CatchingFishPicassoRetrofit implements CatchingFishJUnitGlide {
    public final /* synthetic */ int CatchingFishEspressoTesting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishCustomViewKtor(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.CatchingFishEspressoTesting = i4;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        ContentCaptureSession CatchingFishParcelableFAB;
        CatchingFishExoPlayerBundle catchingFishExoPlayerBundle;
        int i = this.CatchingFishEspressoTesting;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        Object obj = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    CatchingFishJUnitIntent.CatchingFishViewModelFAB(view);
                }
                if (i2 < 29 || (CatchingFishParcelableFAB = CatchingFishJUnitFlux.CatchingFishParcelableFAB(view)) == null) {
                    return null;
                }
                return new CatchingFishCameraXJUnit(CatchingFishParcelableFAB, view);
            case 1:
                CatchingFishKtorLayout catchingFishKtorLayout = (CatchingFishKtorLayout) obj;
                CatchingFishServiceBundle catchingFishServiceBundle = catchingFishKtorLayout.CatchingFishCoroutine;
                CatchingFishServiceBundle catchingFishServiceBundle2 = catchingFishKtorLayout.CatchingFishReduxKtor;
                CatchingFishExoPlayerOkHttp catchingFishExoPlayerOkHttp = catchingFishKtorLayout.CatchingFishParcelableFAB;
                CatchingFishAppCompatWidget catchingFishAppCompatWidget = catchingFishExoPlayerOkHttp.CatchingFishViewModelFAB;
                if (catchingFishAppCompatWidget == null) {
                    Object[] objArr = catchingFishServiceBundle2.CatchingFishSnackbar;
                    long[] jArr = catchingFishServiceBundle2.CatchingFishParcelableFAB;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((CatchingFishAdMobPicasso) objArr[(i3 << 3) + i5]).CatchingFishMVPRobolectric();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                } else {
                    CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = catchingFishAppCompatWidget.CatchingFishReduxKtor;
                    if (catchingFishAppCompatWidget.CatchingFishRoomDatabase) {
                        if (catchingFishServiceBundle.CatchingFishCoroutine(catchingFishAppCompatWidget)) {
                            catchingFishAppCompatWidget.CatchingFishCustomView();
                        }
                        catchingFishAppCompatWidget.CatchingFishMVPRobolectric();
                        if (!catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
                            CatchingFishFluxGradle.CatchingFishSnackbar("visitAncestors called on an unattached node");
                        }
                        CatchingFishBiometricRoom CatchingFishJobScheduler = CatchingFishXMLLayoutGlide.CatchingFishJobScheduler(catchingFishAppCompatWidget);
                        int i6 = 0;
                        while (CatchingFishJobScheduler != null) {
                            if ((((CatchingFishFABStripeAPIFAB) CatchingFishJobScheduler.CatchingFishJobScheduler.CatchingFishFragmentHandler).CatchingFishViewModelScope & 5120) != 0) {
                                while (catchingFishFABStripeAPIFAB != null) {
                                    int i7 = catchingFishFABStripeAPIFAB.CatchingFishWorkManager;
                                    if ((i7 & 5120) != 0) {
                                        if ((i7 & 1024) != 0) {
                                            i6++;
                                        }
                                        if ((catchingFishFABStripeAPIFAB instanceof CatchingFishAdMobPicasso) && catchingFishServiceBundle2.CatchingFishCoroutine(catchingFishFABStripeAPIFAB)) {
                                            if (i6 <= 1) {
                                                ((CatchingFishAdMobPicasso) catchingFishFABStripeAPIFAB).CatchingFishMVPRobolectric();
                                                throw null;
                                            }
                                            ((CatchingFishAdMobPicasso) catchingFishFABStripeAPIFAB).CatchingFishMVPRobolectric();
                                            throw null;
                                        }
                                    }
                                    catchingFishFABStripeAPIFAB = catchingFishFABStripeAPIFAB.CatchingFishViewModelFAB;
                                }
                            }
                            CatchingFishJobScheduler = CatchingFishJobScheduler.CatchingFishRoomDatabase();
                            catchingFishFABStripeAPIFAB = (CatchingFishJobScheduler == null || (catchingFishExoPlayerBundle = CatchingFishJobScheduler.CatchingFishJobScheduler) == null) ? null : (CatchingFishNavigationToast) catchingFishExoPlayerBundle.CatchingFishLayout;
                        }
                        Object[] objArr2 = catchingFishServiceBundle2.CatchingFishSnackbar;
                        long[] jArr2 = catchingFishServiceBundle2.CatchingFishParcelableFAB;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j2 = jArr2[i8];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((j2 & 255) < 128) {
                                            ((CatchingFishAdMobPicasso) objArr2[(i8 << 3) + i10]).CatchingFishMVPRobolectric();
                                            throw null;
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i9 != 8) {
                                    }
                                }
                                if (i8 != length2) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                if (catchingFishExoPlayerOkHttp.CatchingFishViewModelFAB == null || catchingFishExoPlayerOkHttp.CatchingFishCoroutine.CatchingFishMVPRobolectric() == CatchingFishFABBiometric.CatchingFishViewModelScope) {
                    catchingFishExoPlayerOkHttp.CatchingFishCoroutine();
                }
                catchingFishServiceBundle.CatchingFishSnackbar();
                catchingFishServiceBundle2.CatchingFishSnackbar();
                catchingFishKtorLayout.CatchingFishDaggerWebsocket = false;
                return catchingFishRealmContext;
            case 2:
                CatchingFishLiveDataWidget catchingFishLiveDataWidget = (CatchingFishLiveDataWidget) obj;
                CatchingFishGlideLiveData catchingFishGlideLiveData = catchingFishLiveDataWidget.CatchingFishParcelableFAB;
                CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
                CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishGlideLiveData, CatchingFishPayPalLayout.CatchingFishParcelableFAB, new CatchingFishMVVMExoPlayer(catchingFishLiveDataWidget, null), 2);
                return catchingFishRealmContext;
            case 3:
                int i11 = PlayActivity.CatchingFishMVVMAppCompat;
                ((PlayActivity) obj).CatchingFishUnitTesting();
                return catchingFishRealmContext;
            default:
                CatchingFishKtorFlux catchingFishKtorFlux = (CatchingFishKtorFlux) obj;
                if (catchingFishKtorFlux.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket && !((Boolean) catchingFishKtorFlux.CatchingFishReduxKtor.CatchingFishParcelableFAB()).booleanValue()) {
                    catchingFishKtorFlux.CatchingFishCoroutine.setProgress(0);
                    catchingFishKtorFlux.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                }
                return catchingFishRealmContext;
        }
    }
}
