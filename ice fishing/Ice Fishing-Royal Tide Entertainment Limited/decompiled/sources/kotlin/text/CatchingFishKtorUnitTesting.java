package kotlin.text;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishKtorUnitTesting implements CatchingFishDaggerHiltGson {
    public CatchingFishKtorAdMob CatchingFishDaggerWebsocket;
    public CatchingFishSharedFlowAdMob CatchingFishReduxKtor;
    public final /* synthetic */ Toolbar CatchingFishWorkManager;

    public CatchingFishKtorUnitTesting(Toolbar toolbar) {
        this.CatchingFishWorkManager = toolbar;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishCloudMessaging(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        Toolbar toolbar = this.CatchingFishWorkManager;
        KeyEvent.Callback callback = toolbar.CatchingFishEspressoTesting;
        if (callback instanceof CatchingFishMVVMRetrofit) {
            ((CatchingFishGoogleMapsMockk) ((CatchingFishMVVMRetrofit) callback)).CatchingFishReduxKtor.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.CatchingFishEspressoTesting);
        toolbar.removeView(toolbar.CatchingFishCloudMessaging);
        toolbar.CatchingFishEspressoTesting = null;
        ArrayList arrayList = toolbar.CatchingFishPayPalService;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.CatchingFishDaggerWebsocket = null;
        toolbar.requestLayout();
        catchingFishKtorAdMob.CatchingFishMVPRobolectric = false;
        catchingFishKtorAdMob.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        toolbar.CatchingFishJetpackCompose();
        return true;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishCoroutine(CatchingFishGradleLifecycle catchingFishGradleLifecycle) {
        return false;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishDaggerWebsocket(Context context, CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        CatchingFishKtorAdMob catchingFishKtorAdMob;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob2 = this.CatchingFishReduxKtor;
        if (catchingFishSharedFlowAdMob2 != null && (catchingFishKtorAdMob = this.CatchingFishDaggerWebsocket) != null) {
            catchingFishSharedFlowAdMob2.CatchingFishReduxKtor(catchingFishKtorAdMob);
        }
        this.CatchingFishReduxKtor = catchingFishSharedFlowAdMob;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishLayout() {
        return false;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishViewModelFAB(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        Toolbar toolbar = this.CatchingFishWorkManager;
        toolbar.CatchingFishCoroutine();
        ViewParent parent = toolbar.CatchingFishCloudMessaging.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.CatchingFishCloudMessaging);
            }
            toolbar.addView(toolbar.CatchingFishCloudMessaging);
        }
        View actionView = catchingFishKtorAdMob.getActionView();
        toolbar.CatchingFishEspressoTesting = actionView;
        this.CatchingFishDaggerWebsocket = catchingFishKtorAdMob;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.CatchingFishEspressoTesting);
            }
            CatchingFishMVISnackbarMVVM CatchingFishViewModelFAB = Toolbar.CatchingFishViewModelFAB();
            CatchingFishViewModelFAB.CatchingFishParcelableFAB = (toolbar.CatchingFishRoomDatabase & 112) | 8388611;
            CatchingFishViewModelFAB.CatchingFishSnackbar = 2;
            toolbar.CatchingFishEspressoTesting.setLayoutParams(CatchingFishViewModelFAB);
            toolbar.addView(toolbar.CatchingFishEspressoTesting);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((CatchingFishMVISnackbarMVVM) childAt.getLayoutParams()).CatchingFishSnackbar != 2 && childAt != toolbar.CatchingFishReduxKtor) {
                toolbar.removeViewAt(childCount);
                toolbar.CatchingFishPayPalService.add(childAt);
            }
        }
        toolbar.requestLayout();
        catchingFishKtorAdMob.CatchingFishMVPRobolectric = true;
        catchingFishKtorAdMob.CatchingFishUnitTesting.CatchingFishStateLiveData(false);
        KeyEvent.Callback callback = toolbar.CatchingFishEspressoTesting;
        if (callback instanceof CatchingFishMVVMRetrofit) {
            ((CatchingFishGoogleMapsMockk) ((CatchingFishMVVMRetrofit) callback)).CatchingFishReduxKtor.onActionViewExpanded();
        }
        toolbar.CatchingFishJetpackCompose();
        return true;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishWorkManager() {
        if (this.CatchingFishDaggerWebsocket != null) {
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishReduxKtor;
            if (catchingFishSharedFlowAdMob != null) {
                int size = catchingFishSharedFlowAdMob.CatchingFishWorkManager.size();
                for (int i = 0; i < size; i++) {
                    if (this.CatchingFishReduxKtor.getItem(i) == this.CatchingFishDaggerWebsocket) {
                        return;
                    }
                }
            }
            CatchingFishCloudMessaging(this.CatchingFishDaggerWebsocket);
        }
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, boolean z) {
    }
}
