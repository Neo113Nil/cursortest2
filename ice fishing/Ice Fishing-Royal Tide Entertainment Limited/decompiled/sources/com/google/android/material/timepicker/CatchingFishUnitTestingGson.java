package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.catchingfish.fishcatcherpro.R;
import kotlin.text.CatchingFishAndroidX;
import kotlin.text.CatchingFishBundleContext;
import kotlin.text.CatchingFishViewJUnitJUnit;

/* loaded from: classes.dex */
public final class CatchingFishUnitTestingGson extends CatchingFishAndroidX {
    public final /* synthetic */ ClockFaceView CatchingFishReduxKtor;

    public CatchingFishUnitTestingGson(ClockFaceView clockFaceView) {
        this.CatchingFishReduxKtor = clockFaceView;
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final void CatchingFishReduxKtor(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.CatchingFishReduxKtor.CatchingFishPayPal.get(intValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        catchingFishViewJUnitJUnit.CatchingFishSnackbar(CatchingFishBundleContext.CatchingFishDaggerWebsocket);
    }

    @Override // kotlin.text.CatchingFishAndroidX
    public final boolean CatchingFishViewModelScope(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.CatchingFishViewModelScope(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.CatchingFishReduxKtor;
        view.getHitRect(clockFaceView.CatchingFishParcelableFlux);
        float centerX = clockFaceView.CatchingFishParcelableFlux.centerX();
        float centerY = clockFaceView.CatchingFishParcelableFlux.centerY();
        clockFaceView.CatchingFishSpannableWidget.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.CatchingFishSpannableWidget.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
