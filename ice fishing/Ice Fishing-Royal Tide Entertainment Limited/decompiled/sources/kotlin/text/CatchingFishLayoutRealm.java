package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishLayoutRealm extends CatchingFishSnackbarRoom {
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishLayout = AtomicIntegerFieldUpdater.newUpdater(CatchingFishLayoutRealm.class, "_invoked$volatile");
    public final CatchingFishPayPalToast CatchingFishViewModelFAB;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    public CatchingFishLayoutRealm(CatchingFishPayPalToast catchingFishPayPalToast) {
        this.CatchingFishViewModelFAB = catchingFishPayPalToast;
    }

    @Override // kotlin.text.CatchingFishSnackbarRoom
    public final boolean CatchingFishCloudMessaging() {
        return true;
    }

    @Override // kotlin.text.CatchingFishSnackbarRoom
    public final void CatchingFishEspressoTesting(Throwable th) {
        if (CatchingFishLayout.compareAndSet(this, 0, 1)) {
            this.CatchingFishViewModelFAB.CatchingFishFragmentHandler(th);
        }
    }
}
