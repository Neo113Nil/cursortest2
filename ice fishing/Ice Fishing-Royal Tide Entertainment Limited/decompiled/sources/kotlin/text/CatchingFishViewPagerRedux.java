package kotlin.text;

import android.os.Trace;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerRedux extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ Object CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishViewPagerRedux(int i, Object obj) {
        super(0);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r0 > 1.0f) goto L20;
     */
    @Override // kotlin.text.CatchingFishJUnitGlide
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishParcelableFAB() {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishManifestHiltFAB) this.CatchingFishWorkManager).getClass();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                Object obj = CatchingFishOkHttpOkHttp.CatchingFishReduxKtor;
                File file = (File) this.CatchingFishWorkManager;
                synchronized (obj) {
                    CatchingFishOkHttpOkHttp.CatchingFishCoroutine.remove(file.getAbsolutePath());
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 2:
                ((CatchingFishAppCompatWidget) this.CatchingFishWorkManager).CatchingFishCardViewView();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 3:
                return Float.valueOf(CatchingFishLayoutRoom.CatchingFishUnitTesting(((CatchingFishToastLayout) this.CatchingFishWorkManager).CatchingFishParcelableFAB()));
            case 4:
                Object systemService = ((CatchingFishLifecycleMVI) this.CatchingFishWorkManager).CatchingFishParcelableFAB.getContext().getSystemService("input_method");
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishIntentPicasso catchingFishIntentPicasso = ((CatchingFishBiometricRoom) this.CatchingFishWorkManager).CatchingFishPayPalService;
                catchingFishIntentPicasso.CatchingFishAnimationMockk.CatchingFishPayPal = true;
                CatchingFishManifestWidget catchingFishManifestWidget = catchingFishIntentPicasso.CatchingFishStateLiveData;
                if (catchingFishManifestWidget != null) {
                    catchingFishManifestWidget.CatchingFishDaggerHiltFAB = true;
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishToolbarPicasso catchingFishToolbarPicasso = (CatchingFishToolbarPicasso) this.CatchingFishWorkManager;
                CatchingFishFABToast catchingFishFABToast = catchingFishToolbarPicasso.CatchingFishCoroutine;
                CatchingFishFABToast catchingFishFABToast2 = catchingFishToolbarPicasso.CatchingFishSnackbar;
                CatchingFishFABToast catchingFishFABToast3 = catchingFishToolbarPicasso.CatchingFishDaggerWebsocket;
                catchingFishToolbarPicasso.CatchingFishWorkManager = false;
                HashSet hashSet = new HashSet();
                CatchingFishFABToast catchingFishFABToast4 = catchingFishToolbarPicasso.CatchingFishReduxKtor;
                Object[] objArr = catchingFishFABToast4.CatchingFishReduxKtor;
                int i = catchingFishFABToast4.CatchingFishWorkManager;
                for (int i2 = 0; i2 < i; i2++) {
                    CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) objArr[i2];
                    CatchingFishMVIJobScheduler catchingFishMVIJobScheduler = (CatchingFishMVIJobScheduler) catchingFishFABToast3.CatchingFishReduxKtor[i2];
                    CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB = (CatchingFishFABStripeAPIFAB) catchingFishBiometricRoom.CatchingFishJobScheduler.CatchingFishFragmentHandler;
                    if (catchingFishFABStripeAPIFAB.CatchingFishRoomDatabase) {
                        CatchingFishToolbarPicasso.CatchingFishSnackbar(catchingFishFABStripeAPIFAB, catchingFishMVIJobScheduler, hashSet);
                    }
                }
                catchingFishFABToast4.CatchingFishViewModelScope();
                catchingFishFABToast3.CatchingFishViewModelScope();
                Object[] objArr2 = catchingFishFABToast2.CatchingFishReduxKtor;
                int i3 = catchingFishFABToast2.CatchingFishWorkManager;
                for (int i4 = 0; i4 < i3; i4++) {
                    CatchingFishAdMobPicasso catchingFishAdMobPicasso = (CatchingFishAdMobPicasso) objArr2[i4];
                    CatchingFishMVIJobScheduler catchingFishMVIJobScheduler2 = (CatchingFishMVIJobScheduler) catchingFishFABToast.CatchingFishReduxKtor[i4];
                    if (catchingFishAdMobPicasso.CatchingFishRoomDatabase) {
                        CatchingFishToolbarPicasso.CatchingFishSnackbar(catchingFishAdMobPicasso, catchingFishMVIJobScheduler2, hashSet);
                    }
                }
                catchingFishFABToast2.CatchingFishViewModelScope();
                catchingFishFABToast.CatchingFishViewModelScope();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CatchingFishAdMobPicasso) it.next()).CatchingFishMutableLiveData();
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((CatchingFishFABBundleView) this.CatchingFishWorkManager).CatchingFishReduxKtor;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                return ((CatchingFishMoshiDataStore) this.CatchingFishWorkManager).CatchingFishPayPal();
            case 9:
                CatchingFishServiceHandler catchingFishServiceHandler = (CatchingFishServiceHandler) this.CatchingFishWorkManager;
                CatchingFishMockkLiveData catchingFishMockkLiveData = CatchingFishDaggerToolbar.CatchingFishCameraXIntent;
                catchingFishServiceHandler.CatchingFishFragmentHandler(catchingFishMockkLiveData);
                catchingFishMockkLiveData.CatchingFish = catchingFishMockkLiveData.CatchingFishOkHttp.CatchingFishParcelableFAB(catchingFishMockkLiveData.CatchingFishAnimationMockk, catchingFishMockkLiveData.CatchingFishRoomDatabase, catchingFishMockkLiveData.CatchingFishStateLiveData);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 10:
                File file2 = (File) ((CatchingFishAppCompatJUnit) this.CatchingFishWorkManager).CatchingFishParcelableFAB();
                String name = file2.getName();
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(name, "getName(...)");
                if (CatchingFishRoomMVVMWidget.CatchingFishHandler(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 11:
                float floatValue = ((Number) ((CatchingFishJUnitGlide) this.CatchingFishWorkManager).CatchingFishParcelableFAB()).floatValue();
                float f = 0.0f;
                if (floatValue >= 0.0f) {
                    f = 1.0f;
                    break;
                }
                floatValue = f;
                return Float.valueOf(floatValue);
            case 12:
                CatchingFishPayPalGradle catchingFishPayPalGradle = (CatchingFishPayPalGradle) this.CatchingFishWorkManager;
                catchingFishPayPalGradle.CatchingFishViewModelScope = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    catchingFishPayPalGradle.CatchingFishSnackbar();
                    Trace.endSection();
                    return CatchingFishRealmContext.CatchingFishParcelableFAB;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 13:
                return new BaseInputConnection(((CatchingFishLifecycleMVI) this.CatchingFishWorkManager).CatchingFishParcelableFAB, false);
            default:
                CatchingFishBiometricGlide catchingFishBiometricGlide = (CatchingFishBiometricGlide) this.CatchingFishWorkManager;
                int i5 = catchingFishBiometricGlide.CatchingFishLayout;
                CatchingFishViewWidgetFAB catchingFishViewWidgetFAB = catchingFishBiometricGlide.CatchingFishViewModelScope;
                if (i5 == catchingFishViewWidgetFAB.CatchingFishViewModelScope()) {
                    catchingFishViewWidgetFAB.CatchingFishViewModelFAB(catchingFishViewWidgetFAB.CatchingFishViewModelScope() + 1);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishViewPagerRedux(CatchingFishManifestHiltFAB catchingFishManifestHiltFAB, CatchingFishFABViewModel catchingFishFABViewModel) {
        super(0);
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishWorkManager = catchingFishManifestHiltFAB;
    }
}
