package kotlin.text;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskAdMob extends CatchingFishGradleSpannable implements CatchingFishFABGradleLayout {
    public CatchingFishSharedFlowAdMob CatchingFishCloudMessaging;
    public boolean CatchingFishFragmentHandler;
    public WeakReference CatchingFishLayout;
    public CatchingFishBundleGlide CatchingFishViewModelFAB;
    public ActionBarContextView CatchingFishViewModelScope;
    public Context CatchingFishWorkManager;

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishAnimationMockk(CharSequence charSequence) {
        this.CatchingFishViewModelScope.setTitle(charSequence);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishCloudMessaging(View view) {
        this.CatchingFishViewModelScope.setCustomView(view);
        this.CatchingFishLayout = view != null ? new WeakReference(view) : null;
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final CatchingFishSharedFlowAdMob CatchingFishCoroutine() {
        return this.CatchingFishCloudMessaging;
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final CharSequence CatchingFishDaggerWebsocket() {
        return this.CatchingFishViewModelScope.getSubtitle();
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishEspressoTesting(int i) {
        CatchingFishOkHttp(this.CatchingFishWorkManager.getString(i));
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final boolean CatchingFishFragmentHandler() {
        return this.CatchingFishViewModelScope.CatchingFishDaggerHiltFAB;
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishLayout() {
        this.CatchingFishViewModelFAB.CatchingFishPayPal(this, this.CatchingFishCloudMessaging);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishOkHttp(CharSequence charSequence) {
        this.CatchingFishViewModelScope.setSubtitle(charSequence);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishFragmentHandler) {
            return;
        }
        this.CatchingFishFragmentHandler = true;
        this.CatchingFishViewModelFAB.CatchingFishCardViewRealm(this);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final MenuInflater CatchingFishReduxKtor() {
        return new CatchingFishPicassoCardView(this.CatchingFishViewModelScope.getContext());
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
        this.CatchingFishViewModelScope.setTitleOptional(z);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final void CatchingFishUnitTesting(int i) {
        CatchingFishAnimationMockk(this.CatchingFishWorkManager.getString(i));
    }

    @Override // kotlin.text.CatchingFishFABGradleLayout
    public final boolean CatchingFishViewModelFAB(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, MenuItem menuItem) {
        return ((CatchingFishFluxFluxBundle) this.CatchingFishViewModelFAB.CatchingFishDaggerWebsocket).CatchingFishParcelableFlux(this, menuItem);
    }

    @Override // kotlin.text.CatchingFishGradleSpannable
    public final CharSequence CatchingFishViewModelScope() {
        return this.CatchingFishViewModelScope.getTitle();
    }

    @Override // kotlin.text.CatchingFishFABGradleLayout
    public final void CatchingFishWorkManager(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        CatchingFishLayout();
        CatchingFishToast catchingFishToast = this.CatchingFishViewModelScope.CatchingFishViewModelScope;
        if (catchingFishToast != null) {
            catchingFishToast.CatchingFishEspressoTesting();
        }
    }
}
