package kotlin.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishGsonContext extends SeekBar {
    public final CatchingFishBundleSnackbar CatchingFishReduxKtor;

    public CatchingFishGsonContext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishBundleSnackbar catchingFishBundleSnackbar = new CatchingFishBundleSnackbar(this);
        this.CatchingFishReduxKtor = catchingFishBundleSnackbar;
        catchingFishBundleSnackbar.CatchingFishParcelableFlux(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        CatchingFishBundleSnackbar catchingFishBundleSnackbar = this.CatchingFishReduxKtor;
        CatchingFishGsonContext catchingFishGsonContext = catchingFishBundleSnackbar.CatchingFishFragmentHandler;
        Drawable drawable = catchingFishBundleSnackbar.CatchingFishCloudMessaging;
        if (drawable != null && drawable.isStateful() && drawable.setState(catchingFishGsonContext.getDrawableState())) {
            catchingFishGsonContext.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.CatchingFishReduxKtor.CatchingFishCloudMessaging;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.CatchingFishReduxKtor.CatchingFishSensorManager(canvas);
    }
}
