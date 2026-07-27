package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishGlideAsyncTask implements CatchingFishJUnitGlide {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 1;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishGlideAsyncTask(CatchingFishMockkPicasso catchingFishMockkPicasso, CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP, CatchingFishViewRobolectric catchingFishViewRobolectric) {
        this.CatchingFishDaggerWebsocket = catchingFishMockkPicasso;
        this.CatchingFishWorkManager = catchingFishGoogleMapsMVP;
        this.CatchingFishViewModelScope = catchingFishViewRobolectric;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        List list;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = (CatchingFishSharedFlowMVI) this.CatchingFishDaggerWebsocket;
                CatchingFishMoshiEspresso catchingFishMoshiEspresso = (CatchingFishMoshiEspresso) this.CatchingFishWorkManager;
                CatchingFishAnimationMVP catchingFishAnimationMVP = (CatchingFishAnimationMVP) this.CatchingFishViewModelScope;
                CatchingFishToolbarWidget catchingFishToolbarWidget = catchingFishSharedFlowMVI.CatchingFishCameraXIntent;
                CatchingFishMoshiEspresso catchingFishMoshiEspresso2 = catchingFishToolbarWidget.CatchingFishSnackbar;
                try {
                    catchingFishToolbarWidget.CatchingFishSnackbar = catchingFishMoshiEspresso;
                    CatchingFishAnimationMVP catchingFishAnimationMVP2 = catchingFishSharedFlowMVI.CatchingFishMutableLiveData;
                    int[] iArr = catchingFishSharedFlowMVI.CatchingFishUnitTesting;
                    CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = catchingFishSharedFlowMVI.CatchingFishCoroutineFlow;
                    catchingFishSharedFlowMVI.CatchingFishUnitTesting = null;
                    catchingFishSharedFlowMVI.CatchingFishCoroutineFlow = null;
                    try {
                        catchingFishSharedFlowMVI.CatchingFishMutableLiveData = catchingFishAnimationMVP;
                        boolean z = catchingFishToolbarWidget.CatchingFishDaggerWebsocket;
                        try {
                            catchingFishToolbarWidget.CatchingFishDaggerWebsocket = false;
                            throw null;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    catchingFishToolbarWidget.CatchingFishSnackbar = catchingFishMoshiEspresso2;
                    throw th;
                }
            default:
                CatchingFishMockkPicasso catchingFishMockkPicasso = (CatchingFishMockkPicasso) this.CatchingFishDaggerWebsocket;
                CatchingFishGoogleMapsMVP catchingFishGoogleMapsMVP = (CatchingFishGoogleMapsMVP) this.CatchingFishWorkManager;
                CatchingFishViewRobolectric catchingFishViewRobolectric = (CatchingFishViewRobolectric) this.CatchingFishViewModelScope;
                if (catchingFishMockkPicasso != null) {
                    catchingFishGoogleMapsMVP.CatchingFishParcelableFAB(catchingFishGoogleMapsMVP.CatchingFishCoroutine(catchingFishMockkPicasso) - catchingFishGoogleMapsMVP.CatchingFishJetpackCompose);
                }
                List CatchingFishLayout = CatchingFishGsonCardView.CatchingFishLayout(catchingFishGoogleMapsMVP, null, catchingFishGoogleMapsMVP.CatchingFishJetpackCompose, null);
                CatchingFishFirebaseDagger.CatchingFishNavigation(CatchingFishLayout, "<this>");
                CatchingFishMockkEspresso catchingFishMockkEspresso = (CatchingFishMockkEspresso) (CatchingFishLayout.isEmpty() ? null : CatchingFishLayout.get(CatchingFishLayout.size() - 1));
                Integer num = catchingFishMockkEspresso != null ? catchingFishMockkEspresso.CatchingFishParcelableFAB : null;
                List CatchingFishWorkManager = catchingFishViewRobolectric.CatchingFishWorkManager(num);
                if (num != null && !CatchingFishWorkManager.isEmpty()) {
                    CatchingFishMockkEspresso catchingFishMockkEspresso2 = (CatchingFishMockkEspresso) CatchingFishCameraXCameraX.CatchingFishStateFlow(CatchingFishWorkManager);
                    int size = CatchingFishWorkManager.size() - 1;
                    if (size <= 0) {
                        list = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
                    } else if (size != 1) {
                        ArrayList arrayList = new ArrayList(size);
                        if (CatchingFishWorkManager instanceof RandomAccess) {
                            int size2 = CatchingFishWorkManager.size();
                            for (int i = 1; i < size2; i++) {
                                arrayList.add(CatchingFishWorkManager.get(i));
                            }
                        } else {
                            ListIterator listIterator = CatchingFishWorkManager.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        list = arrayList;
                    } else {
                        if (CatchingFishWorkManager.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        list = CatchingFishGsonCardView.CatchingFishFragmentFactory(CatchingFishWorkManager.get(CatchingFishToastCustomView.CatchingFishMotionLayout(CatchingFishWorkManager)));
                    }
                    catchingFishMockkEspresso2.getClass();
                    CatchingFishWorkManager = CatchingFishCameraXCameraX.CatchingFishMoshiDaggerHilt(CatchingFishGsonCardView.CatchingFishFragmentFactory(new CatchingFishMockkEspresso(null, num)), list);
                }
                return CatchingFishCameraXCameraX.CatchingFishMoshiDaggerHilt(CatchingFishLayout, CatchingFishWorkManager);
        }
    }

    public /* synthetic */ CatchingFishGlideAsyncTask(CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, CatchingFishMoshiEspresso catchingFishMoshiEspresso, CatchingFishAnimationMVP catchingFishAnimationMVP, CatchingFishHiltAdMobView catchingFishHiltAdMobView) {
        this.CatchingFishDaggerWebsocket = catchingFishSharedFlowMVI;
        this.CatchingFishWorkManager = catchingFishMoshiEspresso;
        this.CatchingFishViewModelScope = catchingFishAnimationMVP;
    }
}
