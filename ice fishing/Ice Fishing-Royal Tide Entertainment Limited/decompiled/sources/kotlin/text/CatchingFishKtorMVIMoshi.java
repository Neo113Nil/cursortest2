package kotlin.text;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishKtorMVIMoshi extends ActionMode {
    public final Context CatchingFishParcelableFAB;
    public final CatchingFishGradleSpannable CatchingFishSnackbar;

    public CatchingFishKtorMVIMoshi(Context context, CatchingFishGradleSpannable catchingFishGradleSpannable) {
        this.CatchingFishParcelableFAB = context;
        this.CatchingFishSnackbar = catchingFishGradleSpannable;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.CatchingFishSnackbar.CatchingFishParcelableFAB();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.CatchingFishSnackbar.CatchingFishSnackbar();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new CatchingFishOkHttpHiltFAB(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar.CatchingFishCoroutine());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.CatchingFishSnackbar.CatchingFishReduxKtor();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.CatchingFishSnackbar.CatchingFishDaggerWebsocket();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.CatchingFishSnackbar.CatchingFishReduxKtor;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.CatchingFishSnackbar.CatchingFishViewModelScope();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.CatchingFishSnackbar.CatchingFishDaggerWebsocket;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.CatchingFishSnackbar.CatchingFishLayout();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.CatchingFishSnackbar.CatchingFishFragmentHandler();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.CatchingFishSnackbar.CatchingFishCloudMessaging(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.CatchingFishSnackbar.CatchingFishOkHttp(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.CatchingFishSnackbar.CatchingFishReduxKtor = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.CatchingFishSnackbar.CatchingFishAnimationMockk(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.CatchingFishSnackbar.CatchingFishStateLiveData(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.CatchingFishSnackbar.CatchingFishEspressoTesting(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.CatchingFishSnackbar.CatchingFishUnitTesting(i);
    }
}
