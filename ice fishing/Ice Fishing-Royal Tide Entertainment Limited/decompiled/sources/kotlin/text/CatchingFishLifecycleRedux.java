package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleRedux implements CatchingFishFluxOkHttp {
    public final boolean CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public ArrayList CatchingFishViewModelFAB;
    public CatchingFishHiltFAB CatchingFishViewModelScope;
    public CatchingFishMockkView CatchingFishWorkManager;

    public CatchingFishLifecycleRedux(int i, CatchingFishMockkView catchingFishMockkView, boolean z) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = z;
        this.CatchingFishWorkManager = catchingFishMockkView;
    }

    @Override // kotlin.text.CatchingFishCameraXGlide
    public final /* bridge */ /* synthetic */ Object CatchingFishCoroutine(Integer num, Integer num2, Object obj, Integer num3) {
        return CatchingFishViewModelScope(num, num2, (CatchingFishSharedFlowMVI) obj, num3.intValue());
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final /* bridge */ /* synthetic */ Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        return CatchingFishWorkManager(((Number) obj2).intValue(), (CatchingFishSharedFlowMVI) obj);
    }

    public final void CatchingFishLayout(CatchingFishSharedFlowMVI catchingFishSharedFlowMVI) {
        CatchingFishHiltFAB CatchingFishCoroutineFlow;
        if (!this.CatchingFishDaggerWebsocket || (CatchingFishCoroutineFlow = catchingFishSharedFlowMVI.CatchingFishCoroutineFlow()) == null) {
            return;
        }
        CatchingFishCoroutineFlow.CatchingFishSnackbar |= 1;
        if (CatchingFishBiometricBundle.CatchingFishJobScheduler(this.CatchingFishViewModelScope, CatchingFishCoroutineFlow)) {
            this.CatchingFishViewModelScope = CatchingFishCoroutineFlow;
            return;
        }
        ArrayList arrayList = this.CatchingFishViewModelFAB;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.CatchingFishViewModelFAB = arrayList2;
            arrayList2.add(CatchingFishCoroutineFlow);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (CatchingFishBiometricBundle.CatchingFishJobScheduler((CatchingFishHiltFAB) arrayList.get(i), CatchingFishCoroutineFlow)) {
                arrayList.set(i, CatchingFishCoroutineFlow);
                return;
            }
        }
        arrayList.add(CatchingFishCoroutineFlow);
    }

    @Override // kotlin.text.CatchingFishJobSchedulerMVP
    public final /* bridge */ /* synthetic */ Object CatchingFishReduxKtor(Object obj, Object obj2, Object obj3) {
        return CatchingFishViewModelFAB(obj, (CatchingFishSharedFlowMVI) obj2, ((Number) obj3).intValue());
    }

    public final Object CatchingFishViewModelFAB(Object obj, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i) {
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(this.CatchingFishReduxKtor);
        CatchingFishLayout(catchingFishSharedFlowMVI);
        int CatchingFishDaggerWebsocket = catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(this) ? CatchingFishBiometricBundle.CatchingFishDaggerWebsocket(2, 1) : CatchingFishBiometricBundle.CatchingFishDaggerWebsocket(1, 1);
        CatchingFishMockkView catchingFishMockkView = this.CatchingFishWorkManager;
        CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(3, catchingFishMockkView);
        Object CatchingFishReduxKtor = ((CatchingFishJobSchedulerMVP) catchingFishMockkView).CatchingFishReduxKtor(obj, catchingFishSharedFlowMVI, Integer.valueOf(CatchingFishDaggerWebsocket | i));
        CatchingFishHiltFAB CatchingFishRoomDatabase = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            CatchingFishRoomDatabase.CatchingFishReduxKtor = new CatchingFishGlideAndroidX(i, 0, this, obj);
        }
        return CatchingFishReduxKtor;
    }

    public final Object CatchingFishViewModelScope(final Integer num, final Integer num2, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, final int i) {
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(this.CatchingFishReduxKtor);
        CatchingFishLayout(catchingFishSharedFlowMVI);
        int CatchingFishDaggerWebsocket = catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(this) ? CatchingFishBiometricBundle.CatchingFishDaggerWebsocket(2, 2) : CatchingFishBiometricBundle.CatchingFishDaggerWebsocket(1, 2);
        CatchingFishMockkView catchingFishMockkView = this.CatchingFishWorkManager;
        CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(4, catchingFishMockkView);
        Object CatchingFishCoroutine = ((CatchingFishCameraXGlide) catchingFishMockkView).CatchingFishCoroutine(num, num2, catchingFishSharedFlowMVI, Integer.valueOf(CatchingFishDaggerWebsocket | i));
        CatchingFishHiltFAB CatchingFishRoomDatabase = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            CatchingFishRoomDatabase.CatchingFishReduxKtor = new CatchingFishMockkView() { // from class: kotlin.text.CatchingFishBiometricFAB
                @Override // kotlin.text.CatchingFishMockkView
                public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int CatchingFishRecyclerView = CatchingFishDaggerBiometric.CatchingFishRecyclerView(i) | 1;
                    CatchingFishLifecycleRedux.this.CatchingFishViewModelScope(num, num2, (CatchingFishSharedFlowMVI) obj, CatchingFishRecyclerView);
                    return CatchingFishRealmContext.CatchingFishParcelableFAB;
                }
            };
        }
        return CatchingFishCoroutine;
    }

    public final Object CatchingFishWorkManager(int i, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI) {
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(this.CatchingFishReduxKtor);
        CatchingFishLayout(catchingFishSharedFlowMVI);
        int CatchingFishDaggerWebsocket = i | (catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(this) ? CatchingFishBiometricBundle.CatchingFishDaggerWebsocket(2, 0) : CatchingFishBiometricBundle.CatchingFishDaggerWebsocket(1, 0));
        CatchingFishMockkView catchingFishMockkView = this.CatchingFishWorkManager;
        CatchingFishLayoutRoomFAB.CatchingFishFragmentHandler(2, catchingFishMockkView);
        Object CatchingFishDaggerWebsocket2 = catchingFishMockkView.CatchingFishDaggerWebsocket(catchingFishSharedFlowMVI, Integer.valueOf(CatchingFishDaggerWebsocket));
        CatchingFishHiltFAB CatchingFishRoomDatabase = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            CatchingFishRoomDatabase.CatchingFishReduxKtor = new CatchingFishSpannableGradle(2, CatchingFishLifecycleRedux.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return CatchingFishDaggerWebsocket2;
    }
}
