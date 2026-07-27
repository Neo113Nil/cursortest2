package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishBundleIntent implements CatchingFishSnackbarFAB {
    public final int CatchingFishDaggerWebsocket;
    public final CatchingFishEspressoPayPal CatchingFishReduxKtor;
    public final long CatchingFishViewModelScope;
    public final long CatchingFishWorkManager = 1500 * 1000000;

    public CatchingFishBundleIntent(CatchingFishEspressoPayPal catchingFishEspressoPayPal, int i, long j) {
        this.CatchingFishReduxKtor = catchingFishEspressoPayPal;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishViewModelScope = j * 1000000;
    }

    @Override // kotlin.text.CatchingFishSnackbarFAB
    public final CatchingFishEspressoView CatchingFishParcelableFAB(long j, CatchingFishEspressoView catchingFishEspressoView, CatchingFishEspressoView catchingFishEspressoView2, CatchingFishEspressoView catchingFishEspressoView3) {
        CatchingFishEspressoView catchingFishEspressoView4;
        CatchingFishEspressoView catchingFishEspressoView5;
        CatchingFishEspressoPayPal catchingFishEspressoPayPal;
        long j2 = this.CatchingFishViewModelScope;
        long j3 = j + j2;
        long j4 = 0;
        long j5 = this.CatchingFishWorkManager;
        if (j3 > 0) {
            long j6 = j3 / j5;
            j4 = (this.CatchingFishDaggerWebsocket == 1 || j6 % ((long) 2) == 0) ? j3 - (j6 * j5) : ((j6 + 1) * j5) - j3;
        }
        long j7 = j4;
        CatchingFishEspressoPayPal catchingFishEspressoPayPal2 = this.CatchingFishReduxKtor;
        if (j3 > j5) {
            long j8 = j5 - j2;
            CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = (CatchingFishAsyncTaskDagger) catchingFishEspressoPayPal2.CatchingFishDaggerWebsocket;
            if (((CatchingFishEspressoView) catchingFishAsyncTaskDagger.CatchingFishViewModelScope) == null) {
                catchingFishAsyncTaskDagger.CatchingFishViewModelScope = catchingFishEspressoView3.CatchingFishCoroutine();
            }
            CatchingFishEspressoView catchingFishEspressoView6 = (CatchingFishEspressoView) catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
            if (catchingFishEspressoView6 == null) {
                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("velocityVector");
                throw null;
            }
            int CatchingFishSnackbar = catchingFishEspressoView6.CatchingFishSnackbar();
            int i = 0;
            while (i < CatchingFishSnackbar) {
                CatchingFishEspressoView catchingFishEspressoView7 = (CatchingFishEspressoView) catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
                if (catchingFishEspressoView7 == null) {
                    CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("velocityVector");
                    throw null;
                }
                CatchingFishCameraXRoom CatchingFishViewModelFAB = ((CatchingFishEspressoPayPal) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB(i);
                float CatchingFishParcelableFAB = catchingFishEspressoView.CatchingFishParcelableFAB(i);
                float CatchingFishParcelableFAB2 = catchingFishEspressoView2.CatchingFishParcelableFAB(i);
                float CatchingFishParcelableFAB3 = catchingFishEspressoView3.CatchingFishParcelableFAB(i);
                CatchingFishEspressoPayPal catchingFishEspressoPayPal3 = catchingFishEspressoPayPal2;
                long j9 = j8 - CatchingFishViewModelFAB.CatchingFishCoroutine;
                int i2 = CatchingFishSnackbar;
                long j10 = CatchingFishViewModelFAB.CatchingFishSnackbar;
                if (0 > j10) {
                    throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum 0.");
                }
                long j11 = j9 < 0 ? 0L : j9 > j10 ? j10 : j9;
                if (j11 < 0) {
                    CatchingFishParcelableFAB3 = 0.0f;
                } else if (j11 != 0) {
                    CatchingFishParcelableFAB3 = (CatchingFishViewModelFAB.CatchingFishSnackbar(j11, CatchingFishParcelableFAB, CatchingFishParcelableFAB2, CatchingFishParcelableFAB3) - CatchingFishViewModelFAB.CatchingFishSnackbar(j11 - 1000000, CatchingFishParcelableFAB, CatchingFishParcelableFAB2, CatchingFishParcelableFAB3)) * 1000.0f;
                }
                catchingFishEspressoView7.CatchingFishReduxKtor(i, CatchingFishParcelableFAB3);
                i++;
                catchingFishEspressoPayPal2 = catchingFishEspressoPayPal3;
                CatchingFishSnackbar = i2;
            }
            catchingFishEspressoView4 = catchingFishEspressoView;
            CatchingFishEspressoPayPal catchingFishEspressoPayPal4 = catchingFishEspressoPayPal2;
            CatchingFishEspressoView catchingFishEspressoView8 = (CatchingFishEspressoView) catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
            if (catchingFishEspressoView8 == null) {
                CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("velocityVector");
                throw null;
            }
            catchingFishEspressoView5 = catchingFishEspressoView8;
            catchingFishEspressoPayPal = catchingFishEspressoPayPal4;
        } else {
            catchingFishEspressoView4 = catchingFishEspressoView;
            catchingFishEspressoView5 = catchingFishEspressoView3;
            catchingFishEspressoPayPal = catchingFishEspressoPayPal2;
        }
        return ((CatchingFishAsyncTaskDagger) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB(j7, catchingFishEspressoView4, catchingFishEspressoView2, catchingFishEspressoView5);
    }

    @Override // kotlin.text.CatchingFishSnackbarFAB
    public final long CatchingFishReduxKtor(CatchingFishEspressoView catchingFishEspressoView, CatchingFishEspressoView catchingFishEspressoView2, CatchingFishEspressoView catchingFishEspressoView3) {
        return Long.MAX_VALUE;
    }
}
