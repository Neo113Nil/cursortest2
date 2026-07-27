package kotlin.text;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineMVPFAB extends CatchingFishGradleSpannable implements CatchingFishFABGradleLayout {
    public final /* synthetic */ CatchingFishGraphQLFragment CatchingFishFragmentHandler;
    public WeakReference CatchingFishLayout;
    public CatchingFishBundleGlide CatchingFishViewModelFAB;
    public final CatchingFishSharedFlowAdMob CatchingFishViewModelScope;
    public final Context CatchingFishWorkManager;

    public CatchingFishCoroutineMVPFAB(CatchingFishGraphQLFragment catchingFishGraphQLFragment, Context context, CatchingFishBundleGlide catchingFishBundleGlide) {
        this.CatchingFishFragmentHandler = catchingFishGraphQLFragment;
        this.CatchingFishWorkManager = context;
        this.CatchingFishViewModelFAB = catchingFishBundleGlide;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = new CatchingFishSharedFlowAdMob(context);
        catchingFishSharedFlowAdMob.CatchingFishEspressoTesting = 1;
        this.CatchingFishViewModelScope = catchingFishSharedFlowAdMob;
        catchingFishSharedFlowAdMob.CatchingFishDaggerWebsocket = this;
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishAnimationMockk(CharSequence charSequence) {
        this.CatchingFishFragmentHandler.CatchingFishPayPal.setTitle(charSequence);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishCloudMessaging(View view) {
        this.CatchingFishFragmentHandler.CatchingFishPayPal.setCustomView(view);
        this.CatchingFishLayout = new WeakReference(view);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final CatchingFishSharedFlowAdMob CatchingFishCoroutine() {
        return this.CatchingFishViewModelScope;
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final CharSequence CatchingFishDaggerWebsocket() {
        return this.CatchingFishFragmentHandler.CatchingFishPayPal.getSubtitle();
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishEspressoTesting(int i) {
        CatchingFishOkHttp(this.CatchingFishFragmentHandler.CatchingFishDaggerHiltFAB.getResources().getString(i));
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final boolean CatchingFishFragmentHandler() {
        return this.CatchingFishFragmentHandler.CatchingFishPayPal.CatchingFishDaggerHiltFAB;
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishLayout() {
        if (this.CatchingFishFragmentHandler.CatchingFishCustomView != this) {
            return;
        }
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishViewModelScope;
        catchingFishSharedFlowAdMob.CatchingFishSpannableWidget();
        try {
            this.CatchingFishViewModelFAB.CatchingFishPayPal(this, catchingFishSharedFlowAdMob);
        } finally {
            catchingFishSharedFlowAdMob.CatchingFishDaggerHiltFAB();
        }
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishOkHttp(CharSequence charSequence) {
        this.CatchingFishFragmentHandler.CatchingFishPayPal.setSubtitle(charSequence);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishParcelableFAB() {
        CatchingFishGraphQLFragment catchingFishGraphQLFragment = this.CatchingFishFragmentHandler;
        if (catchingFishGraphQLFragment.CatchingFishCustomView != this) {
            return;
        }
        if (catchingFishGraphQLFragment.CatchingFishDagger) {
            catchingFishGraphQLFragment.CatchingFishFragmentFactory = this;
            catchingFishGraphQLFragment.CatchingFishMutableLiveData = this.CatchingFishViewModelFAB;
        } else {
            this.CatchingFishViewModelFAB.CatchingFishCardViewRealm(this);
        }
        this.CatchingFishViewModelFAB = null;
        catchingFishGraphQLFragment.CatchingFishRecyclerView(false);
        ActionBarContextView actionBarContextView = catchingFishGraphQLFragment.CatchingFishPayPal;
        if (actionBarContextView.CatchingFishUnitTesting == null) {
            actionBarContextView.CatchingFishDaggerWebsocket();
        }
        catchingFishGraphQLFragment.CatchingFishParcelableFlux.setHideOnContentScrollEnabled(catchingFishGraphQLFragment.CatchingFishMotionLayout);
        catchingFishGraphQLFragment.CatchingFishCustomView = null;
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final MenuInflater CatchingFishReduxKtor() {
        return new CatchingFishPicassoCardView(this.CatchingFishWorkManager);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final View CatchingFishSnackbar() {
        WeakReference weakReference = this.CatchingFishLayout;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishStateLiveData(boolean z) {
        this.CatchingFishDaggerWebsocket = z;
        this.CatchingFishFragmentHandler.CatchingFishPayPal.setTitleOptional(z);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishUnitTesting(int i) {
        CatchingFishAnimationMockk(this.CatchingFishFragmentHandler.CatchingFishDaggerHiltFAB.getResources().getString(i));
    }

    @Override // kotlin.text.CatchingFishFABGradleLayout
    public final boolean CatchingFishViewModelFAB(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, MenuItem menuItem) {
        CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishViewModelFAB;
        if (catchingFishBundleGlide != null) {
            return ((CatchingFishFluxFluxBundle) catchingFishBundleGlide.CatchingFishDaggerWebsocket).CatchingFishParcelableFlux(this, menuItem);
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final CharSequence CatchingFishViewModelScope() {
        return this.CatchingFishFragmentHandler.CatchingFishPayPal.getTitle();
    }

    @Override // kotlin.text.CatchingFishFABGradleLayout
    public final void CatchingFishWorkManager(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        if (this.CatchingFishViewModelFAB == null) {
            return;
        }
        CatchingFishLayout();
        CatchingFishToast catchingFishToast = this.CatchingFishFragmentHandler.CatchingFishPayPal.CatchingFishViewModelScope;
        if (catchingFishToast != null) {
            catchingFishToast.CatchingFishEspressoTesting();
        }
    }
}
