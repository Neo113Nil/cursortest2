package kotlin.text;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class CatchingFishBundleMoshi extends CatchingFishCardViewFluxMVI {
    public final CatchingFishAndroidXPayPal CatchingFishSnackbar;

    public CatchingFishBundleMoshi(CatchingFishAndroidXPayPal catchingFishAndroidXPayPal) {
        super(4);
        this.CatchingFishSnackbar = catchingFishAndroidXPayPal;
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final int CatchingFishCoroutine(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP) {
        if (catchingFishAdMobDaggerMVP.CatchingFishRoomDatabase.get(null) == null) {
            return -1;
        }
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final void CatchingFishDaggerWebsocket(Exception exc) {
        this.CatchingFishSnackbar.CatchingFishSnackbar(exc);
    }

    public final void CatchingFishLayout(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP) {
        if (catchingFishAdMobDaggerMVP.CatchingFishRoomDatabase.remove(null) != null) {
            throw new ClassCastException();
        }
        this.CatchingFishSnackbar.CatchingFishCoroutine(Boolean.FALSE);
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final CatchingFishAppCompatPayPal[] CatchingFishParcelableFAB(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP) {
        if (catchingFishAdMobDaggerMVP.CatchingFishRoomDatabase.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final void CatchingFishReduxKtor(Status status) {
        this.CatchingFishSnackbar.CatchingFishSnackbar(new CatchingFishSnackbarIntent(status));
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final boolean CatchingFishSnackbar(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP) {
        if (catchingFishAdMobDaggerMVP.CatchingFishRoomDatabase.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final void CatchingFishViewModelScope(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP) {
        try {
            CatchingFishLayout(catchingFishAdMobDaggerMVP);
        } catch (DeadObjectException e) {
            CatchingFishReduxKtor(CatchingFishCardViewFluxMVI.CatchingFishViewModelFAB(e));
            throw e;
        } catch (RemoteException e2) {
            CatchingFishReduxKtor(CatchingFishCardViewFluxMVI.CatchingFishViewModelFAB(e2));
        } catch (RuntimeException e3) {
            this.CatchingFishSnackbar.CatchingFishSnackbar(e3);
        }
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final /* bridge */ /* synthetic */ void CatchingFishWorkManager(CatchingFishViewModelIntent catchingFishViewModelIntent, boolean z) {
    }
}
