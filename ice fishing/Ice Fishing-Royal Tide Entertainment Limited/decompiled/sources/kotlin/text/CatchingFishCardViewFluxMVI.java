package kotlin.text;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class CatchingFishCardViewFluxMVI {
    public final int CatchingFishParcelableFAB;

    public CatchingFishCardViewFluxMVI(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    public static Status CatchingFishViewModelFAB(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract int CatchingFishCoroutine(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP);

    public abstract void CatchingFishDaggerWebsocket(Exception exc);

    public abstract CatchingFishAppCompatPayPal[] CatchingFishParcelableFAB(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP);

    public abstract void CatchingFishReduxKtor(Status status);

    public abstract boolean CatchingFishSnackbar(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP);

    public abstract void CatchingFishViewModelScope(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP);

    public abstract void CatchingFishWorkManager(CatchingFishViewModelIntent catchingFishViewModelIntent, boolean z);
}
