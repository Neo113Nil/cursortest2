package kotlin.text;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishWebSocketToast extends CatchingFishReduxLayout {
    public final int[] CatchingFishLayout;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public final View CatchingFishWorkManager;

    public CatchingFishWebSocketToast(View view) {
        super(0);
        this.CatchingFishLayout = new int[2];
        this.CatchingFishWorkManager = view;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final void CatchingFishDaggerWebsocket(CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit) {
        View view = this.CatchingFishWorkManager;
        int[] iArr = this.CatchingFishLayout;
        view.getLocationOnScreen(iArr);
        this.CatchingFishViewModelScope = iArr[1];
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final void CatchingFishReduxKtor(CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit) {
        this.CatchingFishWorkManager.setTranslationY(0.0f);
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final CatchingFishViewModelIntent CatchingFishViewModelScope(CatchingFishGoogleMapsJUnit catchingFishGoogleMapsJUnit, CatchingFishViewModelIntent catchingFishViewModelIntent) {
        View view = this.CatchingFishWorkManager;
        int[] iArr = this.CatchingFishLayout;
        view.getLocationOnScreen(iArr);
        int i = this.CatchingFishViewModelScope - iArr[1];
        this.CatchingFishViewModelFAB = i;
        view.setTranslationY(i);
        return catchingFishViewModelIntent;
    }

    @Override // kotlin.text.CatchingFishReduxLayout
    public final CatchingFishKtorPicassoMVVM CatchingFishWorkManager(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((CatchingFishGoogleMapsJUnit) it.next()).CatchingFishParcelableFAB.CatchingFishReduxKtor() & 8) != 0) {
                this.CatchingFishWorkManager.setTranslationY(CatchingFishRobolectricRoom.CatchingFishCoroutine(r0.CatchingFishParcelableFAB.CatchingFishCoroutine(), this.CatchingFishViewModelFAB, 0));
                break;
            }
        }
        return catchingFishKtorPicassoMVVM;
    }
}
