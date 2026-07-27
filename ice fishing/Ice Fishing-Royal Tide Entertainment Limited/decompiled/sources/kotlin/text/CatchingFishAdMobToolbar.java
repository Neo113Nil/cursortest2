package kotlin.text;

import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishAdMobToolbar {
    public int CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public CatchingFishIntentJUnit CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor;
    public int CatchingFishSnackbar;

    public CatchingFishAdMobToolbar() {
        CatchingFishReduxKtor();
    }

    public final void CatchingFishCoroutine(View view, int i) {
        CatchingFishIntentJUnit catchingFishIntentJUnit = this.CatchingFishParcelableFAB;
        int CatchingFishEspressoTesting = Integer.MIN_VALUE == catchingFishIntentJUnit.CatchingFishParcelableFAB ? 0 : catchingFishIntentJUnit.CatchingFishEspressoTesting() - catchingFishIntentJUnit.CatchingFishParcelableFAB;
        if (CatchingFishEspressoTesting >= 0) {
            CatchingFishSnackbar(view, i);
            return;
        }
        this.CatchingFishSnackbar = i;
        if (!this.CatchingFishReduxKtor) {
            int CatchingFishDaggerWebsocket = this.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(view);
            int CatchingFishCloudMessaging = CatchingFishDaggerWebsocket - this.CatchingFishParcelableFAB.CatchingFishCloudMessaging();
            this.CatchingFishCoroutine = CatchingFishDaggerWebsocket;
            if (CatchingFishCloudMessaging > 0) {
                int CatchingFishViewModelScope = (this.CatchingFishParcelableFAB.CatchingFishViewModelScope() - Math.min(0, (this.CatchingFishParcelableFAB.CatchingFishViewModelScope() - CatchingFishEspressoTesting) - this.CatchingFishParcelableFAB.CatchingFishSnackbar(view))) - (this.CatchingFishParcelableFAB.CatchingFishCoroutine(view) + CatchingFishDaggerWebsocket);
                if (CatchingFishViewModelScope < 0) {
                    this.CatchingFishCoroutine -= Math.min(CatchingFishCloudMessaging, -CatchingFishViewModelScope);
                    return;
                }
                return;
            }
            return;
        }
        int CatchingFishViewModelScope2 = (this.CatchingFishParcelableFAB.CatchingFishViewModelScope() - CatchingFishEspressoTesting) - this.CatchingFishParcelableFAB.CatchingFishSnackbar(view);
        this.CatchingFishCoroutine = this.CatchingFishParcelableFAB.CatchingFishViewModelScope() - CatchingFishViewModelScope2;
        if (CatchingFishViewModelScope2 > 0) {
            int CatchingFishCoroutine = this.CatchingFishCoroutine - this.CatchingFishParcelableFAB.CatchingFishCoroutine(view);
            int CatchingFishCloudMessaging2 = this.CatchingFishParcelableFAB.CatchingFishCloudMessaging();
            int min = CatchingFishCoroutine - (Math.min(this.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(view) - CatchingFishCloudMessaging2, 0) + CatchingFishCloudMessaging2);
            if (min < 0) {
                this.CatchingFishCoroutine = Math.min(CatchingFishViewModelScope2, -min) + this.CatchingFishCoroutine;
            }
        }
    }

    public final void CatchingFishParcelableFAB() {
        this.CatchingFishCoroutine = this.CatchingFishReduxKtor ? this.CatchingFishParcelableFAB.CatchingFishViewModelScope() : this.CatchingFishParcelableFAB.CatchingFishCloudMessaging();
    }

    public final void CatchingFishReduxKtor() {
        this.CatchingFishSnackbar = -1;
        this.CatchingFishCoroutine = Integer.MIN_VALUE;
        this.CatchingFishReduxKtor = false;
        this.CatchingFishDaggerWebsocket = false;
    }

    public final void CatchingFishSnackbar(View view, int i) {
        if (this.CatchingFishReduxKtor) {
            int CatchingFishSnackbar = this.CatchingFishParcelableFAB.CatchingFishSnackbar(view);
            CatchingFishIntentJUnit catchingFishIntentJUnit = this.CatchingFishParcelableFAB;
            this.CatchingFishCoroutine = (Integer.MIN_VALUE == catchingFishIntentJUnit.CatchingFishParcelableFAB ? 0 : catchingFishIntentJUnit.CatchingFishEspressoTesting() - catchingFishIntentJUnit.CatchingFishParcelableFAB) + CatchingFishSnackbar;
        } else {
            this.CatchingFishCoroutine = this.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket(view);
        }
        this.CatchingFishSnackbar = i;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.CatchingFishSnackbar + ", mCoordinate=" + this.CatchingFishCoroutine + ", mLayoutFromEnd=" + this.CatchingFishReduxKtor + ", mValid=" + this.CatchingFishDaggerWebsocket + '}';
    }
}
