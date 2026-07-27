package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishBundleSnackbar extends CatchingFishBundleGlide {
    public boolean CatchingFishAnimationMockk;
    public Drawable CatchingFishCloudMessaging;
    public ColorStateList CatchingFishEspressoTesting;
    public final CatchingFishGsonContext CatchingFishFragmentHandler;
    public PorterDuff.Mode CatchingFishOkHttp;
    public boolean CatchingFishUnitTesting;

    public CatchingFishBundleSnackbar(CatchingFishGsonContext catchingFishGsonContext) {
        super(catchingFishGsonContext);
        this.CatchingFishEspressoTesting = null;
        this.CatchingFishOkHttp = null;
        this.CatchingFishUnitTesting = false;
        this.CatchingFishAnimationMockk = false;
        this.CatchingFishFragmentHandler = catchingFishGsonContext;
    }

    @Override // kotlin.text.CatchingFishBundleGlide
    public final void CatchingFishParcelableFlux(AttributeSet attributeSet, int i) {
        super.CatchingFishParcelableFlux(attributeSet, R.attr.seekBarStyle);
        CatchingFishGsonContext catchingFishGsonContext = this.CatchingFishFragmentHandler;
        Context context = catchingFishGsonContext.getContext();
        int[] iArr = CatchingFishWidgetGlide.CatchingFishViewModelScope;
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        CatchingFishFABCameraX.CatchingFishEspressoTesting(catchingFishGsonContext, catchingFishGsonContext.getContext(), iArr, attributeSet, (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket, R.attr.seekBarStyle);
        Drawable CatchingFishJobScheduler = CatchingFishRecyclerView.CatchingFishJobScheduler(0);
        if (CatchingFishJobScheduler != null) {
            catchingFishGsonContext.setThumb(CatchingFishJobScheduler);
        }
        Drawable CatchingFishMutableLiveData = CatchingFishRecyclerView.CatchingFishMutableLiveData(1);
        Drawable drawable = this.CatchingFishCloudMessaging;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.CatchingFishCloudMessaging = CatchingFishMutableLiveData;
        if (CatchingFishMutableLiveData != null) {
            CatchingFishMutableLiveData.setCallback(catchingFishGsonContext);
            CatchingFishMutableLiveData.setLayoutDirection(catchingFishGsonContext.getLayoutDirection());
            if (CatchingFishMutableLiveData.isStateful()) {
                CatchingFishMutableLiveData.setState(catchingFishGsonContext.getDrawableState());
            }
            CatchingFishPayPalService();
        }
        catchingFishGsonContext.invalidate();
        if (typedArray.hasValue(3)) {
            this.CatchingFishOkHttp = CatchingFishRealmPicasso.CatchingFishSnackbar(typedArray.getInt(3, -1), this.CatchingFishOkHttp);
            this.CatchingFishAnimationMockk = true;
        }
        if (typedArray.hasValue(2)) {
            this.CatchingFishEspressoTesting = CatchingFishRecyclerView.CatchingFishFragmentFactory(2);
            this.CatchingFishUnitTesting = true;
        }
        CatchingFishRecyclerView.CatchingFishAnimation();
        CatchingFishPayPalService();
    }

    public final void CatchingFishPayPalService() {
        Drawable drawable = this.CatchingFishCloudMessaging;
        if (drawable != null) {
            if (this.CatchingFishUnitTesting || this.CatchingFishAnimationMockk) {
                Drawable mutate = drawable.mutate();
                this.CatchingFishCloudMessaging = mutate;
                if (this.CatchingFishUnitTesting) {
                    mutate.setTintList(this.CatchingFishEspressoTesting);
                }
                if (this.CatchingFishAnimationMockk) {
                    this.CatchingFishCloudMessaging.setTintMode(this.CatchingFishOkHttp);
                }
                if (this.CatchingFishCloudMessaging.isStateful()) {
                    this.CatchingFishCloudMessaging.setState(this.CatchingFishFragmentHandler.getDrawableState());
                }
            }
        }
    }

    public final void CatchingFishSensorManager(Canvas canvas) {
        if (this.CatchingFishCloudMessaging != null) {
            int max = this.CatchingFishFragmentHandler.getMax();
            if (max > 1) {
                int intrinsicWidth = this.CatchingFishCloudMessaging.getIntrinsicWidth();
                int intrinsicHeight = this.CatchingFishCloudMessaging.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.CatchingFishCloudMessaging.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.CatchingFishCloudMessaging.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
