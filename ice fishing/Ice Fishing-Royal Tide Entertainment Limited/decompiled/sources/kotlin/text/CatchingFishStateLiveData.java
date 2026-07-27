package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishStateLiveData extends AnimatorListenerAdapter {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishStateLiveData(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.CatchingFishSnackbar;
                actionBarOverlayLayout.CatchingFishCardViewRealm = null;
                actionBarOverlayLayout.CatchingFishOkHttp = false;
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                ((CatchingFishCoroutineJUnit) this.CatchingFishSnackbar).CatchingFishSnackbar();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.CatchingFishSnackbar;
                actionBarOverlayLayout.CatchingFishCardViewRealm = null;
                actionBarOverlayLayout.CatchingFishOkHttp = false;
                break;
            case 1:
                CatchingFishAdMobSharedFlow catchingFishAdMobSharedFlow = (CatchingFishAdMobSharedFlow) this.CatchingFishSnackbar;
                ArrayList arrayList = new ArrayList(catchingFishAdMobSharedFlow.CatchingFishViewModelFAB);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((CatchingFishMockkAdMob) arrayList.get(i)).CatchingFishSnackbar.CatchingFishNavigation;
                    if (colorStateList != null) {
                        catchingFishAdMobSharedFlow.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                CatchingFishJUnitBundle catchingFishJUnitBundle = (CatchingFishJUnitBundle) this.CatchingFishSnackbar;
                catchingFishJUnitBundle.CatchingFishRoomDatabase();
                catchingFishJUnitBundle.CatchingFishNavigation.start();
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.CatchingFishSnackbar).CatchingFishCloudMessaging = null;
                break;
            case 4:
                ((HideViewOnScrollBehavior) this.CatchingFishSnackbar).CatchingFishCloudMessaging = null;
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                ((CatchingFishMockkRedux) this.CatchingFishSnackbar).CatchingFishOkHttp();
                animator.removeListener(this);
                break;
            default:
                ((CatchingFishCoroutineJUnit) this.CatchingFishSnackbar).CatchingFishParcelableFAB();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.CatchingFishParcelableFAB) {
            case 1:
                CatchingFishAdMobSharedFlow catchingFishAdMobSharedFlow = (CatchingFishAdMobSharedFlow) this.CatchingFishSnackbar;
                ArrayList arrayList = new ArrayList(catchingFishAdMobSharedFlow.CatchingFishViewModelFAB);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    CatchingFishStateFlowRedux catchingFishStateFlowRedux = ((CatchingFishMockkAdMob) arrayList.get(i)).CatchingFishSnackbar;
                    ColorStateList colorStateList = catchingFishStateFlowRedux.CatchingFishNavigation;
                    if (colorStateList != null) {
                        catchingFishAdMobSharedFlow.setTint(colorStateList.getColorForState(catchingFishStateFlowRedux.CatchingFishDaggerHiltFAB, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                ((CatchingFishCoroutineJUnit) this.CatchingFishSnackbar).CatchingFishCoroutine();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public CatchingFishStateLiveData(CatchingFishCoroutineJUnit catchingFishCoroutineJUnit, View view) {
        this.CatchingFishParcelableFAB = 6;
        this.CatchingFishSnackbar = catchingFishCoroutineJUnit;
    }
}
