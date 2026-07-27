package kotlin.text;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class CatchingFishSpannableRoom<S> extends CatchingFishRoomSnackbar {
    public int CatchingFishAnimation;
    public CatchingFishCardViewOkHttp CatchingFishMVVMAppCompat;

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final View CatchingFish(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(CatchingFishViewModelFAB(), this.CatchingFishAnimation));
        throw null;
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishNavigation(Bundle bundle) {
        super.CatchingFishNavigation(bundle);
        if (bundle == null) {
            bundle = this.CatchingFishLayout;
        }
        this.CatchingFishAnimation = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.CatchingFishMVVMAppCompat = (CatchingFishCardViewOkHttp) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishSpannableWidget(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.CatchingFishAnimation);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.CatchingFishMVVMAppCompat);
    }
}
