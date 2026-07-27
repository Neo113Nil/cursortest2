package kotlin.text;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishHandlerPayPal extends CatchingFishBiometricBundle {
    public final /* synthetic */ CatchingFishMVIDatabinding CatchingFishDaggerHiltFAB;

    public CatchingFishHandlerPayPal(CatchingFishMVIDatabinding catchingFishMVIDatabinding) {
        this.CatchingFishDaggerHiltFAB = catchingFishMVIDatabinding;
    }

    @Override // kotlin.text.CatchingFishBiometricBundle
    public final void CatchingFishCardViewRealm(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle) {
        CatchingFishMVIDatabinding catchingFishMVIDatabinding = this.CatchingFishDaggerHiltFAB;
        catchingFishMVIDatabinding.CatchingFishCoroutine = catchingFishFluxFluxBundle;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = catchingFishMVIDatabinding.CatchingFishCoroutine;
        CatchingFishMVPOkHttpMVP catchingFishMVPOkHttpMVP = catchingFishMVIDatabinding.CatchingFishParcelableFAB;
        catchingFishMVIDatabinding.CatchingFishSnackbar = new CatchingFishAsyncTaskDagger(catchingFishFluxFluxBundle2, catchingFishMVPOkHttpMVP.CatchingFishViewModelScope, catchingFishMVPOkHttpMVP.CatchingFishLayout, Build.VERSION.SDK_INT >= 34 ? CatchingFishPicassoDagger.CatchingFishParcelableFAB() : CatchingFishGsonCardView.CatchingFishParcelableFlux());
        CatchingFishMVPOkHttpMVP catchingFishMVPOkHttpMVP2 = catchingFishMVIDatabinding.CatchingFishParcelableFAB;
        catchingFishMVPOkHttpMVP2.getClass();
        ArrayList arrayList = new ArrayList();
        catchingFishMVPOkHttpMVP2.CatchingFishParcelableFAB.writeLock().lock();
        try {
            catchingFishMVPOkHttpMVP2.CatchingFishCoroutine = 1;
            arrayList.addAll(catchingFishMVPOkHttpMVP2.CatchingFishSnackbar);
            catchingFishMVPOkHttpMVP2.CatchingFishSnackbar.clear();
            catchingFishMVPOkHttpMVP2.CatchingFishParcelableFAB.writeLock().unlock();
            catchingFishMVPOkHttpMVP2.CatchingFishReduxKtor.post(new CatchingFishServiceEspresso(arrayList, catchingFishMVPOkHttpMVP2.CatchingFishCoroutine, (Throwable) null));
        } catch (Throwable th) {
            catchingFishMVPOkHttpMVP2.CatchingFishParcelableFAB.writeLock().unlock();
            throw th;
        }
    }

    @Override // kotlin.text.CatchingFishBiometricBundle
    public final void CatchingFishGsonAppCompat(Throwable th) {
        this.CatchingFishDaggerHiltFAB.CatchingFishParcelableFAB.CatchingFishReduxKtor(th);
    }
}
