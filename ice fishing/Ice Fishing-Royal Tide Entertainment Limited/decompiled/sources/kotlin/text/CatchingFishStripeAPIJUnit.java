package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIJUnit {
    public boolean CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public CatchingFishHandlerGson CatchingFishLayout;
    public final CatchingFishDaggerRetrofit CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public CatchingFishStripeAPIJUnit CatchingFishWorkManager;
    public HashSet CatchingFishParcelableFAB = null;
    public int CatchingFishViewModelScope = 0;
    public int CatchingFishViewModelFAB = Integer.MIN_VALUE;

    public CatchingFishStripeAPIJUnit(CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, int i) {
        this.CatchingFishReduxKtor = catchingFishDaggerRetrofit;
        this.CatchingFishDaggerWebsocket = i;
    }

    public final void CatchingFishCloudMessaging() {
        CatchingFishHandlerGson catchingFishHandlerGson = this.CatchingFishLayout;
        if (catchingFishHandlerGson == null) {
            this.CatchingFishLayout = new CatchingFishHandlerGson(1);
        } else {
            catchingFishHandlerGson.CatchingFishCoroutine();
        }
    }

    public final void CatchingFishCoroutine(int i, ArrayList arrayList, CatchingFishToolbarGlide catchingFishToolbarGlide) {
        HashSet hashSet = this.CatchingFishParcelableFAB;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                CatchingFishBiometricBundle.CatchingFishAnimationMockk(((CatchingFishStripeAPIJUnit) it.next()).CatchingFishReduxKtor, i, arrayList, catchingFishToolbarGlide);
            }
        }
    }

    public final int CatchingFishDaggerWebsocket() {
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit;
        if (this.CatchingFishReduxKtor.CatchingFishMockkOkHttp == 8) {
            return 0;
        }
        int i = this.CatchingFishViewModelFAB;
        return (i == Integer.MIN_VALUE || (catchingFishStripeAPIJUnit = this.CatchingFishWorkManager) == null || catchingFishStripeAPIJUnit.CatchingFishReduxKtor.CatchingFishMockkOkHttp != 8) ? this.CatchingFishViewModelScope : i;
    }

    public final void CatchingFishEspressoTesting(int i) {
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = true;
    }

    public final void CatchingFishFragmentHandler() {
        HashSet hashSet;
        CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit = this.CatchingFishWorkManager;
        if (catchingFishStripeAPIJUnit != null && (hashSet = catchingFishStripeAPIJUnit.CatchingFishParcelableFAB) != null) {
            hashSet.remove(this);
            if (this.CatchingFishWorkManager.CatchingFishParcelableFAB.size() == 0) {
                this.CatchingFishWorkManager.CatchingFishParcelableFAB = null;
            }
        }
        this.CatchingFishParcelableFAB = null;
        this.CatchingFishWorkManager = null;
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishViewModelFAB = Integer.MIN_VALUE;
        this.CatchingFishCoroutine = false;
        this.CatchingFishSnackbar = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishLayout(CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit) {
        if (catchingFishStripeAPIJUnit != null) {
            CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = catchingFishStripeAPIJUnit.CatchingFishReduxKtor;
            int i = catchingFishStripeAPIJUnit.CatchingFishDaggerWebsocket;
            int i2 = this.CatchingFishDaggerWebsocket;
            if (i != i2) {
                switch (CatchingFishMVPLiveData.CatchingFishParcelableFlux(i2)) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                    case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(catchingFishDaggerRetrofit instanceof CatchingFishViewModelMockk)) {
                            return z;
                        }
                        if (z || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(catchingFishDaggerRetrofit instanceof CatchingFishViewModelMockk)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                        }
                        break;
                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                        if (i == 2 || i == 4) {
                        }
                        break;
                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (i == 6 || i == 8 || i == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(CatchingFishMVPLiveData.CatchingFishSpannableWidget(i2));
                }
            } else if (i2 != 6 || (catchingFishDaggerRetrofit.CatchingFishFragmentFactory && this.CatchingFishReduxKtor.CatchingFishFragmentFactory)) {
                return true;
            }
        }
        return false;
    }

    public final void CatchingFishParcelableFAB(CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit, int i) {
        CatchingFishSnackbar(catchingFishStripeAPIJUnit, i, Integer.MIN_VALUE, false);
    }

    public final int CatchingFishReduxKtor() {
        if (this.CatchingFishCoroutine) {
            return this.CatchingFishSnackbar;
        }
        return 0;
    }

    public final boolean CatchingFishSnackbar(CatchingFishStripeAPIJUnit catchingFishStripeAPIJUnit, int i, int i2, boolean z) {
        if (catchingFishStripeAPIJUnit == null) {
            CatchingFishFragmentHandler();
            return true;
        }
        if (!z && !CatchingFishLayout(catchingFishStripeAPIJUnit)) {
            return false;
        }
        this.CatchingFishWorkManager = catchingFishStripeAPIJUnit;
        if (catchingFishStripeAPIJUnit.CatchingFishParcelableFAB == null) {
            catchingFishStripeAPIJUnit.CatchingFishParcelableFAB = new HashSet();
        }
        HashSet hashSet = this.CatchingFishWorkManager.CatchingFishParcelableFAB;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.CatchingFishViewModelScope = i;
        this.CatchingFishViewModelFAB = i2;
        return true;
    }

    public final boolean CatchingFishViewModelFAB() {
        return this.CatchingFishWorkManager != null;
    }

    public final boolean CatchingFishViewModelScope() {
        HashSet hashSet = this.CatchingFishParcelableFAB;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((CatchingFishStripeAPIJUnit) it.next()).CatchingFishWorkManager().CatchingFishViewModelFAB()) {
                return true;
            }
        }
        return false;
    }

    public final CatchingFishStripeAPIJUnit CatchingFishWorkManager() {
        int i = this.CatchingFishDaggerWebsocket;
        int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(i);
        CatchingFishDaggerRetrofit catchingFishDaggerRetrofit = this.CatchingFishReduxKtor;
        switch (CatchingFishParcelableFlux) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 1:
                return catchingFishDaggerRetrofit.CatchingFishDagger;
            case 2:
                return catchingFishDaggerRetrofit.CatchingFishCameraXIntent;
            case 3:
                return catchingFishDaggerRetrofit.CatchingFishSensorManager;
            case 4:
                return catchingFishDaggerRetrofit.CatchingFishEspressoMockk;
            default:
                throw new AssertionError(CatchingFishMVPLiveData.CatchingFishSpannableWidget(i));
        }
    }

    public final String toString() {
        return this.CatchingFishReduxKtor.CatchingFishReduxMoshi + ":" + CatchingFishMVPLiveData.CatchingFishSpannableWidget(this.CatchingFishDaggerWebsocket);
    }
}
