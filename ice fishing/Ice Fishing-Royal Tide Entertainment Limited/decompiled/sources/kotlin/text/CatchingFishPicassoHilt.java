package kotlin.text;

import android.graphics.Typeface;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class CatchingFishPicassoHilt extends CatchingFishDaggerBiometric {
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ int CatchingFishWorkManager;

    public /* synthetic */ CatchingFishPicassoHilt(int i, Object obj) {
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = obj;
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final void CatchingFishFragmentFactory(int i) {
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                CatchingFishToastMVP catchingFishToastMVP = (CatchingFishToastMVP) this.CatchingFishViewModelScope;
                catchingFishToastMVP.CatchingFishReduxKtor = true;
                CatchingFishGraphQLToast catchingFishGraphQLToast = (CatchingFishGraphQLToast) catchingFishToastMVP.CatchingFishDaggerWebsocket.get();
                if (catchingFishGraphQLToast != null) {
                    CatchingFishLayoutEspresso catchingFishLayoutEspresso = (CatchingFishLayoutEspresso) catchingFishGraphQLToast;
                    catchingFishLayoutEspresso.CatchingFishPayPal();
                    catchingFishLayoutEspresso.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.text.CatchingFishDaggerBiometric
    public final void CatchingFishMutableLiveData(Typeface typeface, boolean z) {
        switch (this.CatchingFishWorkManager) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Chip chip = (Chip) this.CatchingFishViewModelScope;
                CatchingFishLayoutEspresso catchingFishLayoutEspresso = chip.CatchingFishViewModelFAB;
                chip.setText(catchingFishLayoutEspresso.CatchingFishStripeAPIWidget ? catchingFishLayoutEspresso.CatchingFishLayoutInflater : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    CatchingFishToastMVP catchingFishToastMVP = (CatchingFishToastMVP) this.CatchingFishViewModelScope;
                    catchingFishToastMVP.CatchingFishReduxKtor = true;
                    CatchingFishGraphQLToast catchingFishGraphQLToast = (CatchingFishGraphQLToast) catchingFishToastMVP.CatchingFishDaggerWebsocket.get();
                    if (catchingFishGraphQLToast != null) {
                        CatchingFishLayoutEspresso catchingFishLayoutEspresso2 = (CatchingFishLayoutEspresso) catchingFishGraphQLToast;
                        catchingFishLayoutEspresso2.CatchingFishPayPal();
                        catchingFishLayoutEspresso2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void CatchingFishJUnitRealm(int i) {
    }
}
