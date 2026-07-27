package kotlin.text;

import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;

/* loaded from: classes.dex */
public final class CatchingFishDaggerCoroutine extends CatchingFishSnackbar {
    public final CatchingFishAsyncTaskIntent CatchingFishEspressoTesting;
    public boolean CatchingFishOkHttp;

    public CatchingFishDaggerCoroutine(MainActivity mainActivity) {
        super(mainActivity, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        CatchingFishToastWidget catchingFishToastWidget = new CatchingFishToastWidget(8, this);
        addOnAttachStateChangeListener(catchingFishToastWidget);
        CatchingFishAsyncTaskWidget catchingFishAsyncTaskWidget = new CatchingFishAsyncTaskWidget(13);
        CatchingFishDaggerBiometric.CatchingFishCoroutineFlow(this).CatchingFishParcelableFAB.add(catchingFishAsyncTaskWidget);
        this.CatchingFishViewModelFAB = new CatchingFishRetrofitMVI(this, catchingFishToastWidget, catchingFishAsyncTaskWidget, 1);
        this.CatchingFishEspressoTesting = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(null);
    }

    @Override // kotlin.text.CatchingFishSnackbar
    public final void CatchingFishParcelableFAB(int i, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI) {
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(420213850);
        int i2 = (catchingFishSharedFlowMVI.CatchingFishViewModelScope(this) ? 4 : 2) | i;
        if (catchingFishSharedFlowMVI.CatchingFishDagger(i2 & 1, (i2 & 3) != 2)) {
            CatchingFishMockkView catchingFishMockkView = (CatchingFishMockkView) this.CatchingFishEspressoTesting.getValue();
            if (catchingFishMockkView == null) {
                catchingFishSharedFlowMVI.CatchingFishParcelable(-1238798753);
            } else {
                catchingFishSharedFlowMVI.CatchingFishParcelable(98586082);
                catchingFishMockkView.CatchingFishDaggerWebsocket(catchingFishSharedFlowMVI, 0);
            }
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
        } else {
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
        }
        CatchingFishHiltFAB CatchingFishRoomDatabase = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            CatchingFishRoomDatabase.CatchingFishReduxKtor = new CatchingFishView(i, 1, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return CatchingFishDaggerCoroutine.class.getName();
    }

    @Override // kotlin.text.CatchingFishSnackbar
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.CatchingFishOkHttp;
    }

    public final void setContent(CatchingFishMockkView catchingFishMockkView) {
        this.CatchingFishOkHttp = true;
        this.CatchingFishEspressoTesting.setValue(catchingFishMockkView);
        if (isAttachedToWindow()) {
            if (this.CatchingFishViewModelScope == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            CatchingFishCoroutine();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
