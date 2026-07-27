package kotlin.text;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishMVIFAB extends CatchingFishAndroidXService implements CatchingFishGsonDaggerHilt {
    public final /* synthetic */ CatchingFishHandlerContext CatchingFishEspressoMockk;
    public CatchingFishIntentAndroidX CatchingFishJobScheduler;
    public CharSequence CatchingFishMutableLiveData;
    public final Rect CatchingFishPayPalService;
    public int CatchingFishSensorManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVIFAB(CatchingFishHandlerContext catchingFishHandlerContext, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.CatchingFishEspressoMockk = catchingFishHandlerContext;
        this.CatchingFishPayPalService = new Rect();
        this.CatchingFishNavigation = catchingFishHandlerContext;
        this.CatchingFishCardViewView = true;
        this.CatchingFishMVPRobolectric.setFocusable(true);
        this.CatchingFish = new CatchingFishFirebaseRedux(0, this);
    }

    public final void CatchingFish() {
        int i;
        CatchingFishHandlerContext catchingFishHandlerContext = this.CatchingFishEspressoMockk;
        Rect rect = catchingFishHandlerContext.CatchingFishCloudMessaging;
        CatchingFishHiltGoogleMaps catchingFishHiltGoogleMaps = this.CatchingFishMVPRobolectric;
        Drawable background = catchingFishHiltGoogleMaps.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z = CatchingFishMVVMGraphQL.CatchingFishParcelableFAB;
            i = catchingFishHandlerContext.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = catchingFishHandlerContext.getPaddingLeft();
        int paddingRight = catchingFishHandlerContext.getPaddingRight();
        int width = catchingFishHandlerContext.getWidth();
        int i2 = catchingFishHandlerContext.CatchingFishFragmentHandler;
        if (i2 == -2) {
            int CatchingFishParcelableFAB = catchingFishHandlerContext.CatchingFishParcelableFAB(this.CatchingFishJobScheduler, catchingFishHiltGoogleMaps.getBackground());
            int i3 = (catchingFishHandlerContext.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (CatchingFishParcelableFAB > i3) {
                CatchingFishParcelableFAB = i3;
            }
            CatchingFishNavigation(Math.max(CatchingFishParcelableFAB, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            CatchingFishNavigation((width - paddingLeft) - paddingRight);
        } else {
            CatchingFishNavigation(i2);
        }
        boolean z2 = CatchingFishMVVMGraphQL.CatchingFishParcelableFAB;
        this.CatchingFishLayout = catchingFishHandlerContext.getLayoutDirection() == 1 ? (((width - paddingRight) - this.CatchingFishViewModelFAB) - this.CatchingFishSensorManager) + i : paddingLeft + this.CatchingFishSensorManager + i;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final CharSequence CatchingFishAnimationMockk() {
        return this.CatchingFishMutableLiveData;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishCloudMessaging(int i) {
        this.CatchingFishSensorManager = i;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishOkHttp(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        CatchingFishHiltGoogleMaps catchingFishHiltGoogleMaps = this.CatchingFishMVPRobolectric;
        boolean isShowing = catchingFishHiltGoogleMaps.isShowing();
        CatchingFish();
        this.CatchingFishMVPRobolectric.setInputMethodMode(2);
        CatchingFishReduxKtor();
        CatchingFishCameraXOkHttp catchingFishCameraXOkHttp = this.CatchingFishWorkManager;
        catchingFishCameraXOkHttp.setChoiceMode(1);
        catchingFishCameraXOkHttp.setTextDirection(i);
        catchingFishCameraXOkHttp.setTextAlignment(i2);
        CatchingFishHandlerContext catchingFishHandlerContext = this.CatchingFishEspressoMockk;
        int selectedItemPosition = catchingFishHandlerContext.getSelectedItemPosition();
        CatchingFishCameraXOkHttp catchingFishCameraXOkHttp2 = this.CatchingFishWorkManager;
        if (catchingFishHiltGoogleMaps.isShowing() && catchingFishCameraXOkHttp2 != null) {
            catchingFishCameraXOkHttp2.setListSelectionHidden(false);
            catchingFishCameraXOkHttp2.setSelection(selectedItemPosition);
            if (catchingFishCameraXOkHttp2.getChoiceMode() != 0) {
                catchingFishCameraXOkHttp2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = catchingFishHandlerContext.getViewTreeObserver()) == null) {
            return;
        }
        CatchingFishMVPStateFlow catchingFishMVPStateFlow = new CatchingFishMVPStateFlow(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(catchingFishMVPStateFlow);
        this.CatchingFishMVPRobolectric.setOnDismissListener(new CatchingFishGsonFirebase(this, catchingFishMVPStateFlow));
    }

    @Override // kotlin.text.CatchingFishAndroidXService, kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishStateLiveData(ListAdapter listAdapter) {
        super.CatchingFishStateLiveData(listAdapter);
        this.CatchingFishJobScheduler = (CatchingFishIntentAndroidX) listAdapter;
    }

    @Override // kotlin.text.CatchingFishGsonDaggerHilt
    public final void CatchingFishWorkManager(CharSequence charSequence) {
        this.CatchingFishMutableLiveData = charSequence;
    }
}
