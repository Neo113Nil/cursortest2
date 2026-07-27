package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIFlux extends CatchingFishJUnitSharedFlow {
    private static final CatchingFishStripeAPIFlux DEFAULT_INSTANCE;
    private static volatile CatchingFishFirebaseAdMob PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private CatchingFishMockkAppCompat preferences_ = CatchingFishMockkAppCompat.CatchingFishDaggerWebsocket;

    static {
        CatchingFishStripeAPIFlux catchingFishStripeAPIFlux = new CatchingFishStripeAPIFlux();
        DEFAULT_INSTANCE = catchingFishStripeAPIFlux;
        CatchingFishJUnitSharedFlow.CatchingFishFragmentHandler(CatchingFishStripeAPIFlux.class, catchingFishStripeAPIFlux);
    }

    public static CatchingFishStripeAPIFlux CatchingFishAnimationMockk(FileInputStream fileInputStream) {
        CatchingFishStripeAPIFlux catchingFishStripeAPIFlux = DEFAULT_INSTANCE;
        CatchingFishHiltGlideDagger catchingFishHiltGlideDagger = new CatchingFishHiltGlideDagger(fileInputStream);
        CatchingFishPayPalBiometric CatchingFishParcelableFAB = CatchingFishPayPalBiometric.CatchingFishParcelableFAB();
        CatchingFishJUnitSharedFlow CatchingFishLayout = catchingFishStripeAPIFlux.CatchingFishLayout();
        try {
            CatchingFishCoroutineHilt catchingFishCoroutineHilt = CatchingFishCoroutineHilt.CatchingFishCoroutine;
            catchingFishCoroutineHilt.getClass();
            CatchingFishRoomHilt CatchingFishParcelableFAB2 = catchingFishCoroutineHilt.CatchingFishParcelableFAB(CatchingFishLayout.getClass());
            CatchingFishWidgetFAB catchingFishWidgetFAB = (CatchingFishWidgetFAB) catchingFishHiltGlideDagger.CatchingFishDaggerWebsocket;
            if (catchingFishWidgetFAB == null) {
                catchingFishWidgetFAB = new CatchingFishWidgetFAB(catchingFishHiltGlideDagger);
            }
            CatchingFishParcelableFAB2.CatchingFishViewModelScope(CatchingFishLayout, catchingFishWidgetFAB, CatchingFishParcelableFAB);
            CatchingFishParcelableFAB2.CatchingFishReduxKtor(CatchingFishLayout);
            if (CatchingFishJUnitSharedFlow.CatchingFishWorkManager(CatchingFishLayout, true)) {
                return (CatchingFishStripeAPIFlux) CatchingFishLayout;
            }
            throw new CatchingFishKtorMVPAndroidX(new CatchingFishReduxRealm().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof CatchingFishKtorMVPAndroidX) {
                throw ((CatchingFishKtorMVPAndroidX) e.getCause());
            }
            throw new CatchingFishKtorMVPAndroidX(e.getMessage(), e);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof CatchingFishKtorMVPAndroidX) {
                throw ((CatchingFishKtorMVPAndroidX) e2.getCause());
            }
            throw e2;
        } catch (CatchingFishKtorMVPAndroidX e3) {
            if (e3.CatchingFishReduxKtor) {
                throw new CatchingFishKtorMVPAndroidX(e3.getMessage(), e3);
            }
            throw e3;
        } catch (CatchingFishReduxRealm e4) {
            throw new CatchingFishKtorMVPAndroidX(e4.getMessage());
        }
    }

    public static CatchingFishMockkAppCompat CatchingFishEspressoTesting(CatchingFishStripeAPIFlux catchingFishStripeAPIFlux) {
        CatchingFishMockkAppCompat catchingFishMockkAppCompat = catchingFishStripeAPIFlux.preferences_;
        if (!catchingFishMockkAppCompat.CatchingFishReduxKtor) {
            catchingFishStripeAPIFlux.preferences_ = catchingFishMockkAppCompat.CatchingFishSnackbar();
        }
        return catchingFishStripeAPIFlux.preferences_;
    }

    public static CatchingFishViewModelMVP CatchingFishUnitTesting() {
        return (CatchingFishViewModelMVP) ((CatchingFishNavigationFlux) DEFAULT_INSTANCE.CatchingFishCoroutine(5));
    }

    @Override // kotlin.text.CatchingFishJUnitSharedFlow
    public final Object CatchingFishCoroutine(int i) {
        CatchingFishFirebaseAdMob catchingFishFirebaseAdMob;
        switch (CatchingFishMVPLiveData.CatchingFishParcelableFlux(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new CatchingFishAndroidXContext(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", CatchingFishMVIReduxGraphQL.CatchingFishParcelableFAB});
            case 3:
                return new CatchingFishStripeAPIFlux();
            case 4:
                return new CatchingFishViewModelMVP(DEFAULT_INSTANCE);
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishFirebaseAdMob catchingFishFirebaseAdMob2 = PARSER;
                if (catchingFishFirebaseAdMob2 != null) {
                    return catchingFishFirebaseAdMob2;
                }
                synchronized (CatchingFishStripeAPIFlux.class) {
                    try {
                        catchingFishFirebaseAdMob = PARSER;
                        if (catchingFishFirebaseAdMob == null) {
                            catchingFishFirebaseAdMob = new CatchingFishFirebaseView();
                            PARSER = catchingFishFirebaseAdMob;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return catchingFishFirebaseAdMob;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map CatchingFishOkHttp() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
