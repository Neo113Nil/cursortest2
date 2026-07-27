package kotlin.text;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class CatchingFishFragmentHilt {
    public static final CatchingFishKtorPicassoMVVM CatchingFishSnackbar;
    public final CatchingFishKtorPicassoMVVM CatchingFishParcelableFAB;

    static {
        int i = Build.VERSION.SDK_INT;
        CatchingFishSnackbar = (i >= 36 ? new CatchingFishRealmView() : i >= 35 ? new CatchingFishRealmHiltGradle() : i >= 34 ? new CatchingFishRoomAdMobMVP() : i >= 31 ? new CatchingFishJUnitView() : i >= 30 ? new CatchingFishMVPLayoutRealm() : i >= 29 ? new CatchingFishStateFlowBundle() : new CatchingFishAdMobMVPGlide()).CatchingFishSnackbar().CatchingFishParcelableFAB.CatchingFishParcelableFAB().CatchingFishParcelableFAB.CatchingFishSnackbar().CatchingFishParcelableFAB.CatchingFishCoroutine();
    }

    public CatchingFishFragmentHilt(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
        this.CatchingFishParcelableFAB = catchingFishKtorPicassoMVVM;
    }

    public boolean CatchingFish() {
        return false;
    }

    public CatchingFishReduxPayPal CatchingFishAnimationMockk() {
        return CatchingFishUnitTesting();
    }

    public CatchingFishReduxPayPal CatchingFishCloudMessaging() {
        return CatchingFishUnitTesting();
    }

    public CatchingFishKtorPicassoMVVM CatchingFishCoroutine() {
        return this.CatchingFishParcelableFAB;
    }

    public boolean CatchingFishCoroutineFlow(int i) {
        return true;
    }

    public CatchingFishReduxPayPal CatchingFishEspressoTesting() {
        return CatchingFishReduxPayPal.CatchingFishDaggerWebsocket;
    }

    public CatchingFishReduxPayPal CatchingFishFragmentHandler(int i) {
        if ((i & 8) == 0) {
            return CatchingFishReduxPayPal.CatchingFishDaggerWebsocket;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public boolean CatchingFishJetpackCompose() {
        return false;
    }

    public CatchingFishReduxPayPal CatchingFishLayout(int i) {
        return CatchingFishReduxPayPal.CatchingFishDaggerWebsocket;
    }

    public CatchingFishKtorPicassoMVVM CatchingFishNavigation(int i, int i2, int i3, int i4) {
        return CatchingFishSnackbar;
    }

    public CatchingFishReduxPayPal CatchingFishOkHttp() {
        return CatchingFishUnitTesting();
    }

    public CatchingFishKtorPicassoMVVM CatchingFishParcelableFAB() {
        return this.CatchingFishParcelableFAB;
    }

    public CatchingFishKtorPicassoMVVM CatchingFishSnackbar() {
        return this.CatchingFishParcelableFAB;
    }

    public CatchingFishReduxPayPal CatchingFishUnitTesting() {
        return CatchingFishReduxPayPal.CatchingFishDaggerWebsocket;
    }

    public CatchingFishIntentGsonRoom CatchingFishViewModelFAB() {
        return null;
    }

    public List<Rect> CatchingFishViewModelScope(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> CatchingFishWorkManager(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishFragmentHilt)) {
            return false;
        }
        CatchingFishFragmentHilt catchingFishFragmentHilt = (CatchingFishFragmentHilt) obj;
        return CatchingFishJetpackCompose() == catchingFishFragmentHilt.CatchingFishJetpackCompose() && CatchingFish() == catchingFishFragmentHilt.CatchingFish() && Objects.equals(CatchingFishUnitTesting(), catchingFishFragmentHilt.CatchingFishUnitTesting()) && Objects.equals(CatchingFishEspressoTesting(), catchingFishFragmentHilt.CatchingFishEspressoTesting()) && Objects.equals(CatchingFishViewModelFAB(), catchingFishFragmentHilt.CatchingFishViewModelFAB());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(CatchingFishJetpackCompose()), Boolean.valueOf(CatchingFish()), CatchingFishUnitTesting(), CatchingFishEspressoTesting(), CatchingFishViewModelFAB());
    }

    public void CatchingFishRoomDatabase() {
    }

    public void CatchingFishCardViewRealm(CatchingFishReduxPayPal catchingFishReduxPayPal) {
    }

    public void CatchingFishCardViewView(Rect[][] rectArr) {
    }

    public void CatchingFishDaggerHiltFAB(CatchingFishOkHttpGraphQL catchingFishOkHttpGraphQL) {
    }

    public void CatchingFishDaggerWebsocket(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
    }

    public void CatchingFishGsonAppCompat(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM) {
    }

    public void CatchingFishMVPRobolectric(Rect[][] rectArr) {
    }

    public void CatchingFishParcelableFlux(CatchingFishReduxPayPal catchingFishReduxPayPal) {
    }

    public void CatchingFishPayPal(int i) {
    }

    public void CatchingFishReduxKtor(View view) {
    }

    public void CatchingFishSpannableWidget(CatchingFishReduxPayPal[] catchingFishReduxPayPalArr) {
    }

    public void CatchingFishStateLiveData(View view) {
    }
}
