package kotlin.text;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class CatchingFishCardViewGraphQL extends CatchingFishDaggerLiveData {
    public CatchingFishStateFlowFABMVP CatchingFishCoroutine;
    public RecyclerView CatchingFishParcelableFAB;
    public CatchingFishStateFlowFABMVP CatchingFishReduxKtor;
    public final CatchingFishMVVMEspresso CatchingFishSnackbar = new CatchingFishMVVMEspresso(this);

    public static View CatchingFishCoroutine(CatchingFishKtorDataStore catchingFishKtorDataStore, CatchingFishIntentJUnit catchingFishIntentJUnit) {
        int CatchingFishDaggerHiltFAB = catchingFishKtorDataStore.CatchingFishDaggerHiltFAB();
        View view = null;
        if (CatchingFishDaggerHiltFAB == 0) {
            return null;
        }
        int CatchingFishEspressoTesting = (catchingFishIntentJUnit.CatchingFishEspressoTesting() / 2) + catchingFishIntentJUnit.CatchingFishCloudMessaging();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < CatchingFishDaggerHiltFAB; i2++) {
            View CatchingFishCoroutineFlow = catchingFishKtorDataStore.CatchingFishCoroutineFlow(i2);
            int abs = Math.abs(((catchingFishIntentJUnit.CatchingFishCoroutine(CatchingFishCoroutineFlow) / 2) + catchingFishIntentJUnit.CatchingFishDaggerWebsocket(CatchingFishCoroutineFlow)) - CatchingFishEspressoTesting);
            if (abs < i) {
                view = CatchingFishCoroutineFlow;
                i = abs;
            }
        }
        return view;
    }

    public static int CatchingFishSnackbar(View view, CatchingFishIntentJUnit catchingFishIntentJUnit) {
        return ((catchingFishIntentJUnit.CatchingFishCoroutine(view) / 2) + catchingFishIntentJUnit.CatchingFishDaggerWebsocket(view)) - ((catchingFishIntentJUnit.CatchingFishEspressoTesting() / 2) + catchingFishIntentJUnit.CatchingFishCloudMessaging());
    }

    public final CatchingFishIntentJUnit CatchingFishDaggerWebsocket(CatchingFishKtorDataStore catchingFishKtorDataStore) {
        CatchingFishStateFlowFABMVP catchingFishStateFlowFABMVP = this.CatchingFishCoroutine;
        if (catchingFishStateFlowFABMVP == null || ((CatchingFishKtorDataStore) catchingFishStateFlowFABMVP.CatchingFishSnackbar) != catchingFishKtorDataStore) {
            this.CatchingFishCoroutine = new CatchingFishStateFlowFABMVP(catchingFishKtorDataStore, 1);
        }
        return this.CatchingFishCoroutine;
    }

    public final int[] CatchingFishParcelableFAB(CatchingFishKtorDataStore catchingFishKtorDataStore, View view) {
        int[] iArr = new int[2];
        if (catchingFishKtorDataStore.CatchingFishReduxKtor()) {
            iArr[0] = CatchingFishSnackbar(view, CatchingFishReduxKtor(catchingFishKtorDataStore));
        } else {
            iArr[0] = 0;
        }
        if (catchingFishKtorDataStore.CatchingFishDaggerWebsocket()) {
            iArr[1] = CatchingFishSnackbar(view, CatchingFishDaggerWebsocket(catchingFishKtorDataStore));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final CatchingFishIntentJUnit CatchingFishReduxKtor(CatchingFishKtorDataStore catchingFishKtorDataStore) {
        CatchingFishStateFlowFABMVP catchingFishStateFlowFABMVP = this.CatchingFishReduxKtor;
        if (catchingFishStateFlowFABMVP == null || ((CatchingFishKtorDataStore) catchingFishStateFlowFABMVP.CatchingFishSnackbar) != catchingFishKtorDataStore) {
            this.CatchingFishReduxKtor = new CatchingFishStateFlowFABMVP(catchingFishKtorDataStore, 0);
        }
        return this.CatchingFishReduxKtor;
    }

    public final void CatchingFishWorkManager() {
        CatchingFishKtorDataStore layoutManager;
        RecyclerView recyclerView = this.CatchingFishParcelableFAB;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View CatchingFishCoroutine = layoutManager.CatchingFishDaggerWebsocket() ? CatchingFishCoroutine(layoutManager, CatchingFishDaggerWebsocket(layoutManager)) : layoutManager.CatchingFishReduxKtor() ? CatchingFishCoroutine(layoutManager, CatchingFishReduxKtor(layoutManager)) : null;
        if (CatchingFishCoroutine == null) {
            return;
        }
        int[] CatchingFishParcelableFAB = CatchingFishParcelableFAB(layoutManager, CatchingFishCoroutine);
        int i = CatchingFishParcelableFAB[0];
        if (i == 0 && CatchingFishParcelableFAB[1] == 0) {
            return;
        }
        this.CatchingFishParcelableFAB.CatchingFishStripeAPI(i, CatchingFishParcelableFAB[1], false);
    }
}
