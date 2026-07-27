package kotlin.text;

import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreJUnit extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public static final CatchingFishDataStoreJUnit CatchingFish;
    public static final CatchingFishDataStoreJUnit CatchingFishAnimationMockk;
    public static final CatchingFishDataStoreJUnit CatchingFishCardViewRealm;
    public static final CatchingFishDataStoreJUnit CatchingFishCardViewView;
    public static final CatchingFishDataStoreJUnit CatchingFishCloudMessaging;
    public static final CatchingFishDataStoreJUnit CatchingFishCoroutineFlow;
    public static final CatchingFishDataStoreJUnit CatchingFishCustomView;
    public static final CatchingFishDataStoreJUnit CatchingFishDaggerHiltFAB;
    public static final CatchingFishDataStoreJUnit CatchingFishEspressoTesting;
    public static final CatchingFishDataStoreJUnit CatchingFishFragmentFactory;
    public static final CatchingFishDataStoreJUnit CatchingFishFragmentHandler;
    public static final CatchingFishDataStoreJUnit CatchingFishGsonAppCompat;
    public static final CatchingFishDataStoreJUnit CatchingFishJetpackCompose;
    public static final CatchingFishDataStoreJUnit CatchingFishJobScheduler;
    public static final CatchingFishDataStoreJUnit CatchingFishLayout;
    public static final CatchingFishDataStoreJUnit CatchingFishMVPRobolectric;
    public static final CatchingFishDataStoreJUnit CatchingFishMutableLiveData;
    public static final CatchingFishDataStoreJUnit CatchingFishNavigation;
    public static final CatchingFishDataStoreJUnit CatchingFishOkHttp;
    public static final CatchingFishDataStoreJUnit CatchingFishParcelableFlux;
    public static final CatchingFishDataStoreJUnit CatchingFishPayPal;
    public static final CatchingFishDataStoreJUnit CatchingFishPayPalService;
    public static final CatchingFishDataStoreJUnit CatchingFishRoomDatabase;
    public static final CatchingFishDataStoreJUnit CatchingFishSensorManager;
    public static final CatchingFishDataStoreJUnit CatchingFishSpannableWidget;
    public static final CatchingFishDataStoreJUnit CatchingFishStateLiveData;
    public static final CatchingFishDataStoreJUnit CatchingFishUnitTesting;
    public static final CatchingFishDataStoreJUnit CatchingFishViewModelFAB;
    public static final CatchingFishDataStoreJUnit CatchingFishViewModelScope;
    public static final CatchingFishDataStoreJUnit CatchingFishWorkManager;
    public final /* synthetic */ int CatchingFishDaggerWebsocket;

    static {
        int i = 0;
        CatchingFishWorkManager = new CatchingFishDataStoreJUnit(i, 0);
        CatchingFishViewModelScope = new CatchingFishDataStoreJUnit(i, 1);
        CatchingFishViewModelFAB = new CatchingFishDataStoreJUnit(i, 2);
        CatchingFishLayout = new CatchingFishDataStoreJUnit(i, 3);
        CatchingFishFragmentHandler = new CatchingFishDataStoreJUnit(i, 4);
        CatchingFishCloudMessaging = new CatchingFishDataStoreJUnit(i, 5);
        CatchingFishEspressoTesting = new CatchingFishDataStoreJUnit(i, 6);
        CatchingFishOkHttp = new CatchingFishDataStoreJUnit(i, 7);
        CatchingFishUnitTesting = new CatchingFishDataStoreJUnit(i, 8);
        CatchingFishAnimationMockk = new CatchingFishDataStoreJUnit(i, 9);
        CatchingFishStateLiveData = new CatchingFishDataStoreJUnit(i, 10);
        CatchingFishRoomDatabase = new CatchingFishDataStoreJUnit(i, 11);
        CatchingFishNavigation = new CatchingFishDataStoreJUnit(i, 12);
        CatchingFish = new CatchingFishDataStoreJUnit(i, 13);
        CatchingFishJetpackCompose = new CatchingFishDataStoreJUnit(i, 14);
        CatchingFishCoroutineFlow = new CatchingFishDataStoreJUnit(i, 15);
        CatchingFishDaggerHiltFAB = new CatchingFishDataStoreJUnit(i, 16);
        CatchingFishSpannableWidget = new CatchingFishDataStoreJUnit(i, 17);
        CatchingFishParcelableFlux = new CatchingFishDataStoreJUnit(i, 18);
        CatchingFishGsonAppCompat = new CatchingFishDataStoreJUnit(i, 19);
        CatchingFishCardViewRealm = new CatchingFishDataStoreJUnit(i, 20);
        CatchingFishPayPal = new CatchingFishDataStoreJUnit(i, 21);
        CatchingFishCardViewView = new CatchingFishDataStoreJUnit(i, 22);
        CatchingFishMVPRobolectric = new CatchingFishDataStoreJUnit(i, 23);
        CatchingFishCustomView = new CatchingFishDataStoreJUnit(i, 24);
        CatchingFishFragmentFactory = new CatchingFishDataStoreJUnit(i, 25);
        CatchingFishMutableLiveData = new CatchingFishDataStoreJUnit(i, 26);
        CatchingFishJobScheduler = new CatchingFishDataStoreJUnit(i, 27);
        CatchingFishPayPalService = new CatchingFishDataStoreJUnit(i, 28);
        CatchingFishSensorManager = new CatchingFishDataStoreJUnit(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishDataStoreJUnit(int i, int i2) {
        super(i);
        this.CatchingFishDaggerWebsocket = i2;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        Choreographer choreographer;
        int i = this.CatchingFishDaggerWebsocket;
        CatchingFishRealmContext catchingFishRealmContext = CatchingFishRealmContext.CatchingFishParcelableFAB;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFABExoPlayer.CatchingFishSnackbar("LocalConfiguration");
                throw null;
            case 1:
                CatchingFishFABExoPlayer.CatchingFishSnackbar("LocalContext");
                throw null;
            case 2:
                CatchingFishFABExoPlayer.CatchingFishSnackbar("LocalImageVectorCache");
                throw null;
            case 3:
                CatchingFishFABExoPlayer.CatchingFishSnackbar("LocalResourceIdCache");
                throw null;
            case 4:
                CatchingFishFABExoPlayer.CatchingFishSnackbar("LocalView");
                throw null;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    CatchingFishGlideGson catchingFishGlideGson = CatchingFishGoogleMapsHilt.CatchingFishParcelableFAB;
                    choreographer = (Choreographer) CatchingFishXMLLayoutGlide.CatchingFishSensorManager(CatchingFishPayPalLayout.CatchingFishParcelableFAB, new CatchingFishBundle(2, null));
                }
                CatchingFishContextFragment catchingFishContextFragment = new CatchingFishContextFragment(choreographer, CatchingFishGsonCardView.CatchingFishUnitTesting(Looper.getMainLooper()));
                return CatchingFishAdMobFAB.CatchingFishMutableLiveData(catchingFishContextFragment, catchingFishContextFragment.CatchingFishAnimationMockk);
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                return catchingFishRealmContext;
            case 9:
                return null;
            case 10:
                return CatchingFishGradleContext.CatchingFishCoroutine(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            case 11:
                return Boolean.TRUE;
            case 12:
            case 13:
                return null;
            case 14:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalAutofillManager");
                throw null;
            case 15:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalAutofillTree");
                throw null;
            case 16:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalClipboard");
                throw null;
            case 17:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalClipboardManager");
                throw null;
            case 18:
                return Boolean.TRUE;
            case 19:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalDensity");
                throw null;
            case 20:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalFocusManager");
                throw null;
            case 21:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalFontFamilyResolver");
                throw null;
            case 22:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalFontLoader");
                throw null;
            case 23:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalGraphicsContext");
                throw null;
            case 24:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalHapticFeedback");
                throw null;
            case 25:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalInputManager");
                throw null;
            case 26:
                CatchingFishGradleLiveData.CatchingFishSnackbar("LocalLayoutDirection");
                throw null;
            case 27:
                return null;
            case 28:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
