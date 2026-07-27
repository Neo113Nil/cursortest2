package kotlin.text;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class CatchingFishMVVMAsyncTask implements CatchingFishIntentMVI {
    public Drawable CatchingFishAnimationMockk;
    public Window.Callback CatchingFishCloudMessaging;
    public View CatchingFishCoroutine;
    public Drawable CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public CharSequence CatchingFishFragmentHandler;
    public CharSequence CatchingFishLayout;
    public CatchingFishToast CatchingFishOkHttp;
    public Toolbar CatchingFishParcelableFAB;
    public Drawable CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public int CatchingFishUnitTesting;
    public CharSequence CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public Drawable CatchingFishWorkManager;

    public final void CatchingFishCoroutine() {
        Drawable drawable;
        int i = this.CatchingFishSnackbar;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.CatchingFishDaggerWebsocket;
            if (drawable == null) {
                drawable = this.CatchingFishReduxKtor;
            }
        } else {
            drawable = this.CatchingFishReduxKtor;
        }
        this.CatchingFishParcelableFAB.setLogo(drawable);
    }

    public final void CatchingFishParcelableFAB(int i) {
        View view;
        Toolbar toolbar = this.CatchingFishParcelableFAB;
        int i2 = this.CatchingFishSnackbar ^ i;
        this.CatchingFishSnackbar = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    CatchingFishSnackbar();
                }
                Toolbar toolbar2 = this.CatchingFishParcelableFAB;
                if ((this.CatchingFishSnackbar & 4) != 0) {
                    Drawable drawable = this.CatchingFishWorkManager;
                    if (drawable == null) {
                        drawable = this.CatchingFishAnimationMockk;
                    }
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                CatchingFishCoroutine();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.CatchingFishViewModelFAB);
                    toolbar.setSubtitle(this.CatchingFishLayout);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.CatchingFishCoroutine) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void CatchingFishSnackbar() {
        Toolbar toolbar = this.CatchingFishParcelableFAB;
        if ((this.CatchingFishSnackbar & 4) != 0) {
            if (TextUtils.isEmpty(this.CatchingFishFragmentHandler)) {
                toolbar.setNavigationContentDescription(this.CatchingFishUnitTesting);
            } else {
                toolbar.setNavigationContentDescription(this.CatchingFishFragmentHandler);
            }
        }
    }
}
