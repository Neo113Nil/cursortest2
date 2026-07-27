package kotlin.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishMVPJUnit extends RatingBar {
    public final CatchingFishBundleGlide CatchingFishReduxKtor;

    public CatchingFishMVPJUnit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishBundleGlide catchingFishBundleGlide = new CatchingFishBundleGlide(this);
        this.CatchingFishReduxKtor = catchingFishBundleGlide;
        catchingFishBundleGlide.CatchingFishParcelableFlux(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.CatchingFishReduxKtor.CatchingFishWorkManager;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
