package kotlin.text;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class CatchingFishGsonFragment implements CatchingFishLiveDataFlux {
    public Object CatchingFishDaggerWebsocket;
    public Object CatchingFishLayout;
    public boolean CatchingFishReduxKtor;
    public Object CatchingFishViewModelFAB;
    public Object CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    @Override // kotlin.text.CatchingFishLiveDataFlux
    public void CatchingFishParcelableFAB(ConnectionResult connectionResult) {
        ((CatchingFishExoPlayerGson) this.CatchingFishLayout).CatchingFishOkHttp.post(new CatchingFishGsonRealmMoshi(2, this, connectionResult));
    }

    public void CatchingFishSnackbar(ConnectionResult connectionResult) {
        CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP = (CatchingFishAdMobDaggerMVP) ((CatchingFishExoPlayerGson) this.CatchingFishLayout).CatchingFishFragmentHandler.get((CatchingFishExoPlayerRoom) this.CatchingFishWorkManager);
        if (catchingFishAdMobDaggerMVP != null) {
            catchingFishAdMobDaggerMVP.CatchingFishOkHttp(connectionResult);
        }
    }
}
