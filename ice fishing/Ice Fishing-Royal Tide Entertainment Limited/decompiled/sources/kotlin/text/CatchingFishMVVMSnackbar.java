package kotlin.text;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CatchingFishMVVMSnackbar extends CatchingFishToolbarBundle {
    public final CatchingFishRetrofitRealm CatchingFishReduxKtor;

    public CatchingFishMVVMSnackbar(CatchingFishRetrofitRealm catchingFishRetrofitRealm) {
        this.CatchingFishReduxKtor = catchingFishRetrofitRealm;
    }

    @Override // kotlin.text.CatchingFishToolbarBundle
    public final void CatchingFishCoroutine(CatchingFishPayPalCardView catchingFishPayPalCardView, int i) {
        CatchingFishRetrofitRealm catchingFishRetrofitRealm = this.CatchingFishReduxKtor;
        int i2 = catchingFishRetrofitRealm.CatchingFishMVVMAppCompat.CatchingFishReduxKtor.CatchingFishWorkManager + i;
        TextView textView = ((CatchingFishFABAnimation) catchingFishPayPalCardView).CatchingFishCoroutineFlow;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(CatchingFishDaggerHiltMVP.CatchingFishSnackbar().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        CatchingFishBundleGlide catchingFishBundleGlide = catchingFishRetrofitRealm.CatchingFishAndroidX;
        if (CatchingFishDaggerHiltMVP.CatchingFishSnackbar().get(1) == i2) {
            Object obj = catchingFishBundleGlide.CatchingFishWorkManager;
        } else {
            Object obj2 = catchingFishBundleGlide.CatchingFishDaggerWebsocket;
        }
        throw null;
    }

    @Override // kotlin.text.CatchingFishToolbarBundle
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor.CatchingFishMVVMAppCompat.CatchingFishLayout;
    }

    @Override // kotlin.text.CatchingFishToolbarBundle
    public final CatchingFishPayPalCardView CatchingFishReduxKtor(ViewGroup viewGroup) {
        return new CatchingFishFABAnimation((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
