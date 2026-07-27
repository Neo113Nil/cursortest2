package kotlin.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishGlideService extends ViewGroup {
    public final HashMap CatchingFishDaggerWebsocket;
    public final HashMap CatchingFishReduxKtor;

    public CatchingFishGlideService(Context context) {
        super(context);
        setClipChildren(false);
        this.CatchingFishReduxKtor = new HashMap();
        this.CatchingFishDaggerWebsocket = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<CatchingFishHiltBundle, CatchingFishBiometricRoom> getHolderToLayoutNode() {
        return this.CatchingFishReduxKtor;
    }

    public final HashMap<CatchingFishBiometricRoom, CatchingFishHiltBundle> getLayoutNodeToHolder() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (CatchingFishHiltBundle catchingFishHiltBundle : this.CatchingFishReduxKtor.keySet()) {
            catchingFishHiltBundle.layout(catchingFishHiltBundle.getLeft(), catchingFishHiltBundle.getTop(), catchingFishHiltBundle.getRight(), catchingFishHiltBundle.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            CatchingFishFluxGradle.CatchingFishParcelableFAB("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            CatchingFishFluxGradle.CatchingFishParcelableFAB("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (CatchingFishHiltBundle catchingFishHiltBundle : this.CatchingFishReduxKtor.keySet()) {
            int i4 = catchingFishHiltBundle.CatchingFishParcelableFlux;
            if (i4 != Integer.MIN_VALUE && (i3 = catchingFishHiltBundle.CatchingFishGsonAppCompat) != Integer.MIN_VALUE) {
                catchingFishHiltBundle.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            CatchingFishBiometricRoom catchingFishBiometricRoom = (CatchingFishBiometricRoom) this.CatchingFishReduxKtor.get(childAt);
            if (childAt.isLayoutRequested() && catchingFishBiometricRoom != null) {
                CatchingFishBiometricRoom.CatchingFishPayPalLiveData(catchingFishBiometricRoom, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
