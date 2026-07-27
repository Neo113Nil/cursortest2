package kotlin.text;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class CatchingFishToastAnimation {
    public final TextView CatchingFishParcelableFAB;
    public final CatchingFishViewPagerMockk CatchingFishSnackbar;

    public CatchingFishToastAnimation(TextView textView) {
        this.CatchingFishParcelableFAB = textView;
        this.CatchingFishSnackbar = new CatchingFishViewPagerMockk(textView);
    }

    public final void CatchingFishCoroutine(boolean z) {
        ((CatchingFishFirebaseDagger) this.CatchingFishSnackbar.CatchingFishDaggerWebsocket).CatchingFishAppCompat(z);
    }

    public final void CatchingFishParcelableFAB(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.CatchingFishParcelableFAB.getContext().obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishLayout, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            CatchingFishCoroutine(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void CatchingFishSnackbar(boolean z) {
        ((CatchingFishFirebaseDagger) this.CatchingFishSnackbar.CatchingFishDaggerWebsocket).CatchingFishRecyclerView(z);
    }
}
