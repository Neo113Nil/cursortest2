package kotlin.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishFragment extends CatchingFishCustomViewFlux implements CatchingFishWidgetManifest {
    public final /* synthetic */ CatchingFishToast CatchingFishViewModelScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishFragment(CatchingFishToast catchingFishToast, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.CatchingFishViewModelScope = catchingFishToast;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        CatchingFishViewMVIMVVM.CatchingFishCoroutineFlow(this, getContentDescription());
        setOnTouchListener(new CatchingFishBundleJUnitRoom(this, this));
    }

    @Override // kotlin.text.CatchingFishWidgetManifest
    public final boolean CatchingFishCoroutine() {
        return false;
    }

    @Override // kotlin.text.CatchingFishWidgetManifest
    public final boolean CatchingFishSnackbar() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.CatchingFishViewModelScope.CatchingFishEspressoTesting();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
