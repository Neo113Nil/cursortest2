package kotlin.text;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishPayPalToast extends CatchingFishPicassoRetrofit implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishEspressoTesting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishPayPalToast(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.CatchingFishEspressoTesting = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    @Override // kotlin.text.CatchingFishServiceHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger;
        int i = this.CatchingFishEspressoTesting;
        int i2 = 2;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        Object obj2 = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGsonAdMob catchingFishGsonAdMob = (CatchingFishGsonAdMob) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGsonAdMob, "p0");
                CatchingFishManifestMVI catchingFishManifestMVI = (CatchingFishManifestMVI) obj2;
                catchingFishManifestMVI.getClass();
                CatchingFishToastGson catchingFishToastGson = catchingFishGsonAdMob.CatchingFishParcelableFAB;
                try {
                    catchingFishToastGson.CatchingFishViewModelFAB();
                } catch (RemoteException unused) {
                }
                CatchingFishFragmentGlide catchingFishFragmentGlide = new CatchingFishFragmentGlide(new CatchingFishBundleGlide(10, new CatchingFishMVINavigation(catchingFishManifestMVI, 1), new CatchingFishMVINavigation(catchingFishManifestMVI, i2)));
                if (catchingFishToastGson.CatchingFishReduxKtor(catchingFishFragmentGlide)) {
                    catchingFishAsyncTaskDagger = new CatchingFishAsyncTaskDagger(catchingFishToastGson, catchingFishFragmentGlide, catchingFishGsonAdMob.CatchingFishSnackbar, 9);
                    catchingFishManifestMVI.CatchingFishWorkManager = catchingFishAsyncTaskDagger;
                    if (catchingFishAsyncTaskDagger != null) {
                        try {
                            ((CatchingFishToastGson) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).CatchingFishSnackbar((CatchingFishFragmentGlide) catchingFishAsyncTaskDagger.CatchingFishWorkManager, Uri.parse("https://pay.google.com"), new Bundle(), null);
                            break;
                        } catch (RemoteException unused2) {
                            break;
                        }
                    }
                }
                catchingFishAsyncTaskDagger = null;
                catchingFishManifestMVI.CatchingFishWorkManager = catchingFishAsyncTaskDagger;
                if (catchingFishAsyncTaskDagger != null) {
                }
                break;
            case 1:
                ((CatchingFishSnackbarRoom) obj2).CatchingFishEspressoTesting((Throwable) obj);
                break;
            case 2:
                String str = (String) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "p0");
                CatchingFishLiveDataWidget catchingFishLiveDataWidget = (CatchingFishLiveDataWidget) obj2;
                CatchingFishGlideLiveData catchingFishGlideLiveData = catchingFishLiveDataWidget.CatchingFishParcelableFAB;
                CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
                CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishGlideLiveData, CatchingFishPayPalLayout.CatchingFishParcelableFAB, new CatchingFishGlideKtorHilt(catchingFishLiveDataWidget, str, null), 2);
                break;
            case 3:
                String str2 = (String) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(str2, "p0");
                ((CatchingFishMoshiFABMVVM) obj2).CatchingFishParcelableFAB(str2);
                break;
            case 4:
                Intent intent = (Intent) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(intent, "p0");
                ((CatchingFishMoshiFABMVVM) obj2).CatchingFishParcelableFAB(intent);
                break;
            default:
                long longValue = ((Number) obj).longValue();
                CatchingFishKtorFlux catchingFishKtorFlux = (CatchingFishKtorFlux) obj2;
                CatchingFishWidgetHilt catchingFishWidgetHilt = catchingFishKtorFlux.CatchingFishParcelableFAB;
                if (catchingFishWidgetHilt.CatchingFishDaggerWebsocket && !((Boolean) catchingFishKtorFlux.CatchingFishReduxKtor.CatchingFishParcelableFAB()).booleanValue()) {
                    catchingFishWidgetHilt.CatchingFishParcelableFAB = longValue;
                    catchingFishKtorFlux.CatchingFishCoroutine.setProgress((int) ((longValue / 60000.0f) * 100));
                    CatchingFishRealmDaggerHilt catchingFishRealmDaggerHilt = CatchingFishPicassoMVVM.CatchingFishReduxKtor;
                    if (CatchingFishPicassoMVVM.CatchingFishReduxKtor.CatchingFishReduxKtor().nextFloat() < 0.05f) {
                        CatchingFishAppCompatGradle catchingFishAppCompatGradle = catchingFishKtorFlux.CatchingFishWorkManager;
                        if (catchingFishAppCompatGradle != null) {
                            catchingFishAppCompatGradle.cancel();
                        }
                        catchingFishWidgetHilt.CatchingFishDaggerWebsocket = false;
                        catchingFishKtorFlux.CatchingFishSnackbar.postDelayed(new CatchingFishMVPLayout(18, catchingFishKtorFlux), 3000L);
                        break;
                    }
                } else {
                    CatchingFishAppCompatGradle catchingFishAppCompatGradle2 = catchingFishKtorFlux.CatchingFishWorkManager;
                    if (catchingFishAppCompatGradle2 != null) {
                        catchingFishAppCompatGradle2.cancel();
                        break;
                    }
                }
                break;
        }
        return catchingFishRealmContext;
        return catchingFishRealmContext;
    }
}
