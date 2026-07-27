package kotlin.text;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerRealm {
    public final CopyOnWriteArrayList CatchingFishCoroutine;
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final ArrayList CatchingFishParcelableFAB;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;

    public CatchingFishViewPagerRealm(boolean z) {
        this.CatchingFishParcelableFAB = new ArrayList();
        this.CatchingFishSnackbar = z;
        this.CatchingFishCoroutine = new CopyOnWriteArrayList();
    }

    public final void CatchingFishParcelableFAB(boolean z) {
        CatchingFishReduxSharedFlow catchingFishReduxSharedFlow;
        this.CatchingFishSnackbar = z;
        ArrayList arrayList = this.CatchingFishParcelableFAB;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishViewFABEspresso catchingFishViewFABEspresso = (CatchingFishViewFABEspresso) obj;
            boolean z2 = catchingFishViewFABEspresso.CatchingFishDaggerWebsocket && z;
            if (catchingFishViewFABEspresso.CatchingFishSnackbar != z2) {
                catchingFishViewFABEspresso.CatchingFishSnackbar = z2;
                CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishViewFABEspresso.CatchingFishCoroutine;
                if (catchingFishFluxFluxBundle != null && (catchingFishReduxSharedFlow = (CatchingFishReduxSharedFlow) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket) != null) {
                    catchingFishReduxSharedFlow.CatchingFishSnackbar();
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatchingFishViewPagerRealm(CatchingFishServiceHandler catchingFishServiceHandler) {
        this(true);
        this.CatchingFishReduxKtor = 1;
        this.CatchingFishDaggerWebsocket = catchingFishServiceHandler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatchingFishViewPagerRealm(CatchingFishToastSharedFlow catchingFishToastSharedFlow) {
        this(false);
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = catchingFishToastSharedFlow;
    }
}
