package kotlin.text;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleFAB {
    public List CatchingFishCloudMessaging;
    public int CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public boolean CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public final void CatchingFishParcelableFAB(View view) {
        int CatchingFishSnackbar;
        int size = this.CatchingFishCloudMessaging.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((CatchingFishPayPalCardView) this.CatchingFishCloudMessaging.get(i2)).CatchingFishParcelableFAB;
            CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view3.getLayoutParams();
            if (view3 != view && !catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishViewModelFAB() && (CatchingFishSnackbar = (catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishSnackbar() - this.CatchingFishReduxKtor) * this.CatchingFishDaggerWebsocket) >= 0 && CatchingFishSnackbar < i) {
                view2 = view3;
                if (CatchingFishSnackbar == 0) {
                    break;
                } else {
                    i = CatchingFishSnackbar;
                }
            }
        }
        if (view2 == null) {
            this.CatchingFishReduxKtor = -1;
        } else {
            this.CatchingFishReduxKtor = ((CatchingFishGradleDagger) view2.getLayoutParams()).CatchingFishParcelableFAB.CatchingFishSnackbar();
        }
    }

    public final View CatchingFishSnackbar(CatchingFishSnackbarCameraX catchingFishSnackbarCameraX) {
        List list = this.CatchingFishCloudMessaging;
        if (list == null) {
            View CatchingFishReduxKtor = catchingFishSnackbarCameraX.CatchingFishReduxKtor(this.CatchingFishReduxKtor);
            this.CatchingFishReduxKtor += this.CatchingFishDaggerWebsocket;
            return CatchingFishReduxKtor;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((CatchingFishPayPalCardView) this.CatchingFishCloudMessaging.get(i)).CatchingFishParcelableFAB;
            CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
            if (!catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishViewModelFAB() && this.CatchingFishReduxKtor == catchingFishGradleDagger.CatchingFishParcelableFAB.CatchingFishSnackbar()) {
                CatchingFishParcelableFAB(view);
                return view;
            }
        }
        return null;
    }
}
