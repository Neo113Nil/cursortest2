package kotlin.text;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishFluxFABAndroidX extends CatchingFishCardViewFluxMVI {
    public final CatchingFishAndroidXPayPal CatchingFishCoroutine;
    public final CatchingFishWidgetContext CatchingFishReduxKtor;
    public final CatchingFishGlideFAB CatchingFishSnackbar;

    public CatchingFishFluxFABAndroidX(CatchingFishGlideFAB catchingFishGlideFAB, CatchingFishAndroidXPayPal catchingFishAndroidXPayPal, CatchingFishWidgetContext catchingFishWidgetContext) {
        super(2);
        this.CatchingFishCoroutine = catchingFishAndroidXPayPal;
        this.CatchingFishSnackbar = catchingFishGlideFAB;
        this.CatchingFishReduxKtor = catchingFishWidgetContext;
        if (catchingFishGlideFAB.CatchingFishParcelableFAB) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final int CatchingFishCoroutine(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP) {
        return 0;
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final void CatchingFishDaggerWebsocket(Exception exc) {
        this.CatchingFishCoroutine.CatchingFishSnackbar(exc);
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final CatchingFishAppCompatPayPal[] CatchingFishParcelableFAB(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP) {
        return (CatchingFishAppCompatPayPal[]) this.CatchingFishSnackbar.CatchingFishSnackbar;
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final void CatchingFishReduxKtor(Status status) {
        this.CatchingFishReduxKtor.getClass();
        this.CatchingFishCoroutine.CatchingFishSnackbar(status.CatchingFishWorkManager != null ? new CatchingFishMVPMockkHilt(status) : new CatchingFishSnackbarIntent(status));
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final boolean CatchingFishSnackbar(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP) {
        return this.CatchingFishSnackbar.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final void CatchingFishViewModelScope(CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP) {
        CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = this.CatchingFishCoroutine;
        try {
            CatchingFishGlideFAB catchingFishGlideFAB = this.CatchingFishSnackbar;
            ((CatchingFishEspressoPayPal) ((CatchingFishGlideFAB) catchingFishGlideFAB.CatchingFishCoroutine).CatchingFishSnackbar).CatchingFishWorkManager(catchingFishAdMobDaggerMVP.CatchingFishOkHttp, catchingFishAndroidXPayPal);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            CatchingFishReduxKtor(CatchingFishCardViewFluxMVI.CatchingFishViewModelFAB(e2));
        } catch (RuntimeException e3) {
            catchingFishAndroidXPayPal.CatchingFishSnackbar(e3);
        }
    }

    @Override // kotlin.text.CatchingFishCardViewFluxMVI
    public final void CatchingFishWorkManager(CatchingFishViewModelIntent catchingFishViewModelIntent, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) catchingFishViewModelIntent.CatchingFishDaggerWebsocket;
        CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = this.CatchingFishCoroutine;
        map.put(catchingFishAndroidXPayPal, valueOf);
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = catchingFishAndroidXPayPal.CatchingFishParcelableFAB;
        CatchingFishViewModelIntent catchingFishViewModelIntent2 = new CatchingFishViewModelIntent(catchingFishViewModelIntent, catchingFishAndroidXPayPal);
        catchingFishWorkManagerMVP.getClass();
        catchingFishWorkManagerMVP.CatchingFishSnackbar.CatchingFishSnackbar(new CatchingFishEspressoContext(CatchingFishReduxMockk.CatchingFishParcelableFAB, catchingFishViewModelIntent2));
        catchingFishWorkManagerMVP.CatchingFishUnitTesting();
    }
}
