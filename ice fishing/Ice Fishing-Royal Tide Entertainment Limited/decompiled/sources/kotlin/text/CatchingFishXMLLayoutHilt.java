package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishXMLLayoutHilt extends CatchingFishToastGradle implements CatchingFishRealmAndroidX {
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishCloudMessaging = AtomicIntegerFieldUpdater.newUpdater(CatchingFishXMLLayoutHilt.class, "runningWorkers$volatile");
    public final Object CatchingFishFragmentHandler;
    public final CatchingFishMoshiToast CatchingFishLayout;
    public final int CatchingFishViewModelFAB;
    public final CatchingFishToastGradle CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishRealmAndroidX CatchingFishWorkManager;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishXMLLayoutHilt(CatchingFishToastGradle catchingFishToastGradle, int i) {
        CatchingFishRealmAndroidX catchingFishRealmAndroidX = catchingFishToastGradle instanceof CatchingFishRealmAndroidX ? (CatchingFishRealmAndroidX) catchingFishToastGradle : null;
        this.CatchingFishWorkManager = catchingFishRealmAndroidX == null ? CatchingFishMoshiNavigation.CatchingFishParcelableFAB : catchingFishRealmAndroidX;
        this.CatchingFishViewModelScope = catchingFishToastGradle;
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishLayout = new CatchingFishMoshiToast();
        this.CatchingFishFragmentHandler = new Object();
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final void CatchingFishCardViewView(CatchingFishManifestMockk catchingFishManifestMockk, Runnable runnable) {
        boolean z;
        Runnable CatchingFishFragmentFactory;
        this.CatchingFishLayout.CatchingFishParcelableFAB(runnable);
        if (CatchingFishCloudMessaging.get(this) < this.CatchingFishViewModelFAB) {
            synchronized (this.CatchingFishFragmentHandler) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishCloudMessaging;
                if (atomicIntegerFieldUpdater.get(this) >= this.CatchingFishViewModelFAB) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (CatchingFishFragmentFactory = CatchingFishFragmentFactory()) == null) {
                return;
            }
            this.CatchingFishViewModelScope.CatchingFishCardViewView(this, new CatchingFishService(23, this, CatchingFishFragmentFactory));
        }
    }

    public final Runnable CatchingFishFragmentFactory() {
        while (true) {
            Runnable runnable = (Runnable) this.CatchingFishLayout.CatchingFishReduxKtor();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.CatchingFishFragmentHandler) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CatchingFishCloudMessaging;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.CatchingFishLayout.CatchingFishCoroutine() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // kotlin.text.CatchingFishRealmAndroidX
    public final void CatchingFishParcelableFlux(long j, CatchingFishKtorMockk catchingFishKtorMockk) {
        this.CatchingFishWorkManager.CatchingFishParcelableFlux(j, catchingFishKtorMockk);
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.CatchingFishViewModelScope);
        sb.append(".limitedParallelism(");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, this.CatchingFishViewModelFAB, ')');
    }
}
