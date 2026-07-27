package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.icecatchpuzzle.puzzleicecatch.R;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 * 2), this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119), 1073741824), i2);
    }
}
