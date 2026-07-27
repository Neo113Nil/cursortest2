package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishPayPalViewModel extends CatchingFishMockkGradle implements Iterable, CatchingFishCardViewFAB {
    public final float CatchingFishCloudMessaging;
    public final float CatchingFishDaggerWebsocket;
    public final List CatchingFishEspressoTesting;
    public final float CatchingFishFragmentHandler;
    public final float CatchingFishLayout;
    public final List CatchingFishOkHttp;
    public final String CatchingFishReduxKtor;
    public final float CatchingFishViewModelFAB;
    public final float CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;

    public CatchingFishPayPalViewModel(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.CatchingFishReduxKtor = str;
        this.CatchingFishDaggerWebsocket = f;
        this.CatchingFishWorkManager = f2;
        this.CatchingFishViewModelScope = f3;
        this.CatchingFishViewModelFAB = f4;
        this.CatchingFishLayout = f5;
        this.CatchingFishFragmentHandler = f6;
        this.CatchingFishCloudMessaging = f7;
        this.CatchingFishEspressoTesting = list;
        this.CatchingFishOkHttp = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof CatchingFishPayPalViewModel)) {
            CatchingFishPayPalViewModel catchingFishPayPalViewModel = (CatchingFishPayPalViewModel) obj;
            return CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishPayPalViewModel.CatchingFishReduxKtor) && this.CatchingFishDaggerWebsocket == catchingFishPayPalViewModel.CatchingFishDaggerWebsocket && this.CatchingFishWorkManager == catchingFishPayPalViewModel.CatchingFishWorkManager && this.CatchingFishViewModelScope == catchingFishPayPalViewModel.CatchingFishViewModelScope && this.CatchingFishViewModelFAB == catchingFishPayPalViewModel.CatchingFishViewModelFAB && this.CatchingFishLayout == catchingFishPayPalViewModel.CatchingFishLayout && this.CatchingFishFragmentHandler == catchingFishPayPalViewModel.CatchingFishFragmentHandler && this.CatchingFishCloudMessaging == catchingFishPayPalViewModel.CatchingFishCloudMessaging && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishEspressoTesting, catchingFishPayPalViewModel.CatchingFishEspressoTesting) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishOkHttp, catchingFishPayPalViewModel.CatchingFishOkHttp);
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishOkHttp.hashCode() + ((this.CatchingFishEspressoTesting.hashCode() + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishCloudMessaging, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishFragmentHandler, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishLayout, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishViewModelFAB, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishViewModelScope, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishWorkManager, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishDaggerWebsocket, this.CatchingFishReduxKtor.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new CatchingFishCustomViewRedux(this);
    }
}
