package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.catchingfish.fishcatcherpro.R;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.CatchingFishReduxKtor = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.CatchingFishDaggerWebsocket = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.CatchingFishReduxKtor * 2), this.CatchingFishDaggerWebsocket), 1073741824), i2);
    }
}
