package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.icefishing.icefishingliveapp.C5284R;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public final int f4748n;

    /* renamed from: u, reason: collision with root package name */
    public final int f4749u;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4748n = getResources().getDimensionPixelOffset(C5284R.dimen.browser_actions_context_menu_min_padding);
        this.f4749u = getResources().getDimensionPixelOffset(C5284R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4748n * 2), this.f4749u), 1073741824), i4);
    }
}
