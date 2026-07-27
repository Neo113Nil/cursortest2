package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishKtorReduxBundle {
    public Object CatchingFishCoroutine;
    public Object CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB;
    public Object CatchingFishReduxKtor;
    public Object CatchingFishSnackbar;
    public Serializable CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public CatchingFishDaggerDataStore CatchingFishParcelableFAB() {
        String str = this.CatchingFishParcelableFAB == 0 ? " registrationStatus" : "";
        if (((Long) this.CatchingFishWorkManager) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.CatchingFishViewModelScope) == null) {
            str = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new CatchingFishDaggerDataStore((String) this.CatchingFishSnackbar, this.CatchingFishParcelableFAB, (String) this.CatchingFishCoroutine, (String) this.CatchingFishReduxKtor, ((Long) this.CatchingFishWorkManager).longValue(), ((Long) this.CatchingFishViewModelScope).longValue(), (String) this.CatchingFishDaggerWebsocket);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
