package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishOkHttpStripeAPI {
    public boolean CatchingFishCoroutine;
    public CatchingFishReduxSpannable CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public long CatchingFishSnackbar;

    public CatchingFishOkHttpStripeAPI(long j, CatchingFishReduxSpannable catchingFishReduxSpannable) {
        int i;
        int numberOfTrailingZeros;
        this.CatchingFishParcelableFAB = catchingFishReduxSpannable;
        this.CatchingFishSnackbar = j;
        CatchingFishPayPalOkHttp catchingFishPayPalOkHttp = CatchingFishIntentBundle.CatchingFishParcelableFAB;
        if (j != 0) {
            CatchingFishReduxSpannable CatchingFishReduxKtor = CatchingFishReduxKtor();
            long j2 = CatchingFishReduxKtor.CatchingFishWorkManager;
            long[] jArr = CatchingFishReduxKtor.CatchingFishViewModelScope;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = CatchingFishReduxKtor.CatchingFishDaggerWebsocket;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = CatchingFishReduxKtor.CatchingFishReduxKtor;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
                i = CatchingFishIntentBundle.CatchingFishWorkManager.CatchingFishParcelableFAB(j);
            }
        } else {
            i = -1;
        }
        this.CatchingFishReduxKtor = i;
    }

    public static void CatchingFishRoomDatabase(CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI) {
        CatchingFishIntentBundle.CatchingFishSnackbar.CatchingFishStripeAPI(catchingFishOkHttpStripeAPI);
    }

    public void CatchingFish(long j) {
        this.CatchingFishSnackbar = j;
    }

    public final void CatchingFishAnimationMockk() {
        int i = this.CatchingFishReduxKtor;
        if (i >= 0) {
            CatchingFishIntentBundle.CatchingFishCoroutineFlow(i);
            this.CatchingFishReduxKtor = -1;
        }
    }

    public abstract void CatchingFishCloudMessaging();

    public abstract void CatchingFishCoroutine();

    public abstract CatchingFishOkHttpStripeAPI CatchingFishCoroutineFlow(CatchingFishServiceHandler catchingFishServiceHandler);

    public abstract CatchingFishServiceHandler CatchingFishDaggerWebsocket();

    public abstract void CatchingFishEspressoTesting();

    public final CatchingFishOkHttpStripeAPI CatchingFishFragmentHandler() {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = CatchingFishIntentBundle.CatchingFishSnackbar;
        CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI = (CatchingFishOkHttpStripeAPI) catchingFishAsyncTaskDagger.get();
        catchingFishAsyncTaskDagger.CatchingFishStripeAPI(this);
        return catchingFishOkHttpStripeAPI;
    }

    public void CatchingFishJetpackCompose(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract CatchingFishServiceHandler CatchingFishLayout();

    public void CatchingFishNavigation(CatchingFishReduxSpannable catchingFishReduxSpannable) {
        this.CatchingFishParcelableFAB = catchingFishReduxSpannable;
    }

    public abstract void CatchingFishOkHttp();

    public final void CatchingFishParcelableFAB() {
        synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
            CatchingFishSnackbar();
            CatchingFishStateLiveData();
        }
    }

    public CatchingFishReduxSpannable CatchingFishReduxKtor() {
        return this.CatchingFishParcelableFAB;
    }

    public void CatchingFishSnackbar() {
        CatchingFishIntentBundle.CatchingFishReduxKtor = CatchingFishIntentBundle.CatchingFishReduxKtor.CatchingFishSnackbar(CatchingFishViewModelScope());
    }

    public void CatchingFishStateLiveData() {
        CatchingFishAnimationMockk();
    }

    public abstract void CatchingFishUnitTesting(CatchingFishJUnitViewPager catchingFishJUnitViewPager);

    public int CatchingFishViewModelFAB() {
        return 0;
    }

    public long CatchingFishViewModelScope() {
        return this.CatchingFishSnackbar;
    }

    public abstract boolean CatchingFishWorkManager();
}
