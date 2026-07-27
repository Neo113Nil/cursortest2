package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishReduxMockkView extends CatchingFishToastGradle {
    public static final /* synthetic */ int CatchingFishLayout = 0;
    public CatchingFishMVVMLifecycle CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public long CatchingFishWorkManager;

    public void CatchingFishDagger(long j, CatchingFishViewMoshi catchingFishViewMoshi) {
        CatchingFishViewGlide.CatchingFishOkHttp.CatchingFishMotionLayout(j, catchingFishViewMoshi);
    }

    public final boolean CatchingFishEspressoMockk() {
        CatchingFishMVVMLifecycle catchingFishMVVMLifecycle = this.CatchingFishViewModelFAB;
        if (catchingFishMVVMLifecycle == null) {
            return false;
        }
        CatchingFishRoomMVI catchingFishRoomMVI = (CatchingFishRoomMVI) (catchingFishMVVMLifecycle.isEmpty() ? null : catchingFishMVVMLifecycle.removeFirst());
        if (catchingFishRoomMVI == null) {
            return false;
        }
        catchingFishRoomMVI.run();
        return true;
    }

    public final void CatchingFishFragmentFactory(boolean z) {
        long j = this.CatchingFishWorkManager - (z ? 4294967296L : 1L);
        this.CatchingFishWorkManager = j;
        if (j <= 0 && this.CatchingFishViewModelScope) {
            shutdown();
        }
    }

    public abstract Thread CatchingFishJobScheduler();

    public final void CatchingFishMutableLiveData(CatchingFishRoomMVI catchingFishRoomMVI) {
        CatchingFishMVVMLifecycle catchingFishMVVMLifecycle = this.CatchingFishViewModelFAB;
        if (catchingFishMVVMLifecycle == null) {
            catchingFishMVVMLifecycle = new CatchingFishMVVMLifecycle();
            this.CatchingFishViewModelFAB = catchingFishMVVMLifecycle;
        }
        catchingFishMVVMLifecycle.addLast(catchingFishRoomMVI);
    }

    public final void CatchingFishPayPalService(boolean z) {
        this.CatchingFishWorkManager = (z ? 4294967296L : 1L) + this.CatchingFishWorkManager;
        if (z) {
            return;
        }
        this.CatchingFishViewModelScope = true;
    }

    public abstract long CatchingFishSensorManager();

    public abstract void shutdown();
}
